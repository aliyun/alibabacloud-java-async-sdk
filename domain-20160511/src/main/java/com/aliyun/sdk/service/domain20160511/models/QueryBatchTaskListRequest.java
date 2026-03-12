// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20160511.models;

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
 * {@link QueryBatchTaskListRequest} extends {@link RequestModel}
 *
 * <p>QueryBatchTaskListRequest</p>
 */
public class QueryBatchTaskListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeginCreateTime")
    private String beginCreateTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndCreateTime")
    private String endCreateTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNum")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    private QueryBatchTaskListRequest(Builder builder) {
        super(builder);
        this.beginCreateTime = builder.beginCreateTime;
        this.endCreateTime = builder.endCreateTime;
        this.lang = builder.lang;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryBatchTaskListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return beginCreateTime
     */
    public String getBeginCreateTime() {
        return this.beginCreateTime;
    }

    /**
     * @return endCreateTime
     */
    public String getEndCreateTime() {
        return this.endCreateTime;
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
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<QueryBatchTaskListRequest, Builder> {
        private String beginCreateTime; 
        private String endCreateTime; 
        private String lang; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(QueryBatchTaskListRequest request) {
            super(request);
            this.beginCreateTime = request.beginCreateTime;
            this.endCreateTime = request.endCreateTime;
            this.lang = request.lang;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.userClientIp = request.userClientIp;
        } 

        /**
         * BeginCreateTime.
         */
        public Builder beginCreateTime(String beginCreateTime) {
            this.putQueryParameter("BeginCreateTime", beginCreateTime);
            this.beginCreateTime = beginCreateTime;
            return this;
        }

        /**
         * EndCreateTime.
         */
        public Builder endCreateTime(String endCreateTime) {
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
         * <p>This parameter is required.</p>
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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
        public QueryBatchTaskListRequest build() {
            return new QueryBatchTaskListRequest(this);
        } 

    } 

}
