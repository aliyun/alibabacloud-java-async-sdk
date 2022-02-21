// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSubscriptionDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetSubscriptionDetailResponseBody</p>
 */
public class GetSubscriptionDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private GetSubscriptionDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSubscriptionDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetSubscriptionDetailResponseBody build() {
            return new GetSubscriptionDetailResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("City")
        private String city;

        @NameInMap("PhoneNo")
        private String phoneNo;

        @NameInMap("Province")
        private String province;

        @NameInMap("SecretNo")
        private String secretNo;

        @NameInMap("SubsId")
        private Long subsId;

        @NameInMap("SwitchStatus")
        private Integer switchStatus;

        @NameInMap("Vendor")
        private String vendor;

        private Data(Builder builder) {
            this.city = builder.city;
            this.phoneNo = builder.phoneNo;
            this.province = builder.province;
            this.secretNo = builder.secretNo;
            this.subsId = builder.subsId;
            this.switchStatus = builder.switchStatus;
            this.vendor = builder.vendor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return city
         */
        public String getCity() {
            return this.city;
        }

        /**
         * @return phoneNo
         */
        public String getPhoneNo() {
            return this.phoneNo;
        }

        /**
         * @return province
         */
        public String getProvince() {
            return this.province;
        }

        /**
         * @return secretNo
         */
        public String getSecretNo() {
            return this.secretNo;
        }

        /**
         * @return subsId
         */
        public Long getSubsId() {
            return this.subsId;
        }

        /**
         * @return switchStatus
         */
        public Integer getSwitchStatus() {
            return this.switchStatus;
        }

        /**
         * @return vendor
         */
        public String getVendor() {
            return this.vendor;
        }

        public static final class Builder {
            private String city; 
            private String phoneNo; 
            private String province; 
            private String secretNo; 
            private Long subsId; 
            private Integer switchStatus; 
            private String vendor; 

            /**
             * City.
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * PhoneNo.
             */
            public Builder phoneNo(String phoneNo) {
                this.phoneNo = phoneNo;
                return this;
            }

            /**
             * Province.
             */
            public Builder province(String province) {
                this.province = province;
                return this;
            }

            /**
             * SecretNo.
             */
            public Builder secretNo(String secretNo) {
                this.secretNo = secretNo;
                return this;
            }

            /**
             * SubsId.
             */
            public Builder subsId(Long subsId) {
                this.subsId = subsId;
                return this;
            }

            /**
             * SwitchStatus.
             */
            public Builder switchStatus(Integer switchStatus) {
                this.switchStatus = switchStatus;
                return this;
            }

            /**
             * Vendor.
             */
            public Builder vendor(String vendor) {
                this.vendor = vendor;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
