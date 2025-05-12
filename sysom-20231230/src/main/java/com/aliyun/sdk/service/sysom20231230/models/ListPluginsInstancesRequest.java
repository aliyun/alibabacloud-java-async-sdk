// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link ListPluginsInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListPluginsInstancesRequest</p>
 */
public class ListPluginsInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("current")
    private Long current;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("instance_id_name")
    private String instanceIdName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("instance_tag")
    private String instanceTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("operation_type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("plugin_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pluginId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("region")
    @com.aliyun.core.annotation.Validation(required = true)
    private String region;

    private ListPluginsInstancesRequest(Builder builder) {
        super(builder);
        this.current = builder.current;
        this.instanceIdName = builder.instanceIdName;
        this.instanceTag = builder.instanceTag;
        this.operationType = builder.operationType;
        this.pageSize = builder.pageSize;
        this.pluginId = builder.pluginId;
        this.region = builder.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPluginsInstancesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return current
     */
    public Long getCurrent() {
        return this.current;
    }

    /**
     * @return instanceIdName
     */
    public String getInstanceIdName() {
        return this.instanceIdName;
    }

    /**
     * @return instanceTag
     */
    public String getInstanceTag() {
        return this.instanceTag;
    }

    /**
     * @return operationType
     */
    public String getOperationType() {
        return this.operationType;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return pluginId
     */
    public String getPluginId() {
        return this.pluginId;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    public static final class Builder extends Request.Builder<ListPluginsInstancesRequest, Builder> {
        private Long current; 
        private String instanceIdName; 
        private String instanceTag; 
        private String operationType; 
        private Long pageSize; 
        private String pluginId; 
        private String region; 

        private Builder() {
            super();
        } 

        private Builder(ListPluginsInstancesRequest request) {
            super(request);
            this.current = request.current;
            this.instanceIdName = request.instanceIdName;
            this.instanceTag = request.instanceTag;
            this.operationType = request.operationType;
            this.pageSize = request.pageSize;
            this.pluginId = request.pluginId;
            this.region = request.region;
        } 

        /**
         * current.
         */
        public Builder current(Long current) {
            this.putQueryParameter("current", current);
            this.current = current;
            return this;
        }

        /**
         * instance_id_name.
         */
        public Builder instanceIdName(String instanceIdName) {
            this.putQueryParameter("instance_id_name", instanceIdName);
            this.instanceIdName = instanceIdName;
            return this;
        }

        /**
         * instance_tag.
         */
        public Builder instanceTag(String instanceTag) {
            this.putQueryParameter("instance_tag", instanceTag);
            this.instanceTag = instanceTag;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>install</p>
         */
        public Builder operationType(String operationType) {
            this.putQueryParameter("operation_type", operationType);
            this.operationType = operationType;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>74a86327-3170-412c-8e67-da3389ec56a9</p>
         */
        public Builder pluginId(String pluginId) {
            this.putQueryParameter("plugin_id", pluginId);
            this.pluginId = pluginId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("region", region);
            this.region = region;
            return this;
        }

        @Override
        public ListPluginsInstancesRequest build() {
            return new ListPluginsInstancesRequest(this);
        } 

    } 

}
