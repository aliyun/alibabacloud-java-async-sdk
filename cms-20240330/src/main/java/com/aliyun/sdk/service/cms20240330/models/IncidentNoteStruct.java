// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link IncidentNoteStruct} extends {@link TeaModel}
 *
 * <p>IncidentNoteStruct</p>
 */
public class IncidentNoteStruct extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("format")
    private String format;

    @com.aliyun.core.annotation.NameInMap("incidentId")
    private String incidentId;

    @com.aliyun.core.annotation.NameInMap("noteId")
    private String noteId;

    @com.aliyun.core.annotation.NameInMap("operator")
    private Operator operator;

    @com.aliyun.core.annotation.NameInMap("time")
    private Long time;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private IncidentNoteStruct(Builder builder) {
        this.content = builder.content;
        this.format = builder.format;
        this.incidentId = builder.incidentId;
        this.noteId = builder.noteId;
        this.operator = builder.operator;
        this.time = builder.time;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IncidentNoteStruct create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return format
     */
    public String getFormat() {
        return this.format;
    }

    /**
     * @return incidentId
     */
    public String getIncidentId() {
        return this.incidentId;
    }

    /**
     * @return noteId
     */
    public String getNoteId() {
        return this.noteId;
    }

    /**
     * @return operator
     */
    public Operator getOperator() {
        return this.operator;
    }

    /**
     * @return time
     */
    public Long getTime() {
        return this.time;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String content; 
        private String format; 
        private String incidentId; 
        private String noteId; 
        private Operator operator; 
        private Long time; 
        private String type; 

        private Builder() {
        } 

        private Builder(IncidentNoteStruct model) {
            this.content = model.content;
            this.format = model.format;
            this.incidentId = model.incidentId;
            this.noteId = model.noteId;
            this.operator = model.operator;
            this.time = model.time;
            this.type = model.type;
        } 

        /**
         * <p>The content.</p>
         * 
         * <strong>example:</strong>
         * <p>The operations team has been contacted and is currently investigating the issue.</p>
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The content format.</p>
         * 
         * <strong>example:</strong>
         * <p>markdown</p>
         */
        public Builder format(String format) {
            this.format = format;
            return this;
        }

        /**
         * <p>The event ID.</p>
         * 
         * <strong>example:</strong>
         * <p>incident-001</p>
         */
        public Builder incidentId(String incidentId) {
            this.incidentId = incidentId;
            return this;
        }

        /**
         * <p>The record ID.</p>
         * 
         * <strong>example:</strong>
         * <p>note-001</p>
         */
        public Builder noteId(String noteId) {
            this.noteId = noteId;
            return this;
        }

        /**
         * <p>The operator.</p>
         */
        public Builder operator(Operator operator) {
            this.operator = operator;
            return this;
        }

        /**
         * <p>The time.</p>
         * 
         * <strong>example:</strong>
         * <p>1741234567890</p>
         */
        public Builder time(Long time) {
            this.time = time;
            return this;
        }

        /**
         * <p>The type.</p>
         * 
         * <strong>example:</strong>
         * <p>apm</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public IncidentNoteStruct build() {
            return new IncidentNoteStruct(this);
        } 

    } 

    /**
     * 
     * {@link IncidentNoteStruct} extends {@link TeaModel}
     *
     * <p>IncidentNoteStruct</p>
     */
    public static class Operator extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("contact")
        private String contact;

        @com.aliyun.core.annotation.NameInMap("contactId")
        private String contactId;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("userId")
        private Long userId;

        private Operator(Builder builder) {
            this.contact = builder.contact;
            this.contactId = builder.contactId;
            this.name = builder.name;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Operator create() {
            return builder().build();
        }

        /**
         * @return contact
         */
        public String getContact() {
            return this.contact;
        }

        /**
         * @return contactId
         */
        public String getContactId() {
            return this.contactId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String contact; 
            private String contactId; 
            private String name; 
            private Long userId; 

            private Builder() {
            } 

            private Builder(Operator model) {
                this.contact = model.contact;
                this.contactId = model.contactId;
                this.name = model.name;
                this.userId = model.userId;
            } 

            /**
             * <p>The contact.</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;mobile_phone_num\&quot;:\&quot;153xxxx8040\&quot;,\&quot;mobile_country_code\&quot;:\&quot;86\&quot;,\&quot;email\&quot;:\&quot;<a href="mailto:flightxxg@dida.com">flightxxg@dida.com</a>\&quot;}</p>
             */
            public Builder contact(String contact) {
                this.contact = contact;
                return this;
            }

            /**
             * <p>The contact ID.</p>
             * 
             * <strong>example:</strong>
             * <p>user-12345</p>
             */
            public Builder contactId(String contactId) {
                this.contactId = contactId;
                return this;
            }

            /**
             * <p>The name.</p>
             * 
             * <strong>example:</strong>
             * <p>Zhang San.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>4123456</p>
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            public Operator build() {
                return new Operator(this);
            } 

        } 

    }
}
