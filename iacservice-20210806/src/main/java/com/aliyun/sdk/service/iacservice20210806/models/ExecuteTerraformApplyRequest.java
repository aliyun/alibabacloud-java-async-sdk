// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link ExecuteTerraformApplyRequest} extends {@link RequestModel}
 *
 * <p>ExecuteTerraformApplyRequest</p>
 */
public class ExecuteTerraformApplyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("stateId")
    private String stateId;

    private ExecuteTerraformApplyRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.code = builder.code;
        this.stateId = builder.stateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteTerraformApplyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return stateId
     */
    public String getStateId() {
        return this.stateId;
    }

    public static final class Builder extends Request.Builder<ExecuteTerraformApplyRequest, Builder> {
        private String clientToken; 
        private String code; 
        private String stateId; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteTerraformApplyRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.code = request.code;
            this.stateId = request.stateId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a65451293e64979ba7a4b573950217fe</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * code.
         */
        public Builder code(String code) {
            this.putBodyParameter("code", code);
            this.code = code;
            return this;
        }

        /**
         * stateId.
         */
        public Builder stateId(String stateId) {
            this.putBodyParameter("stateId", stateId);
            this.stateId = stateId;
            return this;
        }

        @Override
        public ExecuteTerraformApplyRequest build() {
            return new ExecuteTerraformApplyRequest(this);
        } 

    } 

}
