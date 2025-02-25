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
 * {@link DeleteEnvironmentRequest} extends {@link RequestModel}
 *
 * <p>DeleteEnvironmentRequest</p>
 */
public class DeleteEnvironmentRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("environmentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String environmentId;

    private DeleteEnvironmentRequest(Builder builder) {
        super(builder);
        this.environmentId = builder.environmentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEnvironmentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return environmentId
     */
    public String getEnvironmentId() {
        return this.environmentId;
    }

    public static final class Builder extends Request.Builder<DeleteEnvironmentRequest, Builder> {
        private String environmentId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEnvironmentRequest request) {
            super(request);
            this.environmentId = request.environmentId;
        } 

        /**
         * <p>Environment ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>env-cq7l5s5lhtgi6qasrdc0</p>
         */
        public Builder environmentId(String environmentId) {
            this.putPathParameter("environmentId", environmentId);
            this.environmentId = environmentId;
            return this;
        }

        @Override
        public DeleteEnvironmentRequest build() {
            return new DeleteEnvironmentRequest(this);
        } 

    } 

}
