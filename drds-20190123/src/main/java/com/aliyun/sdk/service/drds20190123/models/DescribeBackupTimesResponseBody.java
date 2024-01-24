// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupTimesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupTimesResponseBody</p>
 */
public class DescribeBackupTimesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RestoreTime")
    private RestoreTime restoreTime;

    @NameInMap("Success")
    private Boolean success;

    private DescribeBackupTimesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.restoreTime = builder.restoreTime;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupTimesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return restoreTime
     */
    public RestoreTime getRestoreTime() {
        return this.restoreTime;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private RestoreTime restoreTime; 
        private Boolean success; 

        /**
         * Indicates the ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates the information about the time range within which the data of the instance can be restored to a point in time.
         */
        public Builder restoreTime(RestoreTime restoreTime) {
            this.restoreTime = restoreTime;
            return this;
        }

        /**
         * Indicates whether the request is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeBackupTimesResponseBody build() {
            return new DescribeBackupTimesResponseBody(this);
        } 

    } 

    public static class RestoreTime extends TeaModel {
        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("StartTime")
        private String startTime;

        private RestoreTime(Builder builder) {
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RestoreTime create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String endTime; 
            private String startTime; 

            /**
             * Indicates the end time. The time is in the UNIX timestamp format. The time is in UTC. Unit: ms.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Indicates the start time. The time is in the UNIX timestamp format. The time must be in UTC. Unit: ms.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public RestoreTime build() {
                return new RestoreTime(this);
            } 

        } 

    }
}
