// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link ListCatalogsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCatalogsResponseBody</p>
 */
public class ListCatalogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("catalogs")
    private java.util.List<Catalogs> catalogs;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private ListCatalogsResponseBody(Builder builder) {
        this.catalogs = builder.catalogs;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCatalogsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return catalogs
     */
    public java.util.List<Catalogs> getCatalogs() {
        return this.catalogs;
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
        private java.util.List<Catalogs> catalogs; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListCatalogsResponseBody model) {
            this.catalogs = model.catalogs;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * catalogs.
         */
        public Builder catalogs(java.util.List<Catalogs> catalogs) {
            this.catalogs = catalogs;
            return this;
        }

        /**
         * <p>一次获取的最大记录数。</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>下一页TOKEN。</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>请求ID。</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>记录总数。</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListCatalogsResponseBody build() {
            return new ListCatalogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCatalogsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCatalogsResponseBody</p>
     */
    public static class Catalogs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("alias")
        private String alias;

        @com.aliyun.core.annotation.NameInMap("catalogId")
        private String catalogId;

        @com.aliyun.core.annotation.NameInMap("catalogProvider")
        private String catalogProvider;

        @com.aliyun.core.annotation.NameInMap("catalogType")
        private String catalogType;

        @com.aliyun.core.annotation.NameInMap("environments")
        private java.util.List<String> environments;

        @com.aliyun.core.annotation.NameInMap("extras")
        private java.util.Map<String, String> extras;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("resourceOwnerId")
        private String resourceOwnerId;

        @com.aliyun.core.annotation.NameInMap("workspaceId")
        private String workspaceId;

        private Catalogs(Builder builder) {
            this.alias = builder.alias;
            this.catalogId = builder.catalogId;
            this.catalogProvider = builder.catalogProvider;
            this.catalogType = builder.catalogType;
            this.environments = builder.environments;
            this.extras = builder.extras;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.resourceOwnerId = builder.resourceOwnerId;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Catalogs create() {
            return builder().build();
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
        }

        /**
         * @return catalogId
         */
        public String getCatalogId() {
            return this.catalogId;
        }

        /**
         * @return catalogProvider
         */
        public String getCatalogProvider() {
            return this.catalogProvider;
        }

        /**
         * @return catalogType
         */
        public String getCatalogType() {
            return this.catalogType;
        }

        /**
         * @return environments
         */
        public java.util.List<String> getEnvironments() {
            return this.environments;
        }

        /**
         * @return extras
         */
        public java.util.Map<String, String> getExtras() {
            return this.extras;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return resourceOwnerId
         */
        public String getResourceOwnerId() {
            return this.resourceOwnerId;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String alias; 
            private String catalogId; 
            private String catalogProvider; 
            private String catalogType; 
            private java.util.List<String> environments; 
            private java.util.Map<String, String> extras; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private String resourceOwnerId; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Catalogs model) {
                this.alias = model.alias;
                this.catalogId = model.catalogId;
                this.catalogProvider = model.catalogProvider;
                this.catalogType = model.catalogType;
                this.environments = model.environments;
                this.extras = model.extras;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.resourceOwnerId = model.resourceOwnerId;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * alias.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * <p>regionId。</p>
             * 
             * <strong>example:</strong>
             * <p>15097**********</p>
             */
            public Builder catalogId(String catalogId) {
                this.catalogId = catalogId;
                return this;
            }

            /**
             * catalogProvider.
             */
            public Builder catalogProvider(String catalogProvider) {
                this.catalogProvider = catalogProvider;
                return this;
            }

            /**
             * catalogType.
             */
            public Builder catalogType(String catalogType) {
                this.catalogType = catalogType;
                return this;
            }

            /**
             * environments.
             */
            public Builder environments(java.util.List<String> environments) {
                this.environments = environments;
                return this;
            }

            /**
             * extras.
             */
            public Builder extras(java.util.Map<String, String> extras) {
                this.extras = extras;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * resourceOwnerId.
             */
            public Builder resourceOwnerId(String resourceOwnerId) {
                this.resourceOwnerId = resourceOwnerId;
                return this;
            }

            /**
             * <p>工作空间id。</p>
             * 
             * <strong>example:</strong>
             * <p>w-d2d82aa09155****</p>
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public Catalogs build() {
                return new Catalogs(this);
            } 

        } 

    }
}
