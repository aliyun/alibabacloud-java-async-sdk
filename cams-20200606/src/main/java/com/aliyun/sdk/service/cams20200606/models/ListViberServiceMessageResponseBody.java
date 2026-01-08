// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

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
 * {@link ListViberServiceMessageResponseBody} extends {@link TeaModel}
 *
 * <p>ListViberServiceMessageResponseBody</p>
 */
public class ListViberServiceMessageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListViberServiceMessageResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListViberServiceMessageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
    public java.util.List<Data> getData() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListViberServiceMessageResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

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
        public Builder data(java.util.List<Data> data) {
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

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListViberServiceMessageResponseBody build() {
            return new ListViberServiceMessageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListViberServiceMessageResponseBody} extends {@link TeaModel}
     *
     * <p>ListViberServiceMessageResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BusinessAccountName")
        private String businessAccountName;

        @com.aliyun.core.annotation.NameInMap("DestinationCountryId")
        private java.util.List<String> destinationCountryId;

        @com.aliyun.core.annotation.NameInMap("DestinationInternationalCountryId")
        private java.util.List<String> destinationInternationalCountryId;

        @com.aliyun.core.annotation.NameInMap("IndustryInvolved")
        private String industryInvolved;

        @com.aliyun.core.annotation.NameInMap("MessageDestinationCountry")
        private java.util.List<String> messageDestinationCountry;

        @com.aliyun.core.annotation.NameInMap("MessageDestinationInternationalCountry")
        private java.util.List<String> messageDestinationInternationalCountry;

        @com.aliyun.core.annotation.NameInMap("ServiceId")
        private String serviceId;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        private Data(Builder builder) {
            this.businessAccountName = builder.businessAccountName;
            this.destinationCountryId = builder.destinationCountryId;
            this.destinationInternationalCountryId = builder.destinationInternationalCountryId;
            this.industryInvolved = builder.industryInvolved;
            this.messageDestinationCountry = builder.messageDestinationCountry;
            this.messageDestinationInternationalCountry = builder.messageDestinationInternationalCountry;
            this.serviceId = builder.serviceId;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return businessAccountName
         */
        public String getBusinessAccountName() {
            return this.businessAccountName;
        }

        /**
         * @return destinationCountryId
         */
        public java.util.List<String> getDestinationCountryId() {
            return this.destinationCountryId;
        }

        /**
         * @return destinationInternationalCountryId
         */
        public java.util.List<String> getDestinationInternationalCountryId() {
            return this.destinationInternationalCountryId;
        }

        /**
         * @return industryInvolved
         */
        public String getIndustryInvolved() {
            return this.industryInvolved;
        }

        /**
         * @return messageDestinationCountry
         */
        public java.util.List<String> getMessageDestinationCountry() {
            return this.messageDestinationCountry;
        }

        /**
         * @return messageDestinationInternationalCountry
         */
        public java.util.List<String> getMessageDestinationInternationalCountry() {
            return this.messageDestinationInternationalCountry;
        }

        /**
         * @return serviceId
         */
        public String getServiceId() {
            return this.serviceId;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String businessAccountName; 
            private java.util.List<String> destinationCountryId; 
            private java.util.List<String> destinationInternationalCountryId; 
            private String industryInvolved; 
            private java.util.List<String> messageDestinationCountry; 
            private java.util.List<String> messageDestinationInternationalCountry; 
            private String serviceId; 
            private String state; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.businessAccountName = model.businessAccountName;
                this.destinationCountryId = model.destinationCountryId;
                this.destinationInternationalCountryId = model.destinationInternationalCountryId;
                this.industryInvolved = model.industryInvolved;
                this.messageDestinationCountry = model.messageDestinationCountry;
                this.messageDestinationInternationalCountry = model.messageDestinationInternationalCountry;
                this.serviceId = model.serviceId;
                this.state = model.state;
            } 

            /**
             * BusinessAccountName.
             */
            public Builder businessAccountName(String businessAccountName) {
                this.businessAccountName = businessAccountName;
                return this;
            }

            /**
             * DestinationCountryId.
             */
            public Builder destinationCountryId(java.util.List<String> destinationCountryId) {
                this.destinationCountryId = destinationCountryId;
                return this;
            }

            /**
             * DestinationInternationalCountryId.
             */
            public Builder destinationInternationalCountryId(java.util.List<String> destinationInternationalCountryId) {
                this.destinationInternationalCountryId = destinationInternationalCountryId;
                return this;
            }

            /**
             * IndustryInvolved.
             */
            public Builder industryInvolved(String industryInvolved) {
                this.industryInvolved = industryInvolved;
                return this;
            }

            /**
             * MessageDestinationCountry.
             */
            public Builder messageDestinationCountry(java.util.List<String> messageDestinationCountry) {
                this.messageDestinationCountry = messageDestinationCountry;
                return this;
            }

            /**
             * MessageDestinationInternationalCountry.
             */
            public Builder messageDestinationInternationalCountry(java.util.List<String> messageDestinationInternationalCountry) {
                this.messageDestinationInternationalCountry = messageDestinationInternationalCountry;
                return this;
            }

            /**
             * ServiceId.
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
