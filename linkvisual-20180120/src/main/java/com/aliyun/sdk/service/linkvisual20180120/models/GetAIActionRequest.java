// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAIActionRequest} extends {@link RequestModel}
 *
 * <p>GetAIActionRequest</p>
 */
public class GetAIActionRequest extends Request {
    @Query
    @NameInMap("ActionId")
    @Validation(required = true)
    private String actionId;

    private GetAIActionRequest(Builder builder) {
        super(builder);
        this.actionId = builder.actionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAIActionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionId
     */
    public String getActionId() {
        return this.actionId;
    }

    public static final class Builder extends Request.Builder<GetAIActionRequest, Builder> {
        private String actionId; 

        private Builder() {
            super();
        } 

        private Builder(GetAIActionRequest response) {
            super(response);
            this.actionId = response.actionId;
        } 

        /**
         * ActionId.
         */
        public Builder actionId(String actionId) {
            this.putQueryParameter("ActionId", actionId);
            this.actionId = actionId;
            return this;
        }

        @Override
        public GetAIActionRequest build() {
            return new GetAIActionRequest(this);
        } 

    } 

}
