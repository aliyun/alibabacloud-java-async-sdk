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
 * {@link ModifyWebAccessModeRequest} extends {@link RequestModel}
 *
 * <p>ModifyWebAccessModeRequest</p>
 */
public class ModifyWebAccessModeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer accessMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domain;

    private ModifyWebAccessModeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.accessMode = builder.accessMode;
        this.domain = builder.domain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyWebAccessModeRequest create() {
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
     * @return accessMode
     */
    public Integer getAccessMode() {
        return this.accessMode;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    public static final class Builder extends Request.Builder<ModifyWebAccessModeRequest, Builder> {
        private String regionId; 
        private Integer accessMode; 
        private String domain; 

        private Builder() {
            super();
        } 

        private Builder(ModifyWebAccessModeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.accessMode = request.accessMode;
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
         * <p>The mode in which a website service is added to Anti-DDoS Pro or Anti-DDoS Premium. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: A record mode</li>
         * <li><strong>1</strong>: anti-DDoS mode</li>
         * <li><strong>2</strong>: origin redundancy mode</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder accessMode(Integer accessMode) {
            this.putQueryParameter("AccessMode", accessMode);
            this.accessMode = accessMode;
            return this;
        }

        /**
         * <p>The domain name of the website.</p>
         * <blockquote>
         * <p>A forwarding rule must be configured for the domain name. You can call the <a href="https://help.aliyun.com/document_detail/91724.html">DescribeDomains</a> operation to query all domain names.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        @Override
        public ModifyWebAccessModeRequest build() {
            return new ModifyWebAccessModeRequest(this);
        } 

    } 

}
