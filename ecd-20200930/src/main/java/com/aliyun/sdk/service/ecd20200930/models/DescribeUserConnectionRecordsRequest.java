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
 * {@link DescribeUserConnectionRecordsRequest} extends {@link RequestModel}
 *
 * <p>DescribeUserConnectionRecordsRequest</p>
 */
public class DescribeUserConnectionRecordsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectDurationFrom")
    private Long connectDurationFrom;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectDurationTo")
    private Long connectDurationTo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectEndTimeFrom")
    private Long connectEndTimeFrom;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectEndTimeTo")
    private Long connectEndTimeTo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectStartTimeFrom")
    private Long connectStartTimeFrom;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectStartTimeTo")
    private Long connectStartTimeTo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String desktopGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopId")
    private String desktopId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndUserType")
    private String endUserType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DescribeUserConnectionRecordsRequest(Builder builder) {
        super(builder);
        this.connectDurationFrom = builder.connectDurationFrom;
        this.connectDurationTo = builder.connectDurationTo;
        this.connectEndTimeFrom = builder.connectEndTimeFrom;
        this.connectEndTimeTo = builder.connectEndTimeTo;
        this.connectStartTimeFrom = builder.connectStartTimeFrom;
        this.connectStartTimeTo = builder.connectStartTimeTo;
        this.desktopGroupId = builder.desktopGroupId;
        this.desktopId = builder.desktopId;
        this.endUserId = builder.endUserId;
        this.endUserType = builder.endUserType;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserConnectionRecordsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return connectDurationFrom
     */
    public Long getConnectDurationFrom() {
        return this.connectDurationFrom;
    }

    /**
     * @return connectDurationTo
     */
    public Long getConnectDurationTo() {
        return this.connectDurationTo;
    }

    /**
     * @return connectEndTimeFrom
     */
    public Long getConnectEndTimeFrom() {
        return this.connectEndTimeFrom;
    }

    /**
     * @return connectEndTimeTo
     */
    public Long getConnectEndTimeTo() {
        return this.connectEndTimeTo;
    }

    /**
     * @return connectStartTimeFrom
     */
    public Long getConnectStartTimeFrom() {
        return this.connectStartTimeFrom;
    }

    /**
     * @return connectStartTimeTo
     */
    public Long getConnectStartTimeTo() {
        return this.connectStartTimeTo;
    }

    /**
     * @return desktopGroupId
     */
    public String getDesktopGroupId() {
        return this.desktopGroupId;
    }

    /**
     * @return desktopId
     */
    public String getDesktopId() {
        return this.desktopId;
    }

    /**
     * @return endUserId
     */
    public String getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return endUserType
     */
    public String getEndUserType() {
        return this.endUserType;
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

    public static final class Builder extends Request.Builder<DescribeUserConnectionRecordsRequest, Builder> {
        private Long connectDurationFrom; 
        private Long connectDurationTo; 
        private Long connectEndTimeFrom; 
        private Long connectEndTimeTo; 
        private Long connectStartTimeFrom; 
        private Long connectStartTimeTo; 
        private String desktopGroupId; 
        private String desktopId; 
        private String endUserId; 
        private String endUserType; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUserConnectionRecordsRequest request) {
            super(request);
            this.connectDurationFrom = request.connectDurationFrom;
            this.connectDurationTo = request.connectDurationTo;
            this.connectEndTimeFrom = request.connectEndTimeFrom;
            this.connectEndTimeTo = request.connectEndTimeTo;
            this.connectStartTimeFrom = request.connectStartTimeFrom;
            this.connectStartTimeTo = request.connectStartTimeTo;
            this.desktopGroupId = request.desktopGroupId;
            this.desktopId = request.desktopId;
            this.endUserId = request.endUserId;
            this.endUserType = request.endUserType;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The duration when the cloud desktop is connected, which is the minimum value for condition filtering.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder connectDurationFrom(Long connectDurationFrom) {
            this.putQueryParameter("ConnectDurationFrom", connectDurationFrom);
            this.connectDurationFrom = connectDurationFrom;
            return this;
        }

        /**
         * <p>The duration when the cloud desktop is connected, which is the maximum value for condition filtering.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder connectDurationTo(Long connectDurationTo) {
            this.putQueryParameter("ConnectDurationTo", connectDurationTo);
            this.connectDurationTo = connectDurationTo;
            return this;
        }

        /**
         * <p>The time when the cloud desktop stops to be connected, which is the minimum value for condition filtering. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1631266200000</p>
         */
        public Builder connectEndTimeFrom(Long connectEndTimeFrom) {
            this.putQueryParameter("ConnectEndTimeFrom", connectEndTimeFrom);
            this.connectEndTimeFrom = connectEndTimeFrom;
            return this;
        }

        /**
         * <p>The time when the cloud desktop stops to be connected, which is the maximum value for condition filtering. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1631268000000</p>
         */
        public Builder connectEndTimeTo(Long connectEndTimeTo) {
            this.putQueryParameter("ConnectEndTimeTo", connectEndTimeTo);
            this.connectEndTimeTo = connectEndTimeTo;
            return this;
        }

        /**
         * <p>The time when the cloud desktop starts to be connected, which is the minimum value for condition filtering. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1631239200000</p>
         */
        public Builder connectStartTimeFrom(Long connectStartTimeFrom) {
            this.putQueryParameter("ConnectStartTimeFrom", connectStartTimeFrom);
            this.connectStartTimeFrom = connectStartTimeFrom;
            return this;
        }

        /**
         * <p>The time when the cloud desktop starts to be connected, which is the maximum value for condition filtering. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1631241000000</p>
         */
        public Builder connectStartTimeTo(Long connectStartTimeTo) {
            this.putQueryParameter("ConnectStartTimeTo", connectStartTimeTo);
            this.connectStartTimeTo = connectStartTimeTo;
            return this;
        }

        /**
         * <p>The ID of the cloud computer pool.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dg-2i8qxpv6t1a03****</p>
         */
        public Builder desktopGroupId(String desktopGroupId) {
            this.putQueryParameter("DesktopGroupId", desktopGroupId);
            this.desktopGroupId = desktopGroupId;
            return this;
        }

        /**
         * <p>The ID of the cloud computer.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-138dsptkrt00u****</p>
         */
        public Builder desktopId(String desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * <p>The ID of the authorized user.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * <p>The type of the user account.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>SIMPLE: convenience account</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>AD_CONNECTOR: enterprise AD account</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SIMPLE</p>
         */
        public Builder endUserType(String endUserType) {
            this.putQueryParameter("EndUserType", endUserType);
            this.endUserType = endUserType;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Maximum value: 100. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token that determines the start point of the next query. If this parameter is empty, all results are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
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

        @Override
        public DescribeUserConnectionRecordsRequest build() {
            return new DescribeUserConnectionRecordsRequest(this);
        } 

    } 

}
