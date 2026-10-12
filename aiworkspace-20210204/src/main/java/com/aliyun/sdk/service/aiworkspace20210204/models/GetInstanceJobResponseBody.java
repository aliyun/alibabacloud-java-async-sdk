// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link GetInstanceJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceJobResponseBody</p>
 */
public class GetInstanceJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("InstanceJobId")
    private String instanceJobId;

    @com.aliyun.core.annotation.NameInMap("ReasonMessage")
    private String reasonMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private GetInstanceJobResponseBody(Builder builder) {
        this.gmtCreateTime = builder.gmtCreateTime;
        this.instanceId = builder.instanceId;
        this.instanceJobId = builder.instanceJobId;
        this.reasonMessage = builder.reasonMessage;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceJobId
     */
    public String getInstanceJobId() {
        return this.instanceJobId;
    }

    /**
     * @return reasonMessage
     */
    public String getReasonMessage() {
        return this.reasonMessage;
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
    public String getStatus() {
        return this.status;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String gmtCreateTime; 
        private String instanceId; 
        private String instanceJobId; 
        private String reasonMessage; 
        private String requestId; 
        private String status; 
        private String type; 

        private Builder() {
        } 

        private Builder(GetInstanceJobResponseBody model) {
            this.gmtCreateTime = model.gmtCreateTime;
            this.instanceId = model.instanceId;
            this.instanceJobId = model.instanceJobId;
            this.reasonMessage = model.reasonMessage;
            this.requestId = model.requestId;
            this.status = model.status;
            this.type = model.type;
        } 

        /**
         * <p>The creation time in UTC, in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-21T17:12:35.232Z</p>
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * <p>The instance ID. For example, if a job creates a custom role, this parameter returns the corresponding role ID.</p>
         * 
         * <strong>example:</strong>
         * <p><em><strong><strong>12qb3</strong></strong></em></p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CreateWorkspaceCustomRole-role-<em><strong>abc</strong></em>****</p>
         */
        public Builder instanceJobId(String instanceJobId) {
            this.instanceJobId = instanceJobId;
            return this;
        }

        /**
         * <p>A message providing details about the job.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace-example</p>
         */
        public Builder reasonMessage(String reasonMessage) {
            this.reasonMessage = reasonMessage;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1e195c5116124202371861018d5bde</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the job. Valid values:</p>
         * <ul>
         * <li><p>Creating: The job is being created.</p>
         * </li>
         * <li><p>Updating: The job is being updated.</p>
         * </li>
         * <li><p>Deleting: The job is being deleted.</p>
         * </li>
         * <li><p>Successful: The job completed successfully (a final state).</p>
         * </li>
         * <li><p>Failed: The job failed (a final state).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The job type. Valid values:</p>
         * <ul>
         * <li><p>CreateWorkspaceCustomRole</p>
         * </li>
         * <li><p>UpdateWorkspaceCustomRole</p>
         * </li>
         * <li><p>DeleteWorkspaceCustomRole</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CreateWorkspaceCustomRole</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public GetInstanceJobResponseBody build() {
            return new GetInstanceJobResponseBody(this);
        } 

    } 

}
