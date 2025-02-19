// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.workorder20201210.models;

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
 * {@link DialogBaseBody} extends {@link TeaModel}
 *
 * <p>DialogBaseBody</p>
 */
public class DialogBaseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Attachments")
    private java.util.List<Attachments> attachments;

    @com.aliyun.core.annotation.NameInMap("ChannelCode")
    private String channelCode;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("DataInfo")
    private DataInfo dataInfo;

    @com.aliyun.core.annotation.NameInMap("DialogId")
    private Long dialogId;

    @com.aliyun.core.annotation.NameInMap("FooterInfo")
    private FooterInfo footerInfo;

    @com.aliyun.core.annotation.NameInMap("HitWords")
    private java.util.List<String> hitWords;

    @com.aliyun.core.annotation.NameInMap("ModifiedTime")
    private Long modifiedTime;

    @com.aliyun.core.annotation.NameInMap("ReferInfo")
    private DialogBaseBody referInfo;

    @com.aliyun.core.annotation.NameInMap("Stage")
    private Integer stage;

    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.NameInMap("TicketId")
    private String ticketId;

    @com.aliyun.core.annotation.NameInMap("TicketStatus")
    private Integer ticketStatus;

    @com.aliyun.core.annotation.NameInMap("Timestamp")
    private Long timestamp;

    @com.aliyun.core.annotation.NameInMap("Tip")
    private String tip;

    @com.aliyun.core.annotation.NameInMap("Type")
    private Integer type;

    @com.aliyun.core.annotation.NameInMap("UserInfo")
    private UserInfo userInfo;

    private DialogBaseBody(Builder builder) {
        this.attachments = builder.attachments;
        this.channelCode = builder.channelCode;
        this.createTime = builder.createTime;
        this.dataInfo = builder.dataInfo;
        this.dialogId = builder.dialogId;
        this.footerInfo = builder.footerInfo;
        this.hitWords = builder.hitWords;
        this.modifiedTime = builder.modifiedTime;
        this.referInfo = builder.referInfo;
        this.stage = builder.stage;
        this.status = builder.status;
        this.ticketId = builder.ticketId;
        this.ticketStatus = builder.ticketStatus;
        this.timestamp = builder.timestamp;
        this.tip = builder.tip;
        this.type = builder.type;
        this.userInfo = builder.userInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DialogBaseBody create() {
        return builder().build();
    }

    /**
     * @return attachments
     */
    public java.util.List<Attachments> getAttachments() {
        return this.attachments;
    }

    /**
     * @return channelCode
     */
    public String getChannelCode() {
        return this.channelCode;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return dataInfo
     */
    public DataInfo getDataInfo() {
        return this.dataInfo;
    }

    /**
     * @return dialogId
     */
    public Long getDialogId() {
        return this.dialogId;
    }

    /**
     * @return footerInfo
     */
    public FooterInfo getFooterInfo() {
        return this.footerInfo;
    }

    /**
     * @return hitWords
     */
    public java.util.List<String> getHitWords() {
        return this.hitWords;
    }

    /**
     * @return modifiedTime
     */
    public Long getModifiedTime() {
        return this.modifiedTime;
    }

    /**
     * @return referInfo
     */
    public DialogBaseBody getReferInfo() {
        return this.referInfo;
    }

    /**
     * @return stage
     */
    public Integer getStage() {
        return this.stage;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return ticketId
     */
    public String getTicketId() {
        return this.ticketId;
    }

    /**
     * @return ticketStatus
     */
    public Integer getTicketStatus() {
        return this.ticketStatus;
    }

    /**
     * @return timestamp
     */
    public Long getTimestamp() {
        return this.timestamp;
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
     * @return userInfo
     */
    public UserInfo getUserInfo() {
        return this.userInfo;
    }

    public static final class Builder {
        private java.util.List<Attachments> attachments; 
        private String channelCode; 
        private Long createTime; 
        private DataInfo dataInfo; 
        private Long dialogId; 
        private FooterInfo footerInfo; 
        private java.util.List<String> hitWords; 
        private Long modifiedTime; 
        private DialogBaseBody referInfo; 
        private Integer stage; 
        private Integer status; 
        private String ticketId; 
        private Integer ticketStatus; 
        private Long timestamp; 
        private String tip; 
        private Integer type; 
        private UserInfo userInfo; 

        /**
         * Attachments.
         */
        public Builder attachments(java.util.List<Attachments> attachments) {
            this.attachments = attachments;
            return this;
        }

        /**
         * ChannelCode.
         */
        public Builder channelCode(String channelCode) {
            this.channelCode = channelCode;
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
         * DataInfo.
         */
        public Builder dataInfo(DataInfo dataInfo) {
            this.dataInfo = dataInfo;
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
         * FooterInfo.
         */
        public Builder footerInfo(FooterInfo footerInfo) {
            this.footerInfo = footerInfo;
            return this;
        }

        /**
         * HitWords.
         */
        public Builder hitWords(java.util.List<String> hitWords) {
            this.hitWords = hitWords;
            return this;
        }

        /**
         * ModifiedTime.
         */
        public Builder modifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }

        /**
         * ReferInfo.
         */
        public Builder referInfo(DialogBaseBody referInfo) {
            this.referInfo = referInfo;
            return this;
        }

        /**
         * Stage.
         */
        public Builder stage(Integer stage) {
            this.stage = stage;
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
         * TicketId.
         */
        public Builder ticketId(String ticketId) {
            this.ticketId = ticketId;
            return this;
        }

        /**
         * TicketStatus.
         */
        public Builder ticketStatus(Integer ticketStatus) {
            this.ticketStatus = ticketStatus;
            return this;
        }

        /**
         * Timestamp.
         */
        public Builder timestamp(Long timestamp) {
            this.timestamp = timestamp;
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
         * UserInfo.
         */
        public Builder userInfo(UserInfo userInfo) {
            this.userInfo = userInfo;
            return this;
        }

        public DialogBaseBody build() {
            return new DialogBaseBody(this);
        } 

    } 

    /**
     * 
     * {@link DialogBaseBody} extends {@link TeaModel}
     *
     * <p>DialogBaseBody</p>
     */
    public static class Attachments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Size")
        private String size;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Attachments(Builder builder) {
            this.name = builder.name;
            this.size = builder.size;
            this.type = builder.type;
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
         * @return size
         */
        public String getSize() {
            return this.size;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String name; 
            private String size; 
            private String type; 
            private String url; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
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
    /**
     * 
     * {@link DialogBaseBody} extends {@link TeaModel}
     *
     * <p>DialogBaseBody</p>
     */
    public static class DataInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizId")
        private String bizId;

        @com.aliyun.core.annotation.NameInMap("BizType")
        private Integer bizType;

        @com.aliyun.core.annotation.NameInMap("Component")
        private java.util.List<java.util.Map<String, ?>> component;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("ContentDesensitized")
        private String contentDesensitized;

        @com.aliyun.core.annotation.NameInMap("Editable")
        private Integer editable;

        @com.aliyun.core.annotation.NameInMap("Props")
        private java.util.List<java.util.Map<String, ?>> props;

        @com.aliyun.core.annotation.NameInMap("Schema")
        private String schema;

        @com.aliyun.core.annotation.NameInMap("SchemaId")
        private Long schemaId;

        @com.aliyun.core.annotation.NameInMap("ServiceChannel")
        private String serviceChannel;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Values")
        private java.util.Map<String, ?> values;

        private DataInfo(Builder builder) {
            this.bizId = builder.bizId;
            this.bizType = builder.bizType;
            this.component = builder.component;
            this.content = builder.content;
            this.contentDesensitized = builder.contentDesensitized;
            this.editable = builder.editable;
            this.props = builder.props;
            this.schema = builder.schema;
            this.schemaId = builder.schemaId;
            this.serviceChannel = builder.serviceChannel;
            this.title = builder.title;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataInfo create() {
            return builder().build();
        }

        /**
         * @return bizId
         */
        public String getBizId() {
            return this.bizId;
        }

        /**
         * @return bizType
         */
        public Integer getBizType() {
            return this.bizType;
        }

        /**
         * @return component
         */
        public java.util.List<java.util.Map<String, ?>> getComponent() {
            return this.component;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return contentDesensitized
         */
        public String getContentDesensitized() {
            return this.contentDesensitized;
        }

        /**
         * @return editable
         */
        public Integer getEditable() {
            return this.editable;
        }

        /**
         * @return props
         */
        public java.util.List<java.util.Map<String, ?>> getProps() {
            return this.props;
        }

        /**
         * @return schema
         */
        public String getSchema() {
            return this.schema;
        }

        /**
         * @return schemaId
         */
        public Long getSchemaId() {
            return this.schemaId;
        }

        /**
         * @return serviceChannel
         */
        public String getServiceChannel() {
            return this.serviceChannel;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return values
         */
        public java.util.Map<String, ?> getValues() {
            return this.values;
        }

        public static final class Builder {
            private String bizId; 
            private Integer bizType; 
            private java.util.List<java.util.Map<String, ?>> component; 
            private String content; 
            private String contentDesensitized; 
            private Integer editable; 
            private java.util.List<java.util.Map<String, ?>> props; 
            private String schema; 
            private Long schemaId; 
            private String serviceChannel; 
            private String title; 
            private java.util.Map<String, ?> values; 

            /**
             * BizId.
             */
            public Builder bizId(String bizId) {
                this.bizId = bizId;
                return this;
            }

            /**
             * BizType.
             */
            public Builder bizType(Integer bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * Component.
             */
            public Builder component(java.util.List<java.util.Map<String, ?>> component) {
                this.component = component;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * ContentDesensitized.
             */
            public Builder contentDesensitized(String contentDesensitized) {
                this.contentDesensitized = contentDesensitized;
                return this;
            }

            /**
             * Editable.
             */
            public Builder editable(Integer editable) {
                this.editable = editable;
                return this;
            }

            /**
             * Props.
             */
            public Builder props(java.util.List<java.util.Map<String, ?>> props) {
                this.props = props;
                return this;
            }

            /**
             * Schema.
             */
            public Builder schema(String schema) {
                this.schema = schema;
                return this;
            }

            /**
             * SchemaId.
             */
            public Builder schemaId(Long schemaId) {
                this.schemaId = schemaId;
                return this;
            }

            /**
             * ServiceChannel.
             */
            public Builder serviceChannel(String serviceChannel) {
                this.serviceChannel = serviceChannel;
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
             * Values.
             */
            public Builder values(java.util.Map<String, ?> values) {
                this.values = values;
                return this;
            }

            public DataInfo build() {
                return new DataInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DialogBaseBody} extends {@link TeaModel}
     *
     * <p>DialogBaseBody</p>
     */
    public static class FooterInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ext")
        private java.util.Map<String, ?> ext;

        @com.aliyun.core.annotation.NameInMap("Schema")
        private String schema;

        private FooterInfo(Builder builder) {
            this.ext = builder.ext;
            this.schema = builder.schema;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FooterInfo create() {
            return builder().build();
        }

        /**
         * @return ext
         */
        public java.util.Map<String, ?> getExt() {
            return this.ext;
        }

        /**
         * @return schema
         */
        public String getSchema() {
            return this.schema;
        }

        public static final class Builder {
            private java.util.Map<String, ?> ext; 
            private String schema; 

            /**
             * Ext.
             */
            public Builder ext(java.util.Map<String, ?> ext) {
                this.ext = ext;
                return this;
            }

            /**
             * Schema.
             */
            public Builder schema(String schema) {
                this.schema = schema;
                return this;
            }

            public FooterInfo build() {
                return new FooterInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DialogBaseBody} extends {@link TeaModel}
     *
     * <p>DialogBaseBody</p>
     */
    public static class UserInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Avatar")
        private String avatar;

        @com.aliyun.core.annotation.NameInMap("Role")
        private Integer role;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private UserInfo(Builder builder) {
            this.avatar = builder.avatar;
            this.role = builder.role;
            this.userId = builder.userId;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserInfo create() {
            return builder().build();
        }

        /**
         * @return avatar
         */
        public String getAvatar() {
            return this.avatar;
        }

        /**
         * @return role
         */
        public Integer getRole() {
            return this.role;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String avatar; 
            private Integer role; 
            private String userId; 
            private String userName; 

            /**
             * Avatar.
             */
            public Builder avatar(String avatar) {
                this.avatar = avatar;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(Integer role) {
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

            /**
             * UserName.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public UserInfo build() {
                return new UserInfo(this);
            } 

        } 

    }
}
