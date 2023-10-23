// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ots20160620.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceResponseBody</p>
 */
public class GetInstanceResponseBody extends TeaModel {
    @NameInMap("InstanceInfo")
    private InstanceInfo instanceInfo;

    @NameInMap("RequestId")
    private String requestId;

    private GetInstanceResponseBody(Builder builder) {
        this.instanceInfo = builder.instanceInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceInfo
     */
    public InstanceInfo getInstanceInfo() {
        return this.instanceInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private InstanceInfo instanceInfo; 
        private String requestId; 

        /**
         * InstanceInfo.
         */
        public Builder instanceInfo(InstanceInfo instanceInfo) {
            this.instanceInfo = instanceInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetInstanceResponseBody build() {
            return new GetInstanceResponseBody(this);
        } 

    } 

    public static class Quota extends TeaModel {
        @NameInMap("EntityQuota")
        private Integer entityQuota;

        private Quota(Builder builder) {
            this.entityQuota = builder.entityQuota;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Quota create() {
            return builder().build();
        }

        /**
         * @return entityQuota
         */
        public Integer getEntityQuota() {
            return this.entityQuota;
        }

        public static final class Builder {
            private Integer entityQuota; 

            /**
             * EntityQuota.
             */
            public Builder entityQuota(Integer entityQuota) {
                this.entityQuota = entityQuota;
                return this;
            }

            public Quota build() {
                return new Quota(this);
            } 

        } 

    }
    public static class TagInfo extends TeaModel {
        @NameInMap("TagKey")
        private String tagKey;

        @NameInMap("TagValue")
        private String tagValue;

        private TagInfo(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagInfo create() {
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

            public TagInfo build() {
                return new TagInfo(this);
            } 

        } 

    }
    public static class TagInfos extends TeaModel {
        @NameInMap("TagInfo")
        private java.util.List < TagInfo> tagInfo;

        private TagInfos(Builder builder) {
            this.tagInfo = builder.tagInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagInfos create() {
            return builder().build();
        }

        /**
         * @return tagInfo
         */
        public java.util.List < TagInfo> getTagInfo() {
            return this.tagInfo;
        }

        public static final class Builder {
            private java.util.List < TagInfo> tagInfo; 

            /**
             * TagInfo.
             */
            public Builder tagInfo(java.util.List < TagInfo> tagInfo) {
                this.tagInfo = tagInfo;
                return this;
            }

            public TagInfos build() {
                return new TagInfos(this);
            } 

        } 

    }
    public static class InstanceInfo extends TeaModel {
        @NameInMap("ClusterType")
        private String clusterType;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("Network")
        private String network;

        @NameInMap("Quota")
        private Quota quota;

        @NameInMap("ReadCapacity")
        private Integer readCapacity;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("TagInfos")
        private TagInfos tagInfos;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("WriteCapacity")
        private Integer writeCapacity;

        private InstanceInfo(Builder builder) {
            this.clusterType = builder.clusterType;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.instanceName = builder.instanceName;
            this.network = builder.network;
            this.quota = builder.quota;
            this.readCapacity = builder.readCapacity;
            this.status = builder.status;
            this.tagInfos = builder.tagInfos;
            this.userId = builder.userId;
            this.writeCapacity = builder.writeCapacity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceInfo create() {
            return builder().build();
        }

        /**
         * @return clusterType
         */
        public String getClusterType() {
            return this.clusterType;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return network
         */
        public String getNetwork() {
            return this.network;
        }

        /**
         * @return quota
         */
        public Quota getQuota() {
            return this.quota;
        }

        /**
         * @return readCapacity
         */
        public Integer getReadCapacity() {
            return this.readCapacity;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return tagInfos
         */
        public TagInfos getTagInfos() {
            return this.tagInfos;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return writeCapacity
         */
        public Integer getWriteCapacity() {
            return this.writeCapacity;
        }

        public static final class Builder {
            private String clusterType; 
            private String createTime; 
            private String description; 
            private String instanceName; 
            private String network; 
            private Quota quota; 
            private Integer readCapacity; 
            private Integer status; 
            private TagInfos tagInfos; 
            private String userId; 
            private Integer writeCapacity; 

            /**
             * ClusterType.
             */
            public Builder clusterType(String clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
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
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * Network.
             */
            public Builder network(String network) {
                this.network = network;
                return this;
            }

            /**
             * Quota.
             */
            public Builder quota(Quota quota) {
                this.quota = quota;
                return this;
            }

            /**
             * ReadCapacity.
             */
            public Builder readCapacity(Integer readCapacity) {
                this.readCapacity = readCapacity;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * TagInfos.
             */
            public Builder tagInfos(TagInfos tagInfos) {
                this.tagInfos = tagInfos;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * WriteCapacity.
             */
            public Builder writeCapacity(Integer writeCapacity) {
                this.writeCapacity = writeCapacity;
                return this;
            }

            public InstanceInfo build() {
                return new InstanceInfo(this);
            } 

        } 

    }
}
