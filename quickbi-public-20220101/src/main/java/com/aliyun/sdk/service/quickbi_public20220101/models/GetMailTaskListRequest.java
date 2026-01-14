// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link GetMailTaskListRequest} extends {@link RequestModel}
 *
 * <p>GetMailTaskListRequest</p>
 */
public class GetMailTaskListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Paused")
    private Boolean paused;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserNick")
    private String userNick;

    private GetMailTaskListRequest(Builder builder) {
        super(builder);
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.paused = builder.paused;
        this.userNick = builder.userNick;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMailTaskListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return paused
     */
    public Boolean getPaused() {
        return this.paused;
    }

    /**
     * @return userNick
     */
    public String getUserNick() {
        return this.userNick;
    }

    public static final class Builder extends Request.Builder<GetMailTaskListRequest, Builder> {
        private Integer pageNum; 
        private Integer pageSize; 
        private Boolean paused; 
        private String userNick; 

        private Builder() {
            super();
        } 

        private Builder(GetMailTaskListRequest request) {
            super(request);
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.paused = request.paused;
            this.userNick = request.userNick;
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
         * Paused.
         */
        public Builder paused(Boolean paused) {
            this.putQueryParameter("Paused", paused);
            this.paused = paused;
            return this;
        }

        /**
         * UserNick.
         */
        public Builder userNick(String userNick) {
            this.putQueryParameter("UserNick", userNick);
            this.userNick = userNick;
            return this;
        }

        @Override
        public GetMailTaskListRequest build() {
            return new GetMailTaskListRequest(this);
        } 

    } 

}
