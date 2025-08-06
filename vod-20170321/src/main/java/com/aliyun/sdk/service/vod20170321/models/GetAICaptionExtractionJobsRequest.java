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
 * {@link GetAICaptionExtractionJobsRequest} extends {@link RequestModel}
 *
 * <p>GetAICaptionExtractionJobsRequest</p>
 */
public class GetAICaptionExtractionJobsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobIds;

    private GetAICaptionExtractionJobsRequest(Builder builder) {
        super(builder);
        this.jobIds = builder.jobIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAICaptionExtractionJobsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobIds
     */
    public String getJobIds() {
        return this.jobIds;
    }

    public static final class Builder extends Request.Builder<GetAICaptionExtractionJobsRequest, Builder> {
        private String jobIds; 

        private Builder() {
            super();
        } 

        private Builder(GetAICaptionExtractionJobsRequest request) {
            super(request);
            this.jobIds = request.jobIds;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder jobIds(String jobIds) {
            this.putQueryParameter("JobIds", jobIds);
            this.jobIds = jobIds;
            return this;
        }

        @Override
        public GetAICaptionExtractionJobsRequest build() {
            return new GetAICaptionExtractionJobsRequest(this);
        } 

    } 

}
