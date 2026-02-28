// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs_workbench20220220.models;

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
 * {@link ListInstanceRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstanceRecordsResponseBody</p>
 */
public class ListInstanceRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Root")
    private Root root;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListInstanceRecordsResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.root = builder.root;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceRecordsResponseBody create() {
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
     * @return root
     */
    public Root getRoot() {
        return this.root;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private Root root; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListInstanceRecordsResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.root = model.root;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Root.
         */
        public Builder root(Root root) {
            this.root = root;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListInstanceRecordsResponseBody build() {
            return new ListInstanceRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInstanceRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceRecordsResponseBody</p>
     */
    public static class RecordList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private Long accountId;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceRecordUrl")
        private String instanceRecordUrl;

        @com.aliyun.core.annotation.NameInMap("RecordDurationMillis")
        private Long recordDurationMillis;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TerminalSessionToken")
        private String terminalSessionToken;

        private RecordList(Builder builder) {
            this.accountId = builder.accountId;
            this.expireTime = builder.expireTime;
            this.gmtCreate = builder.gmtCreate;
            this.instanceId = builder.instanceId;
            this.instanceRecordUrl = builder.instanceRecordUrl;
            this.recordDurationMillis = builder.recordDurationMillis;
            this.status = builder.status;
            this.terminalSessionToken = builder.terminalSessionToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordList create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public Long getAccountId() {
            return this.accountId;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceRecordUrl
         */
        public String getInstanceRecordUrl() {
            return this.instanceRecordUrl;
        }

        /**
         * @return recordDurationMillis
         */
        public Long getRecordDurationMillis() {
            return this.recordDurationMillis;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return terminalSessionToken
         */
        public String getTerminalSessionToken() {
            return this.terminalSessionToken;
        }

        public static final class Builder {
            private Long accountId; 
            private String expireTime; 
            private String gmtCreate; 
            private String instanceId; 
            private String instanceRecordUrl; 
            private Long recordDurationMillis; 
            private String status; 
            private String terminalSessionToken; 

            private Builder() {
            } 

            private Builder(RecordList model) {
                this.accountId = model.accountId;
                this.expireTime = model.expireTime;
                this.gmtCreate = model.gmtCreate;
                this.instanceId = model.instanceId;
                this.instanceRecordUrl = model.instanceRecordUrl;
                this.recordDurationMillis = model.recordDurationMillis;
                this.status = model.status;
                this.terminalSessionToken = model.terminalSessionToken;
            } 

            /**
             * AccountId.
             */
            public Builder accountId(Long accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceRecordUrl.
             */
            public Builder instanceRecordUrl(String instanceRecordUrl) {
                this.instanceRecordUrl = instanceRecordUrl;
                return this;
            }

            /**
             * RecordDurationMillis.
             */
            public Builder recordDurationMillis(Long recordDurationMillis) {
                this.recordDurationMillis = recordDurationMillis;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TerminalSessionToken.
             */
            public Builder terminalSessionToken(String terminalSessionToken) {
                this.terminalSessionToken = terminalSessionToken;
                return this;
            }

            public RecordList build() {
                return new RecordList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstanceRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceRecordsResponseBody</p>
     */
    public static class Root extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RecordList")
        private java.util.List<RecordList> recordList;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Root(Builder builder) {
            this.recordList = builder.recordList;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Root create() {
            return builder().build();
        }

        /**
         * @return recordList
         */
        public java.util.List<RecordList> getRecordList() {
            return this.recordList;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<RecordList> recordList; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Root model) {
                this.recordList = model.recordList;
                this.totalCount = model.totalCount;
            } 

            /**
             * RecordList.
             */
            public Builder recordList(java.util.List<RecordList> recordList) {
                this.recordList = recordList;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Root build() {
                return new Root(this);
            } 

        } 

    }
}
