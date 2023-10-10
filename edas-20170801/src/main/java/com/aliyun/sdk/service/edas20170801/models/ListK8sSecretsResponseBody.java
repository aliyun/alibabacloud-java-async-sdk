// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListK8sSecretsResponseBody} extends {@link TeaModel}
 *
 * <p>ListK8sSecretsResponseBody</p>
 */
public class ListK8sSecretsResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private ListK8sSecretsResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListK8sSecretsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private Result result; 

        /**
         * The HTTP status code that is returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The additional information that is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The returned query results of Kubernetes Secrets.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public ListK8sSecretsResponseBody build() {
            return new ListK8sSecretsResponseBody(this);
        } 

    } 

    public static class CertDetail extends TeaModel {
        @NameInMap("DomainNames")
        private java.util.List < String > domainNames;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("Issuer")
        private String issuer;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Status")
        private String status;

        private CertDetail(Builder builder) {
            this.domainNames = builder.domainNames;
            this.endTime = builder.endTime;
            this.issuer = builder.issuer;
            this.startTime = builder.startTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CertDetail create() {
            return builder().build();
        }

        /**
         * @return domainNames
         */
        public java.util.List < String > getDomainNames() {
            return this.domainNames;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return issuer
         */
        public String getIssuer() {
            return this.issuer;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List < String > domainNames; 
            private String endTime; 
            private String issuer; 
            private String startTime; 
            private String status; 

            /**
             * Domain names that are associated with the SSL certificate.
             */
            public Builder domainNames(java.util.List < String > domainNames) {
                this.domainNames = domainNames;
                return this;
            }

            /**
             * The time when the SSL certificate expired.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The certificate authority (CA) that issued the SSL certificate.
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            /**
             * The time when the SSL certificate started to take effect.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The state of the SSL certificate. Valid values:
             * <p>
             * 
             * *   normal: The SSL certificate is valid.
             * *   invalid: The SSL certificate is invalid.
             * *   expired: The SSL certificate has expired.
             * *   not_yet_valid: The SSL certificate is currently invalid.
             * *   about_to_expire: The SSL certificate is about to expire.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public CertDetail build() {
                return new CertDetail(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Data(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The user-defined key of the Kubernetes Secret.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The user-defined value of the Kubernetes Secret.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    public static class RelatedApps extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("AppName")
        private String appName;

        private RelatedApps(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelatedApps create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        public static final class Builder {
            private String appId; 
            private String appName; 

            /**
             * The ID of the application.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The name of the application.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            public RelatedApps build() {
                return new RelatedApps(this);
            } 

        } 

    }
    public static class RelatedIngressRulesRelatedApps extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("AppName")
        private String appName;

        private RelatedIngressRulesRelatedApps(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelatedIngressRulesRelatedApps create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        public static final class Builder {
            private String appId; 
            private String appName; 

            /**
             * The ID of the application.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The name of the EDAS application.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            public RelatedIngressRulesRelatedApps build() {
                return new RelatedIngressRulesRelatedApps(this);
            } 

        } 

    }
    public static class RelatedIngressRules extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("RelatedApps")
        private java.util.List < RelatedIngressRulesRelatedApps> relatedApps;

        private RelatedIngressRules(Builder builder) {
            this.name = builder.name;
            this.namespace = builder.namespace;
            this.relatedApps = builder.relatedApps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelatedIngressRules create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return relatedApps
         */
        public java.util.List < RelatedIngressRulesRelatedApps> getRelatedApps() {
            return this.relatedApps;
        }

        public static final class Builder {
            private String name; 
            private String namespace; 
            private java.util.List < RelatedIngressRulesRelatedApps> relatedApps; 

            /**
             * The name of the rule in the Ingress.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The namespaces of the Kubernetes cluster.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * Aplications that are associated with the Ingress.
             */
            public Builder relatedApps(java.util.List < RelatedIngressRulesRelatedApps> relatedApps) {
                this.relatedApps = relatedApps;
                return this;
            }

            public RelatedIngressRules build() {
                return new RelatedIngressRules(this);
            } 

        } 

    }
    public static class Secrets extends TeaModel {
        @NameInMap("Base64Encoded")
        private Boolean base64Encoded;

        @NameInMap("CertDetail")
        private CertDetail certDetail;

        @NameInMap("CertId")
        private String certId;

        @NameInMap("CertRegionId")
        private String certRegionId;

        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("ClusterName")
        private String clusterName;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Data")
        private java.util.List < Data> data;

        @NameInMap("Name")
        private String name;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("RelatedApps")
        private java.util.List < RelatedApps> relatedApps;

        @NameInMap("RelatedIngressRules")
        private java.util.List < RelatedIngressRules> relatedIngressRules;

        @NameInMap("Type")
        private String type;

        private Secrets(Builder builder) {
            this.base64Encoded = builder.base64Encoded;
            this.certDetail = builder.certDetail;
            this.certId = builder.certId;
            this.certRegionId = builder.certRegionId;
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.creationTime = builder.creationTime;
            this.data = builder.data;
            this.name = builder.name;
            this.namespace = builder.namespace;
            this.relatedApps = builder.relatedApps;
            this.relatedIngressRules = builder.relatedIngressRules;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Secrets create() {
            return builder().build();
        }

        /**
         * @return base64Encoded
         */
        public Boolean getBase64Encoded() {
            return this.base64Encoded;
        }

        /**
         * @return certDetail
         */
        public CertDetail getCertDetail() {
            return this.certDetail;
        }

        /**
         * @return certId
         */
        public String getCertId() {
            return this.certId;
        }

        /**
         * @return certRegionId
         */
        public String getCertRegionId() {
            return this.certRegionId;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return data
         */
        public java.util.List < Data> getData() {
            return this.data;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return relatedApps
         */
        public java.util.List < RelatedApps> getRelatedApps() {
            return this.relatedApps;
        }

        /**
         * @return relatedIngressRules
         */
        public java.util.List < RelatedIngressRules> getRelatedIngressRules() {
            return this.relatedIngressRules;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Boolean base64Encoded; 
            private CertDetail certDetail; 
            private String certId; 
            private String certRegionId; 
            private String clusterId; 
            private String clusterName; 
            private String creationTime; 
            private java.util.List < Data> data; 
            private String name; 
            private String namespace; 
            private java.util.List < RelatedApps> relatedApps; 
            private java.util.List < RelatedIngressRules> relatedIngressRules; 
            private String type; 

            /**
             * Indicates whether the data is Base64-encoded. Valid values:
             * <p>
             * 
             * *   true: The data is Base64-encoded.
             * *   false: The data is not Base64-encoded.
             */
            public Builder base64Encoded(Boolean base64Encoded) {
                this.base64Encoded = base64Encoded;
                return this;
            }

            /**
             * The details of the Secure Sockets Layer (SSL) certificate.
             */
            public Builder certDetail(CertDetail certDetail) {
                this.certDetail = certDetail;
                return this;
            }

            /**
             * The ID of the certificate provided by Alibaba Cloud Certificate Management Service.
             */
            public Builder certId(String certId) {
                this.certId = certId;
                return this;
            }

            /**
             * The region in which the certificate is stored.
             */
            public Builder certRegionId(String certRegionId) {
                this.certRegionId = certRegionId;
                return this;
            }

            /**
             * The ID of the cluster in Enterprise Distributed Application Service (EDAS).
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The name of the cluster.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * The time when the Secret was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*hh:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The data of the Kubernetes Secret.
             */
            public Builder data(java.util.List < Data> data) {
                this.data = data;
                return this;
            }

            /**
             * The name of the Secret. The name must start with a letter, and can contain digits, letters, and hyphens (-). It can be up to 63 characters in length.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The namespace of the Kubernetes cluster.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * Applications that use the Secret.
             */
            public Builder relatedApps(java.util.List < RelatedApps> relatedApps) {
                this.relatedApps = relatedApps;
                return this;
            }

            /**
             * Rules in the Ingress that is associated with the Secret.
             */
            public Builder relatedIngressRules(java.util.List < RelatedIngressRules> relatedIngressRules) {
                this.relatedIngressRules = relatedIngressRules;
                return this;
            }

            /**
             * The type of the Secret. Valid values:
             * <p>
             * 
             * *   Opaque: user-defined data
             * *   kubernetes.io/tls: Transport Layer Security (TLS) certificate
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Secrets build() {
                return new Secrets(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("Secrets")
        private java.util.List < Secrets> secrets;

        @NameInMap("Total")
        private Integer total;

        private Result(Builder builder) {
            this.secrets = builder.secrets;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return secrets
         */
        public java.util.List < Secrets> getSecrets() {
            return this.secrets;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List < Secrets> secrets; 
            private Integer total; 

            /**
             * The information about Kubernetes Secrets.
             */
            public Builder secrets(java.util.List < Secrets> secrets) {
                this.secrets = secrets;
                return this;
            }

            /**
             * The total number of entries that are returned.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
