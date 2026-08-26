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
 * {@link CreateDataAgentThemeRequest} extends {@link RequestModel}
 *
 * <p>CreateDataAgentThemeRequest</p>
 */
public class CreateDataAgentThemeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Category")
    private String category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileFrom")
    private String fileFrom;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ThemeId")
    private String themeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ThemeName")
    private String themeName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ThemeType")
    private String themeType;

    private CreateDataAgentThemeRequest(Builder builder) {
        super(builder);
        this.category = builder.category;
        this.description = builder.description;
        this.fileFrom = builder.fileFrom;
        this.themeId = builder.themeId;
        this.themeName = builder.themeName;
        this.themeType = builder.themeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataAgentThemeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return fileFrom
     */
    public String getFileFrom() {
        return this.fileFrom;
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

    /**
     * @return themeType
     */
    public String getThemeType() {
        return this.themeType;
    }

    public static final class Builder extends Request.Builder<CreateDataAgentThemeRequest, Builder> {
        private String category; 
        private String description; 
        private String fileFrom; 
        private String themeId; 
        private String themeName; 
        private String themeType; 

        private Builder() {
            super();
        } 

        private Builder(CreateDataAgentThemeRequest request) {
            super(request);
            this.category = request.category;
            this.description = request.description;
            this.fileFrom = request.fileFrom;
            this.themeId = request.themeId;
            this.themeName = request.themeName;
            this.themeType = request.themeType;
        } 

        /**
         * Category.
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * FileFrom.
         */
        public Builder fileFrom(String fileFrom) {
            this.putQueryParameter("FileFrom", fileFrom);
            this.fileFrom = fileFrom;
            return this;
        }

        /**
         * ThemeId.
         */
        public Builder themeId(String themeId) {
            this.putQueryParameter("ThemeId", themeId);
            this.themeId = themeId;
            return this;
        }

        /**
         * ThemeName.
         */
        public Builder themeName(String themeName) {
            this.putQueryParameter("ThemeName", themeName);
            this.themeName = themeName;
            return this;
        }

        /**
         * ThemeType.
         */
        public Builder themeType(String themeType) {
            this.putQueryParameter("ThemeType", themeType);
            this.themeType = themeType;
            return this;
        }

        @Override
        public CreateDataAgentThemeRequest build() {
            return new CreateDataAgentThemeRequest(this);
        } 

    } 

}
