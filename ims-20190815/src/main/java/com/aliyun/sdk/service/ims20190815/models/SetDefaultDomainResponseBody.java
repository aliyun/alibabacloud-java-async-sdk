// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDefaultDomainResponseBody} extends {@link TeaModel}
 *
 * <p>SetDefaultDomainResponseBody</p>
 */
public class SetDefaultDomainResponseBody extends TeaModel {
    @NameInMap("DefaultDomainName")
    private String defaultDomainName;

    @NameInMap("RequestId")
    private String requestId;

    private SetDefaultDomainResponseBody(Builder builder) {
        this.defaultDomainName = builder.defaultDomainName;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDefaultDomainResponseBody create() {
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SetDefaultDomainResponseBody build() {
            return new SetDefaultDomainResponseBody(this);
        } 

    } 

}
