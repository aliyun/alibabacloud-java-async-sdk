// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

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
 * {@link DescribeInstanceRecoverTimeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceRecoverTimeResponseBody</p>
 */
public class DescribeInstanceRecoverTimeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RestoreRanges")
    private java.util.List<RestoreRanges> restoreRanges;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<RestoreRanges> getRestoreRanges() {
        return this.restoreRanges;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<RestoreRanges> restoreRanges; 

        private Builder() {
        } 

        private Builder(DescribeInstanceRecoverTimeResponseBody model) {
            this.requestId = model.requestId;
            this.restoreRanges = model.restoreRanges;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F8CA8312-530A-413A-9129-F2BB32A8D404</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The time ranges to which data can be restored. The time ranges include those used for point-in-time data restoration.</p>
         */
        public Builder restoreRanges(java.util.List<RestoreRanges> restoreRanges) {
            this.restoreRanges = restoreRanges;
            return this;
        }

        public DescribeInstanceRecoverTimeResponseBody build() {
            return new DescribeInstanceRecoverTimeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceRecoverTimeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceRecoverTimeResponseBody</p>
     */
    public static class RestoreRanges extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RestoreBeginTime")
        private String restoreBeginTime;

        @com.aliyun.core.annotation.NameInMap("RestoreEndTime")
        private String restoreEndTime;

        @com.aliyun.core.annotation.NameInMap("RestoreType")
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

            private Builder() {
            } 

            private Builder(RestoreRanges model) {
                this.restoreBeginTime = model.restoreBeginTime;
                this.restoreEndTime = model.restoreEndTime;
                this.restoreType = model.restoreType;
            } 

            /**
             * <p>The beginning of the time range to which data can be restored.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-10-16T19:33:20Z</p>
             */
            public Builder restoreBeginTime(String restoreBeginTime) {
                this.restoreBeginTime = restoreBeginTime;
                return this;
            }

            /**
             * <p>The end of the time range to which data can be restored.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-10-16T19:43:20Z</p>
             */
            public Builder restoreEndTime(String restoreEndTime) {
                this.restoreEndTime = restoreEndTime;
                return this;
            }

            /**
             * <p>The method used to restore data. Valid value:</p>
             * <ul>
             * <li>PointInTime (default): Data is restored to a point in time.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PointInTime</p>
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
