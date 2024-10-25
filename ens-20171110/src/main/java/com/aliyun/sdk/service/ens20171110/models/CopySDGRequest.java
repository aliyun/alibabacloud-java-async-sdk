// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CopySDGRequest} extends {@link RequestModel}
 *
 * <p>CopySDGRequest</p>
 */
public class CopySDGRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationRegionIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > destinationRegionIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SDGId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String SDGId;

    private CopySDGRequest(Builder builder) {
        super(builder);
        this.destinationRegionIds = builder.destinationRegionIds;
        this.SDGId = builder.SDGId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CopySDGRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return destinationRegionIds
     */
    public java.util.List < String > getDestinationRegionIds() {
        return this.destinationRegionIds;
    }

    /**
     * @return SDGId
     */
    public String getSDGId() {
        return this.SDGId;
    }

    public static final class Builder extends Request.Builder<CopySDGRequest, Builder> {
        private java.util.List < String > destinationRegionIds; 
        private String SDGId; 

        private Builder() {
            super();
        } 

        private Builder(CopySDGRequest request) {
            super(request);
            this.destinationRegionIds = request.destinationRegionIds;
            this.SDGId = request.SDGId;
        } 

        /**
         * <p>The destination nodes.</p>
         * <p>This parameter is required.</p>
         */
        public Builder destinationRegionIds(java.util.List < String > destinationRegionIds) {
            String destinationRegionIdsShrink = shrink(destinationRegionIds, "DestinationRegionIds", "json");
            this.putQueryParameter("DestinationRegionIds", destinationRegionIdsShrink);
            this.destinationRegionIds = destinationRegionIds;
            return this;
        }

        /**
         * <p>The ID of the SDG that you want to copy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sdg-xxx</p>
         */
        public Builder SDGId(String SDGId) {
            this.putQueryParameter("SDGId", SDGId);
            this.SDGId = SDGId;
            return this;
        }

        @Override
        public CopySDGRequest build() {
            return new CopySDGRequest(this);
        } 

    } 

}
