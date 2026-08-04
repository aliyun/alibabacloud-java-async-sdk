// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.account_crm20160606.models;

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
 * {@link QueryOneKeyDeleteBlockListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryOneKeyDeleteBlockListResponseBody</p>
 */
public class QueryOneKeyDeleteBlockListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryOneKeyDeleteBlockListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryOneKeyDeleteBlockListResponseBody create() {
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
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryOneKeyDeleteBlockListResponseBody model) {
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
        public Builder data(java.util.List<Data> data) {
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

        public QueryOneKeyDeleteBlockListResponseBody build() {
            return new QueryOneKeyDeleteBlockListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryOneKeyDeleteBlockListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryOneKeyDeleteBlockListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BlockCode")
        private String blockCode;

        @com.aliyun.core.annotation.NameInMap("BlockMsg")
        private String blockMsg;

        private Data(Builder builder) {
            this.blockCode = builder.blockCode;
            this.blockMsg = builder.blockMsg;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return blockCode
         */
        public String getBlockCode() {
            return this.blockCode;
        }

        /**
         * @return blockMsg
         */
        public String getBlockMsg() {
            return this.blockMsg;
        }

        public static final class Builder {
            private String blockCode; 
            private String blockMsg; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.blockCode = model.blockCode;
                this.blockMsg = model.blockMsg;
            } 

            /**
             * BlockCode.
             */
            public Builder blockCode(String blockCode) {
                this.blockCode = blockCode;
                return this;
            }

            /**
             * BlockMsg.
             */
            public Builder blockMsg(String blockMsg) {
                this.blockMsg = blockMsg;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
