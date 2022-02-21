// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNodeCidrListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNodeCidrListResponseBody</p>
 */
public class DescribeNodeCidrListResponseBody extends TeaModel {
    @NameInMap("ErrCode")
    private String errCode;

    @NameInMap("ErrMessage")
    private String errMessage;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("InternetIPs")
    private InternetIPs internetIPs;

    @NameInMap("IntranetIPs")
    private IntranetIPs intranetIPs;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeNodeCidrListResponseBody(Builder builder) {
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.internetIPs = builder.internetIPs;
        this.intranetIPs = builder.intranetIPs;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNodeCidrListResponseBody create() {
        return builder().build();
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
     * @return internetIPs
     */
    public InternetIPs getInternetIPs() {
        return this.internetIPs;
    }

    /**
     * @return intranetIPs
     */
    public IntranetIPs getIntranetIPs() {
        return this.intranetIPs;
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
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private InternetIPs internetIPs; 
        private IntranetIPs intranetIPs; 
        private String requestId; 
        private Boolean success; 

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
         * InternetIPs.
         */
        public Builder internetIPs(InternetIPs internetIPs) {
            this.internetIPs = internetIPs;
            return this;
        }

        /**
         * IntranetIPs.
         */
        public Builder intranetIPs(IntranetIPs intranetIPs) {
            this.intranetIPs = intranetIPs;
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

        public DescribeNodeCidrListResponseBody build() {
            return new DescribeNodeCidrListResponseBody(this);
        } 

    } 

    public static class InternetIPs extends TeaModel {
        @NameInMap("InternetIP")
        private java.util.List < String > internetIP;

        private InternetIPs(Builder builder) {
            this.internetIP = builder.internetIP;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InternetIPs create() {
            return builder().build();
        }

        /**
         * @return internetIP
         */
        public java.util.List < String > getInternetIP() {
            return this.internetIP;
        }

        public static final class Builder {
            private java.util.List < String > internetIP; 

            /**
             * InternetIP.
             */
            public Builder internetIP(java.util.List < String > internetIP) {
                this.internetIP = internetIP;
                return this;
            }

            public InternetIPs build() {
                return new InternetIPs(this);
            } 

        } 

    }
    public static class IntranetIPs extends TeaModel {
        @NameInMap("IntranetIP")
        private java.util.List < String > intranetIP;

        private IntranetIPs(Builder builder) {
            this.intranetIP = builder.intranetIP;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IntranetIPs create() {
            return builder().build();
        }

        /**
         * @return intranetIP
         */
        public java.util.List < String > getIntranetIP() {
            return this.intranetIP;
        }

        public static final class Builder {
            private java.util.List < String > intranetIP; 

            /**
             * IntranetIP.
             */
            public Builder intranetIP(java.util.List < String > intranetIP) {
                this.intranetIP = intranetIP;
                return this;
            }

            public IntranetIPs build() {
                return new IntranetIPs(this);
            } 

        } 

    }
}
