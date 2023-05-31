// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceRebootStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceRebootStatusResponseBody</p>
 */
public class DescribeInstanceRebootStatusResponseBody extends TeaModel {
    @NameInMap("RebootStatuses")
    private java.util.List < RebootStatuses> rebootStatuses;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeInstanceRebootStatusResponseBody(Builder builder) {
        this.rebootStatuses = builder.rebootStatuses;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceRebootStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return rebootStatuses
     */
    public java.util.List < RebootStatuses> getRebootStatuses() {
        return this.rebootStatuses;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < RebootStatuses> rebootStatuses; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * An array that consists of the status information about the servers that you restart.
         */
        public Builder rebootStatuses(java.util.List < RebootStatuses> rebootStatuses) {
            this.rebootStatuses = rebootStatuses;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeInstanceRebootStatusResponseBody build() {
            return new DescribeInstanceRebootStatusResponseBody(this);
        } 

    } 

    public static class RebootStatuses extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Msg")
        private String msg;

        @NameInMap("RebootStatus")
        private Integer rebootStatus;

        @NameInMap("Uuid")
        private String uuid;

        private RebootStatuses(Builder builder) {
            this.code = builder.code;
            this.msg = builder.msg;
            this.rebootStatus = builder.rebootStatus;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RebootStatuses create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return msg
         */
        public String getMsg() {
            return this.msg;
        }

        /**
         * @return rebootStatus
         */
        public Integer getRebootStatus() {
            return this.rebootStatus;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String code; 
            private String msg; 
            private Integer rebootStatus; 
            private String uuid; 

            /**
             * The error code that is returned when the server failed to be restarted. Valid values:
             * <p>
             * 
             * *   **10001**: The restart command failed to be sent.
             * *   **10002**: The restart operation failed.
             * *   **10003**: A timeout error occurs.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The message that is returned when the server failed to be restarted.
             */
            public Builder msg(String msg) {
                this.msg = msg;
                return this;
            }

            /**
             * The status of the server. Valid values:
             * <p>
             * 
             * *   **0**: The server is being restarted.
             * *   **1**: The server is restarted.
             * *   **2**: The server failed to be restarted.
             */
            public Builder rebootStatus(Integer rebootStatus) {
                this.rebootStatus = rebootStatus;
                return this;
            }

            /**
             * The UUID of the server.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public RebootStatuses build() {
                return new RebootStatuses(this);
            } 

        } 

    }
}
