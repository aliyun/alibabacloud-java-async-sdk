// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdc20180821.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SyncUserToRdcRequest} extends {@link RequestModel}
 *
 * <p>SyncUserToRdcRequest</p>
 */
public class SyncUserToRdcRequest extends Request {
    @Body
    @NameInMap("LoginTicket")
    private String loginTicket;

    private SyncUserToRdcRequest(Builder builder) {
        super(builder);
        this.loginTicket = builder.loginTicket;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SyncUserToRdcRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return loginTicket
     */
    public String getLoginTicket() {
        return this.loginTicket;
    }

    public static final class Builder extends Request.Builder<SyncUserToRdcRequest, Builder> {
        private String loginTicket; 

        private Builder() {
            super();
        } 

        private Builder(SyncUserToRdcRequest response) {
            super(response);
            this.loginTicket = response.loginTicket;
        } 

        /**
         * LoginTicket.
         */
        public Builder loginTicket(String loginTicket) {
            this.putBodyParameter("LoginTicket", loginTicket);
            this.loginTicket = loginTicket;
            return this;
        }

        @Override
        public SyncUserToRdcRequest build() {
            return new SyncUserToRdcRequest(this);
        } 

    } 

}
