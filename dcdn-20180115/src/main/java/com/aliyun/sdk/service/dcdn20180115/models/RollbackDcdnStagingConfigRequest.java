// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RollbackDcdnStagingConfigRequest} extends {@link RequestModel}
 *
 * <p>RollbackDcdnStagingConfigRequest</p>
 */
public class RollbackDcdnStagingConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    private RollbackDcdnStagingConfigRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RollbackDcdnStagingConfigRequest create() {
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

    public static final class Builder extends Request.Builder<RollbackDcdnStagingConfigRequest, Builder> {
        private String domainName; 

        private Builder() {
            super();
        } 

        private Builder(RollbackDcdnStagingConfigRequest request) {
            super(request);
            this.domainName = request.domainName;
        } 

        /**
         * <p>The accelerated domain name. You can specify only one domain name in each call.</p>
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

        @Override
        public RollbackDcdnStagingConfigRequest build() {
            return new RollbackDcdnStagingConfigRequest(this);
        } 

    } 

}
