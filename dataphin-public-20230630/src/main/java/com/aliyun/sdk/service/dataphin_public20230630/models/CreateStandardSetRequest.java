// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link CreateStandardSetRequest} extends {@link RequestModel}
 *
 * <p>CreateStandardSetRequest</p>
 */
public class CreateStandardSetRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CreateCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private CreateCommand createCommand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    private CreateStandardSetRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.createCommand = builder.createCommand;
        this.opTenantId = builder.opTenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateStandardSetRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return createCommand
     */
    public CreateCommand getCreateCommand() {
        return this.createCommand;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static final class Builder extends Request.Builder<CreateStandardSetRequest, Builder> {
        private String regionId; 
        private CreateCommand createCommand; 
        private Long opTenantId; 

        private Builder() {
            super();
        } 

        private Builder(CreateStandardSetRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.createCommand = request.createCommand;
            this.opTenantId = request.opTenantId;
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
         * <p>This parameter is required.</p>
         */
        public Builder createCommand(CreateCommand createCommand) {
            String createCommandShrink = shrink(createCommand, "CreateCommand", "json");
            this.putBodyParameter("CreateCommand", createCommandShrink);
            this.createCommand = createCommand;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        @Override
        public CreateStandardSetRequest build() {
            return new CreateStandardSetRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateStandardSetRequest} extends {@link TeaModel}
     *
     * <p>CreateStandardSetRequest</p>
     */
    public static class ApprovalConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApprovalType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String approvalType;

        @com.aliyun.core.annotation.NameInMap("EnableApproval")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean enableApproval;

        @com.aliyun.core.annotation.NameInMap("IsSubmitInBatch")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean isSubmitInBatch;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private Long templateId;

        private ApprovalConfig(Builder builder) {
            this.approvalType = builder.approvalType;
            this.enableApproval = builder.enableApproval;
            this.isSubmitInBatch = builder.isSubmitInBatch;
            this.templateId = builder.templateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApprovalConfig create() {
            return builder().build();
        }

        /**
         * @return approvalType
         */
        public String getApprovalType() {
            return this.approvalType;
        }

        /**
         * @return enableApproval
         */
        public Boolean getEnableApproval() {
            return this.enableApproval;
        }

        /**
         * @return isSubmitInBatch
         */
        public Boolean getIsSubmitInBatch() {
            return this.isSubmitInBatch;
        }

        /**
         * @return templateId
         */
        public Long getTemplateId() {
            return this.templateId;
        }

        public static final class Builder {
            private String approvalType; 
            private Boolean enableApproval; 
            private Boolean isSubmitInBatch; 
            private Long templateId; 

            private Builder() {
            } 

            private Builder(ApprovalConfig model) {
                this.approvalType = model.approvalType;
                this.enableApproval = model.enableApproval;
                this.isSubmitInBatch = model.isSubmitInBatch;
                this.templateId = model.templateId;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>BY_DEFAULT</p>
             */
            public Builder approvalType(String approvalType) {
                this.approvalType = approvalType;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder enableApproval(Boolean enableApproval) {
                this.enableApproval = enableApproval;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder isSubmitInBatch(Boolean isSubmitInBatch) {
                this.isSubmitInBatch = isSubmitInBatch;
                return this;
            }

            /**
             * TemplateId.
             */
            public Builder templateId(Long templateId) {
                this.templateId = templateId;
                return this;
            }

            public ApprovalConfig build() {
                return new ApprovalConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateStandardSetRequest} extends {@link TeaModel}
     *
     * <p>CreateStandardSetRequest</p>
     */
    public static class DirectoryReference extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Directory")
        @com.aliyun.core.annotation.Validation(required = true)
        private String directory;

        private DirectoryReference(Builder builder) {
            this.directory = builder.directory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DirectoryReference create() {
            return builder().build();
        }

        /**
         * @return directory
         */
        public String getDirectory() {
            return this.directory;
        }

        public static final class Builder {
            private String directory; 

            private Builder() {
            } 

            private Builder(DirectoryReference model) {
                this.directory = model.directory;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>/dir1</p>
             */
            public Builder directory(String directory) {
                this.directory = directory;
                return this;
            }

            public DirectoryReference build() {
                return new DirectoryReference(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateStandardSetRequest} extends {@link TeaModel}
     *
     * <p>CreateStandardSetRequest</p>
     */
    public static class OfflineApprovalConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApprovalType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String approvalType;

        @com.aliyun.core.annotation.NameInMap("EnableApproval")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean enableApproval;

        @com.aliyun.core.annotation.NameInMap("IsSubmitInBatch")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean isSubmitInBatch;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private Long templateId;

        private OfflineApprovalConfig(Builder builder) {
            this.approvalType = builder.approvalType;
            this.enableApproval = builder.enableApproval;
            this.isSubmitInBatch = builder.isSubmitInBatch;
            this.templateId = builder.templateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OfflineApprovalConfig create() {
            return builder().build();
        }

        /**
         * @return approvalType
         */
        public String getApprovalType() {
            return this.approvalType;
        }

        /**
         * @return enableApproval
         */
        public Boolean getEnableApproval() {
            return this.enableApproval;
        }

        /**
         * @return isSubmitInBatch
         */
        public Boolean getIsSubmitInBatch() {
            return this.isSubmitInBatch;
        }

        /**
         * @return templateId
         */
        public Long getTemplateId() {
            return this.templateId;
        }

        public static final class Builder {
            private String approvalType; 
            private Boolean enableApproval; 
            private Boolean isSubmitInBatch; 
            private Long templateId; 

            private Builder() {
            } 

            private Builder(OfflineApprovalConfig model) {
                this.approvalType = model.approvalType;
                this.enableApproval = model.enableApproval;
                this.isSubmitInBatch = model.isSubmitInBatch;
                this.templateId = model.templateId;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>BY_DEFAULT</p>
             */
            public Builder approvalType(String approvalType) {
                this.approvalType = approvalType;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder enableApproval(Boolean enableApproval) {
                this.enableApproval = enableApproval;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder isSubmitInBatch(Boolean isSubmitInBatch) {
                this.isSubmitInBatch = isSubmitInBatch;
                return this;
            }

            /**
             * TemplateId.
             */
            public Builder templateId(Long templateId) {
                this.templateId = templateId;
                return this;
            }

            public OfflineApprovalConfig build() {
                return new OfflineApprovalConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateStandardSetRequest} extends {@link TeaModel}
     *
     * <p>CreateStandardSetRequest</p>
     */
    public static class VisibilityConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SpecifiedUserList")
        private java.util.List<String> specifiedUserList;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private VisibilityConfig(Builder builder) {
            this.specifiedUserList = builder.specifiedUserList;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VisibilityConfig create() {
            return builder().build();
        }

        /**
         * @return specifiedUserList
         */
        public java.util.List<String> getSpecifiedUserList() {
            return this.specifiedUserList;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<String> specifiedUserList; 
            private String type; 

            private Builder() {
            } 

            private Builder(VisibilityConfig model) {
                this.specifiedUserList = model.specifiedUserList;
                this.type = model.type;
            } 

            /**
             * SpecifiedUserList.
             */
            public Builder specifiedUserList(java.util.List<String> specifiedUserList) {
                this.specifiedUserList = specifiedUserList;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>PUBLIC</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public VisibilityConfig build() {
                return new VisibilityConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateStandardSetRequest} extends {@link TeaModel}
     *
     * <p>CreateStandardSetRequest</p>
     */
    public static class CreateCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApprovalConfig")
        private ApprovalConfig approvalConfig;

        @com.aliyun.core.annotation.NameInMap("Code")
        @com.aliyun.core.annotation.Validation(required = true)
        private String code;

        @com.aliyun.core.annotation.NameInMap("DefaultStandardTemplateId")
        private Long defaultStandardTemplateId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DirectoryReference")
        private DirectoryReference directoryReference;

        @com.aliyun.core.annotation.NameInMap("MaintainerList")
        private java.util.List<String> maintainerList;

        @com.aliyun.core.annotation.NameInMap("MemberGroupList")
        private java.util.List<String> memberGroupList;

        @com.aliyun.core.annotation.NameInMap("MemberList")
        private java.util.List<String> memberList;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("OfflineApprovalConfig")
        private OfflineApprovalConfig offlineApprovalConfig;

        @com.aliyun.core.annotation.NameInMap("VisibilityConfig")
        private VisibilityConfig visibilityConfig;

        private CreateCommand(Builder builder) {
            this.approvalConfig = builder.approvalConfig;
            this.code = builder.code;
            this.defaultStandardTemplateId = builder.defaultStandardTemplateId;
            this.description = builder.description;
            this.directoryReference = builder.directoryReference;
            this.maintainerList = builder.maintainerList;
            this.memberGroupList = builder.memberGroupList;
            this.memberList = builder.memberList;
            this.name = builder.name;
            this.offlineApprovalConfig = builder.offlineApprovalConfig;
            this.visibilityConfig = builder.visibilityConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateCommand create() {
            return builder().build();
        }

        /**
         * @return approvalConfig
         */
        public ApprovalConfig getApprovalConfig() {
            return this.approvalConfig;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return defaultStandardTemplateId
         */
        public Long getDefaultStandardTemplateId() {
            return this.defaultStandardTemplateId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return directoryReference
         */
        public DirectoryReference getDirectoryReference() {
            return this.directoryReference;
        }

        /**
         * @return maintainerList
         */
        public java.util.List<String> getMaintainerList() {
            return this.maintainerList;
        }

        /**
         * @return memberGroupList
         */
        public java.util.List<String> getMemberGroupList() {
            return this.memberGroupList;
        }

        /**
         * @return memberList
         */
        public java.util.List<String> getMemberList() {
            return this.memberList;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return offlineApprovalConfig
         */
        public OfflineApprovalConfig getOfflineApprovalConfig() {
            return this.offlineApprovalConfig;
        }

        /**
         * @return visibilityConfig
         */
        public VisibilityConfig getVisibilityConfig() {
            return this.visibilityConfig;
        }

        public static final class Builder {
            private ApprovalConfig approvalConfig; 
            private String code; 
            private Long defaultStandardTemplateId; 
            private String description; 
            private DirectoryReference directoryReference; 
            private java.util.List<String> maintainerList; 
            private java.util.List<String> memberGroupList; 
            private java.util.List<String> memberList; 
            private String name; 
            private OfflineApprovalConfig offlineApprovalConfig; 
            private VisibilityConfig visibilityConfig; 

            private Builder() {
            } 

            private Builder(CreateCommand model) {
                this.approvalConfig = model.approvalConfig;
                this.code = model.code;
                this.defaultStandardTemplateId = model.defaultStandardTemplateId;
                this.description = model.description;
                this.directoryReference = model.directoryReference;
                this.maintainerList = model.maintainerList;
                this.memberGroupList = model.memberGroupList;
                this.memberList = model.memberList;
                this.name = model.name;
                this.offlineApprovalConfig = model.offlineApprovalConfig;
                this.visibilityConfig = model.visibilityConfig;
            } 

            /**
             * ApprovalConfig.
             */
            public Builder approvalConfig(ApprovalConfig approvalConfig) {
                this.approvalConfig = approvalConfig;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>CITY</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * DefaultStandardTemplateId.
             */
            public Builder defaultStandardTemplateId(Long defaultStandardTemplateId) {
                this.defaultStandardTemplateId = defaultStandardTemplateId;
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
             * DirectoryReference.
             */
            public Builder directoryReference(DirectoryReference directoryReference) {
                this.directoryReference = directoryReference;
                return this;
            }

            /**
             * MaintainerList.
             */
            public Builder maintainerList(java.util.List<String> maintainerList) {
                this.maintainerList = maintainerList;
                return this;
            }

            /**
             * MemberGroupList.
             */
            public Builder memberGroupList(java.util.List<String> memberGroupList) {
                this.memberGroupList = memberGroupList;
                return this;
            }

            /**
             * MemberList.
             */
            public Builder memberList(java.util.List<String> memberList) {
                this.memberList = memberList;
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

            /**
             * OfflineApprovalConfig.
             */
            public Builder offlineApprovalConfig(OfflineApprovalConfig offlineApprovalConfig) {
                this.offlineApprovalConfig = offlineApprovalConfig;
                return this;
            }

            /**
             * VisibilityConfig.
             */
            public Builder visibilityConfig(VisibilityConfig visibilityConfig) {
                this.visibilityConfig = visibilityConfig;
                return this;
            }

            public CreateCommand build() {
                return new CreateCommand(this);
            } 

        } 

    }
}
