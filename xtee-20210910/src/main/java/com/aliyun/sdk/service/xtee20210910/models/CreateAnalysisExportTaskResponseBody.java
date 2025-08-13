// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
 * {@link CreateAnalysisExportTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAnalysisExportTaskResponseBody</p>
 */
public class CreateAnalysisExportTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private ResultObject resultObject;

    private CreateAnalysisExportTaskResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAnalysisExportTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultObject
     */
    public ResultObject getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String requestId; 
        private ResultObject resultObject; 

        private Builder() {
        } 

        private Builder(CreateAnalysisExportTaskResponseBody model) {
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Returned object</p>
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public CreateAnalysisExportTaskResponseBody build() {
            return new CreateAnalysisExportTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateAnalysisExportTaskResponseBody} extends {@link TeaModel}
     *
     * <p>CreateAnalysisExportTaskResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("columns")
        private String columns;

        @com.aliyun.core.annotation.NameInMap("conditions")
        private String conditions;

        @com.aliyun.core.annotation.NameInMap("eventBeginTime")
        private Long eventBeginTime;

        @com.aliyun.core.annotation.NameInMap("eventCodes")
        private String eventCodes;

        @com.aliyun.core.annotation.NameInMap("eventEndTime")
        private Long eventEndTime;

        @com.aliyun.core.annotation.NameInMap("fileFormat")
        private String fileFormat;

        @com.aliyun.core.annotation.NameInMap("ossKey")
        private String ossKey;

        @com.aliyun.core.annotation.NameInMap("scope")
        private String scope;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("userId")
        private Long userId;

        private ResultObject(Builder builder) {
            this.columns = builder.columns;
            this.conditions = builder.conditions;
            this.eventBeginTime = builder.eventBeginTime;
            this.eventCodes = builder.eventCodes;
            this.eventEndTime = builder.eventEndTime;
            this.fileFormat = builder.fileFormat;
            this.ossKey = builder.ossKey;
            this.scope = builder.scope;
            this.status = builder.status;
            this.type = builder.type;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return columns
         */
        public String getColumns() {
            return this.columns;
        }

        /**
         * @return conditions
         */
        public String getConditions() {
            return this.conditions;
        }

        /**
         * @return eventBeginTime
         */
        public Long getEventBeginTime() {
            return this.eventBeginTime;
        }

        /**
         * @return eventCodes
         */
        public String getEventCodes() {
            return this.eventCodes;
        }

        /**
         * @return eventEndTime
         */
        public Long getEventEndTime() {
            return this.eventEndTime;
        }

        /**
         * @return fileFormat
         */
        public String getFileFormat() {
            return this.fileFormat;
        }

        /**
         * @return ossKey
         */
        public String getOssKey() {
            return this.ossKey;
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String columns; 
            private String conditions; 
            private Long eventBeginTime; 
            private String eventCodes; 
            private Long eventEndTime; 
            private String fileFormat; 
            private String ossKey; 
            private String scope; 
            private String status; 
            private String type; 
            private Long userId; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.columns = model.columns;
                this.conditions = model.conditions;
                this.eventBeginTime = model.eventBeginTime;
                this.eventCodes = model.eventCodes;
                this.eventEndTime = model.eventEndTime;
                this.fileFormat = model.fileFormat;
                this.ossKey = model.ossKey;
                this.scope = model.scope;
                this.status = model.status;
                this.type = model.type;
                this.userId = model.userId;
            } 

            /**
             * <p>Export list.</p>
             * 
             * <strong>example:</strong>
             * <p>[
             *                 {
             *                     &quot;fieldName&quot;: &quot;requestId&quot;,
             *                     &quot;fieldTitle&quot;: &quot;RequestId&quot;
             *                 },
             *                 {
             *                     &quot;fieldName&quot;: &quot;eventTime&quot;,
             *                     &quot;fieldTitle&quot;: &quot;事件时间&quot;
             *                 },
             *                 {
             *                     &quot;fieldName&quot;: &quot;accountId&quot;,
             *                     &quot;fieldTitle&quot;: &quot;账号&quot;
             *                 },
             *                 {
             *                     &quot;fieldName&quot;: &quot;deviceId&quot;,
             *                     &quot;fieldTitle&quot;: &quot;设备ID&quot;
             *                 },
             *                 {
             *                     &quot;fieldName&quot;: &quot;eventCode&quot;,
             *                     &quot;fieldTitle&quot;: &quot;事件编码&quot;
             *                 },
             *                 {
             *                     &quot;fieldName&quot;: &quot;ip&quot;,
             *                     &quot;fieldTitle&quot;: &quot;IP&quot;
             *                 },
             *                 {
             *                     &quot;fieldName&quot;: &quot;score&quot;,
             *                     &quot;fieldTitle&quot;: &quot;分值&quot;
             *                 },
             *                 {
             *                     &quot;fieldName&quot;: &quot;tags&quot;,
             *                     &quot;fieldTitle&quot;: &quot;标签&quot;
             *                 },
             *                 {
             *                     &quot;fieldName&quot;: &quot;DEtest222&quot;,
             *                     &quot;fieldTitle&quot;: &quot;测试222&quot;
             *                 }
             *             ]</p>
             */
            public Builder columns(String columns) {
                this.columns = columns;
                return this;
            }

            /**
             * <p>Export task conditions.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *      &quot;fieldName&quot;: null, 
             *       &quot;fieldValue&quot;: null 
             *       }</p>
             */
            public Builder conditions(String conditions) {
                this.conditions = conditions;
                return this;
            }

            /**
             * <p>Event start time.</p>
             * 
             * <strong>example:</strong>
             * <p>1752076800000</p>
             */
            public Builder eventBeginTime(Long eventBeginTime) {
                this.eventBeginTime = eventBeginTime;
                return this;
            }

            /**
             * <p>Event code.</p>
             * 
             * <strong>example:</strong>
             * <p>de_ahespg8137</p>
             */
            public Builder eventCodes(String eventCodes) {
                this.eventCodes = eventCodes;
                return this;
            }

            /**
             * <p>End time.</p>
             * 
             * <strong>example:</strong>
             * <p>1753891199000</p>
             */
            public Builder eventEndTime(Long eventEndTime) {
                this.eventEndTime = eventEndTime;
                return this;
            }

            /**
             * <p>File format.</p>
             * 
             * <strong>example:</strong>
             * <p>CSV</p>
             */
            public Builder fileFormat(String fileFormat) {
                this.fileFormat = fileFormat;
                return this;
            }

            /**
             * <p>OSS-generated key.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxxx</p>
             */
            public Builder ossKey(String ossKey) {
                this.ossKey = ossKey;
                return this;
            }

            /**
             * <p>Export task scope.</p>
             * 
             * <strong>example:</strong>
             * <p>ALL</p>
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * <p>Task status.</p>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Export task type.</p>
             * 
             * <strong>example:</strong>
             * <p>BASIC</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>User UID</p>
             * 
             * <strong>example:</strong>
             * <p>1519714049632764</p>
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
