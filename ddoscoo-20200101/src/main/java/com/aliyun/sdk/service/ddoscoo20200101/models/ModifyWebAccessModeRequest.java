// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The mode in which a website service is added to Anti-DDoS Pro or Anti-DDoS Premium. Valid values:
         * <p>
         * 
         * *   **0**: A record mode
         * *   **1**: anti-DDoS mode
         * *   **2**: origin redundancy mode
         */
        public Builder accessMode(Integer accessMode) {
            this.putQueryParameter("AccessMode", accessMode);
            this.accessMode = accessMode;
            return this;
        }

        /**
         * The domain name of the website.
         * <p>
         * 
         * > A forwarding rule must be configured for the domain name. You can call the [DescribeDomains](~~91724~~) operation to query all domain names.
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
