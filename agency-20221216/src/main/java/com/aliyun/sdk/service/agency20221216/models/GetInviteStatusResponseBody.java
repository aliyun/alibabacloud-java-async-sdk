// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInviteStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetInviteStatusResponseBody</p>
 */
public class GetInviteStatusResponseBody extends TeaModel {
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

    private GetInviteStatusResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInviteStatusResponseBody create() {
        return builder().build();
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
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Status Code. Error Code:
         * <p>
         * 
         * - 3057 InviteId is empty
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Request ID, Alibaba Cloud will track errors with this.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Candidate Value: True/False, which indicates whether the current API call itself is successful. It does not guarantee the success of subsequent business operations.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetInviteStatusResponseBody build() {
            return new GetInviteStatusResponseBody(this);
        } 

    } 

    public static class InviteStatusList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssociationSuccessTime")
        private String associationSuccessTime;

        @com.aliyun.core.annotation.NameInMap("Cid")
        private Long cid;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("ParentId")
        private String parentId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("SubAccountType")
        private String subAccountType;

        @com.aliyun.core.annotation.NameInMap("Uid")
        private Long uid;

        private InviteStatusList(Builder builder) {
            this.associationSuccessTime = builder.associationSuccessTime;
            this.cid = builder.cid;
            this.gmtCreate = builder.gmtCreate;
            this.parentId = builder.parentId;
            this.status = builder.status;
            this.subAccountType = builder.subAccountType;
            this.uid = builder.uid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InviteStatusList create() {
            return builder().build();
        }

        /**
         * @return associationSuccessTime
         */
        public String getAssociationSuccessTime() {
            return this.associationSuccessTime;
        }

        /**
         * @return cid
         */
        public Long getCid() {
            return this.cid;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return parentId
         */
        public String getParentId() {
            return this.parentId;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return subAccountType
         */
        public String getSubAccountType() {
            return this.subAccountType;
        }

        /**
         * @return uid
         */
        public Long getUid() {
            return this.uid;
        }

        public static final class Builder {
            private String associationSuccessTime; 
            private Long cid; 
            private String gmtCreate; 
            private String parentId; 
            private Integer status; 
            private String subAccountType; 
            private Long uid; 

            /**
             * The time that Distribution Customer successfully associated with Distributor.</br>
             * <p>
             * This value will be empty if there is no existing association.
             */
            public Builder associationSuccessTime(String associationSuccessTime) {
                this.associationSuccessTime = associationSuccessTime;
                return this;
            }

            /**
             * Distribution Customer\"s CID
             */
            public Builder cid(Long cid) {
                this.cid = cid;
                return this;
            }

            /**
             * The time of email been sent out.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The parent organization ID.
             */
            public Builder parentId(String parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * Invitation Status:
             * <p>
             * * 0 No visit on registration URL
             * * 1 Successful Registration
             * * 2 Unsuccessful Registration
             * * 3 Registration URL have been visited, but no submitted sheet/ticket.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * Account Type:
             * <p>
             * - 1 Agency\"s End User
             * - 2 Reseller\"s End User
             * - 5 T2 Reseller Partner
             */
            public Builder subAccountType(String subAccountType) {
                this.subAccountType = subAccountType;
                return this;
            }

            /**
             * Distribution Customer\"s UID
             */
            public Builder uid(Long uid) {
                this.uid = uid;
                return this;
            }

            public InviteStatusList build() {
                return new InviteStatusList(this);
            } 

        } 

    }
    public static class InviteStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("InviteStatusList")
        private InviteStatusList inviteStatusList;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private InviteStatus(Builder builder) {
            this.code = builder.code;
            this.inviteStatusList = builder.inviteStatusList;
            this.message = builder.message;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InviteStatus create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return inviteStatusList
         */
        public InviteStatusList getInviteStatusList() {
            return this.inviteStatusList;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String code; 
            private InviteStatusList inviteStatusList; 
            private String message; 
            private Boolean success; 

            /**
             * Result Code. Value Range:
             * <p>
             * *   200 OK
             * *   1109 system error
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * List of Invitation Status result
             */
            public Builder inviteStatusList(InviteStatusList inviteStatusList) {
                this.inviteStatusList = inviteStatusList;
                return this;
            }

            /**
             * The message returned.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * Candidate Value: True/False, which indicates whether the current API call itself is successful. It does not guarantee the success of subsequent business operations.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public InviteStatus build() {
                return new InviteStatus(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InviteStatus")
        private java.util.List < InviteStatus> inviteStatus;

        private Data(Builder builder) {
            this.inviteStatus = builder.inviteStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return inviteStatus
         */
        public java.util.List < InviteStatus> getInviteStatus() {
            return this.inviteStatus;
        }

        public static final class Builder {
            private java.util.List < InviteStatus> inviteStatus; 

            /**
             * InviteStatus.
             */
            public Builder inviteStatus(java.util.List < InviteStatus> inviteStatus) {
                this.inviteStatus = inviteStatus;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
