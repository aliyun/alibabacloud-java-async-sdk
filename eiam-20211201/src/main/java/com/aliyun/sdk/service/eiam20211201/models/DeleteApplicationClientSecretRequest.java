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
 * {@link DeleteApplicationClientSecretRequest} extends {@link RequestModel}
 *
 * <p>DeleteApplicationClientSecretRequest</p>
 */
public class DeleteApplicationClientSecretRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecretId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String secretId;

    private DeleteApplicationClientSecretRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.applicationId = builder.applicationId;
        this.instanceId = builder.instanceId;
        this.secretId = builder.secretId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteApplicationClientSecretRequest create() {
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
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return secretId
     */
    public String getSecretId() {
        return this.secretId;
    }

    public static final class Builder extends Request.Builder<DeleteApplicationClientSecretRequest, Builder> {
        private String regionId; 
        private String applicationId; 
        private String instanceId; 
        private String secretId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteApplicationClientSecretRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.applicationId = request.applicationId;
            this.instanceId = request.instanceId;
            this.secretId = request.secretId;
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
         * <p>The ID of the application for which you want to delete a client key.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the client key that you want to delete for the application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sci_k52x2ru63rlkflina5utgkxxxx</p>
         */
        public Builder secretId(String secretId) {
            this.putQueryParameter("SecretId", secretId);
            this.secretId = secretId;
            return this;
        }

        @Override
        public DeleteApplicationClientSecretRequest build() {
            return new DeleteApplicationClientSecretRequest(this);
        } 

    } 

}
