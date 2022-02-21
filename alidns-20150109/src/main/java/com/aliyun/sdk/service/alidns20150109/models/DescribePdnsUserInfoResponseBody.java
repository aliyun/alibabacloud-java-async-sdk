// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePdnsUserInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePdnsUserInfoResponseBody</p>
 */
public class DescribePdnsUserInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UserInfo")
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

    public static class UserInfo extends TeaModel {
        @NameInMap("AvailableService")
        private String availableService;

        @NameInMap("PdnsId")
        private Long pdnsId;

        @NameInMap("ServiceType")
        private String serviceType;

        @NameInMap("State")
        private String state;

        @NameInMap("StoppedService")
        private String stoppedService;

        private UserInfo(Builder builder) {
            this.availableService = builder.availableService;
            this.pdnsId = builder.pdnsId;
            this.serviceType = builder.serviceType;
            this.state = builder.state;
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
         * @return stoppedService
         */
        public String getStoppedService() {
            return this.stoppedService;
        }

        public static final class Builder {
            private String availableService; 
            private Long pdnsId; 
            private String serviceType; 
            private String state; 
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
