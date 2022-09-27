// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListKibanaPluginsRequest} extends {@link RequestModel}
 *
 * <p>ListKibanaPluginsRequest</p>
 */
public class ListKibanaPluginsRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("page")
    private String page;

    @Query
    @NameInMap("size")
    private Integer size;

    private ListKibanaPluginsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.page = builder.page;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListKibanaPluginsRequest create() {
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

    public static final class Builder extends Request.Builder<ListKibanaPluginsRequest, Builder> {
        private String instanceId; 
        private String page; 
        private Integer size; 

        private Builder() {
            super();
        } 

        private Builder(ListKibanaPluginsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.page = request.page;
            this.size = request.size;
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
         * page.
         */
        public Builder page(String page) {
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

        @Override
        public ListKibanaPluginsRequest build() {
            return new ListKibanaPluginsRequest(this);
        } 

    } 

}
