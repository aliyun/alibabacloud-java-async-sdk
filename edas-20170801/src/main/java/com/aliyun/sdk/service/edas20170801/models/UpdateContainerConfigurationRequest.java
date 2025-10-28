// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link UpdateContainerConfigurationRequest} extends {@link RequestModel}
 *
 * <p>UpdateContainerConfigurationRequest</p>
 */
public class UpdateContainerConfigurationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContextPath")
    private String contextPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HttpPort")
    private Integer httpPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxThreads")
    private Integer maxThreads;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("URIEncoding")
    private String URIEncoding;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseBodyEncoding")
    private Boolean useBodyEncoding;

    private UpdateContainerConfigurationRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.contextPath = builder.contextPath;
        this.groupId = builder.groupId;
        this.httpPort = builder.httpPort;
        this.maxThreads = builder.maxThreads;
        this.URIEncoding = builder.URIEncoding;
        this.useBodyEncoding = builder.useBodyEncoding;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateContainerConfigurationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return contextPath
     */
    public String getContextPath() {
        return this.contextPath;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return httpPort
     */
    public Integer getHttpPort() {
        return this.httpPort;
    }

    /**
     * @return maxThreads
     */
    public Integer getMaxThreads() {
        return this.maxThreads;
    }

    /**
     * @return URIEncoding
     */
    public String getURIEncoding() {
        return this.URIEncoding;
    }

    /**
     * @return useBodyEncoding
     */
    public Boolean getUseBodyEncoding() {
        return this.useBodyEncoding;
    }

    public static final class Builder extends Request.Builder<UpdateContainerConfigurationRequest, Builder> {
        private String appId; 
        private String contextPath; 
        private String groupId; 
        private Integer httpPort; 
        private Integer maxThreads; 
        private String URIEncoding; 
        private Boolean useBodyEncoding; 

        private Builder() {
            super();
        } 

        private Builder(UpdateContainerConfigurationRequest request) {
            super(request);
            this.appId = request.appId;
            this.contextPath = request.contextPath;
            this.groupId = request.groupId;
            this.httpPort = request.httpPort;
            this.maxThreads = request.maxThreads;
            this.URIEncoding = request.URIEncoding;
            this.useBodyEncoding = request.useBodyEncoding;
        } 

        /**
         * <p>The ID of the application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c627c157-560d-43ff-************</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The context path of the Tomcat container. The context path can be an empty string, a null WAR package name, a root directory, or other custom non-empty strings. It can contain letters, digits, hyphens (-), and underscores (_). Take note of the following items:</p>
         * <ul>
         * <li>If this parameter is not specified when you configure the application instance group, the configuration of the application is applied.</li>
         * <li>If this parameter is not specified when you configure the Tomcat container for an application, the root directory <code>/</code> is used.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        public Builder contextPath(String contextPath) {
            this.putQueryParameter("ContextPath", contextPath);
            this.contextPath = contextPath;
            return this;
        }

        /**
         * <p>The ID of the application instance group.</p>
         * <ul>
         * <li>If an ID is specified, this operation configures the Tomcat container for the specified application instance group.</li>
         * <li>If you set this parameter to &quot;&quot;, this operation configures the Tomcat container for the application.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>8123db90-880f-**************</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The application port number for the Tomcat container. Take note of the following items:</p>
         * <ul>
         * <li>If this parameter is not specified when you configure the application instance group, the configuration of the application is applied.</li>
         * <li>If this parameter is not specified when you configure the application, the default port 8080 is applied.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        public Builder httpPort(Integer httpPort) {
            this.putQueryParameter("HttpPort", httpPort);
            this.httpPort = httpPort;
            return this;
        }

        /**
         * <p>The maximum number of threads. Take note of the following items:</p>
         * <ul>
         * <li>If this parameter is not specified when you configure the application instance group, the configuration of the application is applied.</li>
         * <li>If this parameter is not specified when you configure the application, the default value 250 is applied.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxThreads(Integer maxThreads) {
            this.putQueryParameter("MaxThreads", maxThreads);
            this.maxThreads = maxThreads;
            return this;
        }

        /**
         * <p>The uniform resource identifier (URI) encoding scheme. Valid values: ISO-8859-1, GBK, GB2312, and UTF-8. Take note of the following items:</p>
         * <ul>
         * <li>If this parameter is not specified when you configure the application instance group, the configuration of the application is applied.</li>
         * <li>If this parameter is not specified when you configure the application, the default URI encoding scheme in the Tomcat container is applied.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ISO-8859-1</p>
         */
        public Builder URIEncoding(String URIEncoding) {
            this.putQueryParameter("URIEncoding", URIEncoding);
            this.URIEncoding = URIEncoding;
            return this;
        }

        /**
         * <p>Specifies whether to use the encoding scheme specified in the request body for URI query parameters. Take note of the following items:</p>
         * <ul>
         * <li>If this parameter is not specified when you configure the application instance group, the configuration of the application is applied.</li>
         * <li>If this parameter is not specified when you configure the application, the default value false is applied.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder useBodyEncoding(Boolean useBodyEncoding) {
            this.putQueryParameter("UseBodyEncoding", useBodyEncoding);
            this.useBodyEncoding = useBodyEncoding;
            return this;
        }

        @Override
        public UpdateContainerConfigurationRequest build() {
            return new UpdateContainerConfigurationRequest(this);
        } 

    } 

}
