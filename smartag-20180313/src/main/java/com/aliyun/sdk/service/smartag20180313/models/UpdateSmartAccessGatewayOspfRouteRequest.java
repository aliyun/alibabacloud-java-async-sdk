// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link UpdateSmartAccessGatewayOspfRouteRequest} extends {@link RequestModel}
 *
 * <p>UpdateSmartAccessGatewayOspfRouteRequest</p>
 */
public class UpdateSmartAccessGatewayOspfRouteRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AreaId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer areaId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthenticationType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authenticationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrossAccount")
    private Boolean crossAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeadTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer deadTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HelloTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer helloTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InterfaceName")
    private String interfaceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Md5Key")
    private String md5Key;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Md5KeyId")
    private Integer md5KeyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Networks")
    private String networks;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OspfCost")
    private Integer ospfCost;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OspfNetworkType")
    private String ospfNetworkType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RedistributeProtocol")
    private String redistributeProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceUid")
    private String resourceUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String routerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SagInsId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sagInsId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SagSn")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sagSn;

    private UpdateSmartAccessGatewayOspfRouteRequest(Builder builder) {
        super(builder);
        this.areaId = builder.areaId;
        this.authenticationType = builder.authenticationType;
        this.crossAccount = builder.crossAccount;
        this.deadTime = builder.deadTime;
        this.helloTime = builder.helloTime;
        this.interfaceName = builder.interfaceName;
        this.md5Key = builder.md5Key;
        this.md5KeyId = builder.md5KeyId;
        this.networks = builder.networks;
        this.ospfCost = builder.ospfCost;
        this.ospfNetworkType = builder.ospfNetworkType;
        this.password = builder.password;
        this.redistributeProtocol = builder.redistributeProtocol;
        this.regionId = builder.regionId;
        this.resourceUid = builder.resourceUid;
        this.routerId = builder.routerId;
        this.sagInsId = builder.sagInsId;
        this.sagSn = builder.sagSn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSmartAccessGatewayOspfRouteRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return areaId
     */
    public Integer getAreaId() {
        return this.areaId;
    }

    /**
     * @return authenticationType
     */
    public String getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * @return crossAccount
     */
    public Boolean getCrossAccount() {
        return this.crossAccount;
    }

    /**
     * @return deadTime
     */
    public Integer getDeadTime() {
        return this.deadTime;
    }

    /**
     * @return helloTime
     */
    public Integer getHelloTime() {
        return this.helloTime;
    }

    /**
     * @return interfaceName
     */
    public String getInterfaceName() {
        return this.interfaceName;
    }

    /**
     * @return md5Key
     */
    public String getMd5Key() {
        return this.md5Key;
    }

    /**
     * @return md5KeyId
     */
    public Integer getMd5KeyId() {
        return this.md5KeyId;
    }

    /**
     * @return networks
     */
    public String getNetworks() {
        return this.networks;
    }

    /**
     * @return ospfCost
     */
    public Integer getOspfCost() {
        return this.ospfCost;
    }

    /**
     * @return ospfNetworkType
     */
    public String getOspfNetworkType() {
        return this.ospfNetworkType;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return redistributeProtocol
     */
    public String getRedistributeProtocol() {
        return this.redistributeProtocol;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceUid
     */
    public String getResourceUid() {
        return this.resourceUid;
    }

    /**
     * @return routerId
     */
    public String getRouterId() {
        return this.routerId;
    }

    /**
     * @return sagInsId
     */
    public String getSagInsId() {
        return this.sagInsId;
    }

    /**
     * @return sagSn
     */
    public String getSagSn() {
        return this.sagSn;
    }

    public static final class Builder extends Request.Builder<UpdateSmartAccessGatewayOspfRouteRequest, Builder> {
        private Integer areaId; 
        private String authenticationType; 
        private Boolean crossAccount; 
        private Integer deadTime; 
        private Integer helloTime; 
        private String interfaceName; 
        private String md5Key; 
        private Integer md5KeyId; 
        private String networks; 
        private Integer ospfCost; 
        private String ospfNetworkType; 
        private String password; 
        private String redistributeProtocol; 
        private String regionId; 
        private String resourceUid; 
        private String routerId; 
        private String sagInsId; 
        private String sagSn; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSmartAccessGatewayOspfRouteRequest request) {
            super(request);
            this.areaId = request.areaId;
            this.authenticationType = request.authenticationType;
            this.crossAccount = request.crossAccount;
            this.deadTime = request.deadTime;
            this.helloTime = request.helloTime;
            this.interfaceName = request.interfaceName;
            this.md5Key = request.md5Key;
            this.md5KeyId = request.md5KeyId;
            this.networks = request.networks;
            this.ospfCost = request.ospfCost;
            this.ospfNetworkType = request.ospfNetworkType;
            this.password = request.password;
            this.redistributeProtocol = request.redistributeProtocol;
            this.regionId = request.regionId;
            this.resourceUid = request.resourceUid;
            this.routerId = request.routerId;
            this.sagInsId = request.sagInsId;
            this.sagSn = request.sagSn;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder areaId(Integer areaId) {
            this.putQueryParameter("AreaId", areaId);
            this.areaId = areaId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MD5</p>
         */
        public Builder authenticationType(String authenticationType) {
            this.putQueryParameter("AuthenticationType", authenticationType);
            this.authenticationType = authenticationType;
            return this;
        }

        /**
         * CrossAccount.
         */
        public Builder crossAccount(Boolean crossAccount) {
            this.putQueryParameter("CrossAccount", crossAccount);
            this.crossAccount = crossAccount;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        public Builder deadTime(Integer deadTime) {
            this.putQueryParameter("DeadTime", deadTime);
            this.deadTime = deadTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder helloTime(Integer helloTime) {
            this.putQueryParameter("HelloTime", helloTime);
            this.helloTime = helloTime;
            return this;
        }

        /**
         * InterfaceName.
         */
        public Builder interfaceName(String interfaceName) {
            this.putQueryParameter("InterfaceName", interfaceName);
            this.interfaceName = interfaceName;
            return this;
        }

        /**
         * Md5Key.
         */
        public Builder md5Key(String md5Key) {
            this.putQueryParameter("Md5Key", md5Key);
            this.md5Key = md5Key;
            return this;
        }

        /**
         * Md5KeyId.
         */
        public Builder md5KeyId(Integer md5KeyId) {
            this.putQueryParameter("Md5KeyId", md5KeyId);
            this.md5KeyId = md5KeyId;
            return this;
        }

        /**
         * Networks.
         */
        public Builder networks(String networks) {
            this.putQueryParameter("Networks", networks);
            this.networks = networks;
            return this;
        }

        /**
         * OspfCost.
         */
        public Builder ospfCost(Integer ospfCost) {
            this.putQueryParameter("OspfCost", ospfCost);
            this.ospfCost = ospfCost;
            return this;
        }

        /**
         * OspfNetworkType.
         */
        public Builder ospfNetworkType(String ospfNetworkType) {
            this.putQueryParameter("OspfNetworkType", ospfNetworkType);
            this.ospfNetworkType = ospfNetworkType;
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
         * RedistributeProtocol.
         */
        public Builder redistributeProtocol(String redistributeProtocol) {
            this.putQueryParameter("RedistributeProtocol", redistributeProtocol);
            this.redistributeProtocol = redistributeProtocol;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceUid.
         */
        public Builder resourceUid(String resourceUid) {
            this.putQueryParameter("ResourceUid", resourceUid);
            this.resourceUid = resourceUid;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>192.XX.XX.1</p>
         */
        public Builder routerId(String routerId) {
            this.putQueryParameter("RouterId", routerId);
            this.routerId = routerId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sag-3manef62evrfr6****</p>
         */
        public Builder sagInsId(String sagInsId) {
            this.putQueryParameter("SagInsId", sagInsId);
            this.sagInsId = sagInsId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sagf4dk****</p>
         */
        public Builder sagSn(String sagSn) {
            this.putQueryParameter("SagSn", sagSn);
            this.sagSn = sagSn;
            return this;
        }

        @Override
        public UpdateSmartAccessGatewayOspfRouteRequest build() {
            return new UpdateSmartAccessGatewayOspfRouteRequest(this);
        } 

    } 

}
