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
 * {@link CancelUrlUploadJobsResponseBody} extends {@link TeaModel}
 *
 * <p>CancelUrlUploadJobsResponseBody</p>
 */
public class CancelUrlUploadJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CanceledJobs")
    private java.util.List<String> canceledJobs;

    @com.aliyun.core.annotation.NameInMap("NonExists")
    private java.util.List<String> nonExists;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
    public java.util.List<String> getCanceledJobs() {
        return this.canceledJobs;
    }

    /**
     * @return nonExists
     */
    public java.util.List<String> getNonExists() {
        return this.nonExists;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> canceledJobs; 
        private java.util.List<String> nonExists; 
        private String requestId; 

        /**
         * <p>The IDs of canceled jobs.</p>
         */
        public Builder canceledJobs(java.util.List<String> canceledJobs) {
            this.canceledJobs = canceledJobs;
            return this;
        }

        /**
         * <p>The jobs that do not exist.</p>
         */
        public Builder nonExists(java.util.List<String> nonExists) {
            this.nonExists = nonExists;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>25818875-5F78-4D5C-3C3D-D7393642****</p>
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
