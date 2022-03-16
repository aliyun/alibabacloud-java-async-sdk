// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyMultiZoneClusterNodeTypeRequest} extends {@link RequestModel}
 *
 * <p>ModifyMultiZoneClusterNodeTypeRequest</p>
 */
public class ModifyMultiZoneClusterNodeTypeRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("CoreInstanceType")
    private String coreInstanceType;

    @Query
    @NameInMap("LogInstanceType")
    private String logInstanceType;

    @Query
    @NameInMap("MasterInstanceType")
    private String masterInstanceType;

    private ModifyMultiZoneClusterNodeTypeRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.coreInstanceType = builder.coreInstanceType;
        this.logInstanceType = builder.logInstanceType;
        this.masterInstanceType = builder.masterInstanceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyMultiZoneClusterNodeTypeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return coreInstanceType
     */
    public String getCoreInstanceType() {
        return this.coreInstanceType;
    }

    /**
     * @return logInstanceType
     */
    public String getLogInstanceType() {
        return this.logInstanceType;
    }

    /**
     * @return masterInstanceType
     */
    public String getMasterInstanceType() {
        return this.masterInstanceType;
    }

    public static final class Builder extends Request.Builder<ModifyMultiZoneClusterNodeTypeRequest, Builder> {
        private String clusterId; 
        private String coreInstanceType; 
        private String logInstanceType; 
        private String masterInstanceType; 

        private Builder() {
            super();
        } 

        private Builder(ModifyMultiZoneClusterNodeTypeRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.coreInstanceType = request.coreInstanceType;
            this.logInstanceType = request.logInstanceType;
            this.masterInstanceType = request.masterInstanceType;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * CoreInstanceType.
         */
        public Builder coreInstanceType(String coreInstanceType) {
            this.putQueryParameter("CoreInstanceType", coreInstanceType);
            this.coreInstanceType = coreInstanceType;
            return this;
        }

        /**
         * LogInstanceType.
         */
        public Builder logInstanceType(String logInstanceType) {
            this.putQueryParameter("LogInstanceType", logInstanceType);
            this.logInstanceType = logInstanceType;
            return this;
        }

        /**
         * MasterInstanceType.
         */
        public Builder masterInstanceType(String masterInstanceType) {
            this.putQueryParameter("MasterInstanceType", masterInstanceType);
            this.masterInstanceType = masterInstanceType;
            return this;
        }

        @Override
        public ModifyMultiZoneClusterNodeTypeRequest build() {
            return new ModifyMultiZoneClusterNodeTypeRequest(this);
        } 

    } 

}
