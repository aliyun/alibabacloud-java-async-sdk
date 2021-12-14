// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeDomainNamesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainNamesResponseBody</p>
 */
public class DescribeDomainNamesResponseBody extends TeaModel {
    @NameInMap("DomainNames")
    private java.util.List < String > domainNames;

    @NameInMap("RequestId")
    private String requestId;


    private DescribeDomainNamesResponseBody(Builder builder) {
        this.domainNames = builder.domainNames;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainNamesResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainNames
     */
    public java.util.List < String > getDomainNames() {
        return this.domainNames;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > domainNames; 
        private String requestId; 

        /**
         * <p>DomainNames.</p>
         */
        public Builder domainNames(java.util.List < String > domainNames) {
            this.domainNames = domainNames;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDomainNamesResponseBody build() {
            return new DescribeDomainNamesResponseBody(this);
        } 

    } 

}
