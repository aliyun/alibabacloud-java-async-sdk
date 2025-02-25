// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlp_automl20190701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PredictMTModelByDocResponseBody} extends {@link TeaModel}
 *
 * <p>PredictMTModelByDocResponseBody</p>
 */
public class PredictMTModelByDocResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DocId")
    private String docId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private PredictMTModelByDocResponseBody(Builder builder) {
        this.docId = builder.docId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PredictMTModelByDocResponseBody create() {
        return builder().build();
    }

    /**
     * @return docId
     */
    public String getDocId() {
        return this.docId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String docId; 
        private String requestId; 

        /**
         * DocId.
         */
        public Builder docId(String docId) {
            this.docId = docId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PredictMTModelByDocResponseBody build() {
            return new PredictMTModelByDocResponseBody(this);
        } 

    } 

}
