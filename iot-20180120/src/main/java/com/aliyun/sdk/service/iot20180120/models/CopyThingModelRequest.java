// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CopyThingModelRequest} extends {@link RequestModel}
 *
 * <p>CopyThingModelRequest</p>
 */
public class CopyThingModelRequest extends Request {
    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("SourceModelVersion")
    private String sourceModelVersion;

    @Query
    @NameInMap("SourceProductKey")
    @Validation(required = true)
    private String sourceProductKey;

    @Query
    @NameInMap("TargetProductKey")
    @Validation(required = true)
    private String targetProductKey;

    private CopyThingModelRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.resourceGroupId = builder.resourceGroupId;
        this.sourceModelVersion = builder.sourceModelVersion;
        this.sourceProductKey = builder.sourceProductKey;
        this.targetProductKey = builder.targetProductKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CopyThingModelRequest create() {
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return sourceModelVersion
     */
    public String getSourceModelVersion() {
        return this.sourceModelVersion;
    }

    /**
     * @return sourceProductKey
     */
    public String getSourceProductKey() {
        return this.sourceProductKey;
    }

    /**
     * @return targetProductKey
     */
    public String getTargetProductKey() {
        return this.targetProductKey;
    }

    public static final class Builder extends Request.Builder<CopyThingModelRequest, Builder> {
        private String iotInstanceId; 
        private String resourceGroupId; 
        private String sourceModelVersion; 
        private String sourceProductKey; 
        private String targetProductKey; 

        private Builder() {
            super();
        } 

        private Builder(CopyThingModelRequest response) {
            super(response);
            this.iotInstanceId = response.iotInstanceId;
            this.resourceGroupId = response.resourceGroupId;
            this.sourceModelVersion = response.sourceModelVersion;
            this.sourceProductKey = response.sourceProductKey;
            this.targetProductKey = response.targetProductKey;
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
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * SourceModelVersion.
         */
        public Builder sourceModelVersion(String sourceModelVersion) {
            this.putQueryParameter("SourceModelVersion", sourceModelVersion);
            this.sourceModelVersion = sourceModelVersion;
            return this;
        }

        /**
         * SourceProductKey.
         */
        public Builder sourceProductKey(String sourceProductKey) {
            this.putQueryParameter("SourceProductKey", sourceProductKey);
            this.sourceProductKey = sourceProductKey;
            return this;
        }

        /**
         * TargetProductKey.
         */
        public Builder targetProductKey(String targetProductKey) {
            this.putQueryParameter("TargetProductKey", targetProductKey);
            this.targetProductKey = targetProductKey;
            return this;
        }

        @Override
        public CopyThingModelRequest build() {
            return new CopyThingModelRequest(this);
        } 

    } 

}
