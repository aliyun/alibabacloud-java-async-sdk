// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ft20180713.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FtDynamicAddressDubboResponseBody} extends {@link TeaModel}
 *
 * <p>FtDynamicAddressDubboResponseBody</p>
 */
public class FtDynamicAddressDubboResponseBody extends TeaModel {
    @NameInMap("IntValue")
    private Integer intValue;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StringValue")
    private String stringValue;

    private FtDynamicAddressDubboResponseBody(Builder builder) {
        this.intValue = builder.intValue;
        this.requestId = builder.requestId;
        this.stringValue = builder.stringValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FtDynamicAddressDubboResponseBody create() {
        return builder().build();
    }

    /**
     * @return intValue
     */
    public Integer getIntValue() {
        return this.intValue;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return stringValue
     */
    public String getStringValue() {
        return this.stringValue;
    }

    public static final class Builder {
        private Integer intValue; 
        private String requestId; 
        private String stringValue; 

        /**
         * IntValue.
         */
        public Builder intValue(Integer intValue) {
            this.intValue = intValue;
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
         * StringValue.
         */
        public Builder stringValue(String stringValue) {
            this.stringValue = stringValue;
            return this;
        }

        public FtDynamicAddressDubboResponseBody build() {
            return new FtDynamicAddressDubboResponseBody(this);
        } 

    } 

}
