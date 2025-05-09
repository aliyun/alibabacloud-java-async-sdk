// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link DataValue} extends {@link TeaModel}
 *
 * <p>DataValue</p>
 */
public class DataValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.NameInMap("AppId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DataValue model) {
            this.userId = model.userId;
            this.regionId = model.regionId;
            this.namespace = model.namespace;
            this.appName = model.appName;
            this.appId = model.appId;
        } 

        /**
         * <p>The ID of the user to which the application belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * <p>The region where the application resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The microservice namespace where the application resides.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>example-app-name</p>
         */
        public Builder appName(String appName) {
            this.appName = appName;
            return this;
        }

        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456abcde@12345abcde</p>
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
