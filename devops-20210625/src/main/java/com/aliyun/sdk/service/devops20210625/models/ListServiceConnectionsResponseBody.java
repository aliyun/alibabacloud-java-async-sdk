// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServiceConnectionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListServiceConnectionsResponseBody</p>
 */
public class ListServiceConnectionsResponseBody extends TeaModel {
    @NameInMap("errorCode")
    private String errorCode;

    @NameInMap("errorMessage")
    private String errorMessage;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("serviceConnections")
    private java.util.List < ServiceConnections> serviceConnections;

    @NameInMap("success")
    private Boolean success;

    private ListServiceConnectionsResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.serviceConnections = builder.serviceConnections;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceConnectionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceConnections
     */
    public java.util.List < ServiceConnections> getServiceConnections() {
        return this.serviceConnections;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private java.util.List < ServiceConnections> serviceConnections; 
        private Boolean success; 

        /**
         * 错误码
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * 错误信息
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * 请求id，每次请求都是唯一值，便于后续排查问题
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 服务连接
         */
        public Builder serviceConnections(java.util.List < ServiceConnections> serviceConnections) {
            this.serviceConnections = serviceConnections;
            return this;
        }

        /**
         * true 接口调用成功，false 接口调用失败
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListServiceConnectionsResponseBody build() {
            return new ListServiceConnectionsResponseBody(this);
        } 

    } 

    public static class ServiceConnections extends TeaModel {
        @NameInMap("createTime")
        private Long createTime;

        @NameInMap("id")
        private Long id;

        @NameInMap("name")
        private String name;

        @NameInMap("ownerAccountId")
        private Long ownerAccountId;

        @NameInMap("type")
        private String type;

        private ServiceConnections(Builder builder) {
            this.createTime = builder.createTime;
            this.id = builder.id;
            this.name = builder.name;
            this.ownerAccountId = builder.ownerAccountId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceConnections create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ownerAccountId
         */
        public Long getOwnerAccountId() {
            return this.ownerAccountId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long createTime; 
            private Long id; 
            private String name; 
            private Long ownerAccountId; 
            private String type; 

            /**
             * 创建时间
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 服务连接Id
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * 服务连接名称
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 拥有者阿里云账号id
             */
            public Builder ownerAccountId(Long ownerAccountId) {
                this.ownerAccountId = ownerAccountId;
                return this;
            }

            /**
             * 服务连接类型
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ServiceConnections build() {
                return new ServiceConnections(this);
            } 

        } 

    }
}
