// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDialogsResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDialogsResponseBody</p>
 */
public class QueryDialogsResponseBody extends TeaModel {
    @NameInMap("Dialogs")
    private java.util.List < Dialogs> dialogs;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private QueryDialogsResponseBody(Builder builder) {
        this.dialogs = builder.dialogs;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDialogsResponseBody create() {
        return builder().build();
    }

    /**
     * @return dialogs
     */
    public java.util.List < Dialogs> getDialogs() {
        return this.dialogs;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Dialogs> dialogs; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Dialogs.
         */
        public Builder dialogs(java.util.List < Dialogs> dialogs) {
            this.dialogs = dialogs;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public QueryDialogsResponseBody build() {
            return new QueryDialogsResponseBody(this);
        } 

    } 

    public static class Dialogs extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("CreateUserId")
        private String createUserId;

        @NameInMap("CreateUserName")
        private String createUserName;

        @NameInMap("Description")
        private String description;

        @NameInMap("DialogId")
        private Long dialogId;

        @NameInMap("DialogName")
        private String dialogName;

        @NameInMap("IsOnline")
        private Boolean isOnline;

        @NameInMap("IsSampleDialog")
        private Boolean isSampleDialog;

        @NameInMap("ModifyTime")
        private String modifyTime;

        @NameInMap("ModifyUserId")
        private String modifyUserId;

        @NameInMap("ModifyUserName")
        private String modifyUserName;

        @NameInMap("Status")
        private Integer status;

        private Dialogs(Builder builder) {
            this.createTime = builder.createTime;
            this.createUserId = builder.createUserId;
            this.createUserName = builder.createUserName;
            this.description = builder.description;
            this.dialogId = builder.dialogId;
            this.dialogName = builder.dialogName;
            this.isOnline = builder.isOnline;
            this.isSampleDialog = builder.isSampleDialog;
            this.modifyTime = builder.modifyTime;
            this.modifyUserId = builder.modifyUserId;
            this.modifyUserName = builder.modifyUserName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dialogs create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createUserId
         */
        public String getCreateUserId() {
            return this.createUserId;
        }

        /**
         * @return createUserName
         */
        public String getCreateUserName() {
            return this.createUserName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return dialogId
         */
        public Long getDialogId() {
            return this.dialogId;
        }

        /**
         * @return dialogName
         */
        public String getDialogName() {
            return this.dialogName;
        }

        /**
         * @return isOnline
         */
        public Boolean getIsOnline() {
            return this.isOnline;
        }

        /**
         * @return isSampleDialog
         */
        public Boolean getIsSampleDialog() {
            return this.isSampleDialog;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return modifyUserId
         */
        public String getModifyUserId() {
            return this.modifyUserId;
        }

        /**
         * @return modifyUserName
         */
        public String getModifyUserName() {
            return this.modifyUserName;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String createTime; 
            private String createUserId; 
            private String createUserName; 
            private String description; 
            private Long dialogId; 
            private String dialogName; 
            private Boolean isOnline; 
            private Boolean isSampleDialog; 
            private String modifyTime; 
            private String modifyUserId; 
            private String modifyUserName; 
            private Integer status; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CreateUserId.
             */
            public Builder createUserId(String createUserId) {
                this.createUserId = createUserId;
                return this;
            }

            /**
             * CreateUserName.
             */
            public Builder createUserName(String createUserName) {
                this.createUserName = createUserName;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DialogId.
             */
            public Builder dialogId(Long dialogId) {
                this.dialogId = dialogId;
                return this;
            }

            /**
             * DialogName.
             */
            public Builder dialogName(String dialogName) {
                this.dialogName = dialogName;
                return this;
            }

            /**
             * IsOnline.
             */
            public Builder isOnline(Boolean isOnline) {
                this.isOnline = isOnline;
                return this;
            }

            /**
             * IsSampleDialog.
             */
            public Builder isSampleDialog(Boolean isSampleDialog) {
                this.isSampleDialog = isSampleDialog;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * ModifyUserId.
             */
            public Builder modifyUserId(String modifyUserId) {
                this.modifyUserId = modifyUserId;
                return this;
            }

            /**
             * ModifyUserName.
             */
            public Builder modifyUserName(String modifyUserName) {
                this.modifyUserName = modifyUserName;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public Dialogs build() {
                return new Dialogs(this);
            } 

        } 

    }
}
