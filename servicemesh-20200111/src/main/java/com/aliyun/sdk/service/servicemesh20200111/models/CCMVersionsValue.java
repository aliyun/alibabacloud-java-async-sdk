// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CCMVersionsValue} extends {@link TeaModel}
 *
 * <p>CCMVersionsValue</p>
 */
public class CCMVersionsValue extends TeaModel {
    @NameInMap("QueryState")
    private String queryState;

    @NameInMap("Version")
    private String version;

    @NameInMap("SLBGracefulDrainSupport")
    private Boolean SLBGracefulDrainSupport;

    @NameInMap("ClusterId")
    private String clusterId;

    @NameInMap("Message")
    private String message;

    private CCMVersionsValue(Builder builder) {
        this.queryState = builder.queryState;
        this.version = builder.version;
        this.SLBGracefulDrainSupport = builder.SLBGracefulDrainSupport;
        this.clusterId = builder.clusterId;
        this.message = builder.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CCMVersionsValue create() {
        return builder().build();
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
     * @return SLBGracefulDrainSupport
     */
    public Boolean getSLBGracefulDrainSupport() {
        return this.SLBGracefulDrainSupport;
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

    public static final class Builder {
        private String queryState; 
        private String version; 
        private Boolean SLBGracefulDrainSupport; 
        private String clusterId; 
        private String message; 

        /**
         * QueryState.
         */
        public Builder queryState(String queryState) {
            this.queryState = queryState;
            return this;
        }

        /**
         * Version.
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        /**
         * SLBGracefulDrainSupport.
         */
        public Builder SLBGracefulDrainSupport(Boolean SLBGracefulDrainSupport) {
            this.SLBGracefulDrainSupport = SLBGracefulDrainSupport;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public CCMVersionsValue build() {
            return new CCMVersionsValue(this);
        } 

    } 

}
