// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link ListAICoachScriptPageRequest} extends {@link RequestModel}
 *
 * <p>ListAICoachScriptPageRequest</p>
 */
public class ListAICoachScriptPageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("status")
    private Integer status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("type")
    private Integer type;

    private ListAICoachScriptPageRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.status = builder.status;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAICoachScriptPageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListAICoachScriptPageRequest, Builder> {
        private String name; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Integer status; 
        private Integer type; 

        private Builder() {
            super();
        } 

        private Builder(ListAICoachScriptPageRequest request) {
            super(request);
            this.name = request.name;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.status = request.status;
            this.type = request.type;
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
         * status.
         */
        public Builder status(Integer status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * type.
         */
        public Builder type(Integer type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListAICoachScriptPageRequest build() {
            return new ListAICoachScriptPageRequest(this);
        } 

    } 

}
