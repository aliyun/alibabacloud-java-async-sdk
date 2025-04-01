// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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
 * {@link ModifyTagNameRequest} extends {@link RequestModel}
 *
 * <p>ModifyTagNameRequest</p>
 */
public class ModifyTagNameRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Key")
    @com.aliyun.core.annotation.Validation(required = true)
    private String key;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NewKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String newKey;

    private ModifyTagNameRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.key = builder.key;
        this.newKey = builder.newKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyTagNameRequest create() {
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
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return newKey
     */
    public String getNewKey() {
        return this.newKey;
    }

    public static final class Builder extends Request.Builder<ModifyTagNameRequest, Builder> {
        private String regionId; 
        private String key; 
        private String newKey; 

        private Builder() {
            super();
        } 

        private Builder(ModifyTagNameRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.key = request.key;
            this.newKey = request.newKey;
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
         * <p>The name of the tag group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Tag group 1</p>
         */
        public Builder key(String key) {
            this.putBodyParameter("Key", key);
            this.key = key;
            return this;
        }

        /**
         * <p>The new name of the tag group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Tag group 2</p>
         */
        public Builder newKey(String newKey) {
            this.putBodyParameter("NewKey", newKey);
            this.newKey = newKey;
            return this;
        }

        @Override
        public ModifyTagNameRequest build() {
            return new ModifyTagNameRequest(this);
        } 

    } 

}
