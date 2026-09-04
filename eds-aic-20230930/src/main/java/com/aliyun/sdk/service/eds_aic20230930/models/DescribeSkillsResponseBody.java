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
 * {@link DescribeSkillsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSkillsResponseBody</p>
 */
public class DescribeSkillsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SkillInfo")
    private java.util.List<SkillInfo> skillInfo;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private DescribeSkillsResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.skillInfo = builder.skillInfo;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSkillsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return skillInfo
     */
    public java.util.List<SkillInfo> getSkillInfo() {
        return this.skillInfo;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private java.util.List<SkillInfo> skillInfo; 
        private String totalCount; 

        private Builder() {
        } 

        private Builder(DescribeSkillsResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.skillInfo = model.skillInfo;
            this.totalCount = model.totalCount;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SkillInfo.
         */
        public Builder skillInfo(java.util.List<SkillInfo> skillInfo) {
            this.skillInfo = skillInfo;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSkillsResponseBody build() {
            return new DescribeSkillsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSkillsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSkillsResponseBody</p>
     */
    public static class InstalledInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstallStatus")
        private String installStatus;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        private InstalledInstances(Builder builder) {
            this.installStatus = builder.installStatus;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstalledInstances create() {
            return builder().build();
        }

        /**
         * @return installStatus
         */
        public String getInstallStatus() {
            return this.installStatus;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private String installStatus; 
            private String instanceId; 

            private Builder() {
            } 

            private Builder(InstalledInstances model) {
                this.installStatus = model.installStatus;
                this.instanceId = model.instanceId;
            } 

            /**
             * InstallStatus.
             */
            public Builder installStatus(String installStatus) {
                this.installStatus = installStatus;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public InstalledInstances build() {
                return new InstalledInstances(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSkillsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSkillsResponseBody</p>
     */
    public static class SkillInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("IconOssUrl")
        private String iconOssUrl;

        @com.aliyun.core.annotation.NameInMap("InstalledCount")
        private Integer installedCount;

        @com.aliyun.core.annotation.NameInMap("InstalledInstances")
        private java.util.List<InstalledInstances> installedInstances;

        @com.aliyun.core.annotation.NameInMap("Instruction")
        private String instruction;

        @com.aliyun.core.annotation.NameInMap("SkillId")
        private String skillId;

        @com.aliyun.core.annotation.NameInMap("SkillName")
        private String skillName;

        @com.aliyun.core.annotation.NameInMap("SkillSource")
        private String skillSource;

        @com.aliyun.core.annotation.NameInMap("SkillStatus")
        private String skillStatus;

        @com.aliyun.core.annotation.NameInMap("SourceInstanceId")
        private String sourceInstanceId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private SkillInfo(Builder builder) {
            this.category = builder.category;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.iconOssUrl = builder.iconOssUrl;
            this.installedCount = builder.installedCount;
            this.installedInstances = builder.installedInstances;
            this.instruction = builder.instruction;
            this.skillId = builder.skillId;
            this.skillName = builder.skillName;
            this.skillSource = builder.skillSource;
            this.skillStatus = builder.skillStatus;
            this.sourceInstanceId = builder.sourceInstanceId;
            this.status = builder.status;
            this.type = builder.type;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SkillInfo create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
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
         * @return iconOssUrl
         */
        public String getIconOssUrl() {
            return this.iconOssUrl;
        }

        /**
         * @return installedCount
         */
        public Integer getInstalledCount() {
            return this.installedCount;
        }

        /**
         * @return installedInstances
         */
        public java.util.List<InstalledInstances> getInstalledInstances() {
            return this.installedInstances;
        }

        /**
         * @return instruction
         */
        public String getInstruction() {
            return this.instruction;
        }

        /**
         * @return skillId
         */
        public String getSkillId() {
            return this.skillId;
        }

        /**
         * @return skillName
         */
        public String getSkillName() {
            return this.skillName;
        }

        /**
         * @return skillSource
         */
        public String getSkillSource() {
            return this.skillSource;
        }

        /**
         * @return skillStatus
         */
        public String getSkillStatus() {
            return this.skillStatus;
        }

        /**
         * @return sourceInstanceId
         */
        public String getSourceInstanceId() {
            return this.sourceInstanceId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String category; 
            private String createTime; 
            private String description; 
            private String iconOssUrl; 
            private Integer installedCount; 
            private java.util.List<InstalledInstances> installedInstances; 
            private String instruction; 
            private String skillId; 
            private String skillName; 
            private String skillSource; 
            private String skillStatus; 
            private String sourceInstanceId; 
            private String status; 
            private String type; 
            private String version; 

            private Builder() {
            } 

            private Builder(SkillInfo model) {
                this.category = model.category;
                this.createTime = model.createTime;
                this.description = model.description;
                this.iconOssUrl = model.iconOssUrl;
                this.installedCount = model.installedCount;
                this.installedInstances = model.installedInstances;
                this.instruction = model.instruction;
                this.skillId = model.skillId;
                this.skillName = model.skillName;
                this.skillSource = model.skillSource;
                this.skillStatus = model.skillStatus;
                this.sourceInstanceId = model.sourceInstanceId;
                this.status = model.status;
                this.type = model.type;
                this.version = model.version;
            } 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * IconOssUrl.
             */
            public Builder iconOssUrl(String iconOssUrl) {
                this.iconOssUrl = iconOssUrl;
                return this;
            }

            /**
             * InstalledCount.
             */
            public Builder installedCount(Integer installedCount) {
                this.installedCount = installedCount;
                return this;
            }

            /**
             * InstalledInstances.
             */
            public Builder installedInstances(java.util.List<InstalledInstances> installedInstances) {
                this.installedInstances = installedInstances;
                return this;
            }

            /**
             * Instruction.
             */
            public Builder instruction(String instruction) {
                this.instruction = instruction;
                return this;
            }

            /**
             * SkillId.
             */
            public Builder skillId(String skillId) {
                this.skillId = skillId;
                return this;
            }

            /**
             * SkillName.
             */
            public Builder skillName(String skillName) {
                this.skillName = skillName;
                return this;
            }

            /**
             * SkillSource.
             */
            public Builder skillSource(String skillSource) {
                this.skillSource = skillSource;
                return this;
            }

            /**
             * SkillStatus.
             */
            public Builder skillStatus(String skillStatus) {
                this.skillStatus = skillStatus;
                return this;
            }

            /**
             * SourceInstanceId.
             */
            public Builder sourceInstanceId(String sourceInstanceId) {
                this.sourceInstanceId = sourceInstanceId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public SkillInfo build() {
                return new SkillInfo(this);
            } 

        } 

    }
}
