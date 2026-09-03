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
         * DesktopId.
         */
        public Builder desktopId(String desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * DesktopName.
         */
        public Builder desktopName(String desktopName) {
            this.putQueryParameter("DesktopName", desktopName);
            this.desktopName = desktopName;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * EndUserId.
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * EndUserIds.
         */
        public Builder endUserIds(java.util.List<String> endUserIds) {
            this.putQueryParameter("EndUserIds", endUserIds);
            this.endUserIds = endUserIds;
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
         * PrinterDriver.
         */
        public Builder printerDriver(String printerDriver) {
            this.putQueryParameter("PrinterDriver", printerDriver);
            this.printerDriver = printerDriver;
            return this;
        }

        /**
         * PrinterName.
         */
        public Builder printerName(String printerName) {
            this.putQueryParameter("PrinterName", printerName);
            this.printerName = printerName;
            return this;
        }

        /**
         * PrinterRedirType.
         */
        public Builder printerRedirType(Integer printerRedirType) {
            this.putQueryParameter("PrinterRedirType", printerRedirType);
            this.printerRedirType = printerRedirType;
            return this;
        }

        /**
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
         * StartTime.
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
