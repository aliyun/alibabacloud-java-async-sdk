// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link BatchStopDevicesResponseBody} extends {@link TeaModel}
 *
 * <p>BatchStopDevicesResponseBody</p>
 */
public class BatchStopDevicesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Results")
    private java.util.List<Results> results;

    private BatchStopDevicesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.results = builder.results;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchStopDevicesResponseBody create() {
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
     * @return results
     */
    public java.util.List<Results> getResults() {
        return this.results;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Results> results; 

        private Builder() {
        } 

        private Builder(BatchStopDevicesResponseBody model) {
            this.requestId = model.requestId;
            this.results = model.results;
        } 

        /**
         * <p>Request ID for this task.</p>
         * 
         * <strong>example:</strong>
         * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Result list.</p>
         */
        public Builder results(java.util.List<Results> results) {
            this.results = results;
            return this;
        }

        public BatchStopDevicesResponseBody build() {
            return new BatchStopDevicesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchStopDevicesResponseBody} extends {@link TeaModel}
     *
     * <p>BatchStopDevicesResponseBody</p>
     */
    public static class Streams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Error")
        private String error;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Streams(Builder builder) {
            this.error = builder.error;
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Streams create() {
            return builder().build();
        }

        /**
         * @return error
         */
        public String getError() {
            return this.error;
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

        public static final class Builder {
            private String error; 
            private String id; 
            private String name; 

            private Builder() {
            } 

            private Builder(Streams model) {
                this.error = model.error;
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * <p>Stream error message. (Appears only when an error occurs)</p>
             * 
             * <strong>example:</strong>
             * <p>Stream not found</p>
             */
            public Builder error(String error) {
                this.error = error;
                return this;
            }

            /**
             * <p>Stream ID.</p>
             * 
             * <strong>example:</strong>
             * <p>323884****9092997</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Name</p>
             * 
             * <strong>example:</strong>
             * <p>32388*****39092997</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Streams build() {
                return new Streams(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchStopDevicesResponseBody} extends {@link TeaModel}
     *
     * <p>BatchStopDevicesResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Streams")
        private java.util.List<Streams> streams;

        private Results(Builder builder) {
            this.id = builder.id;
            this.streams = builder.streams;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return streams
         */
        public java.util.List<Streams> getStreams() {
            return this.streams;
        }

        public static final class Builder {
            private String id; 
            private java.util.List<Streams> streams; 

            private Builder() {
            } 

            private Builder(Results model) {
                this.id = model.id;
                this.streams = model.streams;
            } 

            /**
             * <p>Device ID.</p>
             * 
             * <strong>example:</strong>
             * <p>32388487****92996</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Device stream list.</p>
             */
            public Builder streams(java.util.List<Streams> streams) {
                this.streams = streams;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
}
