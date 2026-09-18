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

        private Builder() {
        } 

        private Builder(GetHotlineAgentDetailResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>Status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Agent service data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Long httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Description of the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EE338D98-9BD3-4413-B165</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the API call succeeded. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Succeeded.</li>
         * <li><strong>false</strong>: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.agentId = model.agentId;
                this.agentStatus = model.agentStatus;
                this.agentStatusCode = model.agentStatusCode;
                this.assigned = model.assigned;
                this.restType = model.restType;
                this.tenantId = model.tenantId;
                this.token = model.token;
            } 

            /**
             * <p>Agent ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2235****</p>
             */
            public Builder agentId(Long agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>Agent status. Valid values: <strong>1~6</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder agentStatus(Integer agentStatus) {
                this.agentStatus = agentStatus;
                return this;
            }

            /**
             * <p>Agent status code. Valid values:  </p>
             * <ul>
             * <li><strong>AgentCheckout</strong>: Agent logged off.  </li>
             * <li><strong>AgentReady</strong>: Agent idle.  </li>
             * <li><strong>AgentBreak</strong>: Agent on break.  </li>
             * <li><strong>AgentAcw</strong>: Post-processing after a call.  </li>
             * <li><strong>AgentBusyForCall</strong>: In a call.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AgentCheckout</p>
             */
            public Builder agentStatusCode(String agentStatusCode) {
                this.agentStatusCode = agentStatusCode;
                return this;
            }

            /**
             * <p>Indicates whether the agent is assigned. Valid values:<br><strong>false</strong>: Not assigned (no call).<br><strong>true</strong>: Assigned (in a call).</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder assigned(Boolean assigned) {
                this.assigned = assigned;
                return this;
            }

            /**
             * <p>Break type. Valid values:  </p>
             * <ul>
             * <li><strong>1</strong>: Short break.  </li>
             * <li><strong>2</strong>: Meal break.  </li>
             * <li><strong>3</strong>: Meeting.  </li>
             * <li><strong>4</strong>: Coaching.  </li>
             * <li><strong>5</strong>: Training.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder restType(Integer restType) {
                this.restType = restType;
                return this;
            }

            /**
             * <p>Tenant ID to which the agent belongs, corresponding to the instance ID in the input parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>ccc_xp_pre-cn-***</p>
             */
            public Builder tenantId(Long tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>Heartbeat signature.</p>
             * 
             * <strong>example:</strong>
             * <p>dnthF_oinHg7JMJDmKqex3Ux****</p>
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
