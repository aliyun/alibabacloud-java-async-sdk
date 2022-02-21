// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVmAndSaveStockRequest} extends {@link RequestModel}
 *
 * <p>CreateVmAndSaveStockRequest</p>
 */
public class CreateVmAndSaveStockRequest extends Request {
    @Query
    @NameInMap("AliUid")
    @Validation(required = true, minimum = 1)
    private Long aliUid;

    @Query
    @NameInMap("GroupUuid")
    @Validation(required = true)
    private String groupUuid;

    @Body
    @NameInMap("ResourceAttribute")
    @Validation(required = true)
    private String resourceAttribute;

    @Query
    @NameInMap("Tenant")
    @Validation(required = true)
    private String tenant;

    @Query
    @NameInMap("WorkloadUuid")
    @Validation(required = true)
    private String workloadUuid;

    private CreateVmAndSaveStockRequest(Builder builder) {
        super(builder);
        this.aliUid = builder.aliUid;
        this.groupUuid = builder.groupUuid;
        this.resourceAttribute = builder.resourceAttribute;
        this.tenant = builder.tenant;
        this.workloadUuid = builder.workloadUuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVmAndSaveStockRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliUid
     */
    public Long getAliUid() {
        return this.aliUid;
    }

    /**
     * @return groupUuid
     */
    public String getGroupUuid() {
        return this.groupUuid;
    }

    /**
     * @return resourceAttribute
     */
    public String getResourceAttribute() {
        return this.resourceAttribute;
    }

    /**
     * @return tenant
     */
    public String getTenant() {
        return this.tenant;
    }

    /**
     * @return workloadUuid
     */
    public String getWorkloadUuid() {
        return this.workloadUuid;
    }

    public static final class Builder extends Request.Builder<CreateVmAndSaveStockRequest, Builder> {
        private Long aliUid; 
        private String groupUuid; 
        private String resourceAttribute; 
        private String tenant; 
        private String workloadUuid; 

        private Builder() {
            super();
        } 

        private Builder(CreateVmAndSaveStockRequest response) {
            super(response);
            this.aliUid = response.aliUid;
            this.groupUuid = response.groupUuid;
            this.resourceAttribute = response.resourceAttribute;
            this.tenant = response.tenant;
            this.workloadUuid = response.workloadUuid;
        } 

        /**
         * AliUid.
         */
        public Builder aliUid(Long aliUid) {
            this.putQueryParameter("AliUid", aliUid);
            this.aliUid = aliUid;
            return this;
        }

        /**
         * GroupUuid.
         */
        public Builder groupUuid(String groupUuid) {
            this.putQueryParameter("GroupUuid", groupUuid);
            this.groupUuid = groupUuid;
            return this;
        }

        /**
         * ResourceAttribute.
         */
        public Builder resourceAttribute(String resourceAttribute) {
            this.putBodyParameter("ResourceAttribute", resourceAttribute);
            this.resourceAttribute = resourceAttribute;
            return this;
        }

        /**
         * Tenant.
         */
        public Builder tenant(String tenant) {
            this.putQueryParameter("Tenant", tenant);
            this.tenant = tenant;
            return this;
        }

        /**
         * WorkloadUuid.
         */
        public Builder workloadUuid(String workloadUuid) {
            this.putQueryParameter("WorkloadUuid", workloadUuid);
            this.workloadUuid = workloadUuid;
            return this;
        }

        @Override
        public CreateVmAndSaveStockRequest build() {
            return new CreateVmAndSaveStockRequest(this);
        } 

    } 

}
