// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link ListAllInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAllInstancesResponseBody</p>
 */
public class ListAllInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private ListAllInstancesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAllInstancesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private Integer maxResults; 
        private String message; 
        private String nextToken; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(ListAllInstancesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.maxResults = model.maxResults;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>2D693121-C925-5154-8DF6-C09A8B369822</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListAllInstancesResponseBody build() {
            return new ListAllInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAllInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAllInstancesResponseBody</p>
     */
    public static class Attributes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("infoKey")
        private String infoKey;

        @com.aliyun.core.annotation.NameInMap("infoType")
        private String infoType;

        @com.aliyun.core.annotation.NameInMap("infoValue")
        private String infoValue;

        private Attributes(Builder builder) {
            this.infoKey = builder.infoKey;
            this.infoType = builder.infoType;
            this.infoValue = builder.infoValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Attributes create() {
            return builder().build();
        }

        /**
         * @return infoKey
         */
        public String getInfoKey() {
            return this.infoKey;
        }

        /**
         * @return infoType
         */
        public String getInfoType() {
            return this.infoType;
        }

        /**
         * @return infoValue
         */
        public String getInfoValue() {
            return this.infoValue;
        }

        public static final class Builder {
            private String infoKey; 
            private String infoType; 
            private String infoValue; 

            private Builder() {
            } 

            private Builder(Attributes model) {
                this.infoKey = model.infoKey;
                this.infoType = model.infoType;
                this.infoValue = model.infoValue;
            } 

            /**
             * infoKey.
             */
            public Builder infoKey(String infoKey) {
                this.infoKey = infoKey;
                return this;
            }

            /**
             * infoType.
             */
            public Builder infoType(String infoType) {
                this.infoType = infoType;
                return this;
            }

            /**
             * infoValue.
             */
            public Builder infoValue(String infoValue) {
                this.infoValue = infoValue;
                return this;
            }

            public Attributes build() {
                return new Attributes(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAllInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAllInstancesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentConfigId")
        private String agentConfigId;

        @com.aliyun.core.annotation.NameInMap("agentConfigName")
        private String agentConfigName;

        @com.aliyun.core.annotation.NameInMap("attributes")
        private java.util.List<Attributes> attributes;

        @com.aliyun.core.annotation.NameInMap("clusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("clusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("imageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("installLevel")
        private String installLevel;

        @com.aliyun.core.annotation.NameInMap("installType")
        private String installType;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("instanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("instanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("kernelVersion")
        private String kernelVersion;

        @com.aliyun.core.annotation.NameInMap("manageLevel")
        private String manageLevel;

        @com.aliyun.core.annotation.NameInMap("manageType")
        private String manageType;

        @com.aliyun.core.annotation.NameInMap("osArch")
        private String osArch;

        @com.aliyun.core.annotation.NameInMap("osHealthScore")
        private Integer osHealthScore;

        @com.aliyun.core.annotation.NameInMap("osName")
        private String osName;

        @com.aliyun.core.annotation.NameInMap("privateIp")
        private String privateIp;

        @com.aliyun.core.annotation.NameInMap("publicIp")
        private String publicIp;

        @com.aliyun.core.annotation.NameInMap("resourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("resourceGroupName")
        private String resourceGroupName;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private Data(Builder builder) {
            this.agentConfigId = builder.agentConfigId;
            this.agentConfigName = builder.agentConfigName;
            this.attributes = builder.attributes;
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.imageId = builder.imageId;
            this.installLevel = builder.installLevel;
            this.installType = builder.installType;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.instanceType = builder.instanceType;
            this.kernelVersion = builder.kernelVersion;
            this.manageLevel = builder.manageLevel;
            this.manageType = builder.manageType;
            this.osArch = builder.osArch;
            this.osHealthScore = builder.osHealthScore;
            this.osName = builder.osName;
            this.privateIp = builder.privateIp;
            this.publicIp = builder.publicIp;
            this.resourceGroupId = builder.resourceGroupId;
            this.resourceGroupName = builder.resourceGroupName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return agentConfigId
         */
        public String getAgentConfigId() {
            return this.agentConfigId;
        }

        /**
         * @return agentConfigName
         */
        public String getAgentConfigName() {
            return this.agentConfigName;
        }

        /**
         * @return attributes
         */
        public java.util.List<Attributes> getAttributes() {
            return this.attributes;
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
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return installLevel
         */
        public String getInstallLevel() {
            return this.installLevel;
        }

        /**
         * @return installType
         */
        public String getInstallType() {
            return this.installType;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return kernelVersion
         */
        public String getKernelVersion() {
            return this.kernelVersion;
        }

        /**
         * @return manageLevel
         */
        public String getManageLevel() {
            return this.manageLevel;
        }

        /**
         * @return manageType
         */
        public String getManageType() {
            return this.manageType;
        }

        /**
         * @return osArch
         */
        public String getOsArch() {
            return this.osArch;
        }

        /**
         * @return osHealthScore
         */
        public Integer getOsHealthScore() {
            return this.osHealthScore;
        }

        /**
         * @return osName
         */
        public String getOsName() {
            return this.osName;
        }

        /**
         * @return privateIp
         */
        public String getPrivateIp() {
            return this.privateIp;
        }

        /**
         * @return publicIp
         */
        public String getPublicIp() {
            return this.publicIp;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return resourceGroupName
         */
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String agentConfigId; 
            private String agentConfigName; 
            private java.util.List<Attributes> attributes; 
            private String clusterId; 
            private String clusterName; 
            private String imageId; 
            private String installLevel; 
            private String installType; 
            private String instanceId; 
            private String instanceName; 
            private String instanceType; 
            private String kernelVersion; 
            private String manageLevel; 
            private String manageType; 
            private String osArch; 
            private Integer osHealthScore; 
            private String osName; 
            private String privateIp; 
            private String publicIp; 
            private String resourceGroupId; 
            private String resourceGroupName; 
            private String status; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.agentConfigId = model.agentConfigId;
                this.agentConfigName = model.agentConfigName;
                this.attributes = model.attributes;
                this.clusterId = model.clusterId;
                this.clusterName = model.clusterName;
                this.imageId = model.imageId;
                this.installLevel = model.installLevel;
                this.installType = model.installType;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.instanceType = model.instanceType;
                this.kernelVersion = model.kernelVersion;
                this.manageLevel = model.manageLevel;
                this.manageType = model.manageType;
                this.osArch = model.osArch;
                this.osHealthScore = model.osHealthScore;
                this.osName = model.osName;
                this.privateIp = model.privateIp;
                this.publicIp = model.publicIp;
                this.resourceGroupId = model.resourceGroupId;
                this.resourceGroupName = model.resourceGroupName;
                this.status = model.status;
            } 

            /**
             * agentConfigId.
             */
            public Builder agentConfigId(String agentConfigId) {
                this.agentConfigId = agentConfigId;
                return this;
            }

            /**
             * agentConfigName.
             */
            public Builder agentConfigName(String agentConfigName) {
                this.agentConfigName = agentConfigName;
                return this;
            }

            /**
             * attributes.
             */
            public Builder attributes(java.util.List<Attributes> attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * clusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * clusterName.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * imageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * installLevel.
             */
            public Builder installLevel(String installLevel) {
                this.installLevel = installLevel;
                return this;
            }

            /**
             * installType.
             */
            public Builder installType(String installType) {
                this.installType = installType;
                return this;
            }

            /**
             * instanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * instanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * instanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * kernelVersion.
             */
            public Builder kernelVersion(String kernelVersion) {
                this.kernelVersion = kernelVersion;
                return this;
            }

            /**
             * manageLevel.
             */
            public Builder manageLevel(String manageLevel) {
                this.manageLevel = manageLevel;
                return this;
            }

            /**
             * manageType.
             */
            public Builder manageType(String manageType) {
                this.manageType = manageType;
                return this;
            }

            /**
             * osArch.
             */
            public Builder osArch(String osArch) {
                this.osArch = osArch;
                return this;
            }

            /**
             * osHealthScore.
             */
            public Builder osHealthScore(Integer osHealthScore) {
                this.osHealthScore = osHealthScore;
                return this;
            }

            /**
             * osName.
             */
            public Builder osName(String osName) {
                this.osName = osName;
                return this;
            }

            /**
             * privateIp.
             */
            public Builder privateIp(String privateIp) {
                this.privateIp = privateIp;
                return this;
            }

            /**
             * publicIp.
             */
            public Builder publicIp(String publicIp) {
                this.publicIp = publicIp;
                return this;
            }

            /**
             * resourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * resourceGroupName.
             */
            public Builder resourceGroupName(String resourceGroupName) {
                this.resourceGroupName = resourceGroupName;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
