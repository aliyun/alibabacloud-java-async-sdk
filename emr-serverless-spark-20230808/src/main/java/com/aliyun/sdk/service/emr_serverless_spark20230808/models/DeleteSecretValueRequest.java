// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link DeleteSecretValueRequest} extends {@link RequestModel}
 *
 * <p>DeleteSecretValueRequest</p>
 */
public class DeleteSecretValueRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("secretId")
    private String secretId;

    private DeleteSecretValueRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.secretId = builder.secretId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSecretValueRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return secretId
     */
    public String getSecretId() {
        return this.secretId;
    }

    public static final class Builder extends Request.Builder<DeleteSecretValueRequest, Builder> {
        private String workspaceId; 
        private String secretId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSecretValueRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.secretId = request.secretId;
        } 

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>w-f3fecc838f69c486</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The ciphertext ID.</p>
         * 
         * <strong>example:</strong>
         * <p>st-xxxxxxxxxx</p>
         */
        public Builder secretId(String secretId) {
            this.putPathParameter("secretId", secretId);
            this.secretId = secretId;
            return this;
        }

        @Override
        public DeleteSecretValueRequest build() {
            return new DeleteSecretValueRequest(this);
        } 

    } 

}
