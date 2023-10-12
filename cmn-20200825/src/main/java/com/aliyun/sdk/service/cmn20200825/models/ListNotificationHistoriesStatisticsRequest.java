// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNotificationHistoriesStatisticsRequest} extends {@link RequestModel}
 *
 * <p>ListNotificationHistoriesStatisticsRequest</p>
 */
public class ListNotificationHistoriesStatisticsRequest extends Request {
    @Query
    @NameInMap("End")
    @Validation(maximum = 2208960000D, minimum = 1604160000)
    private Long end;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("IsDedicatedLine")
    private Boolean isDedicatedLine;

    @Query
    @NameInMap("IsDevice")
    private Boolean isDevice;

    @Query
    @NameInMap("IsMonitorItem")
    private Boolean isMonitorItem;

    @Query
    @NameInMap("IsPhysicalSpace")
    private Boolean isPhysicalSpace;

    @Query
    @NameInMap("MaxResults")
    @Validation(required = true, maximum = 100, minimum = 1)
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("PhysicalSpaceId")
    private String physicalSpaceId;

    @Query
    @NameInMap("Start")
    @Validation(maximum = 2208960000D, minimum = 1604160000)
    private Long start;

    @Query
    @NameInMap("Type")
    private String type;

    private ListNotificationHistoriesStatisticsRequest(Builder builder) {
        super(builder);
        this.end = builder.end;
        this.instanceId = builder.instanceId;
        this.isDedicatedLine = builder.isDedicatedLine;
        this.isDevice = builder.isDevice;
        this.isMonitorItem = builder.isMonitorItem;
        this.isPhysicalSpace = builder.isPhysicalSpace;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.physicalSpaceId = builder.physicalSpaceId;
        this.start = builder.start;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNotificationHistoriesStatisticsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return end
     */
    public Long getEnd() {
        return this.end;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return isDedicatedLine
     */
    public Boolean getIsDedicatedLine() {
        return this.isDedicatedLine;
    }

    /**
     * @return isDevice
     */
    public Boolean getIsDevice() {
        return this.isDevice;
    }

    /**
     * @return isMonitorItem
     */
    public Boolean getIsMonitorItem() {
        return this.isMonitorItem;
    }

    /**
     * @return isPhysicalSpace
     */
    public Boolean getIsPhysicalSpace() {
        return this.isPhysicalSpace;
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
     * @return physicalSpaceId
     */
    public String getPhysicalSpaceId() {
        return this.physicalSpaceId;
    }

    /**
     * @return start
     */
    public Long getStart() {
        return this.start;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListNotificationHistoriesStatisticsRequest, Builder> {
        private Long end; 
        private String instanceId; 
        private Boolean isDedicatedLine; 
        private Boolean isDevice; 
        private Boolean isMonitorItem; 
        private Boolean isPhysicalSpace; 
        private Integer maxResults; 
        private String nextToken; 
        private String physicalSpaceId; 
        private Long start; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListNotificationHistoriesStatisticsRequest request) {
            super(request);
            this.end = request.end;
            this.instanceId = request.instanceId;
            this.isDedicatedLine = request.isDedicatedLine;
            this.isDevice = request.isDevice;
            this.isMonitorItem = request.isMonitorItem;
            this.isPhysicalSpace = request.isPhysicalSpace;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.physicalSpaceId = request.physicalSpaceId;
            this.start = request.start;
            this.type = request.type;
        } 

        /**
         * End.
         */
        public Builder end(Long end) {
            this.putQueryParameter("End", end);
            this.end = end;
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
         * IsDedicatedLine.
         */
        public Builder isDedicatedLine(Boolean isDedicatedLine) {
            this.putQueryParameter("IsDedicatedLine", isDedicatedLine);
            this.isDedicatedLine = isDedicatedLine;
            return this;
        }

        /**
         * IsDevice.
         */
        public Builder isDevice(Boolean isDevice) {
            this.putQueryParameter("IsDevice", isDevice);
            this.isDevice = isDevice;
            return this;
        }

        /**
         * IsMonitorItem.
         */
        public Builder isMonitorItem(Boolean isMonitorItem) {
            this.putQueryParameter("IsMonitorItem", isMonitorItem);
            this.isMonitorItem = isMonitorItem;
            return this;
        }

        /**
         * IsPhysicalSpace.
         */
        public Builder isPhysicalSpace(Boolean isPhysicalSpace) {
            this.putQueryParameter("IsPhysicalSpace", isPhysicalSpace);
            this.isPhysicalSpace = isPhysicalSpace;
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
         * PhysicalSpaceId.
         */
        public Builder physicalSpaceId(String physicalSpaceId) {
            this.putQueryParameter("PhysicalSpaceId", physicalSpaceId);
            this.physicalSpaceId = physicalSpaceId;
            return this;
        }

        /**
         * Start.
         */
        public Builder start(Long start) {
            this.putQueryParameter("Start", start);
            this.start = start;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListNotificationHistoriesStatisticsRequest build() {
            return new ListNotificationHistoriesStatisticsRequest(this);
        } 

    } 

}
