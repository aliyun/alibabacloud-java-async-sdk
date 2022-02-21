// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInstanceEndpointAclPolicyRequest} extends {@link RequestModel}
 *
 * <p>CreateInstanceEndpointAclPolicyRequest</p>
 */
public class CreateInstanceEndpointAclPolicyRequest extends Request {
    @Query
    @NameInMap("Comment")
    private String comment;

    @Query
    @NameInMap("EndpointType")
    @Validation(required = true)
    private String endpointType;

    @Query
    @NameInMap("Entry")
    @Validation(required = true)
    private String entry;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("ModuleName")
    private String moduleName;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private CreateInstanceEndpointAclPolicyRequest(Builder builder) {
        super(builder);
        this.comment = builder.comment;
        this.endpointType = builder.endpointType;
        this.entry = builder.entry;
        this.instanceId = builder.instanceId;
        this.moduleName = builder.moduleName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstanceEndpointAclPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return endpointType
     */
    public String getEndpointType() {
        return this.endpointType;
    }

    /**
     * @return entry
     */
    public String getEntry() {
        return this.entry;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return moduleName
     */
    public String getModuleName() {
        return this.moduleName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateInstanceEndpointAclPolicyRequest, Builder> {
        private String comment; 
        private String endpointType; 
        private String entry; 
        private String instanceId; 
        private String moduleName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateInstanceEndpointAclPolicyRequest response) {
            super(response);
            this.comment = response.comment;
            this.endpointType = response.endpointType;
            this.entry = response.entry;
            this.instanceId = response.instanceId;
            this.moduleName = response.moduleName;
            this.regionId = response.regionId;
        } 

        /**
         * Comment.
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * EndpointType.
         */
        public Builder endpointType(String endpointType) {
            this.putQueryParameter("EndpointType", endpointType);
            this.endpointType = endpointType;
            return this;
        }

        /**
         * Entry.
         */
        public Builder entry(String entry) {
            this.putQueryParameter("Entry", entry);
            this.entry = entry;
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
         * ModuleName.
         */
        public Builder moduleName(String moduleName) {
            this.putQueryParameter("ModuleName", moduleName);
            this.moduleName = moduleName;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateInstanceEndpointAclPolicyRequest build() {
            return new CreateInstanceEndpointAclPolicyRequest(this);
        } 

    } 

}
