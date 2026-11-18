// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link DeleteWatermarkRequest} extends {@link RequestModel}
 *
 * <p>DeleteWatermarkRequest</p>
 */
public class DeleteWatermarkRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WatermarkId")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(DeleteWatermarkRequest request) {
            super(request);
            this.watermarkId = request.watermarkId;
        } 

        /**
         * <p>The ID of the watermark template to delete. Only a single watermark template ID can be specified. You can obtain the ID by using the following methods:</p>
         * <ul>
         * <li>The ID is returned after you call the <a href="~~AddWatermark~~">AddWatermark</a> operation to add a watermark template.</li>
         * <li>The ID is returned after you call the <a href="~~ListWatermark~~">ListWatermark</a> operation to query the list of watermark templates.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9bcc8bfadb843f*****09a2671d0df97</p>
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
