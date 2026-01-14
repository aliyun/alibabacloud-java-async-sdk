// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20230516.models;

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
 * {@link AddAgentGroupResponseBody} extends {@link TeaModel}
 *
 * <p>AddAgentGroupResponseBody</p>
 */
public class AddAgentGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Model")
    private Model model;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Timestamp")
    private Long timestamp;

    private AddAgentGroupResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.message = builder.message;
        this.model = builder.model;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.timestamp = builder.timestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddAgentGroupResponseBody create() {
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
     * @return model
     */
    public Model getModel() {
        return this.model;
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
     * @return timestamp
     */
    public Long getTimestamp() {
        return this.timestamp;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private String message; 
        private Model model; 
        private String requestId; 
        private Boolean success; 
        private Long timestamp; 

        private Builder() {
        } 

        private Builder(AddAgentGroupResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.message = model.message;
            this.model = model.model;
            this.requestId = model.requestId;
            this.success = model.success;
            this.timestamp = model.timestamp;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
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
         * Model.
         */
        public Builder model(Model model) {
            this.model = model;
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
         * Timestamp.
         */
        public Builder timestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public AddAgentGroupResponseBody build() {
            return new AddAgentGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AddAgentGroupResponseBody} extends {@link TeaModel}
     *
     * <p>AddAgentGroupResponseBody</p>
     */
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentGroupId")
        private Long agentGroupId;

        @com.aliyun.core.annotation.NameInMap("AgentGroupName")
        private String agentGroupName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        private Model(Builder builder) {
            this.agentGroupId = builder.agentGroupId;
            this.agentGroupName = builder.agentGroupName;
            this.createTime = builder.createTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return agentGroupId
         */
        public Long getAgentGroupId() {
            return this.agentGroupId;
        }

        /**
         * @return agentGroupName
         */
        public String getAgentGroupName() {
            return this.agentGroupName;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        public static final class Builder {
            private Long agentGroupId; 
            private String agentGroupName; 
            private String createTime; 

            private Builder() {
            } 

            private Builder(Model model) {
                this.agentGroupId = model.agentGroupId;
                this.agentGroupName = model.agentGroupName;
                this.createTime = model.createTime;
            } 

            /**
             * <p>坐席组ID</p>
             * 
             * <strong>example:</strong>
             * <p>48</p>
             */
            public Builder agentGroupId(Long agentGroupId) {
                this.agentGroupId = agentGroupId;
                return this;
            }

            /**
             * <p>坐席组名称</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值示例值</p>
             */
            public Builder agentGroupName(String agentGroupName) {
                this.agentGroupName = agentGroupName;
                return this;
            }

            /**
             * <p>创建坐席组的时间</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
