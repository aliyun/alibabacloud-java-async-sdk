// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

        /**
         * Address.
         */
        public Builder address(String address) {
            this.address = address;
            return this;
        }

        /**
         * AddressId.
         */
        public Builder addressId(String addressId) {
            this.addressId = addressId;
            return this;
        }

        /**
         * AttributeInfo.
         */
        public Builder attributeInfo(String attributeInfo) {
            this.attributeInfo = attributeInfo;
            return this;
        }

        /**
         * AvailableMode.
         */
        public Builder availableMode(String availableMode) {
            this.availableMode = availableMode;
            return this;
        }

        /**
         * AvailableStatus.
         */
        public Builder availableStatus(String availableStatus) {
            this.availableStatus = availableStatus;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * CreateTimestamp.
         */
        public Builder createTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }

        /**
         * EnableStatus.
         */
        public Builder enableStatus(String enableStatus) {
            this.enableStatus = enableStatus;
            return this;
        }

        /**
         * HealthJudgement.
         */
        public Builder healthJudgement(String healthJudgement) {
            this.healthJudgement = healthJudgement;
            return this;
        }

        /**
         * HealthStatus.
         */
        public Builder healthStatus(String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }

        /**
         * HealthTasks.
         */
        public Builder healthTasks(HealthTasks healthTasks) {
            this.healthTasks = healthTasks;
            return this;
        }

        /**
         * ManualAvailableStatus.
         */
        public Builder manualAvailableStatus(String manualAvailableStatus) {
            this.manualAvailableStatus = manualAvailableStatus;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.remark = remark;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * UpdateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * UpdateTimestamp.
         */
        public Builder updateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }

        public DescribeCloudGtmAddressResponseBody build() {
            return new DescribeCloudGtmAddressResponseBody(this);
        } 

    } 

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

            /**
             * MonitorStatus.
             */
            public Builder monitorStatus(String monitorStatus) {
                this.monitorStatus = monitorStatus;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * TemplateId.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * TemplateName.
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
    public static class HealthTasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HealthTask")
        private java.util.List < HealthTask> healthTask;

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
        public java.util.List < HealthTask> getHealthTask() {
            return this.healthTask;
        }

        public static final class Builder {
            private java.util.List < HealthTask> healthTask; 

            /**
             * HealthTask.
             */
            public Builder healthTask(java.util.List < HealthTask> healthTask) {
                this.healthTask = healthTask;
                return this;
            }

            public HealthTasks build() {
                return new HealthTasks(this);
            } 

        } 

    }
}
