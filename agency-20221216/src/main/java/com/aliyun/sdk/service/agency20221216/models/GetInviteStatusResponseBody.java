// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInviteStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetInviteStatusResponseBody</p>
 */
public class GetInviteStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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

        public GetInviteStatusResponseBody build() {
            return new GetInviteStatusResponseBody(this);
        } 

    } 

    public static class InviteStatusList extends TeaModel {
        @NameInMap("AssociationSuccessTime")
        private String associationSuccessTime;

        @NameInMap("Cid")
        private Long cid;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("ParentId")
        private String parentId;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("SubAccountType")
        private String subAccountType;

        @NameInMap("Uid")
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
             * AssociationSuccessTime.
             */
            public Builder associationSuccessTime(String associationSuccessTime) {
                this.associationSuccessTime = associationSuccessTime;
                return this;
            }

            /**
             * Cid.
             */
            public Builder cid(Long cid) {
                this.cid = cid;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * ParentId.
             */
            public Builder parentId(String parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * SubAccountType.
             */
            public Builder subAccountType(String subAccountType) {
                this.subAccountType = subAccountType;
                return this;
            }

            /**
             * Uid.
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
        @NameInMap("Code")
        private String code;

        @NameInMap("InviteStatusList")
        private InviteStatusList inviteStatusList;

        @NameInMap("Message")
        private String message;

        @NameInMap("Success")
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
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * InviteStatusList.
             */
            public Builder inviteStatusList(InviteStatusList inviteStatusList) {
                this.inviteStatusList = inviteStatusList;
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
             * Success.
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
        @NameInMap("InviteStatus")
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
