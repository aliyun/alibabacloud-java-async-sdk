// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableUserConfigRequest} extends {@link RequestModel}
 *
 * <p>DisableUserConfigRequest</p>
 */
public class DisableUserConfigRequest extends Request {
    @Query
    @NameInMap("Code")
    private String code;

    @Query
    @NameInMap("FeatureType")
    private Integer featureType;

    @Query
    @NameInMap("Lang")
    private String lang;

    private DisableUserConfigRequest(Builder builder) {
        super(builder);
        this.code = builder.code;
        this.featureType = builder.featureType;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableUserConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return featureType
     */
    public Integer getFeatureType() {
        return this.featureType;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<DisableUserConfigRequest, Builder> {
        private String code; 
        private Integer featureType; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(DisableUserConfigRequest request) {
            super(request);
            this.code = request.code;
            this.featureType = request.featureType;
            this.lang = request.lang;
        } 

        /**
         * The code of the configuration item. You can call the [DescribeConfigs](~~DescribeConfigs~~) operation to obtain the code of the configuration item.
         */
        public Builder code(String code) {
            this.putQueryParameter("Code", code);
            this.code = code;
            return this;
        }

        /**
         * This parameter is deprecated.
         */
        public Builder featureType(Integer featureType) {
            this.putQueryParameter("FeatureType", featureType);
            this.featureType = featureType;
            return this;
        }

        /**
         * The language of the content within the request and response. Valid values:
         * <p>
         * 
         * *   **zh_cn**: Chinese (default)
         * *   **en_us**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        @Override
        public DisableUserConfigRequest build() {
            return new DisableUserConfigRequest(this);
        } 

    } 

}
