// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link ListMcpServersRequest} extends {@link RequestModel}
 *
 * <p>ListMcpServersRequest</p>
 */
public class ListMcpServersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("createFromTypes")
    private String createFromTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("deployStatuses")
    private String deployStatuses;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nameLike")
    private String nameLike;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private ListMcpServersRequest(Builder builder) {
        super(builder);
        this.createFromTypes = builder.createFromTypes;
        this.deployStatuses = builder.deployStatuses;
        this.gatewayId = builder.gatewayId;
        this.nameLike = builder.nameLike;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMcpServersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createFromTypes
     */
    public String getCreateFromTypes() {
        return this.createFromTypes;
    }

    /**
     * @return deployStatuses
     */
    public String getDeployStatuses() {
        return this.deployStatuses;
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return nameLike
     */
    public String getNameLike() {
        return this.nameLike;
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

    public static final class Builder extends Request.Builder<ListMcpServersRequest, Builder> {
        private String createFromTypes; 
        private String deployStatuses; 
        private String gatewayId; 
        private String nameLike; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListMcpServersRequest request) {
            super(request);
            this.createFromTypes = request.createFromTypes;
            this.deployStatuses = request.deployStatuses;
            this.gatewayId = request.gatewayId;
            this.nameLike = request.nameLike;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.type = request.type;
        } 

        /**
         * createFromTypes.
         */
        public Builder createFromTypes(String createFromTypes) {
            this.putQueryParameter("createFromTypes", createFromTypes);
            this.createFromTypes = createFromTypes;
            return this;
        }

        /**
         * deployStatuses.
         */
        public Builder deployStatuses(String deployStatuses) {
            this.putQueryParameter("deployStatuses", deployStatuses);
            this.deployStatuses = deployStatuses;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-co370icmjeu****</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.putQueryParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * nameLike.
         */
        public Builder nameLike(String nameLike) {
            this.putQueryParameter("nameLike", nameLike);
            this.nameLike = nameLike;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListMcpServersRequest build() {
            return new ListMcpServersRequest(this);
        } 

    } 

}
