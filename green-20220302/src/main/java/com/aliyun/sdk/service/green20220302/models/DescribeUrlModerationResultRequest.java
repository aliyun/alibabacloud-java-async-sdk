// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220302.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUrlModerationResultRequest} extends {@link RequestModel}
 *
 * <p>DescribeUrlModerationResultRequest</p>
 */
public class DescribeUrlModerationResultRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReqId")
    private String reqId;

    private DescribeUrlModerationResultRequest(Builder builder) {
        super(builder);
        this.reqId = builder.reqId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUrlModerationResultRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeUrlModerationResultRequest, Builder> {
        private String reqId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUrlModerationResultRequest request) {
            super(request);
            this.reqId = request.reqId;
        } 

        /**
         * The ReqId field returned by an asynchronous URL moderation operation.
         */
        public Builder reqId(String reqId) {
            this.putBodyParameter("ReqId", reqId);
            this.reqId = reqId;
            return this;
        }

        @Override
        public DescribeUrlModerationResultRequest build() {
            return new DescribeUrlModerationResultRequest(this);
        } 

    } 

}
