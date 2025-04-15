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
 * {@link GetAgentByIdResponseBody} extends {@link TeaModel}
 *
 * <p>GetAgentByIdResponseBody</p>
 */
public class GetAgentByIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetAgentByIdResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentByIdResponseBody create() {
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
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetAgentByIdResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
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

        public GetAgentByIdResponseBody build() {
            return new GetAgentByIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAgentByIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentByIdResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentId")
        private Integer agentId;

        @com.aliyun.core.annotation.NameInMap("CreateUserName")
        private String createUserName;

        @com.aliyun.core.annotation.NameInMap("ForeignKey")
        private String foreignKey;

        @com.aliyun.core.annotation.NameInMap("ForeignNick")
        private String foreignNick;

        @com.aliyun.core.annotation.NameInMap("RealName")
        private String realName;

        @com.aliyun.core.annotation.NameInMap("ServicerType")
        private Integer servicerType;

        @com.aliyun.core.annotation.NameInMap("ShowName")
        private String showName;

        private Data(Builder builder) {
            this.agentId = builder.agentId;
            this.createUserName = builder.createUserName;
            this.foreignKey = builder.foreignKey;
            this.foreignNick = builder.foreignNick;
            this.realName = builder.realName;
            this.servicerType = builder.servicerType;
            this.showName = builder.showName;
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
        public Integer getAgentId() {
            return this.agentId;
        }

        /**
         * @return createUserName
         */
        public String getCreateUserName() {
            return this.createUserName;
        }

        /**
         * @return foreignKey
         */
        public String getForeignKey() {
            return this.foreignKey;
        }

        /**
         * @return foreignNick
         */
        public String getForeignNick() {
            return this.foreignNick;
        }

        /**
         * @return realName
         */
        public String getRealName() {
            return this.realName;
        }

        /**
         * @return servicerType
         */
        public Integer getServicerType() {
            return this.servicerType;
        }

        /**
         * @return showName
         */
        public String getShowName() {
            return this.showName;
        }

        public static final class Builder {
            private Integer agentId; 
            private String createUserName; 
            private String foreignKey; 
            private String foreignNick; 
            private String realName; 
            private Integer servicerType; 
            private String showName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.agentId = model.agentId;
                this.createUserName = model.createUserName;
                this.foreignKey = model.foreignKey;
                this.foreignNick = model.foreignNick;
                this.realName = model.realName;
                this.servicerType = model.servicerType;
                this.showName = model.showName;
            } 

            /**
             * AgentId.
             */
            public Builder agentId(Integer agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * CreateUserName.
             */
            public Builder createUserName(String createUserName) {
                this.createUserName = createUserName;
                return this;
            }

            /**
             * ForeignKey.
             */
            public Builder foreignKey(String foreignKey) {
                this.foreignKey = foreignKey;
                return this;
            }

            /**
             * ForeignNick.
             */
            public Builder foreignNick(String foreignNick) {
                this.foreignNick = foreignNick;
                return this;
            }

            /**
             * RealName.
             */
            public Builder realName(String realName) {
                this.realName = realName;
                return this;
            }

            /**
             * ServicerType.
             */
            public Builder servicerType(Integer servicerType) {
                this.servicerType = servicerType;
                return this;
            }

            /**
             * ShowName.
             */
            public Builder showName(String showName) {
                this.showName = showName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
