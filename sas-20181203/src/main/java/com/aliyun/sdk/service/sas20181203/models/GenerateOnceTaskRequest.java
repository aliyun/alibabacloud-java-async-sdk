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
 * {@link GenerateOnceTaskRequest} extends {@link RequestModel}
 *
 * <p>GenerateOnceTaskRequest</p>
 */
public class GenerateOnceTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Param")
    @com.aliyun.core.annotation.Validation(required = true)
    private String param;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskType;

    private GenerateOnceTaskRequest(Builder builder) {
        super(builder);
        this.param = builder.param;
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
        this.source = builder.source;
        this.taskName = builder.taskName;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateOnceTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return param
     */
    public String getParam() {
        return this.param;
    }

    /**
     * @return resourceDirectoryAccountId
     */
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
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

    public static final class Builder extends Request.Builder<GenerateOnceTaskRequest, Builder> {
        private String param; 
        private Long resourceDirectoryAccountId; 
        private String source; 
        private String taskName; 
        private String taskType; 

        private Builder() {
            super();
        } 

        private Builder(GenerateOnceTaskRequest request) {
            super(request);
            this.param = request.param;
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
            this.source = request.source;
            this.taskName = request.taskName;
            this.taskType = request.taskType;
        } 

        /**
         * <p>The extended information field.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;mode&quot;:1,&quot;problemType&quot;:&quot;offline&quot;,&quot;uuids&quot;:&quot;inet-795dcad1-360f-49d2-b01e-b7da7f1c****&quot;}</p>
         */
        public Builder param(String param) {
            this.putQueryParameter("Param", param);
            this.param = param;
            return this;
        }

        /**
         * <p>The ID of the member accounts (Alibaba Cloud account) in the resource folder.</p>
         * <blockquote>
         * <p>You can invoke the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to query this parameter.</p>
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
         * <p>The source of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>Manual</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>The node name. Valid values:</p>
         * <ul>
         * <li><strong>CLIENT_PROBLEM_CHECK</strong>: client troubleshooting node</li>
         * <li><strong>CLIENT_DEV_OPS</strong>: cloud O&amp;M node</li>
         * <li><strong>ASSET_SECURITY_CHECK</strong>: asset collection node</li>
         * <li><strong>ASSETS_COLLECTION</strong>: Asset Fingerprints collection node</li>
         * <li><strong>IMAGE_SCAN</strong>: container image scan node</li>
         * <li><strong>AI_SECURITY_CHECK</strong>: AI asset synchronization node</li>
         * <li><strong>IDC_PROBE_SCAN</strong>: IDC probe scan node</li>
         * <li><strong>ATTACK_SURFACE_SCAN</strong>: attack surface border asset scan node</li>
         * <li><strong>ASSET_EXPOSURE_SCAN</strong>: asset exposure scan node</li>
         * <li><strong>VUL_CHECK_TASK</strong>: vulnerability scanning node</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CLIENT_PROBLEM_CHECK</p>
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * <p>The node type. Valid values:</p>
         * <ul>
         * <li><strong>CLIENT_PROBLEM_CHECK</strong>: client troubleshooting node</li>
         * <li><strong>CLIENT_DEV_OPS</strong>: cloud O&amp;M node</li>
         * <li><strong>ASSET_SECURITY_CHECK</strong>: asset collection node</li>
         * <li><strong>ASSETS_COLLECTION</strong>: Asset Fingerprints collection node</li>
         * <li><strong>IMAGE_SCAN</strong>: container image scan node</li>
         * <li><strong>AI_SECURITY_CHECK</strong>: AI asset synchronization node</li>
         * <li><strong>IDC_PROBE_SCAN</strong>: IDC probe scan node</li>
         * <li><strong>ATTACK_SURFACE_SCAN</strong>: attack surface border asset scan node</li>
         * <li><strong>ASSET_EXPOSURE_SCAN</strong>: asset exposure scan node</li>
         * <li><strong>VUL_CHECK_TASK</strong>: vulnerability scanning node</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CLIENT_PROBLEM_CHECK</p>
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        @Override
        public GenerateOnceTaskRequest build() {
            return new GenerateOnceTaskRequest(this);
        } 

    } 

}
