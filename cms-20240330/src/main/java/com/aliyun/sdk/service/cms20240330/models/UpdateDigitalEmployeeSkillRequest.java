// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link UpdateDigitalEmployeeSkillRequest} extends {@link RequestModel}
 *
 * <p>UpdateDigitalEmployeeSkillRequest</p>
 */
public class UpdateDigitalEmployeeSkillRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true, minLength = 1)
    private String name;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("skillName")
    @com.aliyun.core.annotation.Validation(required = true, minLength = 1)
    private String skillName;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    @com.aliyun.core.annotation.Validation(maxLength = 512)
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("displayName")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String displayName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("enable")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean enable;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("files")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Files> files;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("remark")
    private String remark;

    private UpdateDigitalEmployeeSkillRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.skillName = builder.skillName;
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.enable = builder.enable;
        this.files = builder.files;
        this.remark = builder.remark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDigitalEmployeeSkillRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return skillName
     */
    public String getSkillName() {
        return this.skillName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return files
     */
    public java.util.List<Files> getFiles() {
        return this.files;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    public static final class Builder extends Request.Builder<UpdateDigitalEmployeeSkillRequest, Builder> {
        private String name; 
        private String skillName; 
        private String regionId; 
        private String description; 
        private String displayName; 
        private Boolean enable; 
        private java.util.List<Files> files; 
        private String remark; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDigitalEmployeeSkillRequest request) {
            super(request);
            this.name = request.name;
            this.skillName = request.skillName;
            this.regionId = request.regionId;
            this.description = request.description;
            this.displayName = request.displayName;
            this.enable = request.enable;
            this.files = request.files;
            this.remark = request.remark;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder skillName(String skillName) {
            this.putPathParameter("skillName", skillName);
            this.skillName = skillName;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * displayName.
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("displayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enable(Boolean enable) {
            this.putBodyParameter("enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder files(java.util.List<Files> files) {
            this.putBodyParameter("files", files);
            this.files = files;
            return this;
        }

        /**
         * remark.
         */
        public Builder remark(String remark) {
            this.putBodyParameter("remark", remark);
            this.remark = remark;
            return this;
        }

        @Override
        public UpdateDigitalEmployeeSkillRequest build() {
            return new UpdateDigitalEmployeeSkillRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateDigitalEmployeeSkillRequest} extends {@link TeaModel}
     *
     * <p>UpdateDigitalEmployeeSkillRequest</p>
     */
    public static class Files extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private Files(Builder builder) {
            this.content = builder.content;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Files create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String content; 
            private String name; 

            private Builder() {
            } 

            private Builder(Files model) {
                this.content = model.content;
                this.name = model.name;
            } 

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Files build() {
                return new Files(this);
            } 

        } 

    }
}
