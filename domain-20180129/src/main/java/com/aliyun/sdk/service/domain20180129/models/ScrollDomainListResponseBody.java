// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ScrollDomainListResponseBody} extends {@link TeaModel}
 *
 * <p>ScrollDomainListResponseBody</p>
 */
public class ScrollDomainListResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ScrollId")
    private String scrollId;

    @NameInMap("TotalItemNum")
    private Integer totalItemNum;

    private ScrollDomainListResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.scrollId = builder.scrollId;
        this.totalItemNum = builder.totalItemNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScrollDomainListResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
     * @return scrollId
     */
    public String getScrollId() {
        return this.scrollId;
    }

    /**
     * @return totalItemNum
     */
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public static final class Builder {
        private Data data; 
        private Integer pageSize; 
        private String requestId; 
        private String scrollId; 
        private Integer totalItemNum; 

        /**
         * The domain names.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The scroll ID.
         */
        public Builder scrollId(String scrollId) {
            this.scrollId = scrollId;
            return this;
        }

        /**
         * The number of remaining domain names to be queried.
         */
        public Builder totalItemNum(Integer totalItemNum) {
            this.totalItemNum = totalItemNum;
            return this;
        }

        public ScrollDomainListResponseBody build() {
            return new ScrollDomainListResponseBody(this);
        } 

    } 

    public static class DnsList extends TeaModel {
        @NameInMap("Dns")
        private java.util.List < String > dns;

        private DnsList(Builder builder) {
            this.dns = builder.dns;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DnsList create() {
            return builder().build();
        }

        /**
         * @return dns
         */
        public java.util.List < String > getDns() {
            return this.dns;
        }

        public static final class Builder {
            private java.util.List < String > dns; 

            /**
             * Dns.
             */
            public Builder dns(java.util.List < String > dns) {
                this.dns = dns;
                return this;
            }

            public DnsList build() {
                return new DnsList(this);
            } 

        } 

    }
    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    public static class DomainTag extends TeaModel {
        @NameInMap("Tag")
        private java.util.List < Tag> tag;

        private DomainTag(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainTag create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List < Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < Tag> tag) {
                this.tag = tag;
                return this;
            }

            public DomainTag build() {
                return new DomainTag(this);
            } 

        } 

    }
    public static class Domain extends TeaModel {
        @NameInMap("DnsList")
        private DnsList dnsList;

        @NameInMap("DomainAuditStatus")
        private String domainAuditStatus;

        @NameInMap("DomainGroupId")
        private String domainGroupId;

        @NameInMap("DomainGroupName")
        private String domainGroupName;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("DomainStatus")
        private String domainStatus;

        @NameInMap("DomainType")
        private String domainType;

        @NameInMap("Email")
        private String email;

        @NameInMap("ExpirationCurrDateDiff")
        private Integer expirationCurrDateDiff;

        @NameInMap("ExpirationDate")
        private String expirationDate;

        @NameInMap("ExpirationDateLong")
        private Long expirationDateLong;

        @NameInMap("ExpirationDateStatus")
        private String expirationDateStatus;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Premium")
        private Boolean premium;

        @NameInMap("ProductId")
        private String productId;

        @NameInMap("RegistrantOrganization")
        private String registrantOrganization;

        @NameInMap("RegistrantType")
        private String registrantType;

        @NameInMap("RegistrationDate")
        private String registrationDate;

        @NameInMap("RegistrationDateLong")
        private Long registrationDateLong;

        @NameInMap("Remark")
        private String remark;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("Tag")
        private DomainTag tag;

        @NameInMap("ZhRegistrantOrganization")
        private String zhRegistrantOrganization;

        private Domain(Builder builder) {
            this.dnsList = builder.dnsList;
            this.domainAuditStatus = builder.domainAuditStatus;
            this.domainGroupId = builder.domainGroupId;
            this.domainGroupName = builder.domainGroupName;
            this.domainName = builder.domainName;
            this.domainStatus = builder.domainStatus;
            this.domainType = builder.domainType;
            this.email = builder.email;
            this.expirationCurrDateDiff = builder.expirationCurrDateDiff;
            this.expirationDate = builder.expirationDate;
            this.expirationDateLong = builder.expirationDateLong;
            this.expirationDateStatus = builder.expirationDateStatus;
            this.instanceId = builder.instanceId;
            this.premium = builder.premium;
            this.productId = builder.productId;
            this.registrantOrganization = builder.registrantOrganization;
            this.registrantType = builder.registrantType;
            this.registrationDate = builder.registrationDate;
            this.registrationDateLong = builder.registrationDateLong;
            this.remark = builder.remark;
            this.resourceGroupId = builder.resourceGroupId;
            this.tag = builder.tag;
            this.zhRegistrantOrganization = builder.zhRegistrantOrganization;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Domain create() {
            return builder().build();
        }

        /**
         * @return dnsList
         */
        public DnsList getDnsList() {
            return this.dnsList;
        }

        /**
         * @return domainAuditStatus
         */
        public String getDomainAuditStatus() {
            return this.domainAuditStatus;
        }

        /**
         * @return domainGroupId
         */
        public String getDomainGroupId() {
            return this.domainGroupId;
        }

        /**
         * @return domainGroupName
         */
        public String getDomainGroupName() {
            return this.domainGroupName;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return domainStatus
         */
        public String getDomainStatus() {
            return this.domainStatus;
        }

        /**
         * @return domainType
         */
        public String getDomainType() {
            return this.domainType;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return expirationCurrDateDiff
         */
        public Integer getExpirationCurrDateDiff() {
            return this.expirationCurrDateDiff;
        }

        /**
         * @return expirationDate
         */
        public String getExpirationDate() {
            return this.expirationDate;
        }

        /**
         * @return expirationDateLong
         */
        public Long getExpirationDateLong() {
            return this.expirationDateLong;
        }

        /**
         * @return expirationDateStatus
         */
        public String getExpirationDateStatus() {
            return this.expirationDateStatus;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return premium
         */
        public Boolean getPremium() {
            return this.premium;
        }

        /**
         * @return productId
         */
        public String getProductId() {
            return this.productId;
        }

        /**
         * @return registrantOrganization
         */
        public String getRegistrantOrganization() {
            return this.registrantOrganization;
        }

        /**
         * @return registrantType
         */
        public String getRegistrantType() {
            return this.registrantType;
        }

        /**
         * @return registrationDate
         */
        public String getRegistrationDate() {
            return this.registrationDate;
        }

        /**
         * @return registrationDateLong
         */
        public Long getRegistrationDateLong() {
            return this.registrationDateLong;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return tag
         */
        public DomainTag getTag() {
            return this.tag;
        }

        /**
         * @return zhRegistrantOrganization
         */
        public String getZhRegistrantOrganization() {
            return this.zhRegistrantOrganization;
        }

        public static final class Builder {
            private DnsList dnsList; 
            private String domainAuditStatus; 
            private String domainGroupId; 
            private String domainGroupName; 
            private String domainName; 
            private String domainStatus; 
            private String domainType; 
            private String email; 
            private Integer expirationCurrDateDiff; 
            private String expirationDate; 
            private Long expirationDateLong; 
            private String expirationDateStatus; 
            private String instanceId; 
            private Boolean premium; 
            private String productId; 
            private String registrantOrganization; 
            private String registrantType; 
            private String registrationDate; 
            private Long registrationDateLong; 
            private String remark; 
            private String resourceGroupId; 
            private DomainTag tag; 
            private String zhRegistrantOrganization; 

            /**
             * The Domain Name System (DNS) servers of the domain name.
             */
            public Builder dnsList(DnsList dnsList) {
                this.dnsList = dnsList;
                return this;
            }

            /**
             * The status of real-name verification for the domain name. Valid values:
             * <p>
             * 
             * *   **FAILED**: Real-name verification for the domain name fails.
             * *   **SUCCEED**: Real-name verification for the domain name is successful.
             * *   **NONAUDIT**: Real-name verification for the domain name is not performed.
             * *   **AUDITING**: Real-name verification for the domain name is in progress.
             */
            public Builder domainAuditStatus(String domainAuditStatus) {
                this.domainAuditStatus = domainAuditStatus;
                return this;
            }

            /**
             * The ID of the domain name group.
             */
            public Builder domainGroupId(String domainGroupId) {
                this.domainGroupId = domainGroupId;
                return this;
            }

            /**
             * The name of the domain name group.
             */
            public Builder domainGroupName(String domainGroupName) {
                this.domainGroupName = domainGroupName;
                return this;
            }

            /**
             * The domain name.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * The status of the domain name. Valid values:
             * <p>
             * 
             * *   **1**: The domain name needs to be renewed.
             * *   **2**: The domain name needs to be redeemed.
             * *   **3**: The domain name is normal.
             * *   **4**: The domain name is being transferred out.
             * *   **5**: The information about the domain name registrant is being modified.
             * *   **6**: Real-name verification is not performed on the domain name.
             * *   **7**: Real-name verification for the domain name fails.
             * *   **8**: The real-name verification is being reviewed.
             */
            public Builder domainStatus(String domainStatus) {
                this.domainStatus = domainStatus;
                return this;
            }

            /**
             * The type of the domain name. Valid values:
             * <p>
             * 
             * *   **New gTLD**
             * *   **gTLD**
             * *   **ccTLD**
             */
            public Builder domainType(String domainType) {
                this.domainType = domainType;
                return this;
            }

            /**
             * The email address.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * The number of days from the expiration date of the domain name to the current date.
             */
            public Builder expirationCurrDateDiff(Integer expirationCurrDateDiff) {
                this.expirationCurrDateDiff = expirationCurrDateDiff;
                return this;
            }

            /**
             * The time when the domain name expires.
             */
            public Builder expirationDate(String expirationDate) {
                this.expirationDate = expirationDate;
                return this;
            }

            /**
             * The time when the domain name expires. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder expirationDateLong(Long expirationDateLong) {
                this.expirationDateLong = expirationDateLong;
                return this;
            }

            /**
             * Indicates whether the domain name expires. Valid values:
             * <p>
             * 
             * *   **1**: The domain name does not expire.
             * *   **2**: The domain name expires.
             */
            public Builder expirationDateStatus(String expirationDateStatus) {
                this.expirationDateStatus = expirationDateStatus;
                return this;
            }

            /**
             * The instance ID of the domain name.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Indicates whether the domain name is a premium domain name.
             */
            public Builder premium(Boolean premium) {
                this.premium = premium;
                return this;
            }

            /**
             * The service ID.
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * The registrant of the domain name.
             */
            public Builder registrantOrganization(String registrantOrganization) {
                this.registrantOrganization = registrantOrganization;
                return this;
            }

            /**
             * The registration type of the domain name. Valid values:
             * <p>
             * 
             * *   **1**: individual.
             * *   **2**: enterprise.
             */
            public Builder registrantType(String registrantType) {
                this.registrantType = registrantType;
                return this;
            }

            /**
             * The time when the domain name was registered.
             */
            public Builder registrationDate(String registrationDate) {
                this.registrationDate = registrationDate;
                return this;
            }

            /**
             * The time when the domain name was registered. This value is a UNIX timestamp that indicates the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder registrationDateLong(Long registrationDateLong) {
                this.registrationDateLong = registrationDateLong;
                return this;
            }

            /**
             * The remarks on the domain name.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * The ID of the resource group.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The resource tag.
             */
            public Builder tag(DomainTag tag) {
                this.tag = tag;
                return this;
            }

            /**
             * The Chinese name of the domain name registrant.
             */
            public Builder zhRegistrantOrganization(String zhRegistrantOrganization) {
                this.zhRegistrantOrganization = zhRegistrantOrganization;
                return this;
            }

            public Domain build() {
                return new Domain(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Domain")
        private java.util.List < Domain> domain;

        private Data(Builder builder) {
            this.domain = builder.domain;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public java.util.List < Domain> getDomain() {
            return this.domain;
        }

        public static final class Builder {
            private java.util.List < Domain> domain; 

            /**
             * Domain.
             */
            public Builder domain(java.util.List < Domain> domain) {
                this.domain = domain;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
