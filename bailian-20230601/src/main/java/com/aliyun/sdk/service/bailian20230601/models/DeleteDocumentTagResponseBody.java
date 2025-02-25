// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDocumentTagResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteDocumentTagResponseBody</p>
 */
public class DeleteDocumentTagResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TagId")
    private String tagId;

    private DeleteDocumentTagResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tagId = builder.tagId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDocumentTagResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tagId
     */
    public String getTagId() {
        return this.tagId;
    }

    public static final class Builder {
        private String requestId; 
        private String tagId; 

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TagId.
         */
        public Builder tagId(String tagId) {
            this.tagId = tagId;
            return this;
        }

        public DeleteDocumentTagResponseBody build() {
            return new DeleteDocumentTagResponseBody(this);
        } 

    } 

}
