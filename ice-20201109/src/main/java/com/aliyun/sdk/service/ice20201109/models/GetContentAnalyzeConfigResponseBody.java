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
         * <p>The configuration for Intelligent Content Analysis.</p>
         */
        public Builder contentAnalyzeConfig(ContentAnalyzeConfig contentAnalyzeConfig) {
            this.contentAnalyzeConfig = contentAnalyzeConfig;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>31FEC819-2344-5771-9366-9172DB0D26C9</p>
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
             * <p>Specifies if Intelligent Content Analysis starts automatically after a Media Asset is registered.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p><code>true</code>: Enabled.</p>
             * </li>
             * <li><p><code>false</code>: Disabled. (default)</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder auto(Boolean auto) {
                this.auto = auto;
                return this;
            }

            /**
             * <p>The repository type for saving analysis results. This parameter is valid only when <code>Auto</code> is set to <code>true</code>. The default is an empty string.</p>
             * <ul>
             * <li><p><code>TEXT</code>: Label</p>
             * </li>
             * <li><p><code>FACE</code>: Face</p>
             * </li>
             * <li><p><code>DNA</code>: Image DNA</p>
             * </li>
             * </ul>
             * <p>You can specify multiple values, separated by commas (,). If this parameter is left empty, the analysis results are not saved to any search repository and cannot be used for content search.</p>
             * 
             * <strong>example:</strong>
             * <p>TEXT,FACE</p>
             */
            public Builder saveType(String saveType) {
                this.saveType = saveType;
                return this;
            }

            /**
             * <p>The ID of the Intelligent Content Analysis template. Each template includes the following AI capabilities:</p>
             * <ul>
             * <li><p><code>S00000101-100040</code>: Text Recognition</p>
             * </li>
             * <li><p><code>S00000101-100060</code>: Video Classification and Face Recognition</p>
             * </li>
             * <li><p><code>S00000101-100070</code>: Text Recognition, Video Classification, and Face Recognition</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>S00000101-100070</p>
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
