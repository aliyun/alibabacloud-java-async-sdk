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
 * {@link UpdateMediaConnectFlowOutputRequest} extends {@link RequestModel}
 *
 * <p>UpdateMediaConnectFlowOutputRequest</p>
 */
public class UpdateMediaConnectFlowOutputRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("OutputToUrl")
    private String outputToUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlayerLimit")
    private String playerLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrtLatency")
    private String srtLatency;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrtPassphrase")
    private String srtPassphrase;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrtPbkeyLen")
    private String srtPbkeyLen;

    private UpdateMediaConnectFlowOutputRequest(Builder builder) {
        super(builder);
        this.cidrs = builder.cidrs;
        this.flowId = builder.flowId;
        this.outputName = builder.outputName;
        this.outputToUrl = builder.outputToUrl;
        this.playerLimit = builder.playerLimit;
        this.srtLatency = builder.srtLatency;
        this.srtPassphrase = builder.srtPassphrase;
        this.srtPbkeyLen = builder.srtPbkeyLen;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMediaConnectFlowOutputRequest create() {
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
     * @return outputToUrl
     */
    public String getOutputToUrl() {
        return this.outputToUrl;
    }

    /**
     * @return playerLimit
     */
    public String getPlayerLimit() {
        return this.playerLimit;
    }

    /**
     * @return srtLatency
     */
    public String getSrtLatency() {
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

    public static final class Builder extends Request.Builder<UpdateMediaConnectFlowOutputRequest, Builder> {
        private String cidrs; 
        private String flowId; 
        private String outputName; 
        private String outputToUrl; 
        private String playerLimit; 
        private String srtLatency; 
        private String srtPassphrase; 
        private String srtPbkeyLen; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMediaConnectFlowOutputRequest request) {
            super(request);
            this.cidrs = request.cidrs;
            this.flowId = request.flowId;
            this.outputName = request.outputName;
            this.outputToUrl = request.outputToUrl;
            this.playerLimit = request.playerLimit;
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
         * <p>The output URL. You can modify this parameter only when the output type is RTMP-PUSH or SRT-Caller.</p>
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
         * <p>The maximum number of viewers.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder playerLimit(String playerLimit) {
            this.putQueryParameter("PlayerLimit", playerLimit);
            this.playerLimit = playerLimit;
            return this;
        }

        /**
         * <p>The latency for the SRT stream. You can modify this parameter only when the source type is SRT-Listener or SRT-Caller.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder srtLatency(String srtLatency) {
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
        public Builder srtPbkeyLen(String srtPbkeyLen) {
            this.putQueryParameter("SrtPbkeyLen", srtPbkeyLen);
            this.srtPbkeyLen = srtPbkeyLen;
            return this;
        }

        @Override
        public UpdateMediaConnectFlowOutputRequest build() {
            return new UpdateMediaConnectFlowOutputRequest(this);
        } 

    } 

}
