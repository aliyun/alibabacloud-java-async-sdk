// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCustomImagesRequest} extends {@link RequestModel}
 *
 * <p>ListCustomImagesRequest</p>
 */
public class ListCustomImagesRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DataSnapshotId")
    private String dataSnapshotId;

    @Query
    @NameInMap("ImageIds")
    private String imageIds;

    @Query
    @NameInMap("ImageNames")
    private String imageNames;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("SystemSnapshotId")
    private String systemSnapshotId;

    private ListCustomImagesRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dataSnapshotId = builder.dataSnapshotId;
        this.imageIds = builder.imageIds;
        this.imageNames = builder.imageNames;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.systemSnapshotId = builder.systemSnapshotId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCustomImagesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dataSnapshotId
     */
    public String getDataSnapshotId() {
        return this.dataSnapshotId;
    }

    /**
     * @return imageIds
     */
    public String getImageIds() {
        return this.imageIds;
    }

    /**
     * @return imageNames
     */
    public String getImageNames() {
        return this.imageNames;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return systemSnapshotId
     */
    public String getSystemSnapshotId() {
        return this.systemSnapshotId;
    }

    public static final class Builder extends Request.Builder<ListCustomImagesRequest, Builder> {
        private String clientToken; 
        private String dataSnapshotId; 
        private String imageIds; 
        private String imageNames; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String systemSnapshotId; 

        private Builder() {
            super();
        } 

        private Builder(ListCustomImagesRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dataSnapshotId = request.dataSnapshotId;
            this.imageIds = request.imageIds;
            this.imageNames = request.imageNames;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.systemSnapshotId = request.systemSnapshotId;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DataSnapshotId.
         */
        public Builder dataSnapshotId(String dataSnapshotId) {
            this.putQueryParameter("DataSnapshotId", dataSnapshotId);
            this.dataSnapshotId = dataSnapshotId;
            return this;
        }

        /**
         * ImageIds.
         */
        public Builder imageIds(String imageIds) {
            this.putQueryParameter("ImageIds", imageIds);
            this.imageIds = imageIds;
            return this;
        }

        /**
         * ImageNames.
         */
        public Builder imageNames(String imageNames) {
            this.putQueryParameter("ImageNames", imageNames);
            this.imageNames = imageNames;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
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
         * SystemSnapshotId.
         */
        public Builder systemSnapshotId(String systemSnapshotId) {
            this.putQueryParameter("SystemSnapshotId", systemSnapshotId);
            this.systemSnapshotId = systemSnapshotId;
            return this;
        }

        @Override
        public ListCustomImagesRequest build() {
            return new ListCustomImagesRequest(this);
        } 

    } 

}
