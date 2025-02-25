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
 * {@link ListCalendarsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCalendarsResponseBody</p>
 */
public class ListCalendarsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("response")
    private Response response;

    private ListCalendarsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.response = builder.response;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCalendarsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return response
     */
    public Response getResponse() {
        return this.response;
    }

    public static final class Builder {
        private String requestId; 
        private Response response; 

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
         * response.
         */
        public Builder response(Response response) {
            this.response = response;
            return this;
        }

        public ListCalendarsResponseBody build() {
            return new ListCalendarsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCalendarsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCalendarsResponseBody</p>
     */
    public static class Calendars extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ETag")
        private String eTag;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Privilege")
        private String privilege;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("TimeZone")
        private String timeZone;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Calendars(Builder builder) {
            this.description = builder.description;
            this.eTag = builder.eTag;
            this.id = builder.id;
            this.privilege = builder.privilege;
            this.summary = builder.summary;
            this.timeZone = builder.timeZone;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Calendars create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return eTag
         */
        public String getETag() {
            return this.eTag;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return privilege
         */
        public String getPrivilege() {
            return this.privilege;
        }

        /**
         * @return summary
         */
        public String getSummary() {
            return this.summary;
        }

        /**
         * @return timeZone
         */
        public String getTimeZone() {
            return this.timeZone;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String description; 
            private String eTag; 
            private String id; 
            private String privilege; 
            private String summary; 
            private String timeZone; 
            private String type; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * ETag.
             */
            public Builder eTag(String eTag) {
                this.eTag = eTag;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Privilege.
             */
            public Builder privilege(String privilege) {
                this.privilege = privilege;
                return this;
            }

            /**
             * Summary.
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            /**
             * TimeZone.
             */
            public Builder timeZone(String timeZone) {
                this.timeZone = timeZone;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Calendars build() {
                return new Calendars(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCalendarsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCalendarsResponseBody</p>
     */
    public static class Response extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Calendars")
        private java.util.List<Calendars> calendars;

        private Response(Builder builder) {
            this.calendars = builder.calendars;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Response create() {
            return builder().build();
        }

        /**
         * @return calendars
         */
        public java.util.List<Calendars> getCalendars() {
            return this.calendars;
        }

        public static final class Builder {
            private java.util.List<Calendars> calendars; 

            /**
             * Calendars.
             */
            public Builder calendars(java.util.List<Calendars> calendars) {
                this.calendars = calendars;
                return this;
            }

            public Response build() {
                return new Response(this);
            } 

        } 

    }
}
