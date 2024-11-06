// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link BatchSetDcdnWafDomainConfigsRequest} extends {@link RequestModel}
 *
 * <p>BatchSetDcdnWafDomainConfigsRequest</p>
 */
public class BatchSetDcdnWafDomainConfigsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientIpTag")
    private String clientIpTag;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DefenseStatus")
    private String defenseStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DomainNames")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainNames;

    private BatchSetDcdnWafDomainConfigsRequest(Builder builder) {
        super(builder);
        this.clientIpTag = builder.clientIpTag;
        this.defenseStatus = builder.defenseStatus;
        this.domainNames = builder.domainNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchSetDcdnWafDomainConfigsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientIpTag
     */
    public String getClientIpTag() {
        return this.clientIpTag;
    }

    /**
     * @return defenseStatus
     */
    public String getDefenseStatus() {
        return this.defenseStatus;
    }

    /**
     * @return domainNames
     */
    public String getDomainNames() {
        return this.domainNames;
    }

    public static final class Builder extends Request.Builder<BatchSetDcdnWafDomainConfigsRequest, Builder> {
        private String clientIpTag; 
        private String defenseStatus; 
        private String domainNames; 

        private Builder() {
            super();
        } 

        private Builder(BatchSetDcdnWafDomainConfigsRequest request) {
            super(request);
            this.clientIpTag = request.clientIpTag;
            this.defenseStatus = request.defenseStatus;
            this.domainNames = request.domainNames;
        } 

        /**
         * <p>Specifies the header that records the IP address to be obtained. If the default header is selected, the value of this parameter is empty. If a custom header is selected, the value of this parameter is the value specified by the user. Separate multiple values with commas (,). You can specify a maximum of five values.</p>
         * 
         * <strong>example:</strong>
         * <p>X-Forwarded-For</p>
         */
        public Builder clientIpTag(String clientIpTag) {
            this.putBodyParameter("ClientIpTag", clientIpTag);
            this.clientIpTag = clientIpTag;
            return this;
        }

        /**
         * <p>The protection status of the domain name. Valid values: on, off, and empty string.</p>
         * <ul>
         * <li>When you add a domain name, the value of this parameter is <strong>on</strong>, and the value of ClientIpTag takes effect, which is empty if the default header is selected and is the value specified by the user if a custom header is selected.</li>
         * <li>When you delete a domain name, the value of this parameter is <strong>off</strong>, and the value of ClientIpTag does not take effect.</li>
         * <li>When you only modify the value of ClientIpTag, the value of DefenseStatus is an empty string.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder defenseStatus(String defenseStatus) {
            this.putBodyParameter("DefenseStatus", defenseStatus);
            this.defenseStatus = defenseStatus;
            return this;
        }

        /**
         * <p>The protected domain names for which you want to change the protection status. You can specify up to 50 domain names. Separate multiple domain names with commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com,example2.com</p>
         */
        public Builder domainNames(String domainNames) {
            this.putBodyParameter("DomainNames", domainNames);
            this.domainNames = domainNames;
            return this;
        }

        @Override
        public BatchSetDcdnWafDomainConfigsRequest build() {
            return new BatchSetDcdnWafDomainConfigsRequest(this);
        } 

    } 

}
