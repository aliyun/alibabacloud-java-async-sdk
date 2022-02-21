// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyDeviceResponseBody} extends {@link TeaModel}
 *
 * <p>VerifyDeviceResponseBody</p>
 */
public class VerifyDeviceResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private VerifyDeviceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyDeviceResponseBody create() {
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
    public java.util.List < Data> getData() {
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

    public static final class Builder {
        private String code; 
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 

        /**
         * 响应码
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * 响应码描述
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public VerifyDeviceResponseBody build() {
            return new VerifyDeviceResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Id")
        private String id;

        @NameInMap("Message")
        private String message;

        @NameInMap("OriginalGbId")
        private String originalGbId;

        @NameInMap("RowNumber")
        private Long rowNumber;

        @NameInMap("SuggestGbId")
        private String suggestGbId;

        private Data(Builder builder) {
            this.code = builder.code;
            this.id = builder.id;
            this.message = builder.message;
            this.originalGbId = builder.originalGbId;
            this.rowNumber = builder.rowNumber;
            this.suggestGbId = builder.suggestGbId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return originalGbId
         */
        public String getOriginalGbId() {
            return this.originalGbId;
        }

        /**
         * @return rowNumber
         */
        public Long getRowNumber() {
            return this.rowNumber;
        }

        /**
         * @return suggestGbId
         */
        public String getSuggestGbId() {
            return this.suggestGbId;
        }

        public static final class Builder {
            private String code; 
            private String id; 
            private String message; 
            private String originalGbId; 
            private Long rowNumber; 
            private String suggestGbId; 

            /**
             * 格式错误或国标冲突的错误码，0为成功，-1为失败
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Excel中的序号列的值
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * 格式错误或国标冲突提示
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * 原始国标编码
             */
            public Builder originalGbId(String originalGbId) {
                this.originalGbId = originalGbId;
                return this;
            }

            /**
             * 记录所在行号
             */
            public Builder rowNumber(Long rowNumber) {
                this.rowNumber = rowNumber;
                return this;
            }

            /**
             * 建议的国标编码
             */
            public Builder suggestGbId(String suggestGbId) {
                this.suggestGbId = suggestGbId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
