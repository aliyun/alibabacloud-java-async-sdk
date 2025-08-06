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
 * {@link DeleteMediaExportJobsResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteMediaExportJobsResponseBody</p>
 */
public class DeleteMediaExportJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FailedJobIds")
    private java.util.List<String> failedJobIds;

    @com.aliyun.core.annotation.NameInMap("NonExistJobIds")
    private java.util.List<String> nonExistJobIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteMediaExportJobsResponseBody(Builder builder) {
        this.failedJobIds = builder.failedJobIds;
        this.nonExistJobIds = builder.nonExistJobIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMediaExportJobsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return failedJobIds
     */
    public java.util.List<String> getFailedJobIds() {
        return this.failedJobIds;
    }

    /**
     * @return nonExistJobIds
     */
    public java.util.List<String> getNonExistJobIds() {
        return this.nonExistJobIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> failedJobIds; 
        private java.util.List<String> nonExistJobIds; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DeleteMediaExportJobsResponseBody model) {
            this.failedJobIds = model.failedJobIds;
            this.nonExistJobIds = model.nonExistJobIds;
            this.requestId = model.requestId;
        } 

        /**
         * FailedJobIds.
         */
        public Builder failedJobIds(java.util.List<String> failedJobIds) {
            this.failedJobIds = failedJobIds;
            return this;
        }

        /**
         * NonExistJobIds.
         */
        public Builder nonExistJobIds(java.util.List<String> nonExistJobIds) {
            this.nonExistJobIds = nonExistJobIds;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteMediaExportJobsResponseBody build() {
            return new DeleteMediaExportJobsResponseBody(this);
        } 

    } 

}
