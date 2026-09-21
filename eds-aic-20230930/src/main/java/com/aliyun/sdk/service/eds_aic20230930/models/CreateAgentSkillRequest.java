// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link CreateAgentSkillRequest} extends {@link RequestModel}
 *
 * <p>CreateAgentSkillRequest</p>
 */
public class CreateAgentSkillRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileList")
    private java.util.List<String> fileList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IconKey")
    private String iconKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PackageOssKey")
    private String packageOssKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillDescription")
    private String skillDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillName")
    private String skillName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillPackageUrl")
    private String skillPackageUrl;

    private CreateAgentSkillRequest(Builder builder) {
        super(builder);
        this.fileList = builder.fileList;
        this.iconKey = builder.iconKey;
        this.packageOssKey = builder.packageOssKey;
        this.skillDescription = builder.skillDescription;
        this.skillName = builder.skillName;
        this.skillPackageUrl = builder.skillPackageUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAgentSkillRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileList
     */
    public java.util.List<String> getFileList() {
        return this.fileList;
    }

    /**
     * @return iconKey
     */
    public String getIconKey() {
        return this.iconKey;
    }

    /**
     * @return packageOssKey
     */
    public String getPackageOssKey() {
        return this.packageOssKey;
    }

    /**
     * @return skillDescription
     */
    public String getSkillDescription() {
        return this.skillDescription;
    }

    /**
     * @return skillName
     */
    public String getSkillName() {
        return this.skillName;
    }

    /**
     * @return skillPackageUrl
     */
    public String getSkillPackageUrl() {
        return this.skillPackageUrl;
    }

    public static final class Builder extends Request.Builder<CreateAgentSkillRequest, Builder> {
        private java.util.List<String> fileList; 
        private String iconKey; 
        private String packageOssKey; 
        private String skillDescription; 
        private String skillName; 
        private String skillPackageUrl; 

        private Builder() {
            super();
        } 

        private Builder(CreateAgentSkillRequest request) {
            super(request);
            this.fileList = request.fileList;
            this.iconKey = request.iconKey;
            this.packageOssKey = request.packageOssKey;
            this.skillDescription = request.skillDescription;
            this.skillName = request.skillName;
            this.skillPackageUrl = request.skillPackageUrl;
        } 

        /**
         * <p>The list of files in the skill package.</p>
         */
        public Builder fileList(java.util.List<String> fileList) {
            this.putQueryParameter("FileList", fileList);
            this.fileList = fileList;
            return this;
        }

        /**
         * <p>The icon of the custom skill.</p>
         * 
         * <strong>example:</strong>
         * <p>icon01</p>
         */
        public Builder iconKey(String iconKey) {
            this.putQueryParameter("IconKey", iconKey);
            this.iconKey = iconKey;
            return this;
        }

        /**
         * <p>The OSS path of the skill package. This parameter is reserved by the system and does not need to be specified.</p>
         * 
         * <strong>example:</strong>
         * <p>test/sk-test/current/skill.zip</p>
         */
        public Builder packageOssKey(String packageOssKey) {
            this.putQueryParameter("PackageOssKey", packageOssKey);
            this.packageOssKey = packageOssKey;
            return this;
        }

        /**
         * <p>The skill description.</p>
         * 
         * <strong>example:</strong>
         * <p>Current weather and forecasts with wttr.in via curl for locations, rain, temperature, travel planning.</p>
         */
        public Builder skillDescription(String skillDescription) {
            this.putQueryParameter("SkillDescription", skillDescription);
            this.skillDescription = skillDescription;
            return this;
        }

        /**
         * <p>The skill name.</p>
         * 
         * <strong>example:</strong>
         * <p>weather-enhanced</p>
         */
        public Builder skillName(String skillName) {
            this.putQueryParameter("SkillName", skillName);
            this.skillName = skillName;
            return this;
        }

        /**
         * <p>The OSS download URL of the skill package. This parameter is required for API calls.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://test.oss-cn-hangzhou.aliyuncs.com/weather_skill.zip?Expires=1788168088&OSSAccessKeyId=">https://test.oss-cn-hangzhou.aliyuncs.com/weather_skill.zip?Expires=1788168088&amp;OSSAccessKeyId=</a>****</p>
         */
        public Builder skillPackageUrl(String skillPackageUrl) {
            this.putQueryParameter("SkillPackageUrl", skillPackageUrl);
            this.skillPackageUrl = skillPackageUrl;
            return this;
        }

        @Override
        public CreateAgentSkillRequest build() {
            return new CreateAgentSkillRequest(this);
        } 

    } 

}
