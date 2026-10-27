// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link DescribeOpenSearchConnectionInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOpenSearchConnectionInfoResponseBody</p>
 */
public class DescribeOpenSearchConnectionInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private AccessDeniedDetail accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeOpenSearchConnectionInfoResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOpenSearchConnectionInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public AccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AccessDeniedDetail accessDeniedDetail; 
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeOpenSearchConnectionInfoResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the access denial.</p>
         */
        public Builder accessDeniedDetail(AccessDeniedDetail accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The data struct.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>9B2F3840-5C98-475C-B269-2D5C3A31797C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeOpenSearchConnectionInfoResponseBody build() {
            return new DescribeOpenSearchConnectionInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeOpenSearchConnectionInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOpenSearchConnectionInfoResponseBody</p>
     */
    public static class AccessDeniedDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthAction")
        private String authAction;

        @com.aliyun.core.annotation.NameInMap("AuthPrincipalDisplayName")
        private String authPrincipalDisplayName;

        @com.aliyun.core.annotation.NameInMap("AuthPrincipalOwnerId")
        private String authPrincipalOwnerId;

        @com.aliyun.core.annotation.NameInMap("AuthPrincipalType")
        private String authPrincipalType;

        @com.aliyun.core.annotation.NameInMap("EncodedDiagnosticMessage")
        private String encodedDiagnosticMessage;

        @com.aliyun.core.annotation.NameInMap("NoPermissionType")
        private String noPermissionType;

        @com.aliyun.core.annotation.NameInMap("PolicyType")
        private String policyType;

        private AccessDeniedDetail(Builder builder) {
            this.authAction = builder.authAction;
            this.authPrincipalDisplayName = builder.authPrincipalDisplayName;
            this.authPrincipalOwnerId = builder.authPrincipalOwnerId;
            this.authPrincipalType = builder.authPrincipalType;
            this.encodedDiagnosticMessage = builder.encodedDiagnosticMessage;
            this.noPermissionType = builder.noPermissionType;
            this.policyType = builder.policyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessDeniedDetail create() {
            return builder().build();
        }

        /**
         * @return authAction
         */
        public String getAuthAction() {
            return this.authAction;
        }

        /**
         * @return authPrincipalDisplayName
         */
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        /**
         * @return authPrincipalOwnerId
         */
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        /**
         * @return authPrincipalType
         */
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        /**
         * @return encodedDiagnosticMessage
         */
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        /**
         * @return noPermissionType
         */
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        /**
         * @return policyType
         */
        public String getPolicyType() {
            return this.policyType;
        }

        public static final class Builder {
            private String authAction; 
            private String authPrincipalDisplayName; 
            private String authPrincipalOwnerId; 
            private String authPrincipalType; 
            private String encodedDiagnosticMessage; 
            private String noPermissionType; 
            private String policyType; 

            private Builder() {
            } 

            private Builder(AccessDeniedDetail model) {
                this.authAction = model.authAction;
                this.authPrincipalDisplayName = model.authPrincipalDisplayName;
                this.authPrincipalOwnerId = model.authPrincipalOwnerId;
                this.authPrincipalType = model.authPrincipalType;
                this.encodedDiagnosticMessage = model.encodedDiagnosticMessage;
                this.noPermissionType = model.noPermissionType;
                this.policyType = model.policyType;
            } 

            /**
             * <p>The authentication action.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder authAction(String authAction) {
                this.authAction = authAction;
                return this;
            }

            /**
             * <p>The display name of the authentication principal.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder authPrincipalDisplayName(String authPrincipalDisplayName) {
                this.authPrincipalDisplayName = authPrincipalDisplayName;
                return this;
            }

            /**
             * <p>The owner ID of the authentication principal.</p>
             * 
             * <strong>example:</strong>
             * <p>111</p>
             */
            public Builder authPrincipalOwnerId(String authPrincipalOwnerId) {
                this.authPrincipalOwnerId = authPrincipalOwnerId;
                return this;
            }

            /**
             * <p>The description is the same as above.</p>
             * 
             * <strong>example:</strong>
             * <p>222</p>
             */
            public Builder authPrincipalType(String authPrincipalType) {
                this.authPrincipalType = authPrincipalType;
                return this;
            }

            /**
             * <p>The diagnostic information.</p>
             * 
             * <strong>example:</strong>
             * <p>AQEAAAAAaKPfwjY0MzMyODRGLUZCQkQtNTA1RS04MUUxLTc5NTkzODk2MUIzMg==</p>
             */
            public Builder encodedDiagnosticMessage(String encodedDiagnosticMessage) {
                this.encodedDiagnosticMessage = encodedDiagnosticMessage;
                return this;
            }

            /**
             * <p>NoPermissionType</p>
             * 
             * <strong>example:</strong>
             * <p>ImplicitDeny</p>
             */
            public Builder noPermissionType(String noPermissionType) {
                this.noPermissionType = noPermissionType;
                return this;
            }

            /**
             * <p>The policy type.</p>
             * 
             * <strong>example:</strong>
             * <p>PRIORITY</p>
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            public AccessDeniedDetail build() {
                return new AccessDeniedDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeOpenSearchConnectionInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOpenSearchConnectionInfoResponseBody</p>
     */
    public static class DashboardEndpoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private DashboardEndpoint(Builder builder) {
            this.enabled = builder.enabled;
            this.host = builder.host;
            this.port = builder.port;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DashboardEndpoint create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private Boolean enabled; 
            private String host; 
            private Integer port; 
            private String url; 

            private Builder() {
            } 

            private Builder(DashboardEndpoint model) {
                this.enabled = model.enabled;
                this.host = model.host;
                this.port = model.port;
                this.url = model.url;
            } 

            /**
             * <p>Specifies whether static frame check is enabled. Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The host address.</p>
             * 
             * <strong>example:</strong>
             * <p>100.118.102.0/24</p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>The port.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://static.yipigai.cn/timuocr/tmp_c29e30497575a40193a24a7a83654e30e21b951cc6856cdb.jpg">https://static.yipigai.cn/timuocr/tmp_c29e30497575a40193a24a7a83654e30e21b951cc6856cdb.jpg</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public DashboardEndpoint build() {
                return new DashboardEndpoint(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeOpenSearchConnectionInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOpenSearchConnectionInfoResponseBody</p>
     */
    public static class DashboardPublicEndpoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private DashboardPublicEndpoint(Builder builder) {
            this.enabled = builder.enabled;
            this.host = builder.host;
            this.port = builder.port;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DashboardPublicEndpoint create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private Boolean enabled; 
            private String host; 
            private Integer port; 
            private String url; 

            private Builder() {
            } 

            private Builder(DashboardPublicEndpoint model) {
                this.enabled = model.enabled;
                this.host = model.host;
                this.port = model.port;
                this.url = model.url;
            } 

            /**
             * <p>The service activation status. Valid values:</p>
             * <ul>
             * <li><strong>on</strong>: Activated.</li>
             * <li><strong>off</strong>: Not activated.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The hostname. Retrieves data under the specified host.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://secnet-defense-vastip.oss-cn-hangzhou.aliyuncs.com">https://secnet-defense-vastip.oss-cn-hangzhou.aliyuncs.com</a></p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>The port.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://static.yipigai.cn/timuocr/tmp_c29e30497575a40193a24a7a83654e30e21b951cc6856cdb.jpg">https://static.yipigai.cn/timuocr/tmp_c29e30497575a40193a24a7a83654e30e21b951cc6856cdb.jpg</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public DashboardPublicEndpoint build() {
                return new DashboardPublicEndpoint(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeOpenSearchConnectionInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOpenSearchConnectionInfoResponseBody</p>
     */
    public static class PrivateEndpoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        private PrivateEndpoint(Builder builder) {
            this.enabled = builder.enabled;
            this.host = builder.host;
            this.port = builder.port;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivateEndpoint create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        public static final class Builder {
            private Boolean enabled; 
            private String host; 
            private Integer port; 

            private Builder() {
            } 

            private Builder(PrivateEndpoint model) {
                this.enabled = model.enabled;
                this.host = model.host;
                this.port = model.port;
            } 

            /**
             * <p>Specifies whether to enable the echo feature. This parameter is required. Valid values: true/false.</p>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The OSS domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>100.118.214.0/24</p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>The port.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            public PrivateEndpoint build() {
                return new PrivateEndpoint(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeOpenSearchConnectionInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOpenSearchConnectionInfoResponseBody</p>
     */
    public static class PublicEndpoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        private PublicEndpoint(Builder builder) {
            this.enabled = builder.enabled;
            this.host = builder.host;
            this.port = builder.port;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublicEndpoint create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        public static final class Builder {
            private Boolean enabled; 
            private String host; 
            private Integer port; 

            private Builder() {
            } 

            private Builder(PublicEndpoint model) {
                this.enabled = model.enabled;
                this.host = model.host;
                this.port = model.port;
            } 

            /**
             * <p>Specifies whether to enable dead-letter message delivery.</p>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The machine.</p>
             * 
             * <strong>example:</strong>
             * <p>100.98.83.0/24</p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>The port.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            public PublicEndpoint build() {
                return new PublicEndpoint(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeOpenSearchConnectionInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOpenSearchConnectionInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DashboardEndpoint")
        private DashboardEndpoint dashboardEndpoint;

        @com.aliyun.core.annotation.NameInMap("DashboardPublicEndpoint")
        private DashboardPublicEndpoint dashboardPublicEndpoint;

        @com.aliyun.core.annotation.NameInMap("DefaultUsername")
        private String defaultUsername;

        @com.aliyun.core.annotation.NameInMap("PrivateEndpoint")
        private PrivateEndpoint privateEndpoint;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("PublicEndpoint")
        private PublicEndpoint publicEndpoint;

        private Data(Builder builder) {
            this.dashboardEndpoint = builder.dashboardEndpoint;
            this.dashboardPublicEndpoint = builder.dashboardPublicEndpoint;
            this.defaultUsername = builder.defaultUsername;
            this.privateEndpoint = builder.privateEndpoint;
            this.protocol = builder.protocol;
            this.publicEndpoint = builder.publicEndpoint;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dashboardEndpoint
         */
        public DashboardEndpoint getDashboardEndpoint() {
            return this.dashboardEndpoint;
        }

        /**
         * @return dashboardPublicEndpoint
         */
        public DashboardPublicEndpoint getDashboardPublicEndpoint() {
            return this.dashboardPublicEndpoint;
        }

        /**
         * @return defaultUsername
         */
        public String getDefaultUsername() {
            return this.defaultUsername;
        }

        /**
         * @return privateEndpoint
         */
        public PrivateEndpoint getPrivateEndpoint() {
            return this.privateEndpoint;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return publicEndpoint
         */
        public PublicEndpoint getPublicEndpoint() {
            return this.publicEndpoint;
        }

        public static final class Builder {
            private DashboardEndpoint dashboardEndpoint; 
            private DashboardPublicEndpoint dashboardPublicEndpoint; 
            private String defaultUsername; 
            private PrivateEndpoint privateEndpoint; 
            private String protocol; 
            private PublicEndpoint publicEndpoint; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.dashboardEndpoint = model.dashboardEndpoint;
                this.dashboardPublicEndpoint = model.dashboardPublicEndpoint;
                this.defaultUsername = model.defaultUsername;
                this.privateEndpoint = model.privateEndpoint;
                this.protocol = model.protocol;
                this.publicEndpoint = model.publicEndpoint;
            } 

            /**
             * <p>The internal endpoint of the OpenSearch Dashboard.</p>
             */
            public Builder dashboardEndpoint(DashboardEndpoint dashboardEndpoint) {
                this.dashboardEndpoint = dashboardEndpoint;
                return this;
            }

            /**
             * <p>The public network access endpoint of the OpenSearch Dashboard.</p>
             */
            public Builder dashboardPublicEndpoint(DashboardPublicEndpoint dashboardPublicEndpoint) {
                this.dashboardPublicEndpoint = dashboardPublicEndpoint;
                return this;
            }

            /**
             * <p>The default account name of OpenSearch.</p>
             * 
             * <strong>example:</strong>
             * <p>elastic</p>
             */
            public Builder defaultUsername(String defaultUsername) {
                this.defaultUsername = defaultUsername;
                return this;
            }

            /**
             * <p>The VPC endpoint of the instance.</p>
             */
            public Builder privateEndpoint(PrivateEndpoint privateEndpoint) {
                this.privateEndpoint = privateEndpoint;
                return this;
            }

            /**
             * <p>The protocol of the monitoring task. Valid values:</p>
             * <ul>
             * <li><strong>ICMP</strong>.</li>
             * <li><strong>TCP</strong>.</li>
             * <li><strong>HTTP</strong>.</li>
             * </ul>
             * <blockquote>
             * <p>Private network monitoring supports only the ICMP and TCP protocols.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>HTTP</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The public endpoint of the instance.</p>
             */
            public Builder publicEndpoint(PublicEndpoint publicEndpoint) {
                this.publicEndpoint = publicEndpoint;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
