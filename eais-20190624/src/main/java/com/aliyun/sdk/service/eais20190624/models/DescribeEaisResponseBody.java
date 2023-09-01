// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eais20190624.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEaisResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEaisResponseBody</p>
 */
public class DescribeEaisResponseBody extends TeaModel {
    @NameInMap("Instances")
    private Instances instances;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeEaisResponseBody(Builder builder) {
        this.instances = builder.instances;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEaisResponseBody create() {
        return builder().build();
    }

    /**
     * @return instances
     */
    public Instances getInstances() {
        return this.instances;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Instances instances; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Instances.
         */
        public Builder instances(Instances instances) {
            this.instances = instances;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeEaisResponseBody build() {
            return new DescribeEaisResponseBody(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("TagKey")
        private String tagKey;

        @NameInMap("TagValue")
        private String tagValue;

        private Tag(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Tag")
        private java.util.List < Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List < Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class Instance extends TeaModel {
        @NameInMap("Category")
        private String category;

        @NameInMap("ClientInstanceId")
        private String clientInstanceId;

        @NameInMap("ClientInstanceName")
        private String clientInstanceName;

        @NameInMap("ClientInstanceType")
        private String clientInstanceType;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("ElasticAcceleratedInstanceId")
        private String elasticAcceleratedInstanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("JupyterUrl")
        private String jupyterUrl;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("SecurityGroupId")
        private String securityGroupId;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("Tags")
        private Tags tags;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("ZoneId")
        private String zoneId;

        private Instance(Builder builder) {
            this.category = builder.category;
            this.clientInstanceId = builder.clientInstanceId;
            this.clientInstanceName = builder.clientInstanceName;
            this.clientInstanceType = builder.clientInstanceType;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.elasticAcceleratedInstanceId = builder.elasticAcceleratedInstanceId;
            this.instanceName = builder.instanceName;
            this.instanceType = builder.instanceType;
            this.jupyterUrl = builder.jupyterUrl;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.securityGroupId = builder.securityGroupId;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.tags = builder.tags;
            this.vSwitchId = builder.vSwitchId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instance create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return clientInstanceId
         */
        public String getClientInstanceId() {
            return this.clientInstanceId;
        }

        /**
         * @return clientInstanceName
         */
        public String getClientInstanceName() {
            return this.clientInstanceName;
        }

        /**
         * @return clientInstanceType
         */
        public String getClientInstanceType() {
            return this.clientInstanceType;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return elasticAcceleratedInstanceId
         */
        public String getElasticAcceleratedInstanceId() {
            return this.elasticAcceleratedInstanceId;
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
         * @return jupyterUrl
         */
        public String getJupyterUrl() {
            return this.jupyterUrl;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
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

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String category; 
            private String clientInstanceId; 
            private String clientInstanceName; 
            private String clientInstanceType; 
            private String creationTime; 
            private String description; 
            private String elasticAcceleratedInstanceId; 
            private String instanceName; 
            private String instanceType; 
            private String jupyterUrl; 
            private String regionId; 
            private String resourceGroupId; 
            private String securityGroupId; 
            private String startTime; 
            private String status; 
            private Tags tags; 
            private String vSwitchId; 
            private String zoneId; 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * ClientInstanceId.
             */
            public Builder clientInstanceId(String clientInstanceId) {
                this.clientInstanceId = clientInstanceId;
                return this;
            }

            /**
             * ClientInstanceName.
             */
            public Builder clientInstanceName(String clientInstanceName) {
                this.clientInstanceName = clientInstanceName;
                return this;
            }

            /**
             * ClientInstanceType.
             */
            public Builder clientInstanceType(String clientInstanceType) {
                this.clientInstanceType = clientInstanceType;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * ElasticAcceleratedInstanceId.
             */
            public Builder elasticAcceleratedInstanceId(String elasticAcceleratedInstanceId) {
                this.elasticAcceleratedInstanceId = elasticAcceleratedInstanceId;
                return this;
            }

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * JupyterUrl.
             */
            public Builder jupyterUrl(String jupyterUrl) {
                this.jupyterUrl = jupyterUrl;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * SecurityGroupId.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Instance build() {
                return new Instance(this);
            } 

        } 

    }
    public static class Instances extends TeaModel {
        @NameInMap("Instance")
        private java.util.List < Instance> instance;

        private Instances(Builder builder) {
            this.instance = builder.instance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return instance
         */
        public java.util.List < Instance> getInstance() {
            return this.instance;
        }

        public static final class Builder {
            private java.util.List < Instance> instance; 

            /**
             * Instance.
             */
            public Builder instance(java.util.List < Instance> instance) {
                this.instance = instance;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
