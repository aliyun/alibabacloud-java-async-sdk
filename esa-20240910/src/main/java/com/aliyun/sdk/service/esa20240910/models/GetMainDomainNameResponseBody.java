// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link GetMainDomainNameResponseBody} extends {@link TeaModel}
 *
 * <p>GetMainDomainNameResponseBody</p>
 */
public class GetMainDomainNameResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainLevel")
    private Integer domainLevel;

    @com.aliyun.core.annotation.NameInMap("MainDomainName")
    private String mainDomainName;

    @com.aliyun.core.annotation.NameInMap("RR")
    private String rr;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetMainDomainNameResponseBody(Builder builder) {
        this.domainLevel = builder.domainLevel;
        this.mainDomainName = builder.mainDomainName;
        this.rr = builder.rr;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMainDomainNameResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainLevel
     */
    public Integer getDomainLevel() {
        return this.domainLevel;
    }

    /**
     * @return mainDomainName
     */
    public String getMainDomainName() {
        return this.mainDomainName;
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

    public static final class Builder {
        private Integer domainLevel; 
        private String mainDomainName; 
        private String rr; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetMainDomainNameResponseBody model) {
            this.domainLevel = model.domainLevel;
            this.mainDomainName = model.mainDomainName;
            this.rr = model.rr;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The level of the domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder domainLevel(Integer domainLevel) {
            this.domainLevel = domainLevel;
            return this;
        }

        /**
         * <p>The root domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder mainDomainName(String mainDomainName) {
            this.mainDomainName = mainDomainName;
            return this;
        }

        /**
         * <p>The host record.</p>
         * 
         * <strong>example:</strong>
         * <p>sub</p>
         */
        public Builder rr(String rr) {
            this.rr = rr;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9732E117-8A37-49FD-A36F-ABBB87556CA7</p>
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
