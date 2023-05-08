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
         * RebootStatuses.
         */
        public Builder rebootStatuses(java.util.List < RebootStatuses> rebootStatuses) {
            this.rebootStatuses = rebootStatuses;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * DescribeInstanceRebootStatus
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
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Msg.
             */
            public Builder msg(String msg) {
                this.msg = msg;
                return this;
            }

            /**
             * RebootStatus.
             */
            public Builder rebootStatus(Integer rebootStatus) {
                this.rebootStatus = rebootStatus;
                return this;
            }

            /**
             * Uuid.
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
