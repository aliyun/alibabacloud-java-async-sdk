// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTableModelInfoResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateTableModelInfoResponseBody</p>
 */
public class UpdateTableModelInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UpdateResult")
    private Boolean updateResult;

    private UpdateTableModelInfoResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.updateResult = builder.updateResult;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTableModelInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return updateResult
     */
    public Boolean getUpdateResult() {
        return this.updateResult;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean updateResult; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful.
         */
        public Builder updateResult(Boolean updateResult) {
            this.updateResult = updateResult;
            return this;
        }

        public UpdateTableModelInfoResponseBody build() {
            return new UpdateTableModelInfoResponseBody(this);
        } 

    } 

}
