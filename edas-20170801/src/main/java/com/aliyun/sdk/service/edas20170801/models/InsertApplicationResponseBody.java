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
 * {@link InsertApplicationResponseBody} extends {@link TeaModel}
 *
 * <p>InsertApplicationResponseBody</p>
 */
public class InsertApplicationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationInfo")
    private ApplicationInfo applicationInfo;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private InsertApplicationResponseBody(Builder builder) {
        this.applicationInfo = builder.applicationInfo;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InsertApplicationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationInfo
     */
    public ApplicationInfo getApplicationInfo() {
        return this.applicationInfo;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
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

    public static final class Builder {
        private ApplicationInfo applicationInfo; 
        private Integer code; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(InsertApplicationResponseBody model) {
            this.applicationInfo = model.applicationInfo;
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the created application.</p>
         */
        public Builder applicationInfo(ApplicationInfo applicationInfo) {
            this.applicationInfo = applicationInfo;
            return this;
        }

        /**
         * <p>The HTTP status code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The message that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>The application name test-hsy-C5039-paas-6 had been created successfully.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>4264F69C-686C-4107-B493-0599C8xxxxxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public InsertApplicationResponseBody build() {
            return new InsertApplicationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link InsertApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>InsertApplicationResponseBody</p>
     */
    public static class ApplicationInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("ChangeOrderId")
        private String changeOrderId;

        @com.aliyun.core.annotation.NameInMap("Dockerize")
        private Boolean dockerize;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("RegionName")
        private String regionName;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private ApplicationInfo(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.changeOrderId = builder.changeOrderId;
            this.dockerize = builder.dockerize;
            this.owner = builder.owner;
            this.port = builder.port;
            this.regionName = builder.regionName;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicationInfo create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return changeOrderId
         */
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

        /**
         * @return dockerize
         */
        public Boolean getDockerize() {
            return this.dockerize;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return regionName
         */
        public String getRegionName() {
            return this.regionName;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String appId; 
            private String appName; 
            private String changeOrderId; 
            private Boolean dockerize; 
            private String owner; 
            private Integer port; 
            private String regionName; 
            private String userId; 

            private Builder() {
            } 

            private Builder(ApplicationInfo model) {
                this.appId = model.appId;
                this.appName = model.appName;
                this.changeOrderId = model.changeOrderId;
                this.dockerize = model.dockerize;
                this.owner = model.owner;
                this.port = model.port;
                this.regionName = model.regionName;
                this.userId = model.userId;
            } 

            /**
             * <p>The ID of the application. The ID is the unique identifier of the application in EDAS.</p>
             * 
             * <strong>example:</strong>
             * <p>6c733bcd-6efb-47a1-8226-cf722c******</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>hello-edas-test-1</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The ID of the change process.</p>
             * 
             * <strong>example:</strong>
             * <p>d0cf569e-dce3-4efb-<strong><strong>-08b70021</strong></strong></p>
             */
            public Builder changeOrderId(String changeOrderId) {
                this.changeOrderId = changeOrderId;
                return this;
            }

            /**
             * <p>Indicates whether the application is a Docker application. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The application is a Docker application.</li>
             * <li><strong>false</strong>: The application is not a Docker application.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder dockerize(Boolean dockerize) {
                this.dockerize = dockerize;
                return this;
            }

            /**
             * <p>The owner of the application. The owner is the user who created the application.</p>
             * 
             * <strong>example:</strong>
             * <p>249763358688********</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The port used by the created application. Default value: 8080. You can call the UpdateContainerConfiguration operation to change the port. For more information, see <a href="https://help.aliyun.com/document_detail/149403.html">UpdateContainerConfiguration</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>8080</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The name of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionName(String regionName) {
                this.regionName = regionName;
                return this;
            }

            /**
             * <p>The ID of the user who created the application.</p>
             * 
             * <strong>example:</strong>
             * <p>tdy218@1362469756xxxxxx</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public ApplicationInfo build() {
                return new ApplicationInfo(this);
            } 

        } 

    }
}
