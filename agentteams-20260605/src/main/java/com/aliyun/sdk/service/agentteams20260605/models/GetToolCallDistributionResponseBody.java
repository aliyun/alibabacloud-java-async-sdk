// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentteams20260605.models;

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
 * {@link GetToolCallDistributionResponseBody} extends {@link TeaModel}
 *
 * <p>GetToolCallDistributionResponseBody</p>
 */
public class GetToolCallDistributionResponseBody extends TeaModel {
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

    private GetToolCallDistributionResponseBody(Builder builder) {
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

    public static GetToolCallDistributionResponseBody create() {
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

        private Builder(GetToolCallDistributionResponseBody model) {
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

        public GetToolCallDistributionResponseBody build() {
            return new GetToolCallDistributionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetToolCallDistributionResponseBody} extends {@link TeaModel}
     *
     * <p>GetToolCallDistributionResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallCount")
        private Integer callCount;

        @com.aliyun.core.annotation.NameInMap("ToolName")
        private String toolName;

        private Items(Builder builder) {
            this.callCount = builder.callCount;
            this.toolName = builder.toolName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return callCount
         */
        public Integer getCallCount() {
            return this.callCount;
        }

        /**
         * @return toolName
         */
        public String getToolName() {
            return this.toolName;
        }

        public static final class Builder {
            private Integer callCount; 
            private String toolName; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.callCount = model.callCount;
                this.toolName = model.toolName;
            } 

            /**
             * CallCount.
             */
            public Builder callCount(Integer callCount) {
                this.callCount = callCount;
                return this;
            }

            /**
             * ToolName.
             */
            public Builder toolName(String toolName) {
                this.toolName = toolName;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetToolCallDistributionResponseBody} extends {@link TeaModel}
     *
     * <p>GetToolCallDistributionResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Items")
        private java.util.List<Items> items;

        @com.aliyun.core.annotation.NameInMap("TotalCalls")
        private Integer totalCalls;

        private Data(Builder builder) {
            this.items = builder.items;
            this.totalCalls = builder.totalCalls;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List<Items> getItems() {
            return this.items;
        }

        /**
         * @return totalCalls
         */
        public Integer getTotalCalls() {
            return this.totalCalls;
        }

        public static final class Builder {
            private java.util.List<Items> items; 
            private Integer totalCalls; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.items = model.items;
                this.totalCalls = model.totalCalls;
            } 

            /**
             * Items.
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            /**
             * TotalCalls.
             */
            public Builder totalCalls(Integer totalCalls) {
                this.totalCalls = totalCalls;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
