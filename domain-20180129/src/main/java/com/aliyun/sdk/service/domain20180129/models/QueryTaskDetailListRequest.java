// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTaskDetailListRequest} extends {@link RequestModel}
 *
 * <p>QueryTaskDetailListRequest</p>
 */
public class QueryTaskDetailListRequest extends Request {
    @Query
    @NameInMap("DomainName")
    private String domainName;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("PageNum")
    @Validation(required = true)
    private Integer pageNum;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

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

    private QueryTaskDetailListRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.instanceId = builder.instanceId;
        this.lang = builder.lang;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.taskNo = builder.taskNo;
        this.taskStatus = builder.taskStatus;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTaskDetailListRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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

    public static final class Builder extends Request.Builder<QueryTaskDetailListRequest, Builder> {
        private String domainName; 
        private String instanceId; 
        private String lang; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String taskNo; 
        private Integer taskStatus; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(QueryTaskDetailListRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.instanceId = request.instanceId;
            this.lang = request.lang;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.taskNo = request.taskNo;
            this.taskStatus = request.taskStatus;
            this.userClientIp = request.userClientIp;
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
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
        public QueryTaskDetailListRequest build() {
            return new QueryTaskDetailListRequest(this);
        } 

    } 

}
