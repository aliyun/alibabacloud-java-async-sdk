// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AllocateCostUnitResourceResponseBody} extends {@link TeaModel}
 *
 * <p>AllocateCostUnitResourceResponseBody</p>
 */
public class AllocateCostUnitResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private AllocateCostUnitResourceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AllocateCostUnitResourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The status code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public AllocateCostUnitResourceResponseBody build() {
            return new AllocateCostUnitResourceResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsSuccess")
        private Boolean isSuccess;

        @com.aliyun.core.annotation.NameInMap("ToUnitId")
        private Long toUnitId;

        @com.aliyun.core.annotation.NameInMap("ToUnitUserId")
        private Long toUnitUserId;

        private Data(Builder builder) {
            this.isSuccess = builder.isSuccess;
            this.toUnitId = builder.toUnitId;
            this.toUnitUserId = builder.toUnitUserId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return isSuccess
         */
        public Boolean getIsSuccess() {
            return this.isSuccess;
        }

        /**
         * @return toUnitId
         */
        public Long getToUnitId() {
            return this.toUnitId;
        }

        /**
         * @return toUnitUserId
         */
        public Long getToUnitUserId() {
            return this.toUnitUserId;
        }

        public static final class Builder {
            private Boolean isSuccess; 
            private Long toUnitId; 
            private Long toUnitUserId; 

            /**
             * Indicates whether resources are allocated to the specified cost center. Valid values:
             * <p>
             * 
             * *   true: The resources are allocated to the specified cost center.
             * *   false: The resources fail to be allocated to the specified cost center.
             */
            public Builder isSuccess(Boolean isSuccess) {
                this.isSuccess = isSuccess;
                return this;
            }

            /**
             * The ID of the destination cost center.
             */
            public Builder toUnitId(Long toUnitId) {
                this.toUnitId = toUnitId;
                return this;
            }

            /**
             * The user ID of the owner of the destination cost center.
             */
            public Builder toUnitUserId(Long toUnitUserId) {
                this.toUnitUserId = toUnitUserId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
