// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

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
 * {@link DescribeNodeCidrListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNodeCidrListResponseBody</p>
 */
public class DescribeNodeCidrListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("InternetIPs")
    private InternetIPs internetIPs;

    @com.aliyun.core.annotation.NameInMap("IntranetIPs")
    private IntranetIPs intranetIPs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeNodeCidrListResponseBody model) {
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.internetIPs = model.internetIPs;
            this.intranetIPs = model.intranetIPs;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>Param.NotFound</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified parameter %s value is not valid.</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The public CIDR blocks.</p>
         */
        public Builder internetIPs(InternetIPs internetIPs) {
            this.internetIPs = internetIPs;
            return this;
        }

        /**
         * <p>The internal CIDR blocks.</p>
         */
        public Builder intranetIPs(IntranetIPs intranetIPs) {
            this.intranetIPs = intranetIPs;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>5B352E69-E7B1-4EA7-BB8E-29FFE969C791</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeNodeCidrListResponseBody build() {
            return new DescribeNodeCidrListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeNodeCidrListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNodeCidrListResponseBody</p>
     */
    public static class InternetIPs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InternetIP")
        private java.util.List<String> internetIP;

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
        public java.util.List<String> getInternetIP() {
            return this.internetIP;
        }

        public static final class Builder {
            private java.util.List<String> internetIP; 

            private Builder() {
            } 

            private Builder(InternetIPs model) {
                this.internetIP = model.internetIP;
            } 

            /**
             * InternetIP.
             */
            public Builder internetIP(java.util.List<String> internetIP) {
                this.internetIP = internetIP;
                return this;
            }

            public InternetIPs build() {
                return new InternetIPs(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNodeCidrListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNodeCidrListResponseBody</p>
     */
    public static class IntranetIPs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IntranetIP")
        private java.util.List<String> intranetIP;

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
        public java.util.List<String> getIntranetIP() {
            return this.intranetIP;
        }

        public static final class Builder {
            private java.util.List<String> intranetIP; 

            private Builder() {
            } 

            private Builder(IntranetIPs model) {
                this.intranetIP = model.intranetIP;
            } 

            /**
             * IntranetIP.
             */
            public Builder intranetIP(java.util.List<String> intranetIP) {
                this.intranetIP = intranetIP;
                return this;
            }

            public IntranetIPs build() {
                return new IntranetIPs(this);
            } 

        } 

    }
}
