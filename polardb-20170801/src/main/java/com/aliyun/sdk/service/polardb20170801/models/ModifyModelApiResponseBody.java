// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link ModifyModelApiResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyModelApiResponseBody</p>
 */
public class ModifyModelApiResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Category")
    private String category;

    @com.aliyun.core.annotation.NameInMap("GmtCreated")
    private String gmtCreated;

    @com.aliyun.core.annotation.NameInMap("GmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("ModelApiId")
    private String modelApiId;

    @com.aliyun.core.annotation.NameInMap("ModelMappings")
    private String modelMappings;

    @com.aliyun.core.annotation.NameInMap("ModelRouting")
    private String modelRouting;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("PathPrefix")
    private String pathPrefix;

    @com.aliyun.core.annotation.NameInMap("Protocol")
    private String protocol;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RouteRules")
    private String routeRules;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private ModifyModelApiResponseBody(Builder builder) {
        this.category = builder.category;
        this.gmtCreated = builder.gmtCreated;
        this.gmtModified = builder.gmtModified;
        this.modelApiId = builder.modelApiId;
        this.modelMappings = builder.modelMappings;
        this.modelRouting = builder.modelRouting;
        this.name = builder.name;
        this.pathPrefix = builder.pathPrefix;
        this.protocol = builder.protocol;
        this.requestId = builder.requestId;
        this.routeRules = builder.routeRules;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyModelApiResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return gmtCreated
     */
    public String getGmtCreated() {
        return this.gmtCreated;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return modelApiId
     */
    public String getModelApiId() {
        return this.modelApiId;
    }

    /**
     * @return modelMappings
     */
    public String getModelMappings() {
        return this.modelMappings;
    }

    /**
     * @return modelRouting
     */
    public String getModelRouting() {
        return this.modelRouting;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pathPrefix
     */
    public String getPathPrefix() {
        return this.pathPrefix;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return routeRules
     */
    public String getRouteRules() {
        return this.routeRules;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String category; 
        private String gmtCreated; 
        private String gmtModified; 
        private String modelApiId; 
        private String modelMappings; 
        private String modelRouting; 
        private String name; 
        private String pathPrefix; 
        private String protocol; 
        private String requestId; 
        private String routeRules; 
        private String status; 

        private Builder() {
        } 

        private Builder(ModifyModelApiResponseBody model) {
            this.category = model.category;
            this.gmtCreated = model.gmtCreated;
            this.gmtModified = model.gmtModified;
            this.modelApiId = model.modelApiId;
            this.modelMappings = model.modelMappings;
            this.modelRouting = model.modelRouting;
            this.name = model.name;
            this.pathPrefix = model.pathPrefix;
            this.protocol = model.protocol;
            this.requestId = model.requestId;
            this.routeRules = model.routeRules;
            this.status = model.status;
        } 

        /**
         * <p>The category of the model.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * <p>The time when the model API was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-09T06:43:33Z</p>
         */
        public Builder gmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }

        /**
         * <p>The time when the model API was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-09T06:43:33Z</p>
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * <p>The ID of the model API.</p>
         * 
         * <strong>example:</strong>
         * <p>mi-xxxxx</p>
         */
        public Builder modelApiId(String modelApiId) {
            this.modelApiId = modelApiId;
            return this;
        }

        /**
         * <p>The current model name mappings, returned as a JSON array string. This parameter is empty if no mappings are configured.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Source&quot;:&quot;client-model-a&quot;,&quot;Target&quot;:&quot;upstream-model-a&quot;}]</p>
         */
        public Builder modelMappings(String modelMappings) {
            this.modelMappings = modelMappings;
            return this;
        }

        /**
         * <p>The current intelligent routing candidate list, returned as a JSON object string.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;AllowedModels&quot;:[&quot;deepseek-v4-pro&quot;,&quot;glm-5.3&quot;,&quot;glm-5.3-flash&quot;]}</p>
         */
        public Builder modelRouting(String modelRouting) {
            this.modelRouting = modelRouting;
            return this;
        }

        /**
         * <p>The updated name of the model API.</p>
         * 
         * <strong>example:</strong>
         * <p>jev-chat-api</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The API path prefix.</p>
         * 
         * <strong>example:</strong>
         * <p>/jev/v1</p>
         */
        public Builder pathPrefix(String pathPrefix) {
            this.pathPrefix = pathPrefix;
            return this;
        }

        /**
         * <p>The access protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>openai-chat</p>
         */
        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>925B84D9-CA72-432C-95CF-738C22******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The current routing rules, returned as a JSON string. A byte-for-byte exact match of the input is not guaranteed.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;RuleName&quot;:&quot;default&quot;,&quot;Providers&quot;:[{&quot;ModelServiceName&quot;:&quot;model-service-a&quot;,&quot;ModelList&quot;:&quot;[\&quot;deepseek-v4-pro\&quot;]&quot;,&quot;Weight&quot;:100}]}]</p>
         */
        public Builder routeRules(String routeRules) {
            this.routeRules = routeRules;
            return this;
        }

        /**
         * <p>The status of the model API.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public ModifyModelApiResponseBody build() {
            return new ModifyModelApiResponseBody(this);
        } 

    } 

}
