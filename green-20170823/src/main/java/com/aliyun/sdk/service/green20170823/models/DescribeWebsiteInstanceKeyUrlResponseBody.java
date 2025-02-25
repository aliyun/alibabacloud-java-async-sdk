// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWebsiteInstanceKeyUrlResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWebsiteInstanceKeyUrlResponseBody</p>
 */
public class DescribeWebsiteInstanceKeyUrlResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("WebsiteInstanceKeyUrlList")
    private java.util.List < String > websiteInstanceKeyUrlList;

    private DescribeWebsiteInstanceKeyUrlResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.websiteInstanceKeyUrlList = builder.websiteInstanceKeyUrlList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWebsiteInstanceKeyUrlResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return websiteInstanceKeyUrlList
     */
    public java.util.List < String > getWebsiteInstanceKeyUrlList() {
        return this.websiteInstanceKeyUrlList;
    }

    public static final class Builder {
        private String requestId; 
        private Integer totalCount; 
        private java.util.List < String > websiteInstanceKeyUrlList; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * WebsiteInstanceKeyUrlList.
         */
        public Builder websiteInstanceKeyUrlList(java.util.List < String > websiteInstanceKeyUrlList) {
            this.websiteInstanceKeyUrlList = websiteInstanceKeyUrlList;
            return this;
        }

        public DescribeWebsiteInstanceKeyUrlResponseBody build() {
            return new DescribeWebsiteInstanceKeyUrlResponseBody(this);
        } 

    } 

}
