// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetGatewayAuthConsumerDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetGatewayAuthConsumerDetailResponseBody</p>
 */
public class GetGatewayAuthConsumerDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("DynamicCode")
    private String dynamicCode;

    @NameInMap("DynamicMessage")
    private String dynamicMessage;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetGatewayAuthConsumerDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.errorCode = builder.errorCode;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGatewayAuthConsumerDetailResponseBody create() {
        return builder().build();
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
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
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
        private String dynamicCode; 
        private String dynamicMessage; 
        private String errorCode; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * code仅仅用来和success同步
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
         * 动态错误信息中的占位符
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * DynamicMessage.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
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

        public GetGatewayAuthConsumerDetailResponseBody build() {
            return new GetGatewayAuthConsumerDetailResponseBody(this);
        } 

    } 

    public static class ResourceList extends TeaModel {
        @NameInMap("ConsumerId")
        private Long consumerId;

        @NameInMap("GatewayUniqueId")
        private String gatewayUniqueId;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("Id")
        private Long id;

        @NameInMap("ResourceStatus")
        private Boolean resourceStatus;

        @NameInMap("RouteId")
        private Long routeId;

        @NameInMap("RouteName")
        private String routeName;

        private ResourceList(Builder builder) {
            this.consumerId = builder.consumerId;
            this.gatewayUniqueId = builder.gatewayUniqueId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.resourceStatus = builder.resourceStatus;
            this.routeId = builder.routeId;
            this.routeName = builder.routeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceList create() {
            return builder().build();
        }

        /**
         * @return consumerId
         */
        public Long getConsumerId() {
            return this.consumerId;
        }

        /**
         * @return gatewayUniqueId
         */
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return resourceStatus
         */
        public Boolean getResourceStatus() {
            return this.resourceStatus;
        }

        /**
         * @return routeId
         */
        public Long getRouteId() {
            return this.routeId;
        }

        /**
         * @return routeName
         */
        public String getRouteName() {
            return this.routeName;
        }

        public static final class Builder {
            private Long consumerId; 
            private String gatewayUniqueId; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private Boolean resourceStatus; 
            private Long routeId; 
            private String routeName; 

            /**
             * ConsumerId.
             */
            public Builder consumerId(Long consumerId) {
                this.consumerId = consumerId;
                return this;
            }

            /**
             * GatewayUniqueId.
             */
            public Builder gatewayUniqueId(String gatewayUniqueId) {
                this.gatewayUniqueId = gatewayUniqueId;
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
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * ResourceStatus.
             */
            public Builder resourceStatus(Boolean resourceStatus) {
                this.resourceStatus = resourceStatus;
                return this;
            }

            /**
             * RouteId.
             */
            public Builder routeId(Long routeId) {
                this.routeId = routeId;
                return this;
            }

            /**
             * RouteName.
             */
            public Builder routeName(String routeName) {
                this.routeName = routeName;
                return this;
            }

            public ResourceList build() {
                return new ResourceList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("ConsumerStatus")
        private Boolean consumerStatus;

        @NameInMap("Description")
        private String description;

        @NameInMap("EncodeType")
        private String encodeType;

        @NameInMap("GatewayUniqueId")
        private String gatewayUniqueId;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Jwks")
        private String jwks;

        @NameInMap("KeyName")
        private String keyName;

        @NameInMap("KeyValue")
        private String keyValue;

        @NameInMap("Name")
        private String name;

        @NameInMap("PrimaryUser")
        private String primaryUser;

        @NameInMap("ResourceList")
        private java.util.List < ResourceList> resourceList;

        @NameInMap("TokenName")
        private String tokenName;

        @NameInMap("TokenPass")
        private Boolean tokenPass;

        @NameInMap("TokenPosition")
        private String tokenPosition;

        @NameInMap("TokenPrefix")
        private String tokenPrefix;

        @NameInMap("Type")
        private String type;

        private Data(Builder builder) {
            this.consumerStatus = builder.consumerStatus;
            this.description = builder.description;
            this.encodeType = builder.encodeType;
            this.gatewayUniqueId = builder.gatewayUniqueId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.jwks = builder.jwks;
            this.keyName = builder.keyName;
            this.keyValue = builder.keyValue;
            this.name = builder.name;
            this.primaryUser = builder.primaryUser;
            this.resourceList = builder.resourceList;
            this.tokenName = builder.tokenName;
            this.tokenPass = builder.tokenPass;
            this.tokenPosition = builder.tokenPosition;
            this.tokenPrefix = builder.tokenPrefix;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return consumerStatus
         */
        public Boolean getConsumerStatus() {
            return this.consumerStatus;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return encodeType
         */
        public String getEncodeType() {
            return this.encodeType;
        }

        /**
         * @return gatewayUniqueId
         */
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return jwks
         */
        public String getJwks() {
            return this.jwks;
        }

        /**
         * @return keyName
         */
        public String getKeyName() {
            return this.keyName;
        }

        /**
         * @return keyValue
         */
        public String getKeyValue() {
            return this.keyValue;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return primaryUser
         */
        public String getPrimaryUser() {
            return this.primaryUser;
        }

        /**
         * @return resourceList
         */
        public java.util.List < ResourceList> getResourceList() {
            return this.resourceList;
        }

        /**
         * @return tokenName
         */
        public String getTokenName() {
            return this.tokenName;
        }

        /**
         * @return tokenPass
         */
        public Boolean getTokenPass() {
            return this.tokenPass;
        }

        /**
         * @return tokenPosition
         */
        public String getTokenPosition() {
            return this.tokenPosition;
        }

        /**
         * @return tokenPrefix
         */
        public String getTokenPrefix() {
            return this.tokenPrefix;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Boolean consumerStatus; 
            private String description; 
            private String encodeType; 
            private String gatewayUniqueId; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private String jwks; 
            private String keyName; 
            private String keyValue; 
            private String name; 
            private String primaryUser; 
            private java.util.List < ResourceList> resourceList; 
            private String tokenName; 
            private Boolean tokenPass; 
            private String tokenPosition; 
            private String tokenPrefix; 
            private String type; 

            /**
             * ConsumerStatus.
             */
            public Builder consumerStatus(Boolean consumerStatus) {
                this.consumerStatus = consumerStatus;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * EncodeType.
             */
            public Builder encodeType(String encodeType) {
                this.encodeType = encodeType;
                return this;
            }

            /**
             * GatewayUniqueId.
             */
            public Builder gatewayUniqueId(String gatewayUniqueId) {
                this.gatewayUniqueId = gatewayUniqueId;
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
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Jwks.
             */
            public Builder jwks(String jwks) {
                this.jwks = jwks;
                return this;
            }

            /**
             * KeyName.
             */
            public Builder keyName(String keyName) {
                this.keyName = keyName;
                return this;
            }

            /**
             * KeyValue.
             */
            public Builder keyValue(String keyValue) {
                this.keyValue = keyValue;
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
             * PrimaryUser.
             */
            public Builder primaryUser(String primaryUser) {
                this.primaryUser = primaryUser;
                return this;
            }

            /**
             * ResourceList.
             */
            public Builder resourceList(java.util.List < ResourceList> resourceList) {
                this.resourceList = resourceList;
                return this;
            }

            /**
             * TokenName.
             */
            public Builder tokenName(String tokenName) {
                this.tokenName = tokenName;
                return this;
            }

            /**
             * TokenPass.
             */
            public Builder tokenPass(Boolean tokenPass) {
                this.tokenPass = tokenPass;
                return this;
            }

            /**
             * TokenPosition.
             */
            public Builder tokenPosition(String tokenPosition) {
                this.tokenPosition = tokenPosition;
                return this;
            }

            /**
             * TokenPrefix.
             */
            public Builder tokenPrefix(String tokenPrefix) {
                this.tokenPrefix = tokenPrefix;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
