// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link StartAIAnalysisRequest} extends {@link RequestModel}
 *
 * <p>StartAIAnalysisRequest</p>
 */
public class StartAIAnalysisRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("analysisTool")
    private String analysisTool;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("channel")
    private String channel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("comms")
    private String comms;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("instance")
    private String instance;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pids")
    private String pids;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("region")
    private String region;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("timeout")
    private Integer timeout;

    private StartAIAnalysisRequest(Builder builder) {
        super(builder);
        this.analysisTool = builder.analysisTool;
        this.channel = builder.channel;
        this.comms = builder.comms;
        this.instance = builder.instance;
        this.pids = builder.pids;
        this.region = builder.region;
        this.timeout = builder.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartAIAnalysisRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return analysisTool
     */
    public String getAnalysisTool() {
        return this.analysisTool;
    }

    /**
     * @return channel
     */
    public String getChannel() {
        return this.channel;
    }

    /**
     * @return comms
     */
    public String getComms() {
        return this.comms;
    }

    /**
     * @return instance
     */
    public String getInstance() {
        return this.instance;
    }

    /**
     * @return pids
     */
    public String getPids() {
        return this.pids;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return timeout
     */
    public Integer getTimeout() {
        return this.timeout;
    }

    public static final class Builder extends Request.Builder<StartAIAnalysisRequest, Builder> {
        private String analysisTool; 
        private String channel; 
        private String comms; 
        private String instance; 
        private String pids; 
        private String region; 
        private Integer timeout; 

        private Builder() {
            super();
        } 

        private Builder(StartAIAnalysisRequest request) {
            super(request);
            this.analysisTool = request.analysisTool;
            this.channel = request.channel;
            this.comms = request.comms;
            this.instance = request.instance;
            this.pids = request.pids;
            this.region = request.region;
            this.timeout = request.timeout;
        } 

        /**
         * analysisTool.
         */
        public Builder analysisTool(String analysisTool) {
            this.putBodyParameter("analysisTool", analysisTool);
            this.analysisTool = analysisTool;
            return this;
        }

        /**
         * channel.
         */
        public Builder channel(String channel) {
            this.putBodyParameter("channel", channel);
            this.channel = channel;
            return this;
        }

        /**
         * comms.
         */
        public Builder comms(String comms) {
            this.putBodyParameter("comms", comms);
            this.comms = comms;
            return this;
        }

        /**
         * instance.
         */
        public Builder instance(String instance) {
            this.putBodyParameter("instance", instance);
            this.instance = instance;
            return this;
        }

        /**
         * pids.
         */
        public Builder pids(String pids) {
            this.putBodyParameter("pids", pids);
            this.pids = pids;
            return this;
        }

        /**
         * region.
         */
        public Builder region(String region) {
            this.putBodyParameter("region", region);
            this.region = region;
            return this;
        }

        /**
         * timeout.
         */
        public Builder timeout(Integer timeout) {
            this.putBodyParameter("timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        @Override
        public StartAIAnalysisRequest build() {
            return new StartAIAnalysisRequest(this);
        } 

    } 

}
