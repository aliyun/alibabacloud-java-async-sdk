// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link SparkAppInfo} extends {@link TeaModel}
 *
 * <p>SparkAppInfo</p>
 */
public class SparkAppInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("Detail")
    private Detail detail;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Priority")
    private String priority;

    @com.aliyun.core.annotation.NameInMap("State")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(SparkAppInfo model) {
            this.appId = model.appId;
            this.appName = model.appName;
            this.DBClusterId = model.DBClusterId;
            this.detail = model.detail;
            this.message = model.message;
            this.priority = model.priority;
            this.state = model.state;
        } 

        /**
         * <p>The ID of the Spark application.</p>
         * 
         * <strong>example:</strong>
         * <p>s202207151211hz0c****</p>
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        /**
         * <p>The name of the Spark application.</p>
         * 
         * <strong>example:</strong>
         * <p>SparkTest</p>
         */
        public Builder appName(String appName) {
            this.appName = appName;
            return this;
        }

        /**
         * <p>The database ID.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-23xxxx</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The information about the Spark application.</p>
         */
        public Builder detail(Detail detail) {
            this.detail = detail;
            return this;
        }

        /**
         * <p>The alert message returned, such as task execution failure or insufficient resources. If no alert occurs, null is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>WARN: Disk is full.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The priority of the Spark application.</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        public Builder priority(String priority) {
            this.priority = priority;
            return this;
        }

        /**
         * <p>The state of the Spark application. Valid values:</p>
         * <ul>
         * <li><strong>SUBMITTED</strong></li>
         * <li><strong>STARTING</strong></li>
         * <li><strong>RUNNING</strong></li>
         * <li><strong>FAILING</strong></li>
         * <li><strong>FAILED</strong></li>
         * <li><strong>KILLING</strong></li>
         * <li><strong>KILLED</strong></li>
         * <li><strong>SUCCEEDING</strong></li>
         * <li><strong>COMPLETED</strong></li>
         * <li><strong>FATAL</strong></li>
         * <li><strong>UNKNOWN</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUBMITTED</p>
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
