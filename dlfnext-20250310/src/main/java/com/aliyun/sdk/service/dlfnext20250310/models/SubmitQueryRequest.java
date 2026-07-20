// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

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
 * {@link SubmitQueryRequest} extends {@link RequestModel}
 *
 * <p>SubmitQueryRequest</p>
 */
public class SubmitQueryRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("defaultCatalog")
    private String defaultCatalog;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("defaultDatabase")
    private String defaultDatabase;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("limit")
    private Integer limit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sql")
    private String sql;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tier")
    private String tier;

    private SubmitQueryRequest(Builder builder) {
        super(builder);
        this.defaultCatalog = builder.defaultCatalog;
        this.defaultDatabase = builder.defaultDatabase;
        this.limit = builder.limit;
        this.sql = builder.sql;
        this.tier = builder.tier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitQueryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return defaultCatalog
     */
    public String getDefaultCatalog() {
        return this.defaultCatalog;
    }

    /**
     * @return defaultDatabase
     */
    public String getDefaultDatabase() {
        return this.defaultDatabase;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return sql
     */
    public String getSql() {
        return this.sql;
    }

    /**
     * @return tier
     */
    public String getTier() {
        return this.tier;
    }

    public static final class Builder extends Request.Builder<SubmitQueryRequest, Builder> {
        private String defaultCatalog; 
        private String defaultDatabase; 
        private Integer limit; 
        private String sql; 
        private String tier; 

        private Builder() {
            super();
        } 

        private Builder(SubmitQueryRequest request) {
            super(request);
            this.defaultCatalog = request.defaultCatalog;
            this.defaultDatabase = request.defaultDatabase;
            this.limit = request.limit;
            this.sql = request.sql;
            this.tier = request.tier;
        } 

        /**
         * defaultCatalog.
         */
        public Builder defaultCatalog(String defaultCatalog) {
            this.putBodyParameter("defaultCatalog", defaultCatalog);
            this.defaultCatalog = defaultCatalog;
            return this;
        }

        /**
         * defaultDatabase.
         */
        public Builder defaultDatabase(String defaultDatabase) {
            this.putBodyParameter("defaultDatabase", defaultDatabase);
            this.defaultDatabase = defaultDatabase;
            return this;
        }

        /**
         * limit.
         */
        public Builder limit(Integer limit) {
            this.putBodyParameter("limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * sql.
         */
        public Builder sql(String sql) {
            this.putBodyParameter("sql", sql);
            this.sql = sql;
            return this;
        }

        /**
         * tier.
         */
        public Builder tier(String tier) {
            this.putBodyParameter("tier", tier);
            this.tier = tier;
            return this;
        }

        @Override
        public SubmitQueryRequest build() {
            return new SubmitQueryRequest(this);
        } 

    } 

}
