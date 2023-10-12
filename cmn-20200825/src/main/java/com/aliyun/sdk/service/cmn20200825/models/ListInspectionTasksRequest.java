// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInspectionTasksRequest} extends {@link RequestModel}
 *
 * <p>ListInspectionTasksRequest</p>
 */
public class ListInspectionTasksRequest extends Request {
    @Query
    @NameInMap("AlarmStatus")
    private java.util.List < String > alarmStatus;

    @Query
    @NameInMap("DeviceType")
    private String deviceType;

    @Query
    @NameInMap("HostName")
    private String hostName;

    @Query
    @NameInMap("IP")
    private String ip;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("ItemId")
    private String itemId;

    @Query
    @NameInMap("MaxResults")
    @Validation(required = true, maximum = 1000)
    private Integer maxResults;

    @Query
    @NameInMap("Model")
    private String model;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("Role")
    private String role;

    @Query
    @NameInMap("Space")
    private String space;

    @Query
    @NameInMap("TaskStatus")
    private String taskStatus;

    @Query
    @NameInMap("Vendor")
    private String vendor;

    private ListInspectionTasksRequest(Builder builder) {
        super(builder);
        this.alarmStatus = builder.alarmStatus;
        this.deviceType = builder.deviceType;
        this.hostName = builder.hostName;
        this.ip = builder.ip;
        this.instanceId = builder.instanceId;
        this.itemId = builder.itemId;
        this.maxResults = builder.maxResults;
        this.model = builder.model;
        this.nextToken = builder.nextToken;
        this.role = builder.role;
        this.space = builder.space;
        this.taskStatus = builder.taskStatus;
        this.vendor = builder.vendor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInspectionTasksRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alarmStatus
     */
    public java.util.List < String > getAlarmStatus() {
        return this.alarmStatus;
    }

    /**
     * @return deviceType
     */
    public String getDeviceType() {
        return this.deviceType;
    }

    /**
     * @return hostName
     */
    public String getHostName() {
        return this.hostName;
    }

    /**
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return itemId
     */
    public String getItemId() {
        return this.itemId;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return role
     */
    public String getRole() {
        return this.role;
    }

    /**
     * @return space
     */
    public String getSpace() {
        return this.space;
    }

    /**
     * @return taskStatus
     */
    public String getTaskStatus() {
        return this.taskStatus;
    }

    /**
     * @return vendor
     */
    public String getVendor() {
        return this.vendor;
    }

    public static final class Builder extends Request.Builder<ListInspectionTasksRequest, Builder> {
        private java.util.List < String > alarmStatus; 
        private String deviceType; 
        private String hostName; 
        private String ip; 
        private String instanceId; 
        private String itemId; 
        private Integer maxResults; 
        private String model; 
        private String nextToken; 
        private String role; 
        private String space; 
        private String taskStatus; 
        private String vendor; 

        private Builder() {
            super();
        } 

        private Builder(ListInspectionTasksRequest request) {
            super(request);
            this.alarmStatus = request.alarmStatus;
            this.deviceType = request.deviceType;
            this.hostName = request.hostName;
            this.ip = request.ip;
            this.instanceId = request.instanceId;
            this.itemId = request.itemId;
            this.maxResults = request.maxResults;
            this.model = request.model;
            this.nextToken = request.nextToken;
            this.role = request.role;
            this.space = request.space;
            this.taskStatus = request.taskStatus;
            this.vendor = request.vendor;
        } 

        /**
         * AlarmStatus.
         */
        public Builder alarmStatus(java.util.List < String > alarmStatus) {
            String alarmStatusShrink = shrink(alarmStatus, "AlarmStatus", "json");
            this.putQueryParameter("AlarmStatus", alarmStatusShrink);
            this.alarmStatus = alarmStatus;
            return this;
        }

        /**
         * DeviceType.
         */
        public Builder deviceType(String deviceType) {
            this.putQueryParameter("DeviceType", deviceType);
            this.deviceType = deviceType;
            return this;
        }

        /**
         * HostName.
         */
        public Builder hostName(String hostName) {
            this.putQueryParameter("HostName", hostName);
            this.hostName = hostName;
            return this;
        }

        /**
         * IP.
         */
        public Builder ip(String ip) {
            this.putQueryParameter("IP", ip);
            this.ip = ip;
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
         * ItemId.
         */
        public Builder itemId(String itemId) {
            this.putQueryParameter("ItemId", itemId);
            this.itemId = itemId;
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
         * Model.
         */
        public Builder model(String model) {
            this.putQueryParameter("Model", model);
            this.model = model;
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
         * Role.
         */
        public Builder role(String role) {
            this.putQueryParameter("Role", role);
            this.role = role;
            return this;
        }

        /**
         * Space.
         */
        public Builder space(String space) {
            this.putQueryParameter("Space", space);
            this.space = space;
            return this;
        }

        /**
         * TaskStatus.
         */
        public Builder taskStatus(String taskStatus) {
            this.putQueryParameter("TaskStatus", taskStatus);
            this.taskStatus = taskStatus;
            return this;
        }

        /**
         * Vendor.
         */
        public Builder vendor(String vendor) {
            this.putQueryParameter("Vendor", vendor);
            this.vendor = vendor;
            return this;
        }

        @Override
        public ListInspectionTasksRequest build() {
            return new ListInspectionTasksRequest(this);
        } 

    } 

}
