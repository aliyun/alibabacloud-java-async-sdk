// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

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
 * {@link GetTerminalCountResponseBody} extends {@link TeaModel}
 *
 * <p>GetTerminalCountResponseBody</p>
 */
public class GetTerminalCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetTerminalCountResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTerminalCountResponseBody create() {
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
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetTerminalCountResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        public GetTerminalCountResponseBody build() {
            return new GetTerminalCountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTerminalCountResponseBody} extends {@link TeaModel}
     *
     * <p>GetTerminalCountResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BindUserCount")
        private Long bindUserCount;

        @com.aliyun.core.annotation.NameInMap("InManageCount")
        private Long inManageCount;

        @com.aliyun.core.annotation.NameInMap("NotInManageCount")
        private Long notInManageCount;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.bindUserCount = builder.bindUserCount;
            this.inManageCount = builder.inManageCount;
            this.notInManageCount = builder.notInManageCount;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bindUserCount
         */
        public Long getBindUserCount() {
            return this.bindUserCount;
        }

        /**
         * @return inManageCount
         */
        public Long getInManageCount() {
            return this.inManageCount;
        }

        /**
         * @return notInManageCount
         */
        public Long getNotInManageCount() {
            return this.notInManageCount;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Long bindUserCount; 
            private Long inManageCount; 
            private Long notInManageCount; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.bindUserCount = model.bindUserCount;
                this.inManageCount = model.inManageCount;
                this.notInManageCount = model.notInManageCount;
                this.totalCount = model.totalCount;
            } 

            /**
             * BindUserCount.
             */
            public Builder bindUserCount(Long bindUserCount) {
                this.bindUserCount = bindUserCount;
                return this;
            }

            /**
             * InManageCount.
             */
            public Builder inManageCount(Long inManageCount) {
                this.inManageCount = inManageCount;
                return this;
            }

            /**
             * NotInManageCount.
             */
            public Builder notInManageCount(Long notInManageCount) {
                this.notInManageCount = notInManageCount;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
