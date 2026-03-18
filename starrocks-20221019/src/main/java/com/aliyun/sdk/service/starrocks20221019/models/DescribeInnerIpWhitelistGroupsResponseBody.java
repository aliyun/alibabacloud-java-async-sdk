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
 * {@link DescribeInnerIpWhitelistGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInnerIpWhitelistGroupsResponseBody</p>
 */
public class DescribeInnerIpWhitelistGroupsResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    private DescribeInnerIpWhitelistGroupsResponseBody(Builder builder) {
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.data = builder.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInnerIpWhitelistGroupsResponseBody create() {
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

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    public static final class Builder {
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 
        private java.util.List<Data> data; 

        private Builder() {
        } 

        private Builder(DescribeInnerIpWhitelistGroupsResponseBody model) {
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
            this.data = model.data;
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

        /**
         * data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        public DescribeInnerIpWhitelistGroupsResponseBody build() {
            return new DescribeInnerIpWhitelistGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInnerIpWhitelistGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInnerIpWhitelistGroupsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CidrIpList")
        private java.util.List<String> cidrIpList;

        @com.aliyun.core.annotation.NameInMap("InnerIpWhitelistGroupId")
        private String innerIpWhitelistGroupId;

        private Data(Builder builder) {
            this.cidrIpList = builder.cidrIpList;
            this.innerIpWhitelistGroupId = builder.innerIpWhitelistGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return cidrIpList
         */
        public java.util.List<String> getCidrIpList() {
            return this.cidrIpList;
        }

        /**
         * @return innerIpWhitelistGroupId
         */
        public String getInnerIpWhitelistGroupId() {
            return this.innerIpWhitelistGroupId;
        }

        public static final class Builder {
            private java.util.List<String> cidrIpList; 
            private String innerIpWhitelistGroupId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.cidrIpList = model.cidrIpList;
                this.innerIpWhitelistGroupId = model.innerIpWhitelistGroupId;
            } 

            /**
             * CidrIpList.
             */
            public Builder cidrIpList(java.util.List<String> cidrIpList) {
                this.cidrIpList = cidrIpList;
                return this;
            }

            /**
             * InnerIpWhitelistGroupId.
             */
            public Builder innerIpWhitelistGroupId(String innerIpWhitelistGroupId) {
                this.innerIpWhitelistGroupId = innerIpWhitelistGroupId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
