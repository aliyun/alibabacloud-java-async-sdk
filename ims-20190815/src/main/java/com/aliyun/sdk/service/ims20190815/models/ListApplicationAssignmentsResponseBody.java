// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

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
 * {@link ListApplicationAssignmentsResponseBody} extends {@link TeaModel}
 *
 * <p>ListApplicationAssignmentsResponseBody</p>
 */
public class ListApplicationAssignmentsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationAssignment")
    private ApplicationAssignment applicationAssignment;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListApplicationAssignmentsResponseBody(Builder builder) {
        this.applicationAssignment = builder.applicationAssignment;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplicationAssignmentsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationAssignment
     */
    public ApplicationAssignment getApplicationAssignment() {
        return this.applicationAssignment;
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
        private ApplicationAssignment applicationAssignment; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListApplicationAssignmentsResponseBody model) {
            this.applicationAssignment = model.applicationAssignment;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * ApplicationAssignment.
         */
        public Builder applicationAssignment(ApplicationAssignment applicationAssignment) {
            this.applicationAssignment = applicationAssignment;
            return this;
        }

        /**
         * <p>The maximum number of items per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>This parameter is returned only when the response is truncated. To retrieve the remaining content in subsequent API calls, use the NextToken value.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4507D1CD-526A-4E2B-A1E2-3AB045D1EE0B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListApplicationAssignmentsResponseBody build() {
            return new ListApplicationAssignmentsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListApplicationAssignmentsResponseBody} extends {@link TeaModel}
     *
     * <p>ListApplicationAssignmentsResponseBody</p>
     */
    public static class ApplicationAssignmentInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("PrincipalName")
        private String principalName;

        @com.aliyun.core.annotation.NameInMap("PrincipalType")
        private String principalType;

        private ApplicationAssignmentInfo(Builder builder) {
            this.appId = builder.appId;
            this.createTime = builder.createTime;
            this.principalName = builder.principalName;
            this.principalType = builder.principalType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicationAssignmentInfo create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return principalName
         */
        public String getPrincipalName() {
            return this.principalName;
        }

        /**
         * @return principalType
         */
        public String getPrincipalType() {
            return this.principalType;
        }

        public static final class Builder {
            private String appId; 
            private String createTime; 
            private String principalName; 
            private String principalType; 

            private Builder() {
            } 

            private Builder(ApplicationAssignmentInfo model) {
                this.appId = model.appId;
                this.createTime = model.createTime;
                this.principalName = model.principalName;
                this.principalType = model.principalType;
            } 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
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
             * PrincipalName.
             */
            public Builder principalName(String principalName) {
                this.principalName = principalName;
                return this;
            }

            /**
             * PrincipalType.
             */
            public Builder principalType(String principalType) {
                this.principalType = principalType;
                return this;
            }

            public ApplicationAssignmentInfo build() {
                return new ApplicationAssignmentInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListApplicationAssignmentsResponseBody} extends {@link TeaModel}
     *
     * <p>ListApplicationAssignmentsResponseBody</p>
     */
    public static class ApplicationAssignment extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationAssignmentInfo")
        private java.util.List<ApplicationAssignmentInfo> applicationAssignmentInfo;

        private ApplicationAssignment(Builder builder) {
            this.applicationAssignmentInfo = builder.applicationAssignmentInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicationAssignment create() {
            return builder().build();
        }

        /**
         * @return applicationAssignmentInfo
         */
        public java.util.List<ApplicationAssignmentInfo> getApplicationAssignmentInfo() {
            return this.applicationAssignmentInfo;
        }

        public static final class Builder {
            private java.util.List<ApplicationAssignmentInfo> applicationAssignmentInfo; 

            private Builder() {
            } 

            private Builder(ApplicationAssignment model) {
                this.applicationAssignmentInfo = model.applicationAssignmentInfo;
            } 

            /**
             * ApplicationAssignmentInfo.
             */
            public Builder applicationAssignmentInfo(java.util.List<ApplicationAssignmentInfo> applicationAssignmentInfo) {
                this.applicationAssignmentInfo = applicationAssignmentInfo;
                return this;
            }

            public ApplicationAssignment build() {
                return new ApplicationAssignment(this);
            } 

        } 

    }
}
