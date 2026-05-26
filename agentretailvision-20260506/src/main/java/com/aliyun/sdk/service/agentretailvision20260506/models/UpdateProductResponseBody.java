// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentretailvision20260506.models;

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
 * {@link UpdateProductResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateProductResponseBody</p>
 */
public class UpdateProductResponseBody extends TeaModel {
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

    private UpdateProductResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateProductResponseBody create() {
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

        private Builder() {
        } 

        private Builder(UpdateProductResponseBody model) {
            this.code = model.code;
            this.data = model.data;
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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>E1AD60F1-BAC7-546B-9533-E7AD02B16E3F</p>
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

        public UpdateProductResponseBody build() {
            return new UpdateProductResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateProductResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateProductResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ItemUniqueId")
        private String itemUniqueId;

        @com.aliyun.core.annotation.NameInMap("PlatformItemId")
        private String platformItemId;

        private Data(Builder builder) {
            this.itemUniqueId = builder.itemUniqueId;
            this.platformItemId = builder.platformItemId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return itemUniqueId
         */
        public String getItemUniqueId() {
            return this.itemUniqueId;
        }

        /**
         * @return platformItemId
         */
        public String getPlatformItemId() {
            return this.platformItemId;
        }

        public static final class Builder {
            private String itemUniqueId; 
            private String platformItemId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.itemUniqueId = model.itemUniqueId;
                this.platformItemId = model.platformItemId;
            } 

            /**
             * ItemUniqueId.
             */
            public Builder itemUniqueId(String itemUniqueId) {
                this.itemUniqueId = itemUniqueId;
                return this;
            }

            /**
             * PlatformItemId.
             */
            public Builder platformItemId(String platformItemId) {
                this.platformItemId = platformItemId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
