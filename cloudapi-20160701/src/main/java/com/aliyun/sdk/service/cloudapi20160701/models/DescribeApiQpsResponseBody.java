// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApiQpsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApiQpsResponseBody</p>
 */
public class DescribeApiQpsResponseBody extends TeaModel {
    @NameInMap("Fails")
    private Fails fails;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Successes")
    private Successes successes;

    private DescribeApiQpsResponseBody(Builder builder) {
        this.fails = builder.fails;
        this.requestId = builder.requestId;
        this.successes = builder.successes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApiQpsResponseBody create() {
        return builder().build();
    }

    /**
     * @return fails
     */
    public Fails getFails() {
        return this.fails;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return successes
     */
    public Successes getSuccesses() {
        return this.successes;
    }

    public static final class Builder {
        private Fails fails; 
        private String requestId; 
        private Successes successes; 

        /**
         * Fails.
         */
        public Builder fails(Fails fails) {
            this.fails = fails;
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
         * Successes.
         */
        public Builder successes(Successes successes) {
            this.successes = successes;
            return this;
        }

        public DescribeApiQpsResponseBody build() {
            return new DescribeApiQpsResponseBody(this);
        } 

    } 

    public static class Fail extends TeaModel {
        @NameInMap("Time")
        private String time;

        @NameInMap("Value")
        private String value;

        private Fail(Builder builder) {
            this.time = builder.time;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Fail create() {
            return builder().build();
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String time; 
            private String value; 

            /**
             * Time.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Fail build() {
                return new Fail(this);
            } 

        } 

    }
    public static class Fails extends TeaModel {
        @NameInMap("Fail")
        private java.util.List < Fail> fail;

        private Fails(Builder builder) {
            this.fail = builder.fail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Fails create() {
            return builder().build();
        }

        /**
         * @return fail
         */
        public java.util.List < Fail> getFail() {
            return this.fail;
        }

        public static final class Builder {
            private java.util.List < Fail> fail; 

            /**
             * Fail.
             */
            public Builder fail(java.util.List < Fail> fail) {
                this.fail = fail;
                return this;
            }

            public Fails build() {
                return new Fails(this);
            } 

        } 

    }
    public static class Success extends TeaModel {
        @NameInMap("Time")
        private String time;

        @NameInMap("Value")
        private String value;

        private Success(Builder builder) {
            this.time = builder.time;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Success create() {
            return builder().build();
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String time; 
            private String value; 

            /**
             * Time.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Success build() {
                return new Success(this);
            } 

        } 

    }
    public static class Successes extends TeaModel {
        @NameInMap("Success")
        private java.util.List < Success> success;

        private Successes(Builder builder) {
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Successes create() {
            return builder().build();
        }

        /**
         * @return success
         */
        public java.util.List < Success> getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private java.util.List < Success> success; 

            /**
             * Success.
             */
            public Builder success(java.util.List < Success> success) {
                this.success = success;
                return this;
            }

            public Successes build() {
                return new Successes(this);
            } 

        } 

    }
}
