// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link GetEngineConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetEngineConfigResponseBody</p>
 */
public class GetEngineConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConfigValue")
    private String configValue;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Environment")
    private String environment;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("GmtReleasedTime")
    private String gmtReleasedTime;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SceneId")
    private String sceneId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private GetEngineConfigResponseBody(Builder builder) {
        this.configValue = builder.configValue;
        this.description = builder.description;
        this.environment = builder.environment;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.gmtReleasedTime = builder.gmtReleasedTime;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.sceneId = builder.sceneId;
        this.status = builder.status;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEngineConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configValue
     */
    public String getConfigValue() {
        return this.configValue;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return environment
     */
    public String getEnvironment() {
        return this.environment;
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtModifiedTime
     */
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    /**
     * @return gmtReleasedTime
     */
    public String getGmtReleasedTime() {
        return this.gmtReleasedTime;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String configValue; 
        private String description; 
        private String environment; 
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private String gmtReleasedTime; 
        private String name; 
        private String requestId; 
        private String sceneId; 
        private String status; 
        private String type; 

        private Builder() {
        } 

        private Builder(GetEngineConfigResponseBody model) {
            this.configValue = model.configValue;
            this.description = model.description;
            this.environment = model.environment;
            this.gmtCreateTime = model.gmtCreateTime;
            this.gmtModifiedTime = model.gmtModifiedTime;
            this.gmtReleasedTime = model.gmtReleasedTime;
            this.name = model.name;
            this.requestId = model.requestId;
            this.sceneId = model.sceneId;
            this.status = model.status;
            this.type = model.type;
        } 

        /**
         * <p>The content of the engine configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder configValue(String configValue) {
            this.configValue = configValue;
            return this;
        }

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>this is a test config</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The runtime environment. Valid values:</p>
         * <ul>
         * <li><p>Daily: daily environment.</p>
         * </li>
         * <li><p>Pre: staging environment.</p>
         * </li>
         * <li><p>Prod: production environment.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Pre</p>
         */
        public Builder environment(String environment) {
            this.environment = environment;
            return this;
        }

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-03T02:28:00.000Z</p>
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-08-27T12:00:00Z</p>
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * <p>The publish time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-03 02:28:00</p>
         */
        public Builder gmtReleasedTime(String gmtReleasedTime) {
            this.gmtReleasedTime = gmtReleasedTime;
            return this;
        }

        /**
         * <p>The engine configuration name.</p>
         * 
         * <strong>example:</strong>
         * <p>engine_config_v1</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>59CE7EC6-F268-5D71-9215-32922CC50D72</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SceneId.
         */
        public Builder sceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }

        /**
         * <p>The status. Valid values:</p>
         * <ul>
         * <li><p>Released: published.</p>
         * </li>
         * <li><p>UnReleased: not published.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Released</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The engine configuration type.</p>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public GetEngineConfigResponseBody build() {
            return new GetEngineConfigResponseBody(this);
        } 

    } 

}
