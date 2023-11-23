// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuotaConfig} extends {@link TeaModel}
 *
 * <p>QuotaConfig</p>
 */
public class QuotaConfig extends TeaModel {
    @NameInMap("ACS")
    private ACS ACS;

    @NameInMap("ClusterId")
    private String clusterId;

    @NameInMap("DefaultGPUDriver")
    private String defaultGPUDriver;

    @NameInMap("SupportGPUDrivers")
    private java.util.List < String > supportGPUDrivers;

    @NameInMap("SupportRDMA")
    private Boolean supportRDMA;

    @NameInMap("UserVpc")
    private UserVpc userVpc;

    private QuotaConfig(Builder builder) {
        this.ACS = builder.ACS;
        this.clusterId = builder.clusterId;
        this.defaultGPUDriver = builder.defaultGPUDriver;
        this.supportGPUDrivers = builder.supportGPUDrivers;
        this.supportRDMA = builder.supportRDMA;
        this.userVpc = builder.userVpc;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuotaConfig create() {
        return builder().build();
    }

    /**
     * @return ACS
     */
    public ACS getACS() {
        return this.ACS;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return defaultGPUDriver
     */
    public String getDefaultGPUDriver() {
        return this.defaultGPUDriver;
    }

    /**
     * @return supportGPUDrivers
     */
    public java.util.List < String > getSupportGPUDrivers() {
        return this.supportGPUDrivers;
    }

    /**
     * @return supportRDMA
     */
    public Boolean getSupportRDMA() {
        return this.supportRDMA;
    }

    /**
     * @return userVpc
     */
    public UserVpc getUserVpc() {
        return this.userVpc;
    }

    public static final class Builder {
        private ACS ACS; 
        private String clusterId; 
        private String defaultGPUDriver; 
        private java.util.List < String > supportGPUDrivers; 
        private Boolean supportRDMA; 
        private UserVpc userVpc; 

        /**
         * ACS.
         */
        public Builder ACS(ACS ACS) {
            this.ACS = ACS;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * DefaultGPUDriver.
         */
        public Builder defaultGPUDriver(String defaultGPUDriver) {
            this.defaultGPUDriver = defaultGPUDriver;
            return this;
        }

        /**
         * SupportGPUDrivers.
         */
        public Builder supportGPUDrivers(java.util.List < String > supportGPUDrivers) {
            this.supportGPUDrivers = supportGPUDrivers;
            return this;
        }

        /**
         * SupportRDMA.
         */
        public Builder supportRDMA(Boolean supportRDMA) {
            this.supportRDMA = supportRDMA;
            return this;
        }

        /**
         * UserVpc.
         */
        public Builder userVpc(UserVpc userVpc) {
            this.userVpc = userVpc;
            return this;
        }

        public QuotaConfig build() {
            return new QuotaConfig(this);
        } 

    } 

}
