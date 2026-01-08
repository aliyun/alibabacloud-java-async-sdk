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
 * {@link QueryInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>QueryInstanceResponseBody</p>
 */
public class QueryInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryInstanceResponseBody(Builder builder) {
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

    public static QueryInstanceResponseBody create() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryInstanceResponseBody model) {
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

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryInstanceResponseBody build() {
            return new QueryInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>QueryInstanceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChannelType")
        private String channelType;

        @com.aliyun.core.annotation.NameInMap("ContactMail")
        private String contactMail;

        @com.aliyun.core.annotation.NameInMap("CountryId")
        private String countryId;

        @com.aliyun.core.annotation.NameInMap("CustType")
        private String custType;

        @com.aliyun.core.annotation.NameInMap("FacebookBmId")
        private String facebookBmId;

        @com.aliyun.core.annotation.NameInMap("InstanceDescription")
        private String instanceDescription;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("IsvTerms")
        private String isvTerms;

        @com.aliyun.core.annotation.NameInMap("OfficeAddress")
        private String officeAddress;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ResourceRegionId")
        private String resourceRegionId;

        @com.aliyun.core.annotation.NameInMap("SubmitTime")
        private String submitTime;

        private Data(Builder builder) {
            this.channelType = builder.channelType;
            this.contactMail = builder.contactMail;
            this.countryId = builder.countryId;
            this.custType = builder.custType;
            this.facebookBmId = builder.facebookBmId;
            this.instanceDescription = builder.instanceDescription;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.isvTerms = builder.isvTerms;
            this.officeAddress = builder.officeAddress;
            this.resourceGroupId = builder.resourceGroupId;
            this.resourceRegionId = builder.resourceRegionId;
            this.submitTime = builder.submitTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return channelType
         */
        public String getChannelType() {
            return this.channelType;
        }

        /**
         * @return contactMail
         */
        public String getContactMail() {
            return this.contactMail;
        }

        /**
         * @return countryId
         */
        public String getCountryId() {
            return this.countryId;
        }

        /**
         * @return custType
         */
        public String getCustType() {
            return this.custType;
        }

        /**
         * @return facebookBmId
         */
        public String getFacebookBmId() {
            return this.facebookBmId;
        }

        /**
         * @return instanceDescription
         */
        public String getInstanceDescription() {
            return this.instanceDescription;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return isvTerms
         */
        public String getIsvTerms() {
            return this.isvTerms;
        }

        /**
         * @return officeAddress
         */
        public String getOfficeAddress() {
            return this.officeAddress;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return resourceRegionId
         */
        public String getResourceRegionId() {
            return this.resourceRegionId;
        }

        /**
         * @return submitTime
         */
        public String getSubmitTime() {
            return this.submitTime;
        }

        public static final class Builder {
            private String channelType; 
            private String contactMail; 
            private String countryId; 
            private String custType; 
            private String facebookBmId; 
            private String instanceDescription; 
            private String instanceId; 
            private String instanceName; 
            private String isvTerms; 
            private String officeAddress; 
            private String resourceGroupId; 
            private String resourceRegionId; 
            private String submitTime; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.channelType = model.channelType;
                this.contactMail = model.contactMail;
                this.countryId = model.countryId;
                this.custType = model.custType;
                this.facebookBmId = model.facebookBmId;
                this.instanceDescription = model.instanceDescription;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.isvTerms = model.isvTerms;
                this.officeAddress = model.officeAddress;
                this.resourceGroupId = model.resourceGroupId;
                this.resourceRegionId = model.resourceRegionId;
                this.submitTime = model.submitTime;
            } 

            /**
             * ChannelType.
             */
            public Builder channelType(String channelType) {
                this.channelType = channelType;
                return this;
            }

            /**
             * ContactMail.
             */
            public Builder contactMail(String contactMail) {
                this.contactMail = contactMail;
                return this;
            }

            /**
             * CountryId.
             */
            public Builder countryId(String countryId) {
                this.countryId = countryId;
                return this;
            }

            /**
             * CustType.
             */
            public Builder custType(String custType) {
                this.custType = custType;
                return this;
            }

            /**
             * <p>FacebookBmId</p>
             * 
             * <strong>example:</strong>
             * <p>399298882</p>
             */
            public Builder facebookBmId(String facebookBmId) {
                this.facebookBmId = facebookBmId;
                return this;
            }

            /**
             * InstanceDescription.
             */
            public Builder instanceDescription(String instanceDescription) {
                this.instanceDescription = instanceDescription;
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
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * IsvTerms.
             */
            public Builder isvTerms(String isvTerms) {
                this.isvTerms = isvTerms;
                return this;
            }

            /**
             * OfficeAddress.
             */
            public Builder officeAddress(String officeAddress) {
                this.officeAddress = officeAddress;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * ResourceRegionId.
             */
            public Builder resourceRegionId(String resourceRegionId) {
                this.resourceRegionId = resourceRegionId;
                return this;
            }

            /**
             * SubmitTime.
             */
            public Builder submitTime(String submitTime) {
                this.submitTime = submitTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
