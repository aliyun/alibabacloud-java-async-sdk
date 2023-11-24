// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublishPlaybookResponseBody} extends {@link TeaModel}
 *
 * <p>PublishPlaybookResponseBody</p>
 */
public class PublishPlaybookResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private PublishPlaybookResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishPlaybookResponseBody create() {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PublishPlaybookResponseBody build() {
            return new PublishPlaybookResponseBody(this);
        } 

    } 

}