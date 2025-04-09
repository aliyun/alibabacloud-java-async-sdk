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
 * {@link DeleteContactBlockListRequest} extends {@link RequestModel}
 *
 * <p>DeleteContactBlockListRequest</p>
 */
public class DeleteContactBlockListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactBlockListId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contactBlockListId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Operator")
    private String operator;

    private DeleteContactBlockListRequest(Builder builder) {
        super(builder);
        this.contactBlockListId = builder.contactBlockListId;
        this.instanceId = builder.instanceId;
        this.operator = builder.operator;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteContactBlockListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactBlockListId
     */
    public String getContactBlockListId() {
        return this.contactBlockListId;
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

    public static final class Builder extends Request.Builder<DeleteContactBlockListRequest, Builder> {
        private String contactBlockListId; 
        private String instanceId; 
        private String operator; 

        private Builder() {
            super();
        } 

        private Builder(DeleteContactBlockListRequest request) {
            super(request);
            this.contactBlockListId = request.contactBlockListId;
            this.instanceId = request.instanceId;
            this.operator = request.operator;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c6320d3c-fa45-4011-b3b1-acdfabe3a8c6</p>
         */
        public Builder contactBlockListId(String contactBlockListId) {
            this.putQueryParameter("ContactBlockListId", contactBlockListId);
            this.contactBlockListId = contactBlockListId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c6320d3c-fa45-4011-b3b1-acdfabe3a8c6</p>
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
        public DeleteContactBlockListRequest build() {
            return new DeleteContactBlockListRequest(this);
        } 

    } 

}
