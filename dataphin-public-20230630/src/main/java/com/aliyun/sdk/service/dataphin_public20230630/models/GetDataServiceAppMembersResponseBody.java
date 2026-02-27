// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link GetDataServiceAppMembersResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataServiceAppMembersResponseBody</p>
 */
public class GetDataServiceAppMembersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetDataServiceAppMembersResponseBody(Builder builder) {
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

    public static GetDataServiceAppMembersResponseBody create() {
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
    public Data getData() {
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
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetDataServiceAppMembersResponseBody model) {
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
        public Builder data(Data data) {
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
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

        public GetDataServiceAppMembersResponseBody build() {
            return new GetDataServiceAppMembersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDataServiceAppMembersResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataServiceAppMembersResponseBody</p>
     */
    public static class MemberList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EffectiveEnd")
        private String effectiveEnd;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private MemberList(Builder builder) {
            this.effectiveEnd = builder.effectiveEnd;
            this.role = builder.role;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MemberList create() {
            return builder().build();
        }

        /**
         * @return effectiveEnd
         */
        public String getEffectiveEnd() {
            return this.effectiveEnd;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String effectiveEnd; 
            private String role; 
            private String userId; 

            private Builder() {
            } 

            private Builder(MemberList model) {
                this.effectiveEnd = model.effectiveEnd;
                this.role = model.role;
                this.userId = model.userId;
            } 

            /**
             * EffectiveEnd.
             */
            public Builder effectiveEnd(String effectiveEnd) {
                this.effectiveEnd = effectiveEnd;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public MemberList build() {
                return new MemberList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataServiceAppMembersResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataServiceAppMembersResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MemberList")
        private java.util.List<MemberList> memberList;

        private Data(Builder builder) {
            this.memberList = builder.memberList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return memberList
         */
        public java.util.List<MemberList> getMemberList() {
            return this.memberList;
        }

        public static final class Builder {
            private java.util.List<MemberList> memberList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.memberList = model.memberList;
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
