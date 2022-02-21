// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchStartDevicesResponseBody} extends {@link TeaModel}
 *
 * <p>BatchStartDevicesResponseBody</p>
 */
public class BatchStartDevicesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Results")
    private java.util.List < Results> results;

    private BatchStartDevicesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.results = builder.results;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchStartDevicesResponseBody create() {
        return builder().build();
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
    public java.util.List < Results> getResults() {
        return this.results;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Results> results; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Results.
         */
        public Builder results(java.util.List < Results> results) {
            this.results = results;
            return this;
        }

        public BatchStartDevicesResponseBody build() {
            return new BatchStartDevicesResponseBody(this);
        } 

    } 

    public static class Streams extends TeaModel {
        @NameInMap("Error")
        private String error;

        @NameInMap("Id")
        private String id;

        @NameInMap("Name")
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

            /**
             * Error.
             */
            public Builder error(String error) {
                this.error = error;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
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
    public static class Results extends TeaModel {
        @NameInMap("Id")
        private String id;

        @NameInMap("Streams")
        private java.util.List < Streams> streams;

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
        public java.util.List < Streams> getStreams() {
            return this.streams;
        }

        public static final class Builder {
            private String id; 
            private java.util.List < Streams> streams; 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Streams.
             */
            public Builder streams(java.util.List < Streams> streams) {
                this.streams = streams;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
}
