// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublishCodeSourceResponseBody} extends {@link TeaModel}
 *
 * <p>PublishCodeSourceResponseBody</p>
 */
public class PublishCodeSourceResponseBody extends TeaModel {
    @NameInMap("CodeSourceId")
    private String codeSourceId;

    @NameInMap("RequestId")
    private String requestId;

    private PublishCodeSourceResponseBody(Builder builder) {
        this.codeSourceId = builder.codeSourceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishCodeSourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return codeSourceId
     */
    public String getCodeSourceId() {
        return this.codeSourceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String codeSourceId; 
        private String requestId; 

        /**
         * CodeSourceId.
         */
        public Builder codeSourceId(String codeSourceId) {
            this.codeSourceId = codeSourceId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PublishCodeSourceResponseBody build() {
            return new PublishCodeSourceResponseBody(this);
        } 

    } 

}
