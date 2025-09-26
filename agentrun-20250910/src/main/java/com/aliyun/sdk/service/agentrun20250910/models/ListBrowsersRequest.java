// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link ListBrowsersRequest} extends {@link RequestModel}
 *
 * <p>ListBrowsersRequest</p>
 */
public class ListBrowsersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("browserName")
    private String browserName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private ListBrowsersRequest(Builder builder) {
        super(builder);
        this.browserName = builder.browserName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBrowsersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return browserName
     */
    public String getBrowserName() {
        return this.browserName;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListBrowsersRequest, Builder> {
        private String browserName; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListBrowsersRequest request) {
            super(request);
            this.browserName = request.browserName;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.status = request.status;
        } 

        /**
         * <p>根据浏览器实例名称进行模糊匹配过滤</p>
         * 
         * <strong>example:</strong>
         * <p>browser</p>
         */
        public Builder browserName(String browserName) {
            this.putQueryParameter("browserName", browserName);
            this.browserName = browserName;
            return this;
        }

        /**
         * <p>当前页码，从1开始计数</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>每页返回的记录数量</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>根据浏览器实例的运行状态进行过滤，可选值：CREATING、READY、DELETING等</p>
         * 
         * <strong>example:</strong>
         * <p>CREATING</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListBrowsersRequest build() {
            return new ListBrowsersRequest(this);
        } 

    } 

}
