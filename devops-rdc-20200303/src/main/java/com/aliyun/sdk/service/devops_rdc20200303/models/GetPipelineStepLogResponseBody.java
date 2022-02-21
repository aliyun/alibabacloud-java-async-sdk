// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPipelineStepLogResponseBody} extends {@link TeaModel}
 *
 * <p>GetPipelineStepLogResponseBody</p>
 */
public class GetPipelineStepLogResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("Object")
    private Object object;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetPipelineStepLogResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.object = builder.object;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPipelineStepLogResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return object
     */
    public Object getObject() {
        return this.object;
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
        private String errorCode; 
        private String errorMessage; 
        private Object object; 
        private String requestId; 
        private Boolean success; 

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * Object.
         */
        public Builder object(Object object) {
            this.object = object;
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

        public GetPipelineStepLogResponseBody build() {
            return new GetPipelineStepLogResponseBody(this);
        } 

    } 

    public static class Object extends TeaModel {
        @NameInMap("Last")
        private Integer last;

        @NameInMap("Logs")
        private String logs;

        @NameInMap("More")
        private Boolean more;

        private Object(Builder builder) {
            this.last = builder.last;
            this.logs = builder.logs;
            this.more = builder.more;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Object create() {
            return builder().build();
        }

        /**
         * @return last
         */
        public Integer getLast() {
            return this.last;
        }

        /**
         * @return logs
         */
        public String getLogs() {
            return this.logs;
        }

        /**
         * @return more
         */
        public Boolean getMore() {
            return this.more;
        }

        public static final class Builder {
            private Integer last; 
            private String logs; 
            private Boolean more; 

            /**
             * Last.
             */
            public Builder last(Integer last) {
                this.last = last;
                return this;
            }

            /**
             * Logs.
             */
            public Builder logs(String logs) {
                this.logs = logs;
                return this;
            }

            /**
             * More.
             */
            public Builder more(Boolean more) {
                this.more = more;
                return this;
            }

            public Object build() {
                return new Object(this);
            } 

        } 

    }
}
