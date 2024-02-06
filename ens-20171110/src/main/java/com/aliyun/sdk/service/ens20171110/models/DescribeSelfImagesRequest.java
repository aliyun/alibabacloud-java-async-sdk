// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSelfImagesRequest} extends {@link RequestModel}
 *
 * <p>DescribeSelfImagesRequest</p>
 */
public class DescribeSelfImagesRequest extends Request {
    @Query
    @NameInMap("ImageId")
    private String imageId;

    @Query
    @NameInMap("ImageName")
    private String imageName;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("SnapshotId")
    private String snapshotId;

    private DescribeSelfImagesRequest(Builder builder) {
        super(builder);
        this.imageId = builder.imageId;
        this.imageName = builder.imageName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.snapshotId = builder.snapshotId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSelfImagesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return imageName
     */
    public String getImageName() {
        return this.imageName;
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
     * @return snapshotId
     */
    public String getSnapshotId() {
        return this.snapshotId;
    }

    public static final class Builder extends Request.Builder<DescribeSelfImagesRequest, Builder> {
        private String imageId; 
        private String imageName; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String snapshotId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSelfImagesRequest request) {
            super(request);
            this.imageId = request.imageId;
            this.imageName = request.imageName;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.snapshotId = request.snapshotId;
        } 

        /**
         * The ID of the image. Fuzzy search is supported.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * The name of the image. Fuzzy search is supported.
         */
        public Builder imageName(String imageName) {
            this.putQueryParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * The page number to return. Pages start from page **1**. Default value: **1**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         * <p>
         * 
         * Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the snapshot.
         */
        public Builder snapshotId(String snapshotId) {
            this.putQueryParameter("SnapshotId", snapshotId);
            this.snapshotId = snapshotId;
            return this;
        }

        @Override
        public DescribeSelfImagesRequest build() {
            return new DescribeSelfImagesRequest(this);
        } 

    } 

}
