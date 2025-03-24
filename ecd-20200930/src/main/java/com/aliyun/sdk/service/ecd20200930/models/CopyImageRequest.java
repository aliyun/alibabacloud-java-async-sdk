// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link CopyImageRequest} extends {@link RequestModel}
 *
 * <p>CopyImageRequest</p>
 */
public class CopyImageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationDescription")
    private String destinationDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationImageName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String destinationImageName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String destinationRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private CopyImageRequest(Builder builder) {
        super(builder);
        this.destinationDescription = builder.destinationDescription;
        this.destinationImageName = builder.destinationImageName;
        this.destinationRegionId = builder.destinationRegionId;
        this.imageId = builder.imageId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CopyImageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return destinationDescription
     */
    public String getDestinationDescription() {
        return this.destinationDescription;
    }

    /**
     * @return destinationImageName
     */
    public String getDestinationImageName() {
        return this.destinationImageName;
    }

    /**
     * @return destinationRegionId
     */
    public String getDestinationRegionId() {
        return this.destinationRegionId;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CopyImageRequest, Builder> {
        private String destinationDescription; 
        private String destinationImageName; 
        private String destinationRegionId; 
        private String imageId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CopyImageRequest request) {
            super(request);
            this.destinationDescription = request.destinationDescription;
            this.destinationImageName = request.destinationImageName;
            this.destinationRegionId = request.destinationRegionId;
            this.imageId = request.imageId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The description of the new image in the destination region. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a test.</p>
         */
        public Builder destinationDescription(String destinationDescription) {
            this.putQueryParameter("DestinationDescription", destinationDescription);
            this.destinationDescription = destinationDescription;
            return this;
        }

        /**
         * <p>The name of the new image. The name must be 2 to 128 characters in length. The name must start with a letter but cannot start with <code>http://</code> or <code>https://</code>. The name can contain letters, digits, colons (:), underscores (_), and hyphens (-).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Office_Shanghai</p>
         */
        public Builder destinationImageName(String destinationImageName) {
            this.putQueryParameter("DestinationImageName", destinationImageName);
            this.destinationImageName = destinationImageName;
            return this;
        }

        /**
         * <p>The ID of the destination region. The ID must be different from the current region ID of the image. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
         */
        public Builder destinationRegionId(String destinationRegionId) {
            this.putQueryParameter("DestinationRegionId", destinationRegionId);
            this.destinationRegionId = destinationRegionId;
            return this;
        }

        /**
         * <p>The ID of the image that is copied to the destination region.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>m-gx2x1dhsmusr2****</p>
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CopyImageRequest build() {
            return new CopyImageRequest(this);
        } 

    } 

}
