// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eduembed20240101.models;

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
 * {@link DescribeLabReservationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLabReservationResponseBody</p>
 */
public class DescribeLabReservationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("LabReservation")
    private LabReservation labReservation;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeLabReservationResponseBody(Builder builder) {
        this.code = builder.code;
        this.labReservation = builder.labReservation;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLabReservationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return labReservation
     */
    public LabReservation getLabReservation() {
        return this.labReservation;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private LabReservation labReservation; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeLabReservationResponseBody model) {
            this.code = model.code;
            this.labReservation = model.labReservation;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * LabReservation.
         */
        public Builder labReservation(LabReservation labReservation) {
            this.labReservation = labReservation;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeLabReservationResponseBody build() {
            return new DescribeLabReservationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLabReservationResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLabReservationResponseBody</p>
     */
    public static class LabReservation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private Long accountId;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MemberCount")
        private Long memberCount;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private LabReservation(Builder builder) {
            this.accountId = builder.accountId;
            this.endTime = builder.endTime;
            this.id = builder.id;
            this.memberCount = builder.memberCount;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LabReservation create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public Long getAccountId() {
            return this.accountId;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return memberCount
         */
        public Long getMemberCount() {
            return this.memberCount;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private Long accountId; 
            private String endTime; 
            private String id; 
            private Long memberCount; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(LabReservation model) {
                this.accountId = model.accountId;
                this.endTime = model.endTime;
                this.id = model.id;
                this.memberCount = model.memberCount;
                this.startTime = model.startTime;
            } 

            /**
             * AccountId.
             */
            public Builder accountId(Long accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * MemberCount.
             */
            public Builder memberCount(Long memberCount) {
                this.memberCount = memberCount;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public LabReservation build() {
                return new LabReservation(this);
            } 

        } 

    }
}
