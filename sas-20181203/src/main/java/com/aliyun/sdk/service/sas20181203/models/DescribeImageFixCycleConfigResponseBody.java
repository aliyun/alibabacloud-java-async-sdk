// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageFixCycleConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageFixCycleConfigResponseBody</p>
 */
public class DescribeImageFixCycleConfigResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("ImageFixCycle")
        private Integer imageFixCycle;

        @NameInMap("ImageFixSwitch")
        private String imageFixSwitch;

        @NameInMap("ImageFixTarget")
        private String imageFixTarget;

        @NameInMap("ImageTimeRange")
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
             * ImageFixCycle.
             */
            public Builder imageFixCycle(Integer imageFixCycle) {
                this.imageFixCycle = imageFixCycle;
                return this;
            }

            /**
             * ImageFixSwitch.
             */
            public Builder imageFixSwitch(String imageFixSwitch) {
                this.imageFixSwitch = imageFixSwitch;
                return this;
            }

            /**
             * ImageFixTarget.
             */
            public Builder imageFixTarget(String imageFixTarget) {
                this.imageFixTarget = imageFixTarget;
                return this;
            }

            /**
             * ImageTimeRange.
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
