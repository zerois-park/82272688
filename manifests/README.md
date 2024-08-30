### nginx ingress 설치
~~~
kubectl create namespace ingress-nginx
kubectl apply -f deploy.yaml -n ingress-nginx
~~~

### ArgoCd 설치
~~~
kubectl create namespace argocd
kubectl apply -f install.yaml -n argocd
~~~

### kustomize 확인
~~~
kubectl kustomize manifests/overlays/prod
~~~