// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.httpdns20160201.models;

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
 * {@link SdnsSwitchRuleCategoryRequest} extends {@link RequestModel}
 *
 * <p>SdnsSwitchRuleCategoryRequest</p>
 */
public class SdnsSwitchRuleCategoryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enable")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean enable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    private SdnsSwitchRuleCategoryRequest(Builder builder) {
        super(builder);
        this.enable = builder.enable;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SdnsSwitchRuleCategoryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<SdnsSwitchRuleCategoryRequest, Builder> {
        private Boolean enable; 
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(SdnsSwitchRuleCategoryRequest request) {
            super(request);
            this.enable = request.enable;
            this.id = request.id;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder enable(Boolean enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public SdnsSwitchRuleCategoryRequest build() {
            return new SdnsSwitchRuleCategoryRequest(this);
        } 

    } 

}
