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
         * <p>The application scenario, which affects filtering when viewing the theme list in the console. Valid values:</p>
         * <ul>
         * <li>(Recommended) custom: a user-uploaded custom theme with no preset style or information organization structure.</li>
         * <li>report: a web report that conforms to the DataAgent information organization structure.</li>
         * <li>(Not supported) infographic: an infographic that conforms to the DataAgent information organization structure.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * <p>The description. The value can be up to 255 characters in length.</p>
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
         * <p>The file source, which affects the backend logic for determining whether the theme is valid. Valid values:</p>
         * <ul>
         * <li>upload: uploaded through OSS.</li>
         * <li>(Not supported) public_url: provided through an OSS URL that allows public network access.</li>
         * <li>(Not supported) user_oss: provided through a user OSS URL.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>upload</p>
         */
        public Builder fileFrom(String fileFrom) {
            this.putQueryParameter("FileFrom", fileFrom);
            this.fileFrom = fileFrom;
            return this;
        }

        /**
         * <p>The UUID of the theme. The value must be returned by GetDataAgentThemeUploadSignature, and the file must have been uploaded. If the UUID is forged or the file has not been uploaded, the creation fails.</p>
         * 
         * <strong>example:</strong>
         * <p>0f8b2c1d************9a3e5f7b1c2d</p>
         */
        public Builder themeId(String themeId) {
            this.putQueryParameter("ThemeId", themeId);
            this.themeId = themeId;
            return this;
        }

        /**
         * <p>The display name of the theme. The value can be up to 64 characters in length. This parameter is required during creation.</p>
         * 
         * <strong>example:</strong>
         * <p>weekly report</p>
         */
        public Builder themeName(String themeName) {
            this.putQueryParameter("ThemeName", themeName);
            this.themeName = themeName;
            return this;
        }

        /**
         * <p>The type of the custom theme. Valid values:</p>
         * <ul>
         * <li>(Default) template: The theme is a template.</li>
         * <li>(Not supported) design: The theme is a DESIGN.md file.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>template</p>
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
