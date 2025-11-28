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
 * {@link ListPrivacyRuleSharedMemberResponseBody} extends {@link TeaModel}
 *
 * <p>ListPrivacyRuleSharedMemberResponseBody</p>
 */
public class ListPrivacyRuleSharedMemberResponseBody extends TeaModel {
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

    private ListPrivacyRuleSharedMemberResponseBody(Builder builder) {
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

    public static ListPrivacyRuleSharedMemberResponseBody create() {
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

        private Builder(ListPrivacyRuleSharedMemberResponseBody model) {
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

        public ListPrivacyRuleSharedMemberResponseBody build() {
            return new ListPrivacyRuleSharedMemberResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPrivacyRuleSharedMemberResponseBody} extends {@link TeaModel}
     *
     * <p>ListPrivacyRuleSharedMemberResponseBody</p>
     */
    public static class MemberList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MemberId")
        private String memberId;

        @com.aliyun.core.annotation.NameInMap("MemberName")
        private String memberName;

        @com.aliyun.core.annotation.NameInMap("Shared")
        private String shared;

        private MemberList(Builder builder) {
            this.memberId = builder.memberId;
            this.memberName = builder.memberName;
            this.shared = builder.shared;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MemberList create() {
            return builder().build();
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
         * @return shared
         */
        public String getShared() {
            return this.shared;
        }

        public static final class Builder {
            private String memberId; 
            private String memberName; 
            private String shared; 

            private Builder() {
            } 

            private Builder(MemberList model) {
                this.memberId = model.memberId;
                this.memberName = model.memberName;
                this.shared = model.shared;
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
             * Shared.
             */
            public Builder shared(String shared) {
                this.shared = shared;
                return this;
            }

            public MemberList build() {
                return new MemberList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPrivacyRuleSharedMemberResponseBody} extends {@link TeaModel}
     *
     * <p>ListPrivacyRuleSharedMemberResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizChainId")
        private String bizChainId;

        @com.aliyun.core.annotation.NameInMap("BizChainName")
        private String bizChainName;

        @com.aliyun.core.annotation.NameInMap("MemberList")
        private java.util.List<MemberList> memberList;

        private Data(Builder builder) {
            this.bizChainId = builder.bizChainId;
            this.bizChainName = builder.bizChainName;
            this.memberList = builder.memberList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bizChainId
         */
        public String getBizChainId() {
            return this.bizChainId;
        }

        /**
         * @return bizChainName
         */
        public String getBizChainName() {
            return this.bizChainName;
        }

        /**
         * @return memberList
         */
        public java.util.List<MemberList> getMemberList() {
            return this.memberList;
        }

        public static final class Builder {
            private String bizChainId; 
            private String bizChainName; 
            private java.util.List<MemberList> memberList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.bizChainId = model.bizChainId;
                this.bizChainName = model.bizChainName;
                this.memberList = model.memberList;
            } 

            /**
             * BizChainId.
             */
            public Builder bizChainId(String bizChainId) {
                this.bizChainId = bizChainId;
                return this;
            }

            /**
             * BizChainName.
             */
            public Builder bizChainName(String bizChainName) {
                this.bizChainName = bizChainName;
                return this;
            }

            /**
             * MemberList.
             */
            public Builder memberList(java.util.List<MemberList> memberList) {
                this.memberList = memberList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
