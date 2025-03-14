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
 * {@link ModifyLogMetaStatusRequest} extends {@link RequestModel}
 *
 * <p>ModifyLogMetaStatusRequest</p>
 */
public class ModifyLogMetaStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("From")
    private String from;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogStore")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logStore;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Project")
    private String project;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
    private String status;

    private ModifyLogMetaStatusRequest(Builder builder) {
        super(builder);
        this.from = builder.from;
        this.logStore = builder.logStore;
        this.project = builder.project;
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyLogMetaStatusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return from
     */
    public String getFrom() {
        return this.from;
    }

    /**
     * @return logStore
     */
    public String getLogStore() {
        return this.logStore;
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return resourceDirectoryAccountId
     */
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ModifyLogMetaStatusRequest, Builder> {
        private String from; 
        private String logStore; 
        private String project; 
        private Long resourceDirectoryAccountId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ModifyLogMetaStatusRequest request) {
            super(request);
            this.from = request.from;
            this.logStore = request.logStore;
            this.project = request.project;
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
            this.status = request.status;
        } 

        /**
         * <p>The ID of the request source. Set the value to <strong>sas</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>sas</p>
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * <p>The name of the dedicated Logstore in which logs are stored.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeLogMeta~~">DescribeLogMeta</a> operation to query the names of Logstores.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aegis-log-login</p>
         */
        public Builder logStore(String logStore) {
            this.putQueryParameter("LogStore", logStore);
            this.logStore = logStore;
            return this;
        }

        /**
         * <p>The name of the project.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeLogMeta~~">DescribeLogMeta</a> operation to query the names of projects.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>aegis-log</p>
         */
        public Builder project(String project) {
            this.putQueryParameter("Project", project);
            this.project = project;
            return this;
        }

        /**
         * <p>The Alibaba Cloud account ID of the member in the resource directory.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain the IDs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1232428423234****</p>
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        /**
         * <p>The status of the log analysis feature. Valid values:</p>
         * <ul>
         * <li><strong>enabled</strong></li>
         * <li><strong>disabled</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ModifyLogMetaStatusRequest build() {
            return new ModifyLogMetaStatusRequest(this);
        } 

    } 

}
