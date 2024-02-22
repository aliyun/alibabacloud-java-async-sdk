// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDocResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteDocResponseBody</p>
 */
public class DeleteDocResponseBody extends TeaModel {
    @NameInMap("DocId")
    private String docId;

    @NameInMap("RequestId")
    private String requestId;

    private DeleteDocResponseBody(Builder builder) {
        this.docId = builder.docId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDocResponseBody create() {
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteDocResponseBody build() {
            return new DeleteDocResponseBody(this);
        } 

    } 

}
