// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.foasconsole20211028.models;

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
 * {@link ModifyAiServiceProtectionRequest} extends {@link RequestModel}
 *
 * <p>ModifyAiServiceProtectionRequest</p>
 */
public class ModifyAiServiceProtectionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeletionProtection")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean deletionProtection;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Region")
    @com.aliyun.core.annotation.Validation(required = true)
    private String region;

    private ModifyAiServiceProtectionRequest(Builder builder) {
        super(builder);
        this.deletionProtection = builder.deletionProtection;
        this.region = builder.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAiServiceProtectionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deletionProtection
     */
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    public static final class Builder extends Request.Builder<ModifyAiServiceProtectionRequest, Builder> {
        private Boolean deletionProtection; 
        private String region; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAiServiceProtectionRequest request) {
            super(request);
            this.deletionProtection = request.deletionProtection;
            this.region = request.region;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder deletionProtection(Boolean deletionProtection) {
            this.putBodyParameter("DeletionProtection", deletionProtection);
            this.deletionProtection = deletionProtection;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder region(String region) {
            this.putBodyParameter("Region", region);
            this.region = region;
            return this;
        }

        @Override
        public ModifyAiServiceProtectionRequest build() {
            return new ModifyAiServiceProtectionRequest(this);
        } 

    } 

}
