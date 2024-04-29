// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublicSyncAndCreateImageScanTaskRequest} extends {@link RequestModel}
 *
 * <p>PublicSyncAndCreateImageScanTaskRequest</p>
 */
public class PublicSyncAndCreateImageScanTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Images")
    @com.aliyun.core.annotation.Validation(required = true)
    private String images;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
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
         * The information about the images. The value of this parameter is in the JSON format and contains the following fields:
         * <p>
         * 
         * *   **RegistryType**: the type of the image repository. Valid values:
         * 
         *     *   acr
         *     *   harbor
         *     *   quay
         * 
         * *   **RepoId**: the ID of the image repository.
         * 
         * *   **InstanceId**: the ID of the Container Registry instance to which the image repository belongs.
         * 
         * *   **RepoNamespace**: the namespace to which the image repository belongs.
         * 
         * *   **RegionId**: the region ID of the image.
         * 
         * *   **RepoName**: the name of the image repository.
         * 
         * *   **Digest**: the digest of the image.
         * 
         * *   **Tag**: the tag that is added to the image.
         * 
         * *   **CreateTime**: the timestamp when the image was created. Unit: milliseconds.
         * 
         * *   **UpdateTime**: the timestamp when the image was updated. Unit: milliseconds.
         */
        public Builder images(String images) {
            this.putQueryParameter("Images", images);
            this.images = images;
            return this;
        }

        /**
         * The source IP address of the request.
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
