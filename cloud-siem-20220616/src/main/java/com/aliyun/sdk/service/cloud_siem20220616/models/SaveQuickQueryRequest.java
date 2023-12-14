// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveQuickQueryRequest} extends {@link RequestModel}
 *
 * <p>SaveQuickQueryRequest</p>
 */
public class SaveQuickQueryRequest extends Request {
    @Body
    @NameInMap("DisplayName")
    @Validation(required = true)
    private String displayName;

    @Body
    @NameInMap("Query")
    @Validation(required = true)
    private String query;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    private SaveQuickQueryRequest(Builder builder) {
        super(builder);
        this.displayName = builder.displayName;
        this.query = builder.query;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveQuickQueryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<SaveQuickQueryRequest, Builder> {
        private String displayName; 
        private String query; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(SaveQuickQueryRequest request) {
            super(request);
            this.displayName = request.displayName;
            this.query = request.query;
            this.regionId = request.regionId;
        } 

        /**
         * The name of the saved search.
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * The query statement.
         */
        public Builder query(String query) {
            this.putBodyParameter("Query", query);
            this.query = query;
            return this;
        }

        /**
         * The data management center of the threat analysis feature. Specify this parameter based on the region where your assets reside. Valid values:
         * <p>
         * 
         * *   cn-hangzhou: Your assets reside in regions in the Chinese mainland or in the China (Hong Kong) region.
         * *   ap-southeast-1: Your assets reside in regions outside the Chinese mainland, excluding the China (Hong Kong) region.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public SaveQuickQueryRequest build() {
            return new SaveQuickQueryRequest(this);
        } 

    } 

}
