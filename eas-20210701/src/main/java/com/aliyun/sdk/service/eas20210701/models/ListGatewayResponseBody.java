// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
 * {@link ListGatewayResponseBody} extends {@link TeaModel}
 *
 * <p>ListGatewayResponseBody</p>
 */
public class ListGatewayResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Gateways")
    private java.util.List<Gateways> gateways;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListGatewayResponseBody(Builder builder) {
        this.gateways = builder.gateways;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGatewayResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gateways
     */
    public java.util.List<Gateways> getGateways() {
        return this.gateways;
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
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Gateways> gateways; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListGatewayResponseBody model) {
            this.gateways = model.gateways;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The private gateways.</p>
         */
        public Builder gateways(java.util.List<Gateways> gateways) {
            this.gateways = gateways;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>40325405-579C-4D82****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of private gateways returned.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListGatewayResponseBody build() {
            return new ListGatewayResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListGatewayResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewayResponseBody</p>
     */
    public static class Gateways extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("GatewayId")
        private String gatewayId;

        @com.aliyun.core.annotation.NameInMap("GatewayName")
        private String gatewayName;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("InternetDomain")
        private String internetDomain;

        @com.aliyun.core.annotation.NameInMap("InternetEnabled")
        private Boolean internetEnabled;

        @com.aliyun.core.annotation.NameInMap("IntranetDomain")
        private String intranetDomain;

        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private Boolean isDefault;

        @com.aliyun.core.annotation.NameInMap("Replicas")
        private Integer replicas;

        @com.aliyun.core.annotation.NameInMap("SSLRedirectionEnabled")
        private Boolean SSLRedirectionEnabled;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private Gateways(Builder builder) {
            this.chargeType = builder.chargeType;
            this.createTime = builder.createTime;
            this.gatewayId = builder.gatewayId;
            this.gatewayName = builder.gatewayName;
            this.instanceType = builder.instanceType;
            this.internetDomain = builder.internetDomain;
            this.internetEnabled = builder.internetEnabled;
            this.intranetDomain = builder.intranetDomain;
            this.isDefault = builder.isDefault;
            this.replicas = builder.replicas;
            this.SSLRedirectionEnabled = builder.SSLRedirectionEnabled;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Gateways create() {
            return builder().build();
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return gatewayId
         */
        public String getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return gatewayName
         */
        public String getGatewayName() {
            return this.gatewayName;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return internetDomain
         */
        public String getInternetDomain() {
            return this.internetDomain;
        }

        /**
         * @return internetEnabled
         */
        public Boolean getInternetEnabled() {
            return this.internetEnabled;
        }

        /**
         * @return intranetDomain
         */
        public String getIntranetDomain() {
            return this.intranetDomain;
        }

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return replicas
         */
        public Integer getReplicas() {
            return this.replicas;
        }

        /**
         * @return SSLRedirectionEnabled
         */
        public Boolean getSSLRedirectionEnabled() {
            return this.SSLRedirectionEnabled;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String chargeType; 
            private String createTime; 
            private String gatewayId; 
            private String gatewayName; 
            private String instanceType; 
            private String internetDomain; 
            private Boolean internetEnabled; 
            private String intranetDomain; 
            private Boolean isDefault; 
            private Integer replicas; 
            private Boolean SSLRedirectionEnabled; 
            private String status; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(Gateways model) {
                this.chargeType = model.chargeType;
                this.createTime = model.createTime;
                this.gatewayId = model.gatewayId;
                this.gatewayName = model.gatewayName;
                this.instanceType = model.instanceType;
                this.internetDomain = model.internetDomain;
                this.internetEnabled = model.internetEnabled;
                this.intranetDomain = model.intranetDomain;
                this.isDefault = model.isDefault;
                this.replicas = model.replicas;
                this.SSLRedirectionEnabled = model.SSLRedirectionEnabled;
                this.status = model.status;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The billing method. Valid values:</p>
             * <ul>
             * <li>PrePaid: subscription.</li>
             * <li>PostPaid: pay-as-you-go.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PostPaid</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>The time when the private gateway was created. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-05-19T14:19:42Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The private gateway ID.</p>
             * 
             * <strong>example:</strong>
             * <p>gw-1uhcqmsc7x22******</p>
             */
            public Builder gatewayId(String gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * <p>The private gateway alias.</p>
             * 
             * <strong>example:</strong>
             * <p>mygateway1</p>
             */
            public Builder gatewayName(String gatewayName) {
                this.gatewayName = gatewayName;
                return this;
            }

            /**
             * <p>The type of instances used for the private gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>2c4g</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The public endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>gw-1uhcqmsc7x22******-1801786532******.cn-wulanchabu.pai-eas.aliyuncs.com</p>
             */
            public Builder internetDomain(String internetDomain) {
                this.internetDomain = internetDomain;
                return this;
            }

            /**
             * <p>Indicates whether Internet access is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder internetEnabled(Boolean internetEnabled) {
                this.internetEnabled = internetEnabled;
                return this;
            }

            /**
             * <p>The internal endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>gw-1uhcqmsc7x22******-1801786532******-vpc.cn-wulanchabu.pai-eas.aliyuncs.com</p>
             */
            public Builder intranetDomain(String intranetDomain) {
                this.intranetDomain = intranetDomain;
                return this;
            }

            /**
             * <p>Indicates whether it is the default private gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * <p>The number of nodes in the private gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder replicas(Integer replicas) {
                this.replicas = replicas;
                return this;
            }

            /**
             * <p>Specifies whether to enable HTTP to HTTPS redirection.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder SSLRedirectionEnabled(Boolean SSLRedirectionEnabled) {
                this.SSLRedirectionEnabled = SSLRedirectionEnabled;
                return this;
            }

            /**
             * <p>The state of the private gateway.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Creating</li>
             * <li>Stopped</li>
             * <li>Failed</li>
             * <li>Running</li>
             * <li>Deleted</li>
             * <li>Deleting</li>
             * <li>Waiting</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The time when the private gateway was updated. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-02-24T11:52:17Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Gateways build() {
                return new Gateways(this);
            } 

        } 

    }
}
