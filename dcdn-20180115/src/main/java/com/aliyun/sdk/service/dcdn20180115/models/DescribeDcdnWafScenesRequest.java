// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnWafScenesRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnWafScenesRequest</p>
 */
public class DescribeDcdnWafScenesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefenseScenes")
    private String defenseScenes;

    private DescribeDcdnWafScenesRequest(Builder builder) {
        super(builder);
        this.defenseScenes = builder.defenseScenes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnWafScenesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return defenseScenes
     */
    public String getDefenseScenes() {
        return this.defenseScenes;
    }

    public static final class Builder extends Request.Builder<DescribeDcdnWafScenesRequest, Builder> {
        private String defenseScenes; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnWafScenesRequest request) {
            super(request);
            this.defenseScenes = request.defenseScenes;
        } 

        /**
         * <p>The types of the protection policies that you want to query. Separate multiple types with commas (,). Valid values:</p>
         * <ul>
         * <li>waf_group: basic web protection</li>
         * <li>custom_acl: custom protection</li>
         * <li>whitelist: IP address whitelist</li>
         * <li>ip_blacklist: IP address blacklist</li>
         * <li>region_block: region blacklist</li>
         * <li>bot: bot management</li>
         * </ul>
         * <blockquote>
         * <p>If you do not set this parameter, all types of protection policies are queried.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>waf_group,custom_acl,whitelist</p>
         */
        public Builder defenseScenes(String defenseScenes) {
            this.putQueryParameter("DefenseScenes", defenseScenes);
            this.defenseScenes = defenseScenes;
            return this;
        }

        @Override
        public DescribeDcdnWafScenesRequest build() {
            return new DescribeDcdnWafScenesRequest(this);
        } 

    } 

}
