// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ScrollDomainListResponseBody} extends {@link TeaModel}
 *
 * <p>ScrollDomainListResponseBody</p>
 */
public class ScrollDomainListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScrollId")
    private String scrollId;

    @com.aliyun.core.annotation.NameInMap("TotalItemNum")
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
         * <p>The domain names.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>722AB7F5-61F0-408C-A012-4784AFD34083</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The scroll ID.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder scrollId(String scrollId) {
            this.scrollId = scrollId;
            return this;
        }

        /**
         * <p>The number of remaining domain names to be queried.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder totalItemNum(Integer totalItemNum) {
            this.totalItemNum = totalItemNum;
            return this;
        }

        public ScrollDomainListResponseBody build() {
            return new ScrollDomainListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ScrollDomainListResponseBody} extends {@link TeaModel}
     *
     * <p>ScrollDomainListResponseBody</p>
     */
    public static class DnsList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Dns")
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
    /**
     * 
     * {@link ScrollDomainListResponseBody} extends {@link TeaModel}
     *
     * <p>ScrollDomainListResponseBody</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>testKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>testValue</p>
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
    /**
     * 
     * {@link ScrollDomainListResponseBody} extends {@link TeaModel}
     *
     * <p>ScrollDomainListResponseBody</p>
     */
    public static class DomainTag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
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
    /**
     * 
     * {@link ScrollDomainListResponseBody} extends {@link TeaModel}
     *
     * <p>ScrollDomainListResponseBody</p>
     */
    public static class Domain extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DnsList")
        private DnsList dnsList;

        @com.aliyun.core.annotation.NameInMap("DomainAuditStatus")
        private String domainAuditStatus;

        @com.aliyun.core.annotation.NameInMap("DomainGroupId")
        private String domainGroupId;

        @com.aliyun.core.annotation.NameInMap("DomainGroupName")
        private String domainGroupName;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("DomainStatus")
        private String domainStatus;

        @com.aliyun.core.annotation.NameInMap("DomainType")
        private String domainType;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("ExpirationCurrDateDiff")
        private Integer expirationCurrDateDiff;

        @com.aliyun.core.annotation.NameInMap("ExpirationDate")
        private String expirationDate;

        @com.aliyun.core.annotation.NameInMap("ExpirationDateLong")
        private Long expirationDateLong;

        @com.aliyun.core.annotation.NameInMap("ExpirationDateStatus")
        private String expirationDateStatus;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Premium")
        private Boolean premium;

        @com.aliyun.core.annotation.NameInMap("ProductId")
        private String productId;

        @com.aliyun.core.annotation.NameInMap("RegistrantOrganization")
        private String registrantOrganization;

        @com.aliyun.core.annotation.NameInMap("RegistrantType")
        private String registrantType;

        @com.aliyun.core.annotation.NameInMap("RegistrationDate")
        private String registrationDate;

        @com.aliyun.core.annotation.NameInMap("RegistrationDateLong")
        private Long registrationDateLong;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private DomainTag tag;

        @com.aliyun.core.annotation.NameInMap("ZhRegistrantOrganization")
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
             * <p>The Domain Name System (DNS) servers of the domain name.</p>
             */
            public Builder dnsList(DnsList dnsList) {
                this.dnsList = dnsList;
                return this;
            }

            /**
             * <p>The status of real-name verification for the domain name. Valid values:</p>
             * <ul>
             * <li><strong>FAILED</strong>: Real-name verification for the domain name fails.</li>
             * <li><strong>SUCCEED</strong>: Real-name verification for the domain name is successful.</li>
             * <li><strong>NONAUDIT</strong>: Real-name verification for the domain name is not performed.</li>
             * <li><strong>AUDITING</strong>: Real-name verification for the domain name is in progress.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NONAUDIT</p>
             */
            public Builder domainAuditStatus(String domainAuditStatus) {
                this.domainAuditStatus = domainAuditStatus;
                return this;
            }

            /**
             * <p>The ID of the domain name group.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder domainGroupId(String domainGroupId) {
                this.domainGroupId = domainGroupId;
                return this;
            }

            /**
             * <p>The name of the domain name group.</p>
             * 
             * <strong>example:</strong>
             * <p>test group</p>
             */
            public Builder domainGroupName(String domainGroupName) {
                this.domainGroupName = domainGroupName;
                return this;
            }

            /**
             * <p>The domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The status of the domain name. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: The domain name needs to be renewed.</li>
             * <li><strong>2</strong>: The domain name needs to be redeemed.</li>
             * <li><strong>3</strong>: The domain name is normal.</li>
             * <li><strong>4</strong>: The domain name is being transferred out.</li>
             * <li><strong>5</strong>: The information about the domain name registrant is being modified.</li>
             * <li><strong>6</strong>: Real-name verification is not performed on the domain name.</li>
             * <li><strong>7</strong>: Real-name verification for the domain name fails.</li>
             * <li><strong>8</strong>: The real-name verification is being reviewed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder domainStatus(String domainStatus) {
                this.domainStatus = domainStatus;
                return this;
            }

            /**
             * <p>The type of the domain name. Valid values:</p>
             * <ul>
             * <li><strong>New gTLD</strong></li>
             * <li><strong>gTLD</strong></li>
             * <li><strong>ccTLD</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>gTLD</p>
             */
            public Builder domainType(String domainType) {
                this.domainType = domainType;
                return this;
            }

            /**
             * <p>The email address.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:username@example.com">username@example.com</a></p>
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * <p>The number of days from the expiration date of the domain name to the current date.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder expirationCurrDateDiff(Integer expirationCurrDateDiff) {
                this.expirationCurrDateDiff = expirationCurrDateDiff;
                return this;
            }

            /**
             * <p>The time when the domain name expires.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-02-15 17:30:35</p>
             */
            public Builder expirationDate(String expirationDate) {
                this.expirationDate = expirationDate;
                return this;
            }

            /**
             * <p>The time when the domain name expires. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1550223035000</p>
             */
            public Builder expirationDateLong(Long expirationDateLong) {
                this.expirationDateLong = expirationDateLong;
                return this;
            }

            /**
             * <p>Indicates whether the domain name expires. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: The domain name does not expire.</li>
             * <li><strong>2</strong>: The domain name expires.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder expirationDateStatus(String expirationDateStatus) {
                this.expirationDateStatus = expirationDateStatus;
                return this;
            }

            /**
             * <p>The instance ID of the domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>S1234</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Indicates whether the domain name is a premium domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder premium(Boolean premium) {
                this.premium = premium;
                return this;
            }

            /**
             * <p>The service ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2a</p>
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * <p>The registrant of the domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>alibaba cloud</p>
             */
            public Builder registrantOrganization(String registrantOrganization) {
                this.registrantOrganization = registrantOrganization;
                return this;
            }

            /**
             * <p>The registration type of the domain name. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: individual.</li>
             * <li><strong>2</strong>: enterprise.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder registrantType(String registrantType) {
                this.registrantType = registrantType;
                return this;
            }

            /**
             * <p>The time when the domain name was registered.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-02-15 00:00:00</p>
             */
            public Builder registrationDate(String registrationDate) {
                this.registrationDate = registrationDate;
                return this;
            }

            /**
             * <p>The time when the domain name was registered. This value is a UNIX timestamp that indicates the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1487088000000</p>
             */
            public Builder registrationDateLong(Long registrationDateLong) {
                this.registrationDateLong = registrationDateLong;
                return this;
            }

            /**
             * <p>The remarks on the domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>test domain</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aek2yyciz557g3q</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The resource tag.</p>
             */
            public Builder tag(DomainTag tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>The Chinese name of the domain name registrant.</p>
             * 
             * <strong>example:</strong>
             * <p>阿里云</p>
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
    /**
     * 
     * {@link ScrollDomainListResponseBody} extends {@link TeaModel}
     *
     * <p>ScrollDomainListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Domain")
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
