// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetScanNumRequest} extends {@link RequestModel}
 *
 * <p>GetScanNumRequest</p>
 */
public class GetScanNumRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Buckets")
    private String buckets;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaType")
    private Integer mediaType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private GetScanNumRequest(Builder builder) {
        super(builder);
        this.buckets = builder.buckets;
        this.mediaType = builder.mediaType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetScanNumRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return buckets
     */
    public String getBuckets() {
        return this.buckets;
    }

    /**
     * @return mediaType
     */
    public Integer getMediaType() {
        return this.mediaType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetScanNumRequest, Builder> {
        private String buckets; 
        private Integer mediaType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetScanNumRequest request) {
            super(request);
            this.buckets = request.buckets;
            this.mediaType = request.mediaType;
            this.regionId = request.regionId;
        } 

        /**
         * Buckets.
         */
        public Builder buckets(String buckets) {
            this.putQueryParameter("Buckets", buckets);
            this.buckets = buckets;
            return this;
        }

        /**
         * MediaType.
         */
        public Builder mediaType(Integer mediaType) {
            this.putQueryParameter("MediaType", mediaType);
            this.mediaType = mediaType;
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

        @Override
        public GetScanNumRequest build() {
            return new GetScanNumRequest(this);
        } 

    } 

}
