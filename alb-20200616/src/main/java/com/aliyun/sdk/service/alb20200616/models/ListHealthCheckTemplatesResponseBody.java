// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

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
 * {@link ListHealthCheckTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListHealthCheckTemplatesResponseBody</p>
 */
public class ListHealthCheckTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HealthCheckTemplates")
    private java.util.List<HealthCheckTemplates> healthCheckTemplates;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListHealthCheckTemplatesResponseBody(Builder builder) {
        this.healthCheckTemplates = builder.healthCheckTemplates;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHealthCheckTemplatesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return healthCheckTemplates
     */
    public java.util.List<HealthCheckTemplates> getHealthCheckTemplates() {
        return this.healthCheckTemplates;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<HealthCheckTemplates> healthCheckTemplates; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListHealthCheckTemplatesResponseBody model) {
            this.healthCheckTemplates = model.healthCheckTemplates;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of health check templates.</p>
         */
        public Builder healthCheckTemplates(java.util.List<HealthCheckTemplates> healthCheckTemplates) {
            this.healthCheckTemplates = healthCheckTemplates;
            return this;
        }

        /**
         * <p>The number of entries to return per page. Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, no next query is available.</li>
         * <li>If <strong>NextToken</strong> is returned, the value indicates the token for the next query.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>365F4154-92F6-4AE4-92F8-7FF3******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records returned for the current request.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListHealthCheckTemplatesResponseBody build() {
            return new ListHealthCheckTemplatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListHealthCheckTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListHealthCheckTemplatesResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key. The key can be up to 128 characters in length, and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>env</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value. The value can be up to 128 characters in length, and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>product</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListHealthCheckTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListHealthCheckTemplatesResponseBody</p>
     */
    public static class HealthCheckTemplates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HealthCheckCodes")
        private java.util.List<String> healthCheckCodes;

        @com.aliyun.core.annotation.NameInMap("HealthCheckConnectPort")
        private Integer healthCheckConnectPort;

        @com.aliyun.core.annotation.NameInMap("HealthCheckHost")
        private String healthCheckHost;

        @com.aliyun.core.annotation.NameInMap("HealthCheckHttpVersion")
        private String healthCheckHttpVersion;

        @com.aliyun.core.annotation.NameInMap("HealthCheckInterval")
        private Integer healthCheckInterval;

        @com.aliyun.core.annotation.NameInMap("HealthCheckMethod")
        private String healthCheckMethod;

        @com.aliyun.core.annotation.NameInMap("HealthCheckPath")
        private String healthCheckPath;

        @com.aliyun.core.annotation.NameInMap("HealthCheckProtocol")
        private String healthCheckProtocol;

        @com.aliyun.core.annotation.NameInMap("HealthCheckTemplateId")
        private String healthCheckTemplateId;

        @com.aliyun.core.annotation.NameInMap("HealthCheckTemplateName")
        private String healthCheckTemplateName;

        @com.aliyun.core.annotation.NameInMap("HealthCheckTimeout")
        private Integer healthCheckTimeout;

        @com.aliyun.core.annotation.NameInMap("HealthyThreshold")
        private Integer healthyThreshold;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("UnhealthyThreshold")
        private Integer unhealthyThreshold;

        private HealthCheckTemplates(Builder builder) {
            this.healthCheckCodes = builder.healthCheckCodes;
            this.healthCheckConnectPort = builder.healthCheckConnectPort;
            this.healthCheckHost = builder.healthCheckHost;
            this.healthCheckHttpVersion = builder.healthCheckHttpVersion;
            this.healthCheckInterval = builder.healthCheckInterval;
            this.healthCheckMethod = builder.healthCheckMethod;
            this.healthCheckPath = builder.healthCheckPath;
            this.healthCheckProtocol = builder.healthCheckProtocol;
            this.healthCheckTemplateId = builder.healthCheckTemplateId;
            this.healthCheckTemplateName = builder.healthCheckTemplateName;
            this.healthCheckTimeout = builder.healthCheckTimeout;
            this.healthyThreshold = builder.healthyThreshold;
            this.resourceGroupId = builder.resourceGroupId;
            this.tags = builder.tags;
            this.unhealthyThreshold = builder.unhealthyThreshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HealthCheckTemplates create() {
            return builder().build();
        }

        /**
         * @return healthCheckCodes
         */
        public java.util.List<String> getHealthCheckCodes() {
            return this.healthCheckCodes;
        }

        /**
         * @return healthCheckConnectPort
         */
        public Integer getHealthCheckConnectPort() {
            return this.healthCheckConnectPort;
        }

        /**
         * @return healthCheckHost
         */
        public String getHealthCheckHost() {
            return this.healthCheckHost;
        }

        /**
         * @return healthCheckHttpVersion
         */
        public String getHealthCheckHttpVersion() {
            return this.healthCheckHttpVersion;
        }

        /**
         * @return healthCheckInterval
         */
        public Integer getHealthCheckInterval() {
            return this.healthCheckInterval;
        }

        /**
         * @return healthCheckMethod
         */
        public String getHealthCheckMethod() {
            return this.healthCheckMethod;
        }

        /**
         * @return healthCheckPath
         */
        public String getHealthCheckPath() {
            return this.healthCheckPath;
        }

        /**
         * @return healthCheckProtocol
         */
        public String getHealthCheckProtocol() {
            return this.healthCheckProtocol;
        }

        /**
         * @return healthCheckTemplateId
         */
        public String getHealthCheckTemplateId() {
            return this.healthCheckTemplateId;
        }

        /**
         * @return healthCheckTemplateName
         */
        public String getHealthCheckTemplateName() {
            return this.healthCheckTemplateName;
        }

        /**
         * @return healthCheckTimeout
         */
        public Integer getHealthCheckTimeout() {
            return this.healthCheckTimeout;
        }

        /**
         * @return healthyThreshold
         */
        public Integer getHealthyThreshold() {
            return this.healthyThreshold;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        /**
         * @return unhealthyThreshold
         */
        public Integer getUnhealthyThreshold() {
            return this.unhealthyThreshold;
        }

        public static final class Builder {
            private java.util.List<String> healthCheckCodes; 
            private Integer healthCheckConnectPort; 
            private String healthCheckHost; 
            private String healthCheckHttpVersion; 
            private Integer healthCheckInterval; 
            private String healthCheckMethod; 
            private String healthCheckPath; 
            private String healthCheckProtocol; 
            private String healthCheckTemplateId; 
            private String healthCheckTemplateName; 
            private Integer healthCheckTimeout; 
            private Integer healthyThreshold; 
            private String resourceGroupId; 
            private java.util.List<Tags> tags; 
            private Integer unhealthyThreshold; 

            private Builder() {
            } 

            private Builder(HealthCheckTemplates model) {
                this.healthCheckCodes = model.healthCheckCodes;
                this.healthCheckConnectPort = model.healthCheckConnectPort;
                this.healthCheckHost = model.healthCheckHost;
                this.healthCheckHttpVersion = model.healthCheckHttpVersion;
                this.healthCheckInterval = model.healthCheckInterval;
                this.healthCheckMethod = model.healthCheckMethod;
                this.healthCheckPath = model.healthCheckPath;
                this.healthCheckProtocol = model.healthCheckProtocol;
                this.healthCheckTemplateId = model.healthCheckTemplateId;
                this.healthCheckTemplateName = model.healthCheckTemplateName;
                this.healthCheckTimeout = model.healthCheckTimeout;
                this.healthyThreshold = model.healthyThreshold;
                this.resourceGroupId = model.resourceGroupId;
                this.tags = model.tags;
                this.unhealthyThreshold = model.unhealthyThreshold;
            } 

            /**
             * <p>The list of status codes that indicate a successful health check.</p>
             */
            public Builder healthCheckCodes(java.util.List<String> healthCheckCodes) {
                this.healthCheckCodes = healthCheckCodes;
                return this;
            }

            /**
             * <p>The port used for health checks.</p>
             * <p>Valid values: <strong>0</strong> to <strong>65535</strong>.</p>
             * <p>Default value: <strong>0</strong>, which indicates that the port of the backend server is used for health checks.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder healthCheckConnectPort(Integer healthCheckConnectPort) {
                this.healthCheckConnectPort = healthCheckConnectPort;
                return this;
            }

            /**
             * <p>The domain name used for health checks. Valid values:</p>
             * <ul>
             * <li><p><strong>$SERVER_IP</strong> (default): the private IP of the backend server. If you specify an IP address or leave this parameter empty, load balancing uses the private IP of each backend server as the domain name for health checks.</p>
             * </li>
             * <li><p><strong>domain</strong>: The domain name must be 1 to 80 characters in length, and can contain only letters, digits, periods (.), and hyphens (-).</p>
             * </li>
             * </ul>
             * <blockquote>
             * <p>This parameter takes effect only when <code>HealthCheckProtocol</code> is set to <strong>HTTP</strong> or <strong>HTTPS</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>$SERVER_IP</p>
             */
            public Builder healthCheckHost(String healthCheckHost) {
                this.healthCheckHost = healthCheckHost;
                return this;
            }

            /**
             * <p>The HTTP version used for health checks.</p>
             * <p>Valid values: <strong>HTTP 1.0</strong> and <strong>HTTP 1.1</strong>.</p>
             * <p>Default value: <strong>HTTP 1.1</strong>.</p>
             * <blockquote>
             * <p>This parameter takes effect only when <code>HealthCheckProtocol</code> is set to <strong>HTTP</strong> or <strong>HTTPS</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>HTTP 1.0</p>
             */
            public Builder healthCheckHttpVersion(String healthCheckHttpVersion) {
                this.healthCheckHttpVersion = healthCheckHttpVersion;
                return this;
            }

            /**
             * <p>The interval between two consecutive health checks. Unit: seconds. Valid values: <strong>1</strong> to <strong>50</strong>. Default value: <strong>2</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder healthCheckInterval(Integer healthCheckInterval) {
                this.healthCheckInterval = healthCheckInterval;
                return this;
            }

            /**
             * <p>The health check method. Valid values:</p>
             * <ul>
             * <li><p><strong>HEAD</strong> (default): The default method for HTTP and HTTPS health checks.</p>
             * </li>
             * <li><p><strong>GET</strong>: If the length of the response message exceeds 8 KB, the message is truncated. However, the truncation does not affect the health check result.</p>
             * </li>
             * <li><p><strong>POST</strong>: The default method for gRPC health checks.</p>
             * </li>
             * </ul>
             * <blockquote>
             * <p>This parameter takes effect only when <strong>HealthCheckProtocol</strong> is set to <strong>HTTP</strong>, <strong>HTTPS</strong>, or <strong>gRPC</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>HEAD</p>
             */
            public Builder healthCheckMethod(String healthCheckMethod) {
                this.healthCheckMethod = healthCheckMethod;
                return this;
            }

            /**
             * <p>The URL used for health checks.</p>
             * <p>The URL must be 1 to 80 characters in length and can contain only letters, digits, hyphens (-), forward slashes (/), periods (.), percent signs (%), question marks (?), number signs (#), ampersands (&amp;), and the following extended characters: <code>_;~!()*[]@$^:\&quot;,+</code>. The URL must start with a forward slash (/).</p>
             * 
             * <strong>example:</strong>
             * <p>/test/index.html</p>
             */
            public Builder healthCheckPath(String healthCheckPath) {
                this.healthCheckPath = healthCheckPath;
                return this;
            }

            /**
             * <p>The protocol used for health checks. Valid values:</p>
             * <ul>
             * <li><p><strong>HTTP</strong> (default): sends HEAD or GET requests to perform browser access impersonation and check whether the server application is healthy.</p>
             * </li>
             * <li><p><strong>HTTPS</strong>: sends HEAD or GET requests to perform browser access impersonation and check whether the server application is healthy. (With data encryption, it is more secure than HTTP.)</p>
             * </li>
             * <li><p><strong>TCP</strong>: sends SYN handshake messages to check whether the server port is alive.</p>
             * </li>
             * <li><p><strong>gRPC</strong>: sends POST or GET requests to check whether the server application is healthy.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>HTTP</p>
             */
            public Builder healthCheckProtocol(String healthCheckProtocol) {
                this.healthCheckProtocol = healthCheckProtocol;
                return this;
            }

            /**
             * <p>The health check template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>hct-bp1qjwo61pqz3ahltv****</p>
             */
            public Builder healthCheckTemplateId(String healthCheckTemplateId) {
                this.healthCheckTemplateId = healthCheckTemplateId;
                return this;
            }

            /**
             * <p>The health check template name.</p>
             * <p>The name must be 2 to 128 characters in length, and must start with a letter or a Chinese character. It can contain digits, periods (.), underscores (_), and hyphens (-).</p>
             * 
             * <strong>example:</strong>
             * <p>HealthCheckTemplate1</p>
             */
            public Builder healthCheckTemplateName(String healthCheckTemplateName) {
                this.healthCheckTemplateName = healthCheckTemplateName;
                return this;
            }

            /**
             * <p>The timeout period for receiving a response from a health check. If the backend ECS instance does not return a correct response within the specified timeout period, the health check is considered failed.</p>
             * <p>Valid values: <strong>1</strong> to <strong>300</strong>. Unit: seconds.</p>
             * <p>Default value: <strong>5</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder healthCheckTimeout(Integer healthCheckTimeout) {
                this.healthCheckTimeout = healthCheckTimeout;
                return this;
            }

            /**
             * <p>The number of consecutive successful health checks required to change the health check status of a backend server from <strong>Failed</strong> to <strong>Successful</strong>.</p>
             * <p>Valid values: <strong>2</strong> to <strong>10</strong>.</p>
             * <p>Default value: <strong>3</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder healthyThreshold(Integer healthyThreshold) {
                this.healthyThreshold = healthyThreshold;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-atstuj3rtop****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The tags.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The number of consecutive failed health checks required to change the health check status of a backend server from <strong>Successful</strong> to <strong>Failed</strong>.</p>
             * <p>Valid values: <strong>2</strong> to <strong>10</strong>.</p>
             * <p>Default value: <strong>3</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder unhealthyThreshold(Integer unhealthyThreshold) {
                this.unhealthyThreshold = unhealthyThreshold;
                return this;
            }

            public HealthCheckTemplates build() {
                return new HealthCheckTemplates(this);
            } 

        } 

    }
}
