// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link UpdateSecretRequest} extends {@link RequestModel}
 *
 * <p>UpdateSecretRequest</p>
 */
public class UpdateSecretRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("secretId")
    private String secretId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("secretData")
    private String secretData;

    private UpdateSecretRequest(Builder builder) {
        super(builder);
        this.secretId = builder.secretId;
        this.secretData = builder.secretData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSecretRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return secretId
     */
    public String getSecretId() {
        return this.secretId;
    }

    /**
     * @return secretData
     */
    public String getSecretData() {
        return this.secretData;
    }

    public static final class Builder extends Request.Builder<UpdateSecretRequest, Builder> {
        private String secretId; 
        private String secretData; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSecretRequest request) {
            super(request);
            this.secretId = request.secretId;
            this.secretData = request.secretData;
        } 

        /**
         * secretId.
         */
        public Builder secretId(String secretId) {
            this.putPathParameter("secretId", secretId);
            this.secretId = secretId;
            return this;
        }

        /**
         * secretData.
         */
        public Builder secretData(String secretData) {
            this.putBodyParameter("secretData", secretData);
            this.secretData = secretData;
            return this;
        }

        @Override
        public UpdateSecretRequest build() {
            return new UpdateSecretRequest(this);
        } 

    } 

}
