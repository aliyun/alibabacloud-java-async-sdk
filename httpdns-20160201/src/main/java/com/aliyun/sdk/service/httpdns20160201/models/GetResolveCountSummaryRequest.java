// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.httpdns20160201.models;

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
 * {@link GetResolveCountSummaryRequest} extends {@link RequestModel}
 *
 * <p>GetResolveCountSummaryRequest</p>
 */
public class GetResolveCountSummaryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Granularity")
    @com.aliyun.core.annotation.Validation(required = true)
    private String granularity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeSpan")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer timeSpan;

    private GetResolveCountSummaryRequest(Builder builder) {
        super(builder);
        this.granularity = builder.granularity;
        this.timeSpan = builder.timeSpan;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResolveCountSummaryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return granularity
     */
    public String getGranularity() {
        return this.granularity;
    }

    /**
     * @return timeSpan
     */
    public Integer getTimeSpan() {
        return this.timeSpan;
    }

    public static final class Builder extends Request.Builder<GetResolveCountSummaryRequest, Builder> {
        private String granularity; 
        private Integer timeSpan; 

        private Builder() {
            super();
        } 

        private Builder(GetResolveCountSummaryRequest request) {
            super(request);
            this.granularity = request.granularity;
            this.timeSpan = request.timeSpan;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>day</p>
         */
        public Builder granularity(String granularity) {
            this.putQueryParameter("Granularity", granularity);
            this.granularity = granularity;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder timeSpan(Integer timeSpan) {
            this.putQueryParameter("TimeSpan", timeSpan);
            this.timeSpan = timeSpan;
            return this;
        }

        @Override
        public GetResolveCountSummaryRequest build() {
            return new GetResolveCountSummaryRequest(this);
        } 

    } 

}
