// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageFixCycleConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageFixCycleConfigResponseBody</p>
 */
public class DescribeImageFixCycleConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeImageFixCycleConfigResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageFixCycleConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * The response parameters.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeImageFixCycleConfigResponseBody build() {
            return new DescribeImageFixCycleConfigResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImageFixCycle")
        private Integer imageFixCycle;

        @com.aliyun.core.annotation.NameInMap("ImageFixSwitch")
        private String imageFixSwitch;

        @com.aliyun.core.annotation.NameInMap("ImageFixTarget")
        private String imageFixTarget;

        @com.aliyun.core.annotation.NameInMap("ImageTimeRange")
        private Integer imageTimeRange;

        private Data(Builder builder) {
            this.imageFixCycle = builder.imageFixCycle;
            this.imageFixSwitch = builder.imageFixSwitch;
            this.imageFixTarget = builder.imageFixTarget;
            this.imageTimeRange = builder.imageTimeRange;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return imageFixCycle
         */
        public Integer getImageFixCycle() {
            return this.imageFixCycle;
        }

        /**
         * @return imageFixSwitch
         */
        public String getImageFixSwitch() {
            return this.imageFixSwitch;
        }

        /**
         * @return imageFixTarget
         */
        public String getImageFixTarget() {
            return this.imageFixTarget;
        }

        /**
         * @return imageTimeRange
         */
        public Integer getImageTimeRange() {
            return this.imageTimeRange;
        }

        public static final class Builder {
            private Integer imageFixCycle; 
            private String imageFixSwitch; 
            private String imageFixTarget; 
            private Integer imageTimeRange; 

            /**
             * The cycle of the scheduled fix. Unit: day.
             */
            public Builder imageFixCycle(Integer imageFixCycle) {
                this.imageFixCycle = imageFixCycle;
                return this;
            }

            /**
             * Indicates whether the scheduled fix of image risks is enabled.
             * <p>
             * 
             * *   **on**: enabled
             * *   **off**: disabled
             */
            public Builder imageFixSwitch(String imageFixSwitch) {
                this.imageFixSwitch = imageFixSwitch;
                return this;
            }

            /**
             * The range of the scheduled fix. The value of this parameter is in the JSON format and contains the following fields:
             * <p>
             * 
             * *   **type**: The type of the image risk. The value is fixed to repo.
             * *   **target**: The content of the image risk. The value is in the format of Namespace/Image repository.
             */
            public Builder imageFixTarget(String imageFixTarget) {
                this.imageFixTarget = imageFixTarget;
                return this;
            }

            /**
             * The time range during which the image was modified. Unit: day.
             */
            public Builder imageTimeRange(Integer imageTimeRange) {
                this.imageTimeRange = imageTimeRange;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
