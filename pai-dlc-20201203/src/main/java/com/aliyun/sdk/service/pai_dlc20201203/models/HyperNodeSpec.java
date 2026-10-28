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
 * {@link HyperNodeSpec} extends {@link TeaModel}
 *
 * <p>HyperNodeSpec</p>
 */
public class HyperNodeSpec extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HyperNodeName")
    private String hyperNodeName;

    @com.aliyun.core.annotation.NameInMap("NodeNames")
    private String nodeNames;

    private HyperNodeSpec(Builder builder) {
        this.hyperNodeName = builder.hyperNodeName;
        this.nodeNames = builder.nodeNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HyperNodeSpec create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hyperNodeName
     */
    public String getHyperNodeName() {
        return this.hyperNodeName;
    }

    /**
     * @return nodeNames
     */
    public String getNodeNames() {
        return this.nodeNames;
    }

    public static final class Builder {
        private String hyperNodeName; 
        private String nodeNames; 

        private Builder() {
        } 

        private Builder(HyperNodeSpec model) {
            this.hyperNodeName = model.hyperNodeName;
            this.nodeNames = model.nodeNames;
        } 

        /**
         * <p>The name of the HyperNode.</p>
         * 
         * <strong>example:</strong>
         * <p>mg1234567</p>
         */
        public Builder hyperNodeName(String hyperNodeName) {
            this.hyperNodeName = hyperNodeName;
            return this;
        }

        /**
         * <p>The comma-separated names of the specified nodes in the HyperNode. If you leave this parameter empty, all nodes in the HyperNode are specified.</p>
         * 
         * <strong>example:</strong>
         * <p>lingjxxxxxxxx</p>
         */
        public Builder nodeNames(String nodeNames) {
            this.nodeNames = nodeNames;
            return this;
        }

        public HyperNodeSpec build() {
            return new HyperNodeSpec(this);
        } 

    } 

}
