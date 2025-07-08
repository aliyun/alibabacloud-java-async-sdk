// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysms20170620.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CalculateSmsLengthNewResponseBody} extends {@link TeaModel}
 *
 * <p>CalculateSmsLengthNewResponseBody</p>
 */
public class CalculateSmsLengthNewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Length")
    private Integer length;

    @com.aliyun.core.annotation.NameInMap("Number")
    private Integer number;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CalculateSmsLengthNewResponseBody(Builder builder) {
        this.length = builder.length;
        this.number = builder.number;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CalculateSmsLengthNewResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return length
     */
    public Integer getLength() {
        return this.length;
    }

    /**
     * @return number
     */
    public Integer getNumber() {
        return this.number;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer length; 
        private Integer number; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CalculateSmsLengthNewResponseBody model) {
            this.length = model.length;
            this.number = model.number;
            this.requestId = model.requestId;
        } 

        /**
         * Length.
         */
        public Builder length(Integer length) {
            this.length = length;
            return this;
        }

        /**
         * Number.
         */
        public Builder number(Integer number) {
            this.number = number;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CalculateSmsLengthNewResponseBody build() {
            return new CalculateSmsLengthNewResponseBody(this);
        } 

    } 

}
