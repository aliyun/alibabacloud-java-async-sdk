// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDedicatedLinesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDedicatedLinesResponseBody</p>
 */
public class ListDedicatedLinesResponseBody extends TeaModel {
    @NameInMap("DedicatedLines")
    private java.util.List < DedicatedLines> dedicatedLines;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private Integer nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListDedicatedLinesResponseBody(Builder builder) {
        this.dedicatedLines = builder.dedicatedLines;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDedicatedLinesResponseBody create() {
        return builder().build();
    }

    /**
     * @return dedicatedLines
     */
    public java.util.List < DedicatedLines> getDedicatedLines() {
        return this.dedicatedLines;
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
    public Integer getNextToken() {
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
        private java.util.List < DedicatedLines> dedicatedLines; 
        private Integer maxResults; 
        private Integer nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * DedicatedLines.
         */
        public Builder dedicatedLines(java.util.List < DedicatedLines> dedicatedLines) {
            this.dedicatedLines = dedicatedLines;
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
        public Builder nextToken(Integer nextToken) {
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

        public ListDedicatedLinesResponseBody build() {
            return new ListDedicatedLinesResponseBody(this);
        } 

    } 

    public static class Contact extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Email")
        private String email;

        @NameInMap("Name")
        private String name;

        @NameInMap("Phone")
        private String phone;

        private Contact(Builder builder) {
            this.description = builder.description;
            this.email = builder.email;
            this.name = builder.name;
            this.phone = builder.phone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Contact create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        public static final class Builder {
            private String description; 
            private String email; 
            private String name; 
            private String phone; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Email.
             */
            public Builder email(String email) {
                this.email = email;
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
             * Phone.
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            public Contact build() {
                return new Contact(this);
            } 

        } 

    }
    public static class DedicatedLines extends TeaModel {
        @NameInMap("Bandwidth")
        private Integer bandwidth;

        @NameInMap("Contact")
        private java.util.List < Contact> contact;

        @NameInMap("DedicatedLineGateway")
        private String dedicatedLineGateway;

        @NameInMap("DedicatedLineId")
        private String dedicatedLineId;

        @NameInMap("DedicatedLineIp")
        private String dedicatedLineIp;

        @NameInMap("DedicatedLineRole")
        private String dedicatedLineRole;

        @NameInMap("Description")
        private String description;

        @NameInMap("DeviceId")
        private String deviceId;

        @NameInMap("DeviceName")
        private String deviceName;

        @NameInMap("DevicePort")
        private String devicePort;

        @NameInMap("ExpirationDate")
        private String expirationDate;

        @NameInMap("Ext")
        private String ext;

        @NameInMap("Isp")
        private String isp;

        @NameInMap("IspFormId")
        private String ispFormId;

        @NameInMap("IspFormName")
        private String ispFormName;

        @NameInMap("IspId")
        private String ispId;

        @NameInMap("Keyword")
        private String keyword;

        @NameInMap("OnlineDate")
        private String onlineDate;

        @NameInMap("Phone")
        private String phone;

        @NameInMap("PhysicalSpaceId")
        private String physicalSpaceId;

        @NameInMap("SpaceName")
        private String spaceName;

        private DedicatedLines(Builder builder) {
            this.bandwidth = builder.bandwidth;
            this.contact = builder.contact;
            this.dedicatedLineGateway = builder.dedicatedLineGateway;
            this.dedicatedLineId = builder.dedicatedLineId;
            this.dedicatedLineIp = builder.dedicatedLineIp;
            this.dedicatedLineRole = builder.dedicatedLineRole;
            this.description = builder.description;
            this.deviceId = builder.deviceId;
            this.deviceName = builder.deviceName;
            this.devicePort = builder.devicePort;
            this.expirationDate = builder.expirationDate;
            this.ext = builder.ext;
            this.isp = builder.isp;
            this.ispFormId = builder.ispFormId;
            this.ispFormName = builder.ispFormName;
            this.ispId = builder.ispId;
            this.keyword = builder.keyword;
            this.onlineDate = builder.onlineDate;
            this.phone = builder.phone;
            this.physicalSpaceId = builder.physicalSpaceId;
            this.spaceName = builder.spaceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DedicatedLines create() {
            return builder().build();
        }

        /**
         * @return bandwidth
         */
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return contact
         */
        public java.util.List < Contact> getContact() {
            return this.contact;
        }

        /**
         * @return dedicatedLineGateway
         */
        public String getDedicatedLineGateway() {
            return this.dedicatedLineGateway;
        }

        /**
         * @return dedicatedLineId
         */
        public String getDedicatedLineId() {
            return this.dedicatedLineId;
        }

        /**
         * @return dedicatedLineIp
         */
        public String getDedicatedLineIp() {
            return this.dedicatedLineIp;
        }

        /**
         * @return dedicatedLineRole
         */
        public String getDedicatedLineRole() {
            return this.dedicatedLineRole;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return devicePort
         */
        public String getDevicePort() {
            return this.devicePort;
        }

        /**
         * @return expirationDate
         */
        public String getExpirationDate() {
            return this.expirationDate;
        }

        /**
         * @return ext
         */
        public String getExt() {
            return this.ext;
        }

        /**
         * @return isp
         */
        public String getIsp() {
            return this.isp;
        }

        /**
         * @return ispFormId
         */
        public String getIspFormId() {
            return this.ispFormId;
        }

        /**
         * @return ispFormName
         */
        public String getIspFormName() {
            return this.ispFormName;
        }

        /**
         * @return ispId
         */
        public String getIspId() {
            return this.ispId;
        }

        /**
         * @return keyword
         */
        public String getKeyword() {
            return this.keyword;
        }

        /**
         * @return onlineDate
         */
        public String getOnlineDate() {
            return this.onlineDate;
        }

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        /**
         * @return physicalSpaceId
         */
        public String getPhysicalSpaceId() {
            return this.physicalSpaceId;
        }

        /**
         * @return spaceName
         */
        public String getSpaceName() {
            return this.spaceName;
        }

        public static final class Builder {
            private Integer bandwidth; 
            private java.util.List < Contact> contact; 
            private String dedicatedLineGateway; 
            private String dedicatedLineId; 
            private String dedicatedLineIp; 
            private String dedicatedLineRole; 
            private String description; 
            private String deviceId; 
            private String deviceName; 
            private String devicePort; 
            private String expirationDate; 
            private String ext; 
            private String isp; 
            private String ispFormId; 
            private String ispFormName; 
            private String ispId; 
            private String keyword; 
            private String onlineDate; 
            private String phone; 
            private String physicalSpaceId; 
            private String spaceName; 

            /**
             * Bandwidth.
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * Contact.
             */
            public Builder contact(java.util.List < Contact> contact) {
                this.contact = contact;
                return this;
            }

            /**
             * DedicatedLineGateway.
             */
            public Builder dedicatedLineGateway(String dedicatedLineGateway) {
                this.dedicatedLineGateway = dedicatedLineGateway;
                return this;
            }

            /**
             * DedicatedLineId.
             */
            public Builder dedicatedLineId(String dedicatedLineId) {
                this.dedicatedLineId = dedicatedLineId;
                return this;
            }

            /**
             * DedicatedLineIp.
             */
            public Builder dedicatedLineIp(String dedicatedLineIp) {
                this.dedicatedLineIp = dedicatedLineIp;
                return this;
            }

            /**
             * DedicatedLineRole.
             */
            public Builder dedicatedLineRole(String dedicatedLineRole) {
                this.dedicatedLineRole = dedicatedLineRole;
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
             * DeviceId.
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * DeviceName.
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * DevicePort.
             */
            public Builder devicePort(String devicePort) {
                this.devicePort = devicePort;
                return this;
            }

            /**
             * ExpirationDate.
             */
            public Builder expirationDate(String expirationDate) {
                this.expirationDate = expirationDate;
                return this;
            }

            /**
             * Ext.
             */
            public Builder ext(String ext) {
                this.ext = ext;
                return this;
            }

            /**
             * Isp.
             */
            public Builder isp(String isp) {
                this.isp = isp;
                return this;
            }

            /**
             * IspFormId.
             */
            public Builder ispFormId(String ispFormId) {
                this.ispFormId = ispFormId;
                return this;
            }

            /**
             * IspFormName.
             */
            public Builder ispFormName(String ispFormName) {
                this.ispFormName = ispFormName;
                return this;
            }

            /**
             * IspId.
             */
            public Builder ispId(String ispId) {
                this.ispId = ispId;
                return this;
            }

            /**
             * Keyword.
             */
            public Builder keyword(String keyword) {
                this.keyword = keyword;
                return this;
            }

            /**
             * OnlineDate.
             */
            public Builder onlineDate(String onlineDate) {
                this.onlineDate = onlineDate;
                return this;
            }

            /**
             * Phone.
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * PhysicalSpaceId.
             */
            public Builder physicalSpaceId(String physicalSpaceId) {
                this.physicalSpaceId = physicalSpaceId;
                return this;
            }

            /**
             * SpaceName.
             */
            public Builder spaceName(String spaceName) {
                this.spaceName = spaceName;
                return this;
            }

            public DedicatedLines build() {
                return new DedicatedLines(this);
            } 

        } 

    }
}
