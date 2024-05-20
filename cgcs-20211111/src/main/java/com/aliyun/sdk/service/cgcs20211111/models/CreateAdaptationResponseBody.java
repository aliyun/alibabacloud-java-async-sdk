// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cgcs20211111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAdaptationResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAdaptationResponseBody</p>
 */
public class CreateAdaptationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AdaptApplyId")
    private Long adaptApplyId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateAdaptationResponseBody(Builder builder) {
        this.adaptApplyId = builder.adaptApplyId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAdaptationResponseBody create() {
        return builder().build();
    }

    /**
     * @return adaptApplyId
     */
    public Long getAdaptApplyId() {
        return this.adaptApplyId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long adaptApplyId; 
        private String requestId; 

        /**
         * AdaptApplyId.
         */
        public Builder adaptApplyId(Long adaptApplyId) {
            this.adaptApplyId = adaptApplyId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAdaptationResponseBody build() {
            return new CreateAdaptationResponseBody(this);
        } 

    } 

}
