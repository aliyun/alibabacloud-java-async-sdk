// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link ListChannelAlertsRequest} extends {@link RequestModel}
 *
 * <p>ListChannelAlertsRequest</p>
 */
public class ListChannelAlertsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Category")
    private String category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GmtEnd")
    private String gmtEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GmtStart")
    private String gmtStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceArn")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceArn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortByModifiedTime")
    private String sortByModifiedTime;

    private ListChannelAlertsRequest(Builder builder) {
        super(builder);
        this.category = builder.category;
        this.gmtEnd = builder.gmtEnd;
        this.gmtStart = builder.gmtStart;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.resourceArn = builder.resourceArn;
        this.sortByModifiedTime = builder.sortByModifiedTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListChannelAlertsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return gmtEnd
     */
    public String getGmtEnd() {
        return this.gmtEnd;
    }

    /**
     * @return gmtStart
     */
    public String getGmtStart() {
        return this.gmtStart;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return resourceArn
     */
    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * @return sortByModifiedTime
     */
    public String getSortByModifiedTime() {
        return this.sortByModifiedTime;
    }

    public static final class Builder extends Request.Builder<ListChannelAlertsRequest, Builder> {
        private String category; 
        private String gmtEnd; 
        private String gmtStart; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String resourceArn; 
        private String sortByModifiedTime; 

        private Builder() {
            super();
        } 

        private Builder(ListChannelAlertsRequest request) {
            super(request);
            this.category = request.category;
            this.gmtEnd = request.gmtEnd;
            this.gmtStart = request.gmtStart;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.resourceArn = request.resourceArn;
            this.sortByModifiedTime = request.sortByModifiedTime;
        } 

        /**
         * Category.
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * GmtEnd.
         */
        public Builder gmtEnd(String gmtEnd) {
            this.putQueryParameter("GmtEnd", gmtEnd);
            this.gmtEnd = gmtEnd;
            return this;
        }

        /**
         * GmtStart.
         */
        public Builder gmtStart(String gmtStart) {
            this.putQueryParameter("GmtStart", gmtStart);
            this.gmtStart = gmtStart;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ims:mediaweaver:<regionId>:<userId>:channel/myChannel</p>
         */
        public Builder resourceArn(String resourceArn) {
            this.putQueryParameter("ResourceArn", resourceArn);
            this.resourceArn = resourceArn;
            return this;
        }

        /**
         * SortByModifiedTime.
         */
        public Builder sortByModifiedTime(String sortByModifiedTime) {
            this.putQueryParameter("SortByModifiedTime", sortByModifiedTime);
            this.sortByModifiedTime = sortByModifiedTime;
            return this;
        }

        @Override
        public ListChannelAlertsRequest build() {
            return new ListChannelAlertsRequest(this);
        } 

    } 

}
