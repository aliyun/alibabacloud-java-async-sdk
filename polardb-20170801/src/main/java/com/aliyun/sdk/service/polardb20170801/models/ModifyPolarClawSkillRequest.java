// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link ModifyPolarClawSkillRequest} extends {@link RequestModel}
 *
 * <p>ModifyPolarClawSkillRequest</p>
 */
public class ModifyPolarClawSkillRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModifyType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modifyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Path")
    private String path;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String skillName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillVersion")
    private String skillVersion;

    private ModifyPolarClawSkillRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.modifyType = builder.modifyType;
        this.path = builder.path;
        this.regionId = builder.regionId;
        this.skillName = builder.skillName;
        this.skillVersion = builder.skillVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyPolarClawSkillRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return modifyType
     */
    public String getModifyType() {
        return this.modifyType;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return skillName
     */
    public String getSkillName() {
        return this.skillName;
    }

    /**
     * @return skillVersion
     */
    public String getSkillVersion() {
        return this.skillVersion;
    }

    public static final class Builder extends Request.Builder<ModifyPolarClawSkillRequest, Builder> {
        private String applicationId; 
        private String modifyType; 
        private String path; 
        private String regionId; 
        private String skillName; 
        private String skillVersion; 

        private Builder() {
            super();
        } 

        private Builder(ModifyPolarClawSkillRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.modifyType = request.modifyType;
            this.path = request.path;
            this.regionId = request.regionId;
            this.skillName = request.skillName;
            this.skillVersion = request.skillVersion;
        } 

        /**
         * <p>The application ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-**************</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>The modification type. Valid values: </p>
         * <ul>
         * <li><strong>evaluate</strong>: Evaluates the skill.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>evaluate</p>
         */
        public Builder modifyType(String modifyType) {
            this.putQueryParameter("ModifyType", modifyType);
            this.modifyType = modifyType;
            return this;
        }

        /**
         * <p>The destination path.</p>
         * 
         * <strong>example:</strong>
         * <p>/home/node/.openclaw/workspace/skills/polarclawhub</p>
         */
        public Builder path(String path) {
            this.putQueryParameter("Path", path);
            this.path = path;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The skill name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>polarclawhub</p>
         */
        public Builder skillName(String skillName) {
            this.putQueryParameter("SkillName", skillName);
            this.skillName = skillName;
            return this;
        }

        /**
         * <p>The skill version.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.0</p>
         */
        public Builder skillVersion(String skillVersion) {
            this.putQueryParameter("SkillVersion", skillVersion);
            this.skillVersion = skillVersion;
            return this;
        }

        @Override
        public ModifyPolarClawSkillRequest build() {
            return new ModifyPolarClawSkillRequest(this);
        } 

    } 

}
