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
 * {@link CreateVpcFirewallTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateVpcFirewallTaskRequest</p>
 */
public class CreateVpcFirewallTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Priority")
    private String priority;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskAction")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskAction;

    private CreateVpcFirewallTaskRequest(Builder builder) {
        super(builder);
        this.content = builder.content;
        this.lang = builder.lang;
        this.priority = builder.priority;
        this.taskAction = builder.taskAction;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVpcFirewallTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return priority
     */
    public String getPriority() {
        return this.priority;
    }

    /**
     * @return taskAction
     */
    public String getTaskAction() {
        return this.taskAction;
    }

    public static final class Builder extends Request.Builder<CreateVpcFirewallTaskRequest, Builder> {
        private String content; 
        private String lang; 
        private String priority; 
        private String taskAction; 

        private Builder() {
            super();
        } 

        private Builder(CreateVpcFirewallTaskRequest request) {
            super(request);
            this.content = request.content;
            this.lang = request.lang;
            this.priority = request.priority;
            this.taskAction = request.taskAction;
        } 

        /**
         * Content.
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * Priority.
         */
        public Builder priority(String priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sync</p>
         */
        public Builder taskAction(String taskAction) {
            this.putQueryParameter("TaskAction", taskAction);
            this.taskAction = taskAction;
            return this;
        }

        @Override
        public CreateVpcFirewallTaskRequest build() {
            return new CreateVpcFirewallTaskRequest(this);
        } 

    } 

}
