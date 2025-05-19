// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20180308.models;

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
 * {@link PutCustomMetricRequest} extends {@link RequestModel}
 *
 * <p>PutCustomMetricRequest</p>
 */
public class PutCustomMetricRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricList")
    private String metricList;

    private PutCustomMetricRequest(Builder builder) {
        super(builder);
        this.metricList = builder.metricList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutCustomMetricRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return metricList
     */
    public String getMetricList() {
        return this.metricList;
    }

    public static final class Builder extends Request.Builder<PutCustomMetricRequest, Builder> {
        private String metricList; 

        private Builder() {
            super();
        } 

        private Builder(PutCustomMetricRequest request) {
            super(request);
            this.metricList = request.metricList;
        } 

        /**
         * MetricList.
         */
        public Builder metricList(String metricList) {
            this.putQueryParameter("MetricList", metricList);
            this.metricList = metricList;
            return this;
        }

        @Override
        public PutCustomMetricRequest build() {
            return new PutCustomMetricRequest(this);
        } 

    } 

}
