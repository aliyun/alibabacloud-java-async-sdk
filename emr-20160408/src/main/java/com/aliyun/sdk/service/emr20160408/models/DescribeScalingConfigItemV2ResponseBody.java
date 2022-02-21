// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScalingConfigItemV2ResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScalingConfigItemV2ResponseBody</p>
 */
public class DescribeScalingConfigItemV2ResponseBody extends TeaModel {
    @NameInMap("ConfigItemInformation")
    private String configItemInformation;

    @NameInMap("ConfigItemType")
    private String configItemType;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ScalingConfigItemBizId")
    private String scalingConfigItemBizId;

    @NameInMap("ScalingGroupBizId")
    private String scalingGroupBizId;

    private DescribeScalingConfigItemV2ResponseBody(Builder builder) {
        this.configItemInformation = builder.configItemInformation;
        this.configItemType = builder.configItemType;
        this.requestId = builder.requestId;
        this.scalingConfigItemBizId = builder.scalingConfigItemBizId;
        this.scalingGroupBizId = builder.scalingGroupBizId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScalingConfigItemV2ResponseBody create() {
        return builder().build();
    }

    /**
     * @return configItemInformation
     */
    public String getConfigItemInformation() {
        return this.configItemInformation;
    }

    /**
     * @return configItemType
     */
    public String getConfigItemType() {
        return this.configItemType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scalingConfigItemBizId
     */
    public String getScalingConfigItemBizId() {
        return this.scalingConfigItemBizId;
    }

    /**
     * @return scalingGroupBizId
     */
    public String getScalingGroupBizId() {
        return this.scalingGroupBizId;
    }

    public static final class Builder {
        private String configItemInformation; 
        private String configItemType; 
        private String requestId; 
        private String scalingConfigItemBizId; 
        private String scalingGroupBizId; 

        /**
         * ConfigItemInformation.
         */
        public Builder configItemInformation(String configItemInformation) {
            this.configItemInformation = configItemInformation;
            return this;
        }

        /**
         * ConfigItemType.
         */
        public Builder configItemType(String configItemType) {
            this.configItemType = configItemType;
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
         * ScalingConfigItemBizId.
         */
        public Builder scalingConfigItemBizId(String scalingConfigItemBizId) {
            this.scalingConfigItemBizId = scalingConfigItemBizId;
            return this;
        }

        /**
         * ScalingGroupBizId.
         */
        public Builder scalingGroupBizId(String scalingGroupBizId) {
            this.scalingGroupBizId = scalingGroupBizId;
            return this;
        }

        public DescribeScalingConfigItemV2ResponseBody build() {
            return new DescribeScalingConfigItemV2ResponseBody(this);
        } 

    } 

}
