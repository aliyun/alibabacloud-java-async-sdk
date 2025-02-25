// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link GetHotlineAgentDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetHotlineAgentDetailResponseBody</p>
 */
public class GetHotlineAgentDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Long httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetHotlineAgentDetailResponseBody(Builder builder) {
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

    public static GetHotlineAgentDetailResponseBody create() {
        return builder().build();
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
    public Long getHttpStatusCode() {
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
        private Long httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
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
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Long httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        public GetHotlineAgentDetailResponseBody build() {
            return new GetHotlineAgentDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetHotlineAgentDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetHotlineAgentDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentId")
        private Long agentId;

        @com.aliyun.core.annotation.NameInMap("AgentStatus")
        private Integer agentStatus;

        @com.aliyun.core.annotation.NameInMap("AgentStatusCode")
        private String agentStatusCode;

        @com.aliyun.core.annotation.NameInMap("Assigned")
        private Boolean assigned;

        @com.aliyun.core.annotation.NameInMap("RestType")
        private Integer restType;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private Long tenantId;

        @com.aliyun.core.annotation.NameInMap("Token")
        private String token;

        private Data(Builder builder) {
            this.agentId = builder.agentId;
            this.agentStatus = builder.agentStatus;
            this.agentStatusCode = builder.agentStatusCode;
            this.assigned = builder.assigned;
            this.restType = builder.restType;
            this.tenantId = builder.tenantId;
            this.token = builder.token;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return agentId
         */
        public Long getAgentId() {
            return this.agentId;
        }

        /**
         * @return agentStatus
         */
        public Integer getAgentStatus() {
            return this.agentStatus;
        }

        /**
         * @return agentStatusCode
         */
        public String getAgentStatusCode() {
            return this.agentStatusCode;
        }

        /**
         * @return assigned
         */
        public Boolean getAssigned() {
            return this.assigned;
        }

        /**
         * @return restType
         */
        public Integer getRestType() {
            return this.restType;
        }

        /**
         * @return tenantId
         */
        public Long getTenantId() {
            return this.tenantId;
        }

        /**
         * @return token
         */
        public String getToken() {
            return this.token;
        }

        public static final class Builder {
            private Long agentId; 
            private Integer agentStatus; 
            private String agentStatusCode; 
            private Boolean assigned; 
            private Integer restType; 
            private Long tenantId; 
            private String token; 

            /**
             * AgentId.
             */
            public Builder agentId(Long agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * AgentStatus.
             */
            public Builder agentStatus(Integer agentStatus) {
                this.agentStatus = agentStatus;
                return this;
            }

            /**
             * AgentStatusCode.
             */
            public Builder agentStatusCode(String agentStatusCode) {
                this.agentStatusCode = agentStatusCode;
                return this;
            }

            /**
             * Assigned.
             */
            public Builder assigned(Boolean assigned) {
                this.assigned = assigned;
                return this;
            }

            /**
             * RestType.
             */
            public Builder restType(Integer restType) {
                this.restType = restType;
                return this;
            }

            /**
             * TenantId.
             */
            public Builder tenantId(Long tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * Token.
             */
            public Builder token(String token) {
                this.token = token;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
