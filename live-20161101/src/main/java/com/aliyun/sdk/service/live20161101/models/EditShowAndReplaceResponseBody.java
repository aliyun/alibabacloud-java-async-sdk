// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EditShowAndReplaceResponseBody} extends {@link TeaModel}
 *
 * <p>EditShowAndReplaceResponseBody</p>
 */
public class EditShowAndReplaceResponseBody extends TeaModel {
    @NameInMap("JobInfo")
    private String jobInfo;

    @NameInMap("RequestId")
    private String requestId;

    private EditShowAndReplaceResponseBody(Builder builder) {
        this.jobInfo = builder.jobInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EditShowAndReplaceResponseBody create() {
        return builder().build();
    }

    /**
     * @return jobInfo
     */
    public String getJobInfo() {
        return this.jobInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String jobInfo; 
        private String requestId; 

        /**
         * JobInfo.
         */
        public Builder jobInfo(String jobInfo) {
            this.jobInfo = jobInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public EditShowAndReplaceResponseBody build() {
            return new EditShowAndReplaceResponseBody(this);
        } 

    } 

}
