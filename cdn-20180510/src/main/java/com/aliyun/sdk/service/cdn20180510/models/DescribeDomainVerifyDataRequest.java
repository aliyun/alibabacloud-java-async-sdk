// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDomainVerifyDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeDomainVerifyDataRequest</p>
 */
public class DescribeDomainVerifyDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GlobalResourcePlan")
    private String globalResourcePlan;

    private DescribeDomainVerifyDataRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.globalResourcePlan = builder.globalResourcePlan;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainVerifyDataRequest create() {
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
     * @return globalResourcePlan
     */
    public String getGlobalResourcePlan() {
        return this.globalResourcePlan;
    }

    public static final class Builder extends Request.Builder<DescribeDomainVerifyDataRequest, Builder> {
        private String domainName; 
        private String globalResourcePlan; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDomainVerifyDataRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.globalResourcePlan = request.globalResourcePlan;
        } 

        /**
         * <p>The accelerated domain name. You can specify only one domain name in each request.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.yourdomain.com">www.yourdomain.com</a></p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>Specifies whether to enable the global resource plan.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>off</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>on</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder globalResourcePlan(String globalResourcePlan) {
            this.putQueryParameter("GlobalResourcePlan", globalResourcePlan);
            this.globalResourcePlan = globalResourcePlan;
            return this;
        }

        @Override
        public DescribeDomainVerifyDataRequest build() {
            return new DescribeDomainVerifyDataRequest(this);
        } 

    } 

}
