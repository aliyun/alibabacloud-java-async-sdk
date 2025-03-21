// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeInstanceRebootStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceRebootStatusResponseBody</p>
 */
public class DescribeInstanceRebootStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RebootStatuses")
    private java.util.List<RebootStatuses> rebootStatuses;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
    public java.util.List<RebootStatuses> getRebootStatuses() {
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
        private java.util.List<RebootStatuses> rebootStatuses; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>An array that consists of the status information about the servers that you restart.</p>
         */
        public Builder rebootStatuses(java.util.List<RebootStatuses> rebootStatuses) {
            this.rebootStatuses = rebootStatuses;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>5BD95679-D63A-4151-97D0-188432F4A57</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeInstanceRebootStatusResponseBody build() {
            return new DescribeInstanceRebootStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceRebootStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceRebootStatusResponseBody</p>
     */
    public static class RebootStatuses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Msg")
        private String msg;

        @com.aliyun.core.annotation.NameInMap("RebootStatus")
        private Integer rebootStatus;

        @com.aliyun.core.annotation.NameInMap("Uuid")
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
             * <p>The error code that is returned when the server failed to be restarted. Valid values:</p>
             * <ul>
             * <li><strong>10001</strong>: The restart command failed to be sent.</li>
             * <li><strong>10002</strong>: The restart operation failed.</li>
             * <li><strong>10003</strong>: A timeout error occurs.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>10001</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The message that is returned when the server failed to be restarted.</p>
             * 
             * <strong>example:</strong>
             * <p>push failed</p>
             */
            public Builder msg(String msg) {
                this.msg = msg;
                return this;
            }

            /**
             * <p>The status of the server. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The server is being restarted.</li>
             * <li><strong>1</strong>: The server is restarted.</li>
             * <li><strong>2</strong>: The server failed to be restarted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder rebootStatus(Integer rebootStatus) {
                this.rebootStatus = rebootStatus;
                return this;
            }

            /**
             * <p>The UUID of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>9b59c2d6-0967-46e3-ad7b-152227c****</p>
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
