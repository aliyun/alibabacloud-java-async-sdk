// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExposureSettingsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeExposureSettingsResponseBody</p>
 */
public class DescribeExposureSettingsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private DescribeExposureSettingsResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExposureSettingsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private String code; 
        private String message; 
        private String requestId; 
        private Result result; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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

        public DescribeExposureSettingsResponseBody build() {
            return new DescribeExposureSettingsResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("DurationSeconds")
        private Integer durationSeconds;

        @NameInMap("ScenarioBased")
        private Boolean scenarioBased;

        private Result(Builder builder) {
            this.durationSeconds = builder.durationSeconds;
            this.scenarioBased = builder.scenarioBased;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return durationSeconds
         */
        public Integer getDurationSeconds() {
            return this.durationSeconds;
        }

        /**
         * @return scenarioBased
         */
        public Boolean getScenarioBased() {
            return this.scenarioBased;
        }

        public static final class Builder {
            private Integer durationSeconds; 
            private Boolean scenarioBased; 

            /**
             * DurationSeconds.
             */
            public Builder durationSeconds(Integer durationSeconds) {
                this.durationSeconds = durationSeconds;
                return this;
            }

            /**
             * ScenarioBased.
             */
            public Builder scenarioBased(Boolean scenarioBased) {
                this.scenarioBased = scenarioBased;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
