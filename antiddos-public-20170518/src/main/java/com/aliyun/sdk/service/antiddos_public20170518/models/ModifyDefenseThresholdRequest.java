// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.antiddos_public20170518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDefenseThresholdRequest} extends {@link RequestModel}
 *
 * <p>ModifyDefenseThresholdRequest</p>
 */
public class ModifyDefenseThresholdRequest extends Request {
    @Query
    @NameInMap("Bps")
    private Integer bps;

    @Query
    @NameInMap("DdosRegionId")
    @Validation(required = true)
    private String ddosRegionId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("InstanceType")
    @Validation(required = true)
    private String instanceType;

    @Query
    @NameInMap("InternetIp")
    private String internetIp;

    @Query
    @NameInMap("IsAuto")
    private Boolean isAuto;

    @Query
    @NameInMap("Pps")
    private Integer pps;

    private ModifyDefenseThresholdRequest(Builder builder) {
        super(builder);
        this.bps = builder.bps;
        this.ddosRegionId = builder.ddosRegionId;
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
        this.internetIp = builder.internetIp;
        this.isAuto = builder.isAuto;
        this.pps = builder.pps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDefenseThresholdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bps
     */
    public Integer getBps() {
        return this.bps;
    }

    /**
     * @return ddosRegionId
     */
    public String getDdosRegionId() {
        return this.ddosRegionId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return internetIp
     */
    public String getInternetIp() {
        return this.internetIp;
    }

    /**
     * @return isAuto
     */
    public Boolean getIsAuto() {
        return this.isAuto;
    }

    /**
     * @return pps
     */
    public Integer getPps() {
        return this.pps;
    }

    public static final class Builder extends Request.Builder<ModifyDefenseThresholdRequest, Builder> {
        private Integer bps; 
        private String ddosRegionId; 
        private String instanceId; 
        private String instanceType; 
        private String internetIp; 
        private Boolean isAuto; 
        private Integer pps; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDefenseThresholdRequest request) {
            super(request);
            this.bps = request.bps;
            this.ddosRegionId = request.ddosRegionId;
            this.instanceId = request.instanceId;
            this.instanceType = request.instanceType;
            this.internetIp = request.internetIp;
            this.isAuto = request.isAuto;
            this.pps = request.pps;
        } 

        /**
         * Bps.
         */
        public Builder bps(Integer bps) {
            this.putQueryParameter("Bps", bps);
            this.bps = bps;
            return this;
        }

        /**
         * DdosRegionId.
         */
        public Builder ddosRegionId(String ddosRegionId) {
            this.putQueryParameter("DdosRegionId", ddosRegionId);
            this.ddosRegionId = ddosRegionId;
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
         * InstanceType.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * InternetIp.
         */
        public Builder internetIp(String internetIp) {
            this.putQueryParameter("InternetIp", internetIp);
            this.internetIp = internetIp;
            return this;
        }

        /**
         * IsAuto.
         */
        public Builder isAuto(Boolean isAuto) {
            this.putQueryParameter("IsAuto", isAuto);
            this.isAuto = isAuto;
            return this;
        }

        /**
         * Pps.
         */
        public Builder pps(Integer pps) {
            this.putQueryParameter("Pps", pps);
            this.pps = pps;
            return this;
        }

        @Override
        public ModifyDefenseThresholdRequest build() {
            return new ModifyDefenseThresholdRequest(this);
        } 

    } 

}
