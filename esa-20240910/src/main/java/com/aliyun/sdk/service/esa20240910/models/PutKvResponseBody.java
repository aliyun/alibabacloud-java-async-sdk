// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link PutKvResponseBody} extends {@link TeaModel}
 *
 * <p>PutKvResponseBody</p>
 */
public class PutKvResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Length")
    private String length;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Value")
    private String value;

    private PutKvResponseBody(Builder builder) {
        this.length = builder.length;
        this.requestId = builder.requestId;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutKvResponseBody create() {
        return builder().build();
    }

    /**
     * @return length
     */
    public String getLength() {
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
        private String length; 
        private String requestId; 
        private String value; 

        /**
         * <p>The length of the value in the key-value pair.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder length(String length) {
            this.length = length;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EEEBE525-F576-1196-8DAF-2D70CA3F4D2F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The content of the key. If the content has more than 256 characters in length, the system displays the first 100 and the last 100 characters, and omits the middle part.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public PutKvResponseBody build() {
            return new PutKvResponseBody(this);
        } 

    } 

}
