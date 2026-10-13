// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.workorder20210610.models;

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
 * {@link ListTicketNotesResponseBody} extends {@link TeaModel}
 *
 * <p>ListTicketNotesResponseBody</p>
 */
public class ListTicketNotesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListTicketNotesResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
    public java.util.List<Data> getData() {
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
        private String accessDeniedDetail; 
        private Integer code; 
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListTicketNotesResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The details of the permission error. An empty string is returned if you have the required permissions.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;AuthAction\&quot;:\&quot;ram:ListTicketNotes\&quot;,\&quot;AuthPrincipalDisplayName\&quot;:\&quot;2146216584788xxxxx\&quot;,\&quot;AuthPrincipalOwnerId\&quot;:\&quot;1135850448xxxxx\&quot;,\&quot;AuthPrincipalType\&quot;:\&quot;SubUser\&quot;,\&quot;NoPermissionType\&quot;:\&quot;ImplicitDeny\&quot;,\&quot;PolicyType\&quot;:\&quot;AccountLevelIdentityBasedPolicy\&quot;}</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The return code for the API request.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The return value, which is a list of communication records for the specified ticket.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message. This parameter is returned when \<code>Success\\</code> is \<code>false\\</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Invalid input parameter</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The unique ID of the request. Each request has a unique ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AC0AB2EC-AFBC-44BA-AE77-132A5A1EC0AD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. A value of \<code>true\\</code> indicates a successful call.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListTicketNotesResponseBody build() {
            return new ListTicketNotesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTicketNotesResponseBody} extends {@link TeaModel}
     *
     * <p>ListTicketNotesResponseBody</p>
     */
    public static class Attachments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Url")
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

            private Builder() {
            } 

            private Builder(Attachments model) {
                this.name = model.name;
                this.url = model.url;
            } 

            /**
             * <p>The name of the attachment.</p>
             * 
             * <strong>example:</strong>
             * <p>003.jpg</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>A temporary URL to access the attachment.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://gts-workorder.oss-cn-beijing.aliyuncs.com/20221003/cbc00fb0-b612-4d89-a75b-8d535f750f9f/image.png">https://gts-workorder.oss-cn-beijing.aliyuncs.com/20221003/cbc00fb0-b612-4d89-a75b-8d535f750f9f/image.png</a></p>
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
    /**
     * 
     * {@link ListTicketNotesResponseBody} extends {@link TeaModel}
     *
     * <p>ListTicketNotesResponseBody</p>
     */
    public static class Dialog extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Schema")
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

            private Builder() {
            } 

            private Builder(Dialog model) {
                this.content = model.content;
                this.schema = model.schema;
            } 

            /**
             * <p>The content of the ticket communication.</p>
             * 
             * <strong>example:</strong>
             * <p>Hello, my ECS renewal failed. What is the reason?</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The system card for the ticket communication record. This parameter is reserved for future use. Currently, you can use the \<code>Content\\</code> parameter to retrieve the plain text.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
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
    /**
     * 
     * {@link ListTicketNotesResponseBody} extends {@link TeaModel}
     *
     * <p>ListTicketNotesResponseBody</p>
     */
    public static class User extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Role")
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

            private Builder() {
            } 

            private Builder(User model) {
                this.name = model.name;
                this.role = model.role;
            } 

            /**
             * <p>The name of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>John</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The role of the user in the communication. This parameter distinguishes between customer service agents and customers. Valid values: \<code>2\\</code>: Customer service agent. \<code>3\\</code>: Customer.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
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
    /**
     * 
     * {@link ListTicketNotesResponseBody} extends {@link TeaModel}
     *
     * <p>ListTicketNotesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attachments")
        private java.util.List<Attachments> attachments;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Dialog")
        private Dialog dialog;

        @com.aliyun.core.annotation.NameInMap("DialogId")
        private Long dialogId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Tip")
        private String tip;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Integer type;

        @com.aliyun.core.annotation.NameInMap("User")
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
        public java.util.List<Attachments> getAttachments() {
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
            private java.util.List<Attachments> attachments; 
            private Long createTime; 
            private Dialog dialog; 
            private Long dialogId; 
            private Integer status; 
            private String tip; 
            private Integer type; 
            private User user; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.attachments = model.attachments;
                this.createTime = model.createTime;
                this.dialog = model.dialog;
                this.dialogId = model.dialogId;
                this.status = model.status;
                this.tip = model.tip;
                this.type = model.type;
                this.user = model.user;
            } 

            /**
             * <p>The list of attachments.</p>
             */
            public Builder attachments(java.util.List<Attachments> attachments) {
                this.attachments = attachments;
                return this;
            }

            /**
             * <p>The UNIX timestamp when the communication message was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1623396736000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ticket communication record object.</p>
             */
            public Builder dialog(Dialog dialog) {
                this.dialog = dialog;
                return this;
            }

            /**
             * <p>The unique ID of the communication record.</p>
             * 
             * <strong>example:</strong>
             * <p>9999</p>
             */
            public Builder dialogId(Long dialogId) {
                this.dialogId = dialogId;
                return this;
            }

            /**
             * <p>The status of the communication message. Valid values: \<code>1\\</code>: Unread. \<code>2\\</code>: Read.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>This parameter is not in use.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder tip(String tip) {
                this.tip = tip;
                return this;
            }

            /**
             * <p>The type of communication. Valid values: \<code>1\\</code>: Card, which corresponds to \<code>Schema\\</code>. \<code>2\\</code>: Text, which corresponds to \<code>Content\\</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The user in the communication.</p>
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
