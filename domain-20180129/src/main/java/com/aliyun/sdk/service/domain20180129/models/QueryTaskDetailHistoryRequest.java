// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

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
 * {@link QueryTaskDetailHistoryRequest} extends {@link RequestModel}
 *
 * <p>QueryTaskDetailHistoryRequest</p>
 */
public class QueryTaskDetailHistoryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainNameCursor")
    private String domainNameCursor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskDetailNoCursor")
    private String taskDetailNoCursor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskStatus")
    private Integer taskStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    private QueryTaskDetailHistoryRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.domainNameCursor = builder.domainNameCursor;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.taskDetailNoCursor = builder.taskDetailNoCursor;
        this.taskNo = builder.taskNo;
        this.taskStatus = builder.taskStatus;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTaskDetailHistoryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return domainNameCursor
     */
    public String getDomainNameCursor() {
        return this.domainNameCursor;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return taskDetailNoCursor
     */
    public String getTaskDetailNoCursor() {
        return this.taskDetailNoCursor;
    }

    /**
     * @return taskNo
     */
    public String getTaskNo() {
        return this.taskNo;
    }

    /**
     * @return taskStatus
     */
    public Integer getTaskStatus() {
        return this.taskStatus;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<QueryTaskDetailHistoryRequest, Builder> {
        private String domainName; 
        private String domainNameCursor; 
        private String lang; 
        private Integer pageSize; 
        private String taskDetailNoCursor; 
        private String taskNo; 
        private Integer taskStatus; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(QueryTaskDetailHistoryRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.domainNameCursor = request.domainNameCursor;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.taskDetailNoCursor = request.taskDetailNoCursor;
            this.taskNo = request.taskNo;
            this.taskStatus = request.taskStatus;
            this.userClientIp = request.userClientIp;
        } 

        /**
         * <p>Domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>Domain name cursor.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainNameCursor(String domainNameCursor) {
            this.putQueryParameter("DomainNameCursor", domainNameCursor);
            this.domainNameCursor = domainNameCursor;
            return this;
        }

        /**
         * <p>Language of error messages returned by the API. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese.</li>
         * <li><strong>en</strong>: English.</li>
         * </ul>
         * <p>Default value: <strong>en</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>Page size.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Task detail cursor.</p>
         * 
         * <strong>example:</strong>
         * <p>75addb07-28a3-450e-b5ec</p>
         */
        public Builder taskDetailNoCursor(String taskDetailNoCursor) {
            this.putQueryParameter("TaskDetailNoCursor", taskDetailNoCursor);
            this.taskDetailNoCursor = taskDetailNoCursor;
            return this;
        }

        /**
         * <p>Job number.</p>
         * <blockquote>
         * <p>You can obtain the job number by calling the <a href="https://help.aliyun.com/document_detail/67709.html">QueryTaskList</a> API.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>75addb07-28a3-450e-b5ec-test</p>
         */
        public Builder taskNo(String taskNo) {
            this.putQueryParameter("TaskNo", taskNo);
            this.taskNo = taskNo;
            return this;
        }

        /**
         * <p>Job status. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Waiting to execute.</li>
         * <li><strong>1</strong>: Executing.</li>
         * <li><strong>2</strong>: Succeeded.</li>
         * <li><strong>3</strong>: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder taskStatus(Integer taskStatus) {
            this.putQueryParameter("TaskStatus", taskStatus);
            this.taskStatus = taskStatus;
            return this;
        }

        /**
         * <p>User IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        @Override
        public QueryTaskDetailHistoryRequest build() {
            return new QueryTaskDetailHistoryRequest(this);
        } 

    } 

}
