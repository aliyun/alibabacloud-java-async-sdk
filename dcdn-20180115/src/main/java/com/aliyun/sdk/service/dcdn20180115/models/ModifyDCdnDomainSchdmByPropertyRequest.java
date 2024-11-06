// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyDCdnDomainSchdmByPropertyRequest} extends {@link RequestModel}
 *
 * <p>ModifyDCdnDomainSchdmByPropertyRequest</p>
 */
public class ModifyDCdnDomainSchdmByPropertyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Property")
    @com.aliyun.core.annotation.Validation(required = true)
    private String property;

    private ModifyDCdnDomainSchdmByPropertyRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.property = builder.property;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDCdnDomainSchdmByPropertyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return property
     */
    public String getProperty() {
        return this.property;
    }

    public static final class Builder extends Request.Builder<ModifyDCdnDomainSchdmByPropertyRequest, Builder> {
        private String domainName; 
        private String property; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDCdnDomainSchdmByPropertyRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.property = request.property;
        } 

        /**
         * <p>The name of the accelerated domain for which you want to change the acceleration region. You can specify only one domain name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The region where the acceleration service is deployed. Valid values:</p>
         * <ul>
         * <li><strong>domestic</strong>: Chinese mainland</li>
         * <li><strong>overseas</strong>: global (excluding mainland China)</li>
         * <li><strong>global</strong>: global</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;coverage&quot;:&quot;overseas&quot;}</p>
         */
        public Builder property(String property) {
            this.putQueryParameter("Property", property);
            this.property = property;
            return this;
        }

        @Override
        public ModifyDCdnDomainSchdmByPropertyRequest build() {
            return new ModifyDCdnDomainSchdmByPropertyRequest(this);
        } 

    } 

}
