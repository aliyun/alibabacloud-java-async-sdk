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
 * {@link AddMediaConnectFlowOutputRequest} extends {@link RequestModel}
 *
 * <p>AddMediaConnectFlowOutputRequest</p>
 */
public class AddMediaConnectFlowOutputRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cidrs")
    private String cidrs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlowId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String flowId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outputName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputProtocol")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outputProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputToUrl")
    private String outputToUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PairFlowId")
    private String pairFlowId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PairInputName")
    private String pairInputName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlayerLimit")
    private Integer playerLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrtLatency")
    private Integer srtLatency;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrtPassphrase")
    private String srtPassphrase;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrtPbkeyLen")
    private String srtPbkeyLen;

    private AddMediaConnectFlowOutputRequest(Builder builder) {
        super(builder);
        this.cidrs = builder.cidrs;
        this.flowId = builder.flowId;
        this.outputName = builder.outputName;
        this.outputProtocol = builder.outputProtocol;
        this.outputToUrl = builder.outputToUrl;
        this.pairFlowId = builder.pairFlowId;
        this.pairInputName = builder.pairInputName;
        this.playerLimit = builder.playerLimit;
        this.srtLatency = builder.srtLatency;
        this.srtPassphrase = builder.srtPassphrase;
        this.srtPbkeyLen = builder.srtPbkeyLen;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddMediaConnectFlowOutputRequest create() {
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
     * @return outputName
     */
    public String getOutputName() {
        return this.outputName;
    }

    /**
     * @return outputProtocol
     */
    public String getOutputProtocol() {
        return this.outputProtocol;
    }

    /**
     * @return outputToUrl
     */
    public String getOutputToUrl() {
        return this.outputToUrl;
    }

    /**
     * @return pairFlowId
     */
    public String getPairFlowId() {
        return this.pairFlowId;
    }

    /**
     * @return pairInputName
     */
    public String getPairInputName() {
        return this.pairInputName;
    }

    /**
     * @return playerLimit
     */
    public Integer getPlayerLimit() {
        return this.playerLimit;
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

    public static final class Builder extends Request.Builder<AddMediaConnectFlowOutputRequest, Builder> {
        private String cidrs; 
        private String flowId; 
        private String outputName; 
        private String outputProtocol; 
        private String outputToUrl; 
        private String pairFlowId; 
        private String pairInputName; 
        private Integer playerLimit; 
        private Integer srtLatency; 
        private String srtPassphrase; 
        private String srtPbkeyLen; 

        private Builder() {
            super();
        } 

        private Builder(AddMediaConnectFlowOutputRequest request) {
            super(request);
            this.cidrs = request.cidrs;
            this.flowId = request.flowId;
            this.outputName = request.outputName;
            this.outputProtocol = request.outputProtocol;
            this.outputToUrl = request.outputToUrl;
            this.pairFlowId = request.pairFlowId;
            this.pairInputName = request.pairInputName;
            this.playerLimit = request.playerLimit;
            this.srtLatency = request.srtLatency;
            this.srtPassphrase = request.srtPassphrase;
            this.srtPbkeyLen = request.srtPbkeyLen;
        } 

        /**
         * <p>The IP address whitelist in CIDR format. Separate multiple CIDR blocks with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>83.17.231.31/32</p>
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
         * <p>The output name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AliTestOutput</p>
         */
        public Builder outputName(String outputName) {
            this.putQueryParameter("OutputName", outputName);
            this.outputName = outputName;
            return this;
        }

        /**
         * <p>The output type.</p>
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
         * <p>RTMP-PULL</p>
         */
        public Builder outputProtocol(String outputProtocol) {
            this.putQueryParameter("OutputProtocol", outputProtocol);
            this.outputProtocol = outputProtocol;
            return this;
        }

        /**
         * <p>The output URL. This parameter is required when OutputProtocol is set to RTMP-PUSH or SRT-Caller.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp://push.test.alivecdn.com/live/alitest</p>
         */
        public Builder outputToUrl(String outputToUrl) {
            this.putQueryParameter("OutputToUrl", outputToUrl);
            this.outputToUrl = outputToUrl;
            return this;
        }

        /**
         * <p>The ID of the destination flow. This parameter is required when OutputProtocol is set to Flow.</p>
         * 
         * <strong>example:</strong>
         * <p>8666ec062190f00e263012666319a5be</p>
         */
        public Builder pairFlowId(String pairFlowId) {
            this.putQueryParameter("PairFlowId", pairFlowId);
            this.pairFlowId = pairFlowId;
            return this;
        }

        /**
         * <p>The source name of the destination flow. This parameter is required when OutputProtocol is set to Flow.</p>
         * 
         * <strong>example:</strong>
         * <p>AliTestInput</p>
         */
        public Builder pairInputName(String pairInputName) {
            this.putQueryParameter("PairInputName", pairInputName);
            this.pairInputName = pairInputName;
            return this;
        }

        /**
         * <p>The maximum number of viewers.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder playerLimit(Integer playerLimit) {
            this.putQueryParameter("PlayerLimit", playerLimit);
            this.playerLimit = playerLimit;
            return this;
        }

        /**
         * <p>The latency for the SRT stream. This parameter is required when the source type is SRT-Listener or SRT-Caller.</p>
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
        public AddMediaConnectFlowOutputRequest build() {
            return new AddMediaConnectFlowOutputRequest(this);
        } 

    } 

}
