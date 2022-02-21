// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckUsedPropertyResponseBody} extends {@link TeaModel}
 *
 * <p>CheckUsedPropertyResponseBody</p>
 */
public class CheckUsedPropertyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UseCount")
    private Long useCount;

    private CheckUsedPropertyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.useCount = builder.useCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckUsedPropertyResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return useCount
     */
    public Long getUseCount() {
        return this.useCount;
    }

    public static final class Builder {
        private String requestId; 
        private Long useCount; 

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UseCount.
         */
        public Builder useCount(Long useCount) {
            this.useCount = useCount;
            return this;
        }

        public CheckUsedPropertyResponseBody build() {
            return new CheckUsedPropertyResponseBody(this);
        } 

    } 

}
