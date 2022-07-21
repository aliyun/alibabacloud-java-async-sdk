// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRuleActionRequest} extends {@link RequestModel}
 *
 * <p>DeleteRuleActionRequest</p>
 */
public class DeleteRuleActionRequest extends Request {
    @Query
    @NameInMap("ActionId")
    @Validation(required = true)
    private Long actionId;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    private DeleteRuleActionRequest(Builder builder) {
        super(builder);
        this.actionId = builder.actionId;
        this.iotInstanceId = builder.iotInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRuleActionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionId
     */
    public Long getActionId() {
        return this.actionId;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public static final class Builder extends Request.Builder<DeleteRuleActionRequest, Builder> {
        private Long actionId; 
        private String iotInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRuleActionRequest request) {
            super(request);
            this.actionId = request.actionId;
            this.iotInstanceId = request.iotInstanceId;
        } 

        /**
         * ActionId.
         */
        public Builder actionId(Long actionId) {
            this.putQueryParameter("ActionId", actionId);
            this.actionId = actionId;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        @Override
        public DeleteRuleActionRequest build() {
            return new DeleteRuleActionRequest(this);
        } 

    } 

}
