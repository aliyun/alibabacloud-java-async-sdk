// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

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
 * {@link DeleteInstanceEndpointAclPolicyRequest} extends {@link RequestModel}
 *
 * <p>DeleteInstanceEndpointAclPolicyRequest</p>
 */
public class DeleteInstanceEndpointAclPolicyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endpointType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Entries")
    private java.util.List<AccessControlEntry> entries;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Entry")
    @Deprecated
    private String entry;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModuleName")
    private String moduleName;

    private DeleteInstanceEndpointAclPolicyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.endpointType = builder.endpointType;
        this.entries = builder.entries;
        this.entry = builder.entry;
        this.instanceId = builder.instanceId;
        this.moduleName = builder.moduleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteInstanceEndpointAclPolicyRequest create() {
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
     * @return endpointType
     */
    public String getEndpointType() {
        return this.endpointType;
    }

    /**
     * @return entries
     */
    public java.util.List<AccessControlEntry> getEntries() {
        return this.entries;
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

    public static final class Builder extends Request.Builder<DeleteInstanceEndpointAclPolicyRequest, Builder> {
        private String regionId; 
        private String endpointType; 
        private java.util.List<AccessControlEntry> entries; 
        private String entry; 
        private String instanceId; 
        private String moduleName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteInstanceEndpointAclPolicyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.endpointType = request.endpointType;
            this.entries = request.entries;
            this.entry = request.entry;
            this.instanceId = request.instanceId;
            this.moduleName = request.moduleName;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The endpoint type. Only Internet is supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>internet</p>
         */
        public Builder endpointType(String endpointType) {
            this.putQueryParameter("EndpointType", endpointType);
            this.endpointType = endpointType;
            return this;
        }

        /**
         * Entries.
         */
        public Builder entries(java.util.List<AccessControlEntry> entries) {
            String entriesShrink = shrink(entries, "Entries", "json");
            this.putQueryParameter("Entries", entriesShrink);
            this.entries = entries;
            return this;
        }

        /**
         * <p>The IP CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1/32</p>
         */
        public Builder entry(String entry) {
            this.putQueryParameter("Entry", entry);
            this.entry = entry;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-xkx6vujuhay0****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The module for which the access policy is set. Valid values:</p>
         * <ul>
         * <li><p><code>Registry</code>: access to the image repository</p>
         * </li>
         * <li><p><code>Chart</code>: access to Helm Chart</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Chart</p>
         */
        public Builder moduleName(String moduleName) {
            this.putQueryParameter("ModuleName", moduleName);
            this.moduleName = moduleName;
            return this;
        }

        @Override
        public DeleteInstanceEndpointAclPolicyRequest build() {
            return new DeleteInstanceEndpointAclPolicyRequest(this);
        } 

    } 

}
