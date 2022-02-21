// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRealTimeLocationByModelRequest} extends {@link RequestModel}
 *
 * <p>ListRealTimeLocationByModelRequest</p>
 */
public class ListRealTimeLocationByModelRequest extends Request {
    @Query
    @NameInMap("BrandId")
    private Long brandId;

    @Query
    @NameInMap("ModelId")
    private Long modelId;

    @Query
    @NameInMap("Offset")
    private Integer offset;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Size")
    private Integer size;

    private ListRealTimeLocationByModelRequest(Builder builder) {
        super(builder);
        this.brandId = builder.brandId;
        this.modelId = builder.modelId;
        this.offset = builder.offset;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRealTimeLocationByModelRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return brandId
     */
    public Long getBrandId() {
        return this.brandId;
    }

    /**
     * @return modelId
     */
    public Long getModelId() {
        return this.modelId;
    }

    /**
     * @return offset
     */
    public Integer getOffset() {
        return this.offset;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    public static final class Builder extends Request.Builder<ListRealTimeLocationByModelRequest, Builder> {
        private Long brandId; 
        private Long modelId; 
        private Integer offset; 
        private String projectId; 
        private String regionId; 
        private Integer size; 

        private Builder() {
            super();
        } 

        private Builder(ListRealTimeLocationByModelRequest response) {
            super(response);
            this.brandId = response.brandId;
            this.modelId = response.modelId;
            this.offset = response.offset;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
            this.size = response.size;
        } 

        /**
         * BrandId.
         */
        public Builder brandId(Long brandId) {
            this.putQueryParameter("BrandId", brandId);
            this.brandId = brandId;
            return this;
        }

        /**
         * ModelId.
         */
        public Builder modelId(Long modelId) {
            this.putQueryParameter("ModelId", modelId);
            this.modelId = modelId;
            return this;
        }

        /**
         * Offset.
         */
        public Builder offset(Integer offset) {
            this.putQueryParameter("Offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
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
         * Size.
         */
        public Builder size(Integer size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        @Override
        public ListRealTimeLocationByModelRequest build() {
            return new ListRealTimeLocationByModelRequest(this);
        } 

    } 

}
