// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link GetTextTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>GetTextTemplateResponseBody</p>
 */
public class GetTextTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("availableIndustry")
    private AvailableIndustry availableIndustry;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetTextTemplateResponseBody(Builder builder) {
        this.availableIndustry = builder.availableIndustry;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTextTemplateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return availableIndustry
     */
    public AvailableIndustry getAvailableIndustry() {
        return this.availableIndustry;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AvailableIndustry availableIndustry; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetTextTemplateResponseBody model) {
            this.availableIndustry = model.availableIndustry;
            this.requestId = model.requestId;
        } 

        /**
         * availableIndustry.
         */
        public Builder availableIndustry(AvailableIndustry availableIndustry) {
            this.availableIndustry = availableIndustry;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetTextTemplateResponseBody build() {
            return new GetTextTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTextTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetTextTemplateResponseBody</p>
     */
    public static class TextStyles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("disabled")
        private Boolean disabled;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("templateKey")
        private String templateKey;

        private TextStyles(Builder builder) {
            this.desc = builder.desc;
            this.disabled = builder.disabled;
            this.name = builder.name;
            this.templateKey = builder.templateKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TextStyles create() {
            return builder().build();
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return disabled
         */
        public Boolean getDisabled() {
            return this.disabled;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return templateKey
         */
        public String getTemplateKey() {
            return this.templateKey;
        }

        public static final class Builder {
            private String desc; 
            private Boolean disabled; 
            private String name; 
            private String templateKey; 

            private Builder() {
            } 

            private Builder(TextStyles model) {
                this.desc = model.desc;
                this.disabled = model.disabled;
                this.name = model.name;
                this.templateKey = model.templateKey;
            } 

            /**
             * desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * disabled.
             */
            public Builder disabled(Boolean disabled) {
                this.disabled = disabled;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * templateKey.
             */
            public Builder templateKey(String templateKey) {
                this.templateKey = templateKey;
                return this;
            }

            public TextStyles build() {
                return new TextStyles(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTextTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetTextTemplateResponseBody</p>
     */
    public static class TextModeTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("textStyles")
        private java.util.List<TextStyles> textStyles;

        private TextModeTypes(Builder builder) {
            this.name = builder.name;
            this.textStyles = builder.textStyles;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TextModeTypes create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return textStyles
         */
        public java.util.List<TextStyles> getTextStyles() {
            return this.textStyles;
        }

        public static final class Builder {
            private String name; 
            private java.util.List<TextStyles> textStyles; 

            private Builder() {
            } 

            private Builder(TextModeTypes model) {
                this.name = model.name;
                this.textStyles = model.textStyles;
            } 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * textStyles.
             */
            public Builder textStyles(java.util.List<TextStyles> textStyles) {
                this.textStyles = textStyles;
                return this;
            }

            public TextModeTypes build() {
                return new TextModeTypes(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTextTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetTextTemplateResponseBody</p>
     */
    public static class AvailableIndustry extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("textModeTypes")
        private java.util.List<TextModeTypes> textModeTypes;

        private AvailableIndustry(Builder builder) {
            this.name = builder.name;
            this.textModeTypes = builder.textModeTypes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableIndustry create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return textModeTypes
         */
        public java.util.List<TextModeTypes> getTextModeTypes() {
            return this.textModeTypes;
        }

        public static final class Builder {
            private String name; 
            private java.util.List<TextModeTypes> textModeTypes; 

            private Builder() {
            } 

            private Builder(AvailableIndustry model) {
                this.name = model.name;
                this.textModeTypes = model.textModeTypes;
            } 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * textModeTypes.
             */
            public Builder textModeTypes(java.util.List<TextModeTypes> textModeTypes) {
                this.textModeTypes = textModeTypes;
                return this;
            }

            public AvailableIndustry build() {
                return new AvailableIndustry(this);
            } 

        } 

    }
}
