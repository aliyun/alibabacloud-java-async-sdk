// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link ListMediaConvertJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListMediaConvertJobsResponseBody</p>
 */
public class ListMediaConvertJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Jobs")
    private java.util.List<MediaConvertJobWithoutDetail> jobs;

    @com.aliyun.core.annotation.NameInMap("NextPageToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nextPageToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListMediaConvertJobsResponseBody(Builder builder) {
        this.jobs = builder.jobs;
        this.nextPageToken = builder.nextPageToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMediaConvertJobsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobs
     */
    public java.util.List<MediaConvertJobWithoutDetail> getJobs() {
        return this.jobs;
    }

    /**
     * @return nextPageToken
     */
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<MediaConvertJobWithoutDetail> jobs; 
        private String nextPageToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListMediaConvertJobsResponseBody model) {
            this.jobs = model.jobs;
            this.nextPageToken = model.nextPageToken;
            this.requestId = model.requestId;
        } 

        /**
         * Jobs.
         */
        public Builder jobs(java.util.List<MediaConvertJobWithoutDetail> jobs) {
            this.jobs = jobs;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>cdb3e74639973036bc84</strong></strong></p>
         */
        public Builder nextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListMediaConvertJobsResponseBody build() {
            return new ListMediaConvertJobsResponseBody(this);
        } 

    } 

}
