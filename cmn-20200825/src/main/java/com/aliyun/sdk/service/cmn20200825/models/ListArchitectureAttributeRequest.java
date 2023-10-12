// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListArchitectureAttributeRequest} extends {@link RequestModel}
 *
 * <p>ListArchitectureAttributeRequest</p>
 */
public class ListArchitectureAttributeRequest extends Request {
    @Query
    @NameInMap("ArchitectureId")
    @Validation(required = true)
    private String architectureId;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("Role")
    private String role;

    @Query
    @NameInMap("Vendor")
    private String vendor;

    private ListArchitectureAttributeRequest(Builder builder) {
        super(builder);
        this.architectureId = builder.architectureId;
        this.instanceId = builder.instanceId;
        this.role = builder.role;
        this.vendor = builder.vendor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListArchitectureAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return architectureId
     */
    public String getArchitectureId() {
        return this.architectureId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return role
     */
    public String getRole() {
        return this.role;
    }

    /**
     * @return vendor
     */
    public String getVendor() {
        return this.vendor;
    }

    public static final class Builder extends Request.Builder<ListArchitectureAttributeRequest, Builder> {
        private String architectureId; 
        private String instanceId; 
        private String role; 
        private String vendor; 

        private Builder() {
            super();
        } 

        private Builder(ListArchitectureAttributeRequest request) {
            super(request);
            this.architectureId = request.architectureId;
            this.instanceId = request.instanceId;
            this.role = request.role;
            this.vendor = request.vendor;
        } 

        /**
         * ArchitectureId.
         */
        public Builder architectureId(String architectureId) {
            this.putQueryParameter("ArchitectureId", architectureId);
            this.architectureId = architectureId;
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
         * Role.
         */
        public Builder role(String role) {
            this.putQueryParameter("Role", role);
            this.role = role;
            return this;
        }

        /**
         * Vendor.
         */
        public Builder vendor(String vendor) {
            this.putQueryParameter("Vendor", vendor);
            this.vendor = vendor;
            return this;
        }

        @Override
        public ListArchitectureAttributeRequest build() {
            return new ListArchitectureAttributeRequest(this);
        } 

    } 

}
