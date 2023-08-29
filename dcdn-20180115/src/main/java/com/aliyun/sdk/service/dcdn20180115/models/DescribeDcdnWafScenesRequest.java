// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnWafScenesRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnWafScenesRequest</p>
 */
public class DescribeDcdnWafScenesRequest extends Request {
    @Query
    @NameInMap("DefenseScenes")
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
         * The types of the protection policies that you want to query. Separate multiple types with commas (,). Valid values:
         * <p>
         * 
         * *   waf_group: basic web protection
         * *   custom_acl: custom protection
         * *   whitelist: IP address whitelist
         * *   ip_blacklist: IP address blacklist
         * *   region_block: region blacklist
         * *   bot: bot management
         * 
         * > If you do not set this parameter, all types of protection policies are queried.
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
