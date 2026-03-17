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
 * {@link UpdateSmartAccessGatewayBgpRouteRequest} extends {@link RequestModel}
 *
 * <p>UpdateSmartAccessGatewayBgpRouteRequest</p>
 */
public class UpdateSmartAccessGatewayBgpRouteRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrossAccount")
    private Boolean crossAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HoldTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer holdTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeepAlive")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer keepAlive;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LocalAs")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long localAs;

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

    private UpdateSmartAccessGatewayBgpRouteRequest(Builder builder) {
        super(builder);
        this.crossAccount = builder.crossAccount;
        this.holdTime = builder.holdTime;
        this.keepAlive = builder.keepAlive;
        this.localAs = builder.localAs;
        this.regionId = builder.regionId;
        this.resourceUid = builder.resourceUid;
        this.routerId = builder.routerId;
        this.sagInsId = builder.sagInsId;
        this.sagSn = builder.sagSn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSmartAccessGatewayBgpRouteRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return crossAccount
     */
    public Boolean getCrossAccount() {
        return this.crossAccount;
    }

    /**
     * @return holdTime
     */
    public Integer getHoldTime() {
        return this.holdTime;
    }

    /**
     * @return keepAlive
     */
    public Integer getKeepAlive() {
        return this.keepAlive;
    }

    /**
     * @return localAs
     */
    public Long getLocalAs() {
        return this.localAs;
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

    public static final class Builder extends Request.Builder<UpdateSmartAccessGatewayBgpRouteRequest, Builder> {
        private Boolean crossAccount; 
        private Integer holdTime; 
        private Integer keepAlive; 
        private Long localAs; 
        private String regionId; 
        private String resourceUid; 
        private String routerId; 
        private String sagInsId; 
        private String sagSn; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSmartAccessGatewayBgpRouteRequest request) {
            super(request);
            this.crossAccount = request.crossAccount;
            this.holdTime = request.holdTime;
            this.keepAlive = request.keepAlive;
            this.localAs = request.localAs;
            this.regionId = request.regionId;
            this.resourceUid = request.resourceUid;
            this.routerId = request.routerId;
            this.sagInsId = request.sagInsId;
            this.sagSn = request.sagSn;
        } 

        /**
         * <p>Specifies whether to query only the SAG instances that belong to another Alibaba Cloud account. Valid values:</p>
         * <ul>
         * <li><strong>false</strong> (default)</li>
         * <li><strong>true</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder crossAccount(Boolean crossAccount) {
            this.putQueryParameter("CrossAccount", crossAccount);
            this.crossAccount = crossAccount;
            return this;
        }

        /**
         * <p>The hold time. Unit: seconds.</p>
         * <p>Valid values: <strong>3</strong> to <strong>65535</strong>.</p>
         * <blockquote>
         * <p>When the SAG device establishes a peering connection with a peer device, the hold time of both devices must be the same. If the SAG device does not receive a keepalive or update message from the peer device within the hold time, the connection between the BGP peers is closed.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        public Builder holdTime(Integer holdTime) {
            this.putQueryParameter("HoldTime", holdTime);
            this.holdTime = holdTime;
            return this;
        }

        /**
         * <p>The time interval at which keep-alive packets are sent. Unit: seconds.</p>
         * <p>Valid values: <strong>0</strong> to <strong>65535</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder keepAlive(Integer keepAlive) {
            this.putQueryParameter("KeepAlive", keepAlive);
            this.keepAlive = keepAlive;
            return this;
        }

        /**
         * <p>The autonomous system number (ASN) of the SAG device.</p>
         * <p>Valid values: <strong>1</strong> to <strong>4294967295</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>65536</p>
         */
        public Builder localAs(Long localAs) {
            this.putQueryParameter("LocalAs", localAs);
            this.localAs = localAs;
            return this;
        }

        /**
         * <p>The region ID of the SAG instance.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/69813.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>The ID of the Alibaba Cloud account to which the SAG instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>147304382796****</p>
         */
        public Builder resourceUid(String resourceUid) {
            this.putQueryParameter("ResourceUid", resourceUid);
            this.resourceUid = resourceUid;
            return this;
        }

        /**
         * <p>The ID of the BGP router.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>172.XX.XX.1</p>
         */
        public Builder routerId(String routerId) {
            this.putQueryParameter("RouterId", routerId);
            this.routerId = routerId;
            return this;
        }

        /**
         * <p>The ID of the Smart Access Gateway (SAG) instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sag-v9un1ccz22owd7****</p>
         */
        public Builder sagInsId(String sagInsId) {
            this.putQueryParameter("SagInsId", sagInsId);
            this.sagInsId = sagInsId;
            return this;
        }

        /**
         * <p>The serial number of the SAG device.</p>
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
        public UpdateSmartAccessGatewayBgpRouteRequest build() {
            return new UpdateSmartAccessGatewayBgpRouteRequest(this);
        } 

    } 

}
