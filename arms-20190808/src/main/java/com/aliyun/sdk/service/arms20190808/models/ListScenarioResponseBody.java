// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListScenarioResponseBody} extends {@link TeaModel}
 *
 * <p>ListScenarioResponseBody</p>
 */
public class ListScenarioResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ArmsScenarios")
    private java.util.List < ArmsScenarios> armsScenarios;

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
    public java.util.List < ArmsScenarios> getArmsScenarios() {
        return this.armsScenarios;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ArmsScenarios> armsScenarios; 
        private String requestId; 

        /**
         * The detailed information of the business monitoring job.
         */
        public Builder armsScenarios(java.util.List < ArmsScenarios> armsScenarios) {
            this.armsScenarios = armsScenarios;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListScenarioResponseBody build() {
            return new ListScenarioResponseBody(this);
        } 

    } 

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
             * The ID of the application.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The time when the business monitoring job was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The extended information. The value is a JSON string.
             */
            public Builder extensions(String extensions) {
                this.extensions = extensions;
                return this;
            }

            /**
             * The ID of the business monitoring job.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the business monitoring job.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The ID of the region.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The code of the business monitoring job.
             */
            public Builder sign(String sign) {
                this.sign = sign;
                return this;
            }

            /**
             * The time when the business monitoring job was updated.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * The ID of the user.
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
