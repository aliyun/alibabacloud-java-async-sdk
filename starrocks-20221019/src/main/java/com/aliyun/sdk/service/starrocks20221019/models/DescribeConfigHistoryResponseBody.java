// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starrocks20221019.models;

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
 * {@link DescribeConfigHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeConfigHistoryResponseBody</p>
 */
public class DescribeConfigHistoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private DescribeConfigHistoryResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeConfigHistoryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private java.util.List<Data> data; 
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(DescribeConfigHistoryResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
            this.total = model.total;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * ErrCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * ErrMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeConfigHistoryResponseBody build() {
            return new DescribeConfigHistoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeConfigHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeConfigHistoryResponseBody</p>
     */
    public static class ConfigHistoryEffectDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EffectStatus")
        private String effectStatus;

        @com.aliyun.core.annotation.NameInMap("NodeGroupId")
        private String nodeGroupId;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        private ConfigHistoryEffectDetails(Builder builder) {
            this.effectStatus = builder.effectStatus;
            this.nodeGroupId = builder.nodeGroupId;
            this.nodeId = builder.nodeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigHistoryEffectDetails create() {
            return builder().build();
        }

        /**
         * @return effectStatus
         */
        public String getEffectStatus() {
            return this.effectStatus;
        }

        /**
         * @return nodeGroupId
         */
        public String getNodeGroupId() {
            return this.nodeGroupId;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        public static final class Builder {
            private String effectStatus; 
            private String nodeGroupId; 
            private String nodeId; 

            private Builder() {
            } 

            private Builder(ConfigHistoryEffectDetails model) {
                this.effectStatus = model.effectStatus;
                this.nodeGroupId = model.nodeGroupId;
                this.nodeId = model.nodeId;
            } 

            /**
             * EffectStatus.
             */
            public Builder effectStatus(String effectStatus) {
                this.effectStatus = effectStatus;
                return this;
            }

            /**
             * NodeGroupId.
             */
            public Builder nodeGroupId(String nodeGroupId) {
                this.nodeGroupId = nodeGroupId;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            public ConfigHistoryEffectDetails build() {
                return new ConfigHistoryEffectDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeConfigHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeConfigHistoryResponseBody</p>
     */
    public static class ConfigMementos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("After")
        private String after;

        @com.aliyun.core.annotation.NameInMap("Before")
        private String before;

        @com.aliyun.core.annotation.NameInMap("ConfigKey")
        private String configKey;

        @com.aliyun.core.annotation.NameInMap("ConfigType")
        private String configType;

        private ConfigMementos(Builder builder) {
            this.action = builder.action;
            this.after = builder.after;
            this.before = builder.before;
            this.configKey = builder.configKey;
            this.configType = builder.configType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigMementos create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return after
         */
        public String getAfter() {
            return this.after;
        }

        /**
         * @return before
         */
        public String getBefore() {
            return this.before;
        }

        /**
         * @return configKey
         */
        public String getConfigKey() {
            return this.configKey;
        }

        /**
         * @return configType
         */
        public String getConfigType() {
            return this.configType;
        }

        public static final class Builder {
            private String action; 
            private String after; 
            private String before; 
            private String configKey; 
            private String configType; 

            private Builder() {
            } 

            private Builder(ConfigMementos model) {
                this.action = model.action;
                this.after = model.after;
                this.before = model.before;
                this.configKey = model.configKey;
                this.configType = model.configType;
            } 

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * After.
             */
            public Builder after(String after) {
                this.after = after;
                return this;
            }

            /**
             * Before.
             */
            public Builder before(String before) {
                this.before = before;
                return this;
            }

            /**
             * ConfigKey.
             */
            public Builder configKey(String configKey) {
                this.configKey = configKey;
                return this;
            }

            /**
             * ConfigType.
             */
            public Builder configType(String configType) {
                this.configType = configType;
                return this;
            }

            public ConfigMementos build() {
                return new ConfigMementos(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeConfigHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeConfigHistoryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigHistoryEffectDetails")
        private java.util.List<ConfigHistoryEffectDetails> configHistoryEffectDetails;

        @com.aliyun.core.annotation.NameInMap("ConfigHistoryId")
        private String configHistoryId;

        @com.aliyun.core.annotation.NameInMap("ConfigMementos")
        private java.util.List<ConfigMementos> configMementos;

        @com.aliyun.core.annotation.NameInMap("EffectStatus")
        private String effectStatus;

        @com.aliyun.core.annotation.NameInMap("Effected")
        private Boolean effected;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("OperatorId")
        private String operatorId;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("Rollback")
        private Boolean rollback;

        private Data(Builder builder) {
            this.configHistoryEffectDetails = builder.configHistoryEffectDetails;
            this.configHistoryId = builder.configHistoryId;
            this.configMementos = builder.configMementos;
            this.effectStatus = builder.effectStatus;
            this.effected = builder.effected;
            this.gmtCreate = builder.gmtCreate;
            this.operatorId = builder.operatorId;
            this.reason = builder.reason;
            this.rollback = builder.rollback;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return configHistoryEffectDetails
         */
        public java.util.List<ConfigHistoryEffectDetails> getConfigHistoryEffectDetails() {
            return this.configHistoryEffectDetails;
        }

        /**
         * @return configHistoryId
         */
        public String getConfigHistoryId() {
            return this.configHistoryId;
        }

        /**
         * @return configMementos
         */
        public java.util.List<ConfigMementos> getConfigMementos() {
            return this.configMementos;
        }

        /**
         * @return effectStatus
         */
        public String getEffectStatus() {
            return this.effectStatus;
        }

        /**
         * @return effected
         */
        public Boolean getEffected() {
            return this.effected;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return operatorId
         */
        public String getOperatorId() {
            return this.operatorId;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return rollback
         */
        public Boolean getRollback() {
            return this.rollback;
        }

        public static final class Builder {
            private java.util.List<ConfigHistoryEffectDetails> configHistoryEffectDetails; 
            private String configHistoryId; 
            private java.util.List<ConfigMementos> configMementos; 
            private String effectStatus; 
            private Boolean effected; 
            private Long gmtCreate; 
            private String operatorId; 
            private String reason; 
            private Boolean rollback; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.configHistoryEffectDetails = model.configHistoryEffectDetails;
                this.configHistoryId = model.configHistoryId;
                this.configMementos = model.configMementos;
                this.effectStatus = model.effectStatus;
                this.effected = model.effected;
                this.gmtCreate = model.gmtCreate;
                this.operatorId = model.operatorId;
                this.reason = model.reason;
                this.rollback = model.rollback;
            } 

            /**
             * ConfigHistoryEffectDetails.
             */
            public Builder configHistoryEffectDetails(java.util.List<ConfigHistoryEffectDetails> configHistoryEffectDetails) {
                this.configHistoryEffectDetails = configHistoryEffectDetails;
                return this;
            }

            /**
             * ConfigHistoryId.
             */
            public Builder configHistoryId(String configHistoryId) {
                this.configHistoryId = configHistoryId;
                return this;
            }

            /**
             * ConfigMementos.
             */
            public Builder configMementos(java.util.List<ConfigMementos> configMementos) {
                this.configMementos = configMementos;
                return this;
            }

            /**
             * EffectStatus.
             */
            public Builder effectStatus(String effectStatus) {
                this.effectStatus = effectStatus;
                return this;
            }

            /**
             * Effected.
             */
            public Builder effected(Boolean effected) {
                this.effected = effected;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * OperatorId.
             */
            public Builder operatorId(String operatorId) {
                this.operatorId = operatorId;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * Rollback.
             */
            public Builder rollback(Boolean rollback) {
                this.rollback = rollback;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
