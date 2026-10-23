// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link BatchOperateWorkItemsResponseBody} extends {@link TeaModel}
 *
 * <p>BatchOperateWorkItemsResponseBody</p>
 */
public class BatchOperateWorkItemsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("skipped")
    private Long skipped;

    @com.aliyun.core.annotation.NameInMap("succeeded")
    private Long succeeded;

    private BatchOperateWorkItemsResponseBody(Builder builder) {
        this.code = builder.code;
        this.items = builder.items;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.skipped = builder.skipped;
        this.succeeded = builder.succeeded;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchOperateWorkItemsResponseBody create() {
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
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
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
     * @return skipped
     */
    public Long getSkipped() {
        return this.skipped;
    }

    /**
     * @return succeeded
     */
    public Long getSucceeded() {
        return this.succeeded;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Items> items; 
        private String message; 
        private String requestId; 
        private Long skipped; 
        private Long succeeded; 

        private Builder() {
        } 

        private Builder(BatchOperateWorkItemsResponseBody model) {
            this.code = model.code;
            this.items = model.items;
            this.message = model.message;
            this.requestId = model.requestId;
            this.skipped = model.skipped;
            this.succeeded = model.succeeded;
        } 

        /**
         * <p>The business status code. A value of 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The results for each item. The order of the results matches the order of the items in the request.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The requested resource does not exist</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of skipped or failed operations.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder skipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }

        /**
         * <p>The number of successful operations.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder succeeded(Long succeeded) {
            this.succeeded = succeeded;
            return this;
        }

        public BatchOperateWorkItemsResponseBody build() {
            return new BatchOperateWorkItemsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchOperateWorkItemsResponseBody} extends {@link TeaModel}
     *
     * <p>BatchOperateWorkItemsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("success")
        private Boolean success;

        @com.aliyun.core.annotation.NameInMap("workItemId")
        private String workItemId;

        private Items(Builder builder) {
            this.reason = builder.reason;
            this.success = builder.success;
            this.workItemId = builder.workItemId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        /**
         * @return workItemId
         */
        public String getWorkItemId() {
            return this.workItemId;
        }

        public static final class Builder {
            private String reason; 
            private Boolean success; 
            private String workItemId; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.reason = model.reason;
                this.success = model.success;
                this.workItemId = model.workItemId;
            } 

            /**
             * <p>The reason for skipping or failure.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>Indicates whether the execution was successful.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            /**
             * <p>The ID of the work item.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder workItemId(String workItemId) {
                this.workItemId = workItemId;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
