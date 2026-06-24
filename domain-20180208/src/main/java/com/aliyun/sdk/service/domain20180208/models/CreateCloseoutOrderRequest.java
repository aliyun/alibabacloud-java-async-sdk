// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

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
 * {@link CreateCloseoutOrderRequest} extends {@link RequestModel}
 *
 * <p>CreateCloseoutOrderRequest</p>
 */
public class CreateCloseoutOrderRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactId")
    private Long contactId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    private CreateCloseoutOrderRequest(Builder builder) {
        super(builder);
        this.contactId = builder.contactId;
        this.domainName = builder.domainName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCloseoutOrderRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactId
     */
    public Long getContactId() {
        return this.contactId;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    public static final class Builder extends Request.Builder<CreateCloseoutOrderRequest, Builder> {
        private Long contactId; 
        private String domainName; 

        private Builder() {
            super();
        } 

        private Builder(CreateCloseoutOrderRequest request) {
            super(request);
            this.contactId = request.contactId;
            this.domainName = request.domainName;
        } 

        /**
         * ContactId.
         */
        public Builder contactId(Long contactId) {
            this.putQueryParameter("ContactId", contactId);
            this.contactId = contactId;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        @Override
        public CreateCloseoutOrderRequest build() {
            return new CreateCloseoutOrderRequest(this);
        } 

    } 

}
