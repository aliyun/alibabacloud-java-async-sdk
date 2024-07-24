// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.es_serverless20230627.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSnapshotSettingResponseBody} extends {@link TeaModel}
 *
 * <p>GetSnapshotSettingResponseBody</p>
 */
public class GetSnapshotSettingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    private GetSnapshotSettingResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSnapshotSettingResponseBody create() {
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
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetSnapshotSettingResponseBody build() {
            return new GetSnapshotSettingResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("quartzRegex")
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
             * enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * quartzRegex.
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
