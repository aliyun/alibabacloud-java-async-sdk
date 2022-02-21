// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWatermarkRequest} extends {@link RequestModel}
 *
 * <p>GetWatermarkRequest</p>
 */
public class GetWatermarkRequest extends Request {
    @Query
    @NameInMap("WatermarkId")
    @Validation(required = true)
    private String watermarkId;

    private GetWatermarkRequest(Builder builder) {
        super(builder);
        this.watermarkId = builder.watermarkId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWatermarkRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return watermarkId
     */
    public String getWatermarkId() {
        return this.watermarkId;
    }

    public static final class Builder extends Request.Builder<GetWatermarkRequest, Builder> {
        private String watermarkId; 

        private Builder() {
            super();
        } 

        private Builder(GetWatermarkRequest response) {
            super(response);
            this.watermarkId = response.watermarkId;
        } 

        /**
         * WatermarkId.
         */
        public Builder watermarkId(String watermarkId) {
            this.putQueryParameter("WatermarkId", watermarkId);
            this.watermarkId = watermarkId;
            return this;
        }

        @Override
        public GetWatermarkRequest build() {
            return new GetWatermarkRequest(this);
        } 

    } 

}
