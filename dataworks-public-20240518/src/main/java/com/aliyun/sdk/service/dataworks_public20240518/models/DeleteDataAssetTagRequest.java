// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link DeleteDataAssetTagRequest} extends {@link RequestModel}
 *
 * <p>DeleteDataAssetTagRequest</p>
 */
public class DeleteDataAssetTagRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Key")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 1)
    private String key;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Values")
    private java.util.List<String> values;

    private DeleteDataAssetTagRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.key = builder.key;
        this.values = builder.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDataAssetTagRequest create() {
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
     * @return values
     */
    public java.util.List<String> getValues() {
        return this.values;
    }

    public static final class Builder extends Request.Builder<DeleteDataAssetTagRequest, Builder> {
        private String regionId; 
        private String key; 
        private java.util.List<String> values; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDataAssetTagRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.key = request.key;
            this.values = request.values;
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
         * <p>The tag key.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        public Builder key(String key) {
            this.putQueryParameter("Key", key);
            this.key = key;
            return this;
        }

        /**
         * <p>The tag values.</p>
         */
        public Builder values(java.util.List<String> values) {
            String valuesShrink = shrink(values, "Values", "json");
            this.putQueryParameter("Values", valuesShrink);
            this.values = values;
            return this;
        }

        @Override
        public DeleteDataAssetTagRequest build() {
            return new DeleteDataAssetTagRequest(this);
        } 

    } 

}
