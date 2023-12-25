// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetReportTemplateByNameResponseBody} extends {@link TeaModel}
 *
 * <p>GetReportTemplateByNameResponseBody</p>
 */
public class GetReportTemplateByNameResponseBody extends TeaModel {
    @NameInMap("defaultReceivedConvs")
    private java.util.List < DefaultReceivedConvs> defaultReceivedConvs;

    @NameInMap("defaultReceivers")
    private java.util.List < DefaultReceivers> defaultReceivers;

    @NameInMap("fields")
    private java.util.List < Fields> fields;

    @NameInMap("id")
    private String id;

    @NameInMap("name")
    private String name;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("userName")
    private String userName;

    @NameInMap("userid")
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

    /**
     * @return defaultReceivedConvs
     */
    public java.util.List < DefaultReceivedConvs> getDefaultReceivedConvs() {
        return this.defaultReceivedConvs;
    }

    /**
     * @return defaultReceivers
     */
    public java.util.List < DefaultReceivers> getDefaultReceivers() {
        return this.defaultReceivers;
    }

    /**
     * @return fields
     */
    public java.util.List < Fields> getFields() {
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
        private java.util.List < DefaultReceivedConvs> defaultReceivedConvs; 
        private java.util.List < DefaultReceivers> defaultReceivers; 
        private java.util.List < Fields> fields; 
        private String id; 
        private String name; 
        private String requestId; 
        private String userName; 
        private String userid; 

        /**
         * defaultReceivedConvs.
         */
        public Builder defaultReceivedConvs(java.util.List < DefaultReceivedConvs> defaultReceivedConvs) {
            this.defaultReceivedConvs = defaultReceivedConvs;
            return this;
        }

        /**
         * defaultReceivers.
         */
        public Builder defaultReceivers(java.util.List < DefaultReceivers> defaultReceivers) {
            this.defaultReceivers = defaultReceivers;
            return this;
        }

        /**
         * fields.
         */
        public Builder fields(java.util.List < Fields> fields) {
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
         * requestId
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

    public static class DefaultReceivedConvs extends TeaModel {
        @NameInMap("ConversationId")
        private String conversationId;

        @NameInMap("Title")
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
    public static class DefaultReceivers extends TeaModel {
        @NameInMap("UserName")
        private String userName;

        @NameInMap("Userid")
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
    public static class Fields extends TeaModel {
        @NameInMap("FieldName")
        private String fieldName;

        @NameInMap("Sort")
        private Long sort;

        @NameInMap("Type")
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
