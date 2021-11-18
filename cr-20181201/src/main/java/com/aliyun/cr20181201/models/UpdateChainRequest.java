// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link UpdateChainRequest} extends {@link RequestModel}
 *
 * <p>UpdateChainRequest</p>
 */
public class UpdateChainRequest extends Request {
    @Query
    @NameInMap("ChainConfig")
    private String chainConfig;

    @Query
    @NameInMap("ChainId")
    private String chainId;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("Name")
    private String name;

    @Host
    @NameInMap("RegionId")
    private String regionId;


    private UpdateChainRequest(Builder builder) {
        super(builder);
        this.chainConfig = builder.chainConfig;
        this.chainId = builder.chainId;
        this.description = builder.description;
        this.instanceId = builder.instanceId;
        this.name = builder.name;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateChainRequest create() {
        return builder().build();
    }

    /**
     * @return chainConfig
     */
    public String getChainConfig() {
        return this.chainConfig;
    }

    /**
     * @return chainId
     */
    public String getChainId() {
        return this.chainId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder {
        private String chainConfig; 
        private String chainId; 
        private String description; 
        private String instanceId; 
        private String name; 
        private String regionId; 

        /**
         * <p>ChainConfig.</p>
         */
        public Builder chainConfig(String chainConfig) {
            this.putQueryParameter("ChainConfig", chainConfig);
            this.chainConfig = chainConfig;
            return this;
        }

        /**
         * <p>ChainId.</p>
         */
        public Builder chainId(String chainId) {
            this.putQueryParameter("ChainId", chainId);
            this.chainId = chainId;
            return this;
        }

        /**
         * <p>Description.</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>InstanceId.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Name.</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>RegionId.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        public UpdateChainRequest build() {
            return new UpdateChainRequest(this);
        } 

    } 

}
