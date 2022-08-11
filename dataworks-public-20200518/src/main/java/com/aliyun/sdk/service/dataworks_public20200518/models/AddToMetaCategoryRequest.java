// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddToMetaCategoryRequest} extends {@link RequestModel}
 *
 * <p>AddToMetaCategoryRequest</p>
 */
public class AddToMetaCategoryRequest extends Request {
    @Query
    @NameInMap("CategoryId")
    @Validation(required = true)
    private Long categoryId;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("TableGuid")
    @Validation(required = true)
    private String tableGuid;

    private AddToMetaCategoryRequest(Builder builder) {
        super(builder);
        this.categoryId = builder.categoryId;
        this.regionId = builder.regionId;
        this.tableGuid = builder.tableGuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddToMetaCategoryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return categoryId
     */
    public Long getCategoryId() {
        return this.categoryId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return tableGuid
     */
    public String getTableGuid() {
        return this.tableGuid;
    }

    public static final class Builder extends Request.Builder<AddToMetaCategoryRequest, Builder> {
        private Long categoryId; 
        private String regionId; 
        private String tableGuid; 

        private Builder() {
            super();
        } 

        private Builder(AddToMetaCategoryRequest request) {
            super(request);
            this.categoryId = request.categoryId;
            this.regionId = request.regionId;
            this.tableGuid = request.tableGuid;
        } 

        /**
         * CategoryId.
         */
        public Builder categoryId(Long categoryId) {
            this.putQueryParameter("CategoryId", categoryId);
            this.categoryId = categoryId;
            return this;
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
         * TableGuid.
         */
        public Builder tableGuid(String tableGuid) {
            this.putQueryParameter("TableGuid", tableGuid);
            this.tableGuid = tableGuid;
            return this;
        }

        @Override
        public AddToMetaCategoryRequest build() {
            return new AddToMetaCategoryRequest(this);
        } 

    } 

}
