// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDefaultWatermarkRequest} extends {@link RequestModel}
 *
 * <p>SetDefaultWatermarkRequest</p>
 */
public class SetDefaultWatermarkRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WatermarkId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String watermarkId;

    private SetDefaultWatermarkRequest(Builder builder) {
        super(builder);
        this.watermarkId = builder.watermarkId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDefaultWatermarkRequest create() {
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

    public static final class Builder extends Request.Builder<SetDefaultWatermarkRequest, Builder> {
        private String watermarkId; 

        private Builder() {
            super();
        } 

        private Builder(SetDefaultWatermarkRequest request) {
            super(request);
            this.watermarkId = request.watermarkId;
        } 

        /**
         * The ID of the watermark template. You can specify only one watermark template ID. You can obtain the ID by using one of the following methods:
         * <p>
         * 
         * *   Obtain the watermark template ID from the response to the [AddWatermark](~~AddWatermark~~) operation that you call to create a watermark template.
         * *   Obtain the watermark template ID from the response to the [ListWatermark](~~ListWatermark~~) operation that you call to query all watermark templates within your account.
         */
        public Builder watermarkId(String watermarkId) {
            this.putQueryParameter("WatermarkId", watermarkId);
            this.watermarkId = watermarkId;
            return this;
        }

        @Override
        public SetDefaultWatermarkRequest build() {
            return new SetDefaultWatermarkRequest(this);
        } 

    } 

}
