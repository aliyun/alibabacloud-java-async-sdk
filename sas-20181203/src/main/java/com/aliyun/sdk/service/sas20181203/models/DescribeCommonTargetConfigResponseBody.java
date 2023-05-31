// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCommonTargetConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCommonTargetConfigResponseBody</p>
 */
public class DescribeCommonTargetConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TargetList")
    private java.util.List < TargetList> targetList;

    private DescribeCommonTargetConfigResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.targetList = builder.targetList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCommonTargetConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return targetList
     */
    public java.util.List < TargetList> getTargetList() {
        return this.targetList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < TargetList> targetList; 

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * An array that consists of the details of the configuration items.
         */
        public Builder targetList(java.util.List < TargetList> targetList) {
            this.targetList = targetList;
            return this;
        }

        public DescribeCommonTargetConfigResponseBody build() {
            return new DescribeCommonTargetConfigResponseBody(this);
        } 

    } 

    public static class TargetList extends TeaModel {
        @NameInMap("Flag")
        private String flag;

        @NameInMap("Target")
        private String target;

        @NameInMap("TargetType")
        private String targetType;

        private TargetList(Builder builder) {
            this.flag = builder.flag;
            this.target = builder.target;
            this.targetType = builder.targetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetList create() {
            return builder().build();
        }

        /**
         * @return flag
         */
        public String getFlag() {
            return this.flag;
        }

        /**
         * @return target
         */
        public String getTarget() {
            return this.target;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        public static final class Builder {
            private String flag; 
            private String target; 
            private String targetType; 

            /**
             * The mode in which the configuration takes effect. Valid values:
             * <p>
             * 
             * *   **add**: In this mode, the configuration takes effect on the assets.
             * *   **del**: In this mode, the configuration does not take effect on the assets.
             */
            public Builder flag(String flag) {
                this.flag = flag;
                return this;
            }

            /**
             * The ID of the asset on which the configuration takes effect.
             * <p>
             * 
             * > 
             * 
             * *   When you set the **TargetType** parameter to **uuid**, the value of this parameter indicates the UUID of an asset.
             * 
             * *   When you set the **TargetType** parameter to **Cluster**, the value of this parameter indicates the ID of a cluster.
             * 
             * *   When you set the **TargetType** parameter to **image_repo**, the value of this parameter indicates the ID of an image repository.
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * The dimension from on which the feature was configured. Valid values:
             * <p>
             * 
             * *   **uuid**: the UUID of the asset
             * *   **Cluster**: the ID of the cluster
             * *   **image_repo**: the ID of the image repository
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            public TargetList build() {
                return new TargetList(this);
            } 

        } 

    }
}
