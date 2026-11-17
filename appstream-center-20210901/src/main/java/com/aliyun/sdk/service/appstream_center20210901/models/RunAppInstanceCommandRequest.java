// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link RunAppInstanceCommandRequest} extends {@link RequestModel}
 *
 * <p>RunAppInstanceCommandRequest</p>
 */
public class RunAppInstanceCommandRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppInstanceGroupId")
    private String appInstanceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppInstanceGroupIds")
    private java.util.List<String> appInstanceGroupIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppInstancePersistentId")
    private String appInstancePersistentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppInstancePersistentIds")
    private java.util.List<String> appInstancePersistentIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CommandContent")
    @com.aliyun.core.annotation.Validation(required = true)
    private String commandContent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CommandParam")
    private String commandParam;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CommandType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String commandType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RunScriptType")
    private String runScriptType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Timeout")
    private Long timeout;

    private RunAppInstanceCommandRequest(Builder builder) {
        super(builder);
        this.appInstanceGroupId = builder.appInstanceGroupId;
        this.appInstanceGroupIds = builder.appInstanceGroupIds;
        this.appInstancePersistentId = builder.appInstancePersistentId;
        this.appInstancePersistentIds = builder.appInstancePersistentIds;
        this.commandContent = builder.commandContent;
        this.commandParam = builder.commandParam;
        this.commandType = builder.commandType;
        this.description = builder.description;
        this.productType = builder.productType;
        this.runScriptType = builder.runScriptType;
        this.timeout = builder.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunAppInstanceCommandRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appInstanceGroupId
     */
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    /**
     * @return appInstanceGroupIds
     */
    public java.util.List<String> getAppInstanceGroupIds() {
        return this.appInstanceGroupIds;
    }

    /**
     * @return appInstancePersistentId
     */
    public String getAppInstancePersistentId() {
        return this.appInstancePersistentId;
    }

    /**
     * @return appInstancePersistentIds
     */
    public java.util.List<String> getAppInstancePersistentIds() {
        return this.appInstancePersistentIds;
    }

    /**
     * @return commandContent
     */
    public String getCommandContent() {
        return this.commandContent;
    }

    /**
     * @return commandParam
     */
    public String getCommandParam() {
        return this.commandParam;
    }

    /**
     * @return commandType
     */
    public String getCommandType() {
        return this.commandType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return runScriptType
     */
    public String getRunScriptType() {
        return this.runScriptType;
    }

    /**
     * @return timeout
     */
    public Long getTimeout() {
        return this.timeout;
    }

    public static final class Builder extends Request.Builder<RunAppInstanceCommandRequest, Builder> {
        private String appInstanceGroupId; 
        private java.util.List<String> appInstanceGroupIds; 
        private String appInstancePersistentId; 
        private java.util.List<String> appInstancePersistentIds; 
        private String commandContent; 
        private String commandParam; 
        private String commandType; 
        private String description; 
        private String productType; 
        private String runScriptType; 
        private Long timeout; 

        private Builder() {
            super();
        } 

        private Builder(RunAppInstanceCommandRequest request) {
            super(request);
            this.appInstanceGroupId = request.appInstanceGroupId;
            this.appInstanceGroupIds = request.appInstanceGroupIds;
            this.appInstancePersistentId = request.appInstancePersistentId;
            this.appInstancePersistentIds = request.appInstancePersistentIds;
            this.commandContent = request.commandContent;
            this.commandParam = request.commandParam;
            this.commandType = request.commandType;
            this.description = request.description;
            this.productType = request.productType;
            this.runScriptType = request.runScriptType;
            this.timeout = request.timeout;
        } 

        /**
         * <p>The ID of the delivery group. This parameter is used to execute commands within a single delivery group. You can call the <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> operation to obtain the ID. If AppInstanceGroupIds is not specified, you must specify this parameter. Otherwise, a parameter error is returned. If AppInstanceGroupIds is specified, this parameter does not take effect.</p>
         * 
         * <strong>example:</strong>
         * <p>aig-9ciijz60n4xsv****</p>
         */
        public Builder appInstanceGroupId(String appInstanceGroupId) {
            this.putBodyParameter("AppInstanceGroupId", appInstanceGroupId);
            this.appInstanceGroupId = appInstanceGroupId;
            return this;
        }

        /**
         * <p>The list of delivery group IDs. This parameter is used to issue commands in batches to multiple delivery groups in the same region. The command is executed on all persistent sessions in each delivery group in the list, and only one command execution ID is returned. You can specify up to 100 delivery group IDs. Duplicate IDs are automatically deduplicated. All delivery groups must belong to the same region. Otherwise, the InvalidRegion.NotMatch error is returned. If any delivery group does not exist, the InvalidAppInstanceGroup.NotFound error is returned. If this parameter is specified, AppInstanceGroupId and AppInstancePersistentIds do not take effect.</p>
         */
        public Builder appInstanceGroupIds(java.util.List<String> appInstanceGroupIds) {
            this.putBodyParameter("AppInstanceGroupIds", appInstanceGroupIds);
            this.appInstanceGroupIds = appInstanceGroupIds;
            return this;
        }

        /**
         * <p>The ID of the persistent session. This parameter is used to select a single persistent session within the delivery group specified by AppInstanceGroupId to execute the command. The session must belong to the specified delivery group. Otherwise, an error is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>p-0cc7s3mw2fg4j****</p>
         */
        public Builder appInstancePersistentId(String appInstancePersistentId) {
            this.putBodyParameter("AppInstancePersistentId", appInstancePersistentId);
            this.appInstancePersistentId = appInstancePersistentId;
            return this;
        }

        /**
         * <p>The list of persistent session IDs. This parameter is used to select multiple persistent sessions within the delivery group specified by AppInstanceGroupId to execute the command. You can specify up to 100 session IDs. If AppInstanceGroupIds is specified, this parameter does not take effect, and the command is executed on all persistent sessions in each delivery group.</p>
         */
        public Builder appInstancePersistentIds(java.util.List<String> appInstancePersistentIds) {
            this.putBodyParameter("AppInstancePersistentIds", appInstancePersistentIds);
            this.appInstancePersistentIds = appInstancePersistentIds;
            return this;
        }

        /**
         * <p>The command content, which is the script content executed in the session. The content must match the script type specified by RunScriptType.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>echo hello</p>
         */
        public Builder commandContent(String commandContent) {
            this.putBodyParameter("CommandContent", commandContent);
            this.commandContent = commandContent;
            return this;
        }

        /**
         * <p>The command parameters, which are passed through to the session execution end along with the command content. Whether to specify this parameter and the specific format depend on the command content. If not required, you can leave this parameter empty.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;name&quot;:&quot;value&quot;}</p>
         */
        public Builder commandParam(String commandParam) {
            this.putBodyParameter("CommandParam", commandParam);
            this.commandParam = commandParam;
            return this;
        }

        /**
         * <p>The command type. Currently, only CloudAssistantCmd (Cloud Assistant command) is supported. Specifying other values results in a parameter error.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CloudAssistantCmd</p>
         */
        public Builder commandType(String commandType) {
            this.putBodyParameter("CommandType", commandType);
            this.commandType = commandType;
            return this;
        }

        /**
         * <p>The description of the command. This parameter is used to describe the purpose of the issued command for subsequent identification.</p>
         * 
         * <strong>example:</strong>
         * <p>Clean up temporary files</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The product type. Currently, only WuyingServer (WUYING Workspace) is supported. Specifying other values results in a parameter error.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>WuyingServer</p>
         */
        public Builder productType(String productType) {
            this.putBodyParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * <p>The type of the script to execute. Valid values:</p>
         * <ul>
         * <li>RunBatScript: BAT script.</li>
         * <li>RunPowerShellScript: PowerShell script.</li>
         * <li>RunShellScript: Shell script.</li>
         * <li>RunAIAgentScript: AI agent script.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RunShellScript</p>
         */
        public Builder runScriptType(String runScriptType) {
            this.putBodyParameter("RunScriptType", runScriptType);
            this.runScriptType = runScriptType;
            return this;
        }

        /**
         * <p>The timeout period for command execution, in seconds. If this parameter is not specified, the default value is 60 seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder timeout(Long timeout) {
            this.putBodyParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        @Override
        public RunAppInstanceCommandRequest build() {
            return new RunAppInstanceCommandRequest(this);
        } 

    } 

}
