// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePrefixListResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePrefixListResponseBody</p>
 */
public class CreatePrefixListResponseBody extends TeaModel {
    @NameInMap("PrefixListId")
    private String prefixListId;

    @NameInMap("RequestId")
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
         * The ID of the prefix list.
         */
        public Builder prefixListId(String prefixListId) {
            this.prefixListId = prefixListId;
            return this;
        }

        /**
         * The ID of the request.
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
