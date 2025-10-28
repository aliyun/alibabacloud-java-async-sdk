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
 * {@link ListUserDefineRegionResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserDefineRegionResponseBody</p>
 */
public class ListUserDefineRegionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UserDefineRegionList")
    private UserDefineRegionList userDefineRegionList;

    private ListUserDefineRegionResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.userDefineRegionList = builder.userDefineRegionList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserDefineRegionResponseBody create() {
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
     * @return userDefineRegionList
     */
    public UserDefineRegionList getUserDefineRegionList() {
        return this.userDefineRegionList;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private UserDefineRegionList userDefineRegionList; 

        private Builder() {
        } 

        private Builder(ListUserDefineRegionResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.userDefineRegionList = model.userDefineRegionList;
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

        /**
         * <p>The namespaces.</p>
         */
        public Builder userDefineRegionList(UserDefineRegionList userDefineRegionList) {
            this.userDefineRegionList = userDefineRegionList;
            return this;
        }

        public ListUserDefineRegionResponseBody build() {
            return new ListUserDefineRegionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListUserDefineRegionResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserDefineRegionResponseBody</p>
     */
    public static class UserDefineRegionEntity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BelongRegion")
        private String belongRegion;

        @com.aliyun.core.annotation.NameInMap("DebugEnable")
        private Boolean debugEnable;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("MseInstanceId")
        private String mseInstanceId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RegionName")
        private String regionName;

        @com.aliyun.core.annotation.NameInMap("RegistryType")
        private String registryType;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private UserDefineRegionEntity(Builder builder) {
            this.belongRegion = builder.belongRegion;
            this.debugEnable = builder.debugEnable;
            this.description = builder.description;
            this.id = builder.id;
            this.mseInstanceId = builder.mseInstanceId;
            this.regionId = builder.regionId;
            this.regionName = builder.regionName;
            this.registryType = builder.registryType;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserDefineRegionEntity create() {
            return builder().build();
        }

        /**
         * @return belongRegion
         */
        public String getBelongRegion() {
            return this.belongRegion;
        }

        /**
         * @return debugEnable
         */
        public Boolean getDebugEnable() {
            return this.debugEnable;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return mseInstanceId
         */
        public String getMseInstanceId() {
            return this.mseInstanceId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return regionName
         */
        public String getRegionName() {
            return this.regionName;
        }

        /**
         * @return registryType
         */
        public String getRegistryType() {
            return this.registryType;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String belongRegion; 
            private Boolean debugEnable; 
            private String description; 
            private Long id; 
            private String mseInstanceId; 
            private String regionId; 
            private String regionName; 
            private String registryType; 
            private String userId; 

            private Builder() {
            } 

            private Builder(UserDefineRegionEntity model) {
                this.belongRegion = model.belongRegion;
                this.debugEnable = model.debugEnable;
                this.description = model.description;
                this.id = model.id;
                this.mseInstanceId = model.mseInstanceId;
                this.regionId = model.regionId;
                this.regionName = model.regionName;
                this.registryType = model.registryType;
                this.userId = model.userId;
            } 

            /**
             * <p>The ID of the region to which the namespace belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shenzhen</p>
             */
            public Builder belongRegion(String belongRegion) {
                this.belongRegion = belongRegion;
                return this;
            }

            /**
             * <p>Indicates whether remote debugging is allowed.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder debugEnable(Boolean debugEnable) {
                this.debugEnable = debugEnable;
                return this;
            }

            /**
             * <p>The description of the namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>betaappManager</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The unique identifier of the namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>1330</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The type of the registry. Valid values:</p>
             * <ul>
             * <li>default: shared service registry of Enterprise Distributed Application Service (EDAS)</li>
             * <li>exclusive_mse: Microservices Engine (MSE) Nacos registry</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>default: EDAS</p>
             */
            public Builder mseInstanceId(String mseInstanceId) {
                this.mseInstanceId = mseInstanceId;
                return this;
            }

            /**
             * <p>The ID of the namespace.</p>
             * <blockquote>
             * <p>The ID cannot be changed after the namespace is created. The ID is in the <code>Physical region ID:Logical region identifier</code> format .</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cn-shenzhen:betaappManager</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The name of the namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>betaappManager</p>
             */
            public Builder regionName(String regionName) {
                this.regionName = regionName;
                return this;
            }

            /**
             * <p>The ID of the MSE instance.</p>
             * 
             * <strong>example:</strong>
             * <p>mse_prepaid_public_cn-tl32n******</p>
             */
            public Builder registryType(String registryType) {
                this.registryType = registryType;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the namespace belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>edas_****_test@aliyun-****.com</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public UserDefineRegionEntity build() {
                return new UserDefineRegionEntity(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListUserDefineRegionResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserDefineRegionResponseBody</p>
     */
    public static class UserDefineRegionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserDefineRegionEntity")
        private java.util.List<UserDefineRegionEntity> userDefineRegionEntity;

        private UserDefineRegionList(Builder builder) {
            this.userDefineRegionEntity = builder.userDefineRegionEntity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserDefineRegionList create() {
            return builder().build();
        }

        /**
         * @return userDefineRegionEntity
         */
        public java.util.List<UserDefineRegionEntity> getUserDefineRegionEntity() {
            return this.userDefineRegionEntity;
        }

        public static final class Builder {
            private java.util.List<UserDefineRegionEntity> userDefineRegionEntity; 

            private Builder() {
            } 

            private Builder(UserDefineRegionList model) {
                this.userDefineRegionEntity = model.userDefineRegionEntity;
            } 

            /**
             * UserDefineRegionEntity.
             */
            public Builder userDefineRegionEntity(java.util.List<UserDefineRegionEntity> userDefineRegionEntity) {
                this.userDefineRegionEntity = userDefineRegionEntity;
                return this;
            }

            public UserDefineRegionList build() {
                return new UserDefineRegionList(this);
            } 

        } 

    }
}
