// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnWafFilterInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnWafFilterInfoRequest</p>
 */
public class DescribeDcdnWafFilterInfoRequest extends Request {
    @Query
    @NameInMap("DefenseScenes")
    private String defenseScenes;

    @Query
    @NameInMap("Language")
    @Validation(required = true)
    private String language;

    private DescribeDcdnWafFilterInfoRequest(Builder builder) {
        super(builder);
        this.defenseScenes = builder.defenseScenes;
        this.language = builder.language;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnWafFilterInfoRequest create() {
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

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    public static final class Builder extends Request.Builder<DescribeDcdnWafFilterInfoRequest, Builder> {
        private String defenseScenes; 
        private String language; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnWafFilterInfoRequest request) {
            super(request);
            this.defenseScenes = request.defenseScenes;
            this.language = request.language;
        } 

        /**
         * The type of the protection policy. Separate multiple types with commas (,). Valid values:
         * <p>
         * 
         * *   waf_group: basic web protection
         * *   custom_acl: custom protection
         * *   whitelist: IP address whitelist
         * 
         * >If you do not specify this parameter, all types are returned.
         */
        public Builder defenseScenes(String defenseScenes) {
            this.putQueryParameter("DefenseScenes", defenseScenes);
            this.defenseScenes = defenseScenes;
            return this;
        }

        /**
         * The language of the returned information. Valid values:
         * <p>
         * 
         * *   en: English
         * *   cn: Simplified Chinese
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        @Override
        public DescribeDcdnWafFilterInfoRequest build() {
            return new DescribeDcdnWafFilterInfoRequest(this);
        } 

    } 

}
