// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAttackAnalysisDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAttackAnalysisDataResponseBody</p>
 */
public class DescribeAttackAnalysisDataResponseBody extends TeaModel {
    @NameInMap("Data")
    private String data;

    @NameInMap("Page")
    private Integer page;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
    private Integer total;

    private DescribeAttackAnalysisDataResponseBody(Builder builder) {
        this.data = builder.data;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAttackAnalysisDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String data; 
        private Integer page; 
        private Integer pageSize; 
        private String requestId; 
        private Integer total; 

        /**
         * Data.
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * Page.
         */
        public Builder page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeAttackAnalysisDataResponseBody build() {
            return new DescribeAttackAnalysisDataResponseBody(this);
        } 

    } 

}
