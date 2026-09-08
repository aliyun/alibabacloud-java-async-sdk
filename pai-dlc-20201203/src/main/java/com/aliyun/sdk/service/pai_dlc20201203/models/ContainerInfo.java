// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link ContainerInfo} extends {@link TeaModel}
 *
 * <p>ContainerInfo</p>
 */
public class ContainerInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MainContainer")
    private String mainContainer;

    @com.aliyun.core.annotation.NameInMap("SidecarContainers")
    private java.util.List<String> sidecarContainers;

    private ContainerInfo(Builder builder) {
        this.mainContainer = builder.mainContainer;
        this.sidecarContainers = builder.sidecarContainers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ContainerInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mainContainer
     */
    public String getMainContainer() {
        return this.mainContainer;
    }

    /**
     * @return sidecarContainers
     */
    public java.util.List<String> getSidecarContainers() {
        return this.sidecarContainers;
    }

    public static final class Builder {
        private String mainContainer; 
        private java.util.List<String> sidecarContainers; 

        private Builder() {
        } 

        private Builder(ContainerInfo model) {
            this.mainContainer = model.mainContainer;
            this.sidecarContainers = model.sidecarContainers;
        } 

        /**
         * <p>The name of the main container.</p>
         * 
         * <strong>example:</strong>
         * <p>pytorch</p>
         */
        public Builder mainContainer(String mainContainer) {
            this.mainContainer = mainContainer;
            return this;
        }

        /**
         * <p>The list of sidecar container names.</p>
         */
        public Builder sidecarContainers(java.util.List<String> sidecarContainers) {
            this.sidecarContainers = sidecarContainers;
            return this;
        }

        public ContainerInfo build() {
            return new ContainerInfo(this);
        } 

    } 

}
