// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link NeuronAppClientInfo} extends {@link TeaModel}
 *
 * <p>NeuronAppClientInfo</p>
 */
public class NeuronAppClientInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("appEntry")
    private String appEntry;

    @com.aliyun.core.annotation.NameInMap("appId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long appId;

    @com.aliyun.core.annotation.NameInMap("mobiInfo")
    private MobiInfo mobiInfo;

    @com.aliyun.core.annotation.NameInMap("pluginList")
    private java.util.List<AppPluginInfo> pluginList;

    @com.aliyun.core.annotation.NameInMap("productId")
    private Long productId;

    @com.aliyun.core.annotation.NameInMap("sidebar")
    private String sidebar;

    @com.aliyun.core.annotation.NameInMap("version")
    @com.aliyun.core.annotation.Validation(required = true)
    private String version;

    private NeuronAppClientInfo(Builder builder) {
        this.appEntry = builder.appEntry;
        this.appId = builder.appId;
        this.mobiInfo = builder.mobiInfo;
        this.pluginList = builder.pluginList;
        this.productId = builder.productId;
        this.sidebar = builder.sidebar;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NeuronAppClientInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appEntry
     */
    public String getAppEntry() {
        return this.appEntry;
    }

    /**
     * @return appId
     */
    public Long getAppId() {
        return this.appId;
    }

    /**
     * @return mobiInfo
     */
    public MobiInfo getMobiInfo() {
        return this.mobiInfo;
    }

    /**
     * @return pluginList
     */
    public java.util.List<AppPluginInfo> getPluginList() {
        return this.pluginList;
    }

    /**
     * @return productId
     */
    public Long getProductId() {
        return this.productId;
    }

    /**
     * @return sidebar
     */
    public String getSidebar() {
        return this.sidebar;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private String appEntry; 
        private Long appId; 
        private MobiInfo mobiInfo; 
        private java.util.List<AppPluginInfo> pluginList; 
        private Long productId; 
        private String sidebar; 
        private String version; 

        private Builder() {
        } 

        private Builder(NeuronAppClientInfo model) {
            this.appEntry = model.appEntry;
            this.appId = model.appId;
            this.mobiInfo = model.mobiInfo;
            this.pluginList = model.pluginList;
            this.productId = model.productId;
            this.sidebar = model.sidebar;
            this.version = model.version;
        } 

        /**
         * appEntry.
         */
        public Builder appEntry(String appEntry) {
            this.appEntry = appEntry;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder appId(Long appId) {
            this.appId = appId;
            return this;
        }

        /**
         * mobiInfo.
         */
        public Builder mobiInfo(MobiInfo mobiInfo) {
            this.mobiInfo = mobiInfo;
            return this;
        }

        /**
         * pluginList.
         */
        public Builder pluginList(java.util.List<AppPluginInfo> pluginList) {
            this.pluginList = pluginList;
            return this;
        }

        /**
         * productId.
         */
        public Builder productId(Long productId) {
            this.productId = productId;
            return this;
        }

        /**
         * sidebar.
         */
        public Builder sidebar(String sidebar) {
            this.sidebar = sidebar;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0.0</p>
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public NeuronAppClientInfo build() {
            return new NeuronAppClientInfo(this);
        } 

    } 

}
