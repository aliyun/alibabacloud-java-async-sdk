// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20251111.models;

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
 * {@link GetInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceResponseBody</p>
 */
public class GetInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Params")
    private java.util.List<String> params;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetInstanceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.params = builder.params;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceResponseBody create() {
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
     * @return params
     */
    public java.util.List<String> getParams() {
        return this.params;
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
        private java.util.List<String> params; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetInstanceResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.params = model.params;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>返回码。成功时为 OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>实例详情</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>HTTP状态码</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>错误信息</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>错误信息中的变量值</p>
         */
        public Builder params(java.util.List<String> params) {
            this.params = params;
            return this;
        }

        /**
         * <p>Id of the request</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>是否调用成功</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetInstanceResponseBody build() {
            return new GetInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Concurrency")
        private Integer concurrency;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private Long createdTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NluProfile")
        private String nluProfile;

        @com.aliyun.core.annotation.NameInMap("ServiceMode")
        private String serviceMode;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("UpdatedTime")
        private Long updatedTime;

        private Data(Builder builder) {
            this.concurrency = builder.concurrency;
            this.createdTime = builder.createdTime;
            this.description = builder.description;
            this.instanceId = builder.instanceId;
            this.name = builder.name;
            this.nluProfile = builder.nluProfile;
            this.serviceMode = builder.serviceMode;
            this.tenantId = builder.tenantId;
            this.updatedTime = builder.updatedTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return concurrency
         */
        public Integer getConcurrency() {
            return this.concurrency;
        }

        /**
         * @return createdTime
         */
        public Long getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nluProfile
         */
        public String getNluProfile() {
            return this.nluProfile;
        }

        /**
         * @return serviceMode
         */
        public String getServiceMode() {
            return this.serviceMode;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return updatedTime
         */
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

        public static final class Builder {
            private Integer concurrency; 
            private Long createdTime; 
            private String description; 
            private String instanceId; 
            private String name; 
            private String nluProfile; 
            private String serviceMode; 
            private String tenantId; 
            private Long updatedTime; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.concurrency = model.concurrency;
                this.createdTime = model.createdTime;
                this.description = model.description;
                this.instanceId = model.instanceId;
                this.name = model.name;
                this.nluProfile = model.nluProfile;
                this.serviceMode = model.serviceMode;
                this.tenantId = model.tenantId;
                this.updatedTime = model.updatedTime;
            } 

            /**
             * <p>实例并发数</p>
             */
            public Builder concurrency(Integer concurrency) {
                this.concurrency = concurrency;
                return this;
            }

            /**
             * <p>实例创建时间，毫秒级时间戳</p>
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>实例描述</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>实例ID</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>实例名称</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>晓蜜业务空间信息，JSON格式字符串。仅服务模式为 INTEGRATED 时有值</p>
             */
            public Builder nluProfile(String nluProfile) {
                this.nluProfile = nluProfile;
                return this;
            }

            /**
             * <p>服务模式。INTEGRATED：集成模式，与晓蜜业务空间集成；STANDARD：标准模式</p>
             */
            public Builder serviceMode(String serviceMode) {
                this.serviceMode = serviceMode;
                return this;
            }

            /**
             * <p>租户ID</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>实例最后更新时间，毫秒级时间戳</p>
             */
            public Builder updatedTime(Long updatedTime) {
                this.updatedTime = updatedTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
