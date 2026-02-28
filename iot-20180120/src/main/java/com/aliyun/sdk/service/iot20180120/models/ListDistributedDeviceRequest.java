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
 * {@link ListDistributedDeviceRequest} extends {@link RequestModel}
 *
 * <p>ListDistributedDeviceRequest</p>
 */
public class ListDistributedDeviceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceName")
    private String deviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 200, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    private String productKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceInstanceId")
    private String sourceInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetUid")
    private String targetUid;

    private ListDistributedDeviceRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.deviceName = builder.deviceName;
        this.pageSize = builder.pageSize;
        this.productKey = builder.productKey;
        this.sourceInstanceId = builder.sourceInstanceId;
        this.targetUid = builder.targetUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDistributedDeviceRequest create() {
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
     * @return sourceInstanceId
     */
    public String getSourceInstanceId() {
        return this.sourceInstanceId;
    }

    /**
     * @return targetUid
     */
    public String getTargetUid() {
        return this.targetUid;
    }

    public static final class Builder extends Request.Builder<ListDistributedDeviceRequest, Builder> {
        private Integer currentPage; 
        private String deviceName; 
        private Integer pageSize; 
        private String productKey; 
        private String sourceInstanceId; 
        private String targetUid; 

        private Builder() {
            super();
        } 

        private Builder(ListDistributedDeviceRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.deviceName = request.deviceName;
            this.pageSize = request.pageSize;
            this.productKey = request.productKey;
            this.sourceInstanceId = request.sourceInstanceId;
            this.targetUid = request.targetUid;
        } 

        /**
         * <p>The number of the page to return. Default value: 1.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The DeviceName of the device.</p>
         * 
         * <strong>example:</strong>
         * <p>mydevice</p>
         */
        public Builder deviceName(String deviceName) {
            this.putQueryParameter("DeviceName", deviceName);
            this.deviceName = deviceName;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Maximum value: 200.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The <strong>ProductKey</strong> of the product to which the device belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>a1BwAGV****</p>
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * <p>The ID of the source instance to which the device belongs.</p>
         * <ul>
         * <li><p>The IDs of public instances in different regions:</p>
         * <ul>
         * <li>China (Shanghai): iotx-oxssharez200.</li>
         * <li>Japan (Tokyo): iotx-oxssharez300.</li>
         * <li>Singapore (Singapore): iotx-oxssharez400.</li>
         * <li>US (Silicon Valley): iotx-oxssharez500.</li>
         * <li>US (Virginia): iotx-oxssharez600.</li>
         * <li>Germany (Frankfurt): iotx-oxssharez700.</li>
         * </ul>
         * </li>
         * <li><p>The IDs of Enterprise Edition instances:</p>
         * <p>1. Log on to the IoT Platform console. Select a region from the drop-down list in the upper-left corner of the top navigation bar.</p>
         * <p>2. On the <strong>Overview</strong> page, click the instance name. On the <strong>Instance Details</strong> page, view the instance ID in the <strong>Basic Information</strong> section.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>iot-060***</p>
         */
        public Builder sourceInstanceId(String sourceInstanceId) {
            this.putQueryParameter("SourceInstanceId", sourceInstanceId);
            this.sourceInstanceId = sourceInstanceId;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account. You can log on to the IoT Platform console, click the profile picture, and then view <strong>Account ID</strong> on the <strong>Security Settings</strong> page.</p>
         * 
         * <strong>example:</strong>
         * <p>198***</p>
         */
        public Builder targetUid(String targetUid) {
            this.putQueryParameter("TargetUid", targetUid);
            this.targetUid = targetUid;
            return this;
        }

        @Override
        public ListDistributedDeviceRequest build() {
            return new ListDistributedDeviceRequest(this);
        } 

    } 

}
