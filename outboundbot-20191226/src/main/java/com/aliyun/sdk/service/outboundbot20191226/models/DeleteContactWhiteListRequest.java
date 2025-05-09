// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link DeleteContactWhiteListRequest} extends {@link RequestModel}
 *
 * <p>DeleteContactWhiteListRequest</p>
 */
public class DeleteContactWhiteListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactWhiteListId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contactWhiteListId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Operator")
    private String operator;

    private DeleteContactWhiteListRequest(Builder builder) {
        super(builder);
        this.contactWhiteListId = builder.contactWhiteListId;
        this.instanceId = builder.instanceId;
        this.operator = builder.operator;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteContactWhiteListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactWhiteListId
     */
    public String getContactWhiteListId() {
        return this.contactWhiteListId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return operator
     */
    public String getOperator() {
        return this.operator;
    }

    public static final class Builder extends Request.Builder<DeleteContactWhiteListRequest, Builder> {
        private String contactWhiteListId; 
        private String instanceId; 
        private String operator; 

        private Builder() {
            super();
        } 

        private Builder(DeleteContactWhiteListRequest request) {
            super(request);
            this.contactWhiteListId = request.contactWhiteListId;
            this.instanceId = request.instanceId;
            this.operator = request.operator;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>111111</p>
         */
        public Builder contactWhiteListId(String contactWhiteListId) {
            this.putQueryParameter("ContactWhiteListId", contactWhiteListId);
            this.contactWhiteListId = contactWhiteListId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>af81a389-91f0-4157-8d82-720edd02b66a</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Operator.
         */
        public Builder operator(String operator) {
            this.putQueryParameter("Operator", operator);
            this.operator = operator;
            return this;
        }

        @Override
        public DeleteContactWhiteListRequest build() {
            return new DeleteContactWhiteListRequest(this);
        } 

    } 

}
