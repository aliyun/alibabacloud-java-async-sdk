// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBClusterServerlessConfResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterServerlessConfResponseBody</p>
 */
public class DescribeDBClusterServerlessConfResponseBody extends TeaModel {
    @NameInMap("AllowShutDown")
    private String allowShutDown;

    @NameInMap("DBClusterId")
    private String DBClusterId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ScaleApRoNumMax")
    private String scaleApRoNumMax;

    @NameInMap("ScaleApRoNumMin")
    private String scaleApRoNumMin;

    @NameInMap("ScaleMax")
    private String scaleMax;

    @NameInMap("ScaleMin")
    private String scaleMin;

    @NameInMap("ScaleRoNumMax")
    private String scaleRoNumMax;

    @NameInMap("ScaleRoNumMin")
    private String scaleRoNumMin;

    @NameInMap("SecondsUntilAutoPause")
    private String secondsUntilAutoPause;

    @NameInMap("Switchs")
    private String switchs;

    private DescribeDBClusterServerlessConfResponseBody(Builder builder) {
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
        this.switchs = builder.switchs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClusterServerlessConfResponseBody create() {
        return builder().build();
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
     * @return switchs
     */
    public String getSwitchs() {
        return this.switchs;
    }

    public static final class Builder {
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
        private String switchs; 

        /**
         * Indicates whether the no-activity suspension feature is enabled. Default value: false. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder allowShutDown(String allowShutDown) {
            this.allowShutDown = allowShutDown;
            return this;
        }

        /**
         * The ID of the serverless cluster.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * The ID of the request.
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
         * The maximum number of PCUs per node for scaling. Valid values: 1 PCU to 32 PCUs.
         */
        public Builder scaleMax(String scaleMax) {
            this.scaleMax = scaleMax;
            return this;
        }

        /**
         * The minimum number of PCUs per node for scaling. Valid values: 1 PCU to 31 PCUs.
         */
        public Builder scaleMin(String scaleMin) {
            this.scaleMin = scaleMin;
            return this;
        }

        /**
         * The maximum number of read-only nodes for scaling. Valid values: 0 to 15.
         */
        public Builder scaleRoNumMax(String scaleRoNumMax) {
            this.scaleRoNumMax = scaleRoNumMax;
            return this;
        }

        /**
         * The minimum number of read-only nodes for scaling. Valid values: 0 to 15.
         */
        public Builder scaleRoNumMin(String scaleRoNumMin) {
            this.scaleRoNumMin = scaleRoNumMin;
            return this;
        }

        /**
         * The detection period for no-activity suspension. Valid values: 300 to 86400. Unit: seconds. The value must be a multiple of 300.
         */
        public Builder secondsUntilAutoPause(String secondsUntilAutoPause) {
            this.secondsUntilAutoPause = secondsUntilAutoPause;
            return this;
        }

        /**
         * Switchs.
         */
        public Builder switchs(String switchs) {
            this.switchs = switchs;
            return this;
        }

        public DescribeDBClusterServerlessConfResponseBody build() {
            return new DescribeDBClusterServerlessConfResponseBody(this);
        } 

    } 

}
