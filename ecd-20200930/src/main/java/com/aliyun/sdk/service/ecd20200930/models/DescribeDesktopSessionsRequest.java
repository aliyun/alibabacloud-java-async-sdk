// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDesktopSessionsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDesktopSessionsRequest</p>
 */
public class DescribeDesktopSessionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckOsSession")
    private Boolean checkOsSession;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopId")
    private java.util.List < String > desktopId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopName")
    private String desktopName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndUserId")
    private String endUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
    private String officeSiteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionStatus")
    private String sessionStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubPayType")
    private String subPayType;

    private DescribeDesktopSessionsRequest(Builder builder) {
        super(builder);
        this.checkOsSession = builder.checkOsSession;
        this.desktopId = builder.desktopId;
        this.desktopName = builder.desktopName;
        this.endTime = builder.endTime;
        this.endUserId = builder.endUserId;
        this.officeSiteId = builder.officeSiteId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.sessionStatus = builder.sessionStatus;
        this.startTime = builder.startTime;
        this.subPayType = builder.subPayType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDesktopSessionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkOsSession
     */
    public Boolean getCheckOsSession() {
        return this.checkOsSession;
    }

    /**
     * @return desktopId
     */
    public java.util.List < String > getDesktopId() {
        return this.desktopId;
    }

    /**
     * @return desktopName
     */
    public String getDesktopName() {
        return this.desktopName;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return endUserId
     */
    public String getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return officeSiteId
     */
    public String getOfficeSiteId() {
        return this.officeSiteId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sessionStatus
     */
    public String getSessionStatus() {
        return this.sessionStatus;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return subPayType
     */
    public String getSubPayType() {
        return this.subPayType;
    }

    public static final class Builder extends Request.Builder<DescribeDesktopSessionsRequest, Builder> {
        private Boolean checkOsSession; 
        private java.util.List < String > desktopId; 
        private String desktopName; 
        private String endTime; 
        private String endUserId; 
        private String officeSiteId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String sessionStatus; 
        private String startTime; 
        private String subPayType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDesktopSessionsRequest request) {
            super(request);
            this.checkOsSession = request.checkOsSession;
            this.desktopId = request.desktopId;
            this.desktopName = request.desktopName;
            this.endTime = request.endTime;
            this.endUserId = request.endUserId;
            this.officeSiteId = request.officeSiteId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.sessionStatus = request.sessionStatus;
            this.startTime = request.startTime;
            this.subPayType = request.subPayType;
        } 

        /**
         * CheckOsSession.
         */
        public Builder checkOsSession(Boolean checkOsSession) {
            this.putQueryParameter("CheckOsSession", checkOsSession);
            this.checkOsSession = checkOsSession;
            return this;
        }

        /**
         * The IDs of the cloud computers. You can specify the IDs of 1 to 100 cloud computers.
         */
        public Builder desktopId(java.util.List < String > desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * The name of the cloud computer.
         */
        public Builder desktopName(String desktopName) {
            this.putQueryParameter("DesktopName", desktopName);
            this.desktopName = desktopName;
            return this;
        }

        /**
         * The end of the time range to query.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The ID of the end user.
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * The ID of the office network.
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the region. You can call the [DescribeRegions](~~196646~~) operation to query the regions supported by Elastic Desktop Service.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The state of the session.
         * <p>
         * 
         * Valid values:
         * 
         * *   Connected
         * *   Disconnected
         */
        public Builder sessionStatus(String sessionStatus) {
            this.putQueryParameter("SessionStatus", sessionStatus);
            this.sessionStatus = sessionStatus;
            return this;
        }

        /**
         * The start of the time range to query.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * SubPayType.
         */
        public Builder subPayType(String subPayType) {
            this.putQueryParameter("SubPayType", subPayType);
            this.subPayType = subPayType;
            return this;
        }

        @Override
        public DescribeDesktopSessionsRequest build() {
            return new DescribeDesktopSessionsRequest(this);
        } 

    } 

}
