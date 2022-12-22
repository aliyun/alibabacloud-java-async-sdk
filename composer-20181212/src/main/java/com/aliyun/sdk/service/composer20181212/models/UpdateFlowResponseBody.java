// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.composer20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateFlowResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateFlowResponseBody</p>
 */
public class UpdateFlowResponseBody extends TeaModel {
    @NameInMap("CurrentVersionId")
    private Integer currentVersionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private UpdateFlowResponseBody(Builder builder) {
        this.currentVersionId = builder.currentVersionId;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFlowResponseBody create() {
        return builder().build();
    }

    /**
     * @return currentVersionId
     */
    public Integer getCurrentVersionId() {
        return this.currentVersionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer currentVersionId; 
        private String requestId; 
        private Boolean success; 

        /**
         * The version ID of the workflow after the update.
         */
        public Builder currentVersionId(Integer currentVersionId) {
            this.currentVersionId = currentVersionId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the operation was successful. Valid values:
         * <p>
         * 
         * *   **true**: The operation was successful.
         * *   **false**: The operation failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public UpdateFlowResponseBody build() {
            return new UpdateFlowResponseBody(this);
        } 

    } 

}
