// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link ModifyWebCCGlobalSwitchRequest} extends {@link RequestModel}
 *
 * <p>ModifyWebCCGlobalSwitchRequest</p>
 */
public class ModifyWebCCGlobalSwitchRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CcGlobalSwitch")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ccGlobalSwitch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domain;

    private ModifyWebCCGlobalSwitchRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.ccGlobalSwitch = builder.ccGlobalSwitch;
        this.domain = builder.domain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyWebCCGlobalSwitchRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return ccGlobalSwitch
     */
    public String getCcGlobalSwitch() {
        return this.ccGlobalSwitch;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    public static final class Builder extends Request.Builder<ModifyWebCCGlobalSwitchRequest, Builder> {
        private String regionId; 
        private String ccGlobalSwitch; 
        private String domain; 

        private Builder() {
            super();
        } 

        private Builder(ModifyWebCCGlobalSwitchRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.ccGlobalSwitch = request.ccGlobalSwitch;
            this.domain = request.domain;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Specifies whether the HTTP flood mitigation feature is enabled. Valid values:</p>
         * <ul>
         * <li><strong>open</strong></li>
         * <li><strong>close</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>open</p>
         */
        public Builder ccGlobalSwitch(String ccGlobalSwitch) {
            this.putQueryParameter("CcGlobalSwitch", ccGlobalSwitch);
            this.ccGlobalSwitch = ccGlobalSwitch;
            return this;
        }

        /**
         * <p>The domain name of the website.</p>
         * <blockquote>
         * <p> A forwarding rule must be configured for the domain name. You can call the <a href="https://help.aliyun.com/document_detail/91724.html">DescribeDomains</a> operation to query all domain names.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.aliyundoc.com</p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        @Override
        public ModifyWebCCGlobalSwitchRequest build() {
            return new ModifyWebCCGlobalSwitchRequest(this);
        } 

    } 

}
