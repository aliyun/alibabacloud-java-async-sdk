// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDocumentTagResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDocumentTagResponseBody</p>
 */
public class CreateDocumentTagResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TagId")
    private String tagId;

    private CreateDocumentTagResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tagId = builder.tagId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDocumentTagResponseBody create() {
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
         * RequestId.
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

        public CreateDocumentTagResponseBody build() {
            return new CreateDocumentTagResponseBody(this);
        } 

    } 

}
