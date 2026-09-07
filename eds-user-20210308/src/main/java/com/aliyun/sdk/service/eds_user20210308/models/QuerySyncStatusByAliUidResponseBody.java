// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

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
 * {@link QuerySyncStatusByAliUidResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySyncStatusByAliUidResponseBody</p>
 */
public class QuerySyncStatusByAliUidResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QuerySyncStatusByAliUidResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySyncStatusByAliUidResponseBody create() {
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
    public Data getData() {
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
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QuerySyncStatusByAliUidResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>System status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
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
         * <p>The error message returned when the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request succeeded.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QuerySyncStatusByAliUidResponseBody build() {
            return new QuerySyncStatusByAliUidResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySyncStatusByAliUidResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySyncStatusByAliUidResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("CorpId")
        private String corpId;

        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private String gmtCreated;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("LatestBeginTime")
        private String latestBeginTime;

        @com.aliyun.core.annotation.NameInMap("LatestEndTime")
        private String latestEndTime;

        @com.aliyun.core.annotation.NameInMap("LatestSuccessTime")
        private String latestSuccessTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.aliUid = builder.aliUid;
            this.corpId = builder.corpId;
            this.gmtCreated = builder.gmtCreated;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.latestBeginTime = builder.latestBeginTime;
            this.latestEndTime = builder.latestEndTime;
            this.latestSuccessTime = builder.latestSuccessTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return corpId
         */
        public String getCorpId() {
            return this.corpId;
        }

        /**
         * @return gmtCreated
         */
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return latestBeginTime
         */
        public String getLatestBeginTime() {
            return this.latestBeginTime;
        }

        /**
         * @return latestEndTime
         */
        public String getLatestEndTime() {
            return this.latestEndTime;
        }

        /**
         * @return latestSuccessTime
         */
        public String getLatestSuccessTime() {
            return this.latestSuccessTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long aliUid; 
            private String corpId; 
            private String gmtCreated; 
            private String gmtModified; 
            private Long id; 
            private String latestBeginTime; 
            private String latestEndTime; 
            private String latestSuccessTime; 
            private String status; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.aliUid = model.aliUid;
                this.corpId = model.corpId;
                this.gmtCreated = model.gmtCreated;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.latestBeginTime = model.latestBeginTime;
                this.latestEndTime = model.latestEndTime;
                this.latestSuccessTime = model.latestSuccessTime;
                this.status = model.status;
            } 

            /**
             * <p>Alibaba Cloud account ID.</p>
             * 
             * <strong>example:</strong>
             * <p>131239236086****</p>
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>The enterprise ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cdrs948144195608****</p>
             */
            public Builder corpId(String corpId) {
                this.corpId = corpId;
                return this;
            }

            /**
             * <p>Creation Time.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-06-30 07:50:42</p>
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * <p>The updated at time.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-03-02 14:27:39</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>Auto increment ID.</p>
             * 
             * <strong>example:</strong>
             * <p>18500</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The latest start time.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-03-02 14:31:39</p>
             */
            public Builder latestBeginTime(String latestBeginTime) {
                this.latestBeginTime = latestBeginTime;
                return this;
            }

            /**
             * <p>The latest end time, regardless of whether the operation succeeded or failed.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-03-02 16:13:12</p>
             */
            public Builder latestEndTime(String latestEndTime) {
                this.latestEndTime = latestEndTime;
                return this;
            }

            /**
             * <p>The latest success time.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-03-02 18:24:01</p>
             */
            public Builder latestSuccessTime(String latestSuccessTime) {
                this.latestSuccessTime = latestSuccessTime;
                return this;
            }

            /**
             * <p>The user synchronization status.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
