// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDBClusterServerlessConfResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterServerlessConfResponseBody</p>
 */
public class DescribeDBClusterServerlessConfResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AgileScaleMax")
    private String agileScaleMax;

    @com.aliyun.core.annotation.NameInMap("AllowShutDown")
    private String allowShutDown;

    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScaleApRoNumMax")
    private String scaleApRoNumMax;

    @com.aliyun.core.annotation.NameInMap("ScaleApRoNumMin")
    private String scaleApRoNumMin;

    @com.aliyun.core.annotation.NameInMap("ScaleMax")
    private String scaleMax;

    @com.aliyun.core.annotation.NameInMap("ScaleMin")
    private String scaleMin;

    @com.aliyun.core.annotation.NameInMap("ScaleRoNumMax")
    private String scaleRoNumMax;

    @com.aliyun.core.annotation.NameInMap("ScaleRoNumMin")
    private String scaleRoNumMin;

    @com.aliyun.core.annotation.NameInMap("SecondsUntilAutoPause")
    private String secondsUntilAutoPause;

    @com.aliyun.core.annotation.NameInMap("ServerlessRuleCpuEnlargeThreshold")
    private String serverlessRuleCpuEnlargeThreshold;

    @com.aliyun.core.annotation.NameInMap("ServerlessRuleCpuShrinkThreshold")
    private String serverlessRuleCpuShrinkThreshold;

    @com.aliyun.core.annotation.NameInMap("ServerlessRuleMode")
    private String serverlessRuleMode;

    @com.aliyun.core.annotation.NameInMap("Switchs")
    private String switchs;

    @com.aliyun.core.annotation.NameInMap("TraditionalScaleMaxThreshold")
    private String traditionalScaleMaxThreshold;

    private DescribeDBClusterServerlessConfResponseBody(Builder builder) {
        this.agileScaleMax = builder.agileScaleMax;
        this.allowShutDown = builder.allowShutDown;
        this.DBClusterId = builder.DBClusterId;
        this.requestId = builder.requestId;
        this.scaleApRoNumMax = builder.scaleApRoNumMax;
        this.scaleApRoNumMin = builder.scaleApRoNumMin;
        this.scaleMax = builder.scaleMax;
        this.scaleMin = builder.scaleMin;
        this.scaleRoNumMax = builder.scaleRoNumMax;
        this.scaleRoNumMin = builder.scaleRoNumMin;
        this.secondsUntilAutoPause = builder.secondsUntilAutoPause;
        this.serverlessRuleCpuEnlargeThreshold = builder.serverlessRuleCpuEnlargeThreshold;
        this.serverlessRuleCpuShrinkThreshold = builder.serverlessRuleCpuShrinkThreshold;
        this.serverlessRuleMode = builder.serverlessRuleMode;
        this.switchs = builder.switchs;
        this.traditionalScaleMaxThreshold = builder.traditionalScaleMaxThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClusterServerlessConfResponseBody create() {
        return builder().build();
    }

    /**
     * @return agileScaleMax
     */
    public String getAgileScaleMax() {
        return this.agileScaleMax;
    }

    /**
     * @return allowShutDown
     */
    public String getAllowShutDown() {
        return this.allowShutDown;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scaleApRoNumMax
     */
    public String getScaleApRoNumMax() {
        return this.scaleApRoNumMax;
    }

    /**
     * @return scaleApRoNumMin
     */
    public String getScaleApRoNumMin() {
        return this.scaleApRoNumMin;
    }

    /**
     * @return scaleMax
     */
    public String getScaleMax() {
        return this.scaleMax;
    }

    /**
     * @return scaleMin
     */
    public String getScaleMin() {
        return this.scaleMin;
    }

    /**
     * @return scaleRoNumMax
     */
    public String getScaleRoNumMax() {
        return this.scaleRoNumMax;
    }

    /**
     * @return scaleRoNumMin
     */
    public String getScaleRoNumMin() {
        return this.scaleRoNumMin;
    }

    /**
     * @return secondsUntilAutoPause
     */
    public String getSecondsUntilAutoPause() {
        return this.secondsUntilAutoPause;
    }

    /**
     * @return serverlessRuleCpuEnlargeThreshold
     */
    public String getServerlessRuleCpuEnlargeThreshold() {
        return this.serverlessRuleCpuEnlargeThreshold;
    }

    /**
     * @return serverlessRuleCpuShrinkThreshold
     */
    public String getServerlessRuleCpuShrinkThreshold() {
        return this.serverlessRuleCpuShrinkThreshold;
    }

    /**
     * @return serverlessRuleMode
     */
    public String getServerlessRuleMode() {
        return this.serverlessRuleMode;
    }

    /**
     * @return switchs
     */
    public String getSwitchs() {
        return this.switchs;
    }

    /**
     * @return traditionalScaleMaxThreshold
     */
    public String getTraditionalScaleMaxThreshold() {
        return this.traditionalScaleMaxThreshold;
    }

    public static final class Builder {
        private String agileScaleMax; 
        private String allowShutDown; 
        private String DBClusterId; 
        private String requestId; 
        private String scaleApRoNumMax; 
        private String scaleApRoNumMin; 
        private String scaleMax; 
        private String scaleMin; 
        private String scaleRoNumMax; 
        private String scaleRoNumMin; 
        private String secondsUntilAutoPause; 
        private String serverlessRuleCpuEnlargeThreshold; 
        private String serverlessRuleCpuShrinkThreshold; 
        private String serverlessRuleMode; 
        private String switchs; 
        private String traditionalScaleMaxThreshold; 

        /**
         * AgileScaleMax.
         */
        public Builder agileScaleMax(String agileScaleMax) {
            this.agileScaleMax = agileScaleMax;
            return this;
        }

        /**
         * <p>Indicates whether the no-activity suspension feature is enabled. Default value: false. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder allowShutDown(String allowShutDown) {
            this.allowShutDown = allowShutDown;
            return this;
        }

        /**
         * <p>The ID of the serverless cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-bp10gr51qasnl****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>5E71541A-6007-4DCC-A38A-F872C31FEB45</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ScaleApRoNumMax.
         */
        public Builder scaleApRoNumMax(String scaleApRoNumMax) {
            this.scaleApRoNumMax = scaleApRoNumMax;
            return this;
        }

        /**
         * ScaleApRoNumMin.
         */
        public Builder scaleApRoNumMin(String scaleApRoNumMin) {
            this.scaleApRoNumMin = scaleApRoNumMin;
            return this;
        }

        /**
         * <p>The maximum number of PCUs per node for scaling. Valid values: 1 PCU to 32 PCUs.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder scaleMax(String scaleMax) {
            this.scaleMax = scaleMax;
            return this;
        }

        /**
         * <p>The minimum number of PCUs per node for scaling. Valid values: 1 PCU to 31 PCUs.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder scaleMin(String scaleMin) {
            this.scaleMin = scaleMin;
            return this;
        }

        /**
         * <p>The maximum number of read-only nodes for scaling. Valid values: 0 to 15.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder scaleRoNumMax(String scaleRoNumMax) {
            this.scaleRoNumMax = scaleRoNumMax;
            return this;
        }

        /**
         * <p>The minimum number of read-only nodes for scaling. Valid values: 0 to 15.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder scaleRoNumMin(String scaleRoNumMin) {
            this.scaleRoNumMin = scaleRoNumMin;
            return this;
        }

        /**
         * <p>The detection period for no-activity suspension. Valid values: 300 to 86400. Unit: seconds. The value must be a multiple of 300.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder secondsUntilAutoPause(String secondsUntilAutoPause) {
            this.secondsUntilAutoPause = secondsUntilAutoPause;
            return this;
        }

        /**
         * ServerlessRuleCpuEnlargeThreshold.
         */
        public Builder serverlessRuleCpuEnlargeThreshold(String serverlessRuleCpuEnlargeThreshold) {
            this.serverlessRuleCpuEnlargeThreshold = serverlessRuleCpuEnlargeThreshold;
            return this;
        }

        /**
         * ServerlessRuleCpuShrinkThreshold.
         */
        public Builder serverlessRuleCpuShrinkThreshold(String serverlessRuleCpuShrinkThreshold) {
            this.serverlessRuleCpuShrinkThreshold = serverlessRuleCpuShrinkThreshold;
            return this;
        }

        /**
         * ServerlessRuleMode.
         */
        public Builder serverlessRuleMode(String serverlessRuleMode) {
            this.serverlessRuleMode = serverlessRuleMode;
            return this;
        }

        /**
         * Switchs.
         */
        public Builder switchs(String switchs) {
            this.switchs = switchs;
            return this;
        }

        /**
         * TraditionalScaleMaxThreshold.
         */
        public Builder traditionalScaleMaxThreshold(String traditionalScaleMaxThreshold) {
            this.traditionalScaleMaxThreshold = traditionalScaleMaxThreshold;
            return this;
        }

        public DescribeDBClusterServerlessConfResponseBody build() {
            return new DescribeDBClusterServerlessConfResponseBody(this);
        } 

    } 

}
