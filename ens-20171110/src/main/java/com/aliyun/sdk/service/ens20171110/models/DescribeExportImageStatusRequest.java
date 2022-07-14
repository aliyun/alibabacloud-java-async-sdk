// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExportImageStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeExportImageStatusRequest</p>
 */
public class DescribeExportImageStatusRequest extends Request {
    @Query
    @NameInMap("ImageId")
    @Validation(required = true)
    private String imageId;

    @Query
    @NameInMap("Version")
    @Validation(required = true)
    private String version;

    private DescribeExportImageStatusRequest(Builder builder) {
        super(builder);
        this.imageId = builder.imageId;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExportImageStatusRequest create() {
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
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<DescribeExportImageStatusRequest, Builder> {
        private String imageId; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(DescribeExportImageStatusRequest request) {
            super(request);
            this.imageId = request.imageId;
            this.version = request.version;
        } 

        /**
         * ImageId.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * Version.
         */
        public Builder version(String version) {
            this.putQueryParameter("Version", version);
            this.version = version;
            return this;
        }

        @Override
        public DescribeExportImageStatusRequest build() {
            return new DescribeExportImageStatusRequest(this);
        } 

    } 

}
