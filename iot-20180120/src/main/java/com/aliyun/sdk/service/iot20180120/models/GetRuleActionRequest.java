// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRuleActionRequest} extends {@link RequestModel}
 *
 * <p>GetRuleActionRequest</p>
 */
public class GetRuleActionRequest extends Request {
    @Query
    @NameInMap("ActionId")
    @Validation(required = true)
    private Long actionId;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    private GetRuleActionRequest(Builder builder) {
        super(builder);
        this.actionId = builder.actionId;
        this.iotInstanceId = builder.iotInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRuleActionRequest create() {
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

    public static final class Builder extends Request.Builder<GetRuleActionRequest, Builder> {
        private Long actionId; 
        private String iotInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetRuleActionRequest response) {
            super(response);
            this.actionId = response.actionId;
            this.iotInstanceId = response.iotInstanceId;
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
        public GetRuleActionRequest build() {
            return new GetRuleActionRequest(this);
        } 

    } 

}
