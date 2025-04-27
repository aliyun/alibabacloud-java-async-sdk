// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link ListInstanceIndicesRequest} extends {@link RequestModel}
 *
 * <p>ListInstanceIndicesRequest</p>
 */
public class ListInstanceIndicesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("all")
    private Boolean all;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("isManaged")
    private Boolean isManaged;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("isOpenstore")
    private Boolean isOpenstore;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page")
    private Integer page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("size")
    private Integer size;

    private ListInstanceIndicesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.all = builder.all;
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
            this.isManaged = request.isManaged;
            this.isOpenstore = request.isOpenstore;
            this.name = request.name;
            this.page = request.page;
            this.size = request.size;
        } 

        /**
         * <p>false</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-tl329rbpc0001****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>false</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder all(Boolean all) {
            this.putQueryParameter("all", all);
            this.all = all;
            return this;
        }

        /**
         * <p>15</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isManaged(Boolean isManaged) {
            this.putQueryParameter("isManaged", isManaged);
            this.isManaged = isManaged;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isOpenstore(Boolean isOpenstore) {
            this.putQueryParameter("isOpenstore", isOpenstore);
            this.isOpenstore = isOpenstore;
            return this;
        }

        /**
         * <p>1</p>
         * 
         * <strong>example:</strong>
         * <p>log-0001</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The header of the response.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Integer page) {
            this.putQueryParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * <p>The total size of the index in Cloud Hosting. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
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
