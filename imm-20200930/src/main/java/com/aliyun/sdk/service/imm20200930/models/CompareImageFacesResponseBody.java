// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CompareImageFacesResponseBody} extends {@link TeaModel}
 *
 * <p>CompareImageFacesResponseBody</p>
 */
public class CompareImageFacesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Similarity")
    private Float similarity;

    private CompareImageFacesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.similarity = builder.similarity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CompareImageFacesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return similarity
     */
    public Float getSimilarity() {
        return this.similarity;
    }

    public static final class Builder {
        private String requestId; 
        private Float similarity; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Similarity.
         */
        public Builder similarity(Float similarity) {
            this.similarity = similarity;
            return this;
        }

        public CompareImageFacesResponseBody build() {
            return new CompareImageFacesResponseBody(this);
        } 

    } 

}
