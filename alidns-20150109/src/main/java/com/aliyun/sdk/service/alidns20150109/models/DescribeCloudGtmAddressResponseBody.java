// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link DescribeCloudGtmAddressResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCloudGtmAddressResponseBody</p>
 */
public class DescribeCloudGtmAddressResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Address")
    private String address;

    @com.aliyun.core.annotation.NameInMap("AddressId")
    private String addressId;

    @com.aliyun.core.annotation.NameInMap("AttributeInfo")
    private String attributeInfo;

    @com.aliyun.core.annotation.NameInMap("AvailableMode")
    private String availableMode;

    @com.aliyun.core.annotation.NameInMap("AvailableStatus")
    private String availableStatus;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
    private Long createTimestamp;

    @com.aliyun.core.annotation.NameInMap("EnableStatus")
    private String enableStatus;

    @com.aliyun.core.annotation.NameInMap("HealthJudgement")
    private String healthJudgement;

    @com.aliyun.core.annotation.NameInMap("HealthStatus")
    private String healthStatus;

    @com.aliyun.core.annotation.NameInMap("HealthTasks")
    private HealthTasks healthTasks;

    @com.aliyun.core.annotation.NameInMap("ManualAvailableStatus")
    private String manualAvailableStatus;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    @com.aliyun.core.annotation.NameInMap("UpdateTimestamp")
    private Long updateTimestamp;

    private DescribeCloudGtmAddressResponseBody(Builder builder) {
        this.address = builder.address;
        this.addressId = builder.addressId;
        this.attributeInfo = builder.attributeInfo;
        this.availableMode = builder.availableMode;
        this.availableStatus = builder.availableStatus;
        this.createTime = builder.createTime;
        this.createTimestamp = builder.createTimestamp;
        this.enableStatus = builder.enableStatus;
        this.healthJudgement = builder.healthJudgement;
        this.healthStatus = builder.healthStatus;
        this.healthTasks = builder.healthTasks;
        this.manualAvailableStatus = builder.manualAvailableStatus;
        this.name = builder.name;
        this.remark = builder.remark;
        this.requestId = builder.requestId;
        this.type = builder.type;
        this.updateTime = builder.updateTime;
        this.updateTimestamp = builder.updateTimestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudGtmAddressResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * @return addressId
     */
    public String getAddressId() {
        return this.addressId;
    }

    /**
     * @return attributeInfo
     */
    public String getAttributeInfo() {
        return this.attributeInfo;
    }

    /**
     * @return availableMode
     */
    public String getAvailableMode() {
        return this.availableMode;
    }

    /**
     * @return availableStatus
     */
    public String getAvailableStatus() {
        return this.availableStatus;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return createTimestamp
     */
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    /**
     * @return enableStatus
     */
    public String getEnableStatus() {
        return this.enableStatus;
    }

    /**
     * @return healthJudgement
     */
    public String getHealthJudgement() {
        return this.healthJudgement;
    }

    /**
     * @return healthStatus
     */
    public String getHealthStatus() {
        return this.healthStatus;
    }

    /**
     * @return healthTasks
     */
    public HealthTasks getHealthTasks() {
        return this.healthTasks;
    }

    /**
     * @return manualAvailableStatus
     */
    public String getManualAvailableStatus() {
        return this.manualAvailableStatus;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return updateTimestamp
     */
    public Long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public static final class Builder {
        private String address; 
        private String addressId; 
        private String attributeInfo; 
        private String availableMode; 
        private String availableStatus; 
        private String createTime; 
        private Long createTimestamp; 
        private String enableStatus; 
        private String healthJudgement; 
        private String healthStatus; 
        private HealthTasks healthTasks; 
        private String manualAvailableStatus; 
        private String name; 
        private String remark; 
        private String requestId; 
        private String type; 
        private String updateTime; 
        private Long updateTimestamp; 

        private Builder() {
        } 

        private Builder(DescribeCloudGtmAddressResponseBody model) {
            this.address = model.address;
            this.addressId = model.addressId;
            this.attributeInfo = model.attributeInfo;
            this.availableMode = model.availableMode;
            this.availableStatus = model.availableStatus;
            this.createTime = model.createTime;
            this.createTimestamp = model.createTimestamp;
            this.enableStatus = model.enableStatus;
            this.healthJudgement = model.healthJudgement;
            this.healthStatus = model.healthStatus;
            this.healthTasks = model.healthTasks;
            this.manualAvailableStatus = model.manualAvailableStatus;
            this.name = model.name;
            this.remark = model.remark;
            this.requestId = model.requestId;
            this.type = model.type;
            this.updateTime = model.updateTime;
            this.updateTimestamp = model.updateTimestamp;
        } 

        /**
         * <p>IP address or domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>223.5.XX.XX</p>
         */
        public Builder address(String address) {
            this.address = address;
            return this;
        }

        /**
         * <p>The address ID. This ID uniquely identifies the address.</p>
         * 
         * <strong>example:</strong>
         * <p>addr-89518218114368**92</p>
         */
        public Builder addressId(String addressId) {
            this.addressId = addressId;
            return this;
        }

        /**
         * <p>Address ownership information.</p>
         * 
         * <strong>example:</strong>
         * <p>The current version does not support passing this parameter, please do not input the parameter.</p>
         */
        public Builder attributeInfo(String attributeInfo) {
            this.attributeInfo = attributeInfo;
            return this;
        }

        /**
         * <p>The failover method that is used if the address fails health checks. Valid values:</p>
         * <ul>
         * <li>auto: the automatic mode. The system determines whether to return an address based on the health check results. If the address fails health checks, the system does not return the address. If the address passes health checks, the system returns the address.</li>
         * <li>manual: the manual mode. If an address is in the unavailable state, the address is not returned for Domain Name System (DNS) requests even if the address passes health checks. If an address is in the available state, the address is returned for DNS requests even if an alert is triggered when the address fails health checks.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>auto</p>
         */
        public Builder availableMode(String availableMode) {
            this.availableMode = availableMode;
            return this;
        }

        /**
         * <p>Address availability status:</p>
         * <ul>
         * <li>available: Available</li>
         * <li>unavailable: Unavailable</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>available</p>
         */
        public Builder availableStatus(String availableStatus) {
            this.availableStatus = availableStatus;
            return this;
        }

        /**
         * <p>Address creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-23T13:09Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>Creation time (timestamp).</p>
         * 
         * <strong>example:</strong>
         * <p>1527690629357</p>
         */
        public Builder createTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }

        /**
         * <p>Indicates the current enabled status of the address:
         * enabled: enabled state
         * disabled: disabled state</p>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        public Builder enableStatus(String enableStatus) {
            this.enableStatus = enableStatus;
            return this;
        }

        /**
         * <p>The condition for determining the health status of the address. Valid values:</p>
         * <ul>
         * <li>any_ok: The health check results of at least one health check template are normal.</li>
         * <li>p30_ok: The health check results of at least 30% of health check templates are normal.</li>
         * <li>p50_ok: The health check results of at least 50% of health check templates are normal.</li>
         * <li>p70_ok: The health check results of at least 70% of health check templates are normal.</li>
         * <li>all_ok: The health check results of all health check templates are normal.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>p50_ok</p>
         */
        public Builder healthJudgement(String healthJudgement) {
            this.healthJudgement = healthJudgement;
            return this;
        }

        /**
         * <p>The health check state of the address. Valid values:</p>
         * <ul>
         * <li>ok: The address passes all health checks of the referenced health check templates.</li>
         * <li>ok_alert: The address fails some health checks of the referenced health check templates but the address is deemed normal.</li>
         * <li>ok_no_monitor: The address does not reference a health check template.</li>
         * <li>exceptional: The address fails some or all health checks of the referenced health check templates and the address is deemed abnormal.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder healthStatus(String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }

        /**
         * <p>The health check tasks referenced by the address.</p>
         */
        public Builder healthTasks(HealthTasks healthTasks) {
            this.healthTasks = healthTasks;
            return this;
        }

        /**
         * <p>The availability state of the address when AvailableMode is set to manual. Valid values:</p>
         * <ul>
         * <li>available: The address is normal. In this state, the address is returned for DNS requests even if an alert is triggered when the address fails health checks.</li>
         * <li>unavailable: The address is abnormal. In this state, the address is not returned for DNS requests even if the address passes health checks.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>available</p>
         */
        public Builder manualAvailableStatus(String manualAvailableStatus) {
            this.manualAvailableStatus = manualAvailableStatus;
            return this;
        }

        /**
         * <p>Address name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>Remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>test1</p>
         */
        public Builder remark(String remark) {
            this.remark = remark;
            return this;
        }

        /**
         * <p>Unique request identification code.</p>
         * 
         * <strong>example:</strong>
         * <p>B57C121B-A45F-44D8-A9B2-13E5A5044195</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Address type:</p>
         * <ul>
         * <li>IPv4</li>
         * <li>IPv6</li>
         * <li>domain</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IPv4</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * <p>The last modification time of the address configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-29T13:20Z</p>
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * <p>Modified time (timestamp).</p>
         * 
         * <strong>example:</strong>
         * <p>1527690629357</p>
         */
        public Builder updateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }

        public DescribeCloudGtmAddressResponseBody build() {
            return new DescribeCloudGtmAddressResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCloudGtmAddressResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudGtmAddressResponseBody</p>
     */
    public static class HealthTask extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MonitorStatus")
        private String monitorStatus;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        private HealthTask(Builder builder) {
            this.monitorStatus = builder.monitorStatus;
            this.port = builder.port;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HealthTask create() {
            return builder().build();
        }

        /**
         * @return monitorStatus
         */
        public String getMonitorStatus() {
            return this.monitorStatus;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        public static final class Builder {
            private String monitorStatus; 
            private Integer port; 
            private String templateId; 
            private String templateName; 

            private Builder() {
            } 

            private Builder(HealthTask model) {
                this.monitorStatus = model.monitorStatus;
                this.port = model.port;
                this.templateId = model.templateId;
                this.templateName = model.templateName;
            } 

            /**
             * <p>The state of the health check task. Valid values:</p>
             * <ul>
             * <li>ok: The task is normal.</li>
             * <li>alert: An alert is triggered.</li>
             * <li>no_data: No data is available. In most cases, the health check task is newly created and no data is collected.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ok</p>
             */
            public Builder monitorStatus(String monitorStatus) {
                this.monitorStatus = monitorStatus;
                return this;
            }

            /**
             * <p>The target service port for health checks. When the Ping protocol is selected for health checks, configuration of the service port is not supported.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The ID of the health check template associated with the address.</p>
             * 
             * <strong>example:</strong>
             * <p>mtp-89518052425100**80</p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The name of the health check template.</p>
             * 
             * <strong>example:</strong>
             * <p>Ping-IPv4</p>
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            public HealthTask build() {
                return new HealthTask(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCloudGtmAddressResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudGtmAddressResponseBody</p>
     */
    public static class HealthTasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HealthTask")
        private java.util.List<HealthTask> healthTask;

        private HealthTasks(Builder builder) {
            this.healthTask = builder.healthTask;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HealthTasks create() {
            return builder().build();
        }

        /**
         * @return healthTask
         */
        public java.util.List<HealthTask> getHealthTask() {
            return this.healthTask;
        }

        public static final class Builder {
            private java.util.List<HealthTask> healthTask; 

            private Builder() {
            } 

            private Builder(HealthTasks model) {
                this.healthTask = model.healthTask;
            } 

            /**
             * HealthTask.
             */
            public Builder healthTask(java.util.List<HealthTask> healthTask) {
                this.healthTask = healthTask;
                return this;
            }

            public HealthTasks build() {
                return new HealthTasks(this);
            } 

        } 

    }
}
