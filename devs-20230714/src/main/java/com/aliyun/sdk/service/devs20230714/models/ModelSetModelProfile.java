// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

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
 * {@link ModelSetModelProfile} extends {@link TeaModel}
 *
 * <p>ModelSetModelProfile</p>
 */
public class ModelSetModelProfile extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("displayName")
    private String displayName;

    @com.aliyun.core.annotation.NameInMap("enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.NameInMap("props")
    private Props props;

    @com.aliyun.core.annotation.NameInMap("sourceType")
    private String sourceType;

    private ModelSetModelProfile(Builder builder) {
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.enabled = builder.enabled;
        this.name = builder.name;
        this.props = builder.props;
        this.sourceType = builder.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelSetModelProfile create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return props
     */
    public Props getProps() {
        return this.props;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    public static final class Builder {
        private String description; 
        private String displayName; 
        private Boolean enabled; 
        private String name; 
        private Props props; 
        private String sourceType; 

        private Builder() {
        } 

        private Builder(ModelSetModelProfile model) {
            this.description = model.description;
            this.displayName = model.displayName;
            this.enabled = model.enabled;
            this.name = model.name;
            this.props = model.props;
            this.sourceType = model.sourceType;
        } 

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * displayName.
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * enabled.
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-turbo-latest</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * props.
         */
        public Builder props(Props props) {
            this.props = props;
            return this;
        }

        /**
         * sourceType.
         */
        public Builder sourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        public ModelSetModelProfile build() {
            return new ModelSetModelProfile(this);
        } 

    } 

    /**
     * 
     * {@link ModelSetModelProfile} extends {@link TeaModel}
     *
     * <p>ModelSetModelProfile</p>
     */
    public static class Props extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("contextSize")
        private Long contextSize;

        @com.aliyun.core.annotation.NameInMap("llmMode")
        private String llmMode;

        private Props(Builder builder) {
            this.contextSize = builder.contextSize;
            this.llmMode = builder.llmMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Props create() {
            return builder().build();
        }

        /**
         * @return contextSize
         */
        public Long getContextSize() {
            return this.contextSize;
        }

        /**
         * @return llmMode
         */
        public String getLlmMode() {
            return this.llmMode;
        }

        public static final class Builder {
            private Long contextSize; 
            private String llmMode; 

            private Builder() {
            } 

            private Builder(Props model) {
                this.contextSize = model.contextSize;
                this.llmMode = model.llmMode;
            } 

            /**
             * contextSize.
             */
            public Builder contextSize(Long contextSize) {
                this.contextSize = contextSize;
                return this;
            }

            /**
             * llmMode.
             */
            public Builder llmMode(String llmMode) {
                this.llmMode = llmMode;
                return this;
            }

            public Props build() {
                return new Props(this);
            } 

        } 

    }
}
