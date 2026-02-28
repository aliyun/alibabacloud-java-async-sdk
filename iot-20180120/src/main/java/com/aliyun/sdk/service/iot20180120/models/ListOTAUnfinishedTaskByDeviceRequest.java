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
 * {@link ListOTAUnfinishedTaskByDeviceRequest} extends {@link RequestModel}
 *
 * <p>ListOTAUnfinishedTaskByDeviceRequest</p>
 */
public class ListOTAUnfinishedTaskByDeviceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceName")
    private String deviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotId")
    private String iotId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModuleName")
    private String moduleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    private String productKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskStatus")
    private String taskStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskStatusList")
    private java.util.List<String> taskStatusList;

    private ListOTAUnfinishedTaskByDeviceRequest(Builder builder) {
        super(builder);
        this.deviceName = builder.deviceName;
        this.iotId = builder.iotId;
        this.iotInstanceId = builder.iotInstanceId;
        this.moduleName = builder.moduleName;
        this.productKey = builder.productKey;
        this.taskStatus = builder.taskStatus;
        this.taskStatusList = builder.taskStatusList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOTAUnfinishedTaskByDeviceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceName
     */
    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * @return iotId
     */
    public String getIotId() {
        return this.iotId;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return moduleName
     */
    public String getModuleName() {
        return this.moduleName;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return taskStatus
     */
    public String getTaskStatus() {
        return this.taskStatus;
    }

    /**
     * @return taskStatusList
     */
    public java.util.List<String> getTaskStatusList() {
        return this.taskStatusList;
    }

    public static final class Builder extends Request.Builder<ListOTAUnfinishedTaskByDeviceRequest, Builder> {
        private String deviceName; 
        private String iotId; 
        private String iotInstanceId; 
        private String moduleName; 
        private String productKey; 
        private String taskStatus; 
        private java.util.List<String> taskStatusList; 

        private Builder() {
            super();
        } 

        private Builder(ListOTAUnfinishedTaskByDeviceRequest request) {
            super(request);
            this.deviceName = request.deviceName;
            this.iotId = request.iotId;
            this.iotInstanceId = request.iotInstanceId;
            this.moduleName = request.moduleName;
            this.productKey = request.productKey;
            this.taskStatus = request.taskStatus;
            this.taskStatusList = request.taskStatusList;
        } 

        /**
         * <p>The DeviceName of the device.</p>
         * <blockquote>
         * <p>If you specify this parameter, you must also specify the <strong>ProductKey</strong> parameter.</p>
         * </blockquote>
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
         * <p>The ID of the device.</p>
         * <blockquote>
         * <p>If you specify this parameter, you do not need to specify <strong>ProductKey</strong> or <strong>DeviceName</strong>. The <strong>IotId</strong> parameter specifies a globally unique identifier (GUID) of the device, which corresponds to a combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>. If you specify both <strong>IotId</strong> and the combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>, <strong>IotId</strong> takes precedence.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>TfmUAeJjQQhCPH84UVNn0010c6****</p>
         */
        public Builder iotId(String iotId) {
            this.putQueryParameter("IotId", iotId);
            this.iotId = iotId;
            return this;
        }

        /**
         * <p>The ID of the instance. You can view the instance <strong>ID</strong> on the <strong>Overview</strong> page in the IoT Platform console.</p>
         * <blockquote>
         * <ul>
         * <li>If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</li>
         * <li>If your instance has no <strong>Overview</strong> page or ID, you do not need to set this parameter.</li>
         * </ul>
         * </blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot-c3j***</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The name of the OTA module.</p>
         * <ul>
         * <li>If you specify this parameter, update tasks of the specified module are queried.</li>
         * <li>If you do not specify this parameter, update tasks of all modules are queried.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>WifiConfigModify</p>
         */
        public Builder moduleName(String moduleName) {
            this.putQueryParameter("ModuleName", moduleName);
            this.moduleName = moduleName;
            return this;
        }

        /**
         * <p>The ProductKey of the product to which the device belongs.</p>
         * <blockquote>
         * <p>If you specify this parameter, you must also specify the <strong>DeviceName</strong> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>a19mzPZ****</p>
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * <p>The status of the update task.</p>
         * <ul>
         * <li><strong>CONFIRM</strong>: The update task is pending confirmation.</li>
         * <li><strong>QUEUED</strong>: The update notification is to be pushed.</li>
         * <li><strong>NOTIFIED</strong>: The update notification is pushed to the device.</li>
         * <li><strong>IN_PROGRESS</strong>: The update task is in progress.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CONFIRM</p>
         */
        public Builder taskStatus(String taskStatus) {
            this.putQueryParameter("TaskStatus", taskStatus);
            this.taskStatus = taskStatus;
            return this;
        }

        /**
         * TaskStatusList.
         */
        public Builder taskStatusList(java.util.List<String> taskStatusList) {
            this.putQueryParameter("TaskStatusList", taskStatusList);
            this.taskStatusList = taskStatusList;
            return this;
        }

        @Override
        public ListOTAUnfinishedTaskByDeviceRequest build() {
            return new ListOTAUnfinishedTaskByDeviceRequest(this);
        } 

    } 

}
