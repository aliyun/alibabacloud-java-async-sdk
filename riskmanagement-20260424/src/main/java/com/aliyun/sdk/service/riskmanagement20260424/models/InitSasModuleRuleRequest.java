// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.riskmanagement20260424.models;

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
 * {@link InitSasModuleRuleRequest} extends {@link RequestModel}
 *
 * <p>InitSasModuleRuleRequest</p>
 */
public class InitSasModuleRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoBind")
    private Integer autoBind;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Instances")
    private java.util.List<Instances> instances;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsTrial")
    private Boolean isTrial;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private InitSasModuleRuleRequest(Builder builder) {
        super(builder);
        this.autoBind = builder.autoBind;
        this.instances = builder.instances;
        this.isTrial = builder.isTrial;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitSasModuleRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoBind
     */
    public Integer getAutoBind() {
        return this.autoBind;
    }

    /**
     * @return instances
     */
    public java.util.List<Instances> getInstances() {
        return this.instances;
    }

    /**
     * @return isTrial
     */
    public Boolean getIsTrial() {
        return this.isTrial;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<InitSasModuleRuleRequest, Builder> {
        private Integer autoBind; 
        private java.util.List<Instances> instances; 
        private Boolean isTrial; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(InitSasModuleRuleRequest request) {
            super(request);
            this.autoBind = request.autoBind;
            this.instances = request.instances;
            this.isTrial = request.isTrial;
            this.regionId = request.regionId;
        } 

        /**
         * AutoBind.
         */
        public Builder autoBind(Integer autoBind) {
            this.putQueryParameter("AutoBind", autoBind);
            this.autoBind = autoBind;
            return this;
        }

        /**
         * Instances.
         */
        public Builder instances(java.util.List<Instances> instances) {
            String instancesShrink = shrink(instances, "Instances", "json");
            this.putQueryParameter("Instances", instancesShrink);
            this.instances = instances;
            return this;
        }

        /**
         * IsTrial.
         */
        public Builder isTrial(Boolean isTrial) {
            this.putQueryParameter("IsTrial", isTrial);
            this.isTrial = isTrial;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public InitSasModuleRuleRequest build() {
            return new InitSasModuleRuleRequest(this);
        } 

    } 

    /**
     * 
     * {@link InitSasModuleRuleRequest} extends {@link TeaModel}
     *
     * <p>InitSasModuleRuleRequest</p>
     */
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cores")
        private String cores;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private Instances(Builder builder) {
            this.cores = builder.cores;
            this.instanceId = builder.instanceId;
            this.regionId = builder.regionId;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return cores
         */
        public String getCores() {
            return this.cores;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String cores; 
            private String instanceId; 
            private String regionId; 
            private String uuid; 

            private Builder() {
            } 

            private Builder(Instances model) {
                this.cores = model.cores;
                this.instanceId = model.instanceId;
                this.regionId = model.regionId;
                this.uuid = model.uuid;
            } 

            /**
             * Cores.
             */
            public Builder cores(String cores) {
                this.cores = cores;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
