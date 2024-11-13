// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListWafManagedRulesRequest} extends {@link RequestModel}
 *
 * <p>ListWafManagedRulesRequest</p>
 */
public class ListWafManagedRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AttackType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer attackType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProtectionLevel")
    private Integer protectionLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryArgs")
    private QueryArgs queryArgs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    private ListWafManagedRulesRequest(Builder builder) {
        super(builder);
        this.attackType = builder.attackType;
        this.id = builder.id;
        this.language = builder.language;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.protectionLevel = builder.protectionLevel;
        this.queryArgs = builder.queryArgs;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWafManagedRulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attackType
     */
    public Integer getAttackType() {
        return this.attackType;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return protectionLevel
     */
    public Integer getProtectionLevel() {
        return this.protectionLevel;
    }

    /**
     * @return queryArgs
     */
    public QueryArgs getQueryArgs() {
        return this.queryArgs;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    public static final class Builder extends Request.Builder<ListWafManagedRulesRequest, Builder> {
        private Integer attackType; 
        private Long id; 
        private String language; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Integer protectionLevel; 
        private QueryArgs queryArgs; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(ListWafManagedRulesRequest request) {
            super(request);
            this.attackType = request.attackType;
            this.id = request.id;
            this.language = request.language;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.protectionLevel = request.protectionLevel;
            this.queryArgs = request.queryArgs;
            this.siteId = request.siteId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        public Builder attackType(Integer attackType) {
            this.putQueryParameter("AttackType", attackType);
            this.attackType = attackType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10000001</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * Language.
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ProtectionLevel.
         */
        public Builder protectionLevel(Integer protectionLevel) {
            this.putQueryParameter("ProtectionLevel", protectionLevel);
            this.protectionLevel = protectionLevel;
            return this;
        }

        /**
         * QueryArgs.
         */
        public Builder queryArgs(QueryArgs queryArgs) {
            String queryArgsShrink = shrink(queryArgs, "QueryArgs", "json");
            this.putQueryParameter("QueryArgs", queryArgsShrink);
            this.queryArgs = queryArgs;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        @Override
        public ListWafManagedRulesRequest build() {
            return new ListWafManagedRulesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListWafManagedRulesRequest} extends {@link TeaModel}
     *
     * <p>ListWafManagedRulesRequest</p>
     */
    public static class QueryArgs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("IdNameLike")
        private String idNameLike;

        @com.aliyun.core.annotation.NameInMap("ProtectionLevels")
        private java.util.List < Integer > protectionLevels;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private QueryArgs(Builder builder) {
            this.action = builder.action;
            this.idNameLike = builder.idNameLike;
            this.protectionLevels = builder.protectionLevels;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryArgs create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return idNameLike
         */
        public String getIdNameLike() {
            return this.idNameLike;
        }

        /**
         * @return protectionLevels
         */
        public java.util.List < Integer > getProtectionLevels() {
            return this.protectionLevels;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String action; 
            private String idNameLike; 
            private java.util.List < Integer > protectionLevels; 
            private String status; 

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * IdNameLike.
             */
            public Builder idNameLike(String idNameLike) {
                this.idNameLike = idNameLike;
                return this;
            }

            /**
             * ProtectionLevels.
             */
            public Builder protectionLevels(java.util.List < Integer > protectionLevels) {
                this.protectionLevels = protectionLevels;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public QueryArgs build() {
                return new QueryArgs(this);
            } 

        } 

    }
}
