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
 * {@link QueryEccInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryEccInfoResponseBody</p>
 */
public class QueryEccInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("EccInfo")
    private EccInfo eccInfo;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

        private Builder() {
        } 

        private Builder(QueryEccInfoResponseBody model) {
            this.code = model.code;
            this.eccInfo = model.eccInfo;
            this.message = model.message;
            this.requestId = model.requestId;
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
         * <p>The information about the ECC.</p>
         */
        public Builder eccInfo(EccInfo eccInfo) {
            this.eccInfo = eccInfo;
            return this;
        }

        /**
         * <p>The additional information that is returned.</p>
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
         * <p>b197-40ab-9155-****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryEccInfoResponseBody build() {
            return new QueryEccInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryEccInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryEccInfoResponseBody</p>
     */
    public static class EccInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("EccId")
        private String eccId;

        @com.aliyun.core.annotation.NameInMap("EcuId")
        private String ecuId;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("PackageMd5")
        private String packageMd5;

        @com.aliyun.core.annotation.NameInMap("PackageVersion")
        private String packageVersion;

        @com.aliyun.core.annotation.NameInMap("VpcId")
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

            private Builder() {
            } 

            private Builder(EccInfo model) {
                this.appId = model.appId;
                this.eccId = model.eccId;
                this.ecuId = model.ecuId;
                this.groupId = model.groupId;
                this.groupName = model.groupName;
                this.packageMd5 = model.packageMd5;
                this.packageVersion = model.packageVersion;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>e809****-43d7-4c6b-8e01-b0d9d1db****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>ECC ID</p>
             * 
             * <strong>example:</strong>
             * <p>a5b9****-40b4-4d7b-9c2a-55d6c1c0****</p>
             */
            public Builder eccId(String eccId) {
                this.eccId = eccId;
                return this;
            }

            /**
             * <p>ECU ID</p>
             * 
             * <strong>example:</strong>
             * <p>0d4e****-6d87-401f-ba81-13df9877****</p>
             */
            public Builder ecuId(String ecuId) {
                this.ecuId = ecuId;
                return this;
            }

            /**
             * <p>The ID of the ECC group.</p>
             * 
             * <strong>example:</strong>
             * <p>57cd****-2d3b-496f-bcce-646d0a4d****</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The name of the ECC group.</p>
             * 
             * <strong>example:</strong>
             * <p>_DEFAULT_GROUP</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The MD5 hash value of the deployment package version.</p>
             * 
             * <strong>example:</strong>
             * <p>bab6<strong><strong>7a090e41ca9445c9b3cd</strong></strong></p>
             */
            public Builder packageMd5(String packageMd5) {
                this.packageMd5 = packageMd5;
                return this;
            }

            /**
             * <p>The version of the deployment package.</p>
             * 
             * <strong>example:</strong>
             * <p>20210209.153400</p>
             */
            public Builder packageVersion(String packageVersion) {
                this.packageVersion = packageVersion;
                return this;
            }

            /**
             * <p>VPC ID</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-23727****</p>
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
