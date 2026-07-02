// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliyunauth20181222.models;

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
 * {@link QueryInEffectQuthOrderResponseBody} extends {@link TeaModel}
 *
 * <p>QueryInEffectQuthOrderResponseBody</p>
 */
public class QueryInEffectQuthOrderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryInEffectQuthOrderResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryInEffectQuthOrderResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryInEffectQuthOrderResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryInEffectQuthOrderResponseBody build() {
            return new QueryInEffectQuthOrderResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryInEffectQuthOrderResponseBody} extends {@link TeaModel}
     *
     * <p>QueryInEffectQuthOrderResponseBody</p>
     */
    public static class AuthItemRecordGroupItemDTOS extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthitemID")
        private String authitemID;

        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private String gmtCreated;

        @com.aliyun.core.annotation.NameInMap("Msg")
        private String msg;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RemarkDataJson")
        private String remarkDataJson;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Vid")
        private String vid;

        private AuthItemRecordGroupItemDTOS(Builder builder) {
            this.authitemID = builder.authitemID;
            this.gmtCreated = builder.gmtCreated;
            this.msg = builder.msg;
            this.name = builder.name;
            this.remarkDataJson = builder.remarkDataJson;
            this.status = builder.status;
            this.vid = builder.vid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthItemRecordGroupItemDTOS create() {
            return builder().build();
        }

        /**
         * @return authitemID
         */
        public String getAuthitemID() {
            return this.authitemID;
        }

        /**
         * @return gmtCreated
         */
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        /**
         * @return msg
         */
        public String getMsg() {
            return this.msg;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return remarkDataJson
         */
        public String getRemarkDataJson() {
            return this.remarkDataJson;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return vid
         */
        public String getVid() {
            return this.vid;
        }

        public static final class Builder {
            private String authitemID; 
            private String gmtCreated; 
            private String msg; 
            private String name; 
            private String remarkDataJson; 
            private Integer status; 
            private String vid; 

            private Builder() {
            } 

            private Builder(AuthItemRecordGroupItemDTOS model) {
                this.authitemID = model.authitemID;
                this.gmtCreated = model.gmtCreated;
                this.msg = model.msg;
                this.name = model.name;
                this.remarkDataJson = model.remarkDataJson;
                this.status = model.status;
                this.vid = model.vid;
            } 

            /**
             * AuthitemID.
             */
            public Builder authitemID(String authitemID) {
                this.authitemID = authitemID;
                return this;
            }

            /**
             * GmtCreated.
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * Msg.
             */
            public Builder msg(String msg) {
                this.msg = msg;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * RemarkDataJson.
             */
            public Builder remarkDataJson(String remarkDataJson) {
                this.remarkDataJson = remarkDataJson;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * Vid.
             */
            public Builder vid(String vid) {
                this.vid = vid;
                return this;
            }

            public AuthItemRecordGroupItemDTOS build() {
                return new AuthItemRecordGroupItemDTOS(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryInEffectQuthOrderResponseBody} extends {@link TeaModel}
     *
     * <p>QueryInEffectQuthOrderResponseBody</p>
     */
    public static class OperateTimes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("End")
        private String end;

        @com.aliyun.core.annotation.NameInMap("Start")
        private String start;

        private OperateTimes(Builder builder) {
            this.end = builder.end;
            this.start = builder.start;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperateTimes create() {
            return builder().build();
        }

        /**
         * @return end
         */
        public String getEnd() {
            return this.end;
        }

        /**
         * @return start
         */
        public String getStart() {
            return this.start;
        }

        public static final class Builder {
            private String end; 
            private String start; 

            private Builder() {
            } 

            private Builder(OperateTimes model) {
                this.end = model.end;
                this.start = model.start;
            } 

            /**
             * End.
             */
            public Builder end(String end) {
                this.end = end;
                return this;
            }

            /**
             * Start.
             */
            public Builder start(String start) {
                this.start = start;
                return this;
            }

            public OperateTimes build() {
                return new OperateTimes(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryInEffectQuthOrderResponseBody} extends {@link TeaModel}
     *
     * <p>QueryInEffectQuthOrderResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthItemRecordGroupItemDTOS")
        private java.util.List<AuthItemRecordGroupItemDTOS> authItemRecordGroupItemDTOS;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("LastModifyTime")
        private String lastModifyTime;

        @com.aliyun.core.annotation.NameInMap("OperateTimes")
        private java.util.List<OperateTimes> operateTimes;

        @com.aliyun.core.annotation.NameInMap("OrderVid")
        private String orderVid;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        private List(Builder builder) {
            this.authItemRecordGroupItemDTOS = builder.authItemRecordGroupItemDTOS;
            this.createdTime = builder.createdTime;
            this.lastModifyTime = builder.lastModifyTime;
            this.operateTimes = builder.operateTimes;
            this.orderVid = builder.orderVid;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return authItemRecordGroupItemDTOS
         */
        public java.util.List<AuthItemRecordGroupItemDTOS> getAuthItemRecordGroupItemDTOS() {
            return this.authItemRecordGroupItemDTOS;
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return lastModifyTime
         */
        public String getLastModifyTime() {
            return this.lastModifyTime;
        }

        /**
         * @return operateTimes
         */
        public java.util.List<OperateTimes> getOperateTimes() {
            return this.operateTimes;
        }

        /**
         * @return orderVid
         */
        public String getOrderVid() {
            return this.orderVid;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List<AuthItemRecordGroupItemDTOS> authItemRecordGroupItemDTOS; 
            private String createdTime; 
            private String lastModifyTime; 
            private java.util.List<OperateTimes> operateTimes; 
            private String orderVid; 
            private Integer status; 

            private Builder() {
            } 

            private Builder(List model) {
                this.authItemRecordGroupItemDTOS = model.authItemRecordGroupItemDTOS;
                this.createdTime = model.createdTime;
                this.lastModifyTime = model.lastModifyTime;
                this.operateTimes = model.operateTimes;
                this.orderVid = model.orderVid;
                this.status = model.status;
            } 

            /**
             * AuthItemRecordGroupItemDTOS.
             */
            public Builder authItemRecordGroupItemDTOS(java.util.List<AuthItemRecordGroupItemDTOS> authItemRecordGroupItemDTOS) {
                this.authItemRecordGroupItemDTOS = authItemRecordGroupItemDTOS;
                return this;
            }

            /**
             * CreatedTime.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * LastModifyTime.
             */
            public Builder lastModifyTime(String lastModifyTime) {
                this.lastModifyTime = lastModifyTime;
                return this;
            }

            /**
             * OperateTimes.
             */
            public Builder operateTimes(java.util.List<OperateTimes> operateTimes) {
                this.operateTimes = operateTimes;
                return this;
            }

            /**
             * OrderVid.
             */
            public Builder orderVid(String orderVid) {
                this.orderVid = orderVid;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryInEffectQuthOrderResponseBody} extends {@link TeaModel}
     *
     * <p>QueryInEffectQuthOrderResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        private Data(Builder builder) {
            this.count = builder.count;
            this.list = builder.list;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return list
         */
        public java.util.List<List> getList() {
            return this.list;
        }

        public static final class Builder {
            private Integer count; 
            private java.util.List<List> list; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.count = model.count;
                this.list = model.list;
            } 

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * List.
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
