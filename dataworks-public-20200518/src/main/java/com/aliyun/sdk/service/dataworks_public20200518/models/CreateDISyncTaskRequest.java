// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link CreateDISyncTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateDISyncTaskRequest</p>
 */
public class CreateDISyncTaskRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 10000000000D, minimum = 1)
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskContent")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskParam")
    private String taskParam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskType;

    private CreateDISyncTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clientToken = builder.clientToken;
        this.projectId = builder.projectId;
        this.taskContent = builder.taskContent;
        this.taskName = builder.taskName;
        this.taskParam = builder.taskParam;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDISyncTaskRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return taskContent
     */
    public String getTaskContent() {
        return this.taskContent;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return taskParam
     */
    public String getTaskParam() {
        return this.taskParam;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    public static final class Builder extends Request.Builder<CreateDISyncTaskRequest, Builder> {
        private String regionId; 
        private String clientToken; 
        private Long projectId; 
        private String taskContent; 
        private String taskName; 
        private String taskParam; 
        private String taskType; 

        private Builder() {
            super();
        } 

        private Builder(CreateDISyncTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clientToken = request.clientToken;
            this.projectId = request.projectId;
            this.taskContent = request.taskContent;
            this.taskName = request.taskName;
            this.taskParam = request.taskParam;
            this.taskType = request.taskType;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. This parameter can be left empty.</p>
         * 
         * <strong>example:</strong>
         * <p>0000-ABCD-EFG****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The DataWorks workspace ID. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to query the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder taskContent(String taskContent) {
            this.putBodyParameter("TaskContent", taskContent);
            this.taskContent = taskContent;
            return this;
        }

        /**
         * <p>The name of the data synchronization task.</p>
         * 
         * <strong>example:</strong>
         * <p>new_di_task</p>
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * <p>The configuration parameters of the data synchronization task. The following parameters are supported:</p>
         * <ul>
         * <li>FileFolderPath: the storage path of the data synchronization task.</li>
         * <li>ResourceGroup: the identifier of the resource group for Data Integration that is used by the data synchronization task. You can call the <a href="https://help.aliyun.com/document_detail/173913.html">ListResourceGroups</a> operation to query the identifier of the resource group.</li>
         * <li>Cu: the specifications occupied by the data synchronization task in the serverless resource group. The value of this parameter must be a multiple of 0.5.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;FileFolderPath&quot;:&quot;Business Flow/XXX/Data Integration&quot;,&quot;ResourceGroup&quot;:&quot;S_res_group_XXX_XXXX&quot;}</p>
         */
        public Builder taskParam(String taskParam) {
            this.putQueryParameter("TaskParam", taskParam);
            this.taskParam = taskParam;
            return this;
        }

        /**
         * <p>The type of the data synchronization task. Valid values: DI_OFFLINE, DI_REALTIME, and DI_SOLUTION.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DI_OFFLINE</p>
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        @Override
        public CreateDISyncTaskRequest build() {
            return new CreateDISyncTaskRequest(this);
        } 

    } 

}
