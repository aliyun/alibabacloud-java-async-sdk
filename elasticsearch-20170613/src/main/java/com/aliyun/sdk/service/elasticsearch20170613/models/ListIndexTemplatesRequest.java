// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIndexTemplatesRequest} extends {@link RequestModel}
 *
 * <p>ListIndexTemplatesRequest</p>
 */
public class ListIndexTemplatesRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("indexTemplate")
    private String indexTemplate;

    @Query
    @NameInMap("page")
    private Integer page;

    @Query
    @NameInMap("size")
    private Integer size;

    private ListIndexTemplatesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.indexTemplate = builder.indexTemplate;
        this.page = builder.page;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIndexTemplatesRequest create() {
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
     * @return indexTemplate
     */
    public String getIndexTemplate() {
        return this.indexTemplate;
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

    public static final class Builder extends Request.Builder<ListIndexTemplatesRequest, Builder> {
        private String instanceId; 
        private String indexTemplate; 
        private Integer page; 
        private Integer size; 

        private Builder() {
            super();
        } 

        private Builder(ListIndexTemplatesRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.indexTemplate = request.indexTemplate;
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
         * indexTemplate.
         */
        public Builder indexTemplate(String indexTemplate) {
            this.putQueryParameter("indexTemplate", indexTemplate);
            this.indexTemplate = indexTemplate;
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

        @Override
        public ListIndexTemplatesRequest build() {
            return new ListIndexTemplatesRequest(this);
        } 

    } 

}
