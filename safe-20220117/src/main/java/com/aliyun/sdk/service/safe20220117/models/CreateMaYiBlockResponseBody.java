// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.safe20220117.models;

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
 * {@link CreateMaYiBlockResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMaYiBlockResponseBody</p>
 */
public class CreateMaYiBlockResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CreateMaYiBlockResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMaYiBlockResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
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
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(CreateMaYiBlockResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(Integer code) {
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

        public CreateMaYiBlockResponseBody build() {
            return new CreateMaYiBlockResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateMaYiBlockResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMaYiBlockResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BlockId")
        private Long blockId;

        @com.aliyun.core.annotation.NameInMap("BlockUrl")
        private String blockUrl;

        private Data(Builder builder) {
            this.blockId = builder.blockId;
            this.blockUrl = builder.blockUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return blockId
         */
        public Long getBlockId() {
            return this.blockId;
        }

        /**
         * @return blockUrl
         */
        public String getBlockUrl() {
            return this.blockUrl;
        }

        public static final class Builder {
            private Long blockId; 
            private String blockUrl; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.blockId = model.blockId;
                this.blockUrl = model.blockUrl;
            } 

            /**
             * BlockId.
             */
            public Builder blockId(Long blockId) {
                this.blockId = blockId;
                return this;
            }

            /**
             * BlockUrl.
             */
            public Builder blockUrl(String blockUrl) {
                this.blockUrl = blockUrl;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
