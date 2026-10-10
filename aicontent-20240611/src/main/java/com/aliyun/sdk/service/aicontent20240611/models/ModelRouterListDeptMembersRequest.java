// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link ModelRouterListDeptMembersRequest} extends {@link RequestModel}
 *
 * <p>ModelRouterListDeptMembersRequest</p>
 */
public class ModelRouterListDeptMembersRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("authConfig")
    private String authConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("includeAuthorization")
    private Boolean includeAuthorization;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("includeBalance")
    private Boolean includeBalance;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("model")
    private String model;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageIndex")
    private Integer pageIndex;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    private ModelRouterListDeptMembersRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.authConfig = builder.authConfig;
        this.includeAuthorization = builder.includeAuthorization;
        this.includeBalance = builder.includeBalance;
        this.keyword = builder.keyword;
        this.model = builder.model;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelRouterListDeptMembersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return authConfig
     */
    public String getAuthConfig() {
        return this.authConfig;
    }

    /**
     * @return includeAuthorization
     */
    public Boolean getIncludeAuthorization() {
        return this.includeAuthorization;
    }

    /**
     * @return includeBalance
     */
    public Boolean getIncludeBalance() {
        return this.includeBalance;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ModelRouterListDeptMembersRequest, Builder> {
        private Long id; 
        private String authConfig; 
        private Boolean includeAuthorization; 
        private Boolean includeBalance; 
        private String keyword; 
        private String model; 
        private Integer pageIndex; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ModelRouterListDeptMembersRequest request) {
            super(request);
            this.id = request.id;
            this.authConfig = request.authConfig;
            this.includeAuthorization = request.includeAuthorization;
            this.includeBalance = request.includeBalance;
            this.keyword = request.keyword;
            this.model = request.model;
            this.pageIndex = request.pageIndex;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>The department ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder id(Long id) {
            this.putPathParameter("id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The authorization configuration filter. Valid values:</p>
         * <ul>
         * <li>inherit: only members that inherit department settings.</li>
         * <li>custom: only members with custom settings.</li>
         * <li>Empty: all members.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>inherit</p>
         */
        public Builder authConfig(String authConfig) {
            this.putQueryParameter("authConfig", authConfig);
            this.authConfig = authConfig;
            return this;
        }

        /**
         * <p>Specifies whether to include the authorized models and the number of associated keys for the member.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder includeAuthorization(Boolean includeAuthorization) {
            this.putQueryParameter("includeAuthorization", includeAuthorization);
            this.includeAuthorization = includeAuthorization;
            return this;
        }

        /**
         * <p>Specifies whether to include the monthly and permanent balance of the member\&quot;s sub-wallet.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder includeBalance(Boolean includeBalance) {
            this.putQueryParameter("includeBalance", includeBalance);
            this.includeBalance = includeBalance;
            return this;
        }

        /**
         * <p>The search keyword.</p>
         * 
         * <strong>example:</strong>
         * <p>John</p>
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>Filters members by the authorized model ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder model(String model) {
            this.putQueryParameter("model", model);
            this.model = model;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageIndex(Integer pageIndex) {
            this.putQueryParameter("pageIndex", pageIndex);
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ModelRouterListDeptMembersRequest build() {
            return new ModelRouterListDeptMembersRequest(this);
        } 

    } 

}
