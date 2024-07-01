// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain_intl20171218.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTaskInfoHistoryRequest} extends {@link RequestModel}
 *
 * <p>QueryTaskInfoHistoryRequest</p>
 */
public class QueryTaskInfoHistoryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeginCreateTime")
    private Long beginCreateTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateTimeCursor")
    private Long createTimeCursor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndCreateTime")
    private Long endCreateTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskNoCursor")
    private String taskNoCursor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    private QueryTaskInfoHistoryRequest(Builder builder) {
        super(builder);
        this.beginCreateTime = builder.beginCreateTime;
        this.createTimeCursor = builder.createTimeCursor;
        this.endCreateTime = builder.endCreateTime;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.taskNoCursor = builder.taskNoCursor;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTaskInfoHistoryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return beginCreateTime
     */
    public Long getBeginCreateTime() {
        return this.beginCreateTime;
    }

    /**
     * @return createTimeCursor
     */
    public Long getCreateTimeCursor() {
        return this.createTimeCursor;
    }

    /**
     * @return endCreateTime
     */
    public Long getEndCreateTime() {
        return this.endCreateTime;
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
     * @return taskNoCursor
     */
    public String getTaskNoCursor() {
        return this.taskNoCursor;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<QueryTaskInfoHistoryRequest, Builder> {
        private Long beginCreateTime; 
        private Long createTimeCursor; 
        private Long endCreateTime; 
        private String lang; 
        private Integer pageSize; 
        private String taskNoCursor; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(QueryTaskInfoHistoryRequest request) {
            super(request);
            this.beginCreateTime = request.beginCreateTime;
            this.createTimeCursor = request.createTimeCursor;
            this.endCreateTime = request.endCreateTime;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.taskNoCursor = request.taskNoCursor;
            this.userClientIp = request.userClientIp;
        } 

        /**
         * BeginCreateTime.
         */
        public Builder beginCreateTime(Long beginCreateTime) {
            this.putQueryParameter("BeginCreateTime", beginCreateTime);
            this.beginCreateTime = beginCreateTime;
            return this;
        }

        /**
         * CreateTimeCursor.
         */
        public Builder createTimeCursor(Long createTimeCursor) {
            this.putQueryParameter("CreateTimeCursor", createTimeCursor);
            this.createTimeCursor = createTimeCursor;
            return this;
        }

        /**
         * EndCreateTime.
         */
        public Builder endCreateTime(Long endCreateTime) {
            this.putQueryParameter("EndCreateTime", endCreateTime);
            this.endCreateTime = endCreateTime;
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
         * TaskNoCursor.
         */
        public Builder taskNoCursor(String taskNoCursor) {
            this.putQueryParameter("TaskNoCursor", taskNoCursor);
            this.taskNoCursor = taskNoCursor;
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
        public QueryTaskInfoHistoryRequest build() {
            return new QueryTaskInfoHistoryRequest(this);
        } 

    } 

}
