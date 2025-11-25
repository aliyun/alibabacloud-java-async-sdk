// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link ModifyResourceTypeAutoEnableRequest} extends {@link RequestModel}
 *
 * <p>ModifyResourceTypeAutoEnableRequest</p>
 */
public class ModifyResourceTypeAutoEnableRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceTypeAutoEnable")
    private String resourceTypeAutoEnable;

    private ModifyResourceTypeAutoEnableRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.resourceTypeAutoEnable = builder.resourceTypeAutoEnable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyResourceTypeAutoEnableRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return resourceTypeAutoEnable
     */
    public String getResourceTypeAutoEnable() {
        return this.resourceTypeAutoEnable;
    }

    public static final class Builder extends Request.Builder<ModifyResourceTypeAutoEnableRequest, Builder> {
        private String lang; 
        private String resourceTypeAutoEnable; 

        private Builder() {
            super();
        } 

        private Builder(ModifyResourceTypeAutoEnableRequest request) {
            super(request);
            this.lang = request.lang;
            this.resourceTypeAutoEnable = request.resourceTypeAutoEnable;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * ResourceTypeAutoEnable.
         */
        public Builder resourceTypeAutoEnable(String resourceTypeAutoEnable) {
            this.putQueryParameter("ResourceTypeAutoEnable", resourceTypeAutoEnable);
            this.resourceTypeAutoEnable = resourceTypeAutoEnable;
            return this;
        }

        @Override
        public ModifyResourceTypeAutoEnableRequest build() {
            return new ModifyResourceTypeAutoEnableRequest(this);
        } 

    } 

}
