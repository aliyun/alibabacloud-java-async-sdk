// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

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
 * {@link DescribeDBClusterStatusSetResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterStatusSetResponseBody</p>
 */
public class DescribeDBClusterStatusSetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StatusSet")
    private java.util.List<String> statusSet;

    private DescribeDBClusterStatusSetResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.statusSet = builder.statusSet;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClusterStatusSetResponseBody create() {
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
     * @return statusSet
     */
    public java.util.List<String> getStatusSet() {
        return this.statusSet;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<String> statusSet; 

        private Builder() {
        } 

        private Builder(DescribeDBClusterStatusSetResponseBody model) {
            this.requestId = model.requestId;
            this.statusSet = model.statusSet;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StatusSet.
         */
        public Builder statusSet(java.util.List<String> statusSet) {
            this.statusSet = statusSet;
            return this;
        }

        public DescribeDBClusterStatusSetResponseBody build() {
            return new DescribeDBClusterStatusSetResponseBody(this);
        } 

    } 

}
