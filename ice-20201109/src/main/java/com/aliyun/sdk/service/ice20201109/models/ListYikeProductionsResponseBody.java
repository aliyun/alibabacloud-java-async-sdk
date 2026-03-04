// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link ListYikeProductionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListYikeProductionsResponseBody</p>
 */
public class ListYikeProductionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("ProductionList")
    private java.util.List<ProductionList> productionList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListYikeProductionsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.productionList = builder.productionList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListYikeProductionsResponseBody create() {
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
     * @return productionList
     */
    public java.util.List<ProductionList> getProductionList() {
        return this.productionList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List<ProductionList> productionList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListYikeProductionsResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.productionList = model.productionList;
            this.requestId = model.requestId;
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
         * ProductionList.
         */
        public Builder productionList(java.util.List<ProductionList> productionList) {
            this.productionList = productionList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListYikeProductionsResponseBody build() {
            return new ListYikeProductionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListYikeProductionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListYikeProductionsResponseBody</p>
     */
    public static class ProductionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Auth")
        private String auth;

        @com.aliyun.core.annotation.NameInMap("CoverUrl")
        private String coverUrl;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreateUserName")
        private String createUserName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ProductionId")
        private String productionId;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        private ProductionList(Builder builder) {
            this.auth = builder.auth;
            this.coverUrl = builder.coverUrl;
            this.createTime = builder.createTime;
            this.createUserName = builder.createUserName;
            this.description = builder.description;
            this.productionId = builder.productionId;
            this.title = builder.title;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProductionList create() {
            return builder().build();
        }

        /**
         * @return auth
         */
        public String getAuth() {
            return this.auth;
        }

        /**
         * @return coverUrl
         */
        public String getCoverUrl() {
            return this.coverUrl;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createUserName
         */
        public String getCreateUserName() {
            return this.createUserName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return productionId
         */
        public String getProductionId() {
            return this.productionId;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String auth; 
            private String coverUrl; 
            private String createTime; 
            private String createUserName; 
            private String description; 
            private String productionId; 
            private String title; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(ProductionList model) {
                this.auth = model.auth;
                this.coverUrl = model.coverUrl;
                this.createTime = model.createTime;
                this.createUserName = model.createUserName;
                this.description = model.description;
                this.productionId = model.productionId;
                this.title = model.title;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * Auth.
             */
            public Builder auth(String auth) {
                this.auth = auth;
                return this;
            }

            /**
             * CoverUrl.
             */
            public Builder coverUrl(String coverUrl) {
                this.coverUrl = coverUrl;
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
             * CreateUserName.
             */
            public Builder createUserName(String createUserName) {
                this.createUserName = createUserName;
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
             * ProductionId.
             */
            public Builder productionId(String productionId) {
                this.productionId = productionId;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * WorkspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public ProductionList build() {
                return new ProductionList(this);
            } 

        } 

    }
}
