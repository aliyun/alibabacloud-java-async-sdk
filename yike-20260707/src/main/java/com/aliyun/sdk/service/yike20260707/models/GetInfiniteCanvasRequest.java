// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260707.models;

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
 * {@link GetInfiniteCanvasRequest} extends {@link RequestModel}
 *
 * <p>GetInfiniteCanvasRequest</p>
 */
public class GetInfiniteCanvasRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CanvasId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String canvasId;

    private GetInfiniteCanvasRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.canvasId = builder.canvasId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInfiniteCanvasRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return canvasId
     */
    public String getCanvasId() {
        return this.canvasId;
    }

    public static final class Builder extends Request.Builder<GetInfiniteCanvasRequest, Builder> {
        private String regionId; 
        private String canvasId; 

        private Builder() {
            super();
        } 

        private Builder(GetInfiniteCanvasRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.canvasId = request.canvasId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>canvas_***</p>
         */
        public Builder canvasId(String canvasId) {
            this.putQueryParameter("CanvasId", canvasId);
            this.canvasId = canvasId;
            return this;
        }

        @Override
        public GetInfiniteCanvasRequest build() {
            return new GetInfiniteCanvasRequest(this);
        } 

    } 

}
