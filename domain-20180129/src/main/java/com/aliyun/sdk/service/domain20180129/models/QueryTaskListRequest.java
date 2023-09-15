// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTaskListRequest} extends {@link RequestModel}
 *
 * <p>QueryTaskListRequest</p>
 */
public class QueryTaskListRequest extends Request {
    @Query
    @NameInMap("BeginCreateTime")
    private Long beginCreateTime;

    @Query
    @NameInMap("EndCreateTime")
    private Long endCreateTime;

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
    @NameInMap("UserClientIp")
    private String userClientIp;

    private QueryTaskListRequest(Builder builder) {
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

    public static QueryTaskListRequest create() {
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

    public static final class Builder extends Request.Builder<QueryTaskListRequest, Builder> {
        private Long beginCreateTime; 
        private Long endCreateTime; 
        private String lang; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(QueryTaskListRequest request) {
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
        public Builder beginCreateTime(Long beginCreateTime) {
            this.putQueryParameter("BeginCreateTime", beginCreateTime);
            this.beginCreateTime = beginCreateTime;
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
         * UserClientIp.
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        @Override
        public QueryTaskListRequest build() {
            return new QueryTaskListRequest(this);
        } 

    } 

}
