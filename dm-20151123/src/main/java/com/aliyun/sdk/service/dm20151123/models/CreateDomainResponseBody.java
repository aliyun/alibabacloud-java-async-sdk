// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

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
 * {@link CreateDomainResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDomainResponseBody</p>
 */
public class CreateDomainResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainId")
    private String domainId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateDomainResponseBody(Builder builder) {
        this.domainId = builder.domainId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDomainResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String domainId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateDomainResponseBody model) {
            this.domainId = model.domainId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Domain ID</p>
         * 
         * <strong>example:</strong>
         * <p>158910</p>
         */
        public Builder domainId(String domainId) {
            this.domainId = domainId;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>B49AD828-25D1-488C-90B7-8853C1944486</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDomainResponseBody build() {
            return new CreateDomainResponseBody(this);
        } 

    } 

}
