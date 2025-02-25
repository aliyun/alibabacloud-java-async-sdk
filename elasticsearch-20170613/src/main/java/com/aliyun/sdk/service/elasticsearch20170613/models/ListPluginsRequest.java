// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListPluginsRequest} extends {@link RequestModel}
 *
 * <p>ListPluginsRequest</p>
 */
public class ListPluginsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page")
    private String page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("size")
    private Integer size;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("source")
    private String source;

    private ListPluginsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.name = builder.name;
        this.page = builder.page;
        this.size = builder.size;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPluginsRequest create() {
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
     * @return page
     */
    public String getPage() {
        return this.page;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<ListPluginsRequest, Builder> {
        private String instanceId; 
        private String name; 
        private String page; 
        private Integer size; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(ListPluginsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.name = request.name;
            this.page = request.page;
            this.size = request.size;
            this.source = request.source;
        } 

        /**
         * <p>10</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-nif1q9o8r0008****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>SYSTEM</p>
         * 
         * <strong>example:</strong>
         * <p>analysis-ik</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(String page) {
            this.putQueryParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * <p>The header of the response.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder size(Integer size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("source", source);
            this.source = source;
            return this;
        }

        @Override
        public ListPluginsRequest build() {
            return new ListPluginsRequest(this);
        } 

    } 

}
