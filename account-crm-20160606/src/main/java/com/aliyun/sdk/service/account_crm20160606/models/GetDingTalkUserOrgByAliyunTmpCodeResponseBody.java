// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.account_crm20160606.models;

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
 * {@link GetDingTalkUserOrgByAliyunTmpCodeResponseBody} extends {@link TeaModel}
 *
 * <p>GetDingTalkUserOrgByAliyunTmpCodeResponseBody</p>
 */
public class GetDingTalkUserOrgByAliyunTmpCodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpCode")
    private String httpCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetDingTalkUserOrgByAliyunTmpCodeResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpCode = builder.httpCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDingTalkUserOrgByAliyunTmpCodeResponseBody create() {
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
     * @return httpCode
     */
    public String getHttpCode() {
        return this.httpCode;
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
        private String httpCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetDingTalkUserOrgByAliyunTmpCodeResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpCode = model.httpCode;
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
         * HttpCode.
         */
        public Builder httpCode(String httpCode) {
            this.httpCode = httpCode;
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

        public GetDingTalkUserOrgByAliyunTmpCodeResponseBody build() {
            return new GetDingTalkUserOrgByAliyunTmpCodeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDingTalkUserOrgByAliyunTmpCodeResponseBody} extends {@link TeaModel}
     *
     * <p>GetDingTalkUserOrgByAliyunTmpCodeResponseBody</p>
     */
    public static class OrgDtoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CorpId")
        private String corpId;

        @com.aliyun.core.annotation.NameInMap("OrgId")
        private String orgId;

        @com.aliyun.core.annotation.NameInMap("OrgName")
        private String orgName;

        private OrgDtoList(Builder builder) {
            this.corpId = builder.corpId;
            this.orgId = builder.orgId;
            this.orgName = builder.orgName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrgDtoList create() {
            return builder().build();
        }

        /**
         * @return corpId
         */
        public String getCorpId() {
            return this.corpId;
        }

        /**
         * @return orgId
         */
        public String getOrgId() {
            return this.orgId;
        }

        /**
         * @return orgName
         */
        public String getOrgName() {
            return this.orgName;
        }

        public static final class Builder {
            private String corpId; 
            private String orgId; 
            private String orgName; 

            private Builder() {
            } 

            private Builder(OrgDtoList model) {
                this.corpId = model.corpId;
                this.orgId = model.orgId;
                this.orgName = model.orgName;
            } 

            /**
             * CorpId.
             */
            public Builder corpId(String corpId) {
                this.corpId = corpId;
                return this;
            }

            /**
             * OrgId.
             */
            public Builder orgId(String orgId) {
                this.orgId = orgId;
                return this;
            }

            /**
             * OrgName.
             */
            public Builder orgName(String orgName) {
                this.orgName = orgName;
                return this;
            }

            public OrgDtoList build() {
                return new OrgDtoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDingTalkUserOrgByAliyunTmpCodeResponseBody} extends {@link TeaModel}
     *
     * <p>GetDingTalkUserOrgByAliyunTmpCodeResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssociatedUnionId")
        private String associatedUnionId;

        @com.aliyun.core.annotation.NameInMap("Nick")
        private String nick;

        @com.aliyun.core.annotation.NameInMap("OrgDtoList")
        private java.util.List<OrgDtoList> orgDtoList;

        private Data(Builder builder) {
            this.associatedUnionId = builder.associatedUnionId;
            this.nick = builder.nick;
            this.orgDtoList = builder.orgDtoList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return associatedUnionId
         */
        public String getAssociatedUnionId() {
            return this.associatedUnionId;
        }

        /**
         * @return nick
         */
        public String getNick() {
            return this.nick;
        }

        /**
         * @return orgDtoList
         */
        public java.util.List<OrgDtoList> getOrgDtoList() {
            return this.orgDtoList;
        }

        public static final class Builder {
            private String associatedUnionId; 
            private String nick; 
            private java.util.List<OrgDtoList> orgDtoList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.associatedUnionId = model.associatedUnionId;
                this.nick = model.nick;
                this.orgDtoList = model.orgDtoList;
            } 

            /**
             * AssociatedUnionId.
             */
            public Builder associatedUnionId(String associatedUnionId) {
                this.associatedUnionId = associatedUnionId;
                return this;
            }

            /**
             * Nick.
             */
            public Builder nick(String nick) {
                this.nick = nick;
                return this;
            }

            /**
             * OrgDtoList.
             */
            public Builder orgDtoList(java.util.List<OrgDtoList> orgDtoList) {
                this.orgDtoList = orgDtoList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
