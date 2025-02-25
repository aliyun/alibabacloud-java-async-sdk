// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link CreatePrivateAccessTagResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePrivateAccessTagResponseBody</p>
 */
public class CreatePrivateAccessTagResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TagId")
    private String tagId;

    private CreatePrivateAccessTagResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tagId = builder.tagId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePrivateAccessTagResponseBody create() {
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

        public CreatePrivateAccessTagResponseBody build() {
            return new CreatePrivateAccessTagResponseBody(this);
        } 

    } 

}
