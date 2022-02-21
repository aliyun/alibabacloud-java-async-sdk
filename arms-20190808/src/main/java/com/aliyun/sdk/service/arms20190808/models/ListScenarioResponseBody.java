// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListScenarioResponseBody} extends {@link TeaModel}
 *
 * <p>ListScenarioResponseBody</p>
 */
public class ListScenarioResponseBody extends TeaModel {
    @NameInMap("ArmsScenarios")
    private java.util.List < ArmsScenarios> armsScenarios;

    @NameInMap("RequestId")
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
         * ArmsScenarios.
         */
        public Builder armsScenarios(java.util.List < ArmsScenarios> armsScenarios) {
            this.armsScenarios = armsScenarios;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("AppId")
        private String appId;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Extensions")
        private String extensions;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Name")
        private String name;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Sign")
        private String sign;

        @NameInMap("UpdateTime")
        private String updateTime;

        @NameInMap("UserId")
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
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Extensions.
             */
            public Builder extensions(String extensions) {
                this.extensions = extensions;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Sign.
             */
            public Builder sign(String sign) {
                this.sign = sign;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * UserId.
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
