// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link PutDcdnKvWithHighCapacityResponseBody} extends {@link TeaModel}
 *
 * <p>PutDcdnKvWithHighCapacityResponseBody</p>
 */
public class PutDcdnKvWithHighCapacityResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Length")
    private Integer length;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Value")
    private String value;

    private PutDcdnKvWithHighCapacityResponseBody(Builder builder) {
        this.length = builder.length;
        this.requestId = builder.requestId;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutDcdnKvWithHighCapacityResponseBody create() {
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
         * Length.
         */
        public Builder length(Integer length) {
            this.length = length;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Value.
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public PutDcdnKvWithHighCapacityResponseBody build() {
            return new PutDcdnKvWithHighCapacityResponseBody(this);
        } 

    } 

}
