// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetRefererConfigRequest} extends {@link RequestModel}
 *
 * <p>SetRefererConfigRequest</p>
 */
public class SetRefererConfigRequest extends Request {
    @Query
    @NameInMap("AllowEmpty")
    private String allowEmpty;

    @Query
    @NameInMap("DisableAst")
    private String disableAst;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ReferList")
    private String referList;

    @Query
    @NameInMap("ReferType")
    @Validation(required = true)
    private String referType;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private SetRefererConfigRequest(Builder builder) {
        super(builder);
        this.allowEmpty = builder.allowEmpty;
        this.disableAst = builder.disableAst;
        this.domainName = builder.domainName;
        this.ownerId = builder.ownerId;
        this.referList = builder.referList;
        this.referType = builder.referType;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetRefererConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allowEmpty
     */
    public String getAllowEmpty() {
        return this.allowEmpty;
    }

    /**
     * @return disableAst
     */
    public String getDisableAst() {
        return this.disableAst;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return referList
     */
    public String getReferList() {
        return this.referList;
    }

    /**
     * @return referType
     */
    public String getReferType() {
        return this.referType;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<SetRefererConfigRequest, Builder> {
        private String allowEmpty; 
        private String disableAst; 
        private String domainName; 
        private Long ownerId; 
        private String referList; 
        private String referType; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(SetRefererConfigRequest response) {
            super(response);
            this.allowEmpty = response.allowEmpty;
            this.disableAst = response.disableAst;
            this.domainName = response.domainName;
            this.ownerId = response.ownerId;
            this.referList = response.referList;
            this.referType = response.referType;
            this.securityToken = response.securityToken;
        } 

        /**
         * AllowEmpty.
         */
        public Builder allowEmpty(String allowEmpty) {
            this.putQueryParameter("AllowEmpty", allowEmpty);
            this.allowEmpty = allowEmpty;
            return this;
        }

        /**
         * DisableAst.
         */
        public Builder disableAst(String disableAst) {
            this.putQueryParameter("DisableAst", disableAst);
            this.disableAst = disableAst;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ReferList.
         */
        public Builder referList(String referList) {
            this.putQueryParameter("ReferList", referList);
            this.referList = referList;
            return this;
        }

        /**
         * ReferType.
         */
        public Builder referType(String referType) {
            this.putQueryParameter("ReferType", referType);
            this.referType = referType;
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
        public SetRefererConfigRequest build() {
            return new SetRefererConfigRequest(this);
        } 

    } 

}
