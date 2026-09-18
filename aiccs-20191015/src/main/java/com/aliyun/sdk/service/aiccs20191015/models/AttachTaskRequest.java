// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link AttachTaskRequest} extends {@link RequestModel}
 *
 * <p>AttachTaskRequest</p>
 */
public class AttachTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallString")
    private String callString;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long taskId;

    private AttachTaskRequest(Builder builder) {
        super(builder);
        this.callString = builder.callString;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callString
     */
    public String getCallString() {
        return this.callString;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<AttachTaskRequest, Builder> {
        private String callString; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Long taskId; 

        private Builder() {
            super();
        } 

        private Builder(AttachTaskRequest request) {
            super(request);
            this.callString = request.callString;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.taskId = request.taskId;
        } 

        /**
         * <p>The calling string (callee information and parameter list). Valid values:</p>
         * <ul>
         * <li><strong>LIST</strong>: Use this type when the script has no input variables. In this case, only the callee numbers need to be provided. Example: <code>0571****5678,0571****5679</code>.</li>
         * <li><strong>JSON</strong>: Use this type when the script includes input variables. You must provide the variable names, callee numbers, and variable values. Example: <code>{&quot;ParamNames&quot;:[&quot;name&quot;,&quot;age&quot;],&quot;CalleeList&quot;:[{&quot;Callee&quot;:&quot;181****0000&quot;,&quot;Params&quot;:[&quot;Zhang San&quot;,&quot;20&quot;]},{&quot;Callee&quot;:&quot;181****0001&quot;,&quot;Params&quot;:[&quot;Li Si&quot;,&quot;21&quot;]}]}</code>. <strong>ParamNames</strong> represents the list of parameter names; <strong>Params</strong> represents the list of parameter values.</li>
         * </ul>
         * <blockquote>
         * <p>You can view the script input variables on the <a href="https://aiccs.console.aliyun.com/patter/list"><strong>Script Management</strong></a> &gt; <strong>View</strong> &gt; <strong>Input and Output Parameters</strong> interface.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;ParamNames&quot;: [
         *     &quot;name&quot;,
         *     &quot;age&quot;
         *   ],
         *   &quot;CalleeList&quot;: [
         *     {
         *       &quot;Callee&quot;: &quot;181<strong><strong>0000&quot;,
         *       &quot;Params&quot;: [
         *         &quot;张三&quot;,
         *         &quot;20&quot;
         *       ]
         *     },
         *     {
         *       &quot;Callee&quot;: &quot;181</strong></strong>0001&quot;,
         *       &quot;Params&quot;: [
         *         &quot;李四&quot;,
         *         &quot;21&quot;
         *       ]
         *     }
         *   ]
         * }</p>
         */
        public Builder callString(String callString) {
            this.putQueryParameter("CallString", callString);
            this.callString = callString;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The job ID. You can obtain the job ID from the <a href="https://aiccs.console.aliyun.com/job/list">Task Management</a> interface.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12****</p>
         */
        public Builder taskId(Long taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public AttachTaskRequest build() {
            return new AttachTaskRequest(this);
        } 

    } 

}
