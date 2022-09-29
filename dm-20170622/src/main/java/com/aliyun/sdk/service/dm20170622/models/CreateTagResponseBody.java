// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20170622.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTagResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTagResponseBody</p>
 */
public class CreateTagResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TagId")
    private String tagId;

    private CreateTagResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tagId = builder.tagId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTagResponseBody create() {
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

        public CreateTagResponseBody build() {
            return new CreateTagResponseBody(this);
        } 

    } 

}
