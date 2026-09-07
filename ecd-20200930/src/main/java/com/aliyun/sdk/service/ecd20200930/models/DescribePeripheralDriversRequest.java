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
 * {@link DescribePeripheralDriversRequest} extends {@link RequestModel}
 *
 * <p>DescribePeripheralDriversRequest</p>
 */
public class DescribePeripheralDriversRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Brand")
    private String brand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceType")
    private String deviceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DriverIds")
    private java.util.List<String> driverIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filter")
    private String filter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerType")
    private String ownerType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 500, minimum = 1)
    private Integer pageSize;

    private DescribePeripheralDriversRequest(Builder builder) {
        super(builder);
        this.brand = builder.brand;
        this.deviceType = builder.deviceType;
        this.driverIds = builder.driverIds;
        this.filter = builder.filter;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.ownerType = builder.ownerType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePeripheralDriversRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return brand
     */
    public String getBrand() {
        return this.brand;
    }

    /**
     * @return deviceType
     */
    public String getDeviceType() {
        return this.deviceType;
    }

    /**
     * @return driverIds
     */
    public java.util.List<String> getDriverIds() {
        return this.driverIds;
    }

    /**
     * @return filter
     */
    public String getFilter() {
        return this.filter;
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
     * @return ownerType
     */
    public String getOwnerType() {
        return this.ownerType;
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

    public static final class Builder extends Request.Builder<DescribePeripheralDriversRequest, Builder> {
        private String brand; 
        private String deviceType; 
        private java.util.List<String> driverIds; 
        private String filter; 
        private Integer maxResults; 
        private String nextToken; 
        private String ownerType; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribePeripheralDriversRequest request) {
            super(request);
            this.brand = request.brand;
            this.deviceType = request.deviceType;
            this.driverIds = request.driverIds;
            this.filter = request.filter;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.ownerType = request.ownerType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>The brand identifier. Exact match is used. The value depends on the actual configuration and is not a fixed enumeration. If this parameter is not specified, drivers of all brands are returned. The example value is provided to illustrate the format only.</p>
         * 
         * <strong>example:</strong>
         * <p>hp</p>
         */
        public Builder brand(String brand) {
            this.putQueryParameter("Brand", brand);
            this.brand = brand;
            return this;
        }

        /**
         * <p>The device type identifier. Exact match is used. The value depends on the actual configuration. For example, printer indicates a printer. If this parameter is not specified, drivers of all device types are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>printer</p>
         */
        public Builder deviceType(String deviceType) {
            this.putQueryParameter("DeviceType", deviceType);
            this.deviceType = deviceType;
            return this;
        }

        /**
         * <p>The list of driver IDs. If this parameter is not specified or an empty array is passed in, no filtering by driver ID is applied. Only drivers that are visible to the current account and match the specified IDs are returned. IDs that do not match any driver do not produce corresponding records.</p>
         */
        public Builder driverIds(java.util.List<String> driverIds) {
            this.putQueryParameter("DriverIds", driverIds);
            this.driverIds = driverIds;
            return this;
        }

        /**
         * <p>The search keyword. The keyword is matched against the driver ID, brand identifier, driver name, description, device type, or brand display name. A hit on any field qualifies the driver. The wildcard % matches any number of characters, and _ matches a single character. If this parameter is not specified, no keyword filtering is applied.</p>
         * 
         * <strong>example:</strong>
         * <p>LaserJet</p>
         */
        public Builder filter(String filter) {
            this.putQueryParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * <p>Reserved parameter. This parameter does not participate in queries or pagination. Do not specify this parameter. Use PageSize to set the number of entries per page. The example value 20 is provided only to illustrate the integer type. It is not the default value of this parameter and does not take effect if specified.</p>
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
         * <p>Reserved parameter. Token-based pagination is not supported. Do not specify this parameter. Use PageNumber to specify the page number. The example value token-for-format-only is provided only to illustrate the string type and is not a usable pagination token.</p>
         * 
         * <strong>example:</strong>
         * <p>token-for-format-only</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The driver ownership. Valid values:</p>
         * <ul>
         * <li>WUYING: Wuying official driver.</li>
         * <li>CUSTOMER: Custom driver of the current account.</li>
         * </ul>
         * <p>If this parameter is not specified, both types of drivers are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>CUSTOMER</p>
         */
        public Builder ownerType(String ownerType) {
            this.putQueryParameter("OwnerType", ownerType);
            this.ownerType = ownerType;
            return this;
        }

        /**
         * <p>The page number. Start from 1. Default value: 1.</p>
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
         * <p>The number of entries per page. Valid values: 1 to 500. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public DescribePeripheralDriversRequest build() {
            return new DescribePeripheralDriversRequest(this);
        } 

    } 

}
