// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeHybridCloudClustersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHybridCloudClustersResponseBody</p>
 */
public class DescribeHybridCloudClustersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterInfos")
    private java.util.List<ClusterInfos> clusterInfos;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeHybridCloudClustersResponseBody(Builder builder) {
        this.clusterInfos = builder.clusterInfos;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHybridCloudClustersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterInfos
     */
    public java.util.List<ClusterInfos> getClusterInfos() {
        return this.clusterInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ClusterInfos> clusterInfos; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeHybridCloudClustersResponseBody model) {
            this.clusterInfos = model.clusterInfos;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of clusters.</p>
         */
        public Builder clusterInfos(java.util.List<ClusterInfos> clusterInfos) {
            this.clusterInfos = clusterInfos;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>66A98669-ER12-WE34-23PO-301469*****E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeHybridCloudClustersResponseBody build() {
            return new DescribeHybridCloudClustersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeHybridCloudClustersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHybridCloudClustersResponseBody</p>
     */
    public static class ClusterInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessMode")
        private String accessMode;

        @com.aliyun.core.annotation.NameInMap("AccessRegion")
        private String accessRegion;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("ClusterResourceId")
        private String clusterResourceId;

        @com.aliyun.core.annotation.NameInMap("HttpPorts")
        private String httpPorts;

        @com.aliyun.core.annotation.NameInMap("HttpsPorts")
        private String httpsPorts;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("ProtectionServerCount")
        private Integer protectionServerCount;

        @com.aliyun.core.annotation.NameInMap("ProxyStatus")
        private String proxyStatus;

        @com.aliyun.core.annotation.NameInMap("ProxyType")
        private String proxyType;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("RuleConfig")
        private String ruleConfig;

        @com.aliyun.core.annotation.NameInMap("RuleStatus")
        private String ruleStatus;

        @com.aliyun.core.annotation.NameInMap("RuleType")
        private String ruleType;

        private ClusterInfos(Builder builder) {
            this.accessMode = builder.accessMode;
            this.accessRegion = builder.accessRegion;
            this.clusterName = builder.clusterName;
            this.clusterResourceId = builder.clusterResourceId;
            this.httpPorts = builder.httpPorts;
            this.httpsPorts = builder.httpsPorts;
            this.id = builder.id;
            this.protectionServerCount = builder.protectionServerCount;
            this.proxyStatus = builder.proxyStatus;
            this.proxyType = builder.proxyType;
            this.remark = builder.remark;
            this.ruleConfig = builder.ruleConfig;
            this.ruleStatus = builder.ruleStatus;
            this.ruleType = builder.ruleType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterInfos create() {
            return builder().build();
        }

        /**
         * @return accessMode
         */
        public String getAccessMode() {
            return this.accessMode;
        }

        /**
         * @return accessRegion
         */
        public String getAccessRegion() {
            return this.accessRegion;
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return clusterResourceId
         */
        public String getClusterResourceId() {
            return this.clusterResourceId;
        }

        /**
         * @return httpPorts
         */
        public String getHttpPorts() {
            return this.httpPorts;
        }

        /**
         * @return httpsPorts
         */
        public String getHttpsPorts() {
            return this.httpsPorts;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return protectionServerCount
         */
        public Integer getProtectionServerCount() {
            return this.protectionServerCount;
        }

        /**
         * @return proxyStatus
         */
        public String getProxyStatus() {
            return this.proxyStatus;
        }

        /**
         * @return proxyType
         */
        public String getProxyType() {
            return this.proxyType;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return ruleConfig
         */
        public String getRuleConfig() {
            return this.ruleConfig;
        }

        /**
         * @return ruleStatus
         */
        public String getRuleStatus() {
            return this.ruleStatus;
        }

        /**
         * @return ruleType
         */
        public String getRuleType() {
            return this.ruleType;
        }

        public static final class Builder {
            private String accessMode; 
            private String accessRegion; 
            private String clusterName; 
            private String clusterResourceId; 
            private String httpPorts; 
            private String httpsPorts; 
            private Long id; 
            private Integer protectionServerCount; 
            private String proxyStatus; 
            private String proxyType; 
            private String remark; 
            private String ruleConfig; 
            private String ruleStatus; 
            private String ruleType; 

            private Builder() {
            } 

            private Builder(ClusterInfos model) {
                this.accessMode = model.accessMode;
                this.accessRegion = model.accessRegion;
                this.clusterName = model.clusterName;
                this.clusterResourceId = model.clusterResourceId;
                this.httpPorts = model.httpPorts;
                this.httpsPorts = model.httpsPorts;
                this.id = model.id;
                this.protectionServerCount = model.protectionServerCount;
                this.proxyStatus = model.proxyStatus;
                this.proxyType = model.proxyType;
                this.remark = model.remark;
                this.ruleConfig = model.ruleConfig;
                this.ruleStatus = model.ruleStatus;
                this.ruleType = model.ruleType;
            } 

            /**
             * <p>The network access mode. Valid values:</p>
             * <ul>
             * <li><strong>internet</strong>: Internet access.</li>
             * <li><strong>vpc</strong>: Express Connect private network access.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>internet</p>
             */
            public Builder accessMode(String accessMode) {
                this.accessMode = accessMode;
                return this;
            }

            /**
             * <p>The Express Connect access region. Valid values:</p>
             * <ul>
             * <li><strong>cn-hangzhou</strong>: Hangzhou.</li>
             * <li><strong>cn-beiijng</strong>: Beijing.</li>
             * <li><strong>cn-shanghai</strong>: Shanghai.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder accessRegion(String accessRegion) {
                this.accessRegion = accessRegion;
                return this;
            }

            /**
             * <p>The name of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>testcluster</p>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>The resource ID of the hybrid cloud cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>hdbc-cluster-t1****a</p>
             */
            public Builder clusterResourceId(String clusterResourceId) {
                this.clusterResourceId = clusterResourceId;
                return this;
            }

            /**
             * <p>The list of HTTP ports. Separate multiple ports with commas (,). Example: port1,port2,port3.</p>
             * 
             * <strong>example:</strong>
             * <p>80,8080</p>
             */
            public Builder httpPorts(String httpPorts) {
                this.httpPorts = httpPorts;
                return this;
            }

            /**
             * <p>The list of HTTPS ports. Separate multiple ports with commas (,). Example: port1,port2,port3.</p>
             * 
             * <strong>example:</strong>
             * <p>443,8443</p>
             */
            public Builder httpsPorts(String httpsPorts) {
                this.httpsPorts = httpsPorts;
                return this;
            }

            /**
             * <p>The ID of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>524**8</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The number of protection nodes that can be added to the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder protectionServerCount(Integer protectionServerCount) {
                this.protectionServerCount = protectionServerCount;
                return this;
            }

            /**
             * <p>The proxy gateway mode. Valid values:</p>
             * <ul>
             * <li><strong>on</strong>: Enabled.</li>
             * <li><strong>off</strong>: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder proxyStatus(String proxyStatus) {
                this.proxyStatus = proxyStatus;
                return this;
            }

            /**
             * <p>The cluster type. Valid values:</p>
             * <ul>
             * <li><strong>cname</strong>: Reverse proxy cluster.</li>
             * <li><strong>service</strong>: Service cluster.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cname</p>
             */
            public Builder proxyType(String proxyType) {
                this.proxyType = proxyType;
                return this;
            }

            /**
             * <p>The remarks.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>The rule configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;enable&quot;:true,&quot;param&quot;:{&quot;breaker&quot;:{&quot;duration&quot;:1,&quot;failed&quot;:1,&quot;recent_failed&quot;:1},&quot;disable_protect&quot;:false,&quot;max_request_body_len&quot;:1,&quot;timeout&quot;:1}}</p>
             */
            public Builder ruleConfig(String ruleConfig) {
                this.ruleConfig = ruleConfig;
                return this;
            }

            /**
             * <p>The manual bypass status. Valid values:</p>
             * <ul>
             * <li><p><strong>on</strong>: Enabled.</p>
             * </li>
             * <li><p><strong>off</strong>: Disabled.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder ruleStatus(String ruleStatus) {
                this.ruleStatus = ruleStatus;
                return this;
            }

            /**
             * <p>The rule type. Valid values:</p>
             * <ul>
             * <li><strong>bypass</strong>: Skips security checks and directly allows requests.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>bypass</p>
             */
            public Builder ruleType(String ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            public ClusterInfos build() {
                return new ClusterInfos(this);
            } 

        } 

    }
}
