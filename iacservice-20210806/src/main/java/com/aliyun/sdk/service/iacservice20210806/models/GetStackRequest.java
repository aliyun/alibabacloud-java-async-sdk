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
 * {@link GetStackRequest} extends {@link RequestModel}
 *
 * <p>GetStackRequest</p>
 */
public class GetStackRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("stackId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String stackId;

    private GetStackRequest(Builder builder) {
        super(builder);
        this.stackId = builder.stackId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStackRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return stackId
     */
    public String getStackId() {
        return this.stackId;
    }

    public static final class Builder extends Request.Builder<GetStackRequest, Builder> {
        private String stackId; 

        private Builder() {
            super();
        } 

        private Builder(GetStackRequest request) {
            super(request);
            this.stackId = request.stackId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>stack-as1d4vld898ppnqxxxxxx</p>
         */
        public Builder stackId(String stackId) {
            this.putPathParameter("stackId", stackId);
            this.stackId = stackId;
            return this;
        }

        @Override
        public GetStackRequest build() {
            return new GetStackRequest(this);
        } 

    } 

}
