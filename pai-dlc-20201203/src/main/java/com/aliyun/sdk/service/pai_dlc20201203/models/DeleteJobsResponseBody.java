// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteJobsResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteJobsResponseBody</p>
 */
public class DeleteJobsResponseBody extends TeaModel {
    @NameInMap("JobIds")
    private java.util.List < String > jobIds;

    @NameInMap("RequestId")
    private String requestId;

    private DeleteJobsResponseBody(Builder builder) {
        this.jobIds = builder.jobIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteJobsResponseBody create() {
        return builder().build();
    }

    /**
     * @return jobIds
     */
    public java.util.List < String > getJobIds() {
        return this.jobIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > jobIds; 
        private String requestId; 

        /**
         * JobIds.
         */
        public Builder jobIds(java.util.List < String > jobIds) {
            this.jobIds = jobIds;
            return this;
        }

        /**
         * 请求ID
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteJobsResponseBody build() {
            return new DeleteJobsResponseBody(this);
        } 

    } 

}
