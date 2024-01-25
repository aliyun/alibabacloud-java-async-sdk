// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tablestore20201209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateInstanceRequest} extends {@link RequestModel}
 *
 * <p>UpdateInstanceRequest</p>
 */
public class UpdateInstanceRequest extends Request {
    @Body
    @NameInMap("AliasName")
    private String aliasName;

    @Body
    @NameInMap("InstanceDescription")
    private String instanceDescription;

    @Body
    @NameInMap("InstanceName")
    @Validation(required = true)
    private String instanceName;

    @Body
    @NameInMap("Network")
    private String network;

    @Body
    @NameInMap("NetworkSourceACL")
    private java.util.List < String > networkSourceACL;

    @Body
    @NameInMap("NetworkTypeACL")
    private java.util.List < String > networkTypeACL;

    private UpdateInstanceRequest(Builder builder) {
        super(builder);
        this.aliasName = builder.aliasName;
        this.instanceDescription = builder.instanceDescription;
        this.instanceName = builder.instanceName;
        this.network = builder.network;
        this.networkSourceACL = builder.networkSourceACL;
        this.networkTypeACL = builder.networkTypeACL;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliasName
     */
    public String getAliasName() {
        return this.aliasName;
    }

    /**
     * @return instanceDescription
     */
    public String getInstanceDescription() {
        return this.instanceDescription;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return network
     */
    public String getNetwork() {
        return this.network;
    }

    /**
     * @return networkSourceACL
     */
    public java.util.List < String > getNetworkSourceACL() {
        return this.networkSourceACL;
    }

    /**
     * @return networkTypeACL
     */
    public java.util.List < String > getNetworkTypeACL() {
        return this.networkTypeACL;
    }

    public static final class Builder extends Request.Builder<UpdateInstanceRequest, Builder> {
        private String aliasName; 
        private String instanceDescription; 
        private String instanceName; 
        private String network; 
        private java.util.List < String > networkSourceACL; 
        private java.util.List < String > networkTypeACL; 

        private Builder() {
            super();
        } 

        private Builder(UpdateInstanceRequest request) {
            super(request);
            this.aliasName = request.aliasName;
            this.instanceDescription = request.instanceDescription;
            this.instanceName = request.instanceName;
            this.network = request.network;
            this.networkSourceACL = request.networkSourceACL;
            this.networkTypeACL = request.networkTypeACL;
        } 

        /**
         * AliasName.
         */
        public Builder aliasName(String aliasName) {
            this.putBodyParameter("AliasName", aliasName);
            this.aliasName = aliasName;
            return this;
        }

        /**
         * InstanceDescription.
         */
        public Builder instanceDescription(String instanceDescription) {
            this.putBodyParameter("InstanceDescription", instanceDescription);
            this.instanceDescription = instanceDescription;
            return this;
        }

        /**
         * InstanceName.
         */
        public Builder instanceName(String instanceName) {
            this.putBodyParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * Network.
         */
        public Builder network(String network) {
            this.putBodyParameter("Network", network);
            this.network = network;
            return this;
        }

        /**
         * NetworkSourceACL.
         */
        public Builder networkSourceACL(java.util.List < String > networkSourceACL) {
            this.putBodyParameter("NetworkSourceACL", networkSourceACL);
            this.networkSourceACL = networkSourceACL;
            return this;
        }

        /**
         * NetworkTypeACL.
         */
        public Builder networkTypeACL(java.util.List < String > networkTypeACL) {
            this.putBodyParameter("NetworkTypeACL", networkTypeACL);
            this.networkTypeACL = networkTypeACL;
            return this;
        }

        @Override
        public UpdateInstanceRequest build() {
            return new UpdateInstanceRequest(this);
        } 

    } 

}
