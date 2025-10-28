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
 * {@link InsertOrUpdateRegionResponseBody} extends {@link TeaModel}
 *
 * <p>InsertOrUpdateRegionResponseBody</p>
 */
public class InsertOrUpdateRegionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UserDefineRegionEntity")
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

        private Builder() {
        } 

        private Builder(InsertOrUpdateRegionResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.userDefineRegionEntity = model.userDefineRegionEntity;
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
         * <p>37793352-C568-4A5A-BF69-4DC853******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the custom namespace.</p>
         */
        public Builder userDefineRegionEntity(UserDefineRegionEntity userDefineRegionEntity) {
            this.userDefineRegionEntity = userDefineRegionEntity;
            return this;
        }

        public InsertOrUpdateRegionResponseBody build() {
            return new InsertOrUpdateRegionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link InsertOrUpdateRegionResponseBody} extends {@link TeaModel}
     *
     * <p>InsertOrUpdateRegionResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RegionName")
        private String regionName;

        @com.aliyun.core.annotation.NameInMap("UserId")
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

            private Builder() {
            } 

            private Builder(UserDefineRegionEntity model) {
                this.belongRegion = model.belongRegion;
                this.debugEnable = model.debugEnable;
                this.description = model.description;
                this.id = model.id;
                this.regionId = model.regionId;
                this.regionName = model.regionName;
                this.userId = model.userId;
            } 

            /**
             * <p>The ID of the region to which the namespace belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder belongRegion(String belongRegion) {
                this.belongRegion = belongRegion;
                return this;
            }

            /**
             * <p>Indicates whether remote debugging is enabled. Valid values:</p>
             * <ul>
             * <li>true: Remote debugging is enabled.</li>
             * <li>false: Remote debugging is disabled.</li>
             * </ul>
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
             * <p>Logical region</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates whether the namespace is created or modified. If this parameter is left empty or 0 is returned, the namespace is created. Otherwise, the namespace is modified.</p>
             * 
             * <strong>example:</strong>
             * <p>15160</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The ID of the namespace.</p>
             * <ul>
             * <li>The ID of a custom namespace is in the <code>region ID:namespace identifier</code> format. Example: cn-beijing:tdy218.</li>
             * <li>The ID of the default namespace is in the <code>region ID</code> format. Example: cn-beijing.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing:test</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The name of the namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>test_region</p>
             */
            public Builder regionName(String regionName) {
                this.regionName = regionName;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the custom namespace belongs.</p>
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
}
