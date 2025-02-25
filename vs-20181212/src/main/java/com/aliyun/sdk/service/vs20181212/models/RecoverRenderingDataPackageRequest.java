// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link RecoverRenderingDataPackageRequest} extends {@link RequestModel}
 *
 * <p>RecoverRenderingDataPackageRequest</p>
 */
public class RecoverRenderingDataPackageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataPackageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataPackageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RenderingInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String renderingInstanceId;

    private RecoverRenderingDataPackageRequest(Builder builder) {
        super(builder);
        this.dataPackageId = builder.dataPackageId;
        this.renderingInstanceId = builder.renderingInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecoverRenderingDataPackageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataPackageId
     */
    public String getDataPackageId() {
        return this.dataPackageId;
    }

    /**
     * @return renderingInstanceId
     */
    public String getRenderingInstanceId() {
        return this.renderingInstanceId;
    }

    public static final class Builder extends Request.Builder<RecoverRenderingDataPackageRequest, Builder> {
        private String dataPackageId; 
        private String renderingInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(RecoverRenderingDataPackageRequest request) {
            super(request);
            this.dataPackageId = request.dataPackageId;
            this.renderingInstanceId = request.renderingInstanceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dp-449ea3d16c0841b8bf33ec5bbc86a152</p>
         */
        public Builder dataPackageId(String dataPackageId) {
            this.putQueryParameter("DataPackageId", dataPackageId);
            this.dataPackageId = dataPackageId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>render-9f8c57355d224ad7beaf95e145f22111</p>
         */
        public Builder renderingInstanceId(String renderingInstanceId) {
            this.putQueryParameter("RenderingInstanceId", renderingInstanceId);
            this.renderingInstanceId = renderingInstanceId;
            return this;
        }

        @Override
        public RecoverRenderingDataPackageRequest build() {
            return new RecoverRenderingDataPackageRequest(this);
        } 

    } 

}
