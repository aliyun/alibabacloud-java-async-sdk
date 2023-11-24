// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApplicationGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApplicationGroupsResponseBody</p>
 */
public class DescribeApplicationGroupsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TraceId")
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

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
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
        private java.util.List < Data> data; 
        private String errorCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        /**
         * The HTTP status code. Valid values:
         * <p>
         * 
         * *   **2xx**: indicates that the request was successful.
         * *   **3xx**: indicates that the request was redirected.
         * *   **4xx**: indicates that the request was invalid.
         * *   **5xx**: indicates that a server error occurred.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The information about the instance groups of the application.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The error code.
         * <p>
         * 
         * *   The **ErrorCode** parameter is not returned when the request succeeds.
         * *   The **ErrorCode** parameter is returned when the request fails. For more information, see **Error codes** in this topic.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the information about instance groups of an application was obtained. Valid values:
         * <p>
         * 
         * *   **true**: indicates that the information was obtained.
         * *   **false**: indicates that the information could not be obtained.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The ID of the trace. It is used to query the details of a request.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public DescribeApplicationGroupsResponseBody build() {
            return new DescribeApplicationGroupsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("EdasContainerVersion")
        private String edasContainerVersion;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("GroupType")
        private Integer groupType;

        @NameInMap("ImageUrl")
        private String imageUrl;

        @NameInMap("Jdk")
        private String jdk;

        @NameInMap("PackageType")
        private String packageType;

        @NameInMap("PackageUrl")
        private String packageUrl;

        @NameInMap("PackageVersion")
        private String packageVersion;

        @NameInMap("Replicas")
        private Integer replicas;

        @NameInMap("RunningInstances")
        private Integer runningInstances;

        @NameInMap("WebContainer")
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
            private Integer replicas; 
            private Integer runningInstances; 
            private String webContainer; 

            /**
             * The version of the container, such as Ali-Tomcat, in which a High-speed Service Framework (HSF) application runs.
             */
            public Builder edasContainerVersion(String edasContainerVersion) {
                this.edasContainerVersion = edasContainerVersion;
                return this;
            }

            /**
             * The ID of the group.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The name of the group.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * The type of the group.
             */
            public Builder groupType(Integer groupType) {
                this.groupType = groupType;
                return this;
            }

            /**
             * The address of the image. This parameter is required when the **PackageType** parameter is set to **Image**.
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * The version of the Java development kit (JDK) on which the deployment package of the application depends. This parameter is invalid when the **PackageType** parameter is set to **Image**.
             */
            public Builder jdk(String jdk) {
                this.jdk = jdk;
                return this;
            }

            /**
             * The type of the application deployment package. Valid values:
             * <p>
             * 
             * *   When you use a Java package, set this value to **FatJar**, **War**, or **Image**.
             * 
             * *   When you use a PHP package, the following values are valid:
             * 
             *     *   **PhpZip**
             *     *   **IMAGE_PHP\_5\_4**
             *     *   **IMAGE_PHP\_5\_4\_ALPINE**
             *     *   **IMAGE_PHP\_5\_5**
             *     *   **IMAGE_PHP\_5\_5\_ALPINE**
             *     *   **IMAGE_PHP\_5\_6**
             *     *   **IMAGE_PHP\_5\_6\_ALPINE**
             *     *   **IMAGE_PHP\_7\_0**
             *     *   **IMAGE_PHP\_7\_0\_ALPINE**
             *     *   **IMAGE_PHP\_7\_1**
             *     *   **IMAGE_PHP\_7\_1\_ALPINE**
             *     *   **IMAGE_PHP\_7\_2**
             *     *   **IMAGE_PHP\_7\_2\_ALPINE**
             *     *   **IMAGE_PHP\_7\_3**
             *     *   **IMAGE_PHP\_7\_3\_ALPINE**
             */
            public Builder packageType(String packageType) {
                this.packageType = packageType;
                return this;
            }

            /**
             * The address of the deployment package. This parameter is required when the **PackageType** parameter is set to **FatJar**, **War**, or **PhpZip**.
             */
            public Builder packageUrl(String packageUrl) {
                this.packageUrl = packageUrl;
                return this;
            }

            /**
             * The version of the deployment package. This parameter is required when the **PackageType** parameter is set to **FatJar**, **War**, or **PhpZip**. The parameter value will be automatically generated when you use an image to deploy the application and specify the **ImageUrl** parameter.
             */
            public Builder packageVersion(String packageVersion) {
                this.packageVersion = packageVersion;
                return this;
            }

            /**
             * The total number of instances.
             */
            public Builder replicas(Integer replicas) {
                this.replicas = replicas;
                return this;
            }

            /**
             * The number of running instances.
             */
            public Builder runningInstances(Integer runningInstances) {
                this.runningInstances = runningInstances;
                return this;
            }

            /**
             * The version of the Apache Tomcat container on which the deployment package of the application depends. This parameter is invalid when the **PackageType** parameter is set to **Image**.
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
