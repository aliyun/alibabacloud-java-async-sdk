// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckUsedPropertyValueResponseBody} extends {@link TeaModel}
 *
 * <p>CheckUsedPropertyValueResponseBody</p>
 */
public class CheckUsedPropertyValueResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UseCount")
    private Long useCount;

    private CheckUsedPropertyValueResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.useCount = builder.useCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckUsedPropertyValueResponseBody create() {
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of convenience users that are associated with the property value.
         */
        public Builder useCount(Long useCount) {
            this.useCount = useCount;
            return this;
        }

        public CheckUsedPropertyValueResponseBody build() {
            return new CheckUsedPropertyValueResponseBody(this);
        } 

    } 

}
