// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

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
 * {@link DescribeInstanceSwitchAzoneResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceSwitchAzoneResponseBody</p>
 */
public class DescribeInstanceSwitchAzoneResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>DSSDF-SEWE-23ERW</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The result of the operation.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeInstanceSwitchAzoneResponseBody build() {
            return new DescribeInstanceSwitchAzoneResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceSwitchAzoneResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceSwitchAzoneResponseBody</p>
     */
    public static class TargetAzones extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TargetAzone")
        private java.util.List<String> targetAzone;

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
        public java.util.List<String> getTargetAzone() {
            return this.targetAzone;
        }

        public static final class Builder {
            private java.util.List<String> targetAzone; 

            /**
             * TargetAzone.
             */
            public Builder targetAzone(java.util.List<String> targetAzone) {
                this.targetAzone = targetAzone;
                return this;
            }

            public TargetAzones build() {
                return new TargetAzones(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstanceSwitchAzoneResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceSwitchAzoneResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OriginAzoneId")
        private String originAzoneId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SwitchAble")
        private Boolean switchAble;

        @com.aliyun.core.annotation.NameInMap("TargetAzones")
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
             * <p>The ID of the source azoneId.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-a</p>
             */
            public Builder originAzoneId(String originAzoneId) {
                this.originAzoneId = originAzoneId;
                return this;
            }

            /**
             * <p>regionId.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>Indicates whether the job can be switched.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder switchAble(Boolean switchAble) {
                this.switchAble = switchAble;
                return this;
            }

            /**
             * <p>Target azones.</p>
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
