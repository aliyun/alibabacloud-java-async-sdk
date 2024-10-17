// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateFixedPriceDemandOrderRequest} extends {@link RequestModel}
 *
 * <p>CreateFixedPriceDemandOrderRequest</p>
 */
public class CreateFixedPriceDemandOrderRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactId")
    private String contactId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    private CreateFixedPriceDemandOrderRequest(Builder builder) {
        super(builder);
        this.code = builder.code;
        this.contactId = builder.contactId;
        this.domain = builder.domain;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFixedPriceDemandOrderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return contactId
     */
    public String getContactId() {
        return this.contactId;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<CreateFixedPriceDemandOrderRequest, Builder> {
        private String code; 
        private String contactId; 
        private String domain; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(CreateFixedPriceDemandOrderRequest request) {
            super(request);
            this.code = request.code;
            this.contactId = request.contactId;
            this.domain = request.domain;
            this.source = request.source;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.putQueryParameter("Code", code);
            this.code = code;
            return this;
        }

        /**
         * ContactId.
         */
        public Builder contactId(String contactId) {
            this.putQueryParameter("ContactId", contactId);
            this.contactId = contactId;
            return this;
        }

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        @Override
        public CreateFixedPriceDemandOrderRequest build() {
            return new CreateFixedPriceDemandOrderRequest(this);
        } 

    } 

}
