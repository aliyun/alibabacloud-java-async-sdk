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
         * <p>The type of information to obtain. Multiple values are separated by commas. Valid values:</p>
         * <ul>
         * <li><p>customImage: custom image library hit information</p>
         * </li>
         * <li><p>textInImage: text information in the image</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>customImage,textInImage</p>
         */
        public Builder infoType(String infoType) {
            this.putBodyParameter("InfoType", infoType);
            this.infoType = infoType;
            return this;
        }

        /**
         * <p>The requestId field returned by the enhanced image moderation API</p>
         * 
         * <strong>example:</strong>
         * <p>638EDDC65C82AB39319A9F60</p>
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
