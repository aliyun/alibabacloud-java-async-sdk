// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPluginsRequest} extends {@link RequestModel}
 *
 * <p>ListPluginsRequest</p>
 */
public class ListPluginsRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("name")
    private String name;

    @Query
    @NameInMap("page")
    private String page;

    @Query
    @NameInMap("size")
    private Integer size;

    @Query
    @NameInMap("source")
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
         * 10
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * SYSTEM
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder page(String page) {
            this.putQueryParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * The header of the response.
         */
        public Builder size(Integer size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        /**
         * The total number of entries returned.
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
