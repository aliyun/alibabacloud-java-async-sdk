// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetSnapshotLinkRequest} extends {@link RequestModel}
 *
 * <p>GetSnapshotLinkRequest</p>
 */
public class GetSnapshotLinkRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LinkId")
    private String linkId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private GetSnapshotLinkRequest(Builder builder) {
        super(builder);
        this.linkId = builder.linkId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSnapshotLinkRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return linkId
     */
    public String getLinkId() {
        return this.linkId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetSnapshotLinkRequest, Builder> {
        private String linkId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetSnapshotLinkRequest request) {
            super(request);
            this.linkId = request.linkId;
            this.regionId = request.regionId;
        } 

        /**
         * LinkId.
         */
        public Builder linkId(String linkId) {
            this.putQueryParameter("LinkId", linkId);
            this.linkId = linkId;
            return this;
        }

        /**
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
        public GetSnapshotLinkRequest build() {
            return new GetSnapshotLinkRequest(this);
        } 

    } 

}
