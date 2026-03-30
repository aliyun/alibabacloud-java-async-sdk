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
 * {@link ListVoiceEnginesResponseBody} extends {@link TeaModel}
 *
 * <p>ListVoiceEnginesResponseBody</p>
 */
public class ListVoiceEnginesResponseBody extends TeaModel {
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

    private ListVoiceEnginesResponseBody(Builder builder) {
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

    public static ListVoiceEnginesResponseBody create() {
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

        private Builder(ListVoiceEnginesResponseBody model) {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListVoiceEnginesResponseBody build() {
            return new ListVoiceEnginesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListVoiceEnginesResponseBody} extends {@link TeaModel}
     *
     * <p>ListVoiceEnginesResponseBody</p>
     */
    public static class VoiceEngines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigSchema")
        private String configSchema;

        @com.aliyun.core.annotation.NameInMap("NlsEngine")
        private String nlsEngine;

        @com.aliyun.core.annotation.NameInMap("NlsEngineName")
        private String nlsEngineName;

        private VoiceEngines(Builder builder) {
            this.configSchema = builder.configSchema;
            this.nlsEngine = builder.nlsEngine;
            this.nlsEngineName = builder.nlsEngineName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VoiceEngines create() {
            return builder().build();
        }

        /**
         * @return configSchema
         */
        public String getConfigSchema() {
            return this.configSchema;
        }

        /**
         * @return nlsEngine
         */
        public String getNlsEngine() {
            return this.nlsEngine;
        }

        /**
         * @return nlsEngineName
         */
        public String getNlsEngineName() {
            return this.nlsEngineName;
        }

        public static final class Builder {
            private String configSchema; 
            private String nlsEngine; 
            private String nlsEngineName; 

            private Builder() {
            } 

            private Builder(VoiceEngines model) {
                this.configSchema = model.configSchema;
                this.nlsEngine = model.nlsEngine;
                this.nlsEngineName = model.nlsEngineName;
            } 

            /**
             * ConfigSchema.
             */
            public Builder configSchema(String configSchema) {
                this.configSchema = configSchema;
                return this;
            }

            /**
             * NlsEngine.
             */
            public Builder nlsEngine(String nlsEngine) {
                this.nlsEngine = nlsEngine;
                return this;
            }

            /**
             * NlsEngineName.
             */
            public Builder nlsEngineName(String nlsEngineName) {
                this.nlsEngineName = nlsEngineName;
                return this;
            }

            public VoiceEngines build() {
                return new VoiceEngines(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListVoiceEnginesResponseBody} extends {@link TeaModel}
     *
     * <p>ListVoiceEnginesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        @com.aliyun.core.annotation.NameInMap("VoiceEngines")
        private java.util.List<VoiceEngines> voiceEngines;

        private Data(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
            this.voiceEngines = builder.voiceEngines;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return voiceEngines
         */
        public java.util.List<VoiceEngines> getVoiceEngines() {
            return this.voiceEngines;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 
            private java.util.List<VoiceEngines> voiceEngines; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
                this.voiceEngines = model.voiceEngines;
            } 

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * VoiceEngines.
             */
            public Builder voiceEngines(java.util.List<VoiceEngines> voiceEngines) {
                this.voiceEngines = voiceEngines;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
