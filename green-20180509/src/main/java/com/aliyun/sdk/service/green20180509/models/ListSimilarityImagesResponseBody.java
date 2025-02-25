// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20180509.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSimilarityImagesResponseBody} extends {@link TeaModel}
 *
 * <p>ListSimilarityImagesResponseBody</p>
 */
public class ListSimilarityImagesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListSimilarityImagesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSimilarityImagesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListSimilarityImagesResponseBody build() {
            return new ListSimilarityImagesResponseBody(this);
        } 

    } 

}
