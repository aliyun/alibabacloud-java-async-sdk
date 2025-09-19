// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListPrivateK8sResponseBody} extends {@link TeaModel}
 *
 * <p>ListPrivateK8sResponseBody</p>
 */
public class ListPrivateK8sResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PrivateK8sInfos")
    private java.util.List<PrivateK8sInfos> privateK8sInfos;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListPrivateK8sResponseBody(Builder builder) {
        this.privateK8sInfos = builder.privateK8sInfos;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPrivateK8sResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return privateK8sInfos
     */
    public java.util.List<PrivateK8sInfos> getPrivateK8sInfos() {
        return this.privateK8sInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<PrivateK8sInfos> privateK8sInfos; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListPrivateK8sResponseBody model) {
            this.privateK8sInfos = model.privateK8sInfos;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the self-managed Kubernetes clusters.</p>
         */
        public Builder privateK8sInfos(java.util.List<PrivateK8sInfos> privateK8sInfos) {
            this.privateK8sInfos = privateK8sInfos;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>52870893-48A7-5A9E-9E05-6253E5B6****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPrivateK8sResponseBody build() {
            return new ListPrivateK8sResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPrivateK8sResponseBody} extends {@link TeaModel}
     *
     * <p>ListPrivateK8sResponseBody</p>
     */
    public static class PrivateK8sInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("ApiServerIp")
        private String apiServerIp;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("K8sVersion")
        private String k8sVersion;

        @com.aliyun.core.annotation.NameInMap("KubeConfig")
        private String kubeConfig;

        @com.aliyun.core.annotation.NameInMap("NetType")
        private Long netType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private PrivateK8sInfos(Builder builder) {
            this.aliUid = builder.aliUid;
            this.apiServerIp = builder.apiServerIp;
            this.clusterName = builder.clusterName;
            this.id = builder.id;
            this.k8sVersion = builder.k8sVersion;
            this.kubeConfig = builder.kubeConfig;
            this.netType = builder.netType;
            this.regionId = builder.regionId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivateK8sInfos create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return apiServerIp
         */
        public String getApiServerIp() {
            return this.apiServerIp;
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return k8sVersion
         */
        public String getK8sVersion() {
            return this.k8sVersion;
        }

        /**
         * @return kubeConfig
         */
        public String getKubeConfig() {
            return this.kubeConfig;
        }

        /**
         * @return netType
         */
        public Long getNetType() {
            return this.netType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private Long aliUid; 
            private String apiServerIp; 
            private String clusterName; 
            private Long id; 
            private String k8sVersion; 
            private String kubeConfig; 
            private Long netType; 
            private String regionId; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(PrivateK8sInfos model) {
                this.aliUid = model.aliUid;
                this.apiServerIp = model.apiServerIp;
                this.clusterName = model.clusterName;
                this.id = model.id;
                this.k8sVersion = model.k8sVersion;
                this.kubeConfig = model.kubeConfig;
                this.netType = model.netType;
                this.regionId = model.regionId;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The ID of the Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>The IP address of the API server.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder apiServerIp(String apiServerIp) {
                this.apiServerIp = apiServerIp;
                return this;
            }

            /**
             * <p>The name of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>The ID of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The version of Kubernetes.</p>
             * 
             * <strong>example:</strong>
             * <p>1.18</p>
             */
            public Builder k8sVersion(String k8sVersion) {
                this.k8sVersion = k8sVersion;
                return this;
            }

            /**
             * <p>The server configuration of Kubernetes.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder kubeConfig(String kubeConfig) {
                this.kubeConfig = kubeConfig;
                return this;
            }

            /**
             * <p>The network type. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Internet.</li>
             * <li><strong>2</strong>: VPC.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder netType(Long netType) {
                this.netType = netType;
                return this;
            }

            /**
             * <p>The ID of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the virtual private cloud (VPC).</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-2zet5l358k6z0gnz*****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public PrivateK8sInfos build() {
                return new PrivateK8sInfos(this);
            } 

        } 

    }
}
