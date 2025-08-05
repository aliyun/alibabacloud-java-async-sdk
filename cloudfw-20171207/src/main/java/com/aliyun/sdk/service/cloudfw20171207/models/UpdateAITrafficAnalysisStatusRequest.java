// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link UpdateAITrafficAnalysisStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateAITrafficAnalysisStatusRequest</p>
 */
public class UpdateAITrafficAnalysisStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private UpdateAITrafficAnalysisStatusRequest(Builder builder) {
        super(builder);
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAITrafficAnalysisStatusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<UpdateAITrafficAnalysisStatusRequest, Builder> {
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAITrafficAnalysisStatusRequest request) {
            super(request);
            this.status = request.status;
        } 

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public UpdateAITrafficAnalysisStatusRequest build() {
            return new UpdateAITrafficAnalysisStatusRequest(this);
        } 

    } 

}
