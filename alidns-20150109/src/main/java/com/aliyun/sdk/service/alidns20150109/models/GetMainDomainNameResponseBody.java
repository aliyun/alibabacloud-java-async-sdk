// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMainDomainNameResponseBody} extends {@link TeaModel}
 *
 * <p>GetMainDomainNameResponseBody</p>
 */
public class GetMainDomainNameResponseBody extends TeaModel {
    @NameInMap("DomainLevel")
    private Long domainLevel;

    @NameInMap("DomainName")
    private String domainName;

    @NameInMap("RR")
    private String RR;

    @NameInMap("RequestId")
    private String requestId;

    private GetMainDomainNameResponseBody(Builder builder) {
        this.domainLevel = builder.domainLevel;
        this.domainName = builder.domainName;
        this.RR = builder.RR;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMainDomainNameResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainLevel
     */
    public Long getDomainLevel() {
        return this.domainLevel;
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

    public static final class Builder {
        private Long domainLevel; 
        private String domainName; 
        private String RR; 
        private String requestId; 

        /**
         * DomainLevel.
         */
        public Builder domainLevel(Long domainLevel) {
            this.domainLevel = domainLevel;
            return this;
        }

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

        public GetMainDomainNameResponseBody build() {
            return new GetMainDomainNameResponseBody(this);
        } 

    } 

}
