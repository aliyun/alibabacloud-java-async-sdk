// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link GetResourceConfigurationSampleResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourceConfigurationSampleResponseBody</p>
 */
public class GetResourceConfigurationSampleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Sample")
    private Sample sample;

    private GetResourceConfigurationSampleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.sample = builder.sample;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceConfigurationSampleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sample
     */
    public Sample getSample() {
        return this.sample;
    }

    public static final class Builder {
        private String requestId; 
        private Sample sample; 

        private Builder() {
        } 

        private Builder(GetResourceConfigurationSampleResponseBody model) {
            this.requestId = model.requestId;
            this.sample = model.sample;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>DC300244-FCE3-5061-8214-C27ECB668487</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Sample.
         */
        public Builder sample(Sample sample) {
            this.sample = sample;
            return this;
        }

        public GetResourceConfigurationSampleResponseBody build() {
            return new GetResourceConfigurationSampleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetResourceConfigurationSampleResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourceConfigurationSampleResponseBody</p>
     */
    public static class Sample extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("AvailabilityZone")
        private String availabilityZone;

        @com.aliyun.core.annotation.NameInMap("Configuration")
        private String configuration;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("ResourceCreationTime")
        private String resourceCreationTime;

        @com.aliyun.core.annotation.NameInMap("ResourceDeleted")
        private String resourceDeleted;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceName")
        private String resourceName;

        @com.aliyun.core.annotation.NameInMap("ResourceStatus")
        private String resourceStatus;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private String tags;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private Sample(Builder builder) {
            this.accountId = builder.accountId;
            this.availabilityZone = builder.availabilityZone;
            this.configuration = builder.configuration;
            this.region = builder.region;
            this.resourceCreationTime = builder.resourceCreationTime;
            this.resourceDeleted = builder.resourceDeleted;
            this.resourceId = builder.resourceId;
            this.resourceName = builder.resourceName;
            this.resourceStatus = builder.resourceStatus;
            this.resourceType = builder.resourceType;
            this.tags = builder.tags;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sample create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return availabilityZone
         */
        public String getAvailabilityZone() {
            return this.availabilityZone;
        }

        /**
         * @return configuration
         */
        public String getConfiguration() {
            return this.configuration;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return resourceCreationTime
         */
        public String getResourceCreationTime() {
            return this.resourceCreationTime;
        }

        /**
         * @return resourceDeleted
         */
        public String getResourceDeleted() {
            return this.resourceDeleted;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceName
         */
        public String getResourceName() {
            return this.resourceName;
        }

        /**
         * @return resourceStatus
         */
        public String getResourceStatus() {
            return this.resourceStatus;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return tags
         */
        public String getTags() {
            return this.tags;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String accountId; 
            private String availabilityZone; 
            private String configuration; 
            private String region; 
            private String resourceCreationTime; 
            private String resourceDeleted; 
            private String resourceId; 
            private String resourceName; 
            private String resourceStatus; 
            private String resourceType; 
            private String tags; 
            private String version; 

            private Builder() {
            } 

            private Builder(Sample model) {
                this.accountId = model.accountId;
                this.availabilityZone = model.availabilityZone;
                this.configuration = model.configuration;
                this.region = model.region;
                this.resourceCreationTime = model.resourceCreationTime;
                this.resourceDeleted = model.resourceDeleted;
                this.resourceId = model.resourceId;
                this.resourceName = model.resourceName;
                this.resourceStatus = model.resourceStatus;
                this.resourceType = model.resourceType;
                this.tags = model.tags;
                this.version = model.version;
            } 

            /**
             * AccountId.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * AvailabilityZone.
             */
            public Builder availabilityZone(String availabilityZone) {
                this.availabilityZone = availabilityZone;
                return this;
            }

            /**
             * Configuration.
             */
            public Builder configuration(String configuration) {
                this.configuration = configuration;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * ResourceCreationTime.
             */
            public Builder resourceCreationTime(String resourceCreationTime) {
                this.resourceCreationTime = resourceCreationTime;
                return this;
            }

            /**
             * ResourceDeleted.
             */
            public Builder resourceDeleted(String resourceDeleted) {
                this.resourceDeleted = resourceDeleted;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * ResourceName.
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * ResourceStatus.
             */
            public Builder resourceStatus(String resourceStatus) {
                this.resourceStatus = resourceStatus;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Sample build() {
                return new Sample(this);
            } 

        } 

    }
}
