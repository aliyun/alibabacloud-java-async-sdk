// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link CreatePrefixListResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePrefixListResponseBody</p>
 */
public class CreatePrefixListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PrefixListId")
    private String prefixListId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreatePrefixListResponseBody(Builder builder) {
        this.prefixListId = builder.prefixListId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePrefixListResponseBody create() {
        return builder().build();
    }

    /**
     * @return prefixListId
     */
    public String getPrefixListId() {
        return this.prefixListId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String prefixListId; 
        private String requestId; 

        /**
         * <p>The ID of the prefix list.</p>
         * 
         * <strong>example:</strong>
         * <p>pl-x1j1k5ykzqlixdcy****</p>
         */
        public Builder prefixListId(String prefixListId) {
            this.prefixListId = prefixListId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>38793DB8-A4B2-4AEC-BFD3-111234E9188D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreatePrefixListResponseBody build() {
            return new CreatePrefixListResponseBody(this);
        } 

    } 

}
