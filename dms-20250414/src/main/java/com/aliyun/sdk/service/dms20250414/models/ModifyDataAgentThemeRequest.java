// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link ModifyDataAgentThemeRequest} extends {@link RequestModel}
 *
 * <p>ModifyDataAgentThemeRequest</p>
 */
public class ModifyDataAgentThemeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ThemeId")
    private String themeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ThemeName")
    private String themeName;

    private ModifyDataAgentThemeRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.themeId = builder.themeId;
        this.themeName = builder.themeName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDataAgentThemeRequest create() {
        return builder().build();
    }

@Override
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
     * @return themeId
     */
    public String getThemeId() {
        return this.themeId;
    }

    /**
     * @return themeName
     */
    public String getThemeName() {
        return this.themeName;
    }

    public static final class Builder extends Request.Builder<ModifyDataAgentThemeRequest, Builder> {
        private String description; 
        private String themeId; 
        private String themeName; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDataAgentThemeRequest request) {
            super(request);
            this.description = request.description;
            this.themeId = request.themeId;
            this.themeName = request.themeName;
        } 

        /**
         * <p>The description of the theme. Maximum length: 255 characters. A value of null indicates that the field is not modified. An empty string clears the field.</p>
         * 
         * <strong>example:</strong>
         * <p>weekly report</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The business identifier of the theme.</p>
         * 
         * <strong>example:</strong>
         * <p>0f8b2c1d-<strong><strong>-</strong></strong>-****-9a3e5f7b1c2d</p>
         */
        public Builder themeId(String themeId) {
            this.putQueryParameter("ThemeId", themeId);
            this.themeId = themeId;
            return this;
        }

        /**
         * <p>The display name of the theme. Maximum length: 64 characters. A value of null indicates that the field is not modified. An empty string clears the field.</p>
         * 
         * <strong>example:</strong>
         * <p>weekly report</p>
         */
        public Builder themeName(String themeName) {
            this.putQueryParameter("ThemeName", themeName);
            this.themeName = themeName;
            return this;
        }

        @Override
        public ModifyDataAgentThemeRequest build() {
            return new ModifyDataAgentThemeRequest(this);
        } 

    } 

}
