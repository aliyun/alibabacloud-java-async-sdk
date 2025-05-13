// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link DescribeApplicationGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApplicationGroupsResponseBody</p>
 */
public class DescribeApplicationGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TraceId")
    private String traceId;

    private DescribeApplicationGroupsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApplicationGroupsResponseBody create() {
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
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
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

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private String errorCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        private Builder() {
        } 

        private Builder(DescribeApplicationGroupsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.traceId = model.traceId;
        } 

        /**
         * <p>The HTTP status code. Valid values:</p>
         * <ul>
         * <li><strong>2xx</strong>: indicates that the request was successful.</li>
         * <li><strong>3xx</strong>: indicates that the request was redirected.</li>
         * <li><strong>4xx</strong>: indicates that the request was invalid.</li>
         * <li><strong>5xx</strong>: indicates that a server error occurred.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The information about the instance groups of the application.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * <ul>
         * <li>The <strong>ErrorCode</strong> parameter is not returned when the request succeeds.</li>
         * <li>The <strong>ErrorCode</strong> parameter is returned when the request fails. For more information, see <strong>Error codes</strong> in this topic.</li>
         * </ul>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the information about instance groups of an application was obtained. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: indicates that the information was obtained.</li>
         * <li><strong>false</strong>: indicates that the information could not be obtained.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The ID of the trace. It is used to query the details of a request.</p>
         * 
         * <strong>example:</strong>
         * <p>0a98a02315955564772843261e****</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public DescribeApplicationGroupsResponseBody build() {
            return new DescribeApplicationGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApplicationGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationGroupsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EdasContainerVersion")
        private String edasContainerVersion;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("GroupType")
        private Integer groupType;

        @com.aliyun.core.annotation.NameInMap("ImageUrl")
        private String imageUrl;

        @com.aliyun.core.annotation.NameInMap("Jdk")
        private String jdk;

        @com.aliyun.core.annotation.NameInMap("PackageType")
        private String packageType;

        @com.aliyun.core.annotation.NameInMap("PackageUrl")
        private String packageUrl;

        @com.aliyun.core.annotation.NameInMap("PackageVersion")
        private String packageVersion;

        @com.aliyun.core.annotation.NameInMap("PackageVersionId")
        private String packageVersionId;

        @com.aliyun.core.annotation.NameInMap("Replicas")
        private Integer replicas;

        @com.aliyun.core.annotation.NameInMap("RunningInstances")
        private Integer runningInstances;

        @com.aliyun.core.annotation.NameInMap("WebContainer")
        private String webContainer;

        private Data(Builder builder) {
            this.edasContainerVersion = builder.edasContainerVersion;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.groupType = builder.groupType;
            this.imageUrl = builder.imageUrl;
            this.jdk = builder.jdk;
            this.packageType = builder.packageType;
            this.packageUrl = builder.packageUrl;
            this.packageVersion = builder.packageVersion;
            this.packageVersionId = builder.packageVersionId;
            this.replicas = builder.replicas;
            this.runningInstances = builder.runningInstances;
            this.webContainer = builder.webContainer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return edasContainerVersion
         */
        public String getEdasContainerVersion() {
            return this.edasContainerVersion;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return groupType
         */
        public Integer getGroupType() {
            return this.groupType;
        }

        /**
         * @return imageUrl
         */
        public String getImageUrl() {
            return this.imageUrl;
        }

        /**
         * @return jdk
         */
        public String getJdk() {
            return this.jdk;
        }

        /**
         * @return packageType
         */
        public String getPackageType() {
            return this.packageType;
        }

        /**
         * @return packageUrl
         */
        public String getPackageUrl() {
            return this.packageUrl;
        }

        /**
         * @return packageVersion
         */
        public String getPackageVersion() {
            return this.packageVersion;
        }

        /**
         * @return packageVersionId
         */
        public String getPackageVersionId() {
            return this.packageVersionId;
        }

        /**
         * @return replicas
         */
        public Integer getReplicas() {
            return this.replicas;
        }

        /**
         * @return runningInstances
         */
        public Integer getRunningInstances() {
            return this.runningInstances;
        }

        /**
         * @return webContainer
         */
        public String getWebContainer() {
            return this.webContainer;
        }

        public static final class Builder {
            private String edasContainerVersion; 
            private String groupId; 
            private String groupName; 
            private Integer groupType; 
            private String imageUrl; 
            private String jdk; 
            private String packageType; 
            private String packageUrl; 
            private String packageVersion; 
            private String packageVersionId; 
            private Integer replicas; 
            private Integer runningInstances; 
            private String webContainer; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.edasContainerVersion = model.edasContainerVersion;
                this.groupId = model.groupId;
                this.groupName = model.groupName;
                this.groupType = model.groupType;
                this.imageUrl = model.imageUrl;
                this.jdk = model.jdk;
                this.packageType = model.packageType;
                this.packageUrl = model.packageUrl;
                this.packageVersion = model.packageVersion;
                this.packageVersionId = model.packageVersionId;
                this.replicas = model.replicas;
                this.runningInstances = model.runningInstances;
                this.webContainer = model.webContainer;
            } 

            /**
             * <p>The version of the container, such as Ali-Tomcat, in which a High-speed Service Framework (HSF) application runs.</p>
             * 
             * <strong>example:</strong>
             * <p>3.5.3</p>
             */
            public Builder edasContainerVersion(String edasContainerVersion) {
                this.edasContainerVersion = edasContainerVersion;
                return this;
            }

            /**
             * <p>The ID of the group.</p>
             * 
             * <strong>example:</strong>
             * <p>b2a8a925-477a-eswa-b823-d5e22500****</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The name of the group.</p>
             * 
             * <strong>example:</strong>
             * <p>_DEFAULT_GROUP</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The type of the group.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder groupType(Integer groupType) {
                this.groupType = groupType;
                return this;
            }

            /**
             * <p>The address of the image. This parameter is required when the <strong>PackageType</strong> parameter is set to <strong>Image</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>registry-vpc.cn-hangzhou.aliyuncs.com/demo/nginx:latest</p>
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * <p>The version of the Java development kit (JDK) on which the deployment package of the application depends. This parameter is invalid when the <strong>PackageType</strong> parameter is set to <strong>Image</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>Open JDK 8</p>
             */
            public Builder jdk(String jdk) {
                this.jdk = jdk;
                return this;
            }

            /**
             * <p>The type of the application deployment package. Valid values:</p>
             * <ul>
             * <li><p>When you use a Java package, set this value to <strong>FatJar</strong>, <strong>War</strong>, or <strong>Image</strong>.</p>
             * </li>
             * <li><p>When you use a PHP package, the following values are valid:</p>
             * <ul>
             * <li><strong>PhpZip</strong></li>
             * <li><strong>IMAGE_PHP_5_4</strong></li>
             * <li><strong>IMAGE_PHP_5_4_ALPINE</strong></li>
             * <li><strong>IMAGE_PHP_5_5</strong></li>
             * <li><strong>IMAGE_PHP_5_5_ALPINE</strong></li>
             * <li><strong>IMAGE_PHP_5_6</strong></li>
             * <li><strong>IMAGE_PHP_5_6_ALPINE</strong></li>
             * <li><strong>IMAGE_PHP_7_0</strong></li>
             * <li><strong>IMAGE_PHP_7_0_ALPINE</strong></li>
             * <li><strong>IMAGE_PHP_7_1</strong></li>
             * <li><strong>IMAGE_PHP_7_1_ALPINE</strong></li>
             * <li><strong>IMAGE_PHP_7_2</strong></li>
             * <li><strong>IMAGE_PHP_7_2_ALPINE</strong></li>
             * <li><strong>IMAGE_PHP_7_3</strong></li>
             * <li><strong>IMAGE_PHP_7_3_ALPINE</strong></li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Image</p>
             */
            public Builder packageType(String packageType) {
                this.packageType = packageType;
                return this;
            }

            /**
             * <p>The address of the deployment package. This parameter is required when the <strong>PackageType</strong> parameter is set to <strong>FatJar</strong>, <strong>War</strong>, or <strong>PhpZip</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>registry-vpc.cn-hangzhou.aliyuncs.com/demo/nginx:latest</p>
             */
            public Builder packageUrl(String packageUrl) {
                this.packageUrl = packageUrl;
                return this;
            }

            /**
             * <p>The version of the deployment package. This parameter is required when the <strong>PackageType</strong> parameter is set to <strong>FatJar</strong>, <strong>War</strong>, or <strong>PhpZip</strong>. The parameter value will be automatically generated when you use an image to deploy the application and specify the <strong>ImageUrl</strong> parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder packageVersion(String packageVersion) {
                this.packageVersion = packageVersion;
                return this;
            }

            /**
             * PackageVersionId.
             */
            public Builder packageVersionId(String packageVersionId) {
                this.packageVersionId = packageVersionId;
                return this;
            }

            /**
             * <p>The total number of instances.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder replicas(Integer replicas) {
                this.replicas = replicas;
                return this;
            }

            /**
             * <p>The number of running instances.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder runningInstances(Integer runningInstances) {
                this.runningInstances = runningInstances;
                return this;
            }

            /**
             * <p>The version of the Apache Tomcat container on which the deployment package of the application depends. This parameter is invalid when the <strong>PackageType</strong> parameter is set to <strong>Image</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>Apache Tomcat 7</p>
             */
            public Builder webContainer(String webContainer) {
                this.webContainer = webContainer;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
