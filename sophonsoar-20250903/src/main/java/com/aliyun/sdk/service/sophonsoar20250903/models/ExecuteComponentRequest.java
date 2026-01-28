// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20250903.models;

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
 * {@link ExecuteComponentRequest} extends {@link RequestModel}
 *
 * <p>ExecuteComponentRequest</p>
 */
public class ExecuteComponentRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ComponentActionName")
    private String componentActionName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ComponentAssetUuid")
    private String componentAssetUuid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ComponentInput")
    private String componentInput;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ComponentName")
    private String componentName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PlayBookNodeName")
    private String playBookNodeName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PlaybookUuid")
    private String playbookUuid;

    private ExecuteComponentRequest(Builder builder) {
        super(builder);
        this.componentActionName = builder.componentActionName;
        this.componentAssetUuid = builder.componentAssetUuid;
        this.componentInput = builder.componentInput;
        this.componentName = builder.componentName;
        this.lang = builder.lang;
        this.playBookNodeName = builder.playBookNodeName;
        this.playbookUuid = builder.playbookUuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteComponentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return componentActionName
     */
    public String getComponentActionName() {
        return this.componentActionName;
    }

    /**
     * @return componentAssetUuid
     */
    public String getComponentAssetUuid() {
        return this.componentAssetUuid;
    }

    /**
     * @return componentInput
     */
    public String getComponentInput() {
        return this.componentInput;
    }

    /**
     * @return componentName
     */
    public String getComponentName() {
        return this.componentName;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return playBookNodeName
     */
    public String getPlayBookNodeName() {
        return this.playBookNodeName;
    }

    /**
     * @return playbookUuid
     */
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

    public static final class Builder extends Request.Builder<ExecuteComponentRequest, Builder> {
        private String componentActionName; 
        private String componentAssetUuid; 
        private String componentInput; 
        private String componentName; 
        private String lang; 
        private String playBookNodeName; 
        private String playbookUuid; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteComponentRequest request) {
            super(request);
            this.componentActionName = request.componentActionName;
            this.componentAssetUuid = request.componentAssetUuid;
            this.componentInput = request.componentInput;
            this.componentName = request.componentName;
            this.lang = request.lang;
            this.playBookNodeName = request.playBookNodeName;
            this.playbookUuid = request.playbookUuid;
        } 

        /**
         * ComponentActionName.
         */
        public Builder componentActionName(String componentActionName) {
            this.putBodyParameter("ComponentActionName", componentActionName);
            this.componentActionName = componentActionName;
            return this;
        }

        /**
         * ComponentAssetUuid.
         */
        public Builder componentAssetUuid(String componentAssetUuid) {
            this.putBodyParameter("ComponentAssetUuid", componentAssetUuid);
            this.componentAssetUuid = componentAssetUuid;
            return this;
        }

        /**
         * ComponentInput.
         */
        public Builder componentInput(String componentInput) {
            this.putBodyParameter("ComponentInput", componentInput);
            this.componentInput = componentInput;
            return this;
        }

        /**
         * ComponentName.
         */
        public Builder componentName(String componentName) {
            this.putBodyParameter("ComponentName", componentName);
            this.componentName = componentName;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * PlayBookNodeName.
         */
        public Builder playBookNodeName(String playBookNodeName) {
            this.putBodyParameter("PlayBookNodeName", playBookNodeName);
            this.playBookNodeName = playBookNodeName;
            return this;
        }

        /**
         * PlaybookUuid.
         */
        public Builder playbookUuid(String playbookUuid) {
            this.putBodyParameter("PlaybookUuid", playbookUuid);
            this.playbookUuid = playbookUuid;
            return this;
        }

        @Override
        public ExecuteComponentRequest build() {
            return new ExecuteComponentRequest(this);
        } 

    } 

}
