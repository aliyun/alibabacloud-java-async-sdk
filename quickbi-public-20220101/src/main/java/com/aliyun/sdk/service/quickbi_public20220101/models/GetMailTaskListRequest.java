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
         * <p>The page number.</p>
         * <ul>
         * <li><p>Starts from: 1</p>
         * </li>
         * <li><p>Default value: 1</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>The number of entries to return on each page.</p>
         * <ul>
         * <li>Default value: 25</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Specifies whether the tracking task is paused.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder paused(Boolean paused) {
            this.putQueryParameter("Paused", paused);
            this.paused = paused;
            return this;
        }

        /**
         * <p>The nickname of the user who owns the tracking task. If this parameter is not specified, all tasks are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
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
