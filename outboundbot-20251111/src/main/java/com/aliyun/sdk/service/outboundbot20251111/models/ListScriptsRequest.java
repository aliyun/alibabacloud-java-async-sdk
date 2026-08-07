// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20251111.models;

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
 * {@link ListScriptsRequest} extends {@link RequestModel}
 *
 * <p>ListScriptsRequest</p>
 */
public class ListScriptsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PublishOnly")
    private Boolean publishOnly;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ScriptIds")
    private java.util.List<String> scriptIds;

    private ListScriptsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.name = builder.name;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.publishOnly = builder.publishOnly;
        this.scriptIds = builder.scriptIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListScriptsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return publishOnly
     */
    public Boolean getPublishOnly() {
        return this.publishOnly;
    }

    /**
     * @return scriptIds
     */
    public java.util.List<String> getScriptIds() {
        return this.scriptIds;
    }

    public static final class Builder extends Request.Builder<ListScriptsRequest, Builder> {
        private String instanceId; 
        private String name; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Boolean publishOnly; 
        private java.util.List<String> scriptIds; 

        private Builder() {
            super();
        } 

        private Builder(ListScriptsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.name = request.name;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.publishOnly = request.publishOnly;
            this.scriptIds = request.scriptIds;
        } 

        /**
         * <p>实例ID</p>
         * 
         * <strong>example:</strong>
         * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>搜索关键词</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>页码，从1开始</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>每页记录数</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>是否仅返回已发布的场景</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder publishOnly(Boolean publishOnly) {
            this.putBodyParameter("PublishOnly", publishOnly);
            this.publishOnly = publishOnly;
            return this;
        }

        /**
         * <p>场景ID列表</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder scriptIds(java.util.List<String> scriptIds) {
            String scriptIdsShrink = shrink(scriptIds, "ScriptIds", "json");
            this.putBodyParameter("ScriptIds", scriptIdsShrink);
            this.scriptIds = scriptIds;
            return this;
        }

        @Override
        public ListScriptsRequest build() {
            return new ListScriptsRequest(this);
        } 

    } 

}
