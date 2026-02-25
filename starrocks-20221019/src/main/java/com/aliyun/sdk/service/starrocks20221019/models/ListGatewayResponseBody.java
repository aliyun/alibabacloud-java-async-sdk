// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starrocks20221019.models;

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
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListGatewayResponseBody(Builder builder) {
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
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
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private java.util.List<Data> data; 
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListGatewayResponseBody model) {
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * ErrCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * ErrMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnablePublicNet")
        private Boolean enablePublicNet;

        @com.aliyun.core.annotation.NameInMap("FeNodeNumber")
        private Integer feNodeNumber;

        @com.aliyun.core.annotation.NameInMap("GatewayId")
        private String gatewayId;

        @com.aliyun.core.annotation.NameInMap("GatewayName")
        private String gatewayName;

        @com.aliyun.core.annotation.NameInMap("GatewayType")
        private String gatewayType;

        @com.aliyun.core.annotation.NameInMap("InternalDomain")
        private String internalDomain;

        @com.aliyun.core.annotation.NameInMap("InternalSlbId")
        private String internalSlbId;

        @com.aliyun.core.annotation.NameInMap("PrivatezoneId")
        private String privatezoneId;

        @com.aliyun.core.annotation.NameInMap("PublicDomain")
        private String publicDomain;

        @com.aliyun.core.annotation.NameInMap("PublicSlbAclId")
        private String publicSlbAclId;

        @com.aliyun.core.annotation.NameInMap("PublicSlbId")
        private String publicSlbId;

        private Data(Builder builder) {
            this.enablePublicNet = builder.enablePublicNet;
            this.feNodeNumber = builder.feNodeNumber;
            this.gatewayId = builder.gatewayId;
            this.gatewayName = builder.gatewayName;
            this.gatewayType = builder.gatewayType;
            this.internalDomain = builder.internalDomain;
            this.internalSlbId = builder.internalSlbId;
            this.privatezoneId = builder.privatezoneId;
            this.publicDomain = builder.publicDomain;
            this.publicSlbAclId = builder.publicSlbAclId;
            this.publicSlbId = builder.publicSlbId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return enablePublicNet
         */
        public Boolean getEnablePublicNet() {
            return this.enablePublicNet;
        }

        /**
         * @return feNodeNumber
         */
        public Integer getFeNodeNumber() {
            return this.feNodeNumber;
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
         * @return gatewayType
         */
        public String getGatewayType() {
            return this.gatewayType;
        }

        /**
         * @return internalDomain
         */
        public String getInternalDomain() {
            return this.internalDomain;
        }

        /**
         * @return internalSlbId
         */
        public String getInternalSlbId() {
            return this.internalSlbId;
        }

        /**
         * @return privatezoneId
         */
        public String getPrivatezoneId() {
            return this.privatezoneId;
        }

        /**
         * @return publicDomain
         */
        public String getPublicDomain() {
            return this.publicDomain;
        }

        /**
         * @return publicSlbAclId
         */
        public String getPublicSlbAclId() {
            return this.publicSlbAclId;
        }

        /**
         * @return publicSlbId
         */
        public String getPublicSlbId() {
            return this.publicSlbId;
        }

        public static final class Builder {
            private Boolean enablePublicNet; 
            private Integer feNodeNumber; 
            private String gatewayId; 
            private String gatewayName; 
            private String gatewayType; 
            private String internalDomain; 
            private String internalSlbId; 
            private String privatezoneId; 
            private String publicDomain; 
            private String publicSlbAclId; 
            private String publicSlbId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.enablePublicNet = model.enablePublicNet;
                this.feNodeNumber = model.feNodeNumber;
                this.gatewayId = model.gatewayId;
                this.gatewayName = model.gatewayName;
                this.gatewayType = model.gatewayType;
                this.internalDomain = model.internalDomain;
                this.internalSlbId = model.internalSlbId;
                this.privatezoneId = model.privatezoneId;
                this.publicDomain = model.publicDomain;
                this.publicSlbAclId = model.publicSlbAclId;
                this.publicSlbId = model.publicSlbId;
            } 

            /**
             * EnablePublicNet.
             */
            public Builder enablePublicNet(Boolean enablePublicNet) {
                this.enablePublicNet = enablePublicNet;
                return this;
            }

            /**
             * FeNodeNumber.
             */
            public Builder feNodeNumber(Integer feNodeNumber) {
                this.feNodeNumber = feNodeNumber;
                return this;
            }

            /**
             * GatewayId.
             */
            public Builder gatewayId(String gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * GatewayName.
             */
            public Builder gatewayName(String gatewayName) {
                this.gatewayName = gatewayName;
                return this;
            }

            /**
             * GatewayType.
             */
            public Builder gatewayType(String gatewayType) {
                this.gatewayType = gatewayType;
                return this;
            }

            /**
             * InternalDomain.
             */
            public Builder internalDomain(String internalDomain) {
                this.internalDomain = internalDomain;
                return this;
            }

            /**
             * InternalSlbId.
             */
            public Builder internalSlbId(String internalSlbId) {
                this.internalSlbId = internalSlbId;
                return this;
            }

            /**
             * <p>PrivatezoneId</p>
             * 
             * <strong>example:</strong>
             * <p>a62des2123243881b9s2sa220k2l38m9</p>
             */
            public Builder privatezoneId(String privatezoneId) {
                this.privatezoneId = privatezoneId;
                return this;
            }

            /**
             * PublicDomain.
             */
            public Builder publicDomain(String publicDomain) {
                this.publicDomain = publicDomain;
                return this;
            }

            /**
             * PublicSlbAclId.
             */
            public Builder publicSlbAclId(String publicSlbAclId) {
                this.publicSlbAclId = publicSlbAclId;
                return this;
            }

            /**
             * PublicSlbId.
             */
            public Builder publicSlbId(String publicSlbId) {
                this.publicSlbId = publicSlbId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
