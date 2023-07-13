// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHybridMonitorSLSGroupRequest} extends {@link RequestModel}
 *
 * <p>DescribeHybridMonitorSLSGroupRequest</p>
 */
public class DescribeHybridMonitorSLSGroupRequest extends Request {
    @Query
    @NameInMap("Keyword")
    private String keyword;

    @Query
    @NameInMap("PageNumber")
    private String pageNumber;

    @Query
    @NameInMap("PageSize")
    private String pageSize;

    @Query
    @NameInMap("SLSGroupName")
    private String SLSGroupName;

    private DescribeHybridMonitorSLSGroupRequest(Builder builder) {
        super(builder);
        this.keyword = builder.keyword;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.SLSGroupName = builder.SLSGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHybridMonitorSLSGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return SLSGroupName
     */
    public String getSLSGroupName() {
        return this.SLSGroupName;
    }

    public static final class Builder extends Request.Builder<DescribeHybridMonitorSLSGroupRequest, Builder> {
        private String keyword; 
        private String pageNumber; 
        private String pageSize; 
        private String SLSGroupName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeHybridMonitorSLSGroupRequest request) {
            super(request);
            this.keyword = request.keyword;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.SLSGroupName = request.SLSGroupName;
        } 

        /**
         * The number of the page to return.
         * <p>
         * 
         * Pages start from page 1. Default value: 1.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * The timestamp that was generated when the Logstore group was created.
         * <p>
         * 
         * Unit: milliseconds.
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The HTTP status code.
         * <p>
         * 
         * >  The status code 200 indicates that the call is successful.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The operation that you want to perform. Set the value to **DescribeHybridMonitorSLSGroup**.
         */
        public Builder SLSGroupName(String SLSGroupName) {
            this.putQueryParameter("SLSGroupName", SLSGroupName);
            this.SLSGroupName = SLSGroupName;
            return this;
        }

        @Override
        public DescribeHybridMonitorSLSGroupRequest build() {
            return new DescribeHybridMonitorSLSGroupRequest(this);
        } 

    } 

}
