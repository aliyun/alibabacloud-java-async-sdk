// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220302.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageResultExtRequest} extends {@link RequestModel}
 *
 * <p>DescribeImageResultExtRequest</p>
 */
public class DescribeImageResultExtRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InfoType")
    private String infoType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReqId")
    private String reqId;

    private DescribeImageResultExtRequest(Builder builder) {
        super(builder);
        this.infoType = builder.infoType;
        this.reqId = builder.reqId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageResultExtRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return infoType
     */
    public String getInfoType() {
        return this.infoType;
    }

    /**
     * @return reqId
     */
    public String getReqId() {
        return this.reqId;
    }

    public static final class Builder extends Request.Builder<DescribeImageResultExtRequest, Builder> {
        private String infoType; 
        private String reqId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeImageResultExtRequest request) {
            super(request);
            this.infoType = request.infoType;
            this.reqId = request.reqId;
        } 

        /**
         * The content of the information to be obtained. Multiple values are separated by commas.
         */
        public Builder infoType(String infoType) {
            this.putBodyParameter("InfoType", infoType);
            this.infoType = infoType;
            return this;
        }

        /**
         * The reqId field returned by the Url Async Moderation API.
         */
        public Builder reqId(String reqId) {
            this.putBodyParameter("ReqId", reqId);
            this.reqId = reqId;
            return this;
        }

        @Override
        public DescribeImageResultExtRequest build() {
            return new DescribeImageResultExtRequest(this);
        } 

    } 

}
