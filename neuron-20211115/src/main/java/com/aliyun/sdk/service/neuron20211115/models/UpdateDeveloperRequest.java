// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link UpdateDeveloperRequest} extends {@link RequestModel}
 *
 * <p>UpdateDeveloperRequest</p>
 */
public class UpdateDeveloperRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("accountId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private DeveloperInfoUpdateCmd body;

    private UpdateDeveloperRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDeveloperRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return body
     */
    public DeveloperInfoUpdateCmd getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdateDeveloperRequest, Builder> {
        private String accountId; 
        private DeveloperInfoUpdateCmd body; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDeveloperRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.body = request.body;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder accountId(String accountId) {
            this.putPathParameter("accountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder body(DeveloperInfoUpdateCmd body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public UpdateDeveloperRequest build() {
            return new UpdateDeveloperRequest(this);
        } 

    } 

}
