// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserDefineRegionResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserDefineRegionResponseBody</p>
 */
public class ListUserDefineRegionResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UserDefineRegionList")
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

        /**
         * The HTTP status code that is returned.
         */
        public Builder code(Integer code) {
            this.code = code;
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

        /**
         * The namespaces.
         */
        public Builder userDefineRegionList(UserDefineRegionList userDefineRegionList) {
            this.userDefineRegionList = userDefineRegionList;
            return this;
        }

        public ListUserDefineRegionResponseBody build() {
            return new ListUserDefineRegionResponseBody(this);
        } 

    } 

    public static class UserDefineRegionEntity extends TeaModel {
        @NameInMap("BelongRegion")
        private String belongRegion;

        @NameInMap("DebugEnable")
        private Boolean debugEnable;

        @NameInMap("Description")
        private String description;

        @NameInMap("Id")
        private Long id;

        @NameInMap("MseInstanceId")
        private String mseInstanceId;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RegionName")
        private String regionName;

        @NameInMap("RegistryType")
        private String registryType;

        @NameInMap("UserId")
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

            /**
             * The ID of the region to which the namespace belongs.
             */
            public Builder belongRegion(String belongRegion) {
                this.belongRegion = belongRegion;
                return this;
            }

            /**
             * Indicates whether remote debugging is allowed.
             */
            public Builder debugEnable(Boolean debugEnable) {
                this.debugEnable = debugEnable;
                return this;
            }

            /**
             * The description of the namespace.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The unique identifier of the namespace.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The type of the registry. Valid values:
             * <p>
             * 
             * *   default: shared service registry of Enterprise Distributed Application Service (EDAS)
             * *   exclusive_mse: Microservices Engine (MSE) Nacos registry
             */
            public Builder mseInstanceId(String mseInstanceId) {
                this.mseInstanceId = mseInstanceId;
                return this;
            }

            /**
             * The ID of the namespace.
             * <p>
             * 
             * > The ID cannot be changed after the namespace is created. The ID is in the `Physical region ID:Logical region identifier` format .
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The name of the namespace.
             */
            public Builder regionName(String regionName) {
                this.regionName = regionName;
                return this;
            }

            /**
             * The ID of the MSE instance.
             */
            public Builder registryType(String registryType) {
                this.registryType = registryType;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account to which the namespace belongs.
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
    public static class UserDefineRegionList extends TeaModel {
        @NameInMap("UserDefineRegionEntity")
        private java.util.List < UserDefineRegionEntity> userDefineRegionEntity;

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
        public java.util.List < UserDefineRegionEntity> getUserDefineRegionEntity() {
            return this.userDefineRegionEntity;
        }

        public static final class Builder {
            private java.util.List < UserDefineRegionEntity> userDefineRegionEntity; 

            /**
             * UserDefineRegionEntity.
             */
            public Builder userDefineRegionEntity(java.util.List < UserDefineRegionEntity> userDefineRegionEntity) {
                this.userDefineRegionEntity = userDefineRegionEntity;
                return this;
            }

            public UserDefineRegionList build() {
                return new UserDefineRegionList(this);
            } 

        } 

    }
}
