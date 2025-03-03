// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241121.models;

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
 * {@link ManageSearchAccountInfoRequest} extends {@link RequestModel}
 *
 * <p>ManageSearchAccountInfoRequest</p>
 */
public class ManageSearchAccountInfoRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private AccountInfoManageRequest body;

    private ManageSearchAccountInfoRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ManageSearchAccountInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public AccountInfoManageRequest getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<ManageSearchAccountInfoRequest, Builder> {
        private AccountInfoManageRequest body; 

        private Builder() {
            super();
        } 

        private Builder(ManageSearchAccountInfoRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(AccountInfoManageRequest body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public ManageSearchAccountInfoRequest build() {
            return new ManageSearchAccountInfoRequest(this);
        } 

    } 

}
