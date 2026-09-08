// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link NodeOperationParameters} extends {@link TeaModel}
 *
 * <p>NodeOperationParameters</p>
 */
public class NodeOperationParameters extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CordonParameters")
    private NodeCordonParameters cordonParameters;

    @com.aliyun.core.annotation.NameInMap("DrainParameters")
    private NodeDrainParameters drainParameters;

    @com.aliyun.core.annotation.NameInMap("ResizeDiskParameters")
    private ResizeDiskParameters resizeDiskParameters;

    @com.aliyun.core.annotation.NameInMap("UncordonParameters")
    private NodeUncordonParameters uncordonParameters;

    private NodeOperationParameters(Builder builder) {
        this.cordonParameters = builder.cordonParameters;
        this.drainParameters = builder.drainParameters;
        this.resizeDiskParameters = builder.resizeDiskParameters;
        this.uncordonParameters = builder.uncordonParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NodeOperationParameters create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cordonParameters
     */
    public NodeCordonParameters getCordonParameters() {
        return this.cordonParameters;
    }

    /**
     * @return drainParameters
     */
    public NodeDrainParameters getDrainParameters() {
        return this.drainParameters;
    }

    /**
     * @return resizeDiskParameters
     */
    public ResizeDiskParameters getResizeDiskParameters() {
        return this.resizeDiskParameters;
    }

    /**
     * @return uncordonParameters
     */
    public NodeUncordonParameters getUncordonParameters() {
        return this.uncordonParameters;
    }

    public static final class Builder {
        private NodeCordonParameters cordonParameters; 
        private NodeDrainParameters drainParameters; 
        private ResizeDiskParameters resizeDiskParameters; 
        private NodeUncordonParameters uncordonParameters; 

        private Builder() {
        } 

        private Builder(NodeOperationParameters model) {
            this.cordonParameters = model.cordonParameters;
            this.drainParameters = model.drainParameters;
            this.resizeDiskParameters = model.resizeDiskParameters;
            this.uncordonParameters = model.uncordonParameters;
        } 

        /**
         * <p>The parameter settings for disabling node scheduling.</p>
         */
        public Builder cordonParameters(NodeCordonParameters cordonParameters) {
            this.cordonParameters = cordonParameters;
            return this;
        }

        /**
         * <p>The parameter settings for draining task instances from a node.</p>
         */
        public Builder drainParameters(NodeDrainParameters drainParameters) {
            this.drainParameters = drainParameters;
            return this;
        }

        /**
         * <p>The parameters for changing disk capacity.</p>
         */
        public Builder resizeDiskParameters(ResizeDiskParameters resizeDiskParameters) {
            this.resizeDiskParameters = resizeDiskParameters;
            return this;
        }

        /**
         * <p>The parameter settings for enabling node scheduling.</p>
         */
        public Builder uncordonParameters(NodeUncordonParameters uncordonParameters) {
            this.uncordonParameters = uncordonParameters;
            return this;
        }

        public NodeOperationParameters build() {
            return new NodeOperationParameters(this);
        } 

    } 

}
