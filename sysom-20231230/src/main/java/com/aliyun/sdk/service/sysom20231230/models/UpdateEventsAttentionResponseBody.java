// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link UpdateEventsAttentionResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateEventsAttentionResponseBody</p>
 */
public class UpdateEventsAttentionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    private UpdateEventsAttentionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEventsAttentionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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

    public static final class Builder {
        private String requestId; 
        private String code; 
        private Data data; 
        private String message; 

        private Builder() {
        } 

        private Builder(UpdateEventsAttentionResponseBody model) {
            this.requestId = model.requestId;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
        } 

        /**
         * <p>The request ID, which can be used for end-to-end diagnostics.</p>
         * 
         * <strong>example:</strong>
         * <p>44841312-7227-55C9-AE03-D59729BFAE38</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status code. Valid values:</p>
         * <ul>
         * <li>Success: The authorization is successful.</li>
         * <li>Other values: The authorization failed. Check the message field for the detailed fault information.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Instance not belong to current user</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public UpdateEventsAttentionResponseBody build() {
            return new UpdateEventsAttentionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateEventsAttentionResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateEventsAttentionResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("mode")
        private Integer mode;

        private Data(Builder builder) {
            this.mode = builder.mode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return mode
         */
        public Integer getMode() {
            return this.mode;
        }

        public static final class Builder {
            private Integer mode; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.mode = model.mode;
            } 

            /**
             * <p>The updated attention level value.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder mode(Integer mode) {
                this.mode = mode;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
