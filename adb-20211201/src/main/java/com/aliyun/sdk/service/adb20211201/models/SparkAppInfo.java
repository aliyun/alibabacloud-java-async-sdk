// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SparkAppInfo} extends {@link TeaModel}
 *
 * <p>SparkAppInfo</p>
 */
public class SparkAppInfo extends TeaModel {
    @NameInMap("AppId")
    private String appId;

    @NameInMap("AppName")
    private String appName;

    @NameInMap("DBClusterId")
    private String DBClusterId;

    @NameInMap("Detail")
    private Detail detail;

    @NameInMap("Message")
    private String message;

    @NameInMap("Priority")
    private String priority;

    @NameInMap("State")
    private String state;

    private SparkAppInfo(Builder builder) {
        this.appId = builder.appId;
        this.appName = builder.appName;
        this.DBClusterId = builder.DBClusterId;
        this.detail = builder.detail;
        this.message = builder.message;
        this.priority = builder.priority;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SparkAppInfo create() {
        return builder().build();
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return detail
     */
    public Detail getDetail() {
        return this.detail;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return priority
     */
    public String getPriority() {
        return this.priority;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    public static final class Builder {
        private String appId; 
        private String appName; 
        private String DBClusterId; 
        private Detail detail; 
        private String message; 
        private String priority; 
        private String state; 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.appName = appName;
            return this;
        }

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * Detail.
         */
        public Builder detail(Detail detail) {
            this.detail = detail;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Priority.
         */
        public Builder priority(String priority) {
            this.priority = priority;
            return this;
        }

        /**
         * State.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        public SparkAppInfo build() {
            return new SparkAppInfo(this);
        } 

    } 

}
