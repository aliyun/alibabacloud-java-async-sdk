// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link SearchSimilarImageClustersRequest} extends {@link RequestModel}
 *
 * <p>SearchSimilarImageClustersRequest</p>
 */
public class SearchSimilarImageClustersRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("drive_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String driveId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("image_thumbnail_process")
    @Deprecated
    private String imageThumbnailProcess;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("limit")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Long limit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("marker")
    private String marker;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("order")
    private String order;

    private SearchSimilarImageClustersRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.driveId = builder.driveId;
        this.imageThumbnailProcess = builder.imageThumbnailProcess;
        this.limit = builder.limit;
        this.marker = builder.marker;
        this.order = builder.order;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchSimilarImageClustersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return driveId
     */
    public String getDriveId() {
        return this.driveId;
    }

    /**
     * @return imageThumbnailProcess
     */
    public String getImageThumbnailProcess() {
        return this.imageThumbnailProcess;
    }

    /**
     * @return limit
     */
    public Long getLimit() {
        return this.limit;
    }

    /**
     * @return marker
     */
    public String getMarker() {
        return this.marker;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    public static final class Builder extends Request.Builder<SearchSimilarImageClustersRequest, Builder> {
        private String domainId; 
        private String driveId; 
        private String imageThumbnailProcess; 
        private Long limit; 
        private String marker; 
        private String order; 

        private Builder() {
            super();
        } 

        private Builder(SearchSimilarImageClustersRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.driveId = request.driveId;
            this.imageThumbnailProcess = request.imageThumbnailProcess;
            this.limit = request.limit;
            this.marker = request.marker;
            this.order = request.order;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder domainId(String domainId) {
            this.putHostParameter("domain_id", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder driveId(String driveId) {
            this.putBodyParameter("drive_id", driveId);
            this.driveId = driveId;
            return this;
        }

        /**
         * image_thumbnail_process.
         */
        public Builder imageThumbnailProcess(String imageThumbnailProcess) {
            this.putBodyParameter("image_thumbnail_process", imageThumbnailProcess);
            this.imageThumbnailProcess = imageThumbnailProcess;
            return this;
        }

        /**
         * limit.
         */
        public Builder limit(Long limit) {
            this.putBodyParameter("limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * marker.
         */
        public Builder marker(String marker) {
            this.putBodyParameter("marker", marker);
            this.marker = marker;
            return this;
        }

        /**
         * order.
         */
        public Builder order(String order) {
            this.putBodyParameter("order", order);
            this.order = order;
            return this;
        }

        @Override
        public SearchSimilarImageClustersRequest build() {
            return new SearchSimilarImageClustersRequest(this);
        } 

    } 

}
