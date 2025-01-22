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
    private String flowId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputName")
    private String outputName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputProtocol")
    private String outputProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputToUrl")
    private String outputToUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PairChannelId")
    private String pairChannelId;

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
        this.pairChannelId = builder.pairChannelId;
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
     * @return pairChannelId
     */
    public String getPairChannelId() {
        return this.pairChannelId;
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
        private String pairChannelId; 
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
            this.pairChannelId = request.pairChannelId;
            this.pairFlowId = request.pairFlowId;
            this.pairInputName = request.pairInputName;
            this.playerLimit = request.playerLimit;
            this.srtLatency = request.srtLatency;
            this.srtPassphrase = request.srtPassphrase;
            this.srtPbkeyLen = request.srtPbkeyLen;
        } 

        /**
         * Cidrs.
         */
        public Builder cidrs(String cidrs) {
            this.putQueryParameter("Cidrs", cidrs);
            this.cidrs = cidrs;
            return this;
        }

        /**
         * FlowId.
         */
        public Builder flowId(String flowId) {
            this.putQueryParameter("FlowId", flowId);
            this.flowId = flowId;
            return this;
        }

        /**
         * OutputName.
         */
        public Builder outputName(String outputName) {
            this.putQueryParameter("OutputName", outputName);
            this.outputName = outputName;
            return this;
        }

        /**
         * OutputProtocol.
         */
        public Builder outputProtocol(String outputProtocol) {
            this.putQueryParameter("OutputProtocol", outputProtocol);
            this.outputProtocol = outputProtocol;
            return this;
        }

        /**
         * OutputToUrl.
         */
        public Builder outputToUrl(String outputToUrl) {
            this.putQueryParameter("OutputToUrl", outputToUrl);
            this.outputToUrl = outputToUrl;
            return this;
        }

        /**
         * PairChannelId.
         */
        public Builder pairChannelId(String pairChannelId) {
            this.putQueryParameter("PairChannelId", pairChannelId);
            this.pairChannelId = pairChannelId;
            return this;
        }

        /**
         * PairFlowId.
         */
        public Builder pairFlowId(String pairFlowId) {
            this.putQueryParameter("PairFlowId", pairFlowId);
            this.pairFlowId = pairFlowId;
            return this;
        }

        /**
         * PairInputName.
         */
        public Builder pairInputName(String pairInputName) {
            this.putQueryParameter("PairInputName", pairInputName);
            this.pairInputName = pairInputName;
            return this;
        }

        /**
         * PlayerLimit.
         */
        public Builder playerLimit(Integer playerLimit) {
            this.putQueryParameter("PlayerLimit", playerLimit);
            this.playerLimit = playerLimit;
            return this;
        }

        /**
         * SrtLatency.
         */
        public Builder srtLatency(Integer srtLatency) {
            this.putQueryParameter("SrtLatency", srtLatency);
            this.srtLatency = srtLatency;
            return this;
        }

        /**
         * SrtPassphrase.
         */
        public Builder srtPassphrase(String srtPassphrase) {
            this.putQueryParameter("SrtPassphrase", srtPassphrase);
            this.srtPassphrase = srtPassphrase;
            return this;
        }

        /**
         * SrtPbkeyLen.
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
