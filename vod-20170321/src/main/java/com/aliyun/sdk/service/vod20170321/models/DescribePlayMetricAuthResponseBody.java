// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link DescribePlayMetricAuthResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePlayMetricAuthResponseBody</p>
 */
public class DescribePlayMetricAuthResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MetricList")
    private java.util.List<String> metricList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePlayMetricAuthResponseBody(Builder builder) {
        this.metricList = builder.metricList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePlayMetricAuthResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return metricList
     */
    public java.util.List<String> getMetricList() {
        return this.metricList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> metricList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribePlayMetricAuthResponseBody model) {
            this.metricList = model.metricList;
            this.requestId = model.requestId;
        } 

        /**
         * MetricList.
         */
        public Builder metricList(java.util.List<String> metricList) {
            this.metricList = metricList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePlayMetricAuthResponseBody build() {
            return new DescribePlayMetricAuthResponseBody(this);
        } 

    } 

}
