// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link DescribeSnapshotSettingResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSnapshotSettingResponseBody</p>
 */
public class DescribeSnapshotSettingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
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

        private Builder(DescribeSnapshotSettingResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The return results.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public DescribeSnapshotSettingResponseBody build() {
            return new DescribeSnapshotSettingResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSnapshotSettingResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSnapshotSettingResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("QuartzRegex")
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

            private Builder() {
            } 

            private Builder(Result model) {
                this.enable = model.enable;
                this.quartzRegex = model.quartzRegex;
            } 

            /**
             * <p>Whether to enable automatic backup.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>Automatic backup time configuration, using Quartz Cron expression.</p>
             * 
             * <strong>example:</strong>
             * <p>0 0 01 ? * * *</p>
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
