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
    private String rr;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Value")
    private String value;

    private GetTxtRecordForVerifyResponseBody(Builder builder) {
        this.domainName = builder.domainName;
        this.rr = builder.rr;
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
     * @return rr
     */
    public String getRr() {
        return this.rr;
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
        private String rr; 
        private String requestId; 
        private String value; 

        /**
         * The domain name.
         * <p>
         * 
         * >  If you do not specify this parameter, it is not returned.
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * The host record.
         */
        public Builder rr(String rr) {
            this.rr = rr;
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
         * The value of the DNS record.
         * <p>
         * 
         * >  The validity period is three days.
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
