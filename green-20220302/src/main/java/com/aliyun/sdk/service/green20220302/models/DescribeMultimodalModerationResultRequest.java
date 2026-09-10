// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220302.models;

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
 * {@link DescribeMultimodalModerationResultRequest} extends {@link RequestModel}
 *
 * <p>DescribeMultimodalModerationResultRequest</p>
 */
public class DescribeMultimodalModerationResultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReqId")
    private String reqId;

    private DescribeMultimodalModerationResultRequest(Builder builder) {
        super(builder);
        this.reqId = builder.reqId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMultimodalModerationResultRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return reqId
     */
    public String getReqId() {
        return this.reqId;
    }

    public static final class Builder extends Request.Builder<DescribeMultimodalModerationResultRequest, Builder> {
        private String reqId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMultimodalModerationResultRequest request) {
            super(request);
            this.reqId = request.reqId;
        } 

        /**
         * <p>The ReqId field returned by the asynchronous moderation API.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAA-BBBBB-AIXI-1314-CCCCC</p>
         */
        public Builder reqId(String reqId) {
            this.putQueryParameter("ReqId", reqId);
            this.reqId = reqId;
            return this;
        }

        @Override
        public DescribeMultimodalModerationResultRequest build() {
            return new DescribeMultimodalModerationResultRequest(this);
        } 

    } 

}
