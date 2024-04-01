// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetAppCodeForInnerRequest} extends {@link RequestModel}
 *
 * <p>ResetAppCodeForInnerRequest</p>
 */
public class ResetAppCodeForInnerRequest extends Request {
    @Query
    @NameInMap("AliUid")
    @Validation(required = true)
    private Long aliUid;

    @Query
    @NameInMap("AppCode")
    @Validation(required = true)
    private String appCode;

    @Query
    @NameInMap("NewAppCode")
    private String newAppCode;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private ResetAppCodeForInnerRequest(Builder builder) {
        super(builder);
        this.aliUid = builder.aliUid;
        this.appCode = builder.appCode;
        this.newAppCode = builder.newAppCode;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetAppCodeForInnerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliUid
     */
    public Long getAliUid() {
        return this.aliUid;
    }

    /**
     * @return appCode
     */
    public String getAppCode() {
        return this.appCode;
    }

    /**
     * @return newAppCode
     */
    public String getNewAppCode() {
        return this.newAppCode;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<ResetAppCodeForInnerRequest, Builder> {
        private Long aliUid; 
        private String appCode; 
        private String newAppCode; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(ResetAppCodeForInnerRequest request) {
            super(request);
            this.aliUid = request.aliUid;
            this.appCode = request.appCode;
            this.newAppCode = request.newAppCode;
            this.securityToken = request.securityToken;
        } 

        /**
         * AliUid.
         */
        public Builder aliUid(Long aliUid) {
            this.putQueryParameter("AliUid", aliUid);
            this.aliUid = aliUid;
            return this;
        }

        /**
         * AppCode.
         */
        public Builder appCode(String appCode) {
            this.putQueryParameter("AppCode", appCode);
            this.appCode = appCode;
            return this;
        }

        /**
         * NewAppCode.
         */
        public Builder newAppCode(String newAppCode) {
            this.putQueryParameter("NewAppCode", newAppCode);
            this.newAppCode = newAppCode;
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

        @Override
        public ResetAppCodeForInnerRequest build() {
            return new ResetAppCodeForInnerRequest(this);
        } 

    } 

}
