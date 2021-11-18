// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CreateInstanceEndpointAclPolicyRequest} extends {@link RequestModel}
 *
 * <p>CreateInstanceEndpointAclPolicyRequest</p>
 */
public class CreateInstanceEndpointAclPolicyRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("Comment")
    private String comment;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("EndpointType")
    private String endpointType;

    @Query
    @NameInMap("Entry")
    private String entry;

    @Query
    @NameInMap("ModuleName")
    private String moduleName;


    private CreateInstanceEndpointAclPolicyRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.comment = builder.comment;
        this.regionId = builder.regionId;
        this.endpointType = builder.endpointType;
        this.entry = builder.entry;
        this.moduleName = builder.moduleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstanceEndpointAclPolicyRequest create() {
        return builder().build();
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return moduleName
     */
    public String getModuleName() {
        return this.moduleName;
    }

    public static final class Builder extends Request.Builder {
        private String instanceId; 
        private String comment; 
        private String regionId; 
        private String endpointType; 
        private String entry; 
        private String moduleName; 

        /**
         * <p>Instance ID</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Description</p>
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * <p>Region</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The type of the endpoint. Valid values: Internet.</p>
         */
        public Builder endpointType(String endpointType) {
            this.putQueryParameter("EndpointType", endpointType);
            this.endpointType = endpointType;
            return this;
        }

        /**
         * <p>Allowed CIDR blocks</p>
         */
        public Builder entry(String entry) {
            this.putQueryParameter("Entry", entry);
            this.entry = entry;
            return this;
        }

        /**
         * <p>The module to which you want to configure the access policy. Valid values:

-"Registration": Access the image repository

-"Chart": access Helm Chart</p>
         */
        public Builder moduleName(String moduleName) {
            this.putQueryParameter("ModuleName", moduleName);
            this.moduleName = moduleName;
            return this;
        }

        public CreateInstanceEndpointAclPolicyRequest build() {
            return new CreateInstanceEndpointAclPolicyRequest(this);
        } 

    } 

}
