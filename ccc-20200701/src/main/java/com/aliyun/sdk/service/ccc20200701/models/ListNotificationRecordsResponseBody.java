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
 * {@link ListNotificationRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>ListNotificationRecordsResponseBody</p>
 */
public class ListNotificationRecordsResponseBody extends TeaModel {
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

    private ListNotificationRecordsResponseBody(Builder builder) {
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

    public static ListNotificationRecordsResponseBody create() {
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

        private Builder(ListNotificationRecordsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.params = model.params;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response code.</p>
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
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>A list of invalid parameters.</p>
         */
        public Builder params(java.util.List<String> params) {
            this.params = params;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0630E5DF-CEB0-445B-8626-D5C7481181C3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListNotificationRecordsResponseBody build() {
            return new ListNotificationRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListNotificationRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>ListNotificationRecordsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("NotificationKey")
        private String notificationKey;

        @com.aliyun.core.annotation.NameInMap("NotificationType")
        private String notificationType;

        private Data(Builder builder) {
            this.content = builder.content;
            this.instanceId = builder.instanceId;
            this.notificationKey = builder.notificationKey;
            this.notificationType = builder.notificationType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return notificationKey
         */
        public String getNotificationKey() {
            return this.notificationKey;
        }

        /**
         * @return notificationType
         */
        public String getNotificationType() {
            return this.notificationType;
        }

        public static final class Builder {
            private String content; 
            private String instanceId; 
            private String notificationKey; 
            private String notificationType; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.content = model.content;
                this.instanceId = model.instanceId;
                this.notificationKey = model.notificationKey;
                this.notificationType = model.notificationType;
            } 

            /**
             * <p>The notification content.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;agentId&quot;: &quot;agent@ccc-test&quot;,
             *     &quot;callType&quot;: &quot;OUTBOUND&quot;,
             *     &quot;callee&quot;: &quot;13<strong><strong>00&quot;,
             *     &quot;caller&quot;: &quot;05</strong></strong>81&quot;,
             *     &quot;channelId&quot;: &quot;ch-user-13<strong><strong>00-05</strong></strong>81-1772619731285-job-<em><strong><strong>&quot;,
             *     &quot;contactId&quot;: &quot;job-</strong></strong></em>&quot;,
             *     &quot;eventTime&quot;: &quot;2026-03-04T10:22:11.309Z&quot;,
             *     &quot;eventType&quot;: &quot;Dialing&quot;,
             *     &quot;instanceId&quot;: &quot;ccc-test&quot;,
             *     &quot;mediaType&quot;: &quot;AUDIO&quot;,
             *     &quot;skillGroupId&quot;: &quot;skill@ccc-test&quot;
             * }</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ccc-test</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The notification key.</p>
             * 
             * <strong>example:</strong>
             * <p>job-468a63a2-<strong><strong>-</strong></strong>-****-b1ecf726d4be</p>
             */
            public Builder notificationKey(String notificationKey) {
                this.notificationKey = notificationKey;
                return this;
            }

            /**
             * <p>The message type.</p>
             * 
             * <strong>example:</strong>
             * <p>Dialing</p>
             */
            public Builder notificationType(String notificationType) {
                this.notificationType = notificationType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
