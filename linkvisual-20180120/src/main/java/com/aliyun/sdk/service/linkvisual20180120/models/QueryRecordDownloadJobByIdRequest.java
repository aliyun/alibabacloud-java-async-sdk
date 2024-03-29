// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryRecordDownloadJobByIdRequest} extends {@link RequestModel}
 *
 * <p>QueryRecordDownloadJobByIdRequest</p>
 */
public class QueryRecordDownloadJobByIdRequest extends Request {
    @Query
    @NameInMap("IotInstanceId")
    @Validation(required = true)
    private String iotInstanceId;

    @Query
    @NameInMap("JobId")
    @Validation(required = true)
    private String jobId;

    private QueryRecordDownloadJobByIdRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.jobId = builder.jobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRecordDownloadJobByIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    public static final class Builder extends Request.Builder<QueryRecordDownloadJobByIdRequest, Builder> {
        private String iotInstanceId; 
        private String jobId; 

        private Builder() {
            super();
        } 

        private Builder(QueryRecordDownloadJobByIdRequest request) {
            super(request);
            this.iotInstanceId = request.iotInstanceId;
            this.jobId = request.jobId;
        } 

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        @Override
        public QueryRecordDownloadJobByIdRequest build() {
            return new QueryRecordDownloadJobByIdRequest(this);
        } 

    } 

}
