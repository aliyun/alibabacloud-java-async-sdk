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
 * {@link ListPolicyClassesRequest} extends {@link RequestModel}
 *
 * <p>ListPolicyClassesRequest</p>
 */
public class ListPolicyClassesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("attachResourceType")
    private String attachResourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("direction")
    private String direction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private ListPolicyClassesRequest(Builder builder) {
        super(builder);
        this.attachResourceType = builder.attachResourceType;
        this.direction = builder.direction;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPolicyClassesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attachResourceType
     */
    public String getAttachResourceType() {
        return this.attachResourceType;
    }

    /**
     * @return direction
     */
    public String getDirection() {
        return this.direction;
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

    public static final class Builder extends Request.Builder<ListPolicyClassesRequest, Builder> {
        private String attachResourceType; 
        private String direction; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListPolicyClassesRequest request) {
            super(request);
            this.attachResourceType = request.attachResourceType;
            this.direction = request.direction;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.type = request.type;
        } 

        /**
         * attachResourceType.
         */
        public Builder attachResourceType(String attachResourceType) {
            this.putQueryParameter("attachResourceType", attachResourceType);
            this.attachResourceType = attachResourceType;
            return this;
        }

        /**
         * direction.
         */
        public Builder direction(String direction) {
            this.putQueryParameter("direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
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
        public ListPolicyClassesRequest build() {
            return new ListPolicyClassesRequest(this);
        } 

    } 

}
