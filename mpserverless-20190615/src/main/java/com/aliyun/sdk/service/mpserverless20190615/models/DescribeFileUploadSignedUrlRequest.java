// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFileUploadSignedUrlRequest} extends {@link RequestModel}
 *
 * <p>DescribeFileUploadSignedUrlRequest</p>
 */
public class DescribeFileUploadSignedUrlRequest extends Request {
    @Body
    @NameInMap("ContentType")
    @Validation(required = true)
    private String contentType;

    @Body
    @NameInMap("Filename")
    @Validation(required = true)
    private String filename;

    @Body
    @NameInMap("Size")
    @Validation(required = true)
    private Long size;

    @Body
    @NameInMap("SpaceId")
    @Validation(required = true)
    private String spaceId;

    private DescribeFileUploadSignedUrlRequest(Builder builder) {
        super(builder);
        this.contentType = builder.contentType;
        this.filename = builder.filename;
        this.size = builder.size;
        this.spaceId = builder.spaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFileUploadSignedUrlRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contentType
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * @return filename
     */
    public String getFilename() {
        return this.filename;
    }

    /**
     * @return size
     */
    public Long getSize() {
        return this.size;
    }

    /**
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    public static final class Builder extends Request.Builder<DescribeFileUploadSignedUrlRequest, Builder> {
        private String contentType; 
        private String filename; 
        private Long size; 
        private String spaceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFileUploadSignedUrlRequest request) {
            super(request);
            this.contentType = request.contentType;
            this.filename = request.filename;
            this.size = request.size;
            this.spaceId = request.spaceId;
        } 

        /**
         * ContentType.
         */
        public Builder contentType(String contentType) {
            this.putBodyParameter("ContentType", contentType);
            this.contentType = contentType;
            return this;
        }

        /**
         * Filename.
         */
        public Builder filename(String filename) {
            this.putBodyParameter("Filename", filename);
            this.filename = filename;
            return this;
        }

        /**
         * Size.
         */
        public Builder size(Long size) {
            this.putBodyParameter("Size", size);
            this.size = size;
            return this;
        }

        /**
         * SpaceId.
         */
        public Builder spaceId(String spaceId) {
            this.putBodyParameter("SpaceId", spaceId);
            this.spaceId = spaceId;
            return this;
        }

        @Override
        public DescribeFileUploadSignedUrlRequest build() {
            return new DescribeFileUploadSignedUrlRequest(this);
        } 

    } 

}
