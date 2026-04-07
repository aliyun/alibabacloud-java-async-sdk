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
 * {@link GetRealtimeInstanceStatsResponseBody} extends {@link TeaModel}
 *
 * <p>GetRealtimeInstanceStatsResponseBody</p>
 */
public class GetRealtimeInstanceStatsResponseBody extends TeaModel {
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

    private GetRealtimeInstanceStatsResponseBody(Builder builder) {
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

    public static GetRealtimeInstanceStatsResponseBody create() {
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

        private Builder(GetRealtimeInstanceStatsResponseBody model) {
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
         * <p>3a530dc0-7cfa-48f6-9539-bf9001e77b16</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetRealtimeInstanceStatsResponseBody build() {
            return new GetRealtimeInstanceStatsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRealtimeInstanceStatsResponseBody} extends {@link TeaModel}
     *
     * <p>GetRealtimeInstanceStatsResponseBody</p>
     */
    public static class RealtimeScriptStatsList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfiguredConcurrency")
        private Integer configuredConcurrency;

        @com.aliyun.core.annotation.NameInMap("ScriptId")
        private String scriptId;

        @com.aliyun.core.annotation.NameInMap("ScriptName")
        private String scriptName;

        @com.aliyun.core.annotation.NameInMap("StatsTime")
        private Long statsTime;

        @com.aliyun.core.annotation.NameInMap("UsedConcurrency")
        private Integer usedConcurrency;

        private RealtimeScriptStatsList(Builder builder) {
            this.configuredConcurrency = builder.configuredConcurrency;
            this.scriptId = builder.scriptId;
            this.scriptName = builder.scriptName;
            this.statsTime = builder.statsTime;
            this.usedConcurrency = builder.usedConcurrency;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RealtimeScriptStatsList create() {
            return builder().build();
        }

        /**
         * @return configuredConcurrency
         */
        public Integer getConfiguredConcurrency() {
            return this.configuredConcurrency;
        }

        /**
         * @return scriptId
         */
        public String getScriptId() {
            return this.scriptId;
        }

        /**
         * @return scriptName
         */
        public String getScriptName() {
            return this.scriptName;
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
            private String scriptId; 
            private String scriptName; 
            private Long statsTime; 
            private Integer usedConcurrency; 

            private Builder() {
            } 

            private Builder(RealtimeScriptStatsList model) {
                this.configuredConcurrency = model.configuredConcurrency;
                this.scriptId = model.scriptId;
                this.scriptName = model.scriptName;
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
             * ScriptId.
             */
            public Builder scriptId(String scriptId) {
                this.scriptId = scriptId;
                return this;
            }

            /**
             * ScriptName.
             */
            public Builder scriptName(String scriptName) {
                this.scriptName = scriptName;
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

            public RealtimeScriptStatsList build() {
                return new RealtimeScriptStatsList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRealtimeInstanceStatsResponseBody} extends {@link TeaModel}
     *
     * <p>GetRealtimeInstanceStatsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfiguredConcurrency")
        private Integer configuredConcurrency;

        @com.aliyun.core.annotation.NameInMap("RealtimeScriptStatsList")
        private java.util.List<RealtimeScriptStatsList> realtimeScriptStatsList;

        @com.aliyun.core.annotation.NameInMap("StatsTime")
        private Long statsTime;

        @com.aliyun.core.annotation.NameInMap("UsedConcurrency")
        private Integer usedConcurrency;

        private Data(Builder builder) {
            this.configuredConcurrency = builder.configuredConcurrency;
            this.realtimeScriptStatsList = builder.realtimeScriptStatsList;
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
         * @return realtimeScriptStatsList
         */
        public java.util.List<RealtimeScriptStatsList> getRealtimeScriptStatsList() {
            return this.realtimeScriptStatsList;
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
            private java.util.List<RealtimeScriptStatsList> realtimeScriptStatsList; 
            private Long statsTime; 
            private Integer usedConcurrency; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.configuredConcurrency = model.configuredConcurrency;
                this.realtimeScriptStatsList = model.realtimeScriptStatsList;
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
             * RealtimeScriptStatsList.
             */
            public Builder realtimeScriptStatsList(java.util.List<RealtimeScriptStatsList> realtimeScriptStatsList) {
                this.realtimeScriptStatsList = realtimeScriptStatsList;
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
