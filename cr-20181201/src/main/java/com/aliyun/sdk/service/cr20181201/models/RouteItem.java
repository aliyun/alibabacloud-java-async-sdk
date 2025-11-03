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
 * {@link RouteItem} extends {@link TeaModel}
 *
 * <p>RouteItem</p>
 */
public class RouteItem extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EndpointType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endpointType;

    @com.aliyun.core.annotation.NameInMap("InstanceDomain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceDomain;

    @com.aliyun.core.annotation.NameInMap("StorageDomain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String storageDomain;

    private RouteItem(Builder builder) {
        this.endpointType = builder.endpointType;
        this.instanceDomain = builder.instanceDomain;
        this.storageDomain = builder.storageDomain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RouteItem create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endpointType
     */
    public String getEndpointType() {
        return this.endpointType;
    }

    /**
     * @return instanceDomain
     */
    public String getInstanceDomain() {
        return this.instanceDomain;
    }

    /**
     * @return storageDomain
     */
    public String getStorageDomain() {
        return this.storageDomain;
    }

    public static final class Builder {
        private String endpointType; 
        private String instanceDomain; 
        private String storageDomain; 

        private Builder() {
        } 

        private Builder(RouteItem model) {
            this.endpointType = model.endpointType;
            this.instanceDomain = model.instanceDomain;
            this.storageDomain = model.storageDomain;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder endpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instanceDomain(String instanceDomain) {
            this.instanceDomain = instanceDomain;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder storageDomain(String storageDomain) {
            this.storageDomain = storageDomain;
            return this;
        }

        public RouteItem build() {
            return new RouteItem(this);
        } 

    } 

}
