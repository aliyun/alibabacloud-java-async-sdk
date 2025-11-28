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
 * {@link DescribeMemberStatInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMemberStatInfoResponseBody</p>
 */
public class DescribeMemberStatInfoResponseBody extends TeaModel {
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

    private DescribeMemberStatInfoResponseBody(Builder builder) {
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

    public static DescribeMemberStatInfoResponseBody create() {
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

        private Builder(DescribeMemberStatInfoResponseBody model) {
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

        public DescribeMemberStatInfoResponseBody build() {
            return new DescribeMemberStatInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMemberStatInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMemberStatInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthorizedCount")
        private Long authorizedCount;

        @com.aliyun.core.annotation.NameInMap("BizChainCount")
        private Integer bizChainCount;

        @com.aliyun.core.annotation.NameInMap("MemberId")
        private String memberId;

        @com.aliyun.core.annotation.NameInMap("MemberName")
        private String memberName;

        @com.aliyun.core.annotation.NameInMap("UsedCount")
        private Long usedCount;

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
        public Long getAuthorizedCount() {
            return this.authorizedCount;
        }

        /**
         * @return bizChainCount
         */
        public Integer getBizChainCount() {
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
        public Long getUsedCount() {
            return this.usedCount;
        }

        public static final class Builder {
            private Long authorizedCount; 
            private Integer bizChainCount; 
            private String memberId; 
            private String memberName; 
            private Long usedCount; 

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
            public Builder authorizedCount(Long authorizedCount) {
                this.authorizedCount = authorizedCount;
                return this;
            }

            /**
             * BizChainCount.
             */
            public Builder bizChainCount(Integer bizChainCount) {
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
            public Builder usedCount(Long usedCount) {
                this.usedCount = usedCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
