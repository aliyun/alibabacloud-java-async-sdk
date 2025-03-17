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
 * {@link AddMediaConnectFlowInputRequest} extends {@link RequestModel}
 *
 * <p>AddMediaConnectFlowInputRequest</p>
 */
public class AddMediaConnectFlowInputRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("InputName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String inputName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputProtocol")
    @com.aliyun.core.annotation.Validation(required = true)
    private String inputProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxBitrate")
    private Integer maxBitrate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PairFlowId")
    private String pairFlowId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PairOutputName")
    private String pairOutputName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrtLatency")
    private Integer srtLatency;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrtPassphrase")
    private String srtPassphrase;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrtPbkeyLen")
    private String srtPbkeyLen;

    private AddMediaConnectFlowInputRequest(Builder builder) {
        super(builder);
        this.cidrs = builder.cidrs;
        this.flowId = builder.flowId;
        this.inputFromUrl = builder.inputFromUrl;
        this.inputName = builder.inputName;
        this.inputProtocol = builder.inputProtocol;
        this.maxBitrate = builder.maxBitrate;
        this.pairFlowId = builder.pairFlowId;
        this.pairOutputName = builder.pairOutputName;
        this.srtLatency = builder.srtLatency;
        this.srtPassphrase = builder.srtPassphrase;
        this.srtPbkeyLen = builder.srtPbkeyLen;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddMediaConnectFlowInputRequest create() {
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
     * @return inputName
     */
    public String getInputName() {
        return this.inputName;
    }

    /**
     * @return inputProtocol
     */
    public String getInputProtocol() {
        return this.inputProtocol;
    }

    /**
     * @return maxBitrate
     */
    public Integer getMaxBitrate() {
        return this.maxBitrate;
    }

    /**
     * @return pairFlowId
     */
    public String getPairFlowId() {
        return this.pairFlowId;
    }

    /**
     * @return pairOutputName
     */
    public String getPairOutputName() {
        return this.pairOutputName;
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
    public String getSrtPbkeyLen() {
        return this.srtPbkeyLen;
    }

    public static final class Builder extends Request.Builder<AddMediaConnectFlowInputRequest, Builder> {
        private String cidrs; 
        private String flowId; 
        private String inputFromUrl; 
        private String inputName; 
        private String inputProtocol; 
        private Integer maxBitrate; 
        private String pairFlowId; 
        private String pairOutputName; 
        private Integer srtLatency; 
        private String srtPassphrase; 
        private String srtPbkeyLen; 

        private Builder() {
            super();
        } 

        private Builder(AddMediaConnectFlowInputRequest request) {
            super(request);
            this.cidrs = request.cidrs;
            this.flowId = request.flowId;
            this.inputFromUrl = request.inputFromUrl;
            this.inputName = request.inputName;
            this.inputProtocol = request.inputProtocol;
            this.maxBitrate = request.maxBitrate;
            this.pairFlowId = request.pairFlowId;
            this.pairOutputName = request.pairOutputName;
            this.srtLatency = request.srtLatency;
            this.srtPassphrase = request.srtPassphrase;
            this.srtPbkeyLen = request.srtPbkeyLen;
        } 

        /**
         * <p>The IP address whitelist in CIDR format. Separate multiple CIDR blocks with commas (,).</p>
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
         * <p>The source URL. This parameter is required when the source type is RTMP-PULL or SRT-Listener.</p>
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
         * <p>The source name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AliTestInput</p>
         */
        public Builder inputName(String inputName) {
            this.putQueryParameter("InputName", inputName);
            this.inputName = inputName;
            return this;
        }

        /**
         * <p>The source type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>RTMP-PUSH</li>
         * <li>SRT-Caller</li>
         * <li>RTMP-PULL</li>
         * <li>SRT-Listener</li>
         * <li>Flow</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RTMP-PUSH</p>
         */
        public Builder inputProtocol(String inputProtocol) {
            this.putQueryParameter("InputProtocol", inputProtocol);
            this.inputProtocol = inputProtocol;
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
         * <p>The ID of the source flow. This parameter is required when the source type is Flow.</p>
         * 
         * <strong>example:</strong>
         * <p>805fbdd0-575e-4146-b35d-ec7f63937b20</p>
         */
        public Builder pairFlowId(String pairFlowId) {
            this.putQueryParameter("PairFlowId", pairFlowId);
            this.pairFlowId = pairFlowId;
            return this;
        }

        /**
         * <p>The output of the source flow. This parameter is required when the source type is Flow.</p>
         * 
         * <strong>example:</strong>
         * <p>AliTestOutput</p>
         */
        public Builder pairOutputName(String pairOutputName) {
            this.putQueryParameter("PairOutputName", pairOutputName);
            this.pairOutputName = pairOutputName;
            return this;
        }

        /**
         * <p>The latency for the SRT stream. This parameter is required the source type is SRT-Listener or SRT-Caller.</p>
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
         * <p>The SRT key. This parameter is required when the source type is SRT-Listener or SRT-Caller.</p>
         * 
         * <strong>example:</strong>
         * <p>BETTERG08S01</p>
         */
        public Builder srtPassphrase(String srtPassphrase) {
            this.putQueryParameter("SrtPassphrase", srtPassphrase);
            this.srtPassphrase = srtPassphrase;
            return this;
        }

        /**
         * <p>The encryption key length. This parameter is required when the source type is SRT-Listener or SRT-Caller.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>0</li>
         * <li>16</li>
         * <li>24</li>
         * <li>32</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        public Builder srtPbkeyLen(String srtPbkeyLen) {
            this.putQueryParameter("SrtPbkeyLen", srtPbkeyLen);
            this.srtPbkeyLen = srtPbkeyLen;
            return this;
        }

        @Override
        public AddMediaConnectFlowInputRequest build() {
            return new AddMediaConnectFlowInputRequest(this);
        } 

    } 

}
