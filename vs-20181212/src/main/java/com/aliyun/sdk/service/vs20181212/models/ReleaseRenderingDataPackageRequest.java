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
 * {@link ReleaseRenderingDataPackageRequest} extends {@link RequestModel}
 *
 * <p>ReleaseRenderingDataPackageRequest</p>
 */
public class ReleaseRenderingDataPackageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataPackageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataPackageId;

    private ReleaseRenderingDataPackageRequest(Builder builder) {
        super(builder);
        this.dataPackageId = builder.dataPackageId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReleaseRenderingDataPackageRequest create() {
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

    public static final class Builder extends Request.Builder<ReleaseRenderingDataPackageRequest, Builder> {
        private String dataPackageId; 

        private Builder() {
            super();
        } 

        private Builder(ReleaseRenderingDataPackageRequest request) {
            super(request);
            this.dataPackageId = request.dataPackageId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dp-9f8c57355d224ad7beaf95e145f22111</p>
         */
        public Builder dataPackageId(String dataPackageId) {
            this.putQueryParameter("DataPackageId", dataPackageId);
            this.dataPackageId = dataPackageId;
            return this;
        }

        @Override
        public ReleaseRenderingDataPackageRequest build() {
            return new ReleaseRenderingDataPackageRequest(this);
        } 

    } 

}
