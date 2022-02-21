// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTxtRecordForVerifyResponseBody} extends {@link TeaModel}
 *
 * <p>GetTxtRecordForVerifyResponseBody</p>
 */
public class GetTxtRecordForVerifyResponseBody extends TeaModel {
    @NameInMap("DomainName")
    private String domainName;

    @NameInMap("RR")
    private String RR;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Value")
    private String value;

    private GetTxtRecordForVerifyResponseBody(Builder builder) {
        this.domainName = builder.domainName;
        this.RR = builder.RR;
        this.requestId = builder.requestId;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTxtRecordForVerifyResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return RR
     */
    public String getRR() {
        return this.RR;
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
        private String domainName; 
        private String RR; 
        private String requestId; 
        private String value; 

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * RR.
         */
        public Builder RR(String RR) {
            this.RR = RR;
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

        public GetTxtRecordForVerifyResponseBody build() {
            return new GetTxtRecordForVerifyResponseBody(this);
        } 

    } 

}
