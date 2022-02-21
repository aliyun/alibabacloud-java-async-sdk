// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePerspectiveRequest} extends {@link RequestModel}
 *
 * <p>DescribePerspectiveRequest</p>
 */
public class DescribePerspectiveRequest extends Request {
    @Query
    @NameInMap("PerspectiveId")
    @Validation(required = true)
    private String perspectiveId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DescribePerspectiveRequest(Builder builder) {
        super(builder);
        this.perspectiveId = builder.perspectiveId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePerspectiveRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return perspectiveId
     */
    public String getPerspectiveId() {
        return this.perspectiveId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribePerspectiveRequest, Builder> {
        private String perspectiveId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribePerspectiveRequest response) {
            super(response);
            this.perspectiveId = response.perspectiveId;
            this.regionId = response.regionId;
        } 

        /**
         * PerspectiveId.
         */
        public Builder perspectiveId(String perspectiveId) {
            this.putQueryParameter("PerspectiveId", perspectiveId);
            this.perspectiveId = perspectiveId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribePerspectiveRequest build() {
            return new DescribePerspectiveRequest(this);
        } 

    } 

}
