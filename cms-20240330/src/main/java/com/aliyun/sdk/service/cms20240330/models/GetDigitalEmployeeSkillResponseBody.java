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
 * {@link GetDigitalEmployeeSkillResponseBody} extends {@link TeaModel}
 *
 * <p>GetDigitalEmployeeSkillResponseBody</p>
 */
public class GetDigitalEmployeeSkillResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("displayName")
    private String displayName;

    @com.aliyun.core.annotation.NameInMap("enable")
    private Boolean enable;

    @com.aliyun.core.annotation.NameInMap("files")
    private java.util.List<Files> files;

    @com.aliyun.core.annotation.NameInMap("remark")
    private String remark;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("skillName")
    private String skillName;

    @com.aliyun.core.annotation.NameInMap("updateTime")
    private String updateTime;

    @com.aliyun.core.annotation.NameInMap("version")
    private String version;

    private GetDigitalEmployeeSkillResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.enable = builder.enable;
        this.files = builder.files;
        this.remark = builder.remark;
        this.requestId = builder.requestId;
        this.skillName = builder.skillName;
        this.updateTime = builder.updateTime;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDigitalEmployeeSkillResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
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

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return skillName
     */
    public String getSkillName() {
        return this.skillName;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private String createTime; 
        private String description; 
        private String displayName; 
        private Boolean enable; 
        private java.util.List<Files> files; 
        private String remark; 
        private String requestId; 
        private String skillName; 
        private String updateTime; 
        private String version; 

        private Builder() {
        } 

        private Builder(GetDigitalEmployeeSkillResponseBody model) {
            this.createTime = model.createTime;
            this.description = model.description;
            this.displayName = model.displayName;
            this.enable = model.enable;
            this.files = model.files;
            this.remark = model.remark;
            this.requestId = model.requestId;
            this.skillName = model.skillName;
            this.updateTime = model.updateTime;
            this.version = model.version;
        } 

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-02-06T14:09:11Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
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
         * enable.
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        /**
         * files.
         */
        public Builder files(java.util.List<Files> files) {
            this.files = files;
            return this;
        }

        /**
         * remark.
         */
        public Builder remark(String remark) {
            this.remark = remark;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>8FDE2569-626B-5176-9844-28877A*****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * skillName.
         */
        public Builder skillName(String skillName) {
            this.skillName = skillName;
            return this;
        }

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-02-06T14:09:11Z</p>
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * version.
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public GetDigitalEmployeeSkillResponseBody build() {
            return new GetDigitalEmployeeSkillResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDigitalEmployeeSkillResponseBody} extends {@link TeaModel}
     *
     * <p>GetDigitalEmployeeSkillResponseBody</p>
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
             * name.
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
