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
 * {@link ModifyOcspStatusRequest} extends {@link RequestModel}
 *
 * <p>ModifyOcspStatusRequest</p>
 */
public class ModifyOcspStatusRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enable")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer enable;

    private ModifyOcspStatusRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.domain = builder.domain;
        this.enable = builder.enable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyOcspStatusRequest create() {
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
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return enable
     */
    public Integer getEnable() {
        return this.enable;
    }

    public static final class Builder extends Request.Builder<ModifyOcspStatusRequest, Builder> {
        private String regionId; 
        private String domain; 
        private Integer enable; 

        private Builder() {
            super();
        } 

        private Builder(ModifyOcspStatusRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.domain = request.domain;
            this.enable = request.enable;
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
         * <p>The domain name for which you want to configure the Static Page Caching policy.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/91724.html">DescribeDomains</a> operation to query all the domain names that are added to Anti-DDoS Pro or Anti-DDoS Premium.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>click.linktech.cn</p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * <p>Specifies whether to enable the OCSP feature. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: yes</li>
         * <li><strong>0</strong>: no</li>
         * </ul>
         * <p>This parameter is required.</p>
         */
        public Builder enable(Integer enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        @Override
        public ModifyOcspStatusRequest build() {
            return new ModifyOcspStatusRequest(this);
        } 

    } 

}
