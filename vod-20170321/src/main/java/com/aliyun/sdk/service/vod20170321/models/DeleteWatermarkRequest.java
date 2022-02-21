// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteWatermarkRequest} extends {@link RequestModel}
 *
 * <p>DeleteWatermarkRequest</p>
 */
public class DeleteWatermarkRequest extends Request {
    @Query
    @NameInMap("WatermarkId")
    @Validation(required = true)
    private String watermarkId;

    private DeleteWatermarkRequest(Builder builder) {
        super(builder);
        this.watermarkId = builder.watermarkId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteWatermarkRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteWatermarkRequest, Builder> {
        private String watermarkId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteWatermarkRequest response) {
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
        public DeleteWatermarkRequest build() {
            return new DeleteWatermarkRequest(this);
        } 

    } 

}
