// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDomainRequest} extends {@link RequestModel}
 *
 * <p>GetDomainRequest</p>
 */
public class GetDomainRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("domain_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fields")
    private String fields;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("get_quota_used")
    private Boolean getQuotaUsed;

    private GetDomainRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.fields = builder.fields;
        this.getQuotaUsed = builder.getQuotaUsed;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDomainRequest create() {
        return builder().build();
    }

    @Override
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
     * @return fields
     */
    public String getFields() {
        return this.fields;
    }

    /**
     * @return getQuotaUsed
     */
    public Boolean getGetQuotaUsed() {
        return this.getQuotaUsed;
    }

    public static final class Builder extends Request.Builder<GetDomainRequest, Builder> {
        private String domainId; 
        private String fields; 
        private Boolean getQuotaUsed; 

        private Builder() {
            super();
        } 

        private Builder(GetDomainRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.fields = request.fields;
            this.getQuotaUsed = request.getQuotaUsed;
        } 

        /**
         * The ID of the domain.
         */
        public Builder domainId(String domainId) {
            this.putBodyParameter("domain_id", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * fields.
         */
        public Builder fields(String fields) {
            this.putBodyParameter("fields", fields);
            this.fields = fields;
            return this;
        }

        /**
         * Specifies whether to return the used quota of the domain. Default value: false. If the quota of the domain is greater than 0 and you set this parameter to true, the used quota of the domain is returned.
         */
        public Builder getQuotaUsed(Boolean getQuotaUsed) {
            this.putBodyParameter("get_quota_used", getQuotaUsed);
            this.getQuotaUsed = getQuotaUsed;
            return this;
        }

        @Override
        public GetDomainRequest build() {
            return new GetDomainRequest(this);
        } 

    } 

}
