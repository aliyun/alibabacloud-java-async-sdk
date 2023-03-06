// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSnapshotSettingResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSnapshotSettingResponseBody</p>
 */
public class DescribeSnapshotSettingResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private DescribeSnapshotSettingResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSnapshotSettingResponseBody create() {
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
         * The return results.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public DescribeSnapshotSettingResponseBody build() {
            return new DescribeSnapshotSettingResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("Enable")
        private Boolean enable;

        @NameInMap("QuartzRegex")
        private String quartzRegex;

        private Result(Builder builder) {
            this.enable = builder.enable;
            this.quartzRegex = builder.quartzRegex;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return quartzRegex
         */
        public String getQuartzRegex() {
            return this.quartzRegex;
        }

        public static final class Builder {
            private Boolean enable; 
            private String quartzRegex; 

            /**
             * Whether to enable automatic backup.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * Automatic backup time configuration, using Quartz Cron expression.
             */
            public Builder quartzRegex(String quartzRegex) {
                this.quartzRegex = quartzRegex;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
