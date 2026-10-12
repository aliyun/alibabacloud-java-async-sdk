// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

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
 * {@link GetAsrConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetAsrConfigResponseBody</p>
 */
public class GetAsrConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetAsrConfigResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMsg = builder.errorMsg;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAsrConfigResponseBody create() {
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
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String errorMsg; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetAsrConfigResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMsg = model.errorMsg;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Not Found</p>
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>14C39896-AE6D-4643-9C9A-E0566B2C2DDD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetAsrConfigResponseBody build() {
            return new GetAsrConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAsrConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetAsrConfigResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppKey")
        private String appKey;

        @com.aliyun.core.annotation.NameInMap("AsrAcousticModelId")
        private String asrAcousticModelId;

        @com.aliyun.core.annotation.NameInMap("AsrClassVocabularyId")
        private String asrClassVocabularyId;

        @com.aliyun.core.annotation.NameInMap("AsrCustomizationId")
        private String asrCustomizationId;

        @com.aliyun.core.annotation.NameInMap("AsrOverrides")
        private String asrOverrides;

        @com.aliyun.core.annotation.NameInMap("AsrOverridesUuid")
        private String asrOverridesUuid;

        @com.aliyun.core.annotation.NameInMap("AsrVocabularyId")
        private String asrVocabularyId;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("EngineXufei")
        private String engineXufei;

        @com.aliyun.core.annotation.NameInMap("NlsServiceType")
        private String nlsServiceType;

        private Data(Builder builder) {
            this.appKey = builder.appKey;
            this.asrAcousticModelId = builder.asrAcousticModelId;
            this.asrClassVocabularyId = builder.asrClassVocabularyId;
            this.asrCustomizationId = builder.asrCustomizationId;
            this.asrOverrides = builder.asrOverrides;
            this.asrOverridesUuid = builder.asrOverridesUuid;
            this.asrVocabularyId = builder.asrVocabularyId;
            this.engine = builder.engine;
            this.engineXufei = builder.engineXufei;
            this.nlsServiceType = builder.nlsServiceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appKey
         */
        public String getAppKey() {
            return this.appKey;
        }

        /**
         * @return asrAcousticModelId
         */
        public String getAsrAcousticModelId() {
            return this.asrAcousticModelId;
        }

        /**
         * @return asrClassVocabularyId
         */
        public String getAsrClassVocabularyId() {
            return this.asrClassVocabularyId;
        }

        /**
         * @return asrCustomizationId
         */
        public String getAsrCustomizationId() {
            return this.asrCustomizationId;
        }

        /**
         * @return asrOverrides
         */
        public String getAsrOverrides() {
            return this.asrOverrides;
        }

        /**
         * @return asrOverridesUuid
         */
        public String getAsrOverridesUuid() {
            return this.asrOverridesUuid;
        }

        /**
         * @return asrVocabularyId
         */
        public String getAsrVocabularyId() {
            return this.asrVocabularyId;
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return engineXufei
         */
        public String getEngineXufei() {
            return this.engineXufei;
        }

        /**
         * @return nlsServiceType
         */
        public String getNlsServiceType() {
            return this.nlsServiceType;
        }

        public static final class Builder {
            private String appKey; 
            private String asrAcousticModelId; 
            private String asrClassVocabularyId; 
            private String asrCustomizationId; 
            private String asrOverrides; 
            private String asrOverridesUuid; 
            private String asrVocabularyId; 
            private String engine; 
            private String engineXufei; 
            private String nlsServiceType; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.appKey = model.appKey;
                this.asrAcousticModelId = model.asrAcousticModelId;
                this.asrClassVocabularyId = model.asrClassVocabularyId;
                this.asrCustomizationId = model.asrCustomizationId;
                this.asrOverrides = model.asrOverrides;
                this.asrOverridesUuid = model.asrOverridesUuid;
                this.asrVocabularyId = model.asrVocabularyId;
                this.engine = model.engine;
                this.engineXufei = model.engineXufei;
                this.nlsServiceType = model.nlsServiceType;
            } 

            /**
             * <p>The engine.</p>
             * 
             * <strong>example:</strong>
             * <p>your-app-key</p>
             */
            public Builder appKey(String appKey) {
                this.appKey = appKey;
                return this;
            }

            /**
             * <p>The ASR acoustic model ID.</p>
             * 
             * <strong>example:</strong>
             * <p>3b1d3031-8b6e-460a-8640-d330f2ca50b8</p>
             */
            public Builder asrAcousticModelId(String asrAcousticModelId) {
                this.asrAcousticModelId = asrAcousticModelId;
                return this;
            }

            /**
             * <p>The ASR hotword ID.</p>
             * 
             * <strong>example:</strong>
             * <p>3b1d3031-8b6e-460a-8640-d330f2ca50b8</p>
             */
            public Builder asrClassVocabularyId(String asrClassVocabularyId) {
                this.asrClassVocabularyId = asrClassVocabularyId;
                return this;
            }

            /**
             * <p>The ASR dataset ID.</p>
             * 
             * <strong>example:</strong>
             * <p>3b1d3031-8b6e-460a-8640-d330f2ca50b8</p>
             */
            public Builder asrCustomizationId(String asrCustomizationId) {
                this.asrCustomizationId = asrCustomizationId;
                return this;
            }

            /**
             * AsrOverrides.
             */
            public Builder asrOverrides(String asrOverrides) {
                this.asrOverrides = asrOverrides;
                return this;
            }

            /**
             * <p>The ASR correction dictionary ID.</p>
             * 
             * <strong>example:</strong>
             * <p>94001ae8-72fd-4f93-84dc-e58e2b20363b</p>
             */
            public Builder asrOverridesUuid(String asrOverridesUuid) {
                this.asrOverridesUuid = asrOverridesUuid;
                return this;
            }

            /**
             * <p>The hotword ID. You can view the ASR hotword ID on the <a href="https://aiccs.console.aliyun.com/sentence/vocab?spm=a2c4g.11186623.0.0.7f9bf965IKBpsi">ASR Hotword Management page</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>3b1d3031-8b6e-460a-8640-d330f2ca50b8</p>
             */
            public Builder asrVocabularyId(String asrVocabularyId) {
                this.asrVocabularyId = asrVocabularyId;
                return this;
            }

            /**
             * <p>The speech engine.</p>
             * 
             * <strong>example:</strong>
             * <p>ali</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>The iFLYTEK engine parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>EngineXufei</p>
             */
            public Builder engineXufei(String engineXufei) {
                this.engineXufei = engineXufei;
                return this;
            }

            /**
             * <p>NluServiceType</p>
             * 
             * <strong>example:</strong>
             * <p>Authorized</p>
             */
            public Builder nlsServiceType(String nlsServiceType) {
                this.nlsServiceType = nlsServiceType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
