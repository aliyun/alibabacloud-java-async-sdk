// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

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
 * {@link ModifyCdnDomainSchdmByPropertyRequest} extends {@link RequestModel}
 *
 * <p>ModifyCdnDomainSchdmByPropertyRequest</p>
 */
public class ModifyCdnDomainSchdmByPropertyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Property")
    @com.aliyun.core.annotation.Validation(required = true)
    private String property;

    private ModifyCdnDomainSchdmByPropertyRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.property = builder.property;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCdnDomainSchdmByPropertyRequest create() {
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

    public static final class Builder extends Request.Builder<ModifyCdnDomainSchdmByPropertyRequest, Builder> {
        private String domainName; 
        private String property; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCdnDomainSchdmByPropertyRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.property = request.property;
        } 

        /**
         * <p>The accelerated domain name for which you want to change the acceleration region. You can specify only one domain name.</p>
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
         * <p>The information about the acceleration region. {&quot;coverage&quot;:&quot;overseas&quot;}</p>
         * <p>Valid values for coverage:</p>
         * <ul>
         * <li><strong>domestic</strong>: Chinese mainland</li>
         * <li><strong>overseas</strong>: global (excluding the Chinese mainland)</li>
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
        public ModifyCdnDomainSchdmByPropertyRequest build() {
            return new ModifyCdnDomainSchdmByPropertyRequest(this);
        } 

    } 

}
