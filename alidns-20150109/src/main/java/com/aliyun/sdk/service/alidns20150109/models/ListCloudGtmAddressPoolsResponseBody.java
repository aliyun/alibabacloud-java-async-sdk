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
 * {@link ListCloudGtmAddressPoolsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCloudGtmAddressPoolsResponseBody</p>
 */
public class ListCloudGtmAddressPoolsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AddressPools")
    private AddressPools addressPools;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalItems")
    private Integer totalItems;

    @com.aliyun.core.annotation.NameInMap("TotalPages")
    private Integer totalPages;

    private ListCloudGtmAddressPoolsResponseBody(Builder builder) {
        this.addressPools = builder.addressPools;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalItems = builder.totalItems;
        this.totalPages = builder.totalPages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCloudGtmAddressPoolsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addressPools
     */
    public AddressPools getAddressPools() {
        return this.addressPools;
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

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalItems
     */
    public Integer getTotalItems() {
        return this.totalItems;
    }

    /**
     * @return totalPages
     */
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static final class Builder {
        private AddressPools addressPools; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalItems; 
        private Integer totalPages; 

        private Builder() {
        } 

        private Builder(ListCloudGtmAddressPoolsResponseBody model) {
            this.addressPools = model.addressPools;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalItems = model.totalItems;
            this.totalPages = model.totalPages;
        } 

        /**
         * <p>The address pools.</p>
         */
        public Builder addressPools(AddressPools addressPools) {
            this.addressPools = addressPools;
            return this;
        }

        /**
         * <p>Current page number, starting at <strong>1</strong>, default is <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of rows per page when paginating queries, with a maximum value of 100 and a default of 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Unique request identification code.</p>
         * 
         * <strong>example:</strong>
         * <p>536E9CAD-DB30-4647-AC87-AA5CC38C5382</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total number of entries in the address pool.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        public Builder totalItems(Integer totalItems) {
            this.totalItems = totalItems;
            return this;
        }

        /**
         * <p>Total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        public ListCloudGtmAddressPoolsResponseBody build() {
            return new ListCloudGtmAddressPoolsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCloudGtmAddressPoolsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCloudGtmAddressPoolsResponseBody</p>
     */
    public static class HealthTask extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        private HealthTask(Builder builder) {
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
            private Integer port; 
            private String templateId; 
            private String templateName; 

            private Builder() {
            } 

            private Builder(HealthTask model) {
                this.port = model.port;
                this.templateId = model.templateId;
                this.templateName = model.templateName;
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
             * <p>The ID of the health check template.</p>
             * 
             * <strong>example:</strong>
             * <p>mtp-895180524251002880</p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>Health check template name.</p>
             * 
             * <strong>example:</strong>
             * <p>IPv4-Ping</p>
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
     * {@link ListCloudGtmAddressPoolsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCloudGtmAddressPoolsResponseBody</p>
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
    /**
     * 
     * {@link ListCloudGtmAddressPoolsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCloudGtmAddressPoolsResponseBody</p>
     */
    public static class RequestSource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RequestSource")
        private java.util.List<String> requestSource;

        private RequestSource(Builder builder) {
            this.requestSource = builder.requestSource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RequestSource create() {
            return builder().build();
        }

        /**
         * @return requestSource
         */
        public java.util.List<String> getRequestSource() {
            return this.requestSource;
        }

        public static final class Builder {
            private java.util.List<String> requestSource; 

            private Builder() {
            } 

            private Builder(RequestSource model) {
                this.requestSource = model.requestSource;
            } 

            /**
             * RequestSource.
             */
            public Builder requestSource(java.util.List<String> requestSource) {
                this.requestSource = requestSource;
                return this;
            }

            public RequestSource build() {
                return new RequestSource(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCloudGtmAddressPoolsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCloudGtmAddressPoolsResponseBody</p>
     */
    public static class Address extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("RequestSource")
        private RequestSource requestSource;

        @com.aliyun.core.annotation.NameInMap("SeqNonPreemptiveSchedule")
        private Boolean seqNonPreemptiveSchedule;

        @com.aliyun.core.annotation.NameInMap("SerialNumber")
        private Integer serialNumber;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("UpdateTimestamp")
        private Long updateTimestamp;

        @com.aliyun.core.annotation.NameInMap("WeightValue")
        private Integer weightValue;

        private Address(Builder builder) {
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
            this.requestSource = builder.requestSource;
            this.seqNonPreemptiveSchedule = builder.seqNonPreemptiveSchedule;
            this.serialNumber = builder.serialNumber;
            this.type = builder.type;
            this.updateTime = builder.updateTime;
            this.updateTimestamp = builder.updateTimestamp;
            this.weightValue = builder.weightValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Address create() {
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
         * @return requestSource
         */
        public RequestSource getRequestSource() {
            return this.requestSource;
        }

        /**
         * @return seqNonPreemptiveSchedule
         */
        public Boolean getSeqNonPreemptiveSchedule() {
            return this.seqNonPreemptiveSchedule;
        }

        /**
         * @return serialNumber
         */
        public Integer getSerialNumber() {
            return this.serialNumber;
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

        /**
         * @return weightValue
         */
        public Integer getWeightValue() {
            return this.weightValue;
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
            private RequestSource requestSource; 
            private Boolean seqNonPreemptiveSchedule; 
            private Integer serialNumber; 
            private String type; 
            private String updateTime; 
            private Long updateTimestamp; 
            private Integer weightValue; 

            private Builder() {
            } 

            private Builder(Address model) {
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
                this.requestSource = model.requestSource;
                this.seqNonPreemptiveSchedule = model.seqNonPreemptiveSchedule;
                this.serialNumber = model.serialNumber;
                this.type = model.type;
                this.updateTime = model.updateTime;
                this.updateTimestamp = model.updateTimestamp;
                this.weightValue = model.weightValue;
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
             * <p>addr-895182181143688192</p>
             */
            public Builder addressId(String addressId) {
                this.addressId = addressId;
                return this;
            }

            /**
             * <p>Address ownership information, not supported in the current version.</p>
             * 
             * <strong>example:</strong>
             * <p>The current version does not support returning this parameter.</p>
             */
            public Builder attributeInfo(String attributeInfo) {
                this.attributeInfo = attributeInfo;
                return this;
            }

            /**
             * <p>The failover mode that is used when address exceptions are identified. Valid values:</p>
             * <ul>
             * <li>auto: the automatic mode. The system determines whether to return an address based on the health check results. If the address fails health checks, the system does not return the address. If the address passes health checks, the system returns the address.</li>
             * <li>manual: the manual mode. If an address is in the unavailable state, the address is not returned for DNS requests even if the address passes health checks. If an address is in the available state, the address is returned for DNS requests even if an alert is triggered when the address fails health checks.</li>
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
             * <p>The availability state of the address. Valid values:</p>
             * <ul>
             * <li>available: The address is available.</li>
             * <li>unavailable: The address is unavailable.</li>
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
             * <p>2024-03-15T01:46Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Address creation time (timestamp).</p>
             * 
             * <strong>example:</strong>
             * <p>1527690629357</p>
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * <p>Address enable status:</p>
             * <ul>
             * <li>enable: Enabled status</li>
             * <li>disable: Disabled status</li>
             * </ul>
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
             * <p>any_ok</p>
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
             * <li>ok_no_monitor: The address does not reference any health check template and is normal.</li>
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
             * <p>The health check tasks.</p>
             */
            public Builder healthTasks(HealthTasks healthTasks) {
                this.healthTasks = healthTasks;
                return this;
            }

            /**
             * <p>The availability state of the address when AvailableMode is set to manual for the address. Valid values:</p>
             * <ul>
             * <li>available: The address is available. In this state, the address is returned for DNS requests even if an alert is triggered when the address fails health checks.</li>
             * <li>unavailable: The address is unavailable. In this state, the address is not returned for DNS requests even if the address passes health checks.</li>
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
             * <p>Address-1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Address remarks.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>List of request sources.</p>
             */
            public Builder requestSource(RequestSource requestSource) {
                this.requestSource = requestSource;
                return this;
            }

            /**
             * <p>Indicates whether the mode of the sequence policy for load balancing between address pools is non-preemptive. This parameter is available only for the multicloud integration scenario. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder seqNonPreemptiveSchedule(Boolean seqNonPreemptiveSchedule) {
                this.seqNonPreemptiveSchedule = seqNonPreemptiveSchedule;
                return this;
            }

            /**
             * <p>Sequence number, indicating the priority of address return, where smaller numbers have higher priority.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder serialNumber(Integer serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            /**
             * <p>Address type:</p>
             * <ul>
             * <li>IPv4: IPv4 address</li>
             * <li>IPv6: IPv6 address</li>
             * <li>domain: Domain name</li>
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
             * <p>The last time the address was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-03-15T01:46Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The last modification time of the address (timestamp).</p>
             * 
             * <strong>example:</strong>
             * <p>1527690629357</p>
             */
            public Builder updateTimestamp(Long updateTimestamp) {
                this.updateTimestamp = updateTimestamp;
                return this;
            }

            /**
             * <p>Weight value (integer between 1 and 100), supports setting different weight values for each address, enabling resolution queries to return addresses according to the weight ratio.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder weightValue(Integer weightValue) {
                this.weightValue = weightValue;
                return this;
            }

            public Address build() {
                return new Address(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCloudGtmAddressPoolsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCloudGtmAddressPoolsResponseBody</p>
     */
    public static class Addresses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Address")
        private java.util.List<Address> address;

        private Addresses(Builder builder) {
            this.address = builder.address;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Addresses create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public java.util.List<Address> getAddress() {
            return this.address;
        }

        public static final class Builder {
            private java.util.List<Address> address; 

            private Builder() {
            } 

            private Builder(Addresses model) {
                this.address = model.address;
            } 

            /**
             * <p>IP address or domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>223.5.XX.XX</p>
             */
            public Builder address(java.util.List<Address> address) {
                this.address = address;
                return this;
            }

            public Addresses build() {
                return new Addresses(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCloudGtmAddressPoolsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCloudGtmAddressPoolsResponseBody</p>
     */
    public static class AddressPool extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddressLbStrategy")
        private String addressLbStrategy;

        @com.aliyun.core.annotation.NameInMap("AddressPoolId")
        private String addressPoolId;

        @com.aliyun.core.annotation.NameInMap("AddressPoolName")
        private String addressPoolName;

        @com.aliyun.core.annotation.NameInMap("AddressPoolType")
        private String addressPoolType;

        @com.aliyun.core.annotation.NameInMap("Addresses")
        private Addresses addresses;

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

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("SequenceLbStrategyMode")
        private String sequenceLbStrategyMode;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("UpdateTimestamp")
        private Long updateTimestamp;

        private AddressPool(Builder builder) {
            this.addressLbStrategy = builder.addressLbStrategy;
            this.addressPoolId = builder.addressPoolId;
            this.addressPoolName = builder.addressPoolName;
            this.addressPoolType = builder.addressPoolType;
            this.addresses = builder.addresses;
            this.availableStatus = builder.availableStatus;
            this.createTime = builder.createTime;
            this.createTimestamp = builder.createTimestamp;
            this.enableStatus = builder.enableStatus;
            this.healthJudgement = builder.healthJudgement;
            this.healthStatus = builder.healthStatus;
            this.remark = builder.remark;
            this.sequenceLbStrategyMode = builder.sequenceLbStrategyMode;
            this.updateTime = builder.updateTime;
            this.updateTimestamp = builder.updateTimestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddressPool create() {
            return builder().build();
        }

        /**
         * @return addressLbStrategy
         */
        public String getAddressLbStrategy() {
            return this.addressLbStrategy;
        }

        /**
         * @return addressPoolId
         */
        public String getAddressPoolId() {
            return this.addressPoolId;
        }

        /**
         * @return addressPoolName
         */
        public String getAddressPoolName() {
            return this.addressPoolName;
        }

        /**
         * @return addressPoolType
         */
        public String getAddressPoolType() {
            return this.addressPoolType;
        }

        /**
         * @return addresses
         */
        public Addresses getAddresses() {
            return this.addresses;
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
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return sequenceLbStrategyMode
         */
        public String getSequenceLbStrategyMode() {
            return this.sequenceLbStrategyMode;
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
            private String addressLbStrategy; 
            private String addressPoolId; 
            private String addressPoolName; 
            private String addressPoolType; 
            private Addresses addresses; 
            private String availableStatus; 
            private String createTime; 
            private Long createTimestamp; 
            private String enableStatus; 
            private String healthJudgement; 
            private String healthStatus; 
            private String remark; 
            private String sequenceLbStrategyMode; 
            private String updateTime; 
            private Long updateTimestamp; 

            private Builder() {
            } 

            private Builder(AddressPool model) {
                this.addressLbStrategy = model.addressLbStrategy;
                this.addressPoolId = model.addressPoolId;
                this.addressPoolName = model.addressPoolName;
                this.addressPoolType = model.addressPoolType;
                this.addresses = model.addresses;
                this.availableStatus = model.availableStatus;
                this.createTime = model.createTime;
                this.createTimestamp = model.createTimestamp;
                this.enableStatus = model.enableStatus;
                this.healthJudgement = model.healthJudgement;
                this.healthStatus = model.healthStatus;
                this.remark = model.remark;
                this.sequenceLbStrategyMode = model.sequenceLbStrategyMode;
                this.updateTime = model.updateTime;
                this.updateTimestamp = model.updateTimestamp;
            } 

            /**
             * <p>Load balancing policy among addresses in the address pool:</p>
             * <ul>
             * <li>round_robin: Round-robin, for any source of DNS resolution requests, all addresses are returned. The order of all addresses is rotated each time.</li>
             * <li>sequence: Sequential, for any source of DNS resolution requests, the address with the smaller sequence number (the sequence number indicates the priority of address returns, with smaller numbers having higher priority) is returned. If the address with the smaller sequence number is unavailable, the next address with a smaller sequence number is returned.</li>
             * <li>weight: Weighted, supports setting different weight values for each address, realizing the return of addresses according to the ratio of weights in resolution queries.</li>
             * <li>source_nearest: Source-nearest, i.e., intelligent resolution function, where GTM can return different addresses based on the source of different DNS resolution requests, achieving the effect of users accessing nearby.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>round_robin</p>
             */
            public Builder addressLbStrategy(String addressLbStrategy) {
                this.addressLbStrategy = addressLbStrategy;
                return this;
            }

            /**
             * <p>The ID of the address pool. This ID uniquely identifies the address pool.</p>
             * 
             * <strong>example:</strong>
             * <p>pool-89528023225442**16</p>
             */
            public Builder addressPoolId(String addressPoolId) {
                this.addressPoolId = addressPoolId;
                return this;
            }

            /**
             * <p>Address pool name.</p>
             * 
             * <strong>example:</strong>
             * <p>AddressPool-1</p>
             */
            public Builder addressPoolName(String addressPoolName) {
                this.addressPoolName = addressPoolName;
                return this;
            }

            /**
             * <p>Address pool type:</p>
             * <ul>
             * <li>IPv4</li>
             * <li>IPv6</li>
             * <li>domain</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>IPv4</p>
             */
            public Builder addressPoolType(String addressPoolType) {
                this.addressPoolType = addressPoolType;
                return this;
            }

            /**
             * <p>The addresses.</p>
             */
            public Builder addresses(Addresses addresses) {
                this.addresses = addresses;
                return this;
            }

            /**
             * <p>The availability state of the address pool. Valid values:</p>
             * <ul>
             * <li>Available: The address pool is available.</li>
             * <li>unavailable: The address pool is unavailable.</li>
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
             * <p>Address pool creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-03-15T01:46Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Address pool creation time (timestamp).</p>
             * 
             * <strong>example:</strong>
             * <p>1527690629357</p>
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * <p>The enabling state of the address pool. Valid values:</p>
             * <ul>
             * <li>enable: The address pool is enabled.</li>
             * <li>disable: The address pool is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>enable</p>
             */
            public Builder enableStatus(String enableStatus) {
                this.enableStatus = enableStatus;
                return this;
            }

            /**
             * <p>The condition for determining the health state of the address. Valid values:</p>
             * <ul>
             * <li>any_ok: The health check results of at least one health check template are normal.</li>
             * <li>p30_ok: The health check results of at least 30% of health check templates are normal.</li>
             * <li>p50_ok: The health check results of at least 50% of health check templates are normal.</li>
             * <li>p70_ok: The health check results of at least 70% of health check templates are normal.</li>
             * <li>all_ok: The health check results of all health check templates are normal.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>any_ok</p>
             */
            public Builder healthJudgement(String healthJudgement) {
                this.healthJudgement = healthJudgement;
                return this;
            }

            /**
             * <p>The health state of the address pool. Valid values:</p>
             * <ul>
             * <li>ok: The health state of the address pool is Normal and all addresses that are referenced by the address pool are available.</li>
             * <li>ok_alert: The health state of the address pool is Warning and some of the addresses that are referenced by the address pool are unavailable. However, the address pool is deemed normal. In this state, available address pools are normally used for DNS resolution, but unavailable address pools cannot be used for DNS resolution.</li>
             * <li>exceptional: The health state of the address pool is Abnormal and some or all of the addresses that are referenced by the address pool are unavailable. In this case, the address pool is deemed abnormal.</li>
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
             * <p>Remark</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>The mode used if the address with the smallest sequence number is recovered. This parameter is required only when AddressLbStrategy is set to sequence. Valid values:</p>
             * <ul>
             * <li>preemptive: The address with the smallest sequence number is preferentially used if this address is recovered.</li>
             * <li>non_preemptive: The current address is still used even if the address with the smallest sequence number is recovered.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>preemptive</p>
             */
            public Builder sequenceLbStrategyMode(String sequenceLbStrategyMode) {
                this.sequenceLbStrategyMode = sequenceLbStrategyMode;
                return this;
            }

            /**
             * <p>Last modification time of the address pool.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-03-15T01:46Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>Last modification time of the address pool (timestamp).</p>
             * 
             * <strong>example:</strong>
             * <p>1527690629357</p>
             */
            public Builder updateTimestamp(Long updateTimestamp) {
                this.updateTimestamp = updateTimestamp;
                return this;
            }

            public AddressPool build() {
                return new AddressPool(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCloudGtmAddressPoolsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCloudGtmAddressPoolsResponseBody</p>
     */
    public static class AddressPools extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddressPool")
        private java.util.List<AddressPool> addressPool;

        private AddressPools(Builder builder) {
            this.addressPool = builder.addressPool;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddressPools create() {
            return builder().build();
        }

        /**
         * @return addressPool
         */
        public java.util.List<AddressPool> getAddressPool() {
            return this.addressPool;
        }

        public static final class Builder {
            private java.util.List<AddressPool> addressPool; 

            private Builder() {
            } 

            private Builder(AddressPools model) {
                this.addressPool = model.addressPool;
            } 

            /**
             * AddressPool.
             */
            public Builder addressPool(java.util.List<AddressPool> addressPool) {
                this.addressPool = addressPool;
                return this;
            }

            public AddressPools build() {
                return new AddressPools(this);
            } 

        } 

    }
}
