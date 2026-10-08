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
         * <p>The status of the API call or a POP error code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Additional information.</p>
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
         * UserDefineRegionList.
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
             * BelongRegion.
             */
            public Builder belongRegion(String belongRegion) {
                this.belongRegion = belongRegion;
                return this;
            }

            /**
             * DebugEnable.
             */
            public Builder debugEnable(Boolean debugEnable) {
                this.debugEnable = debugEnable;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
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
             * MseInstanceId.
             */
            public Builder mseInstanceId(String mseInstanceId) {
                this.mseInstanceId = mseInstanceId;
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
             * RegionName.
             */
            public Builder regionName(String regionName) {
                this.regionName = regionName;
                return this;
            }

            /**
             * RegistryType.
             */
            public Builder registryType(String registryType) {
                this.registryType = registryType;
                return this;
            }

            /**
             * UserId.
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
