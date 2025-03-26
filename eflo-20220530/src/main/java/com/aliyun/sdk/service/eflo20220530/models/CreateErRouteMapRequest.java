// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

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
 * {@link CreateErRouteMapRequest} extends {@link RequestModel}
 *
 * <p>CreateErRouteMapRequest</p>
 */
public class CreateErRouteMapRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DestinationCidrBlock")
    private String destinationCidrBlock;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ErId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String erId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReceptionInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String receptionInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReceptionInstanceOwner")
    private String receptionInstanceOwner;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReceptionInstanceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String receptionInstanceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RouteMapAction")
    @com.aliyun.core.annotation.Validation(required = true)
    private String routeMapAction;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RouteMapNum")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer routeMapNum;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TransmissionInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String transmissionInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TransmissionInstanceOwner")
    private String transmissionInstanceOwner;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TransmissionInstanceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String transmissionInstanceType;

    private CreateErRouteMapRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.destinationCidrBlock = builder.destinationCidrBlock;
        this.erId = builder.erId;
        this.receptionInstanceId = builder.receptionInstanceId;
        this.receptionInstanceOwner = builder.receptionInstanceOwner;
        this.receptionInstanceType = builder.receptionInstanceType;
        this.regionId = builder.regionId;
        this.routeMapAction = builder.routeMapAction;
        this.routeMapNum = builder.routeMapNum;
        this.transmissionInstanceId = builder.transmissionInstanceId;
        this.transmissionInstanceOwner = builder.transmissionInstanceOwner;
        this.transmissionInstanceType = builder.transmissionInstanceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateErRouteMapRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return destinationCidrBlock
     */
    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    /**
     * @return erId
     */
    public String getErId() {
        return this.erId;
    }

    /**
     * @return receptionInstanceId
     */
    public String getReceptionInstanceId() {
        return this.receptionInstanceId;
    }

    /**
     * @return receptionInstanceOwner
     */
    public String getReceptionInstanceOwner() {
        return this.receptionInstanceOwner;
    }

    /**
     * @return receptionInstanceType
     */
    public String getReceptionInstanceType() {
        return this.receptionInstanceType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return routeMapAction
     */
    public String getRouteMapAction() {
        return this.routeMapAction;
    }

    /**
     * @return routeMapNum
     */
    public Integer getRouteMapNum() {
        return this.routeMapNum;
    }

    /**
     * @return transmissionInstanceId
     */
    public String getTransmissionInstanceId() {
        return this.transmissionInstanceId;
    }

    /**
     * @return transmissionInstanceOwner
     */
    public String getTransmissionInstanceOwner() {
        return this.transmissionInstanceOwner;
    }

    /**
     * @return transmissionInstanceType
     */
    public String getTransmissionInstanceType() {
        return this.transmissionInstanceType;
    }

    public static final class Builder extends Request.Builder<CreateErRouteMapRequest, Builder> {
        private String description; 
        private String destinationCidrBlock; 
        private String erId; 
        private String receptionInstanceId; 
        private String receptionInstanceOwner; 
        private String receptionInstanceType; 
        private String regionId; 
        private String routeMapAction; 
        private Integer routeMapNum; 
        private String transmissionInstanceId; 
        private String transmissionInstanceOwner; 
        private String transmissionInstanceType; 

        private Builder() {
            super();
        } 

        private Builder(CreateErRouteMapRequest request) {
            super(request);
            this.description = request.description;
            this.destinationCidrBlock = request.destinationCidrBlock;
            this.erId = request.erId;
            this.receptionInstanceId = request.receptionInstanceId;
            this.receptionInstanceOwner = request.receptionInstanceOwner;
            this.receptionInstanceType = request.receptionInstanceType;
            this.regionId = request.regionId;
            this.routeMapAction = request.routeMapAction;
            this.routeMapNum = request.routeMapNum;
            this.transmissionInstanceId = request.transmissionInstanceId;
            this.transmissionInstanceOwner = request.transmissionInstanceOwner;
            this.transmissionInstanceType = request.transmissionInstanceType;
        } 

        /**
         * <p>Policy description</p>
         * 
         * <strong>example:</strong>
         * <p>terraform-example</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Destination CIDR Block</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.0.0/0</p>
         */
        public Builder destinationCidrBlock(String destinationCidrBlock) {
            this.putBodyParameter("DestinationCidrBlock", destinationCidrBlock);
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }

        /**
         * <p>Lingjun HUB ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>er-aueyxxsy</p>
         */
        public Builder erId(String erId) {
            this.putBodyParameter("ErId", erId);
            this.erId = erId;
            return this;
        }

        /**
         * <p>The ID of the destination instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-xlhsvdvt</p>
         */
        public Builder receptionInstanceId(String receptionInstanceId) {
            this.putBodyParameter("ReceptionInstanceId", receptionInstanceId);
            this.receptionInstanceId = receptionInstanceId;
            return this;
        }

        /**
         * <p>The tenant to which the route receiving instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1620939556166277</p>
         */
        public Builder receptionInstanceOwner(String receptionInstanceOwner) {
            this.putBodyParameter("ReceptionInstanceOwner", receptionInstanceOwner);
            this.receptionInstanceOwner = receptionInstanceOwner;
            return this;
        }

        /**
         * <p>The type of the destination instance. Valid values:</p>
         * <ul>
         * <li><strong>VPD</strong>: Lingjun network segment.</li>
         * <li><strong>VCC</strong>: Lingjun Connection.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>VPD</p>
         */
        public Builder receptionInstanceType(String receptionInstanceType) {
            this.putBodyParameter("ReceptionInstanceType", receptionInstanceType);
            this.receptionInstanceType = receptionInstanceType;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Policy behavior; optional values:</p>
         * <ul>
         * <li><strong>permit</strong>: Allow</li>
         * <li><strong>deny</strong>: Rejected</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>permit</p>
         */
        public Builder routeMapAction(String routeMapAction) {
            this.putBodyParameter("RouteMapAction", routeMapAction);
            this.routeMapAction = routeMapAction;
            return this;
        }

        /**
         * <p>The ID of the policy.</p>
         * <p>A smaller sequence number indicates a lower priority. When a route is matched, a policy with a higher priority is preferentially matched.</p>
         * <p><strong>Valid values: 1001 to 2000</strong></p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        public Builder routeMapNum(Integer routeMapNum) {
            this.putBodyParameter("RouteMapNum", routeMapNum);
            this.routeMapNum = routeMapNum;
            return this;
        }

        /**
         * <p>The ID of the source instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-xlsjsdvt</p>
         */
        public Builder transmissionInstanceId(String transmissionInstanceId) {
            this.putBodyParameter("TransmissionInstanceId", transmissionInstanceId);
            this.transmissionInstanceId = transmissionInstanceId;
            return this;
        }

        /**
         * <p>The tenant to which the route publish instance belongs</p>
         * 
         * <strong>example:</strong>
         * <p>1620939556166277</p>
         */
        public Builder transmissionInstanceOwner(String transmissionInstanceOwner) {
            this.putBodyParameter("TransmissionInstanceOwner", transmissionInstanceOwner);
            this.transmissionInstanceOwner = transmissionInstanceOwner;
            return this;
        }

        /**
         * <p>The type of the source instance. Valid values:</p>
         * <ul>
         * <li><strong>VPD</strong>: Lingjun network segment.</li>
         * <li><strong>VCC</strong>: Lingjun Connection.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>VPD</p>
         */
        public Builder transmissionInstanceType(String transmissionInstanceType) {
            this.putBodyParameter("TransmissionInstanceType", transmissionInstanceType);
            this.transmissionInstanceType = transmissionInstanceType;
            return this;
        }

        @Override
        public CreateErRouteMapRequest build() {
            return new CreateErRouteMapRequest(this);
        } 

    } 

}
