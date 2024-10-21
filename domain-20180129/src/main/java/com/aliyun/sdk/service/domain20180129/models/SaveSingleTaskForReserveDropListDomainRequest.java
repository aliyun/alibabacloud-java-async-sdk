// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SaveSingleTaskForReserveDropListDomainRequest} extends {@link RequestModel}
 *
 * <p>SaveSingleTaskForReserveDropListDomainRequest</p>
 */
public class SaveSingleTaskForReserveDropListDomainRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactTemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contactTemplateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Dns1")
    private String dns1;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Dns2")
    private String dns2;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    private SaveSingleTaskForReserveDropListDomainRequest(Builder builder) {
        super(builder);
        this.contactTemplateId = builder.contactTemplateId;
        this.dns1 = builder.dns1;
        this.dns2 = builder.dns2;
        this.domainName = builder.domainName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveSingleTaskForReserveDropListDomainRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactTemplateId
     */
    public String getContactTemplateId() {
        return this.contactTemplateId;
    }

    /**
     * @return dns1
     */
    public String getDns1() {
        return this.dns1;
    }

    /**
     * @return dns2
     */
    public String getDns2() {
        return this.dns2;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    public static final class Builder extends Request.Builder<SaveSingleTaskForReserveDropListDomainRequest, Builder> {
        private String contactTemplateId; 
        private String dns1; 
        private String dns2; 
        private String domainName; 

        private Builder() {
            super();
        } 

        private Builder(SaveSingleTaskForReserveDropListDomainRequest request) {
            super(request);
            this.contactTemplateId = request.contactTemplateId;
            this.dns1 = request.dns1;
            this.dns2 = request.dns2;
            this.domainName = request.domainName;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder contactTemplateId(String contactTemplateId) {
            this.putQueryParameter("ContactTemplateId", contactTemplateId);
            this.contactTemplateId = contactTemplateId;
            return this;
        }

        /**
         * Dns1.
         */
        public Builder dns1(String dns1) {
            this.putQueryParameter("Dns1", dns1);
            this.dns1 = dns1;
            return this;
        }

        /**
         * Dns2.
         */
        public Builder dns2(String dns2) {
            this.putQueryParameter("Dns2", dns2);
            this.dns2 = dns2;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        @Override
        public SaveSingleTaskForReserveDropListDomainRequest build() {
            return new SaveSingleTaskForReserveDropListDomainRequest(this);
        } 

    } 

}
