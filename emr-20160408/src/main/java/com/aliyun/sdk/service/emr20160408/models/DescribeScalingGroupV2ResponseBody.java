// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScalingGroupV2ResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScalingGroupV2ResponseBody</p>
 */
public class DescribeScalingGroupV2ResponseBody extends TeaModel {
    @NameInMap("ActiveStatus")
    private String activeStatus;

    @NameInMap("ConfigState")
    private String configState;

    @NameInMap("Description")
    private String description;

    @NameInMap("HostGroupBizId")
    private String hostGroupBizId;

    @NameInMap("Name")
    private String name;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ScalingGroupId")
    private String scalingGroupId;

    @NameInMap("ScalingInMode")
    private String scalingInMode;

    @NameInMap("ScalingMaxSize")
    private Integer scalingMaxSize;

    @NameInMap("ScalingMinSize")
    private Integer scalingMinSize;

    private DescribeScalingGroupV2ResponseBody(Builder builder) {
        this.activeStatus = builder.activeStatus;
        this.configState = builder.configState;
        this.description = builder.description;
        this.hostGroupBizId = builder.hostGroupBizId;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.scalingGroupId = builder.scalingGroupId;
        this.scalingInMode = builder.scalingInMode;
        this.scalingMaxSize = builder.scalingMaxSize;
        this.scalingMinSize = builder.scalingMinSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScalingGroupV2ResponseBody create() {
        return builder().build();
    }

    /**
     * @return activeStatus
     */
    public String getActiveStatus() {
        return this.activeStatus;
    }

    /**
     * @return configState
     */
    public String getConfigState() {
        return this.configState;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return hostGroupBizId
     */
    public String getHostGroupBizId() {
        return this.hostGroupBizId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scalingGroupId
     */
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    /**
     * @return scalingInMode
     */
    public String getScalingInMode() {
        return this.scalingInMode;
    }

    /**
     * @return scalingMaxSize
     */
    public Integer getScalingMaxSize() {
        return this.scalingMaxSize;
    }

    /**
     * @return scalingMinSize
     */
    public Integer getScalingMinSize() {
        return this.scalingMinSize;
    }

    public static final class Builder {
        private String activeStatus; 
        private String configState; 
        private String description; 
        private String hostGroupBizId; 
        private String name; 
        private String requestId; 
        private String scalingGroupId; 
        private String scalingInMode; 
        private Integer scalingMaxSize; 
        private Integer scalingMinSize; 

        /**
         * ActiveStatus.
         */
        public Builder activeStatus(String activeStatus) {
            this.activeStatus = activeStatus;
            return this;
        }

        /**
         * ConfigState.
         */
        public Builder configState(String configState) {
            this.configState = configState;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * HostGroupBizId.
         */
        public Builder hostGroupBizId(String hostGroupBizId) {
            this.hostGroupBizId = hostGroupBizId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ScalingGroupId.
         */
        public Builder scalingGroupId(String scalingGroupId) {
            this.scalingGroupId = scalingGroupId;
            return this;
        }

        /**
         * ScalingInMode.
         */
        public Builder scalingInMode(String scalingInMode) {
            this.scalingInMode = scalingInMode;
            return this;
        }

        /**
         * ScalingMaxSize.
         */
        public Builder scalingMaxSize(Integer scalingMaxSize) {
            this.scalingMaxSize = scalingMaxSize;
            return this;
        }

        /**
         * ScalingMinSize.
         */
        public Builder scalingMinSize(Integer scalingMinSize) {
            this.scalingMinSize = scalingMinSize;
            return this;
        }

        public DescribeScalingGroupV2ResponseBody build() {
            return new DescribeScalingGroupV2ResponseBody(this);
        } 

    } 

}
