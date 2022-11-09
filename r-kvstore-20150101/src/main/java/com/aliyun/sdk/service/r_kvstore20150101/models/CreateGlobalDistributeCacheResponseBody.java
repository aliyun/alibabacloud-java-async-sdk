// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateGlobalDistributeCacheResponseBody} extends {@link TeaModel}
 *
 * <p>CreateGlobalDistributeCacheResponseBody</p>
 */
public class CreateGlobalDistributeCacheResponseBody extends TeaModel {
    @NameInMap("GlobalInstanceId")
    private String globalInstanceId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateGlobalDistributeCacheResponseBody(Builder builder) {
        this.globalInstanceId = builder.globalInstanceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGlobalDistributeCacheResponseBody create() {
        return builder().build();
    }

    /**
     * @return globalInstanceId
     */
    public String getGlobalInstanceId() {
        return this.globalInstanceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String globalInstanceId; 
        private String requestId; 

        /**
         * GlobalInstanceId.
         */
        public Builder globalInstanceId(String globalInstanceId) {
            this.globalInstanceId = globalInstanceId;
            return this;
        }

        /**
         * RequestId.
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
