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
 * {@link GetExecuteStateRequest} extends {@link RequestModel}
 *
 * <p>GetExecuteStateRequest</p>
 */
public class GetExecuteStateRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("stateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String stateId;

    private GetExecuteStateRequest(Builder builder) {
        super(builder);
        this.stateId = builder.stateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetExecuteStateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return stateId
     */
    public String getStateId() {
        return this.stateId;
    }

    public static final class Builder extends Request.Builder<GetExecuteStateRequest, Builder> {
        private String stateId; 

        private Builder() {
            super();
        } 

        private Builder(GetExecuteStateRequest request) {
            super(request);
            this.stateId = request.stateId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>task-xxxx</p>
         */
        public Builder stateId(String stateId) {
            this.putPathParameter("stateId", stateId);
            this.stateId = stateId;
            return this;
        }

        @Override
        public GetExecuteStateRequest build() {
            return new GetExecuteStateRequest(this);
        } 

    } 

}
