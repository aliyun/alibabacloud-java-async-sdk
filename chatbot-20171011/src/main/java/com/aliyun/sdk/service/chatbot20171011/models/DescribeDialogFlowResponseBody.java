// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDialogFlowResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDialogFlowResponseBody</p>
 */
public class DescribeDialogFlowResponseBody extends TeaModel {
    @NameInMap("AccountId")
    private String accountId;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("CreateUserId")
    private String createUserId;

    @NameInMap("CreateUserName")
    private String createUserName;

    @NameInMap("DialogId")
    private Long dialogId;

    @NameInMap("DialogName")
    private String dialogName;

    @NameInMap("GlobalVars")
    private java.util.Map < String, ? > globalVars;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("ModifyTime")
    private String modifyTime;

    @NameInMap("ModifyUserId")
    private String modifyUserId;

    @NameInMap("ModifyUserName")
    private String modifyUserName;

    @NameInMap("ModuleDefinition")
    private PaasProcessData moduleDefinition;

    @NameInMap("ModuleId")
    private Long moduleId;

    @NameInMap("ModuleName")
    private String moduleName;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private Integer status;

    @NameInMap("Tags")
    private String tags;

    @NameInMap("Templates")
    private String templates;

    private DescribeDialogFlowResponseBody(Builder builder) {
        this.accountId = builder.accountId;
        this.createTime = builder.createTime;
        this.createUserId = builder.createUserId;
        this.createUserName = builder.createUserName;
        this.dialogId = builder.dialogId;
        this.dialogName = builder.dialogName;
        this.globalVars = builder.globalVars;
        this.instanceId = builder.instanceId;
        this.modifyTime = builder.modifyTime;
        this.modifyUserId = builder.modifyUserId;
        this.modifyUserName = builder.modifyUserName;
        this.moduleDefinition = builder.moduleDefinition;
        this.moduleId = builder.moduleId;
        this.moduleName = builder.moduleName;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.tags = builder.tags;
        this.templates = builder.templates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDialogFlowResponseBody create() {
        return builder().build();
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return createUserId
     */
    public String getCreateUserId() {
        return this.createUserId;
    }

    /**
     * @return createUserName
     */
    public String getCreateUserName() {
        return this.createUserName;
    }

    /**
     * @return dialogId
     */
    public Long getDialogId() {
        return this.dialogId;
    }

    /**
     * @return dialogName
     */
    public String getDialogName() {
        return this.dialogName;
    }

    /**
     * @return globalVars
     */
    public java.util.Map < String, ? > getGlobalVars() {
        return this.globalVars;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return modifyTime
     */
    public String getModifyTime() {
        return this.modifyTime;
    }

    /**
     * @return modifyUserId
     */
    public String getModifyUserId() {
        return this.modifyUserId;
    }

    /**
     * @return modifyUserName
     */
    public String getModifyUserName() {
        return this.modifyUserName;
    }

    /**
     * @return moduleDefinition
     */
    public PaasProcessData getModuleDefinition() {
        return this.moduleDefinition;
    }

    /**
     * @return moduleId
     */
    public Long getModuleId() {
        return this.moduleId;
    }

    /**
     * @return moduleName
     */
    public String getModuleName() {
        return this.moduleName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    /**
     * @return templates
     */
    public String getTemplates() {
        return this.templates;
    }

    public static final class Builder {
        private String accountId; 
        private String createTime; 
        private String createUserId; 
        private String createUserName; 
        private Long dialogId; 
        private String dialogName; 
        private java.util.Map < String, ? > globalVars; 
        private String instanceId; 
        private String modifyTime; 
        private String modifyUserId; 
        private String modifyUserName; 
        private PaasProcessData moduleDefinition; 
        private Long moduleId; 
        private String moduleName; 
        private String requestId; 
        private Integer status; 
        private String tags; 
        private String templates; 

        /**
         * AccountId.
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
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
         * CreateUserId.
         */
        public Builder createUserId(String createUserId) {
            this.createUserId = createUserId;
            return this;
        }

        /**
         * CreateUserName.
         */
        public Builder createUserName(String createUserName) {
            this.createUserName = createUserName;
            return this;
        }

        /**
         * DialogId.
         */
        public Builder dialogId(Long dialogId) {
            this.dialogId = dialogId;
            return this;
        }

        /**
         * DialogName.
         */
        public Builder dialogName(String dialogName) {
            this.dialogName = dialogName;
            return this;
        }

        /**
         * GlobalVars.
         */
        public Builder globalVars(java.util.Map < String, ? > globalVars) {
            this.globalVars = globalVars;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
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
         * ModifyUserId.
         */
        public Builder modifyUserId(String modifyUserId) {
            this.modifyUserId = modifyUserId;
            return this;
        }

        /**
         * ModifyUserName.
         */
        public Builder modifyUserName(String modifyUserName) {
            this.modifyUserName = modifyUserName;
            return this;
        }

        /**
         * ModuleDefinition.
         */
        public Builder moduleDefinition(PaasProcessData moduleDefinition) {
            this.moduleDefinition = moduleDefinition;
            return this;
        }

        /**
         * ModuleId.
         */
        public Builder moduleId(Long moduleId) {
            this.moduleId = moduleId;
            return this;
        }

        /**
         * ModuleName.
         */
        public Builder moduleName(String moduleName) {
            this.moduleName = moduleName;
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
         * 0 for deleted, 1 for inSandbox, 2 for draft，3 for online
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        /**
         * null
         */
        public Builder tags(String tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Templates.
         */
        public Builder templates(String templates) {
            this.templates = templates;
            return this;
        }

        public DescribeDialogFlowResponseBody build() {
            return new DescribeDialogFlowResponseBody(this);
        } 

    } 

}
