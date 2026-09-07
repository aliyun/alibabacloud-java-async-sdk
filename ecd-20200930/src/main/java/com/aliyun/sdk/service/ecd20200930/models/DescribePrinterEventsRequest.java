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
 * {@link DescribePrinterEventsRequest} extends {@link RequestModel}
 *
 * <p>DescribePrinterEventsRequest</p>
 */
public class DescribePrinterEventsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopId")
    private String desktopId;

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
    @com.aliyun.core.annotation.NameInMap("EndUserIds")
    private java.util.List<String> endUserIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 500, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrinterDriver")
    private String printerDriver;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrinterName")
    private String printerName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrinterRedirType")
    private Integer printerRedirType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribePrinterEventsRequest(Builder builder) {
        super(builder);
        this.desktopId = builder.desktopId;
        this.desktopName = builder.desktopName;
        this.endTime = builder.endTime;
        this.endUserId = builder.endUserId;
        this.endUserIds = builder.endUserIds;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.printerDriver = builder.printerDriver;
        this.printerName = builder.printerName;
        this.printerRedirType = builder.printerRedirType;
        this.regionId = builder.regionId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePrinterEventsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desktopId
     */
    public String getDesktopId() {
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
     * @return endUserIds
     */
    public java.util.List<String> getEndUserIds() {
        return this.endUserIds;
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
     * @return printerDriver
     */
    public String getPrinterDriver() {
        return this.printerDriver;
    }

    /**
     * @return printerName
     */
    public String getPrinterName() {
        return this.printerName;
    }

    /**
     * @return printerRedirType
     */
    public Integer getPrinterRedirType() {
        return this.printerRedirType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribePrinterEventsRequest, Builder> {
        private String desktopId; 
        private String desktopName; 
        private String endTime; 
        private String endUserId; 
        private java.util.List<String> endUserIds; 
        private Integer maxResults; 
        private String nextToken; 
        private String printerDriver; 
        private String printerName; 
        private Integer printerRedirType; 
        private String regionId; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribePrinterEventsRequest request) {
            super(request);
            this.desktopId = request.desktopId;
            this.desktopName = request.desktopName;
            this.endTime = request.endTime;
            this.endUserId = request.endUserId;
            this.endUserIds = request.endUserIds;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.printerDriver = request.printerDriver;
            this.printerName = request.printerName;
            this.printerRedirType = request.printerRedirType;
            this.regionId = request.regionId;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The cloud computer ID. If you do not specify this parameter, all cloud computers in the region are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-gx2x1dhsmucyy****</p>
         */
        public Builder desktopId(String desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * <p>The cloud computer name.</p>
         * 
         * <strong>example:</strong>
         * <p>desktop-001</p>
         */
        public Builder desktopName(String desktopName) {
            this.putQueryParameter("DesktopName", desktopName);
            this.desktopName = desktopName;
            return this;
        }

        /**
         * <p>The end time. Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC+0. If you do not specify this parameter, the current time is used.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-31T06:32:31Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The logon user information, which is a RAM user ID or an Active Directory (AD) username. If you do not specify this parameter, events of all users in the region are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>user001</p>
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * <p>The list of end user IDs.</p>
         */
        public Builder endUserIds(java.util.List<String> endUserIds) {
            this.putQueryParameter("EndUserIds", endUserIds);
            this.endUserIds = endUserIds;
            return this;
        }

        /**
         * <p>The number of entries per page in a paged query. Default value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token. Set this parameter to the value of NextToken that was returned in the previous API call.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAV3MpHK1AP0pfERHZN5pu6nmB7qrRFJ8vmttjxPL****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The printer driver name.</p>
         * 
         * <strong>example:</strong>
         * <p>HP LaserJet PCL 6</p>
         */
        public Builder printerDriver(String printerDriver) {
            this.putQueryParameter("PrinterDriver", printerDriver);
            this.printerDriver = printerDriver;
            return this;
        }

        /**
         * <p>The printer name.</p>
         * 
         * <strong>example:</strong>
         * <p>HP LaserJet Pro</p>
         */
        public Builder printerName(String printerName) {
            this.putQueryParameter("PrinterName", printerName);
            this.printerName = printerName;
            return this;
        }

        /**
         * <p>The printer redirection type.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder printerRedirType(Integer printerRedirType) {
            this.putQueryParameter("PrinterRedirType", printerRedirType);
            this.printerRedirType = printerRedirType;
            return this;
        }

        /**
         * <p>The region ID. You can call DescribeRegions to query the regions supported by Elastic Desktop Service.</p>
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
         * <p>The start time. Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC+0. If you do not specify this parameter, the query starts from the time that is calculated backward from the time specified by <code>EndTime</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-03-23T04:10:21Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribePrinterEventsRequest build() {
            return new DescribePrinterEventsRequest(this);
        } 

    } 

}
