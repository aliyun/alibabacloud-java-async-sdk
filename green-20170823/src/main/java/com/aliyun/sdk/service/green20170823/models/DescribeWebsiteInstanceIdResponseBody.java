// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWebsiteInstanceIdResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWebsiteInstanceIdResponseBody</p>
 */
public class DescribeWebsiteInstanceIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("WebsiteInstanceIdList")
    private java.util.List < String > websiteInstanceIdList;

    private DescribeWebsiteInstanceIdResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.websiteInstanceIdList = builder.websiteInstanceIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWebsiteInstanceIdResponseBody create() {
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
     * @return websiteInstanceIdList
     */
    public java.util.List < String > getWebsiteInstanceIdList() {
        return this.websiteInstanceIdList;
    }

    public static final class Builder {
        private String requestId; 
        private Integer totalCount; 
        private java.util.List < String > websiteInstanceIdList; 

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
         * WebsiteInstanceIdList.
         */
        public Builder websiteInstanceIdList(java.util.List < String > websiteInstanceIdList) {
            this.websiteInstanceIdList = websiteInstanceIdList;
            return this;
        }

        public DescribeWebsiteInstanceIdResponseBody build() {
            return new DescribeWebsiteInstanceIdResponseBody(this);
        } 

    } 

}
