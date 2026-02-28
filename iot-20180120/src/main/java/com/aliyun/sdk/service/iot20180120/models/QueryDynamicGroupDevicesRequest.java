// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link QueryDynamicGroupDevicesRequest} extends {@link RequestModel}
 *
 * <p>QueryDynamicGroupDevicesRequest</p>
 */
public class QueryDynamicGroupDevicesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceName")
    private String deviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FuzzyName")
    private Boolean fuzzyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    private String productKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private QueryDynamicGroupDevicesRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.deviceName = builder.deviceName;
        this.fuzzyName = builder.fuzzyName;
        this.groupId = builder.groupId;
        this.iotInstanceId = builder.iotInstanceId;
        this.nextToken = builder.nextToken;
        this.pageSize = builder.pageSize;
        this.productKey = builder.productKey;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDynamicGroupDevicesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return deviceName
     */
    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * @return fuzzyName
     */
    public Boolean getFuzzyName() {
        return this.fuzzyName;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<QueryDynamicGroupDevicesRequest, Builder> {
        private Integer currentPage; 
        private String deviceName; 
        private Boolean fuzzyName; 
        private String groupId; 
        private String iotInstanceId; 
        private String nextToken; 
        private Integer pageSize; 
        private String productKey; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(QueryDynamicGroupDevicesRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.deviceName = request.deviceName;
            this.fuzzyName = request.fuzzyName;
            this.groupId = request.groupId;
            this.iotInstanceId = request.iotInstanceId;
            this.nextToken = request.nextToken;
            this.pageSize = request.pageSize;
            this.productKey = request.productKey;
            this.status = request.status;
        } 

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The DeviceName of the device.</p>
         * <p>If you specify this parameter and set <strong>FuzzyName</strong> to <strong>true</strong>, the value you specified is used as the prefix to fuzzy match the DeviceName. The value must be at least 4 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>light</p>
         */
        public Builder deviceName(String deviceName) {
            this.putQueryParameter("DeviceName", deviceName);
            this.deviceName = deviceName;
            return this;
        }

        /**
         * <p>Specifies whether to fuzzy match devices by the value of the <strong>DeviceName</strong> parameter. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder fuzzyName(Boolean fuzzyName) {
            this.putQueryParameter("FuzzyName", fuzzyName);
            this.fuzzyName = fuzzyName;
            return this;
        }

        /**
         * <p>The ID of the group. The ID is the globally unique identifier (GUID) for the group.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/93356.html">QueryDeviceGroupList</a> operation to query the <strong>GroupId</strong> parameter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tDQvBJqbUyHs***</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The instance ID. You can view the <strong>ID</strong> of the instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>iot-<em><strong>-v6</strong></em></p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request.</p>
         * 
         * <strong>example:</strong>
         * <p>TGlzdFJlc291***</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 200. Default value: 10.</p>
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
         * <p>The <strong>ProductKey</strong> of the product to which the devices belong.</p>
         * 
         * <strong>example:</strong>
         * <p>a1BwAGV***</p>
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * <p>The device status. Valid values:</p>
         * <ul>
         * <li><strong>ONLINE</strong>: The device is online.</li>
         * <li><strong>OFFLINE</strong>: The device is offline.</li>
         * <li><strong>UNACTIVE</strong>: The device is not activated.</li>
         * <li><strong>DISABLE</strong>: The device is deactivated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OFFLINE</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public QueryDynamicGroupDevicesRequest build() {
            return new QueryDynamicGroupDevicesRequest(this);
        } 

    } 

}
