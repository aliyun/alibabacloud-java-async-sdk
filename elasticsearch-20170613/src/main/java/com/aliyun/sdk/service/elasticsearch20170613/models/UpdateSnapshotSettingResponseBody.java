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
 * {@link UpdateSnapshotSettingResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateSnapshotSettingResponseBody</p>
 */
public class UpdateSnapshotSettingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private UpdateSnapshotSettingResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSnapshotSettingResponseBody create() {
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

        private Builder(UpdateSnapshotSettingResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned result.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public UpdateSnapshotSettingResponseBody build() {
            return new UpdateSnapshotSettingResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateSnapshotSettingResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateSnapshotSettingResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("indices")
        private java.util.List<String> indices;

        @com.aliyun.core.annotation.NameInMap("quartzRegex")
        private String quartzRegex;

        private Result(Builder builder) {
            this.enable = builder.enable;
            this.indices = builder.indices;
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
         * @return indices
         */
        public java.util.List<String> getIndices() {
            return this.indices;
        }

        /**
         * @return quartzRegex
         */
        public String getQuartzRegex() {
            return this.quartzRegex;
        }

        public static final class Builder {
            private Boolean enable; 
            private java.util.List<String> indices; 
            private String quartzRegex; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.enable = model.enable;
                this.indices = model.indices;
                this.quartzRegex = model.quartzRegex;
            } 

            /**
             * <p>Indicates whether automatic backup is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The list of indexes to back up.</p>
             */
            public Builder indices(java.util.List<String> indices) {
                this.indices = indices;
                return this;
            }

            /**
             * <p>The automatic backup start time.</p>
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
