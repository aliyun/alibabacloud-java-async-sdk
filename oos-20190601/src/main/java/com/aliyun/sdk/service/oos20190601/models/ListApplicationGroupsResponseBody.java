// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListApplicationGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListApplicationGroupsResponseBody</p>
 */
public class ListApplicationGroupsResponseBody extends TeaModel {
    @NameInMap("ApplicationGroups")
    private java.util.List < ApplicationGroups> applicationGroups;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    private ListApplicationGroupsResponseBody(Builder builder) {
        this.applicationGroups = builder.applicationGroups;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplicationGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return applicationGroups
     */
    public java.util.List < ApplicationGroups> getApplicationGroups() {
        return this.applicationGroups;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
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

    public static final class Builder {
        private java.util.List < ApplicationGroups> applicationGroups; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 

        /**
         * The details of the application group.
         */
        public Builder applicationGroups(java.util.List < ApplicationGroups> applicationGroups) {
            this.applicationGroups = applicationGroups;
            return this;
        }

        /**
         * The number of entries returned on each page.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that is used to retrieve the next page of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListApplicationGroupsResponseBody build() {
            return new ListApplicationGroupsResponseBody(this);
        } 

    } 

    public static class ApplicationGroups extends TeaModel {
        @NameInMap("ApplicationName")
        private String applicationName;

        @NameInMap("CmsGroupId")
        private String cmsGroupId;

        @NameInMap("CreateDate")
        private String createDate;

        @NameInMap("DeployParameters")
        private String deployParameters;

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

        @NameInMap("Status")
        private String status;

        @NameInMap("StatusReason")
        private String statusReason;

        @NameInMap("UpdateDate")
        private String updateDate;

        private ApplicationGroups(Builder builder) {
            this.applicationName = builder.applicationName;
            this.cmsGroupId = builder.cmsGroupId;
            this.createDate = builder.createDate;
            this.deployParameters = builder.deployParameters;
            this.deployRegionId = builder.deployRegionId;
            this.description = builder.description;
            this.importTagKey = builder.importTagKey;
            this.importTagValue = builder.importTagValue;
            this.name = builder.name;
            this.status = builder.status;
            this.statusReason = builder.statusReason;
            this.updateDate = builder.updateDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicationGroups create() {
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
         * @return deployParameters
         */
        public String getDeployParameters() {
            return this.deployParameters;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusReason
         */
        public String getStatusReason() {
            return this.statusReason;
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
            private String deployParameters; 
            private String deployRegionId; 
            private String description; 
            private String importTagKey; 
            private String importTagValue; 
            private String name; 
            private String status; 
            private String statusReason; 
            private String updateDate; 

            /**
             * The name of the application.
             */
            public Builder applicationName(String applicationName) {
                this.applicationName = applicationName;
                return this;
            }

            /**
             * The ID of the application group in CloudMonitor.
             */
            public Builder cmsGroupId(String cmsGroupId) {
                this.cmsGroupId = cmsGroupId;
                return this;
            }

            /**
             * The time when the application group was created.
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * The configuration information of the application group.
             */
            public Builder deployParameters(String deployParameters) {
                this.deployParameters = deployParameters;
                return this;
            }

            /**
             * The ID of the region in which the related resources reside.
             */
            public Builder deployRegionId(String deployRegionId) {
                this.deployRegionId = deployRegionId;
                return this;
            }

            /**
             * The description of the application group.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The tag key.
             */
            public Builder importTagKey(String importTagKey) {
                this.importTagKey = importTagKey;
                return this;
            }

            /**
             * The tag value.
             */
            public Builder importTagValue(String importTagValue) {
                this.importTagValue = importTagValue;
                return this;
            }

            /**
             * The name of the application group.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The state of the application group.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The state information of the application group.
             */
            public Builder statusReason(String statusReason) {
                this.statusReason = statusReason;
                return this;
            }

            /**
             * The time when the application group was updated.
             */
            public Builder updateDate(String updateDate) {
                this.updateDate = updateDate;
                return this;
            }

            public ApplicationGroups build() {
                return new ApplicationGroups(this);
            } 

        } 

    }
}
