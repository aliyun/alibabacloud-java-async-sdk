// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20230630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadDeviceNameListRequest} extends {@link RequestModel}
 *
 * <p>UploadDeviceNameListRequest</p>
 */
public class UploadDeviceNameListRequest extends Request {
    @Body
    @NameInMap("DeviceNames")
    @Validation(required = true)
    private java.util.List < String > deviceNames;

    @Query
    @NameInMap("ProductKey")
    @Validation(required = true)
    private String productKey;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    private UploadDeviceNameListRequest(Builder builder) {
        super(builder);
        this.deviceNames = builder.deviceNames;
        this.productKey = builder.productKey;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadDeviceNameListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceNames
     */
    public java.util.List < String > getDeviceNames() {
        return this.deviceNames;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<UploadDeviceNameListRequest, Builder> {
        private java.util.List < String > deviceNames; 
        private String productKey; 
        private String projectId; 

        private Builder() {
            super();
        } 

        private Builder(UploadDeviceNameListRequest request) {
            super(request);
            this.deviceNames = request.deviceNames;
            this.productKey = request.productKey;
            this.projectId = request.projectId;
        } 

        /**
         * DeviceNames.
         */
        public Builder deviceNames(java.util.List < String > deviceNames) {
            this.putBodyParameter("DeviceNames", deviceNames);
            this.deviceNames = deviceNames;
            return this;
        }

        /**
         * ProductKey.
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public UploadDeviceNameListRequest build() {
            return new UploadDeviceNameListRequest(this);
        } 

    } 

}
