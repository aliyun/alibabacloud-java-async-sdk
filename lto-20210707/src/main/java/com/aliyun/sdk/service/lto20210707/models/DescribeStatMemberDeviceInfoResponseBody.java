// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lto20210707.models;

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
 * {@link DescribeStatMemberDeviceInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeStatMemberDeviceInfoResponseBody</p>
 */
public class DescribeStatMemberDeviceInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeStatMemberDeviceInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStatMemberDeviceInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private String code; 
        private java.util.List<Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeStatMemberDeviceInfoResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
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
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        public DescribeStatMemberDeviceInfoResponseBody build() {
            return new DescribeStatMemberDeviceInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeStatMemberDeviceInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeStatMemberDeviceInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthorizedCount")
        private String authorizedCount;

        @com.aliyun.core.annotation.NameInMap("BizChainCount")
        private String bizChainCount;

        @com.aliyun.core.annotation.NameInMap("MemberId")
        private String memberId;

        @com.aliyun.core.annotation.NameInMap("MemberName")
        private String memberName;

        @com.aliyun.core.annotation.NameInMap("UsedCount")
        private String usedCount;

        private Data(Builder builder) {
            this.authorizedCount = builder.authorizedCount;
            this.bizChainCount = builder.bizChainCount;
            this.memberId = builder.memberId;
            this.memberName = builder.memberName;
            this.usedCount = builder.usedCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return authorizedCount
         */
        public String getAuthorizedCount() {
            return this.authorizedCount;
        }

        /**
         * @return bizChainCount
         */
        public String getBizChainCount() {
            return this.bizChainCount;
        }

        /**
         * @return memberId
         */
        public String getMemberId() {
            return this.memberId;
        }

        /**
         * @return memberName
         */
        public String getMemberName() {
            return this.memberName;
        }

        /**
         * @return usedCount
         */
        public String getUsedCount() {
            return this.usedCount;
        }

        public static final class Builder {
            private String authorizedCount; 
            private String bizChainCount; 
            private String memberId; 
            private String memberName; 
            private String usedCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.authorizedCount = model.authorizedCount;
                this.bizChainCount = model.bizChainCount;
                this.memberId = model.memberId;
                this.memberName = model.memberName;
                this.usedCount = model.usedCount;
            } 

            /**
             * AuthorizedCount.
             */
            public Builder authorizedCount(String authorizedCount) {
                this.authorizedCount = authorizedCount;
                return this;
            }

            /**
             * BizChainCount.
             */
            public Builder bizChainCount(String bizChainCount) {
                this.bizChainCount = bizChainCount;
                return this;
            }

            /**
             * MemberId.
             */
            public Builder memberId(String memberId) {
                this.memberId = memberId;
                return this;
            }

            /**
             * MemberName.
             */
            public Builder memberName(String memberName) {
                this.memberName = memberName;
                return this;
            }

            /**
             * UsedCount.
             */
            public Builder usedCount(String usedCount) {
                this.usedCount = usedCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
