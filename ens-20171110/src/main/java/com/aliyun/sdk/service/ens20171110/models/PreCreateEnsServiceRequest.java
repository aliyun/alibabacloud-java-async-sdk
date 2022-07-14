// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PreCreateEnsServiceRequest} extends {@link RequestModel}
 *
 * <p>PreCreateEnsServiceRequest</p>
 */
public class PreCreateEnsServiceRequest extends Request {
    @Query
    @NameInMap("BandwidthType")
    @Validation(required = true)
    private String bandwidthType;

    @Query
    @NameInMap("BuyResourcesDetail")
    @Validation(required = true)
    private String buyResourcesDetail;

    @Query
    @NameInMap("DataDiskSize")
    private String dataDiskSize;

    @Query
    @NameInMap("EnsServiceName")
    @Validation(required = true)
    private String ensServiceName;

    @Query
    @NameInMap("ImageId")
    @Validation(required = true)
    private String imageId;

    @Query
    @NameInMap("InstanceBandwithdLimit")
    @Validation(required = true)
    private String instanceBandwithdLimit;

    @Query
    @NameInMap("InstanceSpec")
    @Validation(required = true)
    private String instanceSpec;

    @Query
    @NameInMap("KeyPairName")
    private String keyPairName;

    @Query
    @NameInMap("NetLevel")
    @Validation(required = true)
    private String netLevel;

    @Query
    @NameInMap("Password")
    private String password;

    @Query
    @NameInMap("SchedulingPriceStrategy")
    private String schedulingPriceStrategy;

    @Query
    @NameInMap("SchedulingStrategy")
    @Validation(required = true)
    private String schedulingStrategy;

    @Query
    @NameInMap("SystemDiskSize")
    @Validation(required = true)
    private String systemDiskSize;

    @Query
    @NameInMap("UserData")
    private String userData;

