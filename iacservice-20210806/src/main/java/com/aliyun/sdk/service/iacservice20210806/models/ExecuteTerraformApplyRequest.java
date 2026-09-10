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
         * <p>The idempotency token. Format: [0-9a-zA-Z-]{1,64}. Use a UUID.</p>
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
         * <p>The Terraform code to execute. If the execution content has not changed, you can specify only stateId.</p>
         * 
         * <strong>example:</strong>
         * <p>terraform {
         *   required_providers {
         *     alicloud = {
         *       source   = &quot;aliyun/alicloud&quot;
         *       version  = &quot;1.254.0&quot;
         *     }
         *   }
         * }</p>
         * <p>resource &quot;alicloud_vpc&quot; &quot;default&quot; {
         *   is_default                                  = false
         *   enable_ipv6                                 = false
         *   classic_link_enabled                        = false
         *   force_delete                                = false
         *   system_route_table_route_propagation_enable = false
         *   dry_run                                     = false
         * }</p>
         */
        public Builder code(String code) {
            this.putBodyParameter("code", code);
            this.code = code;
            return this;
        }

        /**
         * <p>The state file ID. If this parameter is specified, the Apply command continues execution based on the existing state file.</p>
         * 
         * <strong>example:</strong>
         * <p>task-xxx</p>
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
