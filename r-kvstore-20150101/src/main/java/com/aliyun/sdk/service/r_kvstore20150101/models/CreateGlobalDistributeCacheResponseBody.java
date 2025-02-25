// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateGlobalDistributeCacheResponseBody} extends {@link TeaModel}
 *
 * <p>CreateGlobalDistributeCacheResponseBody</p>
 */
public class CreateGlobalDistributeCacheResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateGlobalDistributeCacheResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGlobalDistributeCacheResponseBody create() {
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E681E498-5A0D-44F2-B1A7-912DC3******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateGlobalDistributeCacheResponseBody build() {
            return new CreateGlobalDistributeCacheResponseBody(this);
        } 

    } 

}
