// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link ListCallSummariesResponseBody} extends {@link TeaModel}
 *
 * <p>ListCallSummariesResponseBody</p>
 */
public class ListCallSummariesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Params")
    private java.util.List<String> params;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListCallSummariesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.params = builder.params;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCallSummariesResponseBody create() {
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
    public java.util.List<Data> getData() {
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
     * @return params
     */
    public java.util.List<String> getParams() {
        return this.params;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private java.util.List<String> params; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListCallSummariesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.params = model.params;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Data.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Error message.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>List of error parameters.</p>
         */
        public Builder params(java.util.List<String> params) {
            this.params = params;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>932579BC-811A-503D-B322-4C2E57087CAA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListCallSummariesResponseBody build() {
            return new ListCallSummariesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCallSummariesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCallSummariesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactId")
        private String contactId;

        @com.aliyun.core.annotation.NameInMap("Context")
        private String context;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private Long createdTime;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("Editor")
        private String editor;

        @com.aliyun.core.annotation.NameInMap("TicketId")
        private String ticketId;

        private Data(Builder builder) {
            this.contactId = builder.contactId;
            this.context = builder.context;
            this.createdTime = builder.createdTime;
            this.creator = builder.creator;
            this.editor = builder.editor;
            this.ticketId = builder.ticketId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return contactId
         */
        public String getContactId() {
            return this.contactId;
        }

        /**
         * @return context
         */
        public String getContext() {
            return this.context;
        }

        /**
         * @return createdTime
         */
        public Long getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return editor
         */
        public String getEditor() {
            return this.editor;
        }

        /**
         * @return ticketId
         */
        public String getTicketId() {
            return this.ticketId;
        }

        public static final class Builder {
            private String contactId; 
            private String context; 
            private Long createdTime; 
            private String creator; 
            private String editor; 
            private String ticketId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.contactId = model.contactId;
                this.context = model.context;
                this.createdTime = model.createdTime;
                this.creator = model.creator;
                this.editor = model.editor;
                this.ticketId = model.ticketId;
            } 

            /**
             * <p>Call ID.</p>
             * 
             * <strong>example:</strong>
             * <p>job-544789******759424</p>
             */
            public Builder contactId(String contactId) {
                this.contactId = contactId;
                return this;
            }

            /**
             * <p>Summary information.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;_sys_field_config&quot;: [
             *         {
             *             &quot;Array&quot;: false,
             *             &quot;Required&quot;: true,
             *             &quot;DisplayName&quot;: &quot;主题&quot;,
             *             &quot;Attributes&quot;: &quot;{}&quot;,
             *             &quot;DataType&quot;: &quot;TEXT&quot;,
             *             &quot;EditorType&quot;: &quot;TEXT&quot;,
             *             &quot;MaxLength&quot;: 30,
             *             &quot;System&quot;: true,
             *             &quot;Name&quot;: &quot;summaryTitle&quot;
             *         },
             *         {
             *             &quot;Array&quot;: false,
             *             &quot;DisplayName&quot;: &quot;小结&quot;,
             *             &quot;Attributes&quot;: &quot;{}&quot;,
             *             &quot;DataType&quot;: &quot;TEXT&quot;,
             *             &quot;EditorType&quot;: &quot;TEXTAREA&quot;,
             *             &quot;MaxLength&quot;: 1000,
             *             &quot;System&quot;: true,
             *             &quot;Name&quot;: &quot;summaryContent&quot;
             *         },
             *         {
             *             &quot;Array&quot;: true,
             *             &quot;DisplayName&quot;: &quot;标签&quot;,
             *             &quot;Attributes&quot;: &quot;{}&quot;,
             *             &quot;DataType&quot;: &quot;TEXT&quot;,
             *             &quot;EditorType&quot;: &quot;SELECT&quot;,
             *             &quot;System&quot;: true,
             *             &quot;Name&quot;: &quot;keywords&quot;
             *         }
             *     ],
             *     &quot;summaryContent&quot;: &quot;小结内容&quot;,
             *     &quot;creator&quot;: &quot;creator@ccc-test&quot;,
             *     &quot;bizType&quot;: &quot;Summary&quot;,
             *     &quot;keywords&quot;: [
             *         &quot;标签1&quot;
             *     ],
             *     &quot;source&quot;: &quot;Console&quot;,
             *     &quot;summaryTitle&quot;: &quot;测试会话小结&quot;,
             *     &quot;instanceId&quot;: &quot;ccc-test&quot;,
             *     &quot;externalInput&quot;: &quot;{\&quot;summaryTitle\&quot;:\&quot;测试会话小结\&quot;,\&quot;summaryContent\&quot;:\&quot;小结内容\&quot;,\&quot;keywords\&quot;:[\&quot;标签1\&quot;],\&quot;_sys_field_config\&quot;:[{\&quot;DisplayName\&quot;:\&quot;主题\&quot;,\&quot;Name\&quot;:\&quot;summaryTitle\&quot;,\&quot;Required\&quot;:true,\&quot;EditorType\&quot;:\&quot;TEXT\&quot;,\&quot;Array\&quot;:false,\&quot;DataType\&quot;:\&quot;TEXT\&quot;,\&quot;System\&quot;:true,\&quot;MaxLength\&quot;:30,\&quot;Attributes\&quot;:\&quot;{}\&quot;},{\&quot;DisplayName\&quot;:\&quot;小结\&quot;,\&quot;Name\&quot;:\&quot;summaryContent\&quot;,\&quot;EditorType\&quot;:\&quot;TEXTAREA\&quot;,\&quot;Array\&quot;:false,\&quot;DataType\&quot;:\&quot;TEXT\&quot;,\&quot;System\&quot;:true,\&quot;MaxLength\&quot;:1000,\&quot;Attributes\&quot;:\&quot;{}\&quot;},{\&quot;DisplayName\&quot;:\&quot;标签\&quot;,\&quot;Name\&quot;:\&quot;keywords\&quot;,\&quot;EditorType\&quot;:\&quot;SELECT\&quot;,\&quot;Array\&quot;:true,\&quot;DataType\&quot;:\&quot;TEXT\&quot;,\&quot;System\&quot;:true,\&quot;Attributes\&quot;:\&quot;{}\&quot;}]}&quot;,
             *     &quot;templateName&quot;: &quot;Summary-Ticket&quot;,
             *     &quot;bizId&quot;: &quot;job-544789<strong><strong><strong>759424&quot;,
             *     &quot;ticketStartTime&quot;: 1723449513735,
             *     &quot;ticketId&quot;: &quot;ac0dd304-</strong></strong>-</strong><strong>-<strong><strong>-4a90010f0d38&quot;,
             *     &quot;definitionId&quot;: &quot;Summary-Ticket:2:6881f43a-</strong></strong>-11ee-***</strong>-6eb35a90a7a6&quot;
             * }</p>
             */
            public Builder context(String context) {
                this.context = context;
                return this;
            }

            /**
             * <p>Creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1723449513735</p>
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>Creator.</p>
             * 
             * <strong>example:</strong>
             * <p>creator@ccc-test</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>Editor.</p>
             * 
             * <strong>example:</strong>
             * <p>editor@ccc-test</p>
             */
            public Builder editor(String editor) {
                this.editor = editor;
                return this;
            }

            /**
             * <p>Summary ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ac0dd304-<strong><strong>-</strong></strong>-****-4a90010f0d38</p>
             */
            public Builder ticketId(String ticketId) {
                this.ticketId = ticketId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
