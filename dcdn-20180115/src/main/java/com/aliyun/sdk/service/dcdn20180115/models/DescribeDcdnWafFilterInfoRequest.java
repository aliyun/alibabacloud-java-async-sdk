// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnWafFilterInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnWafFilterInfoRequest</p>
 */
public class DescribeDcdnWafFilterInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefenseScenes")
    private String defenseScenes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The type of the protection policy. Separate multiple types with commas (,). Valid values:</p>
         * <ul>
         * <li>waf_group: basic web protection</li>
         * <li>custom_acl: custom protection</li>
         * <li>whitelist: IP address whitelist</li>
         * </ul>
         * <blockquote>
         * <p>If you do not specify this parameter, all types are returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>custom_acl</p>
         */
        public Builder defenseScenes(String defenseScenes) {
            this.putQueryParameter("DefenseScenes", defenseScenes);
            this.defenseScenes = defenseScenes;
            return this;
        }

        /**
         * <p>The language of the returned information. Valid values:</p>
         * <ul>
         * <li>en: English</li>
         * <li>cn: Simplified Chinese</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn</p>
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
