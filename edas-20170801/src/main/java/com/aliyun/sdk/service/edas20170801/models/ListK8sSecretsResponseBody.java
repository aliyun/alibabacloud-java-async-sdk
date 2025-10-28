// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListK8sSecretsResponseBody} extends {@link TeaModel}
 *
 * <p>ListK8sSecretsResponseBody</p>
 */
public class ListK8sSecretsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListK8sSecretsResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The HTTP status code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The additional information that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>b197-40ab-9155-****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned query results of Kubernetes Secrets.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public ListK8sSecretsResponseBody build() {
            return new ListK8sSecretsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListK8sSecretsResponseBody} extends {@link TeaModel}
     *
     * <p>ListK8sSecretsResponseBody</p>
     */
    public static class CertDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainNames")
        private java.util.List<String> domainNames;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("Issuer")
        private String issuer;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
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
        public java.util.List<String> getDomainNames() {
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
            private java.util.List<String> domainNames; 
            private String endTime; 
            private String issuer; 
            private String startTime; 
            private String status; 

            private Builder() {
            } 

            private Builder(CertDetail model) {
                this.domainNames = model.domainNames;
                this.endTime = model.endTime;
                this.issuer = model.issuer;
                this.startTime = model.startTime;
                this.status = model.status;
            } 

            /**
             * <p>Domain names that are associated with the SSL certificate.</p>
             */
            public Builder domainNames(java.util.List<String> domainNames) {
                this.domainNames = domainNames;
                return this;
            }

            /**
             * <p>The time when the SSL certificate expired.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-02-22T02:32:41Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The certificate authority (CA) that issued the SSL certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>CN=GlobalSign Root CA, OU=Root CA, O=GlobalSign nv-sa, C=BE</p>
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            /**
             * <p>The time when the SSL certificate started to take effect.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-02T22:40:00Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The state of the SSL certificate. Valid values:</p>
             * <ul>
             * <li>normal: The SSL certificate is valid.</li>
             * <li>invalid: The SSL certificate is invalid.</li>
             * <li>expired: The SSL certificate has expired.</li>
             * <li>not_yet_valid: The SSL certificate is currently invalid.</li>
             * <li>about_to_expire: The SSL certificate is about to expire.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
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
    /**
     * 
     * {@link ListK8sSecretsResponseBody} extends {@link TeaModel}
     *
     * <p>ListK8sSecretsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The user-defined key of the Kubernetes Secret.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The user-defined value of the Kubernetes Secret.</p>
             * 
             * <strong>example:</strong>
             * <p>william</p>
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
    /**
     * 
     * {@link ListK8sSecretsResponseBody} extends {@link TeaModel}
     *
     * <p>ListK8sSecretsResponseBody</p>
     */
    public static class RelatedApps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
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

            private Builder() {
            } 

            private Builder(RelatedApps model) {
                this.appId = model.appId;
                this.appName = model.appName;
            } 

            /**
             * <p>The ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>b08eeb18-8946-410c-a1ea-dbbc********</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>my-app</p>
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
    /**
     * 
     * {@link ListK8sSecretsResponseBody} extends {@link TeaModel}
     *
     * <p>ListK8sSecretsResponseBody</p>
     */
    public static class RelatedIngressRulesRelatedApps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
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

            private Builder() {
            } 

            private Builder(RelatedIngressRulesRelatedApps model) {
                this.appId = model.appId;
                this.appName = model.appName;
            } 

            /**
             * <p>The ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>6dc74432-5a35-4e68-8aaa-3700********</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The name of the EDAS application.</p>
             * 
             * <strong>example:</strong>
             * <p>app-test</p>
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
    /**
     * 
     * {@link ListK8sSecretsResponseBody} extends {@link TeaModel}
     *
     * <p>ListK8sSecretsResponseBody</p>
     */
    public static class RelatedIngressRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("RelatedApps")
        private java.util.List<RelatedIngressRulesRelatedApps> relatedApps;

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
        public java.util.List<RelatedIngressRulesRelatedApps> getRelatedApps() {
            return this.relatedApps;
        }

        public static final class Builder {
            private String name; 
            private String namespace; 
            private java.util.List<RelatedIngressRulesRelatedApps> relatedApps; 

            private Builder() {
            } 

            private Builder(RelatedIngressRules model) {
                this.name = model.name;
                this.namespace = model.namespace;
                this.relatedApps = model.relatedApps;
            } 

            /**
             * <p>The name of the rule in the Ingress.</p>
             * 
             * <strong>example:</strong>
             * <p>testrulename</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The namespaces of the Kubernetes cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>Aplications that are associated with the Ingress.</p>
             */
            public Builder relatedApps(java.util.List<RelatedIngressRulesRelatedApps> relatedApps) {
                this.relatedApps = relatedApps;
                return this;
            }

            public RelatedIngressRules build() {
                return new RelatedIngressRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListK8sSecretsResponseBody} extends {@link TeaModel}
     *
     * <p>ListK8sSecretsResponseBody</p>
     */
    public static class Secrets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Base64Encoded")
        private Boolean base64Encoded;

        @com.aliyun.core.annotation.NameInMap("CertDetail")
        private CertDetail certDetail;

        @com.aliyun.core.annotation.NameInMap("CertId")
        private String certId;

        @com.aliyun.core.annotation.NameInMap("CertRegionId")
        private String certRegionId;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<Data> data;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("RelatedApps")
        private java.util.List<RelatedApps> relatedApps;

        @com.aliyun.core.annotation.NameInMap("RelatedIngressRules")
        private java.util.List<RelatedIngressRules> relatedIngressRules;

        @com.aliyun.core.annotation.NameInMap("Type")
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
        public java.util.List<Data> getData() {
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
        public java.util.List<RelatedApps> getRelatedApps() {
            return this.relatedApps;
        }

        /**
         * @return relatedIngressRules
         */
        public java.util.List<RelatedIngressRules> getRelatedIngressRules() {
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
            private java.util.List<Data> data; 
            private String name; 
            private String namespace; 
            private java.util.List<RelatedApps> relatedApps; 
            private java.util.List<RelatedIngressRules> relatedIngressRules; 
            private String type; 

            private Builder() {
            } 

            private Builder(Secrets model) {
                this.base64Encoded = model.base64Encoded;
                this.certDetail = model.certDetail;
                this.certId = model.certId;
                this.certRegionId = model.certRegionId;
                this.clusterId = model.clusterId;
                this.clusterName = model.clusterName;
                this.creationTime = model.creationTime;
                this.data = model.data;
                this.name = model.name;
                this.namespace = model.namespace;
                this.relatedApps = model.relatedApps;
                this.relatedIngressRules = model.relatedIngressRules;
                this.type = model.type;
            } 

            /**
             * <p>Indicates whether the data is Base64-encoded. Valid values:</p>
             * <ul>
             * <li>true: The data is Base64-encoded.</li>
             * <li>false: The data is not Base64-encoded.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder base64Encoded(Boolean base64Encoded) {
                this.base64Encoded = base64Encoded;
                return this;
            }

            /**
             * <p>The details of the Secure Sockets Layer (SSL) certificate.</p>
             */
            public Builder certDetail(CertDetail certDetail) {
                this.certDetail = certDetail;
                return this;
            }

            /**
             * <p>The ID of the certificate provided by Alibaba Cloud Certificate Management Service.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder certId(String certId) {
                this.certId = certId;
                return this;
            }

            /**
             * <p>The region in which the certificate is stored.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder certRegionId(String certRegionId) {
                this.certRegionId = certRegionId;
                return this;
            }

            /**
             * <p>The ID of the cluster in Enterprise Distributed Application Service (EDAS).</p>
             * 
             * <strong>example:</strong>
             * <p>4472a6d3-f01d-4087-85a7-3dc52********</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The name of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>test-cluster</p>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>The time when the Secret was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>hh:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-05-26T02:57:02Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The data of the Kubernetes Secret.</p>
             */
            public Builder data(java.util.List<Data> data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The name of the Secret. The name must start with a letter, and can contain digits, letters, and hyphens (-). It can be up to 63 characters in length.</p>
             * 
             * <strong>example:</strong>
             * <p>my-secret</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The namespace of the Kubernetes cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>Applications that use the Secret.</p>
             */
            public Builder relatedApps(java.util.List<RelatedApps> relatedApps) {
                this.relatedApps = relatedApps;
                return this;
            }

            /**
             * <p>Rules in the Ingress that is associated with the Secret.</p>
             */
            public Builder relatedIngressRules(java.util.List<RelatedIngressRules> relatedIngressRules) {
                this.relatedIngressRules = relatedIngressRules;
                return this;
            }

            /**
             * <p>The type of the Secret. Valid values:</p>
             * <ul>
             * <li>Opaque: user-defined data</li>
             * <li>kubernetes.io/tls: Transport Layer Security (TLS) certificate</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Opaque</p>
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
    /**
     * 
     * {@link ListK8sSecretsResponseBody} extends {@link TeaModel}
     *
     * <p>ListK8sSecretsResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Secrets")
        private java.util.List<Secrets> secrets;

        @com.aliyun.core.annotation.NameInMap("Total")
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
        public java.util.List<Secrets> getSecrets() {
            return this.secrets;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<Secrets> secrets; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.secrets = model.secrets;
                this.total = model.total;
            } 

            /**
             * <p>The information about Kubernetes Secrets.</p>
             */
            public Builder secrets(java.util.List<Secrets> secrets) {
                this.secrets = secrets;
                return this;
            }

            /**
             * <p>The total number of entries that are returned.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
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
