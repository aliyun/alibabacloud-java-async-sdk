// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLogstashPluginsRequest} extends {@link RequestModel}
 *
 * <p>ListLogstashPluginsRequest</p>
 */
public class ListLogstashPluginsRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("name")
    private String name;

    @Query
    @NameInMap("page")
    @Validation(maximum = 200, minimum = 1)
    private Integer page;

    @Query
    @NameInMap("size")
    @Validation(maximum = 200, minimum = 1)
    private Integer size;

    @Query
    @NameInMap("source")
    private String source;

    private ListLogstashPluginsRequest(Builder builder) {
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

    public static ListLogstashPluginsRequest create() {
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
    public Integer getPage() {
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

    public static final class Builder extends Request.Builder<ListLogstashPluginsRequest, Builder> {
        private String instanceId; 
        private String name; 
        private Integer page; 
        private Integer size; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(ListLogstashPluginsRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.name = response.name;
            this.page = response.page;
            this.size = response.size;
            this.source = response.source;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * page.
         */
        public Builder page(Integer page) {
            this.putQueryParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * size.
         */
        public Builder size(Integer size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        /**
         * source.
         */
        public Builder source(String source) {
            this.putQueryParameter("source", source);
            this.source = source;
            return this;
        }

        @Override
        public ListLogstashPluginsRequest build() {
            return new ListLogstashPluginsRequest(this);
        } 

    } 

}
