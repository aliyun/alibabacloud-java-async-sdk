// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link ListScenarioResponseBody} extends {@link TeaModel}
 *
 * <p>ListScenarioResponseBody</p>
 */
public class ListScenarioResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ArmsScenarios")
    private java.util.List<ArmsScenarios> armsScenarios;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListScenarioResponseBody(Builder builder) {
        this.armsScenarios = builder.armsScenarios;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListScenarioResponseBody create() {
        return builder().build();
    }

    /**
     * @return armsScenarios
     */
    public java.util.List<ArmsScenarios> getArmsScenarios() {
        return this.armsScenarios;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ArmsScenarios> armsScenarios; 
        private String requestId; 

        /**
         * <p>The detailed information of the business monitoring job.</p>
         */
        public Builder armsScenarios(java.util.List<ArmsScenarios> armsScenarios) {
            this.armsScenarios = armsScenarios;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>98027D1F-3AEB-492C-A4AA-E9217992****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListScenarioResponseBody build() {
            return new ListScenarioResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListScenarioResponseBody} extends {@link TeaModel}
     *
     * <p>ListScenarioResponseBody</p>
     */
    public static class ArmsScenarios extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Extensions")
        private String extensions;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Sign")
        private String sign;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private ArmsScenarios(Builder builder) {
            this.appId = builder.appId;
            this.createTime = builder.createTime;
            this.extensions = builder.extensions;
            this.id = builder.id;
            this.name = builder.name;
            this.regionId = builder.regionId;
            this.sign = builder.sign;
            this.updateTime = builder.updateTime;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ArmsScenarios create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return extensions
         */
        public String getExtensions() {
            return this.extensions;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return sign
         */
        public String getSign() {
            return this.sign;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String appId; 
            private String createTime; 
            private String extensions; 
            private Long id; 
            private String name; 
            private String regionId; 
            private String sign; 
            private String updateTime; 
            private String userId; 

            /**
             * <p>The ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>b590lhguqs@28f515462******</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The time when the business monitoring job was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1585214916000</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The extended information. The value is a JSON string.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;_MODE&quot;: &quot;CUSTOM-TRANSACTION&quot;,&quot;_SCENARIO&quot;: &quot;USER-DEFINED&quot;}</p>
             */
            public Builder extensions(String extensions) {
                this.extensions = extensions;
                return this;
            }

            /**
             * <p>The ID of the business monitoring job.</p>
             * 
             * <strong>example:</strong>
             * <p>132</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the business monitoring job.</p>
             * 
             * <strong>example:</strong>
             * <p>k8s_deployment_css-guns-vip-main-prod_silence</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-zhangjiakou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The code of the business monitoring job.</p>
             * 
             * <strong>example:</strong>
             * <p>a9f8****</p>
             */
            public Builder sign(String sign) {
                this.sign = sign;
                return this;
            }

            /**
             * <p>The time when the business monitoring job was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>1585214916000</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The ID of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>113197164949****</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public ArmsScenarios build() {
                return new ArmsScenarios(this);
            } 

        } 

    }
}
