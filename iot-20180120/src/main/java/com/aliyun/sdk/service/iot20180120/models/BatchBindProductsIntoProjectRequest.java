// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchBindProductsIntoProjectRequest} extends {@link RequestModel}
 *
 * <p>BatchBindProductsIntoProjectRequest</p>
 */
public class BatchBindProductsIntoProjectRequest extends Request {
    @Body
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Body
    @NameInMap("ProductKeys")
    @Validation(required = true)
    private java.util.List < String > productKeys;

    @Body
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    private BatchBindProductsIntoProjectRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.productKeys = builder.productKeys;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchBindProductsIntoProjectRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return productKeys
     */
    public java.util.List < String > getProductKeys() {
        return this.productKeys;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<BatchBindProductsIntoProjectRequest, Builder> {
        private String iotInstanceId; 
        private java.util.List < String > productKeys; 
        private String projectId; 

        private Builder() {
            super();
        } 

        private Builder(BatchBindProductsIntoProjectRequest request) {
            super(request);
            this.iotInstanceId = request.iotInstanceId;
            this.productKeys = request.productKeys;
            this.projectId = request.projectId;
        } 

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putBodyParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * ProductKeys.
         */
        public Builder productKeys(java.util.List < String > productKeys) {
            this.putBodyParameter("ProductKeys", productKeys);
            this.productKeys = productKeys;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public BatchBindProductsIntoProjectRequest build() {
            return new BatchBindProductsIntoProjectRequest(this);
        } 

    } 

}
