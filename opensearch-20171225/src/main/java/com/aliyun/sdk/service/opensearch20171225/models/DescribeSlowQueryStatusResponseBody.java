// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

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
 * {@link DescribeSlowQueryStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSlowQueryStatusResponseBody</p>
 */
public class DescribeSlowQueryStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
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
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        private Builder() {
        } 

        private Builder(DescribeSlowQueryStatusResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>5C1C1C45-C64A-AD30-565F-140871D57E5E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The return result.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public DescribeSlowQueryStatusResponseBody build() {
            return new DescribeSlowQueryStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSlowQueryStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSlowQueryStatusResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("appGroupId")
        private String appGroupId;

        @com.aliyun.core.annotation.NameInMap("region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("status")
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

            private Builder() {
            } 

            private Builder(Result model) {
                this.appGroupId = model.appGroupId;
                this.region = model.region;
                this.status = model.status;
            } 

            /**
             * <p>The ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>100298370</p>
             */
            public Builder appGroupId(String appGroupId) {
                this.appGroupId = appGroupId;
                return this;
            }

            /**
             * <p>The network type of the slow query optimization service. Valid values:</p>
             * <ul>
             * <li>outer: the Internet</li>
             * <li>internal: the internal network</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>internal</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The status of the slow query optimization service. Valid values:</p>
             * <ul>
             * <li>enabled</li>
             * <li>disabled</li>
             * <li>n/a</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>disabled</p>
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
