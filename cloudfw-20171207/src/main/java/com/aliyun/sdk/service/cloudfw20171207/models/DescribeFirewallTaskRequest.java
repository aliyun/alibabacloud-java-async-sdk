// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeFirewallTaskRequest} extends {@link RequestModel}
 *
 * <p>DescribeFirewallTaskRequest</p>
 */
public class DescribeFirewallTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChildInstanceId")
    private String childInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskType")
    private String taskType;

    private DescribeFirewallTaskRequest(Builder builder) {
        super(builder);
        this.childInstanceId = builder.childInstanceId;
        this.lang = builder.lang;
        this.taskId = builder.taskId;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFirewallTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return childInstanceId
     */
    public String getChildInstanceId() {
        return this.childInstanceId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    public static final class Builder extends Request.Builder<DescribeFirewallTaskRequest, Builder> {
        private String childInstanceId; 
        private String lang; 
        private String taskId; 
        private String taskType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFirewallTaskRequest request) {
            super(request);
            this.childInstanceId = request.childInstanceId;
            this.lang = request.lang;
            this.taskId = request.taskId;
            this.taskType = request.taskType;
        } 

        /**
         * <p>The child instance ID. You must specify at least one of ChildInstanceId and TaskId. If both are empty, the error MissingParameter.TaskId (-360448) is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>vfw-tr-cd6000c588214403****</p>
         */
        public Builder childInstanceId(String childInstanceId) {
            this.putQueryParameter("ChildInstanceId", childInstanceId);
            this.childInstanceId = childInstanceId;
            return this;
        }

        /**
         * <p>The language type. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The task ID. You must specify at least one of TaskId and ChildInstanceId. If both are empty, the error MissingParameter.TaskId (-360448, At least one of TaskId or ChildInstanceId is required.) is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>199431783</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The type of the task. Valid values:</p>
         * <ul>
         * <li><p><strong>NAT</strong>: NAT firewall task</p>
         * </li>
         * <li><p><strong>VPC</strong>: VPC firewall task</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        @Override
        public DescribeFirewallTaskRequest build() {
            return new DescribeFirewallTaskRequest(this);
        } 

    } 

}
