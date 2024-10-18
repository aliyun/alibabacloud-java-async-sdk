// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RemoveTagsFromResourceResponseBody} extends {@link TeaModel}
 *
 * <p>RemoveTagsFromResourceResponseBody</p>
 */
public class RemoveTagsFromResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RemoveTagsFromResourceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveTagsFromResourceResponseBody create() {
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AE00ACCD-1CF9-4920-9BB9-0175EFF43405</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RemoveTagsFromResourceResponseBody build() {
            return new RemoveTagsFromResourceResponseBody(this);
        } 

    } 

}
