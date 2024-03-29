// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220302.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageModerationResultRequest} extends {@link RequestModel}
 *
 * <p>DescribeImageModerationResultRequest</p>
 */
public class DescribeImageModerationResultRequest extends Request {
    @Query
    @NameInMap("ReqId")
    private String reqId;

    private DescribeImageModerationResultRequest(Builder builder) {
        super(builder);
        this.reqId = builder.reqId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageModerationResultRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeImageModerationResultRequest, Builder> {
        private String reqId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeImageModerationResultRequest request) {
            super(request);
            this.reqId = request.reqId;
        } 

        /**
         * ReqId.
         */
        public Builder reqId(String reqId) {
            this.putQueryParameter("ReqId", reqId);
            this.reqId = reqId;
            return this;
        }

        @Override
        public DescribeImageModerationResultRequest build() {
            return new DescribeImageModerationResultRequest(this);
        } 

    } 

}
