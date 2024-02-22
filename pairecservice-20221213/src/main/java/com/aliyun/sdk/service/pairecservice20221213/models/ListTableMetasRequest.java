// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTableMetasRequest} extends {@link RequestModel}
 *
 * <p>ListTableMetasRequest</p>
 */
public class ListTableMetasRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Module")
    @Validation(required = true)
    private String module;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("Type")
    private String type;

    private ListTableMetasRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.module = builder.module;
        this.name = builder.name;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTableMetasRequest create() {
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
     * @return module
     */
    public String getModule() {
        return this.module;
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListTableMetasRequest, Builder> {
        private String instanceId; 
        private String module; 
        private String name; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListTableMetasRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.module = request.module;
            this.name = request.name;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.type = request.type;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Module.
         */
        public Builder module(String module) {
            this.putQueryParameter("Module", module);
            this.module = module;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListTableMetasRequest build() {
            return new ListTableMetasRequest(this);
        } 

    } 

}
