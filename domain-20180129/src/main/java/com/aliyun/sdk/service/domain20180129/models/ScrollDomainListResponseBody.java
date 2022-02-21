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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * ScrollId.
         */
        public Builder scrollId(String scrollId) {
            this.scrollId = scrollId;
            return this;
        }

        /**
         * TotalItemNum.
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
            private String zhRegistrantOrganization; 

            /**
             * DnsList.
             */
            public Builder dnsList(DnsList dnsList) {
                this.dnsList = dnsList;
                return this;
            }

            /**
             * DomainAuditStatus.
             */
            public Builder domainAuditStatus(String domainAuditStatus) {
                this.domainAuditStatus = domainAuditStatus;
                return this;
            }

            /**
             * DomainGroupId.
             */
            public Builder domainGroupId(String domainGroupId) {
                this.domainGroupId = domainGroupId;
                return this;
            }

            /**
             * DomainGroupName.
             */
            public Builder domainGroupName(String domainGroupName) {
                this.domainGroupName = domainGroupName;
                return this;
            }

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * DomainStatus.
             */
            public Builder domainStatus(String domainStatus) {
                this.domainStatus = domainStatus;
                return this;
            }

            /**
             * DomainType.
             */
            public Builder domainType(String domainType) {
                this.domainType = domainType;
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
             * ExpirationCurrDateDiff.
             */
            public Builder expirationCurrDateDiff(Integer expirationCurrDateDiff) {
                this.expirationCurrDateDiff = expirationCurrDateDiff;
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
             * ExpirationDateLong.
             */
            public Builder expirationDateLong(Long expirationDateLong) {
                this.expirationDateLong = expirationDateLong;
                return this;
            }

            /**
             * ExpirationDateStatus.
             */
            public Builder expirationDateStatus(String expirationDateStatus) {
                this.expirationDateStatus = expirationDateStatus;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Premium.
             */
            public Builder premium(Boolean premium) {
                this.premium = premium;
                return this;
            }

            /**
             * ProductId.
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * RegistrantOrganization.
             */
            public Builder registrantOrganization(String registrantOrganization) {
                this.registrantOrganization = registrantOrganization;
                return this;
            }

            /**
             * RegistrantType.
             */
            public Builder registrantType(String registrantType) {
                this.registrantType = registrantType;
                return this;
            }

            /**
             * RegistrationDate.
             */
            public Builder registrationDate(String registrationDate) {
                this.registrationDate = registrationDate;
                return this;
            }

            /**
             * RegistrationDateLong.
             */
            public Builder registrationDateLong(Long registrationDateLong) {
                this.registrationDateLong = registrationDateLong;
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
             * ZhRegistrantOrganization.
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
