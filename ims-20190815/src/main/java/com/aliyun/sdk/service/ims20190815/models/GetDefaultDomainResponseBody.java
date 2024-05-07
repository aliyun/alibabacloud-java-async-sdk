// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDefaultDomainResponseBody} extends {@link TeaModel}
 *
 * <p>GetDefaultDomainResponseBody</p>
 */
public class GetDefaultDomainResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DefaultDomainName")
    private String defaultDomainName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDefaultDomainResponseBody(Builder builder) {
        this.defaultDomainName = builder.defaultDomainName;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDefaultDomainResponseBody create() {
        return builder().build();
    }

    /**
     * @return defaultDomainName
     */
    public String getDefaultDomainName() {
        return this.defaultDomainName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String defaultDomainName; 
        private String requestId; 

        /**
         * The default domain name.
         */
        public Builder defaultDomainName(String defaultDomainName) {
            this.defaultDomainName = defaultDomainName;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDefaultDomainResponseBody build() {
            return new GetDefaultDomainResponseBody(this);
        } 

    } 

}
