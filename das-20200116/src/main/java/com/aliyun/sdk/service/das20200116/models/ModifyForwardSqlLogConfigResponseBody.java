// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
 * {@link ModifyForwardSqlLogConfigResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyForwardSqlLogConfigResponseBody</p>
 */
public class ModifyForwardSqlLogConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private ModifyForwardSqlLogConfigResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyForwardSqlLogConfigResponseBody create() {
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String success; 

        private Builder() {
        } 

        private Builder(ModifyForwardSqlLogConfigResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>返回码。200 表示成功。</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>ForwardSqlLogResult</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>返回消息。成功时为空，失败时为错误原因描述。</p>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>请求 ID。可用于问题排查和服务端关联。</p>
         * 
         * <strong>example:</strong>
         * <p>B6D17591-B48B-4D31-9CD6-9B9796B2****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>请求是否成功。取值：true 或 false。</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public ModifyForwardSqlLogConfigResponseBody build() {
            return new ModifyForwardSqlLogConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModifyForwardSqlLogConfigResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyForwardSqlLogConfigResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Logstore")
        private String logstore;

        @com.aliyun.core.annotation.NameInMap("Project")
        private String project;

        @com.aliyun.core.annotation.NameInMap("VpcEndpoint")
        private String vpcEndpoint;

        private Data(Builder builder) {
            this.logstore = builder.logstore;
            this.project = builder.project;
            this.vpcEndpoint = builder.vpcEndpoint;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return logstore
         */
        public String getLogstore() {
            return this.logstore;
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        /**
         * @return vpcEndpoint
         */
        public String getVpcEndpoint() {
            return this.vpcEndpoint;
        }

        public static final class Builder {
            private String logstore; 
            private String project; 
            private String vpcEndpoint; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.logstore = model.logstore;
                this.project = model.project;
                this.vpcEndpoint = model.vpcEndpoint;
            } 

            /**
             * <p>目标 SLS Logstore 名称。</p>
             * 
             * <strong>example:</strong>
             * <p>cdn222</p>
             */
            public Builder logstore(String logstore) {
                this.logstore = logstore;
                return this;
            }

            /**
             * <p>目标 SLS Project 名称。</p>
             * 
             * <strong>example:</strong>
             * <p>facedetect7</p>
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * <p>目标 SLS 的 VPC 网络 Endpoint 地址。</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing-intranet.log.aliyuncs.com</p>
             */
            public Builder vpcEndpoint(String vpcEndpoint) {
                this.vpcEndpoint = vpcEndpoint;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
