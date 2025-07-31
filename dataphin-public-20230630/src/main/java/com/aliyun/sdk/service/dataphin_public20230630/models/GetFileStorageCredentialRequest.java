// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link GetFileStorageCredentialRequest} extends {@link RequestModel}
 *
 * <p>GetFileStorageCredentialRequest</p>
 */
public class GetFileStorageCredentialRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private Long projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Purpose")
    private String purpose;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseVpcEndpoint")
    private Boolean useVpcEndpoint;

    private GetFileStorageCredentialRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.projectId = builder.projectId;
        this.purpose = builder.purpose;
        this.useVpcEndpoint = builder.useVpcEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFileStorageCredentialRequest create() {
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
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return purpose
     */
    public String getPurpose() {
        return this.purpose;
    }

    /**
     * @return useVpcEndpoint
     */
    public Boolean getUseVpcEndpoint() {
        return this.useVpcEndpoint;
    }

    public static final class Builder extends Request.Builder<GetFileStorageCredentialRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private Long projectId; 
        private String purpose; 
        private Boolean useVpcEndpoint; 

        private Builder() {
            super();
        } 

        private Builder(GetFileStorageCredentialRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
            this.projectId = request.projectId;
            this.purpose = request.purpose;
            this.useVpcEndpoint = request.useVpcEndpoint;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * Purpose.
         */
        public Builder purpose(String purpose) {
            this.putQueryParameter("Purpose", purpose);
            this.purpose = purpose;
            return this;
        }

        /**
         * UseVpcEndpoint.
         */
        public Builder useVpcEndpoint(Boolean useVpcEndpoint) {
            this.putQueryParameter("UseVpcEndpoint", useVpcEndpoint);
            this.useVpcEndpoint = useVpcEndpoint;
            return this;
        }

        @Override
        public GetFileStorageCredentialRequest build() {
            return new GetFileStorageCredentialRequest(this);
        } 

    } 

}
