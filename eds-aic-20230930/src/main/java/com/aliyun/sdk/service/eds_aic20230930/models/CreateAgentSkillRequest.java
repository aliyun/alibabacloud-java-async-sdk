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
         * FileList.
         */
        public Builder fileList(java.util.List<String> fileList) {
            this.putQueryParameter("FileList", fileList);
            this.fileList = fileList;
            return this;
        }

        /**
         * IconKey.
         */
        public Builder iconKey(String iconKey) {
            this.putQueryParameter("IconKey", iconKey);
            this.iconKey = iconKey;
            return this;
        }

        /**
         * PackageOssKey.
         */
        public Builder packageOssKey(String packageOssKey) {
            this.putQueryParameter("PackageOssKey", packageOssKey);
            this.packageOssKey = packageOssKey;
            return this;
        }

        /**
         * SkillDescription.
         */
        public Builder skillDescription(String skillDescription) {
            this.putQueryParameter("SkillDescription", skillDescription);
            this.skillDescription = skillDescription;
            return this;
        }

        /**
         * SkillName.
         */
        public Builder skillName(String skillName) {
            this.putQueryParameter("SkillName", skillName);
            this.skillName = skillName;
            return this;
        }

        /**
         * SkillPackageUrl.
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
