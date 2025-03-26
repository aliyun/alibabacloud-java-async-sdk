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
 * {@link ListErRouteMapsRequest} extends {@link RequestModel}
 *
 * <p>ListErRouteMapsRequest</p>
 */
public class ListErRouteMapsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DestinationCidrBlock")
    private String destinationCidrBlock;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnablePage")
    private Boolean enablePage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ErId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String erId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ErRouteMapId")
    private String erRouteMapId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ErRouteMapNum")
    private Integer erRouteMapNum;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReceptionInstanceId")
    private String receptionInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReceptionInstanceName")
    private String receptionInstanceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReceptionInstanceType")
    private String receptionInstanceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RouteMapAction")
    private String routeMapAction;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TransmissionInstanceId")
    private String transmissionInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TransmissionInstanceName")
    private String transmissionInstanceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TransmissionInstanceType")
    private String transmissionInstanceType;

    private ListErRouteMapsRequest(Builder builder) {
        super(builder);
        this.destinationCidrBlock = builder.destinationCidrBlock;
        this.enablePage = builder.enablePage;
        this.erId = builder.erId;
        this.erRouteMapId = builder.erRouteMapId;
        this.erRouteMapNum = builder.erRouteMapNum;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.receptionInstanceId = builder.receptionInstanceId;
        this.receptionInstanceName = builder.receptionInstanceName;
        this.receptionInstanceType = builder.receptionInstanceType;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.routeMapAction = builder.routeMapAction;
        this.transmissionInstanceId = builder.transmissionInstanceId;
        this.transmissionInstanceName = builder.transmissionInstanceName;
        this.transmissionInstanceType = builder.transmissionInstanceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListErRouteMapsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return destinationCidrBlock
     */
    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    /**
     * @return enablePage
     */
    public Boolean getEnablePage() {
        return this.enablePage;
    }

    /**
     * @return erId
     */
    public String getErId() {
        return this.erId;
    }

    /**
     * @return erRouteMapId
     */
    public String getErRouteMapId() {
        return this.erRouteMapId;
    }

    /**
     * @return erRouteMapNum
     */
    public Integer getErRouteMapNum() {
        return this.erRouteMapNum;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return receptionInstanceId
     */
    public String getReceptionInstanceId() {
        return this.receptionInstanceId;
    }

    /**
     * @return receptionInstanceName
     */
    public String getReceptionInstanceName() {
        return this.receptionInstanceName;
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return routeMapAction
     */
    public String getRouteMapAction() {
        return this.routeMapAction;
    }

    /**
     * @return transmissionInstanceId
     */
    public String getTransmissionInstanceId() {
        return this.transmissionInstanceId;
    }

    /**
     * @return transmissionInstanceName
     */
    public String getTransmissionInstanceName() {
        return this.transmissionInstanceName;
    }

    /**
     * @return transmissionInstanceType
     */
    public String getTransmissionInstanceType() {
        return this.transmissionInstanceType;
    }

    public static final class Builder extends Request.Builder<ListErRouteMapsRequest, Builder> {
        private String destinationCidrBlock; 
        private Boolean enablePage; 
        private String erId; 
        private String erRouteMapId; 
        private Integer erRouteMapNum; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String receptionInstanceId; 
        private String receptionInstanceName; 
        private String receptionInstanceType; 
        private String regionId; 
        private String resourceGroupId; 
        private String routeMapAction; 
        private String transmissionInstanceId; 
        private String transmissionInstanceName; 
        private String transmissionInstanceType; 

        private Builder() {
            super();
        } 

        private Builder(ListErRouteMapsRequest request) {
            super(request);
            this.destinationCidrBlock = request.destinationCidrBlock;
            this.enablePage = request.enablePage;
            this.erId = request.erId;
            this.erRouteMapId = request.erRouteMapId;
            this.erRouteMapNum = request.erRouteMapNum;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.receptionInstanceId = request.receptionInstanceId;
            this.receptionInstanceName = request.receptionInstanceName;
            this.receptionInstanceType = request.receptionInstanceType;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.routeMapAction = request.routeMapAction;
            this.transmissionInstanceId = request.transmissionInstanceId;
            this.transmissionInstanceName = request.transmissionInstanceName;
            this.transmissionInstanceType = request.transmissionInstanceType;
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
         * <p>Specifies whether to enable paged query.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enablePage(Boolean enablePage) {
            this.putBodyParameter("EnablePage", enablePage);
            this.enablePage = enablePage;
            return this;
        }

        /**
         * <p>Elastic Router ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>er-kkopgtne</p>
         */
        public Builder erId(String erId) {
            this.putBodyParameter("ErId", erId);
            this.erId = erId;
            return this;
        }

        /**
         * <p>routing policy ID</p>
         * 
         * <strong>example:</strong>
         * <p>er-rmap-uwglhzom</p>
         */
        public Builder erRouteMapId(String erRouteMapId) {
            this.putBodyParameter("ErRouteMapId", erRouteMapId);
            this.erRouteMapId = erRouteMapId;
            return this;
        }

        /**
         * <p>Policy number (default for automatic creation is 3000; The value range of the policy number manually created by the user is 1001-2000)</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        public Builder erRouteMapNum(Integer erRouteMapNum) {
            this.putBodyParameter("ErRouteMapNum", erRouteMapNum);
            this.erRouteMapNum = erRouteMapNum;
            return this;
        }

        /**
         * <p>The page number of the page to return. Pages start from page 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Receive Instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-x2lohgpv</p>
         */
        public Builder receptionInstanceId(String receptionInstanceId) {
            this.putBodyParameter("ReceptionInstanceId", receptionInstanceId);
            this.receptionInstanceId = receptionInstanceId;
            return this;
        }

        /**
         * <p>Receive Instance Name</p>
         * 
         * <strong>example:</strong>
         * <p>vpd2</p>
         */
        public Builder receptionInstanceName(String receptionInstanceName) {
            this.putBodyParameter("ReceptionInstanceName", receptionInstanceName);
            this.receptionInstanceName = receptionInstanceName;
            return this;
        }

        /**
         * <p>The type of the received instance. Optional values:</p>
         * <ul>
         * <li><strong>VPD</strong>: Lingjun network segment.</li>
         * <li><strong>VCC</strong>: Lingjun Connection.</li>
         * </ul>
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
         * <p>Resource group instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzaq3ypaqkdy</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>Policy behavior; optional values:</p>
         * <ul>
         * <li><strong>permit</strong>: Allow</li>
         * <li><strong>deny</strong>: Rejected</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>deny</p>
         */
        public Builder routeMapAction(String routeMapAction) {
            this.putBodyParameter("RouteMapAction", routeMapAction);
            this.routeMapAction = routeMapAction;
            return this;
        }

        /**
         * <p>Release Instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-xsdlg2xb</p>
         */
        public Builder transmissionInstanceId(String transmissionInstanceId) {
            this.putBodyParameter("TransmissionInstanceId", transmissionInstanceId);
            this.transmissionInstanceId = transmissionInstanceId;
            return this;
        }

        /**
         * <p>Release Instance Name</p>
         * 
         * <strong>example:</strong>
         * <p>vpd1</p>
         */
        public Builder transmissionInstanceName(String transmissionInstanceName) {
            this.putBodyParameter("TransmissionInstanceName", transmissionInstanceName);
            this.transmissionInstanceName = transmissionInstanceName;
            return this;
        }

        /**
         * <p>The type of the published instance. Optional values:</p>
         * <ul>
         * <li><strong>VPD</strong>: Lingjun network segment.</li>
         * <li><strong>VCC</strong>: Lingjun Connection.</li>
         * </ul>
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
        public ListErRouteMapsRequest build() {
            return new ListErRouteMapsRequest(this);
        } 

    } 

}
