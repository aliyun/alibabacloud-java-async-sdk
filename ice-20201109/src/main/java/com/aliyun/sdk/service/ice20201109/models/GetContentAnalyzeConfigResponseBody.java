// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link GetContentAnalyzeConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetContentAnalyzeConfigResponseBody</p>
 */
public class GetContentAnalyzeConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ContentAnalyzeConfig")
    private ContentAnalyzeConfig contentAnalyzeConfig;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetContentAnalyzeConfigResponseBody(Builder builder) {
        this.contentAnalyzeConfig = builder.contentAnalyzeConfig;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetContentAnalyzeConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contentAnalyzeConfig
     */
    public ContentAnalyzeConfig getContentAnalyzeConfig() {
        return this.contentAnalyzeConfig;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ContentAnalyzeConfig contentAnalyzeConfig; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetContentAnalyzeConfigResponseBody model) {
            this.contentAnalyzeConfig = model.contentAnalyzeConfig;
            this.requestId = model.requestId;
        } 

        /**
         * ContentAnalyzeConfig.
         */
        public Builder contentAnalyzeConfig(ContentAnalyzeConfig contentAnalyzeConfig) {
            this.contentAnalyzeConfig = contentAnalyzeConfig;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetContentAnalyzeConfigResponseBody build() {
            return new GetContentAnalyzeConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetContentAnalyzeConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetContentAnalyzeConfigResponseBody</p>
     */
    public static class ContentAnalyzeConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Auto")
        private Boolean auto;

        @com.aliyun.core.annotation.NameInMap("SaveType")
        private String saveType;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        private ContentAnalyzeConfig(Builder builder) {
            this.auto = builder.auto;
            this.saveType = builder.saveType;
            this.templateId = builder.templateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContentAnalyzeConfig create() {
            return builder().build();
        }

        /**
         * @return auto
         */
        public Boolean getAuto() {
            return this.auto;
        }

        /**
         * @return saveType
         */
        public String getSaveType() {
            return this.saveType;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        public static final class Builder {
            private Boolean auto; 
            private String saveType; 
            private String templateId; 

            private Builder() {
            } 

            private Builder(ContentAnalyzeConfig model) {
                this.auto = model.auto;
                this.saveType = model.saveType;
                this.templateId = model.templateId;
            } 

            /**
             * Auto.
             */
            public Builder auto(Boolean auto) {
                this.auto = auto;
                return this;
            }

            /**
             * SaveType.
             */
            public Builder saveType(String saveType) {
                this.saveType = saveType;
                return this;
            }

            /**
             * TemplateId.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            public ContentAnalyzeConfig build() {
                return new ContentAnalyzeConfig(this);
            } 

        } 

    }
}
