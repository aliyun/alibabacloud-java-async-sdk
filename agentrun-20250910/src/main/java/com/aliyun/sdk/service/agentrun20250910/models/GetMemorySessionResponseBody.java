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
 * {@link GetMemorySessionResponseBody} extends {@link TeaModel}
 *
 * <p>GetMemorySessionResponseBody</p>
 */
public class GetMemorySessionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetMemorySessionResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMemorySessionResponseBody create() {
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

        private Builder(GetMemorySessionResponseBody model) {
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
         * <p>55D4BE40-2811-5CFB-8482-E0E98D575B1E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMemorySessionResponseBody build() {
            return new GetMemorySessionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMemorySessionResponseBody} extends {@link TeaModel}
     *
     * <p>GetMemorySessionResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("events")
        private java.util.List<java.util.Map<String, ?>> events;

        private Data(Builder builder) {
            this.events = builder.events;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return events
         */
        public java.util.List<java.util.Map<String, ?>> getEvents() {
            return this.events;
        }

        public static final class Builder {
            private java.util.List<java.util.Map<String, ?>> events; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.events = model.events;
            } 

            /**
             * events.
             */
            public Builder events(java.util.List<java.util.Map<String, ?>> events) {
                this.events = events;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
