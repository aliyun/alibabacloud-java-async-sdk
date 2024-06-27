// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * resultObject.
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public CreateAnalysisExportTaskResponseBody build() {
            return new CreateAnalysisExportTaskResponseBody(this);
        } 

    } 

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

            /**
             * columns.
             */
            public Builder columns(String columns) {
                this.columns = columns;
                return this;
            }

            /**
             * conditions.
             */
            public Builder conditions(String conditions) {
                this.conditions = conditions;
                return this;
            }

            /**
             * eventBeginTime.
             */
            public Builder eventBeginTime(Long eventBeginTime) {
                this.eventBeginTime = eventBeginTime;
                return this;
            }

            /**
             * eventCodes.
             */
            public Builder eventCodes(String eventCodes) {
                this.eventCodes = eventCodes;
                return this;
            }

            /**
             * eventEndTime.
             */
            public Builder eventEndTime(Long eventEndTime) {
                this.eventEndTime = eventEndTime;
                return this;
            }

            /**
             * fileFormat.
             */
            public Builder fileFormat(String fileFormat) {
                this.fileFormat = fileFormat;
                return this;
            }

            /**
             * ossKey.
             */
            public Builder ossKey(String ossKey) {
                this.ossKey = ossKey;
                return this;
            }

            /**
             * scope.
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * userId.
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
