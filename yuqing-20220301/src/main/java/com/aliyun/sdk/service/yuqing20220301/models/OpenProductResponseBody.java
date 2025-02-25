// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yuqing20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link OpenProductResponseBody} extends {@link TeaModel}
 *
 * <p>OpenProductResponseBody</p>
 */
public class OpenProductResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private OpenProductResponseBody(Builder builder) {
        this.id = builder.id;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenProductResponseBody create() {
        return builder().build();
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long id; 
        private String requestId; 

        /**
         * id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public OpenProductResponseBody build() {
            return new OpenProductResponseBody(this);
        } 

    } 

}
