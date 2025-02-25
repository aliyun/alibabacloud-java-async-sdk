// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListExperimentsResponseBody} extends {@link TeaModel}
 *
 * <p>ListExperimentsResponseBody</p>
 */
public class ListExperimentsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List < Result> result;

    private ListExperimentsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExperimentsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List < Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListExperimentsResponseBody build() {
            return new ListExperimentsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListExperimentsResponseBody} extends {@link TeaModel}
     *
     * <p>ListExperimentsResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("base")
        private Boolean base;

        @com.aliyun.core.annotation.NameInMap("buckets")
        private java.util.List < String > buckets;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("experimentId")
        private String experimentId;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("offlineTime")
        private String offlineTime;

        @com.aliyun.core.annotation.NameInMap("onlineTime")
        private String onlineTime;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private Result(Builder builder) {
            this.base = builder.base;
            this.buckets = builder.buckets;
            this.description = builder.description;
            this.experimentId = builder.experimentId;
            this.name = builder.name;
            this.offlineTime = builder.offlineTime;
            this.onlineTime = builder.onlineTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return base
         */
        public Boolean getBase() {
            return this.base;
        }

        /**
         * @return buckets
         */
        public java.util.List < String > getBuckets() {
            return this.buckets;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return experimentId
         */
        public String getExperimentId() {
            return this.experimentId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return offlineTime
         */
        public String getOfflineTime() {
            return this.offlineTime;
        }

        /**
         * @return onlineTime
         */
        public String getOnlineTime() {
            return this.onlineTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Boolean base; 
            private java.util.List < String > buckets; 
            private String description; 
            private String experimentId; 
            private String name; 
            private String offlineTime; 
            private String onlineTime; 
            private String status; 

            /**
             * base.
             */
            public Builder base(Boolean base) {
                this.base = base;
                return this;
            }

            /**
             * buckets.
             */
            public Builder buckets(java.util.List < String > buckets) {
                this.buckets = buckets;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * experimentId.
             */
            public Builder experimentId(String experimentId) {
                this.experimentId = experimentId;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * offlineTime.
             */
            public Builder offlineTime(String offlineTime) {
                this.offlineTime = offlineTime;
                return this;
            }

            /**
             * onlineTime.
             */
            public Builder onlineTime(String onlineTime) {
                this.onlineTime = onlineTime;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
