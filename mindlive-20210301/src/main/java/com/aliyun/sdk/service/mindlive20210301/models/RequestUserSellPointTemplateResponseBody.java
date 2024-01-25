// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mindlive20210301.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RequestUserSellPointTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>RequestUserSellPointTemplateResponseBody</p>
 */
public class RequestUserSellPointTemplateResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private RequestUserSellPointTemplateResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RequestUserSellPointTemplateResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public RequestUserSellPointTemplateResponseBody build() {
            return new RequestUserSellPointTemplateResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("DisplayConfig")
        private java.util.Map < String, ? > displayConfig;

        @NameInMap("TemplateConfig")
        private java.util.Map < String, ? > templateConfig;

        @NameInMap("TemplateUuid")
        private String templateUuid;

        @NameInMap("Url")
        private String url;

        private Data(Builder builder) {
            this.displayConfig = builder.displayConfig;
            this.templateConfig = builder.templateConfig;
            this.templateUuid = builder.templateUuid;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return displayConfig
         */
        public java.util.Map < String, ? > getDisplayConfig() {
            return this.displayConfig;
        }

        /**
         * @return templateConfig
         */
        public java.util.Map < String, ? > getTemplateConfig() {
            return this.templateConfig;
        }

        /**
         * @return templateUuid
         */
        public String getTemplateUuid() {
            return this.templateUuid;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private java.util.Map < String, ? > displayConfig; 
            private java.util.Map < String, ? > templateConfig; 
            private String templateUuid; 
            private String url; 

            /**
             * DisplayConfig.
             */
            public Builder displayConfig(java.util.Map < String, ? > displayConfig) {
                this.displayConfig = displayConfig;
                return this;
            }

            /**
             * TemplateConfig.
             */
            public Builder templateConfig(java.util.Map < String, ? > templateConfig) {
                this.templateConfig = templateConfig;
                return this;
            }

            /**
             * TemplateUuid.
             */
            public Builder templateUuid(String templateUuid) {
                this.templateUuid = templateUuid;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
