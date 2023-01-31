// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstancesResponseBody</p>
 */
public class ListInstancesResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Instances")
    private java.util.List < Instances> instances;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListInstancesResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.instances = builder.instances;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return instances
     */
    public java.util.List < Instances> getInstances() {
        return this.instances;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private java.util.List < Instances> instances; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Instances.
         */
        public Builder instances(java.util.List < Instances> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListInstancesResponseBody build() {
            return new ListInstancesResponseBody(this);
        } 

    } 

    public static class ResourceTags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private ResourceTags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceTags create() {
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ResourceTags build() {
                return new ResourceTags(this);
            } 

        } 

    }
    public static class Instances extends TeaModel {
        @NameInMap("CreationTime")
        private Long creationTime;

        @NameInMap("CreatorId")
        private Long creatorId;

        @NameInMap("CreatorName")
        private String creatorName;

        @NameInMap("InstanceDescription")
        private String instanceDescription;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("IsPreset")
        private Boolean isPreset;

        @NameInMap("MaxConcurrentConversation")
        private Integer maxConcurrentConversation;

        @NameInMap("OwnerName")
        private String ownerName;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("ResourceTags")
        private java.util.List < ResourceTags> resourceTags;

        private Instances(Builder builder) {
            this.creationTime = builder.creationTime;
            this.creatorId = builder.creatorId;
            this.creatorName = builder.creatorName;
            this.instanceDescription = builder.instanceDescription;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.isPreset = builder.isPreset;
            this.maxConcurrentConversation = builder.maxConcurrentConversation;
            this.ownerName = builder.ownerName;
            this.resourceGroupId = builder.resourceGroupId;
            this.resourceTags = builder.resourceTags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public Long getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return creatorId
         */
        public Long getCreatorId() {
            return this.creatorId;
        }

        /**
         * @return creatorName
         */
        public String getCreatorName() {
            return this.creatorName;
        }

        /**
         * @return instanceDescription
         */
        public String getInstanceDescription() {
            return this.instanceDescription;
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
         * @return isPreset
         */
        public Boolean getIsPreset() {
            return this.isPreset;
        }

        /**
         * @return maxConcurrentConversation
         */
        public Integer getMaxConcurrentConversation() {
            return this.maxConcurrentConversation;
        }

        /**
         * @return ownerName
         */
        public String getOwnerName() {
            return this.ownerName;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return resourceTags
         */
        public java.util.List < ResourceTags> getResourceTags() {
            return this.resourceTags;
        }

        public static final class Builder {
            private Long creationTime; 
            private Long creatorId; 
            private String creatorName; 
            private String instanceDescription; 
            private String instanceId; 
            private String instanceName; 
            private Boolean isPreset; 
            private Integer maxConcurrentConversation; 
            private String ownerName; 
            private String resourceGroupId; 
            private java.util.List < ResourceTags> resourceTags; 

            /**
             * CreationTime.
             */
            public Builder creationTime(Long creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * CreatorId.
             */
            public Builder creatorId(Long creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * CreatorName.
             */
            public Builder creatorName(String creatorName) {
                this.creatorName = creatorName;
                return this;
            }

            /**
             * InstanceDescription.
             */
            public Builder instanceDescription(String instanceDescription) {
                this.instanceDescription = instanceDescription;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
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
             * IsPreset.
             */
            public Builder isPreset(Boolean isPreset) {
                this.isPreset = isPreset;
                return this;
            }

            /**
             * MaxConcurrentConversation.
             */
            public Builder maxConcurrentConversation(Integer maxConcurrentConversation) {
                this.maxConcurrentConversation = maxConcurrentConversation;
                return this;
            }

            /**
             * OwnerName.
             */
            public Builder ownerName(String ownerName) {
                this.ownerName = ownerName;
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
             * ResourceTags.
             */
            public Builder resourceTags(java.util.List < ResourceTags> resourceTags) {
                this.resourceTags = resourceTags;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
