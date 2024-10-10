// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The information about the images. The value of this parameter is in the JSON format and contains the following fields:</p>
         * <ul>
         * <li><p><strong>RegistryType</strong>: the type of the image repository. Valid values:</p>
         * <ul>
         * <li>acr</li>
         * <li>harbor</li>
         * <li>quay</li>
         * </ul>
         * </li>
         * <li><p><strong>RepoId</strong>: the ID of the image repository.</p>
         * </li>
         * <li><p><strong>InstanceId</strong>: the ID of the Container Registry instance to which the image repository belongs.</p>
         * </li>
         * <li><p><strong>RepoNamespace</strong>: the namespace to which the image repository belongs.</p>
         * </li>
         * <li><p><strong>RegionId</strong>: the region ID of the image.</p>
         * </li>
         * <li><p><strong>RepoName</strong>: the name of the image repository.</p>
         * </li>
         * <li><p><strong>Digest</strong>: the digest of the image.</p>
         * </li>
         * <li><p><strong>Tag</strong>: the tag that is added to the image.</p>
         * </li>
         * <li><p><strong>CreateTime</strong>: the timestamp when the image was created. Unit: milliseconds.</p>
         * </li>
         * <li><p><strong>UpdateTime</strong>: the timestamp when the image was updated. Unit: milliseconds.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;registryType&quot;:&quot;acr&quot;,&quot;repoId&quot;:&quot;crr-red9kgqqi0fh75d5&quot;,&quot;instanceId&quot;:&quot;cri-1x2qtjd75ofqvfa8&quot;,&quot;repoNamespace&quot;:&quot;1125&quot;,&quot;regionId&quot;:&quot;cn-hangzhou&quot;,&quot;repoName&quot;:&quot;script1&quot;,&quot;digest&quot;:&quot;b1064a5007786b6f82a50772858e8156bc1e5fbddb7dd20af6922761ad197fe4&quot;,&quot;tag&quot;:&quot;v0113-ver2&quot;,&quot;createTime&quot;:1641267666666,&quot;updateTime&quot;:1641267909090}]</p>
         */
        public Builder images(String images) {
            this.putQueryParameter("Images", images);
            this.images = images;
            return this;
        }

        /**
         * <p>The source IP address of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.X.X</p>
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
