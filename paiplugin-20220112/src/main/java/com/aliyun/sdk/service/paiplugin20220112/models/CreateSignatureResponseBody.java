// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiplugin20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSignatureResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSignatureResponseBody</p>
 */
public class CreateSignatureResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private Integer errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    private CreateSignatureResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSignatureResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public Integer getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private Integer errorCode; 
        private String errorMessage; 
        private String requestId; 

        /**
         * 返回数据。
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * 错误码。
         */
        public Builder errorCode(Integer errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * 错误信息。
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateSignatureResponseBody build() {
            return new CreateSignatureResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CreatedTime")
        private String createdTime;

        @NameInMap("Id")
        private String id;

        @NameInMap("Name")
        private String name;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("UpdatedTime")
        private String updatedTime;

        private Data(Builder builder) {
            this.createdTime = builder.createdTime;
            this.id = builder.id;
            this.name = builder.name;
            this.status = builder.status;
            this.updatedTime = builder.updatedTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return updatedTime
         */
        public String getUpdatedTime() {
            return this.updatedTime;
        }

        public static final class Builder {
            private String createdTime; 
            private String id; 
            private String name; 
            private Integer status; 
            private String updatedTime; 

            /**
             * 创建时间 (UTC+8)。
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * 签名ID。
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * 签名名称。
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 签名审核状态。
             * <p>
             * - 0：审核中。
             * - 1：审核通过。
             * - 2：审核不通过。
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * 更新时间 (UTC+8)。
             */
            public Builder updatedTime(String updatedTime) {
                this.updatedTime = updatedTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
