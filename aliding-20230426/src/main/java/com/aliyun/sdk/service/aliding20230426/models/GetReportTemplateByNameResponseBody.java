// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link GetReportTemplateByNameResponseBody} extends {@link TeaModel}
 *
 * <p>GetReportTemplateByNameResponseBody</p>
 */
public class GetReportTemplateByNameResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("defaultReceivedConvs")
    private java.util.List<DefaultReceivedConvs> defaultReceivedConvs;

    @com.aliyun.core.annotation.NameInMap("defaultReceivers")
    private java.util.List<DefaultReceivers> defaultReceivers;

    @com.aliyun.core.annotation.NameInMap("fields")
    private java.util.List<Fields> fields;

    @com.aliyun.core.annotation.NameInMap("id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("userName")
    private String userName;

    @com.aliyun.core.annotation.NameInMap("userid")
    private String userid;

    private GetReportTemplateByNameResponseBody(Builder builder) {
        this.defaultReceivedConvs = builder.defaultReceivedConvs;
        this.defaultReceivers = builder.defaultReceivers;
        this.fields = builder.fields;
        this.id = builder.id;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.userName = builder.userName;
        this.userid = builder.userid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetReportTemplateByNameResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return defaultReceivedConvs
     */
    public java.util.List<DefaultReceivedConvs> getDefaultReceivedConvs() {
        return this.defaultReceivedConvs;
    }

    /**
     * @return defaultReceivers
     */
    public java.util.List<DefaultReceivers> getDefaultReceivers() {
        return this.defaultReceivers;
    }

    /**
     * @return fields
     */
    public java.util.List<Fields> getFields() {
        return this.fields;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * @return userid
     */
    public String getUserid() {
        return this.userid;
    }

    public static final class Builder {
        private java.util.List<DefaultReceivedConvs> defaultReceivedConvs; 
        private java.util.List<DefaultReceivers> defaultReceivers; 
        private java.util.List<Fields> fields; 
        private String id; 
        private String name; 
        private String requestId; 
        private String userName; 
        private String userid; 

        private Builder() {
        } 

        private Builder(GetReportTemplateByNameResponseBody model) {
            this.defaultReceivedConvs = model.defaultReceivedConvs;
            this.defaultReceivers = model.defaultReceivers;
            this.fields = model.fields;
            this.id = model.id;
            this.name = model.name;
            this.requestId = model.requestId;
            this.userName = model.userName;
            this.userid = model.userid;
        } 

        /**
         * defaultReceivedConvs.
         */
        public Builder defaultReceivedConvs(java.util.List<DefaultReceivedConvs> defaultReceivedConvs) {
            this.defaultReceivedConvs = defaultReceivedConvs;
            return this;
        }

        /**
         * defaultReceivers.
         */
        public Builder defaultReceivers(java.util.List<DefaultReceivers> defaultReceivers) {
            this.defaultReceivers = defaultReceivers;
            return this;
        }

        /**
         * fields.
         */
        public Builder fields(java.util.List<Fields> fields) {
            this.fields = fields;
            return this;
        }

        /**
         * id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>requestId</p>
         * 
         * <strong>example:</strong>
         * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * userName.
         */
        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        /**
         * userid.
         */
        public Builder userid(String userid) {
            this.userid = userid;
            return this;
        }

        public GetReportTemplateByNameResponseBody build() {
            return new GetReportTemplateByNameResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetReportTemplateByNameResponseBody} extends {@link TeaModel}
     *
     * <p>GetReportTemplateByNameResponseBody</p>
     */
    public static class DefaultReceivedConvs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConversationId")
        private String conversationId;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private DefaultReceivedConvs(Builder builder) {
            this.conversationId = builder.conversationId;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DefaultReceivedConvs create() {
            return builder().build();
        }

        /**
         * @return conversationId
         */
        public String getConversationId() {
            return this.conversationId;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String conversationId; 
            private String title; 

            private Builder() {
            } 

            private Builder(DefaultReceivedConvs model) {
                this.conversationId = model.conversationId;
                this.title = model.title;
            } 

            /**
             * ConversationId.
             */
            public Builder conversationId(String conversationId) {
                this.conversationId = conversationId;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public DefaultReceivedConvs build() {
                return new DefaultReceivedConvs(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetReportTemplateByNameResponseBody} extends {@link TeaModel}
     *
     * <p>GetReportTemplateByNameResponseBody</p>
     */
    public static class DefaultReceivers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        @com.aliyun.core.annotation.NameInMap("Userid")
        private String userid;

        private DefaultReceivers(Builder builder) {
            this.userName = builder.userName;
            this.userid = builder.userid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DefaultReceivers create() {
            return builder().build();
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        /**
         * @return userid
         */
        public String getUserid() {
            return this.userid;
        }

        public static final class Builder {
            private String userName; 
            private String userid; 

            private Builder() {
            } 

            private Builder(DefaultReceivers model) {
                this.userName = model.userName;
                this.userid = model.userid;
            } 

            /**
             * UserName.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * Userid.
             */
            public Builder userid(String userid) {
                this.userid = userid;
                return this;
            }

            public DefaultReceivers build() {
                return new DefaultReceivers(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetReportTemplateByNameResponseBody} extends {@link TeaModel}
     *
     * <p>GetReportTemplateByNameResponseBody</p>
     */
    public static class Fields extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FieldName")
        private String fieldName;

        @com.aliyun.core.annotation.NameInMap("Sort")
        private Long sort;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Long type;

        private Fields(Builder builder) {
            this.fieldName = builder.fieldName;
            this.sort = builder.sort;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Fields create() {
            return builder().build();
        }

        /**
         * @return fieldName
         */
        public String getFieldName() {
            return this.fieldName;
        }

        /**
         * @return sort
         */
        public Long getSort() {
            return this.sort;
        }

        /**
         * @return type
         */
        public Long getType() {
            return this.type;
        }

        public static final class Builder {
            private String fieldName; 
            private Long sort; 
            private Long type; 

            private Builder() {
            } 

            private Builder(Fields model) {
                this.fieldName = model.fieldName;
                this.sort = model.sort;
                this.type = model.type;
            } 

            /**
             * FieldName.
             */
            public Builder fieldName(String fieldName) {
                this.fieldName = fieldName;
                return this;
            }

            /**
             * Sort.
             */
            public Builder sort(Long sort) {
                this.sort = sort;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Long type) {
                this.type = type;
                return this;
            }

            public Fields build() {
                return new Fields(this);
            } 

        } 

    }
}
