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
 * {@link ManualCallbackRequest} extends {@link RequestModel}
 *
 * <p>ManualCallbackRequest</p>
 */
public class ManualCallbackRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Channel")
    private String channel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Checksum")
    private String checksum;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Msg")
    private String msg;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReqId")
    private String reqId;

    private ManualCallbackRequest(Builder builder) {
        super(builder);
        this.channel = builder.channel;
        this.checksum = builder.checksum;
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
        this.reqId = builder.reqId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ManualCallbackRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channel
     */
    public String getChannel() {
        return this.channel;
    }

    /**
     * @return checksum
     */
    public String getChecksum() {
        return this.checksum;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    /**
     * @return reqId
     */
    public String getReqId() {
        return this.reqId;
    }

    public static final class Builder extends Request.Builder<ManualCallbackRequest, Builder> {
        private String channel; 
        private String checksum; 
        private String code; 
        private String data; 
        private String msg; 
        private String reqId; 

        private Builder() {
            super();
        } 

        private Builder(ManualCallbackRequest request) {
            super(request);
            this.channel = request.channel;
            this.checksum = request.checksum;
            this.code = request.code;
            this.data = request.data;
            this.msg = request.msg;
            this.reqId = request.reqId;
        } 

        /**
         * Channel.
         */
        public Builder channel(String channel) {
            this.putBodyParameter("Channel", channel);
            this.channel = channel;
            return this;
        }

        /**
         * Checksum.
         */
        public Builder checksum(String checksum) {
            this.putBodyParameter("Checksum", checksum);
            this.checksum = checksum;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.putBodyParameter("Code", code);
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(String data) {
            this.putBodyParameter("Data", data);
            this.data = data;
            return this;
        }

        /**
         * Msg.
         */
        public Builder msg(String msg) {
            this.putBodyParameter("Msg", msg);
            this.msg = msg;
            return this;
        }

        /**
         * ReqId.
         */
        public Builder reqId(String reqId) {
            this.putBodyParameter("ReqId", reqId);
            this.reqId = reqId;
            return this;
        }

        @Override
        public ManualCallbackRequest build() {
            return new ManualCallbackRequest(this);
        } 

    } 

}
