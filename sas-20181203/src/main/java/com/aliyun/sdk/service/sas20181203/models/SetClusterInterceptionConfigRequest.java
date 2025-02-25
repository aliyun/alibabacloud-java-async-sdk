// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link SetClusterInterceptionConfigRequest} extends {@link RequestModel}
 *
 * <p>SetClusterInterceptionConfigRequest</p>
 */
public class SetClusterInterceptionConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SwitchOn")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer switchOn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SwitchType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer switchType;

    private SetClusterInterceptionConfigRequest(Builder builder) {
        super(builder);
        this.clusterIds = builder.clusterIds;
        this.switchOn = builder.switchOn;
        this.switchType = builder.switchType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetClusterInterceptionConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterIds
     */
    public String getClusterIds() {
        return this.clusterIds;
    }

    /**
     * @return switchOn
     */
    public Integer getSwitchOn() {
        return this.switchOn;
    }

    /**
     * @return switchType
     */
    public Integer getSwitchType() {
        return this.switchType;
    }

    public static final class Builder extends Request.Builder<SetClusterInterceptionConfigRequest, Builder> {
        private String clusterIds; 
        private Integer switchOn; 
        private Integer switchType; 

        private Builder() {
            super();
        } 

        private Builder(SetClusterInterceptionConfigRequest request) {
            super(request);
            this.clusterIds = request.clusterIds;
            this.switchOn = request.switchOn;
            this.switchType = request.switchType;
        } 

        /**
         * <p>The ID of the cluster. Separate multiple cluster IDs with commas (,).</p>
         * <blockquote>
         * <p>You can call the <a href="~~ListClusterInterceptionConfig~~">ListClusterInterceptionConfig</a> operation to query the IDs of clusters.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c60b77fe62093480db6164a3c2fa****</p>
         */
        public Builder clusterIds(String clusterIds) {
            this.putQueryParameter("ClusterIds", clusterIds);
            this.clusterIds = clusterIds;
            return this;
        }

        /**
         * <p>Specifies whether to turn on the switch. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: yes</li>
         * <li><strong>0</strong>: no</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder switchOn(Integer switchOn) {
            this.putQueryParameter("SwitchOn", switchOn);
            this.switchOn = switchOn;
            return this;
        }

        /**
         * <p>The type of the switch that you want to configure. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: the interception switch</li>
         * <li><strong>1</strong>: the interception type switch</li>
         * <li><strong>2</strong>: the interception history switch</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder switchType(Integer switchType) {
            this.putQueryParameter("SwitchType", switchType);
            this.switchType = switchType;
            return this;
        }

        @Override
        public SetClusterInterceptionConfigRequest build() {
            return new SetClusterInterceptionConfigRequest(this);
        } 

    } 

}
