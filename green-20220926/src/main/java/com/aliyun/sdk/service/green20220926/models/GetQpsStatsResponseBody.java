// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link GetQpsStatsResponseBody} extends {@link TeaModel}
 *
 * <p>GetQpsStatsResponseBody</p>
 */
public class GetQpsStatsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Charts")
    private java.util.Map<String, ChartsValue> charts;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetQpsStatsResponseBody(Builder builder) {
        this.charts = builder.charts;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQpsStatsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return charts
     */
    public java.util.Map<String, ChartsValue> getCharts() {
        return this.charts;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.Map<String, ChartsValue> charts; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetQpsStatsResponseBody model) {
            this.charts = model.charts;
            this.requestId = model.requestId;
        } 

        /**
         * Charts.
         */
        public Builder charts(java.util.Map<String, ChartsValue> charts) {
            this.charts = charts;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetQpsStatsResponseBody build() {
            return new GetQpsStatsResponseBody(this);
        } 

    } 

}
