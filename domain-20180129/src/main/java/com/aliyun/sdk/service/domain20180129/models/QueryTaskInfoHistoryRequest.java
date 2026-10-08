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
         * <p>Start time of the creation date range for the query, expressed as the number of milliseconds since 00:00 UTC on January 1, 1970. Currently supports queries by day only.</p>
         * 
         * <strong>example:</strong>
         * <p>1522080000000</p>
         */
        public Builder beginCreateTime(Long beginCreateTime) {
            this.putQueryParameter("BeginCreateTime", beginCreateTime);
            this.beginCreateTime = beginCreateTime;
            return this;
        }

        /**
         * <p>Cursor for creation date (technical parameter).</p>
         * 
         * <strong>example:</strong>
         * <p>1522080000000</p>
         */
        public Builder createTimeCursor(Long createTimeCursor) {
            this.putQueryParameter("CreateTimeCursor", createTimeCursor);
            this.createTimeCursor = createTimeCursor;
            return this;
        }

        /**
         * <p>End time of the creation date range for the query, expressed as the number of milliseconds since 00:00 UTC on January 1, 1970. Currently supports queries by day only.</p>
         * 
         * <strong>example:</strong>
         * <p>1522080000000</p>
         */
        public Builder endCreateTime(Long endCreateTime) {
            this.putQueryParameter("EndCreateTime", endCreateTime);
            this.endCreateTime = endCreateTime;
            return this;
        }

        /**
         * <p>Language for API error messages. Valid values:  </p>
         * <ul>
         * <li><strong>zh</strong>: Chinese  </li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * <p>Default value is <strong>en</strong>.</p>
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
         * <p>2</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Job cursor; pass in the job number from the corresponding page cursor during pagination (technical parameter).</p>
         * 
         * <strong>example:</strong>
         * <p>aa634d3f-927e-4d17-9d2c-test</p>
         */
        public Builder taskNoCursor(String taskNoCursor) {
            this.putQueryParameter("TaskNoCursor", taskNoCursor);
            this.taskNoCursor = taskNoCursor;
            return this;
        }

        /**
         * <p>User IP address, which can be set to <strong>127.0.0.1</strong>.</p>
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
        public QueryTaskInfoHistoryRequest build() {
            return new QueryTaskInfoHistoryRequest(this);
        } 

    } 

}
