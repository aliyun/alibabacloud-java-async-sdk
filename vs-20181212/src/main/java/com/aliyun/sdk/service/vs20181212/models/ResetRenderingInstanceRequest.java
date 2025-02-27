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
 * {@link ResetRenderingInstanceRequest} extends {@link RequestModel}
 *
 * <p>ResetRenderingInstanceRequest</p>
 */
public class ResetRenderingInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActionName")
    private String actionName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataPackageId")
    private String dataPackageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RenderingInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String renderingInstanceId;

    private ResetRenderingInstanceRequest(Builder builder) {
        super(builder);
        this.actionName = builder.actionName;
        this.dataPackageId = builder.dataPackageId;
        this.renderingInstanceId = builder.renderingInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetRenderingInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionName
     */
    public String getActionName() {
        return this.actionName;
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

    public static final class Builder extends Request.Builder<ResetRenderingInstanceRequest, Builder> {
        private String actionName; 
        private String dataPackageId; 
        private String renderingInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(ResetRenderingInstanceRequest request) {
            super(request);
            this.actionName = request.actionName;
            this.dataPackageId = request.dataPackageId;
            this.renderingInstanceId = request.renderingInstanceId;
        } 

        /**
         * ActionName.
         */
        public Builder actionName(String actionName) {
            this.putQueryParameter("ActionName", actionName);
            this.actionName = actionName;
            return this;
        }

        /**
         * DataPackageId.
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
        public ResetRenderingInstanceRequest build() {
            return new ResetRenderingInstanceRequest(this);
        } 

    } 

}
