// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

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
 * {@link StopInstanceRequest} extends {@link RequestModel}
 *
 * <p>StopInstanceRequest</p>
 */
public class StopInstanceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SaveImage")
    private Boolean saveImage;

    private StopInstanceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.saveImage = builder.saveImage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return saveImage
     */
    public Boolean getSaveImage() {
        return this.saveImage;
    }

    public static final class Builder extends Request.Builder<StopInstanceRequest, Builder> {
        private String instanceId; 
        private Boolean saveImage; 

        private Builder() {
            super();
        } 

        private Builder(StopInstanceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.saveImage = request.saveImage;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dsw-730xxxxxxxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * SaveImage.
         */
        public Builder saveImage(Boolean saveImage) {
            this.putQueryParameter("SaveImage", saveImage);
            this.saveImage = saveImage;
            return this;
        }

        @Override
        public StopInstanceRequest build() {
            return new StopInstanceRequest(this);
        } 

    } 

}
