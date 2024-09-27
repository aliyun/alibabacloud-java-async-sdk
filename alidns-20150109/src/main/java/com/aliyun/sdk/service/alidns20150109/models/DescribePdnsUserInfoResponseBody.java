// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribePdnsUserInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePdnsUserInfoResponseBody</p>
 */
public class DescribePdnsUserInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UserInfo")
    private UserInfo userInfo;

    private DescribePdnsUserInfoResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.userInfo = builder.userInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePdnsUserInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userInfo
     */
    public UserInfo getUserInfo() {
        return this.userInfo;
    }

    public static final class Builder {
        private String requestId; 
        private UserInfo userInfo; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UserInfo.
         */
        public Builder userInfo(UserInfo userInfo) {
            this.userInfo = userInfo;
            return this;
        }

        public DescribePdnsUserInfoResponseBody build() {
            return new DescribePdnsUserInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePdnsUserInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePdnsUserInfoResponseBody</p>
     */
    public static class UserInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableService")
        private String availableService;

        @com.aliyun.core.annotation.NameInMap("PdnsId")
        private Long pdnsId;

        @com.aliyun.core.annotation.NameInMap("SecretKey")
        private String secretKey;

        @com.aliyun.core.annotation.NameInMap("ServiceType")
        private String serviceType;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("StatisticSwitchStatus")
        private String statisticSwitchStatus;

        @com.aliyun.core.annotation.NameInMap("StoppedService")
        private String stoppedService;

        private UserInfo(Builder builder) {
            this.availableService = builder.availableService;
            this.pdnsId = builder.pdnsId;
            this.secretKey = builder.secretKey;
            this.serviceType = builder.serviceType;
            this.state = builder.state;
            this.statisticSwitchStatus = builder.statisticSwitchStatus;
            this.stoppedService = builder.stoppedService;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserInfo create() {
            return builder().build();
        }

        /**
         * @return availableService
         */
        public String getAvailableService() {
            return this.availableService;
        }

        /**
         * @return pdnsId
         */
        public Long getPdnsId() {
            return this.pdnsId;
        }

        /**
         * @return secretKey
         */
        public String getSecretKey() {
            return this.secretKey;
        }

        /**
         * @return serviceType
         */
        public String getServiceType() {
            return this.serviceType;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return statisticSwitchStatus
         */
        public String getStatisticSwitchStatus() {
            return this.statisticSwitchStatus;
        }

        /**
         * @return stoppedService
         */
        public String getStoppedService() {
            return this.stoppedService;
        }

        public static final class Builder {
            private String availableService; 
            private Long pdnsId; 
            private String secretKey; 
            private String serviceType; 
            private String state; 
            private String statisticSwitchStatus; 
            private String stoppedService; 

            /**
             * AvailableService.
             */
            public Builder availableService(String availableService) {
                this.availableService = availableService;
                return this;
            }

            /**
             * PdnsId.
             */
            public Builder pdnsId(Long pdnsId) {
                this.pdnsId = pdnsId;
                return this;
            }

            /**
             * SecretKey.
             */
            public Builder secretKey(String secretKey) {
                this.secretKey = secretKey;
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
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * StatisticSwitchStatus.
             */
            public Builder statisticSwitchStatus(String statisticSwitchStatus) {
                this.statisticSwitchStatus = statisticSwitchStatus;
                return this;
            }

            /**
             * StoppedService.
             */
            public Builder stoppedService(String stoppedService) {
                this.stoppedService = stoppedService;
                return this;
            }

            public UserInfo build() {
                return new UserInfo(this);
            } 

        } 

    }
}
