// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProjectResponseBody} extends {@link TeaModel}
 *
 * <p>ListProjectResponseBody</p>
 */
public class ListProjectResponseBody extends TeaModel {
    @NameInMap("Headers")
    private Headers headers;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private ListProjectResponseBody(Builder builder) {
        this.headers = builder.headers;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProjectResponseBody create() {
        return builder().build();
    }

    /**
     * @return headers
     */
    public Headers getHeaders() {
        return this.headers;
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
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private Headers headers; 
        private String requestId; 
        private Result result; 

        /**
         * Headers.
         */
        public Builder headers(Headers headers) {
            this.headers = headers;
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
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public ListProjectResponseBody build() {
            return new ListProjectResponseBody(this);
        } 

    } 

    public static class Headers extends TeaModel {
        @NameInMap("XTotalCount")
        private Integer XTotalCount;

        private Headers(Builder builder) {
            this.XTotalCount = builder.XTotalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Headers create() {
            return builder().build();
        }

        /**
         * @return XTotalCount
         */
        public Integer getXTotalCount() {
            return this.XTotalCount;
        }

        public static final class Builder {
            private Integer XTotalCount; 

            /**
             * XTotalCount.
             */
            public Builder XTotalCount(Integer XTotalCount) {
                this.XTotalCount = XTotalCount;
                return this;
            }

            public Headers build() {
                return new Headers(this);
            } 

        } 

    }
    public static class Spec extends TeaModel {
        @NameInMap("Channel")
        private String channel;

        @NameInMap("ComputeUnit")
        private Integer computeUnit;

        @NameInMap("Type")
        private String type;

        private Spec(Builder builder) {
            this.channel = builder.channel;
            this.computeUnit = builder.computeUnit;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Spec create() {
            return builder().build();
        }

        /**
         * @return channel
         */
        public String getChannel() {
            return this.channel;
        }

        /**
         * @return computeUnit
         */
        public Integer getComputeUnit() {
            return this.computeUnit;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String channel; 
            private Integer computeUnit; 
            private String type; 

            /**
             * Channel.
             */
            public Builder channel(String channel) {
                this.channel = channel;
                return this;
            }

            /**
             * ComputeUnit.
             */
            public Builder computeUnit(Integer computeUnit) {
                this.computeUnit = computeUnit;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Spec build() {
                return new Spec(this);
            } 

        } 

    }
    public static class ResultResult extends TeaModel {
        @NameInMap("Id")
        private String id;

        @NameInMap("Name")
        private String name;

        @NameInMap("OwnerId")
        private String ownerId;

        @NameInMap("Region")
        private String region;

        @NameInMap("Spec")
        private Spec spec;

        private ResultResult(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
            this.ownerId = builder.ownerId;
            this.region = builder.region;
            this.spec = builder.spec;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultResult create() {
            return builder().build();
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

        /**
         * @return ownerId
         */
        public String getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return spec
         */
        public Spec getSpec() {
            return this.spec;
        }

        public static final class Builder {
            private String id; 
            private String name; 
            private String ownerId; 
            private String region; 
            private Spec spec; 

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

            /**
             * OwnerId.
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * Spec.
             */
            public Builder spec(Spec spec) {
                this.spec = spec;
                return this;
            }

            public ResultResult build() {
                return new ResultResult(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("Result")
        private java.util.List < ResultResult> result;

        private Result(Builder builder) {
            this.result = builder.result;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return result
         */
        public java.util.List < ResultResult> getResult() {
            return this.result;
        }

        public static final class Builder {
            private java.util.List < ResultResult> result; 

            /**
             * Result.
             */
            public Builder result(java.util.List < ResultResult> result) {
                this.result = result;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
