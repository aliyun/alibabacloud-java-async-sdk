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
         * <p>Channel field</p>
         * 
         * <strong>example:</strong>
         * <p>ant</p>
         */
        public Builder channel(String channel) {
            this.putBodyParameter("Channel", channel);
            this.channel = channel;
            return this;
        }

        /**
         * <p>Checksum.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        public Builder checksum(String checksum) {
            this.putBodyParameter("Checksum", checksum);
            this.checksum = checksum;
            return this;
        }

        /**
         * <p>Code value</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.putBodyParameter("Code", code);
            this.code = code;
            return this;
        }

        /**
         * <p>Returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Result&quot;: [{&quot;Confidence&quot;: 100.0, &quot;CustomizedHit&quot;: [{&quot;KeyWords&quot;: u&quot;\u4fdd\u969c,\u6700\u5927,\u9ad8\u7ea7&quot;, &quot;LibName&quot;: u&quot;\u4f18\u8def\u654f\u611f\u8bcd&quot;}], &quot;Label&quot;: &quot;customized&quot;}]}</p>
         */
        public Builder data(String data) {
            this.putBodyParameter("Data", data);
            this.data = data;
            return this;
        }

        /**
         * <p>Message information</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder msg(String msg) {
            this.putBodyParameter("Msg", msg);
            this.msg = msg;
            return this;
        }

        /**
         * <p>Platform request ID, used for troubleshooting assistance</p>
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
        public ManualCallbackRequest build() {
            return new ManualCallbackRequest(this);
        } 

    } 

}
