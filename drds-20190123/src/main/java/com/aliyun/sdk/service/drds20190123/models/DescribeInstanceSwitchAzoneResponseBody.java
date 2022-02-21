// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceSwitchAzoneResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceSwitchAzoneResponseBody</p>
 */
public class DescribeInstanceSwitchAzoneResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    @NameInMap("Success")
    private Boolean success;

    private DescribeInstanceSwitchAzoneResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceSwitchAzoneResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 
        private Boolean success; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeInstanceSwitchAzoneResponseBody build() {
            return new DescribeInstanceSwitchAzoneResponseBody(this);
        } 

    } 

    public static class TargetAzones extends TeaModel {
        @NameInMap("TargetAzone")
        private java.util.List < String > targetAzone;

        private TargetAzones(Builder builder) {
            this.targetAzone = builder.targetAzone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetAzones create() {
            return builder().build();
        }

        /**
         * @return targetAzone
         */
        public java.util.List < String > getTargetAzone() {
            return this.targetAzone;
        }

        public static final class Builder {
            private java.util.List < String > targetAzone; 

            /**
             * TargetAzone.
             */
            public Builder targetAzone(java.util.List < String > targetAzone) {
                this.targetAzone = targetAzone;
                return this;
            }

            public TargetAzones build() {
                return new TargetAzones(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("OriginAzoneId")
        private String originAzoneId;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("SwitchAble")
        private Boolean switchAble;

        @NameInMap("TargetAzones")
        private TargetAzones targetAzones;

        private Result(Builder builder) {
            this.originAzoneId = builder.originAzoneId;
            this.regionId = builder.regionId;
            this.switchAble = builder.switchAble;
            this.targetAzones = builder.targetAzones;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return originAzoneId
         */
        public String getOriginAzoneId() {
            return this.originAzoneId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return switchAble
         */
        public Boolean getSwitchAble() {
            return this.switchAble;
        }

        /**
         * @return targetAzones
         */
        public TargetAzones getTargetAzones() {
            return this.targetAzones;
        }

        public static final class Builder {
            private String originAzoneId; 
            private String regionId; 
            private Boolean switchAble; 
            private TargetAzones targetAzones; 

            /**
             * OriginAzoneId.
             */
            public Builder originAzoneId(String originAzoneId) {
                this.originAzoneId = originAzoneId;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * SwitchAble.
             */
            public Builder switchAble(Boolean switchAble) {
                this.switchAble = switchAble;
                return this;
            }

            /**
             * TargetAzones.
             */
            public Builder targetAzones(TargetAzones targetAzones) {
                this.targetAzones = targetAzones;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
