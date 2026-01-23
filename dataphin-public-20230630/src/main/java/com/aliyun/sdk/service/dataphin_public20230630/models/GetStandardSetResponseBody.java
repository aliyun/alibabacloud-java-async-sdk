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
 * {@link GetStandardSetResponseBody} extends {@link TeaModel}
 *
 * <p>GetStandardSetResponseBody</p>
 */
public class GetStandardSetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StandardSetInfo")
    private StandardSetInfo standardSetInfo;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetStandardSetResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.standardSetInfo = builder.standardSetInfo;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStandardSetResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
     * @return standardSetInfo
     */
    public StandardSetInfo getStandardSetInfo() {
        return this.standardSetInfo;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private StandardSetInfo standardSetInfo; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetStandardSetResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.standardSetInfo = model.standardSetInfo;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StandardSetInfo.
         */
        public Builder standardSetInfo(StandardSetInfo standardSetInfo) {
            this.standardSetInfo = standardSetInfo;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetStandardSetResponseBody build() {
            return new GetStandardSetResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetStandardSetResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandardSetResponseBody</p>
     */
    public static class ApprovalConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApprovalType")
        private String approvalType;

        @com.aliyun.core.annotation.NameInMap("EnableApproval")
        private Boolean enableApproval;

        @com.aliyun.core.annotation.NameInMap("IsSubmitInBatch")
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
             * ApprovalType.
             */
            public Builder approvalType(String approvalType) {
                this.approvalType = approvalType;
                return this;
            }

            /**
             * EnableApproval.
             */
            public Builder enableApproval(Boolean enableApproval) {
                this.enableApproval = enableApproval;
                return this;
            }

            /**
             * IsSubmitInBatch.
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
     * {@link GetStandardSetResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandardSetResponseBody</p>
     */
    public static class Creator extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Creator(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Creator create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String id; 
            private String name; 

            private Builder() {
            } 

            private Builder(Creator model) {
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Creator build() {
                return new Creator(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetStandardSetResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandardSetResponseBody</p>
     */
    public static class DirectoryReference extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Directory")
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
             * Directory.
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
     * {@link GetStandardSetResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandardSetResponseBody</p>
     */
    public static class LastModifier extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private LastModifier(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LastModifier create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String id; 
            private String name; 

            private Builder() {
            } 

            private Builder(LastModifier model) {
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public LastModifier build() {
                return new LastModifier(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetStandardSetResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandardSetResponseBody</p>
     */
    public static class MaintainerList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private MaintainerList(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MaintainerList create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String id; 
            private String name; 

            private Builder() {
            } 

            private Builder(MaintainerList model) {
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public MaintainerList build() {
                return new MaintainerList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetStandardSetResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandardSetResponseBody</p>
     */
    public static class MemberGroupList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private MemberGroupList(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MemberGroupList create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String id; 
            private String name; 

            private Builder() {
            } 

            private Builder(MemberGroupList model) {
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public MemberGroupList build() {
                return new MemberGroupList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetStandardSetResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandardSetResponseBody</p>
     */
    public static class MemberList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private MemberList(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MemberList create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String id; 
            private String name; 

            private Builder() {
            } 

            private Builder(MemberList model) {
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public MemberList build() {
                return new MemberList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetStandardSetResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandardSetResponseBody</p>
     */
    public static class OfflineApprovalConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApprovalType")
        private String approvalType;

        @com.aliyun.core.annotation.NameInMap("EnableApproval")
        private Boolean enableApproval;

        @com.aliyun.core.annotation.NameInMap("IsSubmitInBatch")
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
             * ApprovalType.
             */
            public Builder approvalType(String approvalType) {
                this.approvalType = approvalType;
                return this;
            }

            /**
             * EnableApproval.
             */
            public Builder enableApproval(Boolean enableApproval) {
                this.enableApproval = enableApproval;
                return this;
            }

            /**
             * IsSubmitInBatch.
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
     * {@link GetStandardSetResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandardSetResponseBody</p>
     */
    public static class SpecifiedUserList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private SpecifiedUserList(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpecifiedUserList create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String id; 
            private String name; 

            private Builder() {
            } 

            private Builder(SpecifiedUserList model) {
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public SpecifiedUserList build() {
                return new SpecifiedUserList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetStandardSetResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandardSetResponseBody</p>
     */
    public static class VisibilityConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SpecifiedUserList")
        private java.util.List<SpecifiedUserList> specifiedUserList;

        @com.aliyun.core.annotation.NameInMap("Type")
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
        public java.util.List<SpecifiedUserList> getSpecifiedUserList() {
            return this.specifiedUserList;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<SpecifiedUserList> specifiedUserList; 
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
            public Builder specifiedUserList(java.util.List<SpecifiedUserList> specifiedUserList) {
                this.specifiedUserList = specifiedUserList;
                return this;
            }

            /**
             * Type.
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
     * {@link GetStandardSetResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandardSetResponseBody</p>
     */
    public static class StandardSetInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApprovalConfig")
        private ApprovalConfig approvalConfig;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private Creator creator;

        @com.aliyun.core.annotation.NameInMap("DefaultStandardTemplateId")
        private Long defaultStandardTemplateId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DirectoryReference")
        private DirectoryReference directoryReference;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("LastModifier")
        private LastModifier lastModifier;

        @com.aliyun.core.annotation.NameInMap("MaintainerList")
        private java.util.List<MaintainerList> maintainerList;

        @com.aliyun.core.annotation.NameInMap("MemberGroupList")
        private java.util.List<MemberGroupList> memberGroupList;

        @com.aliyun.core.annotation.NameInMap("MemberList")
        private java.util.List<MemberList> memberList;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OfflineApprovalConfig")
        private OfflineApprovalConfig offlineApprovalConfig;

        @com.aliyun.core.annotation.NameInMap("VisibilityConfig")
        private VisibilityConfig visibilityConfig;

        private StandardSetInfo(Builder builder) {
            this.approvalConfig = builder.approvalConfig;
            this.code = builder.code;
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.defaultStandardTemplateId = builder.defaultStandardTemplateId;
            this.description = builder.description;
            this.directoryReference = builder.directoryReference;
            this.id = builder.id;
            this.lastModifier = builder.lastModifier;
            this.maintainerList = builder.maintainerList;
            this.memberGroupList = builder.memberGroupList;
            this.memberList = builder.memberList;
            this.modifyTime = builder.modifyTime;
            this.name = builder.name;
            this.offlineApprovalConfig = builder.offlineApprovalConfig;
            this.visibilityConfig = builder.visibilityConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StandardSetInfo create() {
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
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creator
         */
        public Creator getCreator() {
            return this.creator;
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
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return lastModifier
         */
        public LastModifier getLastModifier() {
            return this.lastModifier;
        }

        /**
         * @return maintainerList
         */
        public java.util.List<MaintainerList> getMaintainerList() {
            return this.maintainerList;
        }

        /**
         * @return memberGroupList
         */
        public java.util.List<MemberGroupList> getMemberGroupList() {
            return this.memberGroupList;
        }

        /**
         * @return memberList
         */
        public java.util.List<MemberList> getMemberList() {
            return this.memberList;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
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
            private String createTime; 
            private Creator creator; 
            private Long defaultStandardTemplateId; 
            private String description; 
            private DirectoryReference directoryReference; 
            private Long id; 
            private LastModifier lastModifier; 
            private java.util.List<MaintainerList> maintainerList; 
            private java.util.List<MemberGroupList> memberGroupList; 
            private java.util.List<MemberList> memberList; 
            private String modifyTime; 
            private String name; 
            private OfflineApprovalConfig offlineApprovalConfig; 
            private VisibilityConfig visibilityConfig; 

            private Builder() {
            } 

            private Builder(StandardSetInfo model) {
                this.approvalConfig = model.approvalConfig;
                this.code = model.code;
                this.createTime = model.createTime;
                this.creator = model.creator;
                this.defaultStandardTemplateId = model.defaultStandardTemplateId;
                this.description = model.description;
                this.directoryReference = model.directoryReference;
                this.id = model.id;
                this.lastModifier = model.lastModifier;
                this.maintainerList = model.maintainerList;
                this.memberGroupList = model.memberGroupList;
                this.memberList = model.memberList;
                this.modifyTime = model.modifyTime;
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
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
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
             * Creator.
             */
            public Builder creator(Creator creator) {
                this.creator = creator;
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
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * LastModifier.
             */
            public Builder lastModifier(LastModifier lastModifier) {
                this.lastModifier = lastModifier;
                return this;
            }

            /**
             * MaintainerList.
             */
            public Builder maintainerList(java.util.List<MaintainerList> maintainerList) {
                this.maintainerList = maintainerList;
                return this;
            }

            /**
             * MemberGroupList.
             */
            public Builder memberGroupList(java.util.List<MemberGroupList> memberGroupList) {
                this.memberGroupList = memberGroupList;
                return this;
            }

            /**
             * MemberList.
             */
            public Builder memberList(java.util.List<MemberList> memberList) {
                this.memberList = memberList;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * Name.
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

            public StandardSetInfo build() {
                return new StandardSetInfo(this);
            } 

        } 

    }
}
