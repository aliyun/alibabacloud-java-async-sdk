// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link GetLogicalModelRequest} extends {@link RequestModel}
 *
 * <p>GetLogicalModelRequest</p>
 */
public class GetLogicalModelRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("logicalModelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logicalModelId;

    private GetLogicalModelRequest(Builder builder) {
        super(builder);
        this.logicalModelId = builder.logicalModelId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLogicalModelRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return logicalModelId
     */
    public String getLogicalModelId() {
        return this.logicalModelId;
    }

    public static final class Builder extends Request.Builder<GetLogicalModelRequest, Builder> {
        private String logicalModelId; 

        private Builder() {
            super();
        } 

        private Builder(GetLogicalModelRequest request) {
            super(request);
            this.logicalModelId = request.logicalModelId;
        } 

        /**
         * <p>The ID of the logical model. Use the vm- identifier returned by the API operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vm-d00000000000000000000</p>
         */
        public Builder logicalModelId(String logicalModelId) {
            this.putPathParameter("logicalModelId", logicalModelId);
            this.logicalModelId = logicalModelId;
            return this;
        }

        @Override
        public GetLogicalModelRequest build() {
            return new GetLogicalModelRequest(this);
        } 

    } 

}
