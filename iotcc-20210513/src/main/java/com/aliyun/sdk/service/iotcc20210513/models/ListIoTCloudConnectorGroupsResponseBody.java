// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIoTCloudConnectorGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListIoTCloudConnectorGroupsResponseBody</p>
 */
public class ListIoTCloudConnectorGroupsResponseBody extends TeaModel {
    @NameInMap("IoTCloudConnectorGroups")
    private java.util.List < IoTCloudConnectorGroups> ioTCloudConnectorGroups;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListIoTCloudConnectorGroupsResponseBody(Builder builder) {
        this.ioTCloudConnectorGroups = builder.ioTCloudConnectorGroups;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIoTCloudConnectorGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return ioTCloudConnectorGroups
     */
    public java.util.List < IoTCloudConnectorGroups> getIoTCloudConnectorGroups() {
        return this.ioTCloudConnectorGroups;
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

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < IoTCloudConnectorGroups> ioTCloudConnectorGroups; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * IoTCloudConnectorGroups.
         */
        public Builder ioTCloudConnectorGroups(java.util.List < IoTCloudConnectorGroups> ioTCloudConnectorGroups) {
            this.ioTCloudConnectorGroups = ioTCloudConnectorGroups;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListIoTCloudConnectorGroupsResponseBody build() {
            return new ListIoTCloudConnectorGroupsResponseBody(this);
        } 

    } 

    public static class IoTCloudConnectors extends TeaModel {
        @NameInMap("APN")
        private String APN;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("ISP")
        private String ISP;

        @NameInMap("IoTCloudConnectorDescription")
        private String ioTCloudConnectorDescription;

        @NameInMap("IoTCloudConnectorId")
        private String ioTCloudConnectorId;

        @NameInMap("IoTCloudConnectorName")
        private String ioTCloudConnectorName;

        @NameInMap("IoTCloudConnectorStatus")
        private String ioTCloudConnectorStatus;

        @NameInMap("ServiceType")
        private String serviceType;

        private IoTCloudConnectors(Builder builder) {
            this.APN = builder.APN;
            this.createTime = builder.createTime;
            this.ISP = builder.ISP;
            this.ioTCloudConnectorDescription = builder.ioTCloudConnectorDescription;
            this.ioTCloudConnectorId = builder.ioTCloudConnectorId;
            this.ioTCloudConnectorName = builder.ioTCloudConnectorName;
            this.ioTCloudConnectorStatus = builder.ioTCloudConnectorStatus;
            this.serviceType = builder.serviceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IoTCloudConnectors create() {
            return builder().build();
        }

        /**
         * @return APN
         */
        public String getAPN() {
            return this.APN;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return ISP
         */
        public String getISP() {
            return this.ISP;
        }

        /**
         * @return ioTCloudConnectorDescription
         */
        public String getIoTCloudConnectorDescription() {
            return this.ioTCloudConnectorDescription;
        }

        /**
         * @return ioTCloudConnectorId
         */
        public String getIoTCloudConnectorId() {
            return this.ioTCloudConnectorId;
        }

        /**
         * @return ioTCloudConnectorName
         */
        public String getIoTCloudConnectorName() {
            return this.ioTCloudConnectorName;
        }

        /**
         * @return ioTCloudConnectorStatus
         */
        public String getIoTCloudConnectorStatus() {
            return this.ioTCloudConnectorStatus;
        }

        /**
         * @return serviceType
         */
        public String getServiceType() {
            return this.serviceType;
        }

        public static final class Builder {
            private String APN; 
            private Long createTime; 
            private String ISP; 
            private String ioTCloudConnectorDescription; 
            private String ioTCloudConnectorId; 
            private String ioTCloudConnectorName; 
            private String ioTCloudConnectorStatus; 
            private String serviceType; 

            /**
             * APN.
             */
            public Builder APN(String APN) {
                this.APN = APN;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * ISP.
             */
            public Builder ISP(String ISP) {
                this.ISP = ISP;
                return this;
            }

            /**
             * IoTCloudConnectorDescription.
             */
            public Builder ioTCloudConnectorDescription(String ioTCloudConnectorDescription) {
                this.ioTCloudConnectorDescription = ioTCloudConnectorDescription;
                return this;
            }

            /**
             * IoTCloudConnectorId.
             */
            public Builder ioTCloudConnectorId(String ioTCloudConnectorId) {
                this.ioTCloudConnectorId = ioTCloudConnectorId;
                return this;
            }

            /**
             * IoTCloudConnectorName.
             */
            public Builder ioTCloudConnectorName(String ioTCloudConnectorName) {
                this.ioTCloudConnectorName = ioTCloudConnectorName;
                return this;
            }

            /**
             * IoTCloudConnectorStatus.
             */
            public Builder ioTCloudConnectorStatus(String ioTCloudConnectorStatus) {
                this.ioTCloudConnectorStatus = ioTCloudConnectorStatus;
                return this;
            }

            /**
             * ServiceType.
             */
            public Builder serviceType(String serviceType) {
                this.serviceType = serviceType;
                return this;
            }

            public IoTCloudConnectors build() {
                return new IoTCloudConnectors(this);
            } 

        } 

    }
    public static class IoTCloudConnectorGroups extends TeaModel {
        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("IoTCloudConnectorGroupId")
        private String ioTCloudConnectorGroupId;

        @NameInMap("IoTCloudConnectorGroupStatus")
        private String ioTCloudConnectorGroupStatus;

        @NameInMap("IoTCloudConnectors")
        private java.util.List < IoTCloudConnectors> ioTCloudConnectors;

        @NameInMap("Name")
        private String name;

        @NameInMap("ServiceType")
        private String serviceType;

        @NameInMap("Type")
        private String type;

        private IoTCloudConnectorGroups(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.ioTCloudConnectorGroupId = builder.ioTCloudConnectorGroupId;
            this.ioTCloudConnectorGroupStatus = builder.ioTCloudConnectorGroupStatus;
            this.ioTCloudConnectors = builder.ioTCloudConnectors;
            this.name = builder.name;
            this.serviceType = builder.serviceType;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IoTCloudConnectorGroups create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return ioTCloudConnectorGroupId
         */
        public String getIoTCloudConnectorGroupId() {
            return this.ioTCloudConnectorGroupId;
        }

        /**
         * @return ioTCloudConnectorGroupStatus
         */
        public String getIoTCloudConnectorGroupStatus() {
            return this.ioTCloudConnectorGroupStatus;
        }

        /**
         * @return ioTCloudConnectors
         */
        public java.util.List < IoTCloudConnectors> getIoTCloudConnectors() {
            return this.ioTCloudConnectors;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return serviceType
         */
        public String getServiceType() {
            return this.serviceType;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long createTime; 
            private String description; 
            private String ioTCloudConnectorGroupId; 
            private String ioTCloudConnectorGroupStatus; 
            private java.util.List < IoTCloudConnectors> ioTCloudConnectors; 
            private String name; 
            private String serviceType; 
            private String type; 

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * IoTCloudConnectorGroupId.
             */
            public Builder ioTCloudConnectorGroupId(String ioTCloudConnectorGroupId) {
                this.ioTCloudConnectorGroupId = ioTCloudConnectorGroupId;
                return this;
            }

            /**
             * IoTCloudConnectorGroupStatus.
             */
            public Builder ioTCloudConnectorGroupStatus(String ioTCloudConnectorGroupStatus) {
                this.ioTCloudConnectorGroupStatus = ioTCloudConnectorGroupStatus;
                return this;
            }

            /**
             * IoTCloudConnectors.
             */
            public Builder ioTCloudConnectors(java.util.List < IoTCloudConnectors> ioTCloudConnectors) {
                this.ioTCloudConnectors = ioTCloudConnectors;
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
             * ServiceType.
             */
            public Builder serviceType(String serviceType) {
                this.serviceType = serviceType;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public IoTCloudConnectorGroups build() {
                return new IoTCloudConnectorGroups(this);
            } 

        } 

    }
}
