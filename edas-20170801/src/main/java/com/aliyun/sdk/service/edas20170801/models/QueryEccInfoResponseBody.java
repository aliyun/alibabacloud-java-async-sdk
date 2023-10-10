// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryEccInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryEccInfoResponseBody</p>
 */
public class QueryEccInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("EccInfo")
    private EccInfo eccInfo;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private QueryEccInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.eccInfo = builder.eccInfo;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryEccInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return eccInfo
     */
    public EccInfo getEccInfo() {
        return this.eccInfo;
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
        private Integer code; 
        private EccInfo eccInfo; 
        private String message; 
        private String requestId; 

        /**
         * The HTTP status code that is returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The information about the ECC.
         */
        public Builder eccInfo(EccInfo eccInfo) {
            this.eccInfo = eccInfo;
            return this;
        }

        /**
         * The additional information that is returned.
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

        public QueryEccInfoResponseBody build() {
            return new QueryEccInfoResponseBody(this);
        } 

    } 

    public static class EccInfo extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("EccId")
        private String eccId;

        @NameInMap("EcuId")
        private String ecuId;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("PackageMd5")
        private String packageMd5;

        @NameInMap("PackageVersion")
        private String packageVersion;

        @NameInMap("VpcId")
        private String vpcId;

        private EccInfo(Builder builder) {
            this.appId = builder.appId;
            this.eccId = builder.eccId;
            this.ecuId = builder.ecuId;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.packageMd5 = builder.packageMd5;
            this.packageVersion = builder.packageVersion;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EccInfo create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return eccId
         */
        public String getEccId() {
            return this.eccId;
        }

        /**
         * @return ecuId
         */
        public String getEcuId() {
            return this.ecuId;
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
         * @return packageMd5
         */
        public String getPackageMd5() {
            return this.packageMd5;
        }

        /**
         * @return packageVersion
         */
        public String getPackageVersion() {
            return this.packageVersion;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String appId; 
            private String eccId; 
            private String ecuId; 
            private String groupId; 
            private String groupName; 
            private String packageMd5; 
            private String packageVersion; 
            private String vpcId; 

            /**
             * The ID of the application.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * ECC ID
             */
            public Builder eccId(String eccId) {
                this.eccId = eccId;
                return this;
            }

            /**
             * ECU ID
             */
            public Builder ecuId(String ecuId) {
                this.ecuId = ecuId;
                return this;
            }

            /**
             * The ID of the ECC group.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The name of the ECC group.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * The MD5 hash value of the deployment package version.
             */
            public Builder packageMd5(String packageMd5) {
                this.packageMd5 = packageMd5;
                return this;
            }

            /**
             * The version of the deployment package.
             */
            public Builder packageVersion(String packageVersion) {
                this.packageVersion = packageVersion;
                return this;
            }

            /**
             * VPC ID
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public EccInfo build() {
                return new EccInfo(this);
            } 

        } 

    }
}
