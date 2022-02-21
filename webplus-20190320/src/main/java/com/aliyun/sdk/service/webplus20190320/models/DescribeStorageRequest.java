// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeStorageRequest} extends {@link RequestModel}
 *
 * <p>DescribeStorageRequest</p>
 */
public class DescribeStorageRequest extends Request {
    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("UsingSharedStorage")
    private Boolean usingSharedStorage;

    private DescribeStorageRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.usingSharedStorage = builder.usingSharedStorage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStorageRequest create() {
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
     * @return usingSharedStorage
     */
    public Boolean getUsingSharedStorage() {
        return this.usingSharedStorage;
    }

    public static final class Builder extends Request.Builder<DescribeStorageRequest, Builder> {
        private String regionId; 
        private Boolean usingSharedStorage; 

        private Builder() {
            super();
        } 

        private Builder(DescribeStorageRequest response) {
            super(response);
            this.regionId = response.regionId;
            this.usingSharedStorage = response.usingSharedStorage;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * UsingSharedStorage.
         */
        public Builder usingSharedStorage(Boolean usingSharedStorage) {
            this.putQueryParameter("UsingSharedStorage", usingSharedStorage);
            this.usingSharedStorage = usingSharedStorage;
            return this;
        }

        @Override
        public DescribeStorageRequest build() {
            return new DescribeStorageRequest(this);
        } 

    } 

}
