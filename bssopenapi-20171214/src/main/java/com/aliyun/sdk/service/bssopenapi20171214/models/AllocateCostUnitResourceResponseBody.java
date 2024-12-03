// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful！</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>845C629F-47A7-4F46-A470-ED5047C4C250</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public AllocateCostUnitResourceResponseBody build() {
            return new AllocateCostUnitResourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AllocateCostUnitResourceResponseBody} extends {@link TeaModel}
     *
     * <p>AllocateCostUnitResourceResponseBody</p>
     */
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
             * <p>Indicates whether resources are allocated to the specified cost center. Valid values:</p>
             * <ul>
             * <li>true: The resources are allocated to the specified cost center.</li>
             * <li>false: The resources fail to be allocated to the specified cost center.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isSuccess(Boolean isSuccess) {
                this.isSuccess = isSuccess;
                return this;
            }

            /**
             * <p>The ID of the destination cost center.</p>
             * 
             * <strong>example:</strong>
             * <p>32857346527</p>
             */
            public Builder toUnitId(Long toUnitId) {
                this.toUnitId = toUnitId;
                return this;
            }

            /**
             * <p>The user ID of the owner of the destination cost center.</p>
             * 
             * <strong>example:</strong>
             * <p>34857693874</p>
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
