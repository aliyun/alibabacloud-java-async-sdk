// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link UpdateCredentialRequest} extends {@link RequestModel}
 *
 * <p>UpdateCredentialRequest</p>
 */
public class UpdateCredentialRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("credentialName")
    private String credentialName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateCredentialInput body;

    private UpdateCredentialRequest(Builder builder) {
        super(builder);
        this.credentialName = builder.credentialName;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCredentialRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return credentialName
     */
    public String getCredentialName() {
        return this.credentialName;
    }

    /**
     * @return body
     */
    public UpdateCredentialInput getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdateCredentialRequest, Builder> {
        private String credentialName; 
        private UpdateCredentialInput body; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCredentialRequest request) {
            super(request);
            this.credentialName = request.credentialName;
            this.body = request.body;
        } 

        /**
         * <p>credentialName</p>
         * 
         * <strong>example:</strong>
         * <p>credentialName</p>
         */
        public Builder credentialName(String credentialName) {
            this.putPathParameter("credentialName", credentialName);
            this.credentialName = credentialName;
            return this;
        }

        /**
         * body.
         */
        public Builder body(UpdateCredentialInput body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public UpdateCredentialRequest build() {
            return new UpdateCredentialRequest(this);
        } 

    } 

}
