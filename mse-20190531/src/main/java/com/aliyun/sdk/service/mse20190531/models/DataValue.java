// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DataValue} extends {@link TeaModel}
 *
 * <p>DataValue</p>
 */
public class DataValue extends TeaModel {
    @NameInMap("UserId")
    private String userId;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("Namespace")
    private String namespace;

    @NameInMap("AppName")
    private String appName;

    @NameInMap("AppId")
    private String appId;

    private DataValue(Builder builder) {
        this.userId = builder.userId;
        this.regionId = builder.regionId;
        this.namespace = builder.namespace;
        this.appName = builder.appName;
        this.appId = builder.appId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataValue create() {
        return builder().build();
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    public static final class Builder {
        private String userId; 
        private String regionId; 
        private String namespace; 
        private String appName; 
        private String appId; 

        /**
         * The ID of the user to which the application belongs.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * The region where the application resides.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * The microservice namespace where the application resides.
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * The application name.
         */
        public Builder appName(String appName) {
            this.appName = appName;
            return this;
        }

        /**
         * The application ID.
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        public DataValue build() {
            return new DataValue(this);
        } 

    } 

}
