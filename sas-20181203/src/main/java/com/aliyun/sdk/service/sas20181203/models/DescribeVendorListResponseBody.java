// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVendorListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVendorListResponseBody</p>
 */
public class DescribeVendorListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VendorNameList")
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * VendorNameList.
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
