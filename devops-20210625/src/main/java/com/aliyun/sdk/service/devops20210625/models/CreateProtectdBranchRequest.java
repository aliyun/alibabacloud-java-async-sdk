// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

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
 * {@link CreateProtectdBranchRequest} extends {@link RequestModel}
 *
 * <p>CreateProtectdBranchRequest</p>
 */
public class CreateProtectdBranchRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("repositoryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long repositoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("accessToken")
    private String accessToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("allowMergeRoles")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Integer> allowMergeRoles;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("allowMergeUserIds")
    private java.util.List<String> allowMergeUserIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("allowPushRoles")
    private java.util.List<Integer> allowPushRoles;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("allowPushUserIds")
    private java.util.List<String> allowPushUserIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("branch")
    @com.aliyun.core.annotation.Validation(required = true)
    private String branch;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("mergeRequestSetting")
    private MergeRequestSetting mergeRequestSetting;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("testSettingDTO")
    private TestSettingDTO testSettingDTO;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    private CreateProtectdBranchRequest(Builder builder) {
        super(builder);
        this.repositoryId = builder.repositoryId;
        this.accessToken = builder.accessToken;
        this.allowMergeRoles = builder.allowMergeRoles;
        this.allowMergeUserIds = builder.allowMergeUserIds;
        this.allowPushRoles = builder.allowPushRoles;
        this.allowPushUserIds = builder.allowPushUserIds;
        this.branch = builder.branch;
        this.id = builder.id;
        this.mergeRequestSetting = builder.mergeRequestSetting;
        this.testSettingDTO = builder.testSettingDTO;
        this.organizationId = builder.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProtectdBranchRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return repositoryId
     */
    public Long getRepositoryId() {
        return this.repositoryId;
    }

    /**
     * @return accessToken
     */
    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * @return allowMergeRoles
     */
    public java.util.List<Integer> getAllowMergeRoles() {
        return this.allowMergeRoles;
    }

    /**
     * @return allowMergeUserIds
     */
    public java.util.List<String> getAllowMergeUserIds() {
        return this.allowMergeUserIds;
    }

    /**
     * @return allowPushRoles
     */
    public java.util.List<Integer> getAllowPushRoles() {
        return this.allowPushRoles;
    }

    /**
     * @return allowPushUserIds
     */
    public java.util.List<String> getAllowPushUserIds() {
        return this.allowPushUserIds;
    }

    /**
     * @return branch
     */
    public String getBranch() {
        return this.branch;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return mergeRequestSetting
     */
    public MergeRequestSetting getMergeRequestSetting() {
        return this.mergeRequestSetting;
    }

    /**
     * @return testSettingDTO
     */
    public TestSettingDTO getTestSettingDTO() {
        return this.testSettingDTO;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    public static final class Builder extends Request.Builder<CreateProtectdBranchRequest, Builder> {
        private Long repositoryId; 
        private String accessToken; 
        private java.util.List<Integer> allowMergeRoles; 
        private java.util.List<String> allowMergeUserIds; 
        private java.util.List<Integer> allowPushRoles; 
        private java.util.List<String> allowPushUserIds; 
        private String branch; 
        private Long id; 
        private MergeRequestSetting mergeRequestSetting; 
        private TestSettingDTO testSettingDTO; 
        private String organizationId; 

        private Builder() {
            super();
        } 

        private Builder(CreateProtectdBranchRequest request) {
            super(request);
            this.repositoryId = request.repositoryId;
            this.accessToken = request.accessToken;
            this.allowMergeRoles = request.allowMergeRoles;
            this.allowMergeUserIds = request.allowMergeUserIds;
            this.allowPushRoles = request.allowPushRoles;
            this.allowPushUserIds = request.allowPushUserIds;
            this.branch = request.branch;
            this.id = request.id;
            this.mergeRequestSetting = request.mergeRequestSetting;
            this.testSettingDTO = request.testSettingDTO;
            this.organizationId = request.organizationId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2813891</p>
         */
        public Builder repositoryId(Long repositoryId) {
            this.putPathParameter("repositoryId", repositoryId);
            this.repositoryId = repositoryId;
            return this;
        }

        /**
         * accessToken.
         */
        public Builder accessToken(String accessToken) {
            this.putQueryParameter("accessToken", accessToken);
            this.accessToken = accessToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder allowMergeRoles(java.util.List<Integer> allowMergeRoles) {
            this.putBodyParameter("allowMergeRoles", allowMergeRoles);
            this.allowMergeRoles = allowMergeRoles;
            return this;
        }

        /**
         * allowMergeUserIds.
         */
        public Builder allowMergeUserIds(java.util.List<String> allowMergeUserIds) {
            this.putBodyParameter("allowMergeUserIds", allowMergeUserIds);
            this.allowMergeUserIds = allowMergeUserIds;
            return this;
        }

        /**
         * allowPushRoles.
         */
        public Builder allowPushRoles(java.util.List<Integer> allowPushRoles) {
            this.putBodyParameter("allowPushRoles", allowPushRoles);
            this.allowPushRoles = allowPushRoles;
            return this;
        }

        /**
         * allowPushUserIds.
         */
        public Builder allowPushUserIds(java.util.List<String> allowPushUserIds) {
            this.putBodyParameter("allowPushUserIds", allowPushUserIds);
            this.allowPushUserIds = allowPushUserIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>protectBranch</p>
         */
        public Builder branch(String branch) {
            this.putBodyParameter("branch", branch);
            this.branch = branch;
            return this;
        }

        /**
         * id.
         */
        public Builder id(Long id) {
            this.putBodyParameter("id", id);
            this.id = id;
            return this;
        }

        /**
         * mergeRequestSetting.
         */
        public Builder mergeRequestSetting(MergeRequestSetting mergeRequestSetting) {
            this.putBodyParameter("mergeRequestSetting", mergeRequestSetting);
            this.mergeRequestSetting = mergeRequestSetting;
            return this;
        }

        /**
         * testSettingDTO.
         */
        public Builder testSettingDTO(TestSettingDTO testSettingDTO) {
            this.putBodyParameter("testSettingDTO", testSettingDTO);
            this.testSettingDTO = testSettingDTO;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>60de7a6852743a5162b5f957</p>
         */
        public Builder organizationId(String organizationId) {
            this.putQueryParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        @Override
        public CreateProtectdBranchRequest build() {
            return new CreateProtectdBranchRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateProtectdBranchRequest} extends {@link TeaModel}
     *
     * <p>CreateProtectdBranchRequest</p>
     */
    public static class MergeRequestSetting extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("allowMergeRequestRoles")
        private java.util.List<Integer> allowMergeRequestRoles;

        @com.aliyun.core.annotation.NameInMap("defaultAssignees")
        private java.util.List<String> defaultAssignees;

        @com.aliyun.core.annotation.NameInMap("isAllowSelfApproval")
        private Boolean isAllowSelfApproval;

        @com.aliyun.core.annotation.NameInMap("isRequireDiscussionProcessed")
        private Boolean isRequireDiscussionProcessed;

        @com.aliyun.core.annotation.NameInMap("isRequired")
        private Boolean isRequired;

        @com.aliyun.core.annotation.NameInMap("isResetApprovalWhenNewPush")
        private Boolean isResetApprovalWhenNewPush;

        @com.aliyun.core.annotation.NameInMap("minimumApproval")
        private Integer minimumApproval;

        @com.aliyun.core.annotation.NameInMap("mrMode")
        private String mrMode;

        @com.aliyun.core.annotation.NameInMap("whiteList")
        private String whiteList;

        private MergeRequestSetting(Builder builder) {
            this.allowMergeRequestRoles = builder.allowMergeRequestRoles;
            this.defaultAssignees = builder.defaultAssignees;
            this.isAllowSelfApproval = builder.isAllowSelfApproval;
            this.isRequireDiscussionProcessed = builder.isRequireDiscussionProcessed;
            this.isRequired = builder.isRequired;
            this.isResetApprovalWhenNewPush = builder.isResetApprovalWhenNewPush;
            this.minimumApproval = builder.minimumApproval;
            this.mrMode = builder.mrMode;
            this.whiteList = builder.whiteList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MergeRequestSetting create() {
            return builder().build();
        }

        /**
         * @return allowMergeRequestRoles
         */
        public java.util.List<Integer> getAllowMergeRequestRoles() {
            return this.allowMergeRequestRoles;
        }

        /**
         * @return defaultAssignees
         */
        public java.util.List<String> getDefaultAssignees() {
            return this.defaultAssignees;
        }

        /**
         * @return isAllowSelfApproval
         */
        public Boolean getIsAllowSelfApproval() {
            return this.isAllowSelfApproval;
        }

        /**
         * @return isRequireDiscussionProcessed
         */
        public Boolean getIsRequireDiscussionProcessed() {
            return this.isRequireDiscussionProcessed;
        }

        /**
         * @return isRequired
         */
        public Boolean getIsRequired() {
            return this.isRequired;
        }

        /**
         * @return isResetApprovalWhenNewPush
         */
        public Boolean getIsResetApprovalWhenNewPush() {
            return this.isResetApprovalWhenNewPush;
        }

        /**
         * @return minimumApproval
         */
        public Integer getMinimumApproval() {
            return this.minimumApproval;
        }

        /**
         * @return mrMode
         */
        public String getMrMode() {
            return this.mrMode;
        }

        /**
         * @return whiteList
         */
        public String getWhiteList() {
            return this.whiteList;
        }

        public static final class Builder {
            private java.util.List<Integer> allowMergeRequestRoles; 
            private java.util.List<String> defaultAssignees; 
            private Boolean isAllowSelfApproval; 
            private Boolean isRequireDiscussionProcessed; 
            private Boolean isRequired; 
            private Boolean isResetApprovalWhenNewPush; 
            private Integer minimumApproval; 
            private String mrMode; 
            private String whiteList; 

            /**
             * allowMergeRequestRoles.
             */
            public Builder allowMergeRequestRoles(java.util.List<Integer> allowMergeRequestRoles) {
                this.allowMergeRequestRoles = allowMergeRequestRoles;
                return this;
            }

            /**
             * defaultAssignees.
             */
            public Builder defaultAssignees(java.util.List<String> defaultAssignees) {
                this.defaultAssignees = defaultAssignees;
                return this;
            }

            /**
             * isAllowSelfApproval.
             */
            public Builder isAllowSelfApproval(Boolean isAllowSelfApproval) {
                this.isAllowSelfApproval = isAllowSelfApproval;
                return this;
            }

            /**
             * isRequireDiscussionProcessed.
             */
            public Builder isRequireDiscussionProcessed(Boolean isRequireDiscussionProcessed) {
                this.isRequireDiscussionProcessed = isRequireDiscussionProcessed;
                return this;
            }

            /**
             * isRequired.
             */
            public Builder isRequired(Boolean isRequired) {
                this.isRequired = isRequired;
                return this;
            }

            /**
             * isResetApprovalWhenNewPush.
             */
            public Builder isResetApprovalWhenNewPush(Boolean isResetApprovalWhenNewPush) {
                this.isResetApprovalWhenNewPush = isResetApprovalWhenNewPush;
                return this;
            }

            /**
             * minimumApproval.
             */
            public Builder minimumApproval(Integer minimumApproval) {
                this.minimumApproval = minimumApproval;
                return this;
            }

            /**
             * mrMode.
             */
            public Builder mrMode(String mrMode) {
                this.mrMode = mrMode;
                return this;
            }

            /**
             * whiteList.
             */
            public Builder whiteList(String whiteList) {
                this.whiteList = whiteList;
                return this;
            }

            public MergeRequestSetting build() {
                return new MergeRequestSetting(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProtectdBranchRequest} extends {@link TeaModel}
     *
     * <p>CreateProtectdBranchRequest</p>
     */
    public static class CheckItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("isRequired")
        private Boolean isRequired;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private CheckItems(Builder builder) {
            this.isRequired = builder.isRequired;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckItems create() {
            return builder().build();
        }

        /**
         * @return isRequired
         */
        public Boolean getIsRequired() {
            return this.isRequired;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Boolean isRequired; 
            private String name; 

            /**
             * isRequired.
             */
            public Builder isRequired(Boolean isRequired) {
                this.isRequired = isRequired;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public CheckItems build() {
                return new CheckItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProtectdBranchRequest} extends {@link TeaModel}
     *
     * <p>CreateProtectdBranchRequest</p>
     */
    public static class CheckConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("checkItems")
        private java.util.List<CheckItems> checkItems;

        private CheckConfig(Builder builder) {
            this.checkItems = builder.checkItems;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckConfig create() {
            return builder().build();
        }

        /**
         * @return checkItems
         */
        public java.util.List<CheckItems> getCheckItems() {
            return this.checkItems;
        }

        public static final class Builder {
            private java.util.List<CheckItems> checkItems; 

            /**
             * checkItems.
             */
            public Builder checkItems(java.util.List<CheckItems> checkItems) {
                this.checkItems = checkItems;
                return this;
            }

            public CheckConfig build() {
                return new CheckConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProtectdBranchRequest} extends {@link TeaModel}
     *
     * <p>CreateProtectdBranchRequest</p>
     */
    public static class CheckTaskQualityConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bizNo")
        private String bizNo;

        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("taskName")
        private String taskName;

        private CheckTaskQualityConfig(Builder builder) {
            this.bizNo = builder.bizNo;
            this.enabled = builder.enabled;
            this.message = builder.message;
            this.taskName = builder.taskName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckTaskQualityConfig create() {
            return builder().build();
        }

        /**
         * @return bizNo
         */
        public String getBizNo() {
            return this.bizNo;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        public static final class Builder {
            private String bizNo; 
            private Boolean enabled; 
            private String message; 
            private String taskName; 

            /**
             * bizNo.
             */
            public Builder bizNo(String bizNo) {
                this.bizNo = bizNo;
                return this;
            }

            /**
             * enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * taskName.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            public CheckTaskQualityConfig build() {
                return new CheckTaskQualityConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProtectdBranchRequest} extends {@link TeaModel}
     *
     * <p>CreateProtectdBranchRequest</p>
     */
    public static class CodeGuidelinesDetection extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        private CodeGuidelinesDetection(Builder builder) {
            this.enabled = builder.enabled;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CodeGuidelinesDetection create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private Boolean enabled; 
            private String message; 

            /**
             * enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public CodeGuidelinesDetection build() {
                return new CodeGuidelinesDetection(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProtectdBranchRequest} extends {@link TeaModel}
     *
     * <p>CreateProtectdBranchRequest</p>
     */
    public static class SensitiveInfoDetection extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        private SensitiveInfoDetection(Builder builder) {
            this.enabled = builder.enabled;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SensitiveInfoDetection create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private Boolean enabled; 
            private String message; 

            /**
             * enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public SensitiveInfoDetection build() {
                return new SensitiveInfoDetection(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProtectdBranchRequest} extends {@link TeaModel}
     *
     * <p>CreateProtectdBranchRequest</p>
     */
    public static class TestSettingDTO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("checkConfig")
        private CheckConfig checkConfig;

        @com.aliyun.core.annotation.NameInMap("checkTaskQualityConfig")
        private CheckTaskQualityConfig checkTaskQualityConfig;

        @com.aliyun.core.annotation.NameInMap("codeGuidelinesDetection")
        private CodeGuidelinesDetection codeGuidelinesDetection;

        @com.aliyun.core.annotation.NameInMap("isRequired")
        private Boolean isRequired;

        @com.aliyun.core.annotation.NameInMap("sensitiveInfoDetection")
        private SensitiveInfoDetection sensitiveInfoDetection;

        private TestSettingDTO(Builder builder) {
            this.checkConfig = builder.checkConfig;
            this.checkTaskQualityConfig = builder.checkTaskQualityConfig;
            this.codeGuidelinesDetection = builder.codeGuidelinesDetection;
            this.isRequired = builder.isRequired;
            this.sensitiveInfoDetection = builder.sensitiveInfoDetection;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TestSettingDTO create() {
            return builder().build();
        }

        /**
         * @return checkConfig
         */
        public CheckConfig getCheckConfig() {
            return this.checkConfig;
        }

        /**
         * @return checkTaskQualityConfig
         */
        public CheckTaskQualityConfig getCheckTaskQualityConfig() {
            return this.checkTaskQualityConfig;
        }

        /**
         * @return codeGuidelinesDetection
         */
        public CodeGuidelinesDetection getCodeGuidelinesDetection() {
            return this.codeGuidelinesDetection;
        }

        /**
         * @return isRequired
         */
        public Boolean getIsRequired() {
            return this.isRequired;
        }

        /**
         * @return sensitiveInfoDetection
         */
        public SensitiveInfoDetection getSensitiveInfoDetection() {
            return this.sensitiveInfoDetection;
        }

        public static final class Builder {
            private CheckConfig checkConfig; 
            private CheckTaskQualityConfig checkTaskQualityConfig; 
            private CodeGuidelinesDetection codeGuidelinesDetection; 
            private Boolean isRequired; 
            private SensitiveInfoDetection sensitiveInfoDetection; 

            /**
             * checkConfig.
             */
            public Builder checkConfig(CheckConfig checkConfig) {
                this.checkConfig = checkConfig;
                return this;
            }

            /**
             * checkTaskQualityConfig.
             */
            public Builder checkTaskQualityConfig(CheckTaskQualityConfig checkTaskQualityConfig) {
                this.checkTaskQualityConfig = checkTaskQualityConfig;
                return this;
            }

            /**
             * codeGuidelinesDetection.
             */
            public Builder codeGuidelinesDetection(CodeGuidelinesDetection codeGuidelinesDetection) {
                this.codeGuidelinesDetection = codeGuidelinesDetection;
                return this;
            }

            /**
             * isRequired.
             */
            public Builder isRequired(Boolean isRequired) {
                this.isRequired = isRequired;
                return this;
            }

            /**
             * sensitiveInfoDetection.
             */
            public Builder sensitiveInfoDetection(SensitiveInfoDetection sensitiveInfoDetection) {
                this.sensitiveInfoDetection = sensitiveInfoDetection;
                return this;
            }

            public TestSettingDTO build() {
                return new TestSettingDTO(this);
            } 

        } 

    }
}