    private PreCreateEnsServiceRequest(Builder builder) {
        super(builder);
        this.bandwidthType = builder.bandwidthType;
        this.buyResourcesDetail = builder.buyResourcesDetail;
        this.dataDiskSize = builder.dataDiskSize;
        this.ensServiceName = builder.ensServiceName;
        this.imageId = builder.imageId;
        this.instanceBandwithdLimit = builder.instanceBandwithdLimit;
        this.instanceSpec = builder.instanceSpec;
        this.keyPairName = builder.keyPairName;
        this.netLevel = builder.netLevel;
        this.password = builder.password;
        this.schedulingPriceStrategy = builder.schedulingPriceStrategy;
        this.schedulingStrategy = builder.schedulingStrategy;
        this.systemDiskSize = builder.systemDiskSize;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PreCreateEnsServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bandwidthType
     */
    public String getBandwidthType() {
        return this.bandwidthType;
    }

    /**
     * @return buyResourcesDetail
     */
    public String getBuyResourcesDetail() {
        return this.buyResourcesDetail;
    }

    /**
     * @return dataDiskSize
     */
    public String getDataDiskSize() {
        return this.dataDiskSize;
    }

    /**
     * @return ensServiceName
     */
    public String getEnsServiceName() {
        return this.ensServiceName;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return instanceBandwithdLimit
     */
    public String getInstanceBandwithdLimit() {
        return this.instanceBandwithdLimit;
    }

    /**
     * @return instanceSpec
     */
    public String getInstanceSpec() {
        return this.instanceSpec;
    }

    /**
     * @return keyPairName
     */
    public String getKeyPairName() {
        return this.keyPairName;
    }

    /**
     * @return netLevel
     */
    public String getNetLevel() {
        return this.netLevel;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return schedulingPriceStrategy
     */
    public String getSchedulingPriceStrategy() {
        return this.schedulingPriceStrategy;
    }

    /**
     * @return schedulingStrategy
     */
    public String getSchedulingStrategy() {
        return this.schedulingStrategy;
    }

    /**
     * @return systemDiskSize
     */
    public String getSystemDiskSize() {
        return this.systemDiskSize;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<PreCreateEnsServiceRequest, Builder> {
        private String bandwidthType; 
        private String buyResourcesDetail; 
        private String dataDiskSize; 
        private String ensServiceName; 
        private String imageId; 
        private String instanceBandwithdLimit; 
        private String instanceSpec; 
        private String keyPairName; 
        private String netLevel; 
        private String password; 
        private String schedulingPriceStrategy; 
        private String schedulingStrategy; 
        private String systemDiskSize; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(PreCreateEnsServiceRequest request) {
            super(request);
            this.bandwidthType = request.bandwidthType;
            this.buyResourcesDetail = request.buyResourcesDetail;
            this.dataDiskSize = request.dataDiskSize;
            this.ensServiceName = request.ensServiceName;
            this.imageId = request.imageId;
            this.instanceBandwithdLimit = request.instanceBandwithdLimit;
            this.instanceSpec = request.instanceSpec;
            this.keyPairName = request.keyPairName;
            this.netLevel = request.netLevel;
            this.password = request.password;
            this.schedulingPriceStrategy = request.schedulingPriceStrategy;
            this.schedulingStrategy = request.schedulingStrategy;
            this.systemDiskSize = request.systemDiskSize;
            this.userData = request.userData;
        } 

        /**
         * BandwidthType.
         */
        public Builder bandwidthType(String bandwidthType) {
            this.putQueryParameter("BandwidthType", bandwidthType);
            this.bandwidthType = bandwidthType;
            return this;
        }

        /**
         * BuyResourcesDetail.
         */
        public Builder buyResourcesDetail(String buyResourcesDetail) {
            this.putQueryParameter("BuyResourcesDetail", buyResourcesDetail);
            this.buyResourcesDetail = buyResourcesDetail;
            return this;
        }

        /**
         * DataDiskSize.
         */
        public Builder dataDiskSize(String dataDiskSize) {
            this.putQueryParameter("DataDiskSize", dataDiskSize);
            this.dataDiskSize = dataDiskSize;
            return this;
        }

        /**
         * EnsServiceName.
         */
        public Builder ensServiceName(String ensServiceName) {
            this.putQueryParameter("EnsServiceName", ensServiceName);
            this.ensServiceName = ensServiceName;
            return this;
        }

        /**
         * ImageId.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * InstanceBandwithdLimit.
         */
        public Builder instanceBandwithdLimit(String instanceBandwithdLimit) {
            this.putQueryParameter("InstanceBandwithdLimit", instanceBandwithdLimit);
            this.instanceBandwithdLimit = instanceBandwithdLimit;
            return this;
        }

        /**
         * InstanceSpec.
         */
        public Builder instanceSpec(String instanceSpec) {
            this.putQueryParameter("InstanceSpec", instanceSpec);
            this.instanceSpec = instanceSpec;
            return this;
        }

        /**
         * KeyPairName.
         */
        public Builder keyPairName(String keyPairName) {
            this.putQueryParameter("KeyPairName", keyPairName);
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * NetLevel.
         */
        public Builder netLevel(String netLevel) {
            this.putQueryParameter("NetLevel", netLevel);
            this.netLevel = netLevel;
            return this;
        }

        /**
         * Password.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * SchedulingPriceStrategy.
         */
        public Builder schedulingPriceStrategy(String schedulingPriceStrategy) {
            this.putQueryParameter("SchedulingPriceStrategy", schedulingPriceStrategy);
            this.schedulingPriceStrategy = schedulingPriceStrategy;
            return this;
        }

        /**
         * SchedulingStrategy.
         */
        public Builder schedulingStrategy(String schedulingStrategy) {
            this.putQueryParameter("SchedulingStrategy", schedulingStrategy);
            this.schedulingStrategy = schedulingStrategy;
            return this;
        }

        /**
         * SystemDiskSize.
         */
        public Builder systemDiskSize(String systemDiskSize) {
            this.putQueryParameter("SystemDiskSize", systemDiskSize);
            this.systemDiskSize = systemDiskSize;
            return this;
        }

        /**
         * UserData.
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public PreCreateEnsServiceRequest build() {
            return new PreCreateEnsServiceRequest(this);
        } 

    } 

}
