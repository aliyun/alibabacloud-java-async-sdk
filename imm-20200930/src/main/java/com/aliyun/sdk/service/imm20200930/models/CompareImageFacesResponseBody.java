// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F73AC982-2B9E-4ECD-AED5-F8331C5******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The face similarity. A larger value indicates a higher face similarity. Valid values: 0 to 1.</p>
         * 
         * <strong>example:</strong>
         * <p>0.8848152756690983</p>
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
