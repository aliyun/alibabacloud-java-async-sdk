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
 * {@link GetTransferInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetTransferInfoResponseBody</p>
 */
public class GetTransferInfoResponseBody extends TeaModel {
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

    private GetTransferInfoResponseBody(Builder builder) {
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

    public static GetTransferInfoResponseBody create() {
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

        private Builder(GetTransferInfoResponseBody model) {
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

        public GetTransferInfoResponseBody build() {
            return new GetTransferInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTransferInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetTransferInfoResponseBody</p>
     */
    public static class Creator extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private Creator(Builder builder) {
            this.displayName = builder.displayName;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Creator create() {
            return builder().build();
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String displayName; 
            private String userId; 

            private Builder() {
            } 

            private Builder(Creator model) {
                this.displayName = model.displayName;
                this.userId = model.userId;
            } 

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Creator build() {
                return new Creator(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTransferInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetTransferInfoResponseBody</p>
     */
    public static class LastModifier extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private LastModifier(Builder builder) {
            this.displayName = builder.displayName;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LastModifier create() {
            return builder().build();
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String displayName; 
            private String userId; 

            private Builder() {
            } 

            private Builder(LastModifier model) {
                this.displayName = model.displayName;
                this.userId = model.userId;
            } 

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public LastModifier build() {
                return new LastModifier(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTransferInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetTransferInfoResponseBody</p>
     */
    public static class NewOwner extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private NewOwner(Builder builder) {
            this.displayName = builder.displayName;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NewOwner create() {
            return builder().build();
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String displayName; 
            private String userId; 

            private Builder() {
            } 

            private Builder(NewOwner model) {
                this.displayName = model.displayName;
                this.userId = model.userId;
            } 

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public NewOwner build() {
                return new NewOwner(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTransferInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetTransferInfoResponseBody</p>
     */
    public static class OldOwner extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private OldOwner(Builder builder) {
            this.displayName = builder.displayName;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OldOwner create() {
            return builder().build();
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String displayName; 
            private String userId; 

            private Builder() {
            } 

            private Builder(OldOwner model) {
                this.displayName = model.displayName;
                this.userId = model.userId;
            } 

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public OldOwner build() {
                return new OldOwner(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTransferInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetTransferInfoResponseBody</p>
     */
    public static class PrivilegeTransferResultEntries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrMsg")
        private String errMsg;

        @com.aliyun.core.annotation.NameInMap("PrivilegeDisplayName")
        private String privilegeDisplayName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private PrivilegeTransferResultEntries(Builder builder) {
            this.errMsg = builder.errMsg;
            this.privilegeDisplayName = builder.privilegeDisplayName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivilegeTransferResultEntries create() {
            return builder().build();
        }

        /**
         * @return errMsg
         */
        public String getErrMsg() {
            return this.errMsg;
        }

        /**
         * @return privilegeDisplayName
         */
        public String getPrivilegeDisplayName() {
            return this.privilegeDisplayName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errMsg; 
            private String privilegeDisplayName; 
            private String status; 

            private Builder() {
            } 

            private Builder(PrivilegeTransferResultEntries model) {
                this.errMsg = model.errMsg;
                this.privilegeDisplayName = model.privilegeDisplayName;
                this.status = model.status;
            } 

            /**
             * ErrMsg.
             */
            public Builder errMsg(String errMsg) {
                this.errMsg = errMsg;
                return this;
            }

            /**
             * PrivilegeDisplayName.
             */
            public Builder privilegeDisplayName(String privilegeDisplayName) {
                this.privilegeDisplayName = privilegeDisplayName;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public PrivilegeTransferResultEntries build() {
                return new PrivilegeTransferResultEntries(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTransferInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetTransferInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Creator")
        private Creator creator;

        @com.aliyun.core.annotation.NameInMap("FlowId")
        private Long flowId;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("LastModifier")
        private LastModifier lastModifier;

        @com.aliyun.core.annotation.NameInMap("NewOwner")
        private NewOwner newOwner;

        @com.aliyun.core.annotation.NameInMap("OldOwner")
        private OldOwner oldOwner;

        @com.aliyun.core.annotation.NameInMap("PrivilegeTransferMode")
        private String privilegeTransferMode;

        @com.aliyun.core.annotation.NameInMap("PrivilegeTransferResultEntries")
        private java.util.List<PrivilegeTransferResultEntries> privilegeTransferResultEntries;

        @com.aliyun.core.annotation.NameInMap("ProposalId")
        private Long proposalId;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("TransferComment")
        private String transferComment;

        @com.aliyun.core.annotation.NameInMap("TransferStatus")
        private String transferStatus;

        private Data(Builder builder) {
            this.creator = builder.creator;
            this.flowId = builder.flowId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.lastModifier = builder.lastModifier;
            this.newOwner = builder.newOwner;
            this.oldOwner = builder.oldOwner;
            this.privilegeTransferMode = builder.privilegeTransferMode;
            this.privilegeTransferResultEntries = builder.privilegeTransferResultEntries;
            this.proposalId = builder.proposalId;
            this.title = builder.title;
            this.transferComment = builder.transferComment;
            this.transferStatus = builder.transferStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return creator
         */
        public Creator getCreator() {
            return this.creator;
        }

        /**
         * @return flowId
         */
        public Long getFlowId() {
            return this.flowId;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return lastModifier
         */
        public LastModifier getLastModifier() {
            return this.lastModifier;
        }

        /**
         * @return newOwner
         */
        public NewOwner getNewOwner() {
            return this.newOwner;
        }

        /**
         * @return oldOwner
         */
        public OldOwner getOldOwner() {
            return this.oldOwner;
        }

        /**
         * @return privilegeTransferMode
         */
        public String getPrivilegeTransferMode() {
            return this.privilegeTransferMode;
        }

        /**
         * @return privilegeTransferResultEntries
         */
        public java.util.List<PrivilegeTransferResultEntries> getPrivilegeTransferResultEntries() {
            return this.privilegeTransferResultEntries;
        }

        /**
         * @return proposalId
         */
        public Long getProposalId() {
            return this.proposalId;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return transferComment
         */
        public String getTransferComment() {
            return this.transferComment;
        }

        /**
         * @return transferStatus
         */
        public String getTransferStatus() {
            return this.transferStatus;
        }

        public static final class Builder {
            private Creator creator; 
            private Long flowId; 
            private String gmtCreate; 
            private String gmtModified; 
            private LastModifier lastModifier; 
            private NewOwner newOwner; 
            private OldOwner oldOwner; 
            private String privilegeTransferMode; 
            private java.util.List<PrivilegeTransferResultEntries> privilegeTransferResultEntries; 
            private Long proposalId; 
            private String title; 
            private String transferComment; 
            private String transferStatus; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.creator = model.creator;
                this.flowId = model.flowId;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.lastModifier = model.lastModifier;
                this.newOwner = model.newOwner;
                this.oldOwner = model.oldOwner;
                this.privilegeTransferMode = model.privilegeTransferMode;
                this.privilegeTransferResultEntries = model.privilegeTransferResultEntries;
                this.proposalId = model.proposalId;
                this.title = model.title;
                this.transferComment = model.transferComment;
                this.transferStatus = model.transferStatus;
            } 

            /**
             * Creator.
             */
            public Builder creator(Creator creator) {
                this.creator = creator;
                return this;
            }

            /**
             * FlowId.
             */
            public Builder flowId(Long flowId) {
                this.flowId = flowId;
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
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * LastModifier.
             */
            public Builder lastModifier(LastModifier lastModifier) {
                this.lastModifier = lastModifier;
                return this;
            }

            /**
             * NewOwner.
             */
            public Builder newOwner(NewOwner newOwner) {
                this.newOwner = newOwner;
                return this;
            }

            /**
             * OldOwner.
             */
            public Builder oldOwner(OldOwner oldOwner) {
                this.oldOwner = oldOwner;
                return this;
            }

            /**
             * PrivilegeTransferMode.
             */
            public Builder privilegeTransferMode(String privilegeTransferMode) {
                this.privilegeTransferMode = privilegeTransferMode;
                return this;
            }

            /**
             * PrivilegeTransferResultEntries.
             */
            public Builder privilegeTransferResultEntries(java.util.List<PrivilegeTransferResultEntries> privilegeTransferResultEntries) {
                this.privilegeTransferResultEntries = privilegeTransferResultEntries;
                return this;
            }

            /**
             * ProposalId.
             */
            public Builder proposalId(Long proposalId) {
                this.proposalId = proposalId;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * TransferComment.
             */
            public Builder transferComment(String transferComment) {
                this.transferComment = transferComment;
                return this;
            }

            /**
             * TransferStatus.
             */
            public Builder transferStatus(String transferStatus) {
                this.transferStatus = transferStatus;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
