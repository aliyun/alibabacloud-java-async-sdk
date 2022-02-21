// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateApplicationGroupResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateApplicationGroupResponseBody</p>
 */
public class UpdateApplicationGroupResponseBody extends TeaModel {
    @NameInMap("ApplicationGroup")
    private ApplicationGroup applicationGroup;

    @NameInMap("RequestId")
    private String requestId;

    private UpdateApplicationGroupResponseBody(Builder builder) {
        this.applicationGroup = builder.applicationGroup;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateApplicationGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return applicationGroup
     */
    public ApplicationGroup getApplicationGroup() {
        return this.applicationGroup;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ApplicationGroup applicationGroup; 
        private String requestId; 

        /**
         * ApplicationGroup.
         */
        public Builder applicationGroup(ApplicationGroup applicationGroup) {
            this.applicationGroup = applicationGroup;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateApplicationGroupResponseBody build() {
            return new UpdateApplicationGroupResponseBody(this);
        } 

    } 

    public static class ApplicationGroup extends TeaModel {
        @NameInMap("ApplicationName")
        private String applicationName;

        @NameInMap("CreatedDate")
        private String createdDate;

        @NameInMap("DeployRegionId")
        private String deployRegionId;

        @NameInMap("Description")
        private String description;

        @NameInMap("ImportTagKey")
        private String importTagKey;

        @NameInMap("ImportTagValue")
        private String importTagValue;

        @NameInMap("Name")
        private String name;

        @NameInMap("UpdatedDate")
        private String updatedDate;

        private ApplicationGroup(Builder builder) {
            this.applicationName = builder.applicationName;
            this.createdDate = builder.createdDate;
            this.deployRegionId = builder.deployRegionId;
            this.description = builder.description;
            this.importTagKey = builder.importTagKey;
            this.importTagValue = builder.importTagValue;
            this.name = builder.name;
            this.updatedDate = builder.updatedDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicationGroup create() {
            return builder().build();
        }

        /**
         * @return applicationName
         */
        public String getApplicationName() {
            return this.applicationName;
        }

        /**
         * @return createdDate
         */
        public String getCreatedDate() {
            return this.createdDate;
        }

        /**
         * @return deployRegionId
         */
        public String getDeployRegionId() {
            return this.deployRegionId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return importTagKey
         */
        public String getImportTagKey() {
            return this.importTagKey;
        }

        /**
         * @return importTagValue
         */
        public String getImportTagValue() {
            return this.importTagValue;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return updatedDate
         */
        public String getUpdatedDate() {
            return this.updatedDate;
        }

        public static final class Builder {
            private String applicationName; 
            private String createdDate; 
            private String deployRegionId; 
            private String description; 
            private String importTagKey; 
            private String importTagValue; 
            private String name; 
            private String updatedDate; 

            /**
             * ApplicationName.
             */
            public Builder applicationName(String applicationName) {
                this.applicationName = applicationName;
                return this;
            }

            /**
             * CreatedDate.
             */
            public Builder createdDate(String createdDate) {
                this.createdDate = createdDate;
                return this;
            }

            /**
             * DeployRegionId.
             */
            public Builder deployRegionId(String deployRegionId) {
                this.deployRegionId = deployRegionId;
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
             * ImportTagKey.
             */
            public Builder importTagKey(String importTagKey) {
                this.importTagKey = importTagKey;
                return this;
            }

            /**
             * ImportTagValue.
             */
            public Builder importTagValue(String importTagValue) {
                this.importTagValue = importTagValue;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * UpdatedDate.
             */
            public Builder updatedDate(String updatedDate) {
                this.updatedDate = updatedDate;
                return this;
            }

            public ApplicationGroup build() {
                return new ApplicationGroup(this);
            } 

        } 

    }
}
