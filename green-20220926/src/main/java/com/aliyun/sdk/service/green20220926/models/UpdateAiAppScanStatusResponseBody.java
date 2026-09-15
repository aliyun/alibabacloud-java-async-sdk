// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link UpdateAiAppScanStatusResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateAiAppScanStatusResponseBody</p>
 */
public class UpdateAiAppScanStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FailedAppIds")
    private java.util.List<String> failedAppIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("SuccessAppIds")
    private java.util.List<String> successAppIds;

    private UpdateAiAppScanStatusResponseBody(Builder builder) {
        this.failedAppIds = builder.failedAppIds;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.successAppIds = builder.successAppIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAiAppScanStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return failedAppIds
     */
    public java.util.List<String> getFailedAppIds() {
        return this.failedAppIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return successAppIds
     */
    public java.util.List<String> getSuccessAppIds() {
        return this.successAppIds;
    }

    public static final class Builder {
        private java.util.List<String> failedAppIds; 
        private String requestId; 
        private String status; 
        private java.util.List<String> successAppIds; 

        private Builder() {
        } 

        private Builder(UpdateAiAppScanStatusResponseBody model) {
            this.failedAppIds = model.failedAppIds;
            this.requestId = model.requestId;
            this.status = model.status;
            this.successAppIds = model.successAppIds;
        } 

        /**
         * <p>The list of application IDs that failed.</p>
         */
        public Builder failedAppIds(java.util.List<String> failedAppIds) {
            this.failedAppIds = failedAppIds;
            return this;
        }

        /**
         * <p>The ID assigned by the backend to uniquely identify a request. You can use this ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status. Valid values:</p>
         * <ul>
         * <li><p>SUCCESS: Succeeded.</p>
         * </li>
         * <li><p>PARTIAL_SUCCESS: Partially succeeded.</p>
         * </li>
         * <li><p>FAILED: Failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The list of application IDs that succeeded.</p>
         */
        public Builder successAppIds(java.util.List<String> successAppIds) {
            this.successAppIds = successAppIds;
            return this;
        }

        public UpdateAiAppScanStatusResponseBody build() {
            return new UpdateAiAppScanStatusResponseBody(this);
        } 

    } 

}
