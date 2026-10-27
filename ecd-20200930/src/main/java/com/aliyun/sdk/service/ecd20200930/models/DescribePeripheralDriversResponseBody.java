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
 * {@link DescribePeripheralDriversResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePeripheralDriversResponseBody</p>
 */
public class DescribePeripheralDriversResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("DriverInfos")
    private java.util.List<DriverInfos> driverInfos;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePeripheralDriversResponseBody(Builder builder) {
        this.count = builder.count;
        this.driverInfos = builder.driverInfos;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePeripheralDriversResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return driverInfos
     */
    public java.util.List<DriverInfos> getDriverInfos() {
        return this.driverInfos;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer count; 
        private java.util.List<DriverInfos> driverInfos; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribePeripheralDriversResponseBody model) {
            this.count = model.count;
            this.driverInfos = model.driverInfos;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The total number of matched drivers, not the length of the list on the current page. If no data exists on the current page, 0 may be returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The list of driver information on the current page. An empty list is returned if no data exists.</p>
         */
        public Builder driverInfos(java.util.List<DriverInfos> driverInfos) {
            this.driverInfos = driverInfos;
            return this;
        }

        /**
         * <p>The reserved field. This field does not provide a valid return value and may not be returned. This operation uses PageSize and PageNumber for pagination. Do not rely on this field. The sample value 20 is used only to demonstrate the integer type and does not represent the actual return value, default value, or page size of the current query.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The reserved field. This field does not provide token-based pagination and may not be returned. Do not rely on this field for subsequent queries. The sample value token-for-format-only is used only to demonstrate the string type and is not an actual return value or a usable pagination token.</p>
         * 
         * <strong>example:</strong>
         * <p>token-for-format-only</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID. You can provide this value for troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>00000000-1111-4222-8333-444444444444</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePeripheralDriversResponseBody build() {
            return new DescribePeripheralDriversResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePeripheralDriversResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePeripheralDriversResponseBody</p>
     */
    public static class DriverInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Brand")
        private String brand;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DeviceType")
        private String deviceType;

        @com.aliyun.core.annotation.NameInMap("Icon")
        private String icon;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OsType")
        private String osType;

        @com.aliyun.core.annotation.NameInMap("OwnerType")
        private String ownerType;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        private DriverInfos(Builder builder) {
            this.brand = builder.brand;
            this.createTime = builder.createTime;
            this.deviceType = builder.deviceType;
            this.icon = builder.icon;
            this.id = builder.id;
            this.name = builder.name;
            this.osType = builder.osType;
            this.ownerType = builder.ownerType;
            this.source = builder.source;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DriverInfos create() {
            return builder().build();
        }

        /**
         * @return brand
         */
        public String getBrand() {
            return this.brand;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return deviceType
         */
        public String getDeviceType() {
            return this.deviceType;
        }

        /**
         * @return icon
         */
        public String getIcon() {
            return this.icon;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return osType
         */
        public String getOsType() {
            return this.osType;
        }

        /**
         * @return ownerType
         */
        public String getOwnerType() {
            return this.ownerType;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        public static final class Builder {
            private String brand; 
            private String createTime; 
            private String deviceType; 
            private String icon; 
            private String id; 
            private String name; 
            private String osType; 
            private String ownerType; 
            private String source; 

            private Builder() {
            } 

            private Builder(DriverInfos model) {
                this.brand = model.brand;
                this.createTime = model.createTime;
                this.deviceType = model.deviceType;
                this.icon = model.icon;
                this.id = model.id;
                this.name = model.name;
                this.osType = model.osType;
                this.ownerType = model.ownerType;
                this.source = model.source;
            } 

            /**
             * <p>The brand to which the driver belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>hp</p>
             */
            public Builder brand(String brand) {
                this.brand = brand;
                return this;
            }

            /**
             * <p>The time when the driver record was created. The time is in the ISO 8601 (RFC 3339) format with time zone offset. The time zone offset is subject to the returned value. If the time information does not exist, this field may be empty or not returned.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-01T10:30:00+08:00</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The device type to which the driver applies.</p>
             * 
             * <strong>example:</strong>
             * <p>printer</p>
             */
            public Builder deviceType(String deviceType) {
                this.deviceType = deviceType;
                return this;
            }

            /**
             * <p>The URL of the brand icon. If no icon is configured, this field may be empty or not returned. The example is a placeholder address.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/icons/printer.png">https://example.com/icons/printer.png</a></p>
             */
            public Builder icon(String icon) {
                this.icon = icon;
                return this;
            }

            /**
             * <p>The driver ID, which can be used for subsequent queries.</p>
             * 
             * <strong>example:</strong>
             * <p>11111111-2222-4333-8444-555555555555</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The driver name.</p>
             * 
             * <strong>example:</strong>
             * <p>HP Universal Printing PCL 6</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The operating system to which the driver applies, such as Windows. The actual returned value prevails.</p>
             * 
             * <strong>example:</strong>
             * <p>Windows</p>
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * <p>The driver ownership. Valid values: WUYING: Wuying official drivers. CUSTOMER: custom drivers of the current account.</p>
             * 
             * <strong>example:</strong>
             * <p>WUYING</p>
             */
            public Builder ownerType(String ownerType) {
                this.ownerType = ownerType;
                return this;
            }

            /**
             * <p>The driver source. Valid values: OpsApp: uploaded from the management console. WuyingHelper: uploaded from Wuying Assistant. Wuying: from Wuying. Unrecognized sources may also be classified as Wuying. To distinguish between official and custom drivers, use OwnerType.</p>
             * 
             * <strong>example:</strong>
             * <p>Wuying</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            public DriverInfos build() {
                return new DriverInfos(this);
            } 

        } 

    }
}
