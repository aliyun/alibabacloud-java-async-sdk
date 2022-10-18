// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.workorder20210610.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTicketNotesResponseBody} extends {@link TeaModel}
 *
 * <p>ListTicketNotesResponseBody</p>
 */
public class ListTicketNotesResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListTicketNotesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTicketNotesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
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
        private Integer code; 
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
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

        public ListTicketNotesResponseBody build() {
            return new ListTicketNotesResponseBody(this);
        } 

    } 

    public static class Attachments extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Url")
        private String url;

        private Attachments(Builder builder) {
            this.name = builder.name;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Attachments create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String name; 
            private String url; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Attachments build() {
                return new Attachments(this);
            } 

        } 

    }
    public static class Dialog extends TeaModel {
        @NameInMap("Content")
        private String content;

        @NameInMap("Schema")
        private String schema;

        private Dialog(Builder builder) {
            this.content = builder.content;
            this.schema = builder.schema;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dialog create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return schema
         */
        public String getSchema() {
            return this.schema;
        }

        public static final class Builder {
            private String content; 
            private String schema; 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Schema.
             */
            public Builder schema(String schema) {
                this.schema = schema;
                return this;
            }

            public Dialog build() {
                return new Dialog(this);
            } 

        } 

    }
    public static class User extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Role")
        private Integer role;

        private User(Builder builder) {
            this.name = builder.name;
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static User create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return role
         */
        public Integer getRole() {
            return this.role;
        }

        public static final class Builder {
            private String name; 
            private Integer role; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(Integer role) {
                this.role = role;
                return this;
            }

            public User build() {
                return new User(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Attachments")
        private java.util.List < Attachments> attachments;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("Dialog")
        private Dialog dialog;

        @NameInMap("DialogId")
        private Long dialogId;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("Tip")
        private String tip;

        @NameInMap("Type")
        private Integer type;

        @NameInMap("User")
        private User user;

        private Data(Builder builder) {
            this.attachments = builder.attachments;
            this.createTime = builder.createTime;
            this.dialog = builder.dialog;
            this.dialogId = builder.dialogId;
            this.status = builder.status;
            this.tip = builder.tip;
            this.type = builder.type;
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return attachments
         */
        public java.util.List < Attachments> getAttachments() {
            return this.attachments;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dialog
         */
        public Dialog getDialog() {
            return this.dialog;
        }

        /**
         * @return dialogId
         */
        public Long getDialogId() {
            return this.dialogId;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return tip
         */
        public String getTip() {
            return this.tip;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        /**
         * @return user
         */
        public User getUser() {
            return this.user;
        }

        public static final class Builder {
            private java.util.List < Attachments> attachments; 
            private Long createTime; 
            private Dialog dialog; 
            private Long dialogId; 
            private Integer status; 
            private String tip; 
            private Integer type; 
            private User user; 

            /**
             * Attachments.
             */
            public Builder attachments(java.util.List < Attachments> attachments) {
                this.attachments = attachments;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Dialog.
             */
            public Builder dialog(Dialog dialog) {
                this.dialog = dialog;
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
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * Tip.
             */
            public Builder tip(String tip) {
                this.tip = tip;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * User.
             */
            public Builder user(User user) {
                this.user = user;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
