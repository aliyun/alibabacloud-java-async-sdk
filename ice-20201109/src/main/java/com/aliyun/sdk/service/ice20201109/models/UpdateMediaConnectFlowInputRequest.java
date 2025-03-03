// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link UpdateMediaConnectFlowInputRequest} extends {@link RequestModel}
 *
 * <p>UpdateMediaConnectFlowInputRequest</p>
 */
public class UpdateMediaConnectFlowInputRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cidrs")
    private String cidrs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlowId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String flowId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputFromUrl")
    private String inputFromUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxBitrate")
    private Integer maxBitrate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrtLatency")
    private Integer srtLatency;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrtPassphrase")
    private String srtPassphrase;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrtPbkeyLen")
    private Integer srtPbkeyLen;

    private UpdateMediaConnectFlowInputRequest(Builder builder) {
        super(builder);
        this.cidrs = builder.cidrs;
        this.flowId = builder.flowId;
        this.inputFromUrl = builder.inputFromUrl;
        this.maxBitrate = builder.maxBitrate;
        this.srtLatency = builder.srtLatency;
        this.srtPassphrase = builder.srtPassphrase;
        this.srtPbkeyLen = builder.srtPbkeyLen;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMediaConnectFlowInputRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cidrs
     */
    public String getCidrs() {
        return this.cidrs;
    }

    /**
     * @return flowId
     */
    public String getFlowId() {
        return this.flowId;
    }

    /**
     * @return inputFromUrl
     */
    public String getInputFromUrl() {
        return this.inputFromUrl;
    }

    /**
     * @return maxBitrate
     */
    public Integer getMaxBitrate() {
        return this.maxBitrate;
    }

    /**
     * @return srtLatency
     */
    public Integer getSrtLatency() {
        return this.srtLatency;
    }

    /**
     * @return srtPassphrase
     */
    public String getSrtPassphrase() {
        return this.srtPassphrase;
    }

    /**
     * @return srtPbkeyLen
     */
    public Integer getSrtPbkeyLen() {
        return this.srtPbkeyLen;
    }

    public static final class Builder extends Request.Builder<UpdateMediaConnectFlowInputRequest, Builder> {
        private String cidrs; 
        private String flowId; 
        private String inputFromUrl; 
        private Integer maxBitrate; 
        private Integer srtLatency; 
        private String srtPassphrase; 
        private Integer srtPbkeyLen; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMediaConnectFlowInputRequest request) {
            super(request);
            this.cidrs = request.cidrs;
            this.flowId = request.flowId;
            this.inputFromUrl = request.inputFromUrl;
            this.maxBitrate = request.maxBitrate;
            this.srtLatency = request.srtLatency;
            this.srtPassphrase = request.srtPassphrase;
            this.srtPbkeyLen = request.srtPbkeyLen;
        } 

        /**
         * <p>The IP address whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>19.168.1.1/32,18.168.1.1/16</p>
         */
        public Builder cidrs(String cidrs) {
            this.putQueryParameter("Cidrs", cidrs);
            this.cidrs = cidrs;
            return this;
        }

        /**
         * <p>The flow ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>34900dc6-90ec-4968-af3c-fcd87f231a5f</p>
         */
        public Builder flowId(String flowId) {
            this.putQueryParameter("FlowId", flowId);
            this.flowId = flowId;
            return this;
        }

        /**
         * <p>The source URL. You can modify this parameter only when the source type is RTMP-PULL or SRT-Listener.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp://pull.test.alivecdn.com/live/alitest</p>
         */
        public Builder inputFromUrl(String inputFromUrl) {
            this.putQueryParameter("InputFromUrl", inputFromUrl);
            this.inputFromUrl = inputFromUrl;
            return this;
        }

        /**
         * <p>The maximum bitrate. Unit: bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>2000000</p>
         */
        public Builder maxBitrate(Integer maxBitrate) {
            this.putQueryParameter("MaxBitrate", maxBitrate);
            this.maxBitrate = maxBitrate;
            return this;
        }

        /**
         * <p>The latency for the SRT stream. You can modify this parameter only when the source type is SRT-Listener or SRT-Caller.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder srtLatency(Integer srtLatency) {
            this.putQueryParameter("SrtLatency", srtLatency);
            this.srtLatency = srtLatency;
            return this;
        }

        /**
         * <p>The SRT key. You can modify this parameter only when the source type is SRT-Listener or SRT-Caller.</p>
         * 
         * <strong>example:</strong>
         * <p>FICUBPX4Q77DYHRF</p>
         */
        public Builder srtPassphrase(String srtPassphrase) {
            this.putQueryParameter("SrtPassphrase", srtPassphrase);
            this.srtPassphrase = srtPassphrase;
            return this;
        }

        /**
         * <p>The encryption key length. You can modify this parameter only when the source type is SRT-Listener or SRT-Caller.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        public Builder srtPbkeyLen(Integer srtPbkeyLen) {
            this.putQueryParameter("SrtPbkeyLen", srtPbkeyLen);
            this.srtPbkeyLen = srtPbkeyLen;
            return this;
        }

        @Override
        public UpdateMediaConnectFlowInputRequest build() {
            return new UpdateMediaConnectFlowInputRequest(this);
        } 

    } 

}
