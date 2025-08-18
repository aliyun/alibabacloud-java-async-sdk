// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

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
 * {@link UpdateGlobalEventsStorageRegionRequest} extends {@link RequestModel}
 *
 * <p>UpdateGlobalEventsStorageRegionRequest</p>
 */
public class UpdateGlobalEventsStorageRegionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageRegion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String storageRegion;

    private UpdateGlobalEventsStorageRegionRequest(Builder builder) {
        super(builder);
        this.storageRegion = builder.storageRegion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGlobalEventsStorageRegionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return storageRegion
     */
    public String getStorageRegion() {
        return this.storageRegion;
    }

    public static final class Builder extends Request.Builder<UpdateGlobalEventsStorageRegionRequest, Builder> {
        private String storageRegion; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGlobalEventsStorageRegionRequest request) {
            super(request);
            this.storageRegion = request.storageRegion;
        } 

        /**
         * <p>The region where you want to store global events.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>ap-southeast-1</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <p>the Singapore region</p>
         * <!-- -->
         * </li>
         * <li><p>cn-hangzhou</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <p>the China (Hangzhou) region</p>
         * <!-- --></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-southeast-1</p>
         */
        public Builder storageRegion(String storageRegion) {
            this.putQueryParameter("StorageRegion", storageRegion);
            this.storageRegion = storageRegion;
            return this;
        }

        @Override
        public UpdateGlobalEventsStorageRegionRequest build() {
            return new UpdateGlobalEventsStorageRegionRequest(this);
        } 

    } 

}
