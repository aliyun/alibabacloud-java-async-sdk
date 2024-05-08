// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIntranetDomainResponseBody} extends {@link TeaModel}
 *
 * <p>CreateIntranetDomainResponseBody</p>
 */
public class CreateIntranetDomainResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateIntranetDomainResponseBody(Builder builder) {
        this.domainName = builder.domainName;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIntranetDomainResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String domainName; 
        private String requestId; 

        /**
         * The ID of the request.
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * auditing
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateIntranetDomainResponseBody build() {
            return new CreateIntranetDomainResponseBody(this);
        } 

    } 

}
