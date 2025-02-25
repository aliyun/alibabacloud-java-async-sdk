// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link DeleteCategoryRequest} extends {@link RequestModel}
 *
 * <p>DeleteCategoryRequest</p>
 */
public class DeleteCategoryRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long cateId;

    private DeleteCategoryRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.cateId = builder.cateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCategoryRequest create() {
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
     * @return cateId
     */
    public Long getCateId() {
        return this.cateId;
    }

    public static final class Builder extends Request.Builder<DeleteCategoryRequest, Builder> {
        private String regionId; 
        private Long cateId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCategoryRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.cateId = request.cateId;
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
         * <p>The category ID. You can use one of the following methods to obtain the ID:</p>
         * <ul>
         * <li>Log on to the <a href="https://ims.console.aliyun.com">Intelligent Media Services (IMS) console</a> and choose <strong>Media Asset Management</strong> &gt; <strong>Category Management</strong> to view the category ID.</li>
         * <li>View the value of CateId returned by the AddCategory operation that you called to create a category.</li>
         * <li>View the value of CateId returned by the GetCategories operation that you called to query a category.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>46</p>
         */
        public Builder cateId(Long cateId) {
            this.putQueryParameter("CateId", cateId);
            this.cateId = cateId;
            return this;
        }

        @Override
        public DeleteCategoryRequest build() {
            return new DeleteCategoryRequest(this);
        } 

    } 

}
