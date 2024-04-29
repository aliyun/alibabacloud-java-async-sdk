// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateJenkinsImageRegistryNameRequest} extends {@link RequestModel}
 *
 * <p>UpdateJenkinsImageRegistryNameRequest</p>
 */
public class UpdateJenkinsImageRegistryNameRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegistryId")
    private Long registryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegistryName")
    private String registryName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    private UpdateJenkinsImageRegistryNameRequest(Builder builder) {
        super(builder);
        this.registryId = builder.registryId;
        this.registryName = builder.registryName;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateJenkinsImageRegistryNameRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return registryId
     */
    public Long getRegistryId() {
        return this.registryId;
    }

    /**
     * @return registryName
     */
    public String getRegistryName() {
        return this.registryName;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<UpdateJenkinsImageRegistryNameRequest, Builder> {
        private Long registryId; 
        private String registryName; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(UpdateJenkinsImageRegistryNameRequest request) {
            super(request);
            this.registryId = request.registryId;
            this.registryName = request.registryName;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * The ID of the image repository.
         * <p>
         * 
         * > You can call the [PageImageRegistry](~~PageImageRegistry~~) operation to query the IDs of image repositories.
         */
        public Builder registryId(Long registryId) {
            this.putBodyParameter("RegistryId", registryId);
            this.registryId = registryId;
            return this;
        }

        /**
         * The name of the image repository.
         */
        public Builder registryName(String registryName) {
            this.putBodyParameter("RegistryName", registryName);
            this.registryName = registryName;
            return this;
        }

        /**
         * The source IP address of the request.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public UpdateJenkinsImageRegistryNameRequest build() {
            return new UpdateJenkinsImageRegistryNameRequest(this);
        } 

    } 

}
