// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteFCTriggerRequest} extends {@link RequestModel}
 *
 * <p>DeleteFCTriggerRequest</p>
 */
public class DeleteFCTriggerRequest extends Request {
    @Query
    @NameInMap("TriggerARN")
    @Validation(required = true)
    private String triggerARN;

    private DeleteFCTriggerRequest(Builder builder) {
        super(builder);
        this.triggerARN = builder.triggerARN;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteFCTriggerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return triggerARN
     */
    public String getTriggerARN() {
        return this.triggerARN;
    }

    public static final class Builder extends Request.Builder<DeleteFCTriggerRequest, Builder> {
        private String triggerARN; 

        private Builder() {
            super();
        } 

        private Builder(DeleteFCTriggerRequest request) {
            super(request);
            this.triggerARN = request.triggerARN;
        } 

        /**
         * The trigger that corresponds to the Function Compute service.
         */
        public Builder triggerARN(String triggerARN) {
            this.putQueryParameter("TriggerARN", triggerARN);
            this.triggerARN = triggerARN;
            return this;
        }

        @Override
        public DeleteFCTriggerRequest build() {
            return new DeleteFCTriggerRequest(this);
        } 

    } 

}
