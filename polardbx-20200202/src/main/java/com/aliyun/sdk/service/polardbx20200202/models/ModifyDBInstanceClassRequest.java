// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBInstanceClassRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBInstanceClassRequest</p>
 */
public class ModifyDBInstanceClassRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CnClass")
    private String cnClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DnClass")
    private String dnClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpecifiedDNScale")
    private Boolean specifiedDNScale;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpecifiedDNSpecMapJson")
    private String specifiedDNSpecMapJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SwitchTime")
    private String switchTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SwitchTimeMode")
    private String switchTimeMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetDBInstanceClass")
    private String targetDBInstanceClass;

    private ModifyDBInstanceClassRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.cnClass = builder.cnClass;
        this.DBInstanceName = builder.DBInstanceName;
        this.dnClass = builder.dnClass;
        this.regionId = builder.regionId;
        this.specifiedDNScale = builder.specifiedDNScale;
        this.specifiedDNSpecMapJson = builder.specifiedDNSpecMapJson;
        this.switchTime = builder.switchTime;
        this.switchTimeMode = builder.switchTimeMode;
        this.targetDBInstanceClass = builder.targetDBInstanceClass;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBInstanceClassRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return cnClass
     */
    public String getCnClass() {
        return this.cnClass;
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return dnClass
     */
    public String getDnClass() {
        return this.dnClass;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return specifiedDNScale
     */
    public Boolean getSpecifiedDNScale() {
        return this.specifiedDNScale;
    }

    /**
     * @return specifiedDNSpecMapJson
     */
    public String getSpecifiedDNSpecMapJson() {
        return this.specifiedDNSpecMapJson;
    }

    /**
     * @return switchTime
     */
    public String getSwitchTime() {
        return this.switchTime;
    }

    /**
     * @return switchTimeMode
     */
    public String getSwitchTimeMode() {
        return this.switchTimeMode;
    }

    /**
     * @return targetDBInstanceClass
     */
    public String getTargetDBInstanceClass() {
        return this.targetDBInstanceClass;
    }

    public static final class Builder extends Request.Builder<ModifyDBInstanceClassRequest, Builder> {
        private String clientToken; 
        private String cnClass; 
        private String DBInstanceName; 
        private String dnClass; 
        private String regionId; 
        private Boolean specifiedDNScale; 
        private String specifiedDNSpecMapJson; 
        private String switchTime; 
        private String switchTimeMode; 
        private String targetDBInstanceClass; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBInstanceClassRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.cnClass = request.cnClass;
            this.DBInstanceName = request.DBInstanceName;
            this.dnClass = request.dnClass;
            this.regionId = request.regionId;
            this.specifiedDNScale = request.specifiedDNScale;
            this.specifiedDNSpecMapJson = request.specifiedDNSpecMapJson;
            this.switchTime = request.switchTime;
            this.switchTimeMode = request.switchTimeMode;
            this.targetDBInstanceClass = request.targetDBInstanceClass;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * CnClass.
         */
        public Builder cnClass(String cnClass) {
            this.putQueryParameter("CnClass", cnClass);
            this.cnClass = cnClass;
            return this;
        }

        /**
         * DBInstanceName.
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * DnClass.
         */
        public Builder dnClass(String dnClass) {
            this.putQueryParameter("DnClass", dnClass);
            this.dnClass = dnClass;
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

        /**
         * SpecifiedDNScale.
         */
        public Builder specifiedDNScale(Boolean specifiedDNScale) {
            this.putQueryParameter("SpecifiedDNScale", specifiedDNScale);
            this.specifiedDNScale = specifiedDNScale;
            return this;
        }

        /**
         * SpecifiedDNSpecMapJson.
         */
        public Builder specifiedDNSpecMapJson(String specifiedDNSpecMapJson) {
            this.putQueryParameter("SpecifiedDNSpecMapJson", specifiedDNSpecMapJson);
            this.specifiedDNSpecMapJson = specifiedDNSpecMapJson;
            return this;
        }

        /**
         * SwitchTime.
         */
        public Builder switchTime(String switchTime) {
            this.putQueryParameter("SwitchTime", switchTime);
            this.switchTime = switchTime;
            return this;
        }

        /**
         * SwitchTimeMode.
         */
        public Builder switchTimeMode(String switchTimeMode) {
            this.putQueryParameter("SwitchTimeMode", switchTimeMode);
            this.switchTimeMode = switchTimeMode;
            return this;
        }

        /**
         * TargetDBInstanceClass.
         */
        public Builder targetDBInstanceClass(String targetDBInstanceClass) {
            this.putQueryParameter("TargetDBInstanceClass", targetDBInstanceClass);
            this.targetDBInstanceClass = targetDBInstanceClass;
            return this;
        }

        @Override
        public ModifyDBInstanceClassRequest build() {
            return new ModifyDBInstanceClassRequest(this);
        } 

    } 

}
