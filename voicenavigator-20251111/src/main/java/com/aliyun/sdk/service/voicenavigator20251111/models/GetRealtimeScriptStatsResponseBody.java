// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20251111.models;

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
 * {@link GetRealtimeScriptStatsResponseBody} extends {@link TeaModel}
 *
 * <p>GetRealtimeScriptStatsResponseBody</p>
 */
public class GetRealtimeScriptStatsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Params")
    private java.util.List<String> params;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetRealtimeScriptStatsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.params = builder.params;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRealtimeScriptStatsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return params
     */
    public java.util.List<String> getParams() {
        return this.params;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private java.util.List<String> params; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetRealtimeScriptStatsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.params = model.params;
            this.requestId = model.requestId;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * Params.
         */
        public Builder params(java.util.List<String> params) {
            this.params = params;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>d74d6290-7cbe-4436-b5d7-014ebb0f4060</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetRealtimeScriptStatsResponseBody build() {
            return new GetRealtimeScriptStatsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRealtimeScriptStatsResponseBody} extends {@link TeaModel}
     *
     * <p>GetRealtimeScriptStatsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfiguredConcurrency")
        private Integer configuredConcurrency;

        @com.aliyun.core.annotation.NameInMap("StatsTime")
        private Long statsTime;

        @com.aliyun.core.annotation.NameInMap("UsedConcurrency")
        private Integer usedConcurrency;

        private Data(Builder builder) {
            this.configuredConcurrency = builder.configuredConcurrency;
            this.statsTime = builder.statsTime;
            this.usedConcurrency = builder.usedConcurrency;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return configuredConcurrency
         */
        public Integer getConfiguredConcurrency() {
            return this.configuredConcurrency;
        }

        /**
         * @return statsTime
         */
        public Long getStatsTime() {
            return this.statsTime;
        }

        /**
         * @return usedConcurrency
         */
        public Integer getUsedConcurrency() {
            return this.usedConcurrency;
        }

        public static final class Builder {
            private Integer configuredConcurrency; 
            private Long statsTime; 
            private Integer usedConcurrency; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.configuredConcurrency = model.configuredConcurrency;
                this.statsTime = model.statsTime;
                this.usedConcurrency = model.usedConcurrency;
            } 

            /**
             * ConfiguredConcurrency.
             */
            public Builder configuredConcurrency(Integer configuredConcurrency) {
                this.configuredConcurrency = configuredConcurrency;
                return this;
            }

            /**
             * StatsTime.
             */
            public Builder statsTime(Long statsTime) {
                this.statsTime = statsTime;
                return this;
            }

            /**
             * UsedConcurrency.
             */
            public Builder usedConcurrency(Integer usedConcurrency) {
                this.usedConcurrency = usedConcurrency;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
