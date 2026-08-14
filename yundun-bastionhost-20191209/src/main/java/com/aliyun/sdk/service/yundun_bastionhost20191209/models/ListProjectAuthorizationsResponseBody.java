// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

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
 * {@link ListProjectAuthorizationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListProjectAuthorizationsResponseBody</p>
 */
public class ListProjectAuthorizationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("ProjectAuthorizations")
    private java.util.List<ProjectAuthorizations> projectAuthorizations;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListProjectAuthorizationsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.projectAuthorizations = builder.projectAuthorizations;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProjectAuthorizationsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return projectAuthorizations
     */
    public java.util.List<ProjectAuthorizations> getProjectAuthorizations() {
        return this.projectAuthorizations;
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
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List<ProjectAuthorizations> projectAuthorizations; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListProjectAuthorizationsResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.projectAuthorizations = model.projectAuthorizations;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * ProjectAuthorizations.
         */
        public Builder projectAuthorizations(java.util.List<ProjectAuthorizations> projectAuthorizations) {
            this.projectAuthorizations = projectAuthorizations;
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

        public ListProjectAuthorizationsResponseBody build() {
            return new ListProjectAuthorizationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListProjectAuthorizationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectAuthorizationsResponseBody</p>
     */
    public static class ProjectAuthorizations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthorizationId")
        private Long authorizationId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ScopeType")
        private Integer scopeType;

        private ProjectAuthorizations(Builder builder) {
            this.authorizationId = builder.authorizationId;
            this.description = builder.description;
            this.name = builder.name;
            this.scopeType = builder.scopeType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProjectAuthorizations create() {
            return builder().build();
        }

        /**
         * @return authorizationId
         */
        public Long getAuthorizationId() {
            return this.authorizationId;
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
         * @return scopeType
         */
        public Integer getScopeType() {
            return this.scopeType;
        }

        public static final class Builder {
            private Long authorizationId; 
            private String description; 
            private String name; 
            private Integer scopeType; 

            private Builder() {
            } 

            private Builder(ProjectAuthorizations model) {
                this.authorizationId = model.authorizationId;
                this.description = model.description;
                this.name = model.name;
                this.scopeType = model.scopeType;
            } 

            /**
             * AuthorizationId.
             */
            public Builder authorizationId(Long authorizationId) {
                this.authorizationId = authorizationId;
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ScopeType.
             */
            public Builder scopeType(Integer scopeType) {
                this.scopeType = scopeType;
                return this;
            }

            public ProjectAuthorizations build() {
                return new ProjectAuthorizations(this);
            } 

        } 

    }
}
