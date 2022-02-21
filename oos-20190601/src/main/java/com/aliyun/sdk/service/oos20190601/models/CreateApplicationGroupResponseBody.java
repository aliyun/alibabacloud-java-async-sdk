// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateApplicationGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateApplicationGroupResponseBody</p>
 */
public class CreateApplicationGroupResponseBody extends TeaModel {
    @NameInMap("ApplicationGroup")
    private ApplicationGroup applicationGroup;

    @NameInMap("RequestId")
    private String requestId;

    private CreateApplicationGroupResponseBody(Builder builder) {
        this.applicationGroup = builder.applicationGroup;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApplicationGroupResponseBody create() {
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

        public CreateApplicationGroupResponseBody build() {
            return new CreateApplicationGroupResponseBody(this);
        } 

    } 

    public static class ApplicationGroup extends TeaModel {
        @NameInMap("ApplicationName")
        private String applicationName;

        @NameInMap("CmsGroupId")
        private String cmsGroupId;

        @NameInMap("CreateDate")
        private String createDate;

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

        @NameInMap("UpdateDate")
        private String updateDate;

        private ApplicationGroup(Builder builder) {
            this.applicationName = builder.applicationName;
            this.cmsGroupId = builder.cmsGroupId;
            this.createDate = builder.createDate;
            this.deployRegionId = builder.deployRegionId;
            this.description = builder.description;
            this.importTagKey = builder.importTagKey;
            this.importTagValue = builder.importTagValue;
            this.name = builder.name;
            this.updateDate = builder.updateDate;
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
         * @return cmsGroupId
         */
        public String getCmsGroupId() {
            return this.cmsGroupId;
        }

        /**
         * @return createDate
         */
        public String getCreateDate() {
            return this.createDate;
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
         * @return updateDate
         */
        public String getUpdateDate() {
            return this.updateDate;
        }

        public static final class Builder {
            private String applicationName; 
            private String cmsGroupId; 
            private String createDate; 
            private String deployRegionId; 
            private String description; 
            private String importTagKey; 
            private String importTagValue; 
            private String name; 
            private String updateDate; 

            /**
             * ApplicationName.
             */
            public Builder applicationName(String applicationName) {
                this.applicationName = applicationName;
                return this;
            }

            /**
             * CmsGroupId.
             */
            public Builder cmsGroupId(String cmsGroupId) {
                this.cmsGroupId = cmsGroupId;
                return this;
            }

            /**
             * CreateDate.
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
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
             * UpdateDate.
             */
            public Builder updateDate(String updateDate) {
                this.updateDate = updateDate;
                return this;
            }

            public ApplicationGroup build() {
                return new ApplicationGroup(this);
            } 

        } 

    }
}
