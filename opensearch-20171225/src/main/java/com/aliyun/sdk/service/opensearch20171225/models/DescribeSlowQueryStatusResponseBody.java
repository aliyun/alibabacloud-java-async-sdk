// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSlowQueryStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSlowQueryStatusResponseBody</p>
 */
public class DescribeSlowQueryStatusResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private Result result;

    private DescribeSlowQueryStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSlowQueryStatusResponseBody create() {
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
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The return result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public DescribeSlowQueryStatusResponseBody build() {
            return new DescribeSlowQueryStatusResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("appGroupId")
        private String appGroupId;

        @NameInMap("region")
        private String region;

        @NameInMap("status")
        private String status;

        private Result(Builder builder) {
            this.appGroupId = builder.appGroupId;
            this.region = builder.region;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return appGroupId
         */
        public String getAppGroupId() {
            return this.appGroupId;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String appGroupId; 
            private String region; 
            private String status; 

            /**
             * The ID of the application.
             */
            public Builder appGroupId(String appGroupId) {
                this.appGroupId = appGroupId;
                return this;
            }

            /**
             * The network type of the slow query optimization service. Valid values:
             * <p>
             * 
             * *   outer: the Internet
             * *   internal: the internal network
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * The status of the slow query optimization service. Valid values:
             * <p>
             * 
             * *   enabled
             * *   disabled
             * *   n/a
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
