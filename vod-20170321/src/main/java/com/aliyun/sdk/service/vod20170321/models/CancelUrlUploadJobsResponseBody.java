// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelUrlUploadJobsResponseBody} extends {@link TeaModel}
 *
 * <p>CancelUrlUploadJobsResponseBody</p>
 */
public class CancelUrlUploadJobsResponseBody extends TeaModel {
    @NameInMap("CanceledJobs")
    private java.util.List < String > canceledJobs;

    @NameInMap("NonExists")
    private java.util.List < String > nonExists;

    @NameInMap("RequestId")
    private String requestId;

    private CancelUrlUploadJobsResponseBody(Builder builder) {
        this.canceledJobs = builder.canceledJobs;
        this.nonExists = builder.nonExists;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelUrlUploadJobsResponseBody create() {
        return builder().build();
    }

    /**
     * @return canceledJobs
     */
    public java.util.List < String > getCanceledJobs() {
        return this.canceledJobs;
    }

    /**
     * @return nonExists
     */
    public java.util.List < String > getNonExists() {
        return this.nonExists;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > canceledJobs; 
        private java.util.List < String > nonExists; 
        private String requestId; 

        /**
         * The IDs of canceled jobs.
         */
        public Builder canceledJobs(java.util.List < String > canceledJobs) {
            this.canceledJobs = canceledJobs;
            return this;
        }

        /**
         * The job IDs or upload URLs that do not exist.
         * <p>
         * 
         * If you set the request parameter JobIds, the job IDs that do not exist are returned. If you set the request parameter UploadUrls, the upload URLs that do not exist are returned.
         */
        public Builder nonExists(java.util.List < String > nonExists) {
            this.nonExists = nonExists;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CancelUrlUploadJobsResponseBody build() {
            return new CancelUrlUploadJobsResponseBody(this);
        } 

    } 

}
