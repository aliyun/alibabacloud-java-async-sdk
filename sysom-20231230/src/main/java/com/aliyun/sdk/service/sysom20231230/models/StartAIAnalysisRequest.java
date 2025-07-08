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
    @com.aliyun.core.annotation.NameInMap("analysis_params")
    private java.util.List<String> analysisParams;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("channel")
    private String channel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("comms")
    private String comms;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("created_by")
    private String createdBy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("instance")
    private String instance;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("instance_type")
    private String instanceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("iteration_func")
    private String iterationFunc;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("iteration_mod")
    private String iterationMod;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("iteration_range")
    private java.util.List<Integer> iterationRange;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pids")
    private String pids;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("region")
    private String region;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("timeout")
    private Integer timeout;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("uid")
    private String uid;

    private StartAIAnalysisRequest(Builder builder) {
        super(builder);
        this.analysisTool = builder.analysisTool;
        this.analysisParams = builder.analysisParams;
        this.channel = builder.channel;
        this.comms = builder.comms;
        this.createdBy = builder.createdBy;
        this.instance = builder.instance;
        this.instanceType = builder.instanceType;
        this.iterationFunc = builder.iterationFunc;
        this.iterationMod = builder.iterationMod;
        this.iterationRange = builder.iterationRange;
        this.pids = builder.pids;
        this.region = builder.region;
        this.timeout = builder.timeout;
        this.uid = builder.uid;
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
     * @return analysisParams
     */
    public java.util.List<String> getAnalysisParams() {
        return this.analysisParams;
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
     * @return createdBy
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * @return instance
     */
    public String getInstance() {
        return this.instance;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return iterationFunc
     */
    public String getIterationFunc() {
        return this.iterationFunc;
    }

    /**
     * @return iterationMod
     */
    public String getIterationMod() {
        return this.iterationMod;
    }

    /**
     * @return iterationRange
     */
    public java.util.List<Integer> getIterationRange() {
        return this.iterationRange;
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

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<StartAIAnalysisRequest, Builder> {
        private String analysisTool; 
        private java.util.List<String> analysisParams; 
        private String channel; 
        private String comms; 
        private String createdBy; 
        private String instance; 
        private String instanceType; 
        private String iterationFunc; 
        private String iterationMod; 
        private java.util.List<Integer> iterationRange; 
        private String pids; 
        private String region; 
        private Integer timeout; 
        private String uid; 

        private Builder() {
            super();
        } 

        private Builder(StartAIAnalysisRequest request) {
            super(request);
            this.analysisTool = request.analysisTool;
            this.analysisParams = request.analysisParams;
            this.channel = request.channel;
            this.comms = request.comms;
            this.createdBy = request.createdBy;
            this.instance = request.instance;
            this.instanceType = request.instanceType;
            this.iterationFunc = request.iterationFunc;
            this.iterationMod = request.iterationMod;
            this.iterationRange = request.iterationRange;
            this.pids = request.pids;
            this.region = request.region;
            this.timeout = request.timeout;
            this.uid = request.uid;
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
         * analysis_params.
         */
        public Builder analysisParams(java.util.List<String> analysisParams) {
            this.putBodyParameter("analysis_params", analysisParams);
            this.analysisParams = analysisParams;
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
         * created_by.
         */
        public Builder createdBy(String createdBy) {
            this.putBodyParameter("created_by", createdBy);
            this.createdBy = createdBy;
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
         * instance_type.
         */
        public Builder instanceType(String instanceType) {
            this.putBodyParameter("instance_type", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * iteration_func.
         */
        public Builder iterationFunc(String iterationFunc) {
            this.putBodyParameter("iteration_func", iterationFunc);
            this.iterationFunc = iterationFunc;
            return this;
        }

        /**
         * iteration_mod.
         */
        public Builder iterationMod(String iterationMod) {
            this.putBodyParameter("iteration_mod", iterationMod);
            this.iterationMod = iterationMod;
            return this;
        }

        /**
         * iteration_range.
         */
        public Builder iterationRange(java.util.List<Integer> iterationRange) {
            this.putBodyParameter("iteration_range", iterationRange);
            this.iterationRange = iterationRange;
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

        /**
         * uid.
         */
        public Builder uid(String uid) {
            this.putBodyParameter("uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public StartAIAnalysisRequest build() {
            return new StartAIAnalysisRequest(this);
        } 

    } 

}
