// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListIndexVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListIndexVersionsResponseBody</p>
 */
public class ListIndexVersionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List < Result> result;

    private ListIndexVersionsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIndexVersionsResponseBody create() {
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
    public java.util.List < Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListIndexVersionsResponseBody build() {
            return new ListIndexVersionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListIndexVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListIndexVersionsResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("builtTime")
        private String builtTime;

        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("costSeconds")
        private Integer costSeconds;

        @com.aliyun.core.annotation.NameInMap("flowType")
        private String flowType;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("progress")
        private Integer progress;

        @com.aliyun.core.annotation.NameInMap("rollbackEnabled")
        private Boolean rollbackEnabled;

        @com.aliyun.core.annotation.NameInMap("size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("switchedTime")
        private String switchedTime;

        @com.aliyun.core.annotation.NameInMap("versionId")
        private String versionId;

        private Result(Builder builder) {
            this.builtTime = builder.builtTime;
            this.code = builder.code;
            this.costSeconds = builder.costSeconds;
            this.flowType = builder.flowType;
            this.message = builder.message;
            this.progress = builder.progress;
            this.rollbackEnabled = builder.rollbackEnabled;
            this.size = builder.size;
            this.status = builder.status;
            this.switchedTime = builder.switchedTime;
            this.versionId = builder.versionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return builtTime
         */
        public String getBuiltTime() {
            return this.builtTime;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return costSeconds
         */
        public Integer getCostSeconds() {
            return this.costSeconds;
        }

        /**
         * @return flowType
         */
        public String getFlowType() {
            return this.flowType;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return progress
         */
        public Integer getProgress() {
            return this.progress;
        }

        /**
         * @return rollbackEnabled
         */
        public Boolean getRollbackEnabled() {
            return this.rollbackEnabled;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return switchedTime
         */
        public String getSwitchedTime() {
            return this.switchedTime;
        }

        /**
         * @return versionId
         */
        public String getVersionId() {
            return this.versionId;
        }

        public static final class Builder {
            private String builtTime; 
            private String code; 
            private Integer costSeconds; 
            private String flowType; 
            private String message; 
            private Integer progress; 
            private Boolean rollbackEnabled; 
            private Long size; 
            private String status; 
            private String switchedTime; 
            private String versionId; 

            /**
             * builtTime.
             */
            public Builder builtTime(String builtTime) {
                this.builtTime = builtTime;
                return this;
            }

            /**
             * code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * costSeconds.
             */
            public Builder costSeconds(Integer costSeconds) {
                this.costSeconds = costSeconds;
                return this;
            }

            /**
             * flowType.
             */
            public Builder flowType(String flowType) {
                this.flowType = flowType;
                return this;
            }

            /**
             * message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * progress.
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * rollbackEnabled.
             */
            public Builder rollbackEnabled(Boolean rollbackEnabled) {
                this.rollbackEnabled = rollbackEnabled;
                return this;
            }

            /**
             * size.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * switchedTime.
             */
            public Builder switchedTime(String switchedTime) {
                this.switchedTime = switchedTime;
                return this;
            }

            /**
             * versionId.
             */
            public Builder versionId(String versionId) {
                this.versionId = versionId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
