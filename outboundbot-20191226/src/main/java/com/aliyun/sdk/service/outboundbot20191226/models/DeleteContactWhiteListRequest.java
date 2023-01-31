// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteContactWhiteListRequest} extends {@link RequestModel}
 *
 * <p>DeleteContactWhiteListRequest</p>
 */
public class DeleteContactWhiteListRequest extends Request {
    @Query
    @NameInMap("ContactWhiteListId")
    @Validation(required = true)
    private String contactWhiteListId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Operator")
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
         * ContactWhiteListId.
         */
        public Builder contactWhiteListId(String contactWhiteListId) {
            this.putQueryParameter("ContactWhiteListId", contactWhiteListId);
            this.contactWhiteListId = contactWhiteListId;
            return this;
        }

        /**
         * InstanceId.
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
