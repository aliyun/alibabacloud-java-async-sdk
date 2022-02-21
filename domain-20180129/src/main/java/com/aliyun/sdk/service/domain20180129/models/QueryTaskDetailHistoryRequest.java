// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTaskDetailHistoryRequest} extends {@link RequestModel}
 *
 * <p>QueryTaskDetailHistoryRequest</p>
 */
public class QueryTaskDetailHistoryRequest extends Request {
    @Query
    @NameInMap("DomainName")
    private String domainName;

    @Query
    @NameInMap("DomainNameCursor")
    private String domainNameCursor;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Query
    @NameInMap("TaskDetailNoCursor")
    private String taskDetailNoCursor;

    @Query
    @NameInMap("TaskNo")
    @Validation(required = true)
    private String taskNo;

    @Query
    @NameInMap("TaskStatus")
    private Integer taskStatus;

    @Query
    @NameInMap("UserClientIp")
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

        private Builder(QueryTaskDetailHistoryRequest response) {
            super(response);
            this.domainName = response.domainName;
            this.domainNameCursor = response.domainNameCursor;
            this.lang = response.lang;
            this.pageSize = response.pageSize;
            this.taskDetailNoCursor = response.taskDetailNoCursor;
            this.taskNo = response.taskNo;
            this.taskStatus = response.taskStatus;
            this.userClientIp = response.userClientIp;
        } 

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * DomainNameCursor.
         */
        public Builder domainNameCursor(String domainNameCursor) {
            this.putQueryParameter("DomainNameCursor", domainNameCursor);
            this.domainNameCursor = domainNameCursor;
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
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * TaskDetailNoCursor.
         */
        public Builder taskDetailNoCursor(String taskDetailNoCursor) {
            this.putQueryParameter("TaskDetailNoCursor", taskDetailNoCursor);
            this.taskDetailNoCursor = taskDetailNoCursor;
            return this;
        }

        /**
         * TaskNo.
         */
        public Builder taskNo(String taskNo) {
            this.putQueryParameter("TaskNo", taskNo);
            this.taskNo = taskNo;
            return this;
        }

        /**
         * TaskStatus.
         */
        public Builder taskStatus(Integer taskStatus) {
            this.putQueryParameter("TaskStatus", taskStatus);
            this.taskStatus = taskStatus;
            return this;
        }

        /**
         * UserClientIp.
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
