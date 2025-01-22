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
    private String flowId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputFromUrl")
    private String inputFromUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputName")
    private String inputName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputProtocol")
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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrtPbkeylen")
    private String srtPbkeylen;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrtPbkeyssen")
    private String srtPbkeyssen;

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
        this.srtPbkeylen = builder.srtPbkeylen;
        this.srtPbkeyssen = builder.srtPbkeyssen;
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

    /**
     * @return srtPbkeylen
     */
    public String getSrtPbkeylen() {
        return this.srtPbkeylen;
    }

    /**
     * @return srtPbkeyssen
     */
    public String getSrtPbkeyssen() {
        return this.srtPbkeyssen;
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
        private String srtPbkeylen; 
        private String srtPbkeyssen; 

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
            this.srtPbkeylen = request.srtPbkeylen;
            this.srtPbkeyssen = request.srtPbkeyssen;
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
         * InputFromUrl.
         */
        public Builder inputFromUrl(String inputFromUrl) {
            this.putQueryParameter("InputFromUrl", inputFromUrl);
            this.inputFromUrl = inputFromUrl;
            return this;
        }

        /**
         * InputName.
         */
        public Builder inputName(String inputName) {
            this.putQueryParameter("InputName", inputName);
            this.inputName = inputName;
            return this;
        }

        /**
         * InputProtocol.
         */
        public Builder inputProtocol(String inputProtocol) {
            this.putQueryParameter("InputProtocol", inputProtocol);
            this.inputProtocol = inputProtocol;
            return this;
        }

        /**
         * MaxBitrate.
         */
        public Builder maxBitrate(Integer maxBitrate) {
            this.putQueryParameter("MaxBitrate", maxBitrate);
            this.maxBitrate = maxBitrate;
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
         * PairOutputName.
         */
        public Builder pairOutputName(String pairOutputName) {
            this.putQueryParameter("PairOutputName", pairOutputName);
            this.pairOutputName = pairOutputName;
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

        /**
         * SrtPbkeylen.
         */
        public Builder srtPbkeylen(String srtPbkeylen) {
            this.putQueryParameter("SrtPbkeylen", srtPbkeylen);
            this.srtPbkeylen = srtPbkeylen;
            return this;
        }

        /**
         * SrtPbkeyssen.
         */
        public Builder srtPbkeyssen(String srtPbkeyssen) {
            this.putQueryParameter("SrtPbkeyssen", srtPbkeyssen);
            this.srtPbkeyssen = srtPbkeyssen;
            return this;
        }

        @Override
        public AddMediaConnectFlowInputRequest build() {
            return new AddMediaConnectFlowInputRequest(this);
        } 

    } 

}
