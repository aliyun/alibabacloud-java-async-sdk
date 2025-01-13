// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link ListNodeInputOrOutputRequest} extends {@link RequestModel}
 *
 * <p>ListNodeInputOrOutputRequest</p>
 */
public class ListNodeInputOrOutputRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IoType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ioType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeId")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 2)
    private Long nodeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectEnv")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectEnv;

    private ListNodeInputOrOutputRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.ioType = builder.ioType;
        this.nodeId = builder.nodeId;
        this.projectEnv = builder.projectEnv;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNodeInputOrOutputRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return ioType
     */
    public String getIoType() {
        return this.ioType;
    }

    /**
     * @return nodeId
     */
    public Long getNodeId() {
        return this.nodeId;
    }

    /**
     * @return projectEnv
     */
    public String getProjectEnv() {
        return this.projectEnv;
    }

    public static final class Builder extends Request.Builder<ListNodeInputOrOutputRequest, Builder> {
        private String regionId; 
        private String ioType; 
        private Long nodeId; 
        private String projectEnv; 

        private Builder() {
            super();
        } 

        private Builder(ListNodeInputOrOutputRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.ioType = request.ioType;
            this.nodeId = request.nodeId;
            this.projectEnv = request.projectEnv;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The type of node that you want to query. Valid values:</p>
         * <ul>
         * <li>input: ancestor node</li>
         * <li>output: descendant node</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>output</p>
         */
        public Builder ioType(String ioType) {
            this.putBodyParameter("IoType", ioType);
            this.ioType = ioType;
            return this;
        }

        /**
         * <p>The node ID. You can call the <a href="https://help.aliyun.com/document_detail/173979.html">ListNodes</a> operation to query the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12314567</p>
         */
        public Builder nodeId(Long nodeId) {
            this.putBodyParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * <p>The environment of the workspace. Valid values: DEV and PROD.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PROD</p>
         */
        public Builder projectEnv(String projectEnv) {
            this.putBodyParameter("ProjectEnv", projectEnv);
            this.projectEnv = projectEnv;
            return this;
        }

        @Override
        public ListNodeInputOrOutputRequest build() {
            return new ListNodeInputOrOutputRequest(this);
        } 

    } 

}
