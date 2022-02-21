// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pcdn20170411.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetControlRulesRequest} extends {@link RequestModel}
 *
 * <p>GetControlRulesRequest</p>
 */
public class GetControlRulesRequest extends Request {
    @Query
    @NameInMap("Page")
    @Validation(required = true)
    private String page;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private String pageSize;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("Version")
    @Validation(required = true)
    private String version;

    private GetControlRulesRequest(Builder builder) {
        super(builder);
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.securityToken = builder.securityToken;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetControlRulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return page
     */
    public String getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<GetControlRulesRequest, Builder> {
        private String page; 
        private String pageSize; 
        private String securityToken; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(GetControlRulesRequest response) {
            super(response);
            this.page = response.page;
            this.pageSize = response.pageSize;
            this.securityToken = response.securityToken;
            this.version = response.version;
        } 

        /**
         * Page.
         */
        public Builder page(String page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * Version.
         */
        public Builder version(String version) {
            this.putQueryParameter("Version", version);
            this.version = version;
            return this;
        }

        @Override
        public GetControlRulesRequest build() {
            return new GetControlRulesRequest(this);
        } 

    } 

}
