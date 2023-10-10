// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InsertOrUpdateRegionResponseBody} extends {@link TeaModel}
 *
 * <p>InsertOrUpdateRegionResponseBody</p>
 */
public class InsertOrUpdateRegionResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UserDefineRegionEntity")
    private UserDefineRegionEntity userDefineRegionEntity;

    private InsertOrUpdateRegionResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.userDefineRegionEntity = builder.userDefineRegionEntity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InsertOrUpdateRegionResponseBody create() {
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
     * @return userDefineRegionEntity
     */
    public UserDefineRegionEntity getUserDefineRegionEntity() {
        return this.userDefineRegionEntity;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private UserDefineRegionEntity userDefineRegionEntity; 

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
         * The information about the custom namespace.
         */
        public Builder userDefineRegionEntity(UserDefineRegionEntity userDefineRegionEntity) {
            this.userDefineRegionEntity = userDefineRegionEntity;
            return this;
        }

        public InsertOrUpdateRegionResponseBody build() {
            return new InsertOrUpdateRegionResponseBody(this);
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

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RegionName")
        private String regionName;

        @NameInMap("UserId")
        private String userId;

        private UserDefineRegionEntity(Builder builder) {
            this.belongRegion = builder.belongRegion;
            this.debugEnable = builder.debugEnable;
            this.description = builder.description;
            this.id = builder.id;
            this.regionId = builder.regionId;
            this.regionName = builder.regionName;
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
            private String regionId; 
            private String regionName; 
            private String userId; 

            /**
             * The ID of the region to which the namespace belongs.
             */
            public Builder belongRegion(String belongRegion) {
                this.belongRegion = belongRegion;
                return this;
            }

            /**
             * Indicates whether remote debugging is enabled. Valid values:
             * <p>
             * 
             * *   true: Remote debugging is enabled.
             * *   false: Remote debugging is disabled.
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
             * Indicates whether the namespace is created or modified. If this parameter is left empty or 0 is returned, the namespace is created. Otherwise, the namespace is modified.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The ID of the namespace.
             * <p>
             * 
             * *   The ID of a custom namespace is in the `region ID:namespace identifier` format. Example: cn-beijing:tdy218.
             * *   The ID of the default namespace is in the `region ID` format. Example: cn-beijing.
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
             * The ID of the Alibaba Cloud account to which the custom namespace belongs.
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
}
