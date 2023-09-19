// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListApplicationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListApplicationsResponseBody</p>
 */
public class ListApplicationsResponseBody extends TeaModel {
    @NameInMap("Applications")
    private java.util.List < Applications> applications;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    private ListApplicationsResponseBody(Builder builder) {
        this.applications = builder.applications;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplicationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return applications
     */
    public java.util.List < Applications> getApplications() {
        return this.applications;
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
        private java.util.List < Applications> applications; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 

        /**
         * The details of the application.
         */
        public Builder applications(java.util.List < Applications> applications) {
            this.applications = applications;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The pagination token that is used in the next request to retrieve a new page of results.
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

        public ListApplicationsResponseBody build() {
            return new ListApplicationsResponseBody(this);
        } 

    } 

    public static class Applications extends TeaModel {
        @NameInMap("ApplicationType")
        private String applicationType;

        @NameInMap("CreateDate")
        private String createDate;

        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("Tags")
        private java.util.Map < String, ? > tags;

        @NameInMap("UpdateDate")
        private String updateDate;

        private Applications(Builder builder) {
            this.applicationType = builder.applicationType;
            this.createDate = builder.createDate;
            this.description = builder.description;
            this.name = builder.name;
            this.resourceGroupId = builder.resourceGroupId;
            this.tags = builder.tags;
            this.updateDate = builder.updateDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Applications create() {
            return builder().build();
        }

        /**
         * @return applicationType
         */
        public String getApplicationType() {
            return this.applicationType;
        }

        /**
         * @return createDate
         */
        public String getCreateDate() {
            return this.createDate;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return tags
         */
        public java.util.Map < String, ? > getTags() {
            return this.tags;
        }

        /**
         * @return updateDate
         */
        public String getUpdateDate() {
            return this.updateDate;
        }

        public static final class Builder {
            private String applicationType; 
            private String createDate; 
            private String description; 
            private String name; 
            private String resourceGroupId; 
            private java.util.Map < String, ? > tags; 
            private String updateDate; 

            /**
             * The type of the application.
             */
            public Builder applicationType(String applicationType) {
                this.applicationType = applicationType;
                return this;
            }

            /**
             * The time when the application was created.
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * The description of the application.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the application.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The resource group ID.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The tags added to the application.
             */
            public Builder tags(java.util.Map < String, ? > tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The time when the application was updated.
             */
            public Builder updateDate(String updateDate) {
                this.updateDate = updateDate;
                return this;
            }

            public Applications build() {
                return new Applications(this);
            } 

        } 

    }
}
