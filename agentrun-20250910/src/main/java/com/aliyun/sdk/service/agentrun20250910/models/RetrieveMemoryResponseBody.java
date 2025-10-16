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
 * {@link RetrieveMemoryResponseBody} extends {@link TeaModel}
 *
 * <p>RetrieveMemoryResponseBody</p>
 */
public class RetrieveMemoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private RetrieveMemoryResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RetrieveMemoryResponseBody create() {
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

        private Builder(RetrieveMemoryResponseBody model) {
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
         * <p>BC65E49E-1F6A-55E0-8A0E-7255DBFAA8F9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RetrieveMemoryResponseBody build() {
            return new RetrieveMemoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RetrieveMemoryResponseBody} extends {@link TeaModel}
     *
     * <p>RetrieveMemoryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("events")
        private java.util.List<java.util.Map<String, String>> events;

        @com.aliyun.core.annotation.NameInMap("memories")
        private java.util.List<java.util.Map<String, String>> memories;

        private Data(Builder builder) {
            this.events = builder.events;
            this.memories = builder.memories;
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
        public java.util.List<java.util.Map<String, String>> getEvents() {
            return this.events;
        }

        /**
         * @return memories
         */
        public java.util.List<java.util.Map<String, String>> getMemories() {
            return this.memories;
        }

        public static final class Builder {
            private java.util.List<java.util.Map<String, String>> events; 
            private java.util.List<java.util.Map<String, String>> memories; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.events = model.events;
                this.memories = model.memories;
            } 

            /**
             * events.
             */
            public Builder events(java.util.List<java.util.Map<String, String>> events) {
                this.events = events;
                return this;
            }

            /**
             * memories.
             */
            public Builder memories(java.util.List<java.util.Map<String, String>> memories) {
                this.memories = memories;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
