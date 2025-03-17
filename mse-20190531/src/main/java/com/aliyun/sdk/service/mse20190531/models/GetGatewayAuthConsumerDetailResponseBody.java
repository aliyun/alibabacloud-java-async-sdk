// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link GetGatewayAuthConsumerDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetGatewayAuthConsumerDetailResponseBody</p>
 */
public class GetGatewayAuthConsumerDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("DynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

        private Builder() {
        } 

        private Builder(GetGatewayAuthConsumerDetailResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.dynamicCode = model.dynamicCode;
            this.dynamicMessage = model.dynamicMessage;
            this.errorCode = model.errorCode;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code. A value of 200 is returned if the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The dynamic part in the error message.</p>
         * 
         * <strong>example:</strong>
         * <p>code</p>
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * <p>The dynamic part in the error message. This parameter is used to replace the **%s** variable in the <strong>ErrMessage</strong> parameter.</p>
         * <blockquote>
         * <p> If the return value of the <strong>ErrMessage</strong> parameter is <strong>The Value of Input Parameter %s is not valid</strong> and the return value of the <strong>DynamicMessage</strong> parameter is <strong>DtsJobId</strong>, the specified <strong>DtsJobId</strong> parameter is invalid.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>The specified parameter is invalid.</p>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * <p>The error code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-100-000</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>The request is successfully processed.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>316F5F64-F73D-42DC-8632-01E308B6****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The request was successful.</li>
         * <li><code>false</code>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetGatewayAuthConsumerDetailResponseBody build() {
            return new GetGatewayAuthConsumerDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetGatewayAuthConsumerDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayAuthConsumerDetailResponseBody</p>
     */
    public static class ResourceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConsumerId")
        private Long consumerId;

        @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
        private String gatewayUniqueId;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("ResourceStatus")
        private Boolean resourceStatus;

        @com.aliyun.core.annotation.NameInMap("RouteId")
        private Long routeId;

        @com.aliyun.core.annotation.NameInMap("RouteName")
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

            private Builder() {
            } 

            private Builder(ResourceList model) {
                this.consumerId = model.consumerId;
                this.gatewayUniqueId = model.gatewayUniqueId;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.resourceStatus = model.resourceStatus;
                this.routeId = model.routeId;
                this.routeName = model.routeName;
            } 

            /**
             * <p>The consumer ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder consumerId(Long consumerId) {
                this.consumerId = consumerId;
                return this;
            }

            /**
             * <p>The unique ID of the gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>gw-4822033a8513496fa10f05c934f*****</p>
             */
            public Builder gatewayUniqueId(String gatewayUniqueId) {
                this.gatewayUniqueId = gatewayUniqueId;
                return this;
            }

            /**
             * <p>The time when the resource associated with the consumer authentication record was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-12-06 01:38:03</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the resource associated with the consumer authentication record was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-12-06 01:38:03</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The ID of the authorized resource for the consumer.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The resource authorization state. Valid values:</p>
             * <ul>
             * <li>true: Resource authorization is enabled.</li>
             * <li>false: Resource authorization is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder resourceStatus(Boolean resourceStatus) {
                this.resourceStatus = resourceStatus;
                return this;
            }

            /**
             * <p>The ID of the route.</p>
             * 
             * <strong>example:</strong>
             * <p>3458</p>
             */
            public Builder routeId(Long routeId) {
                this.routeId = routeId;
                return this;
            }

            /**
             * <p>The name of the route.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
    /**
     * 
     * {@link GetGatewayAuthConsumerDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayAuthConsumerDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConsumerStatus")
        private Boolean consumerStatus;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EncodeType")
        private String encodeType;

        @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
        private String gatewayUniqueId;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Jwks")
        private String jwks;

        @com.aliyun.core.annotation.NameInMap("KeyName")
        private String keyName;

        @com.aliyun.core.annotation.NameInMap("KeyValue")
        private String keyValue;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PrimaryUser")
        private String primaryUser;

        @com.aliyun.core.annotation.NameInMap("ResourceList")
        private java.util.List<ResourceList> resourceList;

        @com.aliyun.core.annotation.NameInMap("TokenName")
        private String tokenName;

        @com.aliyun.core.annotation.NameInMap("TokenPass")
        private Boolean tokenPass;

        @com.aliyun.core.annotation.NameInMap("TokenPosition")
        private String tokenPosition;

        @com.aliyun.core.annotation.NameInMap("TokenPrefix")
        private String tokenPrefix;

        @com.aliyun.core.annotation.NameInMap("Type")
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
        public java.util.List<ResourceList> getResourceList() {
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
            private java.util.List<ResourceList> resourceList; 
            private String tokenName; 
            private Boolean tokenPass; 
            private String tokenPosition; 
            private String tokenPrefix; 
            private String type; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.consumerStatus = model.consumerStatus;
                this.description = model.description;
                this.encodeType = model.encodeType;
                this.gatewayUniqueId = model.gatewayUniqueId;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.jwks = model.jwks;
                this.keyName = model.keyName;
                this.keyValue = model.keyValue;
                this.name = model.name;
                this.primaryUser = model.primaryUser;
                this.resourceList = model.resourceList;
                this.tokenName = model.tokenName;
                this.tokenPass = model.tokenPass;
                this.tokenPosition = model.tokenPosition;
                this.tokenPrefix = model.tokenPrefix;
                this.type = model.type;
            } 

            /**
             * <p>The status of the consumer. Valid values:</p>
             * <ul>
             * <li>true: enabled</li>
             * <li>false: disabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder consumerStatus(Boolean consumerStatus) {
                this.consumerStatus = consumerStatus;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>Description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The encryption type. Valid values:</p>
             * <ul>
             * <li>RSA</li>
             * <li>OCT</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RSA</p>
             */
            public Builder encodeType(String encodeType) {
                this.encodeType = encodeType;
                return this;
            }

            /**
             * <p>The unique ID of the gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>gw-7ea3da97b96543e19f6c597cd4a9****</p>
             */
            public Builder gatewayUniqueId(String gatewayUniqueId) {
                this.gatewayUniqueId = gatewayUniqueId;
                return this;
            }

            /**
             * <p>The time when the consumer authentication record was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2031-03-30 02:35:12</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the consumer authentication record was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-02-01 14:17:57</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The ID of the consumer.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The JWT public key. The JSON format is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *       &quot;keys&quot;: [
             *             {
             *                   &quot;e&quot;: &quot;AQAB&quot;,
             *                   &quot;kid&quot;: &quot;DHFbpoIUqrY8t2zpA2qXfCmr5VO5ZEr4RzHU_-envvQ&quot;,
             *                   &quot;kty&quot;: &quot;RSA&quot;,
             *                   &quot;n&quot;: &quot;xAE7eB6qugXyCAG3yhh7pkDkT65pHymX-P7KfIupjf59vsdo91bSP9C8H07pSAGQO1MV_xFj9VswgsCg4R6otmg5PV2He95lZdHtOcU5DXIg_pbhLdKXbi66GlVeK6ABZOUW3WYtnNHD-91gVuoeJT_DwtGGcp4ignkgXfkiEm4sw-4sfb4qdt5oLbyVpmW6x9cfa7vs2WTfURiCrBoUqgBo_-4WTiULmmHSGZHOjzwa8WtrtOQGsAFjIbno85jp6MnGGGZPYZbDAa_b3y5u-YpW7ypZrvD8BgtKVjgtQgZhLAGezMt0ua3DRrWnKqTZ0BJ_EyxOGuHJrLsn00fnMQ&quot;
             *             }
             *       ]
             * }</p>
             */
            public Builder jwks(String jwks) {
                this.jwks = jwks;
                return this;
            }

            /**
             * <p>The name of the key used for JWT-based identity authentication.</p>
             * 
             * <strong>example:</strong>
             * <p>iss</p>
             */
            public Builder keyName(String keyName) {
                this.keyName = keyName;
                return this;
            }

            /**
             * <p>The value of the key used for JWT-based identity authentication.</p>
             * 
             * <strong>example:</strong>
             * <p>abcd</p>
             */
            public Builder keyValue(String keyValue) {
                this.keyValue = keyValue;
                return this;
            }

            /**
             * <p>The name of the consumer.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The creator.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder primaryUser(String primaryUser) {
                this.primaryUser = primaryUser;
                return this;
            }

            /**
             * <p>The resource list.</p>
             */
            public Builder resourceList(java.util.List<ResourceList> resourceList) {
                this.resourceList = resourceList;
                return this;
            }

            /**
             * <p>The names of the parameters that are required to verify each token. By default, each token is prefixed with Bearer and stored in the Authorization header, such as <code>Authorization: Bearer &lt;Content of a token&gt;</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>Authorization</p>
             */
            public Builder tokenName(String tokenName) {
                this.tokenName = tokenName;
                return this;
            }

            /**
             * <p>Specifies whether to enable pass-through.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder tokenPass(Boolean tokenPass) {
                this.tokenPass = tokenPass;
                return this;
            }

            /**
             * <p>The positions of the parameters that are required to verify each token. By default, each token is prefixed with Bearer and stored in the Authorization header, such as <code>Authorization: Bearer &lt;Content of a token&gt;</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>HEADER</p>
             */
            public Builder tokenPosition(String tokenPosition) {
                this.tokenPosition = tokenPosition;
                return this;
            }

            /**
             * <p>The prefixes of the parameters that are required to verify each token. By default, each token is prefixed with Bearer and stored in the Authorization header, such as <code>Authorization: Bearer &lt;Content of a token&gt;</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>Bearer</p>
             */
            public Builder tokenPrefix(String tokenPrefix) {
                this.tokenPrefix = tokenPrefix;
                return this;
            }

            /**
             * <p>The authentication type. Valid values:</p>
             * <ul>
             * <li>JWT</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>JWT</p>
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
