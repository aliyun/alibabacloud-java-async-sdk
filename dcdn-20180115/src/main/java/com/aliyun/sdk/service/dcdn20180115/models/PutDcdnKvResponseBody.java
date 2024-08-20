// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutDcdnKvResponseBody} extends {@link TeaModel}
 *
 * <p>PutDcdnKvResponseBody</p>
 */
public class PutDcdnKvResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Length")
    private Integer length;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Value")
    private String value;

    private PutDcdnKvResponseBody(Builder builder) {
        this.length = builder.length;
        this.requestId = builder.requestId;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutDcdnKvResponseBody create() {
        return builder().build();
    }

    /**
     * @return length
     */
    public Integer getLength() {
        return this.length;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder {
        private Integer length; 
        private String requestId; 
        private String value; 

        /**
         * The length of the key.
         */
        public Builder length(Integer length) {
            this.length = length;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The value of the key. If the value exceeds 256 characters in length, the first 100 characters and the last 100 characters are retained and other characters are not displayed.
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public PutDcdnKvResponseBody build() {
            return new PutDcdnKvResponseBody(this);
        } 

    } 

}
