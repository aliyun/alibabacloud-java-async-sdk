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
         * <p>The ReqId field returned by an asynchronous URL moderation operation.</p>
         * 
         * <strong>example:</strong>
         * <p>B0963D30-BAB4-562F-9ED0-7A23AEC51C7C</p>
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
