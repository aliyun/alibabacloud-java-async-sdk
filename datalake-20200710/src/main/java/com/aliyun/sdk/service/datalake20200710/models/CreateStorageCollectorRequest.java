// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateStorageCollectorRequest} extends {@link RequestModel}
 *
 * <p>CreateStorageCollectorRequest</p>
 */
public class CreateStorageCollectorRequest extends Request {
    @Query
    @NameInMap("DatasourceType")
    @Validation(required = true)
    private String datasourceType;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private CreateStorageCollectorRequest(Builder builder) {
        super(builder);
        this.datasourceType = builder.datasourceType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateStorageCollectorRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return datasourceType
     */
    public String getDatasourceType() {
        return this.datasourceType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateStorageCollectorRequest, Builder> {
        private String datasourceType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateStorageCollectorRequest response) {
            super(response);
            this.datasourceType = response.datasourceType;
            this.regionId = response.regionId;
        } 

        /**
         * 数据源类型
         */
        public Builder datasourceType(String datasourceType) {
            this.putQueryParameter("DatasourceType", datasourceType);
            this.datasourceType = datasourceType;
            return this;
        }

        /**
         * RegionId
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateStorageCollectorRequest build() {
            return new CreateStorageCollectorRequest(this);
        } 

    } 

}
