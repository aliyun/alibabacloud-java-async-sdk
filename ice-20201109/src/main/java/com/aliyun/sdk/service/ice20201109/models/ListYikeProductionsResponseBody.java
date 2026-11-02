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
         * <p>The maximum number of results.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The next token.</p>
         * 
         * <strong>example:</strong>
         * <p>Token</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The list of projects.</p>
         */
        public Builder productionList(java.util.List<ProductionList> productionList) {
            this.productionList = productionList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
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
             * <p>The authentication method.</p>
             * 
             * <strong>example:</strong>
             * <p>Manage</p>
             */
            public Builder auth(String auth) {
                this.auth = auth;
                return this;
            }

            /**
             * <p>The cover URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://tagvvcloud-material-center-prod.oss-cn-hangzhou.aliyuncs.com/sumvideo/utils_image/sumvideo-video-cover.png">https://tagvvcloud-material-center-prod.oss-cn-hangzhou.aliyuncs.com/sumvideo/utils_image/sumvideo-video-cover.png</a></p>
             */
            public Builder coverUrl(String coverUrl) {
                this.coverUrl = coverUrl;
                return this;
            }

            /**
             * <p>The creation time. The time follows the ISO 8601 standard and is in UTC (ending with Z).</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-07T02:21:36Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The username of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun_183320223010****</p>
             */
            public Builder createUserName(String createUserName) {
                this.createUserName = createUserName;
                return this;
            }

            /**
             * <p>The project description.</p>
             * 
             * <strong>example:</strong>
             * <p>Swas_QuerySwasInstanceByRegion</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The project ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pd_463862****</p>
             */
            public Builder productionId(String productionId) {
                this.productionId = productionId;
                return this;
            }

            /**
             * <p>The title.</p>
             * 
             * <strong>example:</strong>
             * <p>Harvest</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>llm-m3r546h1n9kq3mtm</p>
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
