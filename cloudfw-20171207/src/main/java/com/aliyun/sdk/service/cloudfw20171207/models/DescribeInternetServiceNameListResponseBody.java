// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeInternetServiceNameListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInternetServiceNameListResponseBody</p>
 */
public class DescribeInternetServiceNameListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceNameList")
    private java.util.List<String> serviceNameList;

    private DescribeInternetServiceNameListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.serviceNameList = builder.serviceNameList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInternetServiceNameListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceNameList
     */
    public java.util.List<String> getServiceNameList() {
        return this.serviceNameList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<String> serviceNameList; 

        private Builder() {
        } 

        private Builder(DescribeInternetServiceNameListResponseBody model) {
            this.requestId = model.requestId;
            this.serviceNameList = model.serviceNameList;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ServiceNameList.
         */
        public Builder serviceNameList(java.util.List<String> serviceNameList) {
            this.serviceNameList = serviceNameList;
            return this;
        }

        public DescribeInternetServiceNameListResponseBody build() {
            return new DescribeInternetServiceNameListResponseBody(this);
        } 

    } 

}
