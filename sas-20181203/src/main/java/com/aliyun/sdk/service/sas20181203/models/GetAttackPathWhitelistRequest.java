// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetAttackPathWhitelistRequest} extends {@link RequestModel}
 *
 * <p>GetAttackPathWhitelistRequest</p>
 */
public class GetAttackPathWhitelistRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AttackPathWhitelistId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String attackPathWhitelistId;

    private GetAttackPathWhitelistRequest(Builder builder) {
        super(builder);
        this.attackPathWhitelistId = builder.attackPathWhitelistId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAttackPathWhitelistRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attackPathWhitelistId
     */
    public String getAttackPathWhitelistId() {
        return this.attackPathWhitelistId;
    }

    public static final class Builder extends Request.Builder<GetAttackPathWhitelistRequest, Builder> {
        private String attackPathWhitelistId; 

        private Builder() {
            super();
        } 

        private Builder(GetAttackPathWhitelistRequest request) {
            super(request);
            this.attackPathWhitelistId = request.attackPathWhitelistId;
        } 

        /**
         * <p>Attack path whitelist ID.</p>
         * <blockquote>
         * <p>You can call <a href="~~ListAttackPathWhitelist~~">ListAttackPathWhitelist</a> to query the attack path whitelist ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>apwl-b33dec0acf9b42aabde032d656c0****</p>
         */
        public Builder attackPathWhitelistId(String attackPathWhitelistId) {
            this.putQueryParameter("AttackPathWhitelistId", attackPathWhitelistId);
            this.attackPathWhitelistId = attackPathWhitelistId;
            return this;
        }

        @Override
        public GetAttackPathWhitelistRequest build() {
            return new GetAttackPathWhitelistRequest(this);
        } 

    } 

}
