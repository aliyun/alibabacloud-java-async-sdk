// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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
 * {@link ListApplicationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListApplicationsResponseBody</p>
 */
public class ListApplicationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Applications")
    private java.util.List<Applications> applications;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListApplicationsResponseBody(Builder builder) {
        this.applications = builder.applications;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
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
    public java.util.List<Applications> getApplications() {
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

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Applications> applications; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The applications.</p>
         */
        public Builder applications(java.util.List<Applications> applications) {
            this.applications = applications;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The page number of the next page returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9E3A7161-EB7B-172B-8D18-FFB06BA3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListApplicationsResponseBody build() {
            return new ListApplicationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListApplicationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListApplicationsResponseBody</p>
     */
    public static class Applications extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationName")
        private String applicationName;

        @com.aliyun.core.annotation.NameInMap("ApplicationState")
        private String applicationState;

        @com.aliyun.core.annotation.NameInMap("ApplicationVersion")
        @Deprecated
        private String applicationVersion;

        @com.aliyun.core.annotation.NameInMap("CommunityVersion")
        private String communityVersion;

        private Applications(Builder builder) {
            this.applicationName = builder.applicationName;
            this.applicationState = builder.applicationState;
            this.applicationVersion = builder.applicationVersion;
            this.communityVersion = builder.communityVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Applications create() {
            return builder().build();
        }

        /**
         * @return applicationName
         */
        public String getApplicationName() {
            return this.applicationName;
        }

        /**
         * @return applicationState
         */
        public String getApplicationState() {
            return this.applicationState;
        }

        /**
         * @return applicationVersion
         */
        public String getApplicationVersion() {
            return this.applicationVersion;
        }

        /**
         * @return communityVersion
         */
        public String getCommunityVersion() {
            return this.communityVersion;
        }

        public static final class Builder {
            private String applicationName; 
            private String applicationState; 
            private String applicationVersion; 
            private String communityVersion; 

            /**
             * <p>The application name.</p>
             * 
             * <strong>example:</strong>
             * <p>HDFS</p>
             */
            public Builder applicationName(String applicationName) {
                this.applicationName = applicationName;
                return this;
            }

            /**
             * <p>The status of the applications. Valid values:</p>
             * <ul>
             * <li>STOPPED: At least one application is in the Stopped state.</li>
             * <li>RUNNING: All applications are in the Running state.</li>
             * </ul>
             * <p>This parameter is returned only for DataLake, OLAP, Dataflow, DataServing, and custom clusters. For other types of clusters, no value is returned for this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder applicationState(String applicationState) {
                this.applicationState = applicationState;
                return this;
            }

            /**
             * <p>The version of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>2.8.1</p>
             */
            public Builder applicationVersion(String applicationVersion) {
                this.applicationVersion = applicationVersion;
                return this;
            }

            /**
             * <p>The community edition.</p>
             * 
             * <strong>example:</strong>
             * <p>2.8.5</p>
             */
            public Builder communityVersion(String communityVersion) {
                this.communityVersion = communityVersion;
                return this;
            }

            public Applications build() {
                return new Applications(this);
            } 

        } 

    }
}
