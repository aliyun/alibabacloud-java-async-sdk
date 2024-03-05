// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceRecoverTimeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceRecoverTimeResponseBody</p>
 */
public class DescribeInstanceRecoverTimeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RestoreRanges")
    private java.util.List < RestoreRanges> restoreRanges;

    private DescribeInstanceRecoverTimeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.restoreRanges = builder.restoreRanges;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceRecoverTimeResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return restoreRanges
     */
    public java.util.List < RestoreRanges> getRestoreRanges() {
        return this.restoreRanges;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < RestoreRanges> restoreRanges; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RestoreRanges.
         */
        public Builder restoreRanges(java.util.List < RestoreRanges> restoreRanges) {
            this.restoreRanges = restoreRanges;
            return this;
        }

        public DescribeInstanceRecoverTimeResponseBody build() {
            return new DescribeInstanceRecoverTimeResponseBody(this);
        } 

    } 

    public static class RestoreRanges extends TeaModel {
        @NameInMap("RestoreBeginTime")
        private String restoreBeginTime;

        @NameInMap("RestoreEndTime")
        private String restoreEndTime;

        @NameInMap("RestoreType")
        private String restoreType;

        private RestoreRanges(Builder builder) {
            this.restoreBeginTime = builder.restoreBeginTime;
            this.restoreEndTime = builder.restoreEndTime;
            this.restoreType = builder.restoreType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RestoreRanges create() {
            return builder().build();
        }

        /**
         * @return restoreBeginTime
         */
        public String getRestoreBeginTime() {
            return this.restoreBeginTime;
        }

        /**
         * @return restoreEndTime
         */
        public String getRestoreEndTime() {
            return this.restoreEndTime;
        }

        /**
         * @return restoreType
         */
        public String getRestoreType() {
            return this.restoreType;
        }

        public static final class Builder {
            private String restoreBeginTime; 
            private String restoreEndTime; 
            private String restoreType; 

            /**
             * RestoreBeginTime.
             */
            public Builder restoreBeginTime(String restoreBeginTime) {
                this.restoreBeginTime = restoreBeginTime;
                return this;
            }

            /**
             * RestoreEndTime.
             */
            public Builder restoreEndTime(String restoreEndTime) {
                this.restoreEndTime = restoreEndTime;
                return this;
            }

            /**
             * RestoreType.
             */
            public Builder restoreType(String restoreType) {
                this.restoreType = restoreType;
                return this;
            }

            public RestoreRanges build() {
                return new RestoreRanges(this);
            } 

        } 

    }
}
