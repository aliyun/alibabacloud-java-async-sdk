// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeDBClusterServerlessConfResponseBody model) {
            this.agileScaleMax = model.agileScaleMax;
            this.allowShutDown = model.allowShutDown;
            this.DBClusterId = model.DBClusterId;
            this.requestId = model.requestId;
            this.scaleApRoNumMax = model.scaleApRoNumMax;
            this.scaleApRoNumMin = model.scaleApRoNumMin;
            this.scaleMax = model.scaleMax;
            this.scaleMin = model.scaleMin;
            this.scaleRoNumMax = model.scaleRoNumMax;
            this.scaleRoNumMin = model.scaleRoNumMin;
            this.secondsUntilAutoPause = model.secondsUntilAutoPause;
            this.serverlessRuleCpuEnlargeThreshold = model.serverlessRuleCpuEnlargeThreshold;
            this.serverlessRuleCpuShrinkThreshold = model.serverlessRuleCpuShrinkThreshold;
            this.serverlessRuleMode = model.serverlessRuleMode;
            this.switchs = model.switchs;
            this.traditionalScaleMaxThreshold = model.traditionalScaleMaxThreshold;
        } 

        /**
         * <p>The maximum capacity, in PCUs, for a cluster in agile mode. In agile mode, the cluster consists of only serverless nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        public Builder agileScaleMax(String agileScaleMax) {
            this.agileScaleMax = agileScaleMax;
            return this;
        }

        /**
         * <p>Indicates whether the no-activity suspension feature is enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Enabled</p>
         * </li>
         * <li><p><strong>false</strong>: Disabled (Default)</p>
         * </li>
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5E71541A-6007-4DCC-A38A-F872C31FEB45</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The maximum number of read-only column store nodes. Valid values: 0 to 15.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder scaleApRoNumMax(String scaleApRoNumMax) {
            this.scaleApRoNumMax = scaleApRoNumMax;
            return this;
        }

        /**
         * <p>The minimum number of read-only column store nodes. Valid values: 0 to 15.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder scaleApRoNumMin(String scaleApRoNumMin) {
            this.scaleApRoNumMin = scaleApRoNumMin;
            return this;
        }

        /**
         * <p>The maximum compute capacity of a single node in PCUs. Valid values: 1 to 32.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder scaleMax(String scaleMax) {
            this.scaleMax = scaleMax;
            return this;
        }

        /**
         * <p>The minimum compute capacity of a single node in PolarDB Capacity Units (PCUs). Valid values: 1 to 31.</p>
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
         * <p>The detection period for no-activity suspension, in seconds. The value must be an integer from 300 to 86,400 and must be a multiple of 300.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder secondsUntilAutoPause(String secondsUntilAutoPause) {
            this.secondsUntilAutoPause = secondsUntilAutoPause;
            return this;
        }

        /**
         * <p>The CPU scale-up threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder serverlessRuleCpuEnlargeThreshold(String serverlessRuleCpuEnlargeThreshold) {
            this.serverlessRuleCpuEnlargeThreshold = serverlessRuleCpuEnlargeThreshold;
            return this;
        }

        /**
         * <p>The CPU scale-down threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder serverlessRuleCpuShrinkThreshold(String serverlessRuleCpuShrinkThreshold) {
            this.serverlessRuleCpuShrinkThreshold = serverlessRuleCpuShrinkThreshold;
            return this;
        }

        /**
         * <p>The elasticity sensitivity. Valid values:</p>
         * <ul>
         * <li><p>normal: Standard</p>
         * </li>
         * <li><p>flexible: Flexible</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        public Builder serverlessRuleMode(String serverlessRuleMode) {
            this.serverlessRuleMode = serverlessRuleMode;
            return this;
        }

        /**
         * <p>Indicates whether the steady-state mode is enabled. Valid values:</p>
         * <p>1: Enabled</p>
         * <p>0: Disabled</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder switchs(String switchs) {
            this.switchs = switchs;
            return this;
        }

        /**
         * <p>The maximum capacity, in PCUs, for a cluster in steady-state mode. Steady-state mode adds serverless capabilities to nodes that have fixed specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
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
