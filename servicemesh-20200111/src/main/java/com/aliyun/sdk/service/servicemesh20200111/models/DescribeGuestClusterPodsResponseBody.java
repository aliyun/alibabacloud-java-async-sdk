// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

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
 * {@link DescribeGuestClusterPodsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGuestClusterPodsResponseBody</p>
 */
public class DescribeGuestClusterPodsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PodList")
    private java.util.List<String> podList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeGuestClusterPodsResponseBody(Builder builder) {
        this.podList = builder.podList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGuestClusterPodsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return podList
     */
    public java.util.List<String> getPodList() {
        return this.podList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> podList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeGuestClusterPodsResponseBody model) {
            this.podList = model.podList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of the names of the queried pods.</p>
         */
        public Builder podList(java.util.List<String> podList) {
            this.podList = podList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EDDC0D86-2FC3-56FB-9213-96EB0A3523F1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeGuestClusterPodsResponseBody build() {
            return new DescribeGuestClusterPodsResponseBody(this);
        } 

    } 

}
