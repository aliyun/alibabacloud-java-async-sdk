// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServiceEntriesRequest} extends {@link RequestModel}
 *
 * <p>ListServiceEntriesRequest</p>
 */
public class ListServiceEntriesRequest extends Request {
    @Query
    @NameInMap("IoTCloudConnectorId")
    @Validation(required = true)
    private String ioTCloudConnectorId;

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
    @NameInMap("ServiceEntryIds")
    private java.util.List < String > serviceEntryIds;

    @Query
    @NameInMap("ServiceEntryName")
    private java.util.List < String > serviceEntryName;

    @Query
    @NameInMap("ServiceEntryStatus")
    private java.util.List < String > serviceEntryStatus;

    @Query
    @NameInMap("ServiceId")
    @Validation(required = true)
    private String serviceId;

    @Query
    @NameInMap("Target")
    private java.util.List < String > target;

    @Query
    @NameInMap("TargetType")
    private java.util.List < String > targetType;

    private ListServiceEntriesRequest(Builder builder) {
        super(builder);
        this.ioTCloudConnectorId = builder.ioTCloudConnectorId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.serviceEntryIds = builder.serviceEntryIds;
        this.serviceEntryName = builder.serviceEntryName;
        this.serviceEntryStatus = builder.serviceEntryStatus;
        this.serviceId = builder.serviceId;
        this.target = builder.target;
        this.targetType = builder.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceEntriesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ioTCloudConnectorId
     */
    public String getIoTCloudConnectorId() {
        return this.ioTCloudConnectorId;
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
     * @return serviceEntryIds
     */
    public java.util.List < String > getServiceEntryIds() {
        return this.serviceEntryIds;
    }

    /**
     * @return serviceEntryName
     */
    public java.util.List < String > getServiceEntryName() {
        return this.serviceEntryName;
    }

    /**
     * @return serviceEntryStatus
     */
    public java.util.List < String > getServiceEntryStatus() {
        return this.serviceEntryStatus;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return target
     */
    public java.util.List < String > getTarget() {
        return this.target;
    }

    /**
     * @return targetType
     */
    public java.util.List < String > getTargetType() {
        return this.targetType;
    }

    public static final class Builder extends Request.Builder<ListServiceEntriesRequest, Builder> {
        private String ioTCloudConnectorId; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 
        private java.util.List < String > serviceEntryIds; 
        private java.util.List < String > serviceEntryName; 
        private java.util.List < String > serviceEntryStatus; 
        private String serviceId; 
        private java.util.List < String > target; 
        private java.util.List < String > targetType; 

        private Builder() {
            super();
        } 

        private Builder(ListServiceEntriesRequest request) {
            super(request);
            this.ioTCloudConnectorId = request.ioTCloudConnectorId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.serviceEntryIds = request.serviceEntryIds;
            this.serviceEntryName = request.serviceEntryName;
            this.serviceEntryStatus = request.serviceEntryStatus;
            this.serviceId = request.serviceId;
            this.target = request.target;
            this.targetType = request.targetType;
        } 

        /**
         * IoTCloudConnectorId.
         */
        public Builder ioTCloudConnectorId(String ioTCloudConnectorId) {
            this.putQueryParameter("IoTCloudConnectorId", ioTCloudConnectorId);
            this.ioTCloudConnectorId = ioTCloudConnectorId;
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
         * ServiceEntryIds.
         */
        public Builder serviceEntryIds(java.util.List < String > serviceEntryIds) {
            this.putQueryParameter("ServiceEntryIds", serviceEntryIds);
            this.serviceEntryIds = serviceEntryIds;
            return this;
        }

        /**
         * ServiceEntryName.
         */
        public Builder serviceEntryName(java.util.List < String > serviceEntryName) {
            this.putQueryParameter("ServiceEntryName", serviceEntryName);
            this.serviceEntryName = serviceEntryName;
            return this;
        }

        /**
         * ServiceEntryStatus.
         */
        public Builder serviceEntryStatus(java.util.List < String > serviceEntryStatus) {
            this.putQueryParameter("ServiceEntryStatus", serviceEntryStatus);
            this.serviceEntryStatus = serviceEntryStatus;
            return this;
        }

        /**
         * ServiceId.
         */
        public Builder serviceId(String serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * Target.
         */
        public Builder target(java.util.List < String > target) {
            this.putQueryParameter("Target", target);
            this.target = target;
            return this;
        }

        /**
         * TargetType.
         */
        public Builder targetType(java.util.List < String > targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        @Override
        public ListServiceEntriesRequest build() {
            return new ListServiceEntriesRequest(this);
        } 

    } 

}
