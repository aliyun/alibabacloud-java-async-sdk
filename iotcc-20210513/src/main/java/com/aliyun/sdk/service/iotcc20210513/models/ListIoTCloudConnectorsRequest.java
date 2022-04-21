// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIoTCloudConnectorsRequest} extends {@link RequestModel}
 *
 * <p>ListIoTCloudConnectorsRequest</p>
 */
public class ListIoTCloudConnectorsRequest extends Request {
    @Query
    @NameInMap("APN")
    private java.util.List < String > APN;

    @Query
    @NameInMap("ISP")
    private java.util.List < String > ISP;

    @Query
    @NameInMap("IoTCloudConnectorGroupId")
    private String ioTCloudConnectorGroupId;

    @Query
    @NameInMap("IoTCloudConnectorIds")
    private java.util.List < String > ioTCloudConnectorIds;

    @Query
    @NameInMap("IoTCloudConnectorName")
    private java.util.List < String > ioTCloudConnectorName;

    @Query
    @NameInMap("IoTCloudConnectorStatus")
    private java.util.List < String > ioTCloudConnectorStatus;

    @Query
    @NameInMap("IsInGroup")
    private Boolean isInGroup;

    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 50, minimum = 1)
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("VpcId")
    private java.util.List < String > vpcId;

    private ListIoTCloudConnectorsRequest(Builder builder) {
        super(builder);
        this.APN = builder.APN;
        this.ISP = builder.ISP;
        this.ioTCloudConnectorGroupId = builder.ioTCloudConnectorGroupId;
        this.ioTCloudConnectorIds = builder.ioTCloudConnectorIds;
        this.ioTCloudConnectorName = builder.ioTCloudConnectorName;
        this.ioTCloudConnectorStatus = builder.ioTCloudConnectorStatus;
        this.isInGroup = builder.isInGroup;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIoTCloudConnectorsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return APN
     */
    public java.util.List < String > getAPN() {
        return this.APN;
    }

    /**
     * @return ISP
     */
    public java.util.List < String > getISP() {
        return this.ISP;
    }

    /**
     * @return ioTCloudConnectorGroupId
     */
    public String getIoTCloudConnectorGroupId() {
        return this.ioTCloudConnectorGroupId;
    }

    /**
     * @return ioTCloudConnectorIds
     */
    public java.util.List < String > getIoTCloudConnectorIds() {
        return this.ioTCloudConnectorIds;
    }

    /**
     * @return ioTCloudConnectorName
     */
    public java.util.List < String > getIoTCloudConnectorName() {
        return this.ioTCloudConnectorName;
    }

    /**
     * @return ioTCloudConnectorStatus
     */
    public java.util.List < String > getIoTCloudConnectorStatus() {
        return this.ioTCloudConnectorStatus;
    }

    /**
     * @return isInGroup
     */
    public Boolean getIsInGroup() {
        return this.isInGroup;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return vpcId
     */
    public java.util.List < String > getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<ListIoTCloudConnectorsRequest, Builder> {
        private java.util.List < String > APN; 
        private java.util.List < String > ISP; 
        private String ioTCloudConnectorGroupId; 
        private java.util.List < String > ioTCloudConnectorIds; 
        private java.util.List < String > ioTCloudConnectorName; 
        private java.util.List < String > ioTCloudConnectorStatus; 
        private Boolean isInGroup; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 
        private java.util.List < String > vpcId; 

        private Builder() {
            super();
        } 

        private Builder(ListIoTCloudConnectorsRequest request) {
            super(request);
            this.APN = request.APN;
            this.ISP = request.ISP;
            this.ioTCloudConnectorGroupId = request.ioTCloudConnectorGroupId;
            this.ioTCloudConnectorIds = request.ioTCloudConnectorIds;
            this.ioTCloudConnectorName = request.ioTCloudConnectorName;
            this.ioTCloudConnectorStatus = request.ioTCloudConnectorStatus;
            this.isInGroup = request.isInGroup;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.vpcId = request.vpcId;
        } 

        /**
         * APN.
         */
        public Builder APN(java.util.List < String > APN) {
            this.putQueryParameter("APN", APN);
            this.APN = APN;
            return this;
        }

        /**
         * ISP.
         */
        public Builder ISP(java.util.List < String > ISP) {
            this.putQueryParameter("ISP", ISP);
            this.ISP = ISP;
            return this;
        }

        /**
         * IoTCloudConnectorGroupId.
         */
        public Builder ioTCloudConnectorGroupId(String ioTCloudConnectorGroupId) {
            this.putQueryParameter("IoTCloudConnectorGroupId", ioTCloudConnectorGroupId);
            this.ioTCloudConnectorGroupId = ioTCloudConnectorGroupId;
            return this;
        }

        /**
         * IoTCloudConnectorIds.
         */
        public Builder ioTCloudConnectorIds(java.util.List < String > ioTCloudConnectorIds) {
            this.putQueryParameter("IoTCloudConnectorIds", ioTCloudConnectorIds);
            this.ioTCloudConnectorIds = ioTCloudConnectorIds;
            return this;
        }

        /**
         * IoTCloudConnectorName.
         */
        public Builder ioTCloudConnectorName(java.util.List < String > ioTCloudConnectorName) {
            this.putQueryParameter("IoTCloudConnectorName", ioTCloudConnectorName);
            this.ioTCloudConnectorName = ioTCloudConnectorName;
            return this;
        }

        /**
         * IoTCloudConnectorStatus.
         */
        public Builder ioTCloudConnectorStatus(java.util.List < String > ioTCloudConnectorStatus) {
            this.putQueryParameter("IoTCloudConnectorStatus", ioTCloudConnectorStatus);
            this.ioTCloudConnectorStatus = ioTCloudConnectorStatus;
            return this;
        }

        /**
         * IsInGroup.
         */
        public Builder isInGroup(Boolean isInGroup) {
            this.putQueryParameter("IsInGroup", isInGroup);
            this.isInGroup = isInGroup;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
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
         * VpcId.
         */
        public Builder vpcId(java.util.List < String > vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public ListIoTCloudConnectorsRequest build() {
            return new ListIoTCloudConnectorsRequest(this);
        } 

    } 

}
