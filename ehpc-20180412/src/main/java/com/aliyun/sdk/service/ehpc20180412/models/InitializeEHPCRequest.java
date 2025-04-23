// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

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
 * {@link InitializeEHPCRequest} extends {@link RequestModel}
 *
 * <p>InitializeEHPCRequest</p>
 */
public class InitializeEHPCRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceName")
    private String serviceName;

    private InitializeEHPCRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.serviceName = builder.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitializeEHPCRequest create() {
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
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    public static final class Builder extends Request.Builder<InitializeEHPCRequest, Builder> {
        private String regionId; 
        private String serviceName; 

        private Builder() {
            super();
        } 

        private Builder(InitializeEHPCRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.serviceName = request.serviceName;
        } 

        /**
         * <p>The ID of the region where the service-linked role is created.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/188593.html">ListRegions</a> operation to obtain the IDs of regions supported by E-HPC.</p>
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
         * <p>The name of the service for which you must create a service-linked role. Valid values:</p>
         * <ul>
         * <li>E-HPC: You must create the AliyunServiceRoleForEHPC service-linked role.</li>
         * <li>E-HPC Instant: You must create the AliyunServiceRoleForEHPCManagedNetwork service-linked role.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>E-HPC</p>
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        @Override
        public InitializeEHPCRequest build() {
            return new InitializeEHPCRequest(this);
        } 

    } 

}
