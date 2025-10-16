// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link GetMemoryEventResponseBody} extends {@link TeaModel}
 *
 * <p>GetMemoryEventResponseBody</p>
 */
public class GetMemoryEventResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetMemoryEventResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMemoryEventResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetMemoryEventResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>BF2A63E4-FCE9-5A65-A60E-4086C8EDBC06</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMemoryEventResponseBody build() {
            return new GetMemoryEventResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMemoryEventResponseBody} extends {@link TeaModel}
     *
     * <p>GetMemoryEventResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("event")
        private java.util.Map<String, ?> event;

        private Data(Builder builder) {
            this.event = builder.event;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return event
         */
        public java.util.Map<String, ?> getEvent() {
            return this.event;
        }

        public static final class Builder {
            private java.util.Map<String, ?> event; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.event = model.event;
            } 

            /**
             * event.
             */
            public Builder event(java.util.Map<String, ?> event) {
                this.event = event;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
