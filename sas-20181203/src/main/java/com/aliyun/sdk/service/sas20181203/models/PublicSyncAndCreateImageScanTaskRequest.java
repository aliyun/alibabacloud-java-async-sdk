// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublicSyncAndCreateImageScanTaskRequest} extends {@link RequestModel}
 *
 * <p>PublicSyncAndCreateImageScanTaskRequest</p>
 */
public class PublicSyncAndCreateImageScanTaskRequest extends Request {
    @Query
    @NameInMap("Images")
    @Validation(required = true)
    private String images;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    private PublicSyncAndCreateImageScanTaskRequest(Builder builder) {
        super(builder);
        this.images = builder.images;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublicSyncAndCreateImageScanTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return images
     */
    public String getImages() {
        return this.images;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<PublicSyncAndCreateImageScanTaskRequest, Builder> {
        private String images; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(PublicSyncAndCreateImageScanTaskRequest request) {
            super(request);
            this.images = request.images;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * Images.
         */
        public Builder images(String images) {
            this.putQueryParameter("Images", images);
            this.images = images;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public PublicSyncAndCreateImageScanTaskRequest build() {
            return new PublicSyncAndCreateImageScanTaskRequest(this);
        } 

    } 

}
