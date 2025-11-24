// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

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
 * {@link CCMVersionsValue} extends {@link TeaModel}
 *
 * <p>CCMVersionsValue</p>
 */
public class CCMVersionsValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("QueryState")
    private String queryState;

    @com.aliyun.core.annotation.NameInMap("Version")
    private String version;

    @com.aliyun.core.annotation.NameInMap("SLBGracefulDrainSupported")
    private Boolean SLBGracefulDrainSupported;

    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("SLBGracefulDrainSupport")
    @Deprecated
    private Boolean SLBGracefulDrainSupport;

    private CCMVersionsValue(Builder builder) {
        this.queryState = builder.queryState;
        this.version = builder.version;
        this.SLBGracefulDrainSupported = builder.SLBGracefulDrainSupported;
        this.clusterId = builder.clusterId;
        this.message = builder.message;
        this.SLBGracefulDrainSupport = builder.SLBGracefulDrainSupport;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CCMVersionsValue create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return queryState
     */
    public String getQueryState() {
        return this.queryState;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * @return SLBGracefulDrainSupported
     */
    public Boolean getSLBGracefulDrainSupported() {
        return this.SLBGracefulDrainSupported;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return SLBGracefulDrainSupport
     */
    public Boolean getSLBGracefulDrainSupport() {
        return this.SLBGracefulDrainSupport;
    }

    public static final class Builder {
        private String queryState; 
        private String version; 
        private Boolean SLBGracefulDrainSupported; 
        private String clusterId; 
        private String message; 
        private Boolean SLBGracefulDrainSupport; 

        private Builder() {
        } 

        private Builder(CCMVersionsValue model) {
            this.queryState = model.queryState;
            this.version = model.version;
            this.SLBGracefulDrainSupported = model.SLBGracefulDrainSupported;
            this.clusterId = model.clusterId;
            this.message = model.message;
            this.SLBGracefulDrainSupport = model.SLBGracefulDrainSupport;
        } 

        /**
         * <p>The status of the query. Valid values:</p>
         * <ul>
         * <li><code>time_out</code>: The query times out.</li>
         * <li><code>failed</code>: The query fails.</li>
         * <li><code>Empty string</code>: The query is successful.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>time_out</p>
         */
        public Builder queryState(String queryState) {
            this.queryState = queryState;
            return this;
        }

        /**
         * <p>The CCM version.</p>
         * 
         * <strong>example:</strong>
         * <p>v2.0.1</p>
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        /**
         * <p>Indicates whether Classic Load Balancer (CLB) graceful shutdown is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder SLBGracefulDrainSupported(Boolean SLBGracefulDrainSupported) {
            this.SLBGracefulDrainSupported = SLBGracefulDrainSupported;
            return this;
        }

        /**
         * <p>The ID of the cluster instance on the data plane.</p>
         * 
         * <strong>example:</strong>
         * <p>cfbb81b9b51a44b299349xxxxxxxxxxxx</p>
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The additional information that is returned when the query fails. This parameter is empty if the query is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>timeout error</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * SLBGracefulDrainSupport.
         */
        public Builder SLBGracefulDrainSupport(Boolean SLBGracefulDrainSupport) {
            this.SLBGracefulDrainSupport = SLBGracefulDrainSupport;
            return this;
        }

        public CCMVersionsValue build() {
            return new CCMVersionsValue(this);
        } 

    } 

}
