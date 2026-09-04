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
 * {@link RLFlowSankey} extends {@link TeaModel}
 *
 * <p>RLFlowSankey</p>
 */
public class RLFlowSankey extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Columns")
    private java.util.List<RLFlowSankeyColumn> columns;

    @com.aliyun.core.annotation.NameInMap("Exits")
    private java.util.List<RLFlowSankeyExit> exits;

    private RLFlowSankey(Builder builder) {
        this.columns = builder.columns;
        this.exits = builder.exits;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RLFlowSankey create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return columns
     */
    public java.util.List<RLFlowSankeyColumn> getColumns() {
        return this.columns;
    }

    /**
     * @return exits
     */
    public java.util.List<RLFlowSankeyExit> getExits() {
        return this.exits;
    }

    public static final class Builder {
        private java.util.List<RLFlowSankeyColumn> columns; 
        private java.util.List<RLFlowSankeyExit> exits; 

        private Builder() {
        } 

        private Builder(RLFlowSankey model) {
            this.columns = model.columns;
            this.exits = model.exits;
        } 

        /**
         * <p>主链 5 列</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Key&quot;:&quot;traj&quot;,&quot;Label&quot;:&quot;生成轨迹&quot;,&quot;Count&quot;:96}]</p>
         */
        public Builder columns(java.util.List<RLFlowSankeyColumn> columns) {
            this.columns = columns;
            return this;
        }

        /**
         * <p>各列的流出边</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;From&quot;:&quot;run&quot;,&quot;FromIdx&quot;:1,&quot;Label&quot;:&quot;未启动&quot;,&quot;Count&quot;:0}]</p>
         */
        public Builder exits(java.util.List<RLFlowSankeyExit> exits) {
            this.exits = exits;
            return this;
        }

        public RLFlowSankey build() {
            return new RLFlowSankey(this);
        } 

    } 

}
