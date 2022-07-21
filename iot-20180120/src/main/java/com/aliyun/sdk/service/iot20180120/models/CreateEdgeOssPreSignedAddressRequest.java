// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEdgeOssPreSignedAddressRequest} extends {@link RequestModel}
 *
 * <p>CreateEdgeOssPreSignedAddressRequest</p>
 */
public class CreateEdgeOssPreSignedAddressRequest extends Request {
    @Query
    @NameInMap("FileName")
    @Validation(required = true)
    private String fileName;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("ResourceId")
    @Validation(required = true)
    private String resourceId;

    @Query
    @NameInMap("ResourceVersion")
    @Validation(required = true)
    private String resourceVersion;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private CreateEdgeOssPreSignedAddressRequest(Builder builder) {
        super(builder);
        this.fileName = builder.fileName;
        this.instanceId = builder.instanceId;
        this.iotInstanceId = builder.iotInstanceId;
        this.resourceId = builder.resourceId;
        this.resourceVersion = builder.resourceVersion;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEdgeOssPreSignedAddressRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceVersion
     */
    public String getResourceVersion() {
        return this.resourceVersion;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateEdgeOssPreSignedAddressRequest, Builder> {
        private String fileName; 
        private String instanceId; 
        private String iotInstanceId; 
        private String resourceId; 
        private String resourceVersion; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateEdgeOssPreSignedAddressRequest request) {
            super(request);
            this.fileName = request.fileName;
            this.instanceId = request.instanceId;
            this.iotInstanceId = request.iotInstanceId;
            this.resourceId = request.resourceId;
            this.resourceVersion = request.resourceVersion;
            this.type = request.type;
        } 

        /**
         * FileName.
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * ResourceVersion.
         */
        public Builder resourceVersion(String resourceVersion) {
            this.putQueryParameter("ResourceVersion", resourceVersion);
            this.resourceVersion = resourceVersion;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateEdgeOssPreSignedAddressRequest build() {
            return new CreateEdgeOssPreSignedAddressRequest(this);
        } 

    } 

}
