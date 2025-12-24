// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link GenerateUploadAuthRequest} extends {@link RequestModel}
 *
 * <p>GenerateUploadAuthRequest</p>
 */
public class GenerateUploadAuthRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Purpose")
    private String purpose;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private GenerateUploadAuthRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.purpose = builder.purpose;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateUploadAuthRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return purpose
     */
    public String getPurpose() {
        return this.purpose;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<GenerateUploadAuthRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String purpose; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(GenerateUploadAuthRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.purpose = request.purpose;
            this.type = request.type;
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
         * <p>IDaaS EIAM的实例id</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_111ccc11xxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>文件用途</p>
         * 
         * <strong>example:</strong>
         * <p>user_import</p>
         */
        public Builder purpose(String purpose) {
            this.putQueryParameter("Purpose", purpose);
            this.purpose = purpose;
            return this;
        }

        /**
         * <p>文件类型，目前只支持image,最大1M</p>
         * 
         * <strong>example:</strong>
         * <p>image</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public GenerateUploadAuthRequest build() {
            return new GenerateUploadAuthRequest(this);
        } 

    } 

}
