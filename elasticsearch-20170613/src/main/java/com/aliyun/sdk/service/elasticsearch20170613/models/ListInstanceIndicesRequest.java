// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstanceIndicesRequest} extends {@link RequestModel}
 *
 * <p>ListInstanceIndicesRequest</p>
 */
public class ListInstanceIndicesRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("all")
    private Boolean all;

    @Body
    @NameInMap("body")
    private String body;

    @Query
    @NameInMap("isManaged")
    private Boolean isManaged;

    @Query
    @NameInMap("isOpenstore")
    private Boolean isOpenstore;

    @Query
    @NameInMap("name")
    private String name;

    @Query
    @NameInMap("page")
    private Integer page;

    @Query
    @NameInMap("size")
    private Integer size;

    private ListInstanceIndicesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.all = builder.all;
        this.body = builder.body;
        this.isManaged = builder.isManaged;
        this.isOpenstore = builder.isOpenstore;
        this.name = builder.name;
        this.page = builder.page;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceIndicesRequest create() {
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
     * @return all
     */
    public Boolean getAll() {
        return this.all;
    }

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    /**
     * @return isManaged
     */
    public Boolean getIsManaged() {
        return this.isManaged;
    }

    /**
     * @return isOpenstore
     */
    public Boolean getIsOpenstore() {
        return this.isOpenstore;
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

    public static final class Builder extends Request.Builder<ListInstanceIndicesRequest, Builder> {
        private String instanceId; 
        private Boolean all; 
        private String body; 
        private Boolean isManaged; 
        private Boolean isOpenstore; 
        private String name; 
        private Integer page; 
        private Integer size; 

        private Builder() {
            super();
        } 

        private Builder(ListInstanceIndicesRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.all = request.all;
            this.body = request.body;
            this.isManaged = request.isManaged;
            this.isOpenstore = request.isOpenstore;
            this.name = request.name;
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
         * all.
         */
        public Builder all(Boolean all) {
            this.putQueryParameter("all", all);
            this.all = all;
            return this;
        }

        /**
         * body.
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * isManaged.
         */
        public Builder isManaged(Boolean isManaged) {
            this.putQueryParameter("isManaged", isManaged);
            this.isManaged = isManaged;
            return this;
        }

        /**
         * isOpenstore.
         */
        public Builder isOpenstore(Boolean isOpenstore) {
            this.putQueryParameter("isOpenstore", isOpenstore);
            this.isOpenstore = isOpenstore;
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

        @Override
        public ListInstanceIndicesRequest build() {
            return new ListInstanceIndicesRequest(this);
        } 

    } 

}
