// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMetaTableResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateMetaTableResponseBody</p>
 */
public class UpdateMetaTableResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UpdateResult")
    private Boolean updateResult;

    private UpdateMetaTableResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.updateResult = builder.updateResult;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMetaTableResponseBody create() {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UpdateResult.
         */
        public Builder updateResult(Boolean updateResult) {
            this.updateResult = updateResult;
            return this;
        }

        public UpdateMetaTableResponseBody build() {
            return new UpdateMetaTableResponseBody(this);
        } 

    } 

}
