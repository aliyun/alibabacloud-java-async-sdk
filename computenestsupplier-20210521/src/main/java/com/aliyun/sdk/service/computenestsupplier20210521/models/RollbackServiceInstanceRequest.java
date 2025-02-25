// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

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
 * {@link RollbackServiceInstanceRequest} extends {@link RequestModel}
 *
 * <p>RollbackServiceInstanceRequest</p>
 */
public class RollbackServiceInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceInstanceId")
    private String serviceInstanceId;

    private RollbackServiceInstanceRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.regionId = builder.regionId;
        this.serviceInstanceId = builder.serviceInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RollbackServiceInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return serviceInstanceId
     */
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    public static final class Builder extends Request.Builder<RollbackServiceInstanceRequest, Builder> {
        private String clientToken; 
        private String regionId; 
        private String serviceInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(RollbackServiceInstanceRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.regionId = request.regionId;
            this.serviceInstanceId = request.serviceInstanceId;
        } 

        /**
         * <p>Ensures idempotence of the request. Generate a value from your client to ensure it is unique across different requests. <strong>ClientToken</strong> supports only ASCII characters and cannot exceed 64 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>10CM943JP0EN9D51H</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Service instance ID.</p>
         * <p>You can obtain the service instance ID by calling <a href="https://help.aliyun.com/document_detail/396200.html">ListServiceInstances - Query Service Instance List</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>si-3a8f9a75da074f52b969</p>
         */
        public Builder serviceInstanceId(String serviceInstanceId) {
            this.putQueryParameter("ServiceInstanceId", serviceInstanceId);
            this.serviceInstanceId = serviceInstanceId;
            return this;
        }

        @Override
        public RollbackServiceInstanceRequest build() {
            return new RollbackServiceInstanceRequest(this);
        } 

    } 

}
