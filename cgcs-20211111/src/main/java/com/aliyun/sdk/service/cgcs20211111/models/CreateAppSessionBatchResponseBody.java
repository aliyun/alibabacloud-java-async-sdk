// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cgcs20211111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAppSessionBatchResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAppSessionBatchResponseBody</p>
 */
public class CreateAppSessionBatchResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CustomTaskId")
    private String customTaskId;

    @com.aliyun.core.annotation.NameInMap("PlatformTaskId")
    private String platformTaskId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateAppSessionBatchResponseBody(Builder builder) {
        this.customTaskId = builder.customTaskId;
        this.platformTaskId = builder.platformTaskId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppSessionBatchResponseBody create() {
        return builder().build();
    }

    /**
     * @return customTaskId
     */
    public String getCustomTaskId() {
        return this.customTaskId;
    }

    /**
     * @return platformTaskId
     */
    public String getPlatformTaskId() {
        return this.platformTaskId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String customTaskId; 
        private String platformTaskId; 
        private String requestId; 

        /**
         * CustomTaskId.
         */
        public Builder customTaskId(String customTaskId) {
            this.customTaskId = customTaskId;
            return this;
        }

        /**
         * PlatformTaskId.
         */
        public Builder platformTaskId(String platformTaskId) {
            this.platformTaskId = platformTaskId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAppSessionBatchResponseBody build() {
            return new CreateAppSessionBatchResponseBody(this);
        } 

    } 

}
