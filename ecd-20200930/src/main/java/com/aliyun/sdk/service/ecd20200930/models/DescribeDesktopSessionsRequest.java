// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
    private java.util.List<String> desktopId;

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
    @com.aliyun.core.annotation.NameInMap("EndUserIdFilter")
    private String endUserIdFilter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FillHardwareInfo")
    private Boolean fillHardwareInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

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
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

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
        this.endUserIdFilter = builder.endUserIdFilter;
        this.fillHardwareInfo = builder.fillHardwareInfo;
        this.language = builder.language;
        this.officeSiteId = builder.officeSiteId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
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
    public java.util.List<String> getDesktopId() {
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
     * @return endUserIdFilter
     */
    public String getEndUserIdFilter() {
        return this.endUserIdFilter;
    }

    /**
     * @return fillHardwareInfo
     */
    public Boolean getFillHardwareInfo() {
        return this.fillHardwareInfo;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
        private java.util.List<String> desktopId; 
        private String desktopName; 
        private String endTime; 
        private String endUserId; 
        private String endUserIdFilter; 
        private Boolean fillHardwareInfo; 
        private String language; 
        private String officeSiteId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String resourceGroupId; 
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
            this.endUserIdFilter = request.endUserIdFilter;
            this.fillHardwareInfo = request.fillHardwareInfo;
            this.language = request.language;
            this.officeSiteId = request.officeSiteId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.sessionStatus = request.sessionStatus;
            this.startTime = request.startTime;
            this.subPayType = request.subPayType;
        } 

        /**
         * <p>Specifies whether to turn on the switch to check session status of cloud computers.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder checkOsSession(Boolean checkOsSession) {
            this.putQueryParameter("CheckOsSession", checkOsSession);
            this.checkOsSession = checkOsSession;
            return this;
        }

        /**
         * <p>The IDs of the cloud computers. You can specify the IDs of 1 to 100 cloud computers.</p>
         */
        public Builder desktopId(java.util.List<String> desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * <p>The name of the cloud computer.</p>
         * 
         * <strong>example:</strong>
         * <p>DemoComputer</p>
         */
        public Builder desktopName(String desktopName) {
            this.putQueryParameter("DesktopName", desktopName);
            this.desktopName = desktopName;
            return this;
        }

        /**
         * <p>The end of the time range to query.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-13T02:51:43Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The ID of the end user.</p>
         * 
         * <strong>example:</strong>
         * <p>testUser</p>
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * <p>The user ID. This parameter functions the same as the <code>EndUserId</code> parameter. You only need to include one of them in your request.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        public Builder endUserIdFilter(String endUserIdFilter) {
            this.putQueryParameter("EndUserIdFilter", endUserIdFilter);
            this.endUserIdFilter = endUserIdFilter;
            return this;
        }

        /**
         * FillHardwareInfo.
         */
        public Builder fillHardwareInfo(Boolean fillHardwareInfo) {
            this.putQueryParameter("FillHardwareInfo", fillHardwareInfo);
            this.fillHardwareInfo = fillHardwareInfo;
            return this;
        }

        /**
         * Language.
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * <p>The office network ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-363353****</p>
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region ID. You can call the <a href="~~DescribeRegions~~">DescribeRegions</a> operation to query the regions supported by Elastic Desktop Service (EDS).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The state of the session.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Connected</li>
         * <li>Disconnected</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Connected</p>
         */
        public Builder sessionStatus(String sessionStatus) {
            this.putQueryParameter("SessionStatus", sessionStatus);
            this.sessionStatus = sessionStatus;
            return this;
        }

        /**
         * <p>The start of the time range to query.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-28T02:31:43Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The billing method of cloud computers.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>duration: hourly plan (available for users in the whitelist)</li>
         * <li>postPaid: pay-as-you-go</li>
         * <li>monthPackage: monthly subscription (the 120-hour/250-hour computing plan)</li>
         * <li>prePaid: monthly subscription (the Unlimited computing plan)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>monthPackage</p>
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
