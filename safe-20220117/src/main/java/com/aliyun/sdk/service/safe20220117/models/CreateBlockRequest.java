// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.safe20220117.models;

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
 * {@link CreateBlockRequest} extends {@link RequestModel}
 *
 * <p>CreateBlockRequest</p>
 */
public class CreateBlockRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApproveStrategyNodes")
    private java.util.List<ApproveStrategyNodes> approveStrategyNodes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BlockId")
    private Long blockId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Director")
    private String director;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IsNeedApprove")
    private Integer isNeedApprove;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IsRecall")
    private Integer isRecall;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IsTemplate")
    private Integer isTemplate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LabelName")
    private String labelName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NoticeDesc")
    private String noticeDesc;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NoticeEnclosureInfos")
    private java.util.List<NoticeEnclosureInfos> noticeEnclosureInfos;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NoticeRequestLink")
    private String noticeRequestLink;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NoticeType")
    private Integer noticeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Reason")
    private String reason;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Scene")
    private Integer scene;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Scopes")
    private java.util.List<Scopes> scopes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VersionId")
    private Long versionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("creatorEmpId")
    private String creatorEmpId;

    private CreateBlockRequest(Builder builder) {
        super(builder);
        this.approveStrategyNodes = builder.approveStrategyNodes;
        this.blockId = builder.blockId;
        this.director = builder.director;
        this.isNeedApprove = builder.isNeedApprove;
        this.isRecall = builder.isRecall;
        this.isTemplate = builder.isTemplate;
        this.labelName = builder.labelName;
        this.noticeDesc = builder.noticeDesc;
        this.noticeEnclosureInfos = builder.noticeEnclosureInfos;
        this.noticeRequestLink = builder.noticeRequestLink;
        this.noticeType = builder.noticeType;
        this.reason = builder.reason;
        this.scene = builder.scene;
        this.scopes = builder.scopes;
        this.status = builder.status;
        this.title = builder.title;
        this.type = builder.type;
        this.versionId = builder.versionId;
        this.creatorEmpId = builder.creatorEmpId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBlockRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return approveStrategyNodes
     */
    public java.util.List<ApproveStrategyNodes> getApproveStrategyNodes() {
        return this.approveStrategyNodes;
    }

    /**
     * @return blockId
     */
    public Long getBlockId() {
        return this.blockId;
    }

    /**
     * @return director
     */
    public String getDirector() {
        return this.director;
    }

    /**
     * @return isNeedApprove
     */
    public Integer getIsNeedApprove() {
        return this.isNeedApprove;
    }

    /**
     * @return isRecall
     */
    public Integer getIsRecall() {
        return this.isRecall;
    }

    /**
     * @return isTemplate
     */
    public Integer getIsTemplate() {
        return this.isTemplate;
    }

    /**
     * @return labelName
     */
    public String getLabelName() {
        return this.labelName;
    }

    /**
     * @return noticeDesc
     */
    public String getNoticeDesc() {
        return this.noticeDesc;
    }

    /**
     * @return noticeEnclosureInfos
     */
    public java.util.List<NoticeEnclosureInfos> getNoticeEnclosureInfos() {
        return this.noticeEnclosureInfos;
    }

    /**
     * @return noticeRequestLink
     */
    public String getNoticeRequestLink() {
        return this.noticeRequestLink;
    }

    /**
     * @return noticeType
     */
    public Integer getNoticeType() {
        return this.noticeType;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return scene
     */
    public Integer getScene() {
        return this.scene;
    }

    /**
     * @return scopes
     */
    public java.util.List<Scopes> getScopes() {
        return this.scopes;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return versionId
     */
    public Long getVersionId() {
        return this.versionId;
    }

    /**
     * @return creatorEmpId
     */
    public String getCreatorEmpId() {
        return this.creatorEmpId;
    }

    public static final class Builder extends Request.Builder<CreateBlockRequest, Builder> {
        private java.util.List<ApproveStrategyNodes> approveStrategyNodes; 
        private Long blockId; 
        private String director; 
        private Integer isNeedApprove; 
        private Integer isRecall; 
        private Integer isTemplate; 
        private String labelName; 
        private String noticeDesc; 
        private java.util.List<NoticeEnclosureInfos> noticeEnclosureInfos; 
        private String noticeRequestLink; 
        private Integer noticeType; 
        private String reason; 
        private Integer scene; 
        private java.util.List<Scopes> scopes; 
        private Integer status; 
        private String title; 
        private String type; 
        private Long versionId; 
        private String creatorEmpId; 

        private Builder() {
            super();
        } 

        private Builder(CreateBlockRequest request) {
            super(request);
            this.approveStrategyNodes = request.approveStrategyNodes;
            this.blockId = request.blockId;
            this.director = request.director;
            this.isNeedApprove = request.isNeedApprove;
            this.isRecall = request.isRecall;
            this.isTemplate = request.isTemplate;
            this.labelName = request.labelName;
            this.noticeDesc = request.noticeDesc;
            this.noticeEnclosureInfos = request.noticeEnclosureInfos;
            this.noticeRequestLink = request.noticeRequestLink;
            this.noticeType = request.noticeType;
            this.reason = request.reason;
            this.scene = request.scene;
            this.scopes = request.scopes;
            this.status = request.status;
            this.title = request.title;
            this.type = request.type;
            this.versionId = request.versionId;
            this.creatorEmpId = request.creatorEmpId;
        } 

        /**
         * ApproveStrategyNodes.
         */
        public Builder approveStrategyNodes(java.util.List<ApproveStrategyNodes> approveStrategyNodes) {
            this.putBodyParameter("ApproveStrategyNodes", approveStrategyNodes);
            this.approveStrategyNodes = approveStrategyNodes;
            return this;
        }

        /**
         * BlockId.
         */
        public Builder blockId(Long blockId) {
            this.putBodyParameter("BlockId", blockId);
            this.blockId = blockId;
            return this;
        }

        /**
         * Director.
         */
        public Builder director(String director) {
            this.putBodyParameter("Director", director);
            this.director = director;
            return this;
        }

        /**
         * IsNeedApprove.
         */
        public Builder isNeedApprove(Integer isNeedApprove) {
            this.putBodyParameter("IsNeedApprove", isNeedApprove);
            this.isNeedApprove = isNeedApprove;
            return this;
        }

        /**
         * IsRecall.
         */
        public Builder isRecall(Integer isRecall) {
            this.putBodyParameter("IsRecall", isRecall);
            this.isRecall = isRecall;
            return this;
        }

        /**
         * IsTemplate.
         */
        public Builder isTemplate(Integer isTemplate) {
            this.putBodyParameter("IsTemplate", isTemplate);
            this.isTemplate = isTemplate;
            return this;
        }

        /**
         * LabelName.
         */
        public Builder labelName(String labelName) {
            this.putBodyParameter("LabelName", labelName);
            this.labelName = labelName;
            return this;
        }

        /**
         * NoticeDesc.
         */
        public Builder noticeDesc(String noticeDesc) {
            this.putBodyParameter("NoticeDesc", noticeDesc);
            this.noticeDesc = noticeDesc;
            return this;
        }

        /**
         * NoticeEnclosureInfos.
         */
        public Builder noticeEnclosureInfos(java.util.List<NoticeEnclosureInfos> noticeEnclosureInfos) {
            this.putBodyParameter("NoticeEnclosureInfos", noticeEnclosureInfos);
            this.noticeEnclosureInfos = noticeEnclosureInfos;
            return this;
        }

        /**
         * NoticeRequestLink.
         */
        public Builder noticeRequestLink(String noticeRequestLink) {
            this.putBodyParameter("NoticeRequestLink", noticeRequestLink);
            this.noticeRequestLink = noticeRequestLink;
            return this;
        }

        /**
         * NoticeType.
         */
        public Builder noticeType(Integer noticeType) {
            this.putBodyParameter("NoticeType", noticeType);
            this.noticeType = noticeType;
            return this;
        }

        /**
         * Reason.
         */
        public Builder reason(String reason) {
            this.putBodyParameter("Reason", reason);
            this.reason = reason;
            return this;
        }

        /**
         * Scene.
         */
        public Builder scene(Integer scene) {
            this.putBodyParameter("Scene", scene);
            this.scene = scene;
            return this;
        }

        /**
         * Scopes.
         */
        public Builder scopes(java.util.List<Scopes> scopes) {
            this.putBodyParameter("Scopes", scopes);
            this.scopes = scopes;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Integer status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.putBodyParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * VersionId.
         */
        public Builder versionId(Long versionId) {
            this.putBodyParameter("VersionId", versionId);
            this.versionId = versionId;
            return this;
        }

        /**
         * creatorEmpId.
         */
        public Builder creatorEmpId(String creatorEmpId) {
            this.putBodyParameter("creatorEmpId", creatorEmpId);
            this.creatorEmpId = creatorEmpId;
            return this;
        }

        @Override
        public CreateBlockRequest build() {
            return new CreateBlockRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateBlockRequest} extends {@link TeaModel}
     *
     * <p>CreateBlockRequest</p>
     */
    public static class ApproveStrategyNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApproveRuleType")
        private Integer approveRuleType;

        @com.aliyun.core.annotation.NameInMap("ApproveType")
        private Integer approveType;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NodeCode")
        private String nodeCode;

        @com.aliyun.core.annotation.NameInMap("PriorityOrder")
        private Integer priorityOrder;

        @com.aliyun.core.annotation.NameInMap("RoleCode")
        private Integer roleCode;

        @com.aliyun.core.annotation.NameInMap("RoleValue")
        private java.util.List<String> roleValue;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private Long templateId;

        private ApproveStrategyNodes(Builder builder) {
            this.approveRuleType = builder.approveRuleType;
            this.approveType = builder.approveType;
            this.id = builder.id;
            this.name = builder.name;
            this.nodeCode = builder.nodeCode;
            this.priorityOrder = builder.priorityOrder;
            this.roleCode = builder.roleCode;
            this.roleValue = builder.roleValue;
            this.templateId = builder.templateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApproveStrategyNodes create() {
            return builder().build();
        }

        /**
         * @return approveRuleType
         */
        public Integer getApproveRuleType() {
            return this.approveRuleType;
        }

        /**
         * @return approveType
         */
        public Integer getApproveType() {
            return this.approveType;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nodeCode
         */
        public String getNodeCode() {
            return this.nodeCode;
        }

        /**
         * @return priorityOrder
         */
        public Integer getPriorityOrder() {
            return this.priorityOrder;
        }

        /**
         * @return roleCode
         */
        public Integer getRoleCode() {
            return this.roleCode;
        }

        /**
         * @return roleValue
         */
        public java.util.List<String> getRoleValue() {
            return this.roleValue;
        }

        /**
         * @return templateId
         */
        public Long getTemplateId() {
            return this.templateId;
        }

        public static final class Builder {
            private Integer approveRuleType; 
            private Integer approveType; 
            private Long id; 
            private String name; 
            private String nodeCode; 
            private Integer priorityOrder; 
            private Integer roleCode; 
            private java.util.List<String> roleValue; 
            private Long templateId; 

            private Builder() {
            } 

            private Builder(ApproveStrategyNodes model) {
                this.approveRuleType = model.approveRuleType;
                this.approveType = model.approveType;
                this.id = model.id;
                this.name = model.name;
                this.nodeCode = model.nodeCode;
                this.priorityOrder = model.priorityOrder;
                this.roleCode = model.roleCode;
                this.roleValue = model.roleValue;
                this.templateId = model.templateId;
            } 

            /**
             * ApproveRuleType.
             */
            public Builder approveRuleType(Integer approveRuleType) {
                this.approveRuleType = approveRuleType;
                return this;
            }

            /**
             * ApproveType.
             */
            public Builder approveType(Integer approveType) {
                this.approveType = approveType;
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NodeCode.
             */
            public Builder nodeCode(String nodeCode) {
                this.nodeCode = nodeCode;
                return this;
            }

            /**
             * PriorityOrder.
             */
            public Builder priorityOrder(Integer priorityOrder) {
                this.priorityOrder = priorityOrder;
                return this;
            }

            /**
             * RoleCode.
             */
            public Builder roleCode(Integer roleCode) {
                this.roleCode = roleCode;
                return this;
            }

            /**
             * RoleValue.
             */
            public Builder roleValue(java.util.List<String> roleValue) {
                this.roleValue = roleValue;
                return this;
            }

            /**
             * TemplateId.
             */
            public Builder templateId(Long templateId) {
                this.templateId = templateId;
                return this;
            }

            public ApproveStrategyNodes build() {
                return new ApproveStrategyNodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateBlockRequest} extends {@link TeaModel}
     *
     * <p>CreateBlockRequest</p>
     */
    public static class NoticeEnclosureInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private NoticeEnclosureInfos(Builder builder) {
            this.name = builder.name;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NoticeEnclosureInfos create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String name; 
            private String url; 

            private Builder() {
            } 

            private Builder(NoticeEnclosureInfos model) {
                this.name = model.name;
                this.url = model.url;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public NoticeEnclosureInfos build() {
                return new NoticeEnclosureInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateBlockRequest} extends {@link TeaModel}
     *
     * <p>CreateBlockRequest</p>
     */
    public static class App extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private java.util.List<String> appName;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Integer type;

        private App(Builder builder) {
            this.appName = builder.appName;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static App create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public java.util.List<String> getAppName() {
            return this.appName;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<String> appName; 
            private Integer type; 

            private Builder() {
            } 

            private Builder(App model) {
                this.appName = model.appName;
                this.type = model.type;
            } 

            /**
             * AppName.
             */
            public Builder appName(java.util.List<String> appName) {
                this.appName = appName;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public App build() {
                return new App(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateBlockRequest} extends {@link TeaModel}
     *
     * <p>CreateBlockRequest</p>
     */
    public static class BgSystem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RelateCodes")
        private java.util.List<String> relateCodes;

        @com.aliyun.core.annotation.NameInMap("SelfCodeName")
        private String selfCodeName;

        private BgSystem(Builder builder) {
            this.relateCodes = builder.relateCodes;
            this.selfCodeName = builder.selfCodeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BgSystem create() {
            return builder().build();
        }

        /**
         * @return relateCodes
         */
        public java.util.List<String> getRelateCodes() {
            return this.relateCodes;
        }

        /**
         * @return selfCodeName
         */
        public String getSelfCodeName() {
            return this.selfCodeName;
        }

        public static final class Builder {
            private java.util.List<String> relateCodes; 
            private String selfCodeName; 

            private Builder() {
            } 

            private Builder(BgSystem model) {
                this.relateCodes = model.relateCodes;
                this.selfCodeName = model.selfCodeName;
            } 

            /**
             * RelateCodes.
             */
            public Builder relateCodes(java.util.List<String> relateCodes) {
                this.relateCodes = relateCodes;
                return this;
            }

            /**
             * SelfCodeName.
             */
            public Builder selfCodeName(String selfCodeName) {
                this.selfCodeName = selfCodeName;
                return this;
            }

            public BgSystem build() {
                return new BgSystem(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateBlockRequest} extends {@link TeaModel}
     *
     * <p>CreateBlockRequest</p>
     */
    public static class Relations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppCodes")
        private java.util.List<String> appCodes;

        @com.aliyun.core.annotation.NameInMap("LabelCodes")
        private java.util.List<String> labelCodes;

        @com.aliyun.core.annotation.NameInMap("RelateCodes")
        private java.util.List<String> relateCodes;

        @com.aliyun.core.annotation.NameInMap("SelfCode")
        private String selfCode;

        private Relations(Builder builder) {
            this.appCodes = builder.appCodes;
            this.labelCodes = builder.labelCodes;
            this.relateCodes = builder.relateCodes;
            this.selfCode = builder.selfCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Relations create() {
            return builder().build();
        }

        /**
         * @return appCodes
         */
        public java.util.List<String> getAppCodes() {
            return this.appCodes;
        }

        /**
         * @return labelCodes
         */
        public java.util.List<String> getLabelCodes() {
            return this.labelCodes;
        }

        /**
         * @return relateCodes
         */
        public java.util.List<String> getRelateCodes() {
            return this.relateCodes;
        }

        /**
         * @return selfCode
         */
        public String getSelfCode() {
            return this.selfCode;
        }

        public static final class Builder {
            private java.util.List<String> appCodes; 
            private java.util.List<String> labelCodes; 
            private java.util.List<String> relateCodes; 
            private String selfCode; 

            private Builder() {
            } 

            private Builder(Relations model) {
                this.appCodes = model.appCodes;
                this.labelCodes = model.labelCodes;
                this.relateCodes = model.relateCodes;
                this.selfCode = model.selfCode;
            } 

            /**
             * AppCodes.
             */
            public Builder appCodes(java.util.List<String> appCodes) {
                this.appCodes = appCodes;
                return this;
            }

            /**
             * LabelCodes.
             */
            public Builder labelCodes(java.util.List<String> labelCodes) {
                this.labelCodes = labelCodes;
                return this;
            }

            /**
             * RelateCodes.
             */
            public Builder relateCodes(java.util.List<String> relateCodes) {
                this.relateCodes = relateCodes;
                return this;
            }

            /**
             * SelfCode.
             */
            public Builder selfCode(String selfCode) {
                this.selfCode = selfCode;
                return this;
            }

            public Relations build() {
                return new Relations(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateBlockRequest} extends {@link TeaModel}
     *
     * <p>CreateBlockRequest</p>
     */
    public static class Cluster extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CodeNames")
        private java.util.List<String> codeNames;

        @com.aliyun.core.annotation.NameInMap("Relations")
        private java.util.List<Relations> relations;

        private Cluster(Builder builder) {
            this.codeNames = builder.codeNames;
            this.relations = builder.relations;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cluster create() {
            return builder().build();
        }

        /**
         * @return codeNames
         */
        public java.util.List<String> getCodeNames() {
            return this.codeNames;
        }

        /**
         * @return relations
         */
        public java.util.List<Relations> getRelations() {
            return this.relations;
        }

        public static final class Builder {
            private java.util.List<String> codeNames; 
            private java.util.List<Relations> relations; 

            private Builder() {
            } 

            private Builder(Cluster model) {
                this.codeNames = model.codeNames;
                this.relations = model.relations;
            } 

            /**
             * CodeNames.
             */
            public Builder codeNames(java.util.List<String> codeNames) {
                this.codeNames = codeNames;
                return this;
            }

            /**
             * Relations.
             */
            public Builder relations(java.util.List<Relations> relations) {
                this.relations = relations;
                return this;
            }

            public Cluster build() {
                return new Cluster(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateBlockRequest} extends {@link TeaModel}
     *
     * <p>CreateBlockRequest</p>
     */
    public static class CustomerRelations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppCodes")
        private java.util.List<String> appCodes;

        @com.aliyun.core.annotation.NameInMap("LabelCodes")
        private java.util.List<String> labelCodes;

        @com.aliyun.core.annotation.NameInMap("RelateCodes")
        private java.util.List<String> relateCodes;

        @com.aliyun.core.annotation.NameInMap("SelfCode")
        private String selfCode;

        private CustomerRelations(Builder builder) {
            this.appCodes = builder.appCodes;
            this.labelCodes = builder.labelCodes;
            this.relateCodes = builder.relateCodes;
            this.selfCode = builder.selfCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomerRelations create() {
            return builder().build();
        }

        /**
         * @return appCodes
         */
        public java.util.List<String> getAppCodes() {
            return this.appCodes;
        }

        /**
         * @return labelCodes
         */
        public java.util.List<String> getLabelCodes() {
            return this.labelCodes;
        }

        /**
         * @return relateCodes
         */
        public java.util.List<String> getRelateCodes() {
            return this.relateCodes;
        }

        /**
         * @return selfCode
         */
        public String getSelfCode() {
            return this.selfCode;
        }

        public static final class Builder {
            private java.util.List<String> appCodes; 
            private java.util.List<String> labelCodes; 
            private java.util.List<String> relateCodes; 
            private String selfCode; 

            private Builder() {
            } 

            private Builder(CustomerRelations model) {
                this.appCodes = model.appCodes;
                this.labelCodes = model.labelCodes;
                this.relateCodes = model.relateCodes;
                this.selfCode = model.selfCode;
            } 

            /**
             * AppCodes.
             */
            public Builder appCodes(java.util.List<String> appCodes) {
                this.appCodes = appCodes;
                return this;
            }

            /**
             * LabelCodes.
             */
            public Builder labelCodes(java.util.List<String> labelCodes) {
                this.labelCodes = labelCodes;
                return this;
            }

            /**
             * RelateCodes.
             */
            public Builder relateCodes(java.util.List<String> relateCodes) {
                this.relateCodes = relateCodes;
                return this;
            }

            /**
             * SelfCode.
             */
            public Builder selfCode(String selfCode) {
                this.selfCode = selfCode;
                return this;
            }

            public CustomerRelations build() {
                return new CustomerRelations(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateBlockRequest} extends {@link TeaModel}
     *
     * <p>CreateBlockRequest</p>
     */
    public static class Customer extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CodeNames")
        private java.util.List<String> codeNames;

        @com.aliyun.core.annotation.NameInMap("Relations")
        private java.util.List<CustomerRelations> relations;

        @com.aliyun.core.annotation.NameInMap("Uid")
        private String uid;

        @com.aliyun.core.annotation.NameInMap("ViewCodes")
        private java.util.List<Integer> viewCodes;

        private Customer(Builder builder) {
            this.codeNames = builder.codeNames;
            this.relations = builder.relations;
            this.uid = builder.uid;
            this.viewCodes = builder.viewCodes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Customer create() {
            return builder().build();
        }

        /**
         * @return codeNames
         */
        public java.util.List<String> getCodeNames() {
            return this.codeNames;
        }

        /**
         * @return relations
         */
        public java.util.List<CustomerRelations> getRelations() {
            return this.relations;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        /**
         * @return viewCodes
         */
        public java.util.List<Integer> getViewCodes() {
            return this.viewCodes;
        }

        public static final class Builder {
            private java.util.List<String> codeNames; 
            private java.util.List<CustomerRelations> relations; 
            private String uid; 
            private java.util.List<Integer> viewCodes; 

            private Builder() {
            } 

            private Builder(Customer model) {
                this.codeNames = model.codeNames;
                this.relations = model.relations;
                this.uid = model.uid;
                this.viewCodes = model.viewCodes;
            } 

            /**
             * CodeNames.
             */
            public Builder codeNames(java.util.List<String> codeNames) {
                this.codeNames = codeNames;
                return this;
            }

            /**
             * Relations.
             */
            public Builder relations(java.util.List<CustomerRelations> relations) {
                this.relations = relations;
                return this;
            }

            /**
             * Uid.
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            /**
             * ViewCodes.
             */
            public Builder viewCodes(java.util.List<Integer> viewCodes) {
                this.viewCodes = viewCodes;
                return this;
            }

            public Customer build() {
                return new Customer(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateBlockRequest} extends {@link TeaModel}
     *
     * <p>CreateBlockRequest</p>
     */
    public static class ProductRelations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppCodes")
        private java.util.List<String> appCodes;

        @com.aliyun.core.annotation.NameInMap("LabelCodes")
        private java.util.List<String> labelCodes;

        @com.aliyun.core.annotation.NameInMap("RelateCodes")
        private java.util.List<String> relateCodes;

        @com.aliyun.core.annotation.NameInMap("SelfCode")
        private String selfCode;

        private ProductRelations(Builder builder) {
            this.appCodes = builder.appCodes;
            this.labelCodes = builder.labelCodes;
            this.relateCodes = builder.relateCodes;
            this.selfCode = builder.selfCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProductRelations create() {
            return builder().build();
        }

        /**
         * @return appCodes
         */
        public java.util.List<String> getAppCodes() {
            return this.appCodes;
        }

        /**
         * @return labelCodes
         */
        public java.util.List<String> getLabelCodes() {
            return this.labelCodes;
        }

        /**
         * @return relateCodes
         */
        public java.util.List<String> getRelateCodes() {
            return this.relateCodes;
        }

        /**
         * @return selfCode
         */
        public String getSelfCode() {
            return this.selfCode;
        }

        public static final class Builder {
            private java.util.List<String> appCodes; 
            private java.util.List<String> labelCodes; 
            private java.util.List<String> relateCodes; 
            private String selfCode; 

            private Builder() {
            } 

            private Builder(ProductRelations model) {
                this.appCodes = model.appCodes;
                this.labelCodes = model.labelCodes;
                this.relateCodes = model.relateCodes;
                this.selfCode = model.selfCode;
            } 

            /**
             * AppCodes.
             */
            public Builder appCodes(java.util.List<String> appCodes) {
                this.appCodes = appCodes;
                return this;
            }

            /**
             * LabelCodes.
             */
            public Builder labelCodes(java.util.List<String> labelCodes) {
                this.labelCodes = labelCodes;
                return this;
            }

            /**
             * RelateCodes.
             */
            public Builder relateCodes(java.util.List<String> relateCodes) {
                this.relateCodes = relateCodes;
                return this;
            }

            /**
             * SelfCode.
             */
            public Builder selfCode(String selfCode) {
                this.selfCode = selfCode;
                return this;
            }

            public ProductRelations build() {
                return new ProductRelations(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateBlockRequest} extends {@link TeaModel}
     *
     * <p>CreateBlockRequest</p>
     */
    public static class Product extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CodeNames")
        private java.util.List<String> codeNames;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Relations")
        private java.util.List<ProductRelations> relations;

        @com.aliyun.core.annotation.NameInMap("ViewCode")
        private java.util.List<String> viewCode;

        private Product(Builder builder) {
            this.codeNames = builder.codeNames;
            this.key = builder.key;
            this.relations = builder.relations;
            this.viewCode = builder.viewCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Product create() {
            return builder().build();
        }

        /**
         * @return codeNames
         */
        public java.util.List<String> getCodeNames() {
            return this.codeNames;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return relations
         */
        public java.util.List<ProductRelations> getRelations() {
            return this.relations;
        }

        /**
         * @return viewCode
         */
        public java.util.List<String> getViewCode() {
            return this.viewCode;
        }

        public static final class Builder {
            private java.util.List<String> codeNames; 
            private String key; 
            private java.util.List<ProductRelations> relations; 
            private java.util.List<String> viewCode; 

            private Builder() {
            } 

            private Builder(Product model) {
                this.codeNames = model.codeNames;
                this.key = model.key;
                this.relations = model.relations;
                this.viewCode = model.viewCode;
            } 

            /**
             * CodeNames.
             */
            public Builder codeNames(java.util.List<String> codeNames) {
                this.codeNames = codeNames;
                return this;
            }

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Relations.
             */
            public Builder relations(java.util.List<ProductRelations> relations) {
                this.relations = relations;
                return this;
            }

            /**
             * ViewCode.
             */
            public Builder viewCode(java.util.List<String> viewCode) {
                this.viewCode = viewCode;
                return this;
            }

            public Product build() {
                return new Product(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateBlockRequest} extends {@link TeaModel}
     *
     * <p>CreateBlockRequest</p>
     */
    public static class BlockScope extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("App")
        private App app;

        @com.aliyun.core.annotation.NameInMap("BgSystem")
        private java.util.List<BgSystem> bgSystem;

        @com.aliyun.core.annotation.NameInMap("Cluster")
        private Cluster cluster;

        @com.aliyun.core.annotation.NameInMap("Customer")
        private java.util.List<Customer> customer;

        @com.aliyun.core.annotation.NameInMap("Dept")
        private java.util.List<String> dept;

        @com.aliyun.core.annotation.NameInMap("Express")
        private String express;

        @com.aliyun.core.annotation.NameInMap("Infrastructure")
        private java.util.List<String> infrastructure;

        @com.aliyun.core.annotation.NameInMap("Product")
        private java.util.List<Product> product;

        private BlockScope(Builder builder) {
            this.app = builder.app;
            this.bgSystem = builder.bgSystem;
            this.cluster = builder.cluster;
            this.customer = builder.customer;
            this.dept = builder.dept;
            this.express = builder.express;
            this.infrastructure = builder.infrastructure;
            this.product = builder.product;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BlockScope create() {
            return builder().build();
        }

        /**
         * @return app
         */
        public App getApp() {
            return this.app;
        }

        /**
         * @return bgSystem
         */
        public java.util.List<BgSystem> getBgSystem() {
            return this.bgSystem;
        }

        /**
         * @return cluster
         */
        public Cluster getCluster() {
            return this.cluster;
        }

        /**
         * @return customer
         */
        public java.util.List<Customer> getCustomer() {
            return this.customer;
        }

        /**
         * @return dept
         */
        public java.util.List<String> getDept() {
            return this.dept;
        }

        /**
         * @return express
         */
        public String getExpress() {
            return this.express;
        }

        /**
         * @return infrastructure
         */
        public java.util.List<String> getInfrastructure() {
            return this.infrastructure;
        }

        /**
         * @return product
         */
        public java.util.List<Product> getProduct() {
            return this.product;
        }

        public static final class Builder {
            private App app; 
            private java.util.List<BgSystem> bgSystem; 
            private Cluster cluster; 
            private java.util.List<Customer> customer; 
            private java.util.List<String> dept; 
            private String express; 
            private java.util.List<String> infrastructure; 
            private java.util.List<Product> product; 

            private Builder() {
            } 

            private Builder(BlockScope model) {
                this.app = model.app;
                this.bgSystem = model.bgSystem;
                this.cluster = model.cluster;
                this.customer = model.customer;
                this.dept = model.dept;
                this.express = model.express;
                this.infrastructure = model.infrastructure;
                this.product = model.product;
            } 

            /**
             * App.
             */
            public Builder app(App app) {
                this.app = app;
                return this;
            }

            /**
             * BgSystem.
             */
            public Builder bgSystem(java.util.List<BgSystem> bgSystem) {
                this.bgSystem = bgSystem;
                return this;
            }

            /**
             * Cluster.
             */
            public Builder cluster(Cluster cluster) {
                this.cluster = cluster;
                return this;
            }

            /**
             * Customer.
             */
            public Builder customer(java.util.List<Customer> customer) {
                this.customer = customer;
                return this;
            }

            /**
             * Dept.
             */
            public Builder dept(java.util.List<String> dept) {
                this.dept = dept;
                return this;
            }

            /**
             * Express.
             */
            public Builder express(String express) {
                this.express = express;
                return this;
            }

            /**
             * Infrastructure.
             */
            public Builder infrastructure(java.util.List<String> infrastructure) {
                this.infrastructure = infrastructure;
                return this;
            }

            /**
             * Product.
             */
            public Builder product(java.util.List<Product> product) {
                this.product = product;
                return this;
            }

            public BlockScope build() {
                return new BlockScope(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateBlockRequest} extends {@link TeaModel}
     *
     * <p>CreateBlockRequest</p>
     */
    public static class Scopes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BlockHarm")
        private java.util.List<Integer> blockHarm;

        @com.aliyun.core.annotation.NameInMap("BlockScope")
        private BlockScope blockScope;

        @com.aliyun.core.annotation.NameInMap("EffectTime")
        private java.util.List<Long> effectTime;

        @com.aliyun.core.annotation.NameInMap("ScopeRule")
        private String scopeRule;

        @com.aliyun.core.annotation.NameInMap("changeObjectRegex")
        private String changeObjectRegex;

        @com.aliyun.core.annotation.NameInMap("riskLevels")
        private java.util.List<Integer> riskLevels;

        private Scopes(Builder builder) {
            this.blockHarm = builder.blockHarm;
            this.blockScope = builder.blockScope;
            this.effectTime = builder.effectTime;
            this.scopeRule = builder.scopeRule;
            this.changeObjectRegex = builder.changeObjectRegex;
            this.riskLevels = builder.riskLevels;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Scopes create() {
            return builder().build();
        }

        /**
         * @return blockHarm
         */
        public java.util.List<Integer> getBlockHarm() {
            return this.blockHarm;
        }

        /**
         * @return blockScope
         */
        public BlockScope getBlockScope() {
            return this.blockScope;
        }

        /**
         * @return effectTime
         */
        public java.util.List<Long> getEffectTime() {
            return this.effectTime;
        }

        /**
         * @return scopeRule
         */
        public String getScopeRule() {
            return this.scopeRule;
        }

        /**
         * @return changeObjectRegex
         */
        public String getChangeObjectRegex() {
            return this.changeObjectRegex;
        }

        /**
         * @return riskLevels
         */
        public java.util.List<Integer> getRiskLevels() {
            return this.riskLevels;
        }

        public static final class Builder {
            private java.util.List<Integer> blockHarm; 
            private BlockScope blockScope; 
            private java.util.List<Long> effectTime; 
            private String scopeRule; 
            private String changeObjectRegex; 
            private java.util.List<Integer> riskLevels; 

            private Builder() {
            } 

            private Builder(Scopes model) {
                this.blockHarm = model.blockHarm;
                this.blockScope = model.blockScope;
                this.effectTime = model.effectTime;
                this.scopeRule = model.scopeRule;
                this.changeObjectRegex = model.changeObjectRegex;
                this.riskLevels = model.riskLevels;
            } 

            /**
             * BlockHarm.
             */
            public Builder blockHarm(java.util.List<Integer> blockHarm) {
                this.blockHarm = blockHarm;
                return this;
            }

            /**
             * BlockScope.
             */
            public Builder blockScope(BlockScope blockScope) {
                this.blockScope = blockScope;
                return this;
            }

            /**
             * EffectTime.
             */
            public Builder effectTime(java.util.List<Long> effectTime) {
                this.effectTime = effectTime;
                return this;
            }

            /**
             * ScopeRule.
             */
            public Builder scopeRule(String scopeRule) {
                this.scopeRule = scopeRule;
                return this;
            }

            /**
             * changeObjectRegex.
             */
            public Builder changeObjectRegex(String changeObjectRegex) {
                this.changeObjectRegex = changeObjectRegex;
                return this;
            }

            /**
             * riskLevels.
             */
            public Builder riskLevels(java.util.List<Integer> riskLevels) {
                this.riskLevels = riskLevels;
                return this;
            }

            public Scopes build() {
                return new Scopes(this);
            } 

        } 

    }
}
