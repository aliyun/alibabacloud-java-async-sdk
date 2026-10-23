// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

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
 * {@link GetServiceLastAccessedDetailsRequest} extends {@link RequestModel}
 *
 * <p>GetServiceLastAccessedDetailsRequest</p>
 */
public class GetServiceLastAccessedDetailsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Marker")
    private String marker;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxItems")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer maxItems;

    private GetServiceLastAccessedDetailsRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
        this.marker = builder.marker;
        this.maxItems = builder.maxItems;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceLastAccessedDetailsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return marker
     */
    public String getMarker() {
        return this.marker;
    }

    /**
     * @return maxItems
     */
    public Integer getMaxItems() {
        return this.maxItems;
    }

    public static final class Builder extends Request.Builder<GetServiceLastAccessedDetailsRequest, Builder> {
        private String jobId; 
        private String marker; 
        private Integer maxItems; 

        private Builder() {
            super();
        } 

        private Builder(GetServiceLastAccessedDetailsRequest request) {
            super(request);
            this.jobId = request.jobId;
            this.marker = request.marker;
            this.maxItems = request.maxItems;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ba536aab-84c6-43af-8bcb-aa2cae2a34eb</p>
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * Marker.
         */
        public Builder marker(String marker) {
            this.putQueryParameter("Marker", marker);
            this.marker = marker;
            return this;
        }

        /**
         * MaxItems.
         */
        public Builder maxItems(Integer maxItems) {
            this.putQueryParameter("MaxItems", maxItems);
            this.maxItems = maxItems;
            return this;
        }

        @Override
        public GetServiceLastAccessedDetailsRequest build() {
            return new GetServiceLastAccessedDetailsRequest(this);
        } 

    } 

}
