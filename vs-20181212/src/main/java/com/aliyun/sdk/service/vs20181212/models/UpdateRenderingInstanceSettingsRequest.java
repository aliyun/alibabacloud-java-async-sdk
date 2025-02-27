// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link UpdateRenderingInstanceSettingsRequest} extends {@link RequestModel}
 *
 * <p>UpdateRenderingInstanceSettingsRequest</p>
 */
public class UpdateRenderingInstanceSettingsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RenderingInstanceId")
    private String renderingInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Settings")
    private java.util.List<Settings> settings;

    private UpdateRenderingInstanceSettingsRequest(Builder builder) {
        super(builder);
        this.renderingInstanceId = builder.renderingInstanceId;
        this.settings = builder.settings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRenderingInstanceSettingsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return renderingInstanceId
     */
    public String getRenderingInstanceId() {
        return this.renderingInstanceId;
    }

    /**
     * @return settings
     */
    public java.util.List<Settings> getSettings() {
        return this.settings;
    }

    public static final class Builder extends Request.Builder<UpdateRenderingInstanceSettingsRequest, Builder> {
        private String renderingInstanceId; 
        private java.util.List<Settings> settings; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRenderingInstanceSettingsRequest request) {
            super(request);
            this.renderingInstanceId = request.renderingInstanceId;
            this.settings = request.settings;
        } 

        /**
         * RenderingInstanceId.
         */
        public Builder renderingInstanceId(String renderingInstanceId) {
            this.putQueryParameter("RenderingInstanceId", renderingInstanceId);
            this.renderingInstanceId = renderingInstanceId;
            return this;
        }

        /**
         * Settings.
         */
        public Builder settings(java.util.List<Settings> settings) {
            String settingsShrink = shrink(settings, "Settings", "json");
            this.putQueryParameter("Settings", settingsShrink);
            this.settings = settings;
            return this;
        }

        @Override
        public UpdateRenderingInstanceSettingsRequest build() {
            return new UpdateRenderingInstanceSettingsRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateRenderingInstanceSettingsRequest} extends {@link TeaModel}
     *
     * <p>UpdateRenderingInstanceSettingsRequest</p>
     */
    public static class Settings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttributeName")
        private String attributeName;

        @com.aliyun.core.annotation.NameInMap("AttributeValue")
        private String attributeValue;

        private Settings(Builder builder) {
            this.attributeName = builder.attributeName;
            this.attributeValue = builder.attributeValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Settings create() {
            return builder().build();
        }

        /**
         * @return attributeName
         */
        public String getAttributeName() {
            return this.attributeName;
        }

        /**
         * @return attributeValue
         */
        public String getAttributeValue() {
            return this.attributeValue;
        }

        public static final class Builder {
            private String attributeName; 
            private String attributeValue; 

            /**
             * AttributeName.
             */
            public Builder attributeName(String attributeName) {
                this.attributeName = attributeName;
                return this;
            }

            /**
             * AttributeValue.
             */
            public Builder attributeValue(String attributeValue) {
                this.attributeValue = attributeValue;
                return this;
            }

            public Settings build() {
                return new Settings(this);
            } 

        } 

    }
}
