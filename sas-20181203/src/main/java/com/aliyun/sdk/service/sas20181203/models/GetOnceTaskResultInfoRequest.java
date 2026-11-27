// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetOnceTaskResultInfoRequest} extends {@link RequestModel}
 *
 * <p>GetOnceTaskResultInfoRequest</p>
 */
public class GetOnceTaskResultInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskType;

    private GetOnceTaskResultInfoRequest(Builder builder) {
        super(builder);
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
        this.taskId = builder.taskId;
        this.taskName = builder.taskName;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOnceTaskResultInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceDirectoryAccountId
     */
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    public static final class Builder extends Request.Builder<GetOnceTaskResultInfoRequest, Builder> {
        private Long resourceDirectoryAccountId; 
        private String taskId; 
        private String taskName; 
        private String taskType; 

        private Builder() {
            super();
        } 

        private Builder(GetOnceTaskResultInfoRequest request) {
            super(request);
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
            this.taskId = request.taskId;
            this.taskName = request.taskName;
            this.taskType = request.taskType;
        } 

        /**
         * <p>The ID of the member accounts in the resource folder. The member accounts are Alibaba Cloud accounts.</p>
         * <blockquote>
         * <p>You can invoke the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>176618589410****</p>
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        /**
         * <p>The ID of the scan task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9dfa3a7eb9547781632785b49003****</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The node name. Valid values:</p>
         * <ul>
         * <li><strong>CLIENT_PROBLEM_CHECK</strong>: Client troubleshooting node.</li>
         * <li><strong>CLIENT_DEV_OPS</strong>: Cloud O&amp;M node.</li>
         * <li><strong>ASSET_SECURITY_CHECK</strong>: Asset collection node.</li>
         * <li><strong>ASSETS_COLLECTION</strong>: Asset Fingerprints collection node.</li>
         * <li><strong>IMAGE_SCAN</strong>: Container image scan node.</li>
         * <li><strong>AI_SECURITY_CHECK</strong>: AI asset synchronization node.</li>
         * <li><strong>IDC_PROBE_SCAN</strong>: IDC probe scan node.</li>
         * <li><strong>ATTACK_SURFACE_SCAN</strong>: Attack surface border asset scan node.</li>
         * <li><strong>ASSET_EXPOSURE_SCAN</strong>: Asset exposure scan node.</li>
         * <li><strong>VUL_CHECK_TASK</strong>: Vulnerability scanning node.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ASSETS_COLLECTION</p>
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * <p>The node type. Valid values:</p>
         * <ul>
         * <li><strong>CLIENT_PROBLEM_CHECK</strong>: Client troubleshooting node.</li>
         * <li><strong>CLIENT_DEV_OPS</strong>: Cloud O&amp;M node.</li>
         * <li><strong>ASSET_SECURITY_CHECK</strong>: Asset collection node.</li>
         * <li><strong>ASSETS_COLLECTION</strong>: Asset Fingerprints collection node.</li>
         * <li><strong>IMAGE_SCAN</strong>: Container image scan node.</li>
         * <li><strong>AI_SECURITY_CHECK</strong>: AI asset synchronization node.</li>
         * <li><strong>IDC_PROBE_SCAN</strong>: IDC probe scan node.</li>
         * <li><strong>ATTACK_SURFACE_SCAN</strong>: Attack surface border asset scan node.</li>
         * <li><strong>ASSET_EXPOSURE_SCAN</strong>: Asset exposure scan node.</li>
         * <li><strong>VUL_CHECK_TASK</strong>: Vulnerability scanning node.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ASSETS_COLLECTION</p>
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        @Override
        public GetOnceTaskResultInfoRequest build() {
            return new GetOnceTaskResultInfoRequest(this);
        } 

    } 

}
