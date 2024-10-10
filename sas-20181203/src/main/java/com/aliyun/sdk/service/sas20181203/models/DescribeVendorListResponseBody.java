// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeVendorListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVendorListResponseBody</p>
 */
public class DescribeVendorListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VendorNameList")
    private java.util.List < String > vendorNameList;

    private DescribeVendorListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.vendorNameList = builder.vendorNameList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVendorListResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vendorNameList
     */
    public java.util.List < String > getVendorNameList() {
        return this.vendorNameList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < String > vendorNameList; 

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>340D7FC4-D575-1661-8ACD-CFA7BE57B795</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>An array that consists of the service providers.</p>
         */
        public Builder vendorNameList(java.util.List < String > vendorNameList) {
            this.vendorNameList = vendorNameList;
            return this;
        }

        public DescribeVendorListResponseBody build() {
            return new DescribeVendorListResponseBody(this);
        } 

    } 

}
