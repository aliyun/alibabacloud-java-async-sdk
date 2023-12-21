// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLocationServiceRequest} extends {@link RequestModel}
 *
 * <p>ListLocationServiceRequest</p>
 */
public class ListLocationServiceRequest extends Request {
    @Body
    @NameInMap("Current")
    private Integer current;

    @Body
    @NameInMap("JwtToken")
    private String jwtToken;

    @Body
    @NameInMap("Size")
    private Integer size;

    @Body
    @NameInMap("Sort")
    private String sort;

    @Body
    @NameInMap("SortField")
    private String sortField;

    private ListLocationServiceRequest(Builder builder) {
        super(builder);
        this.current = builder.current;
        this.jwtToken = builder.jwtToken;
        this.size = builder.size;
        this.sort = builder.sort;
        this.sortField = builder.sortField;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLocationServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return current
     */
    public Integer getCurrent() {
        return this.current;
    }

    /**
     * @return jwtToken
     */
    public String getJwtToken() {
        return this.jwtToken;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return sort
     */
    public String getSort() {
        return this.sort;
    }

    /**
     * @return sortField
     */
    public String getSortField() {
        return this.sortField;
    }

    public static final class Builder extends Request.Builder<ListLocationServiceRequest, Builder> {
        private Integer current; 
        private String jwtToken; 
        private Integer size; 
        private String sort; 
        private String sortField; 

        private Builder() {
            super();
        } 

        private Builder(ListLocationServiceRequest request) {
            super(request);
            this.current = request.current;
            this.jwtToken = request.jwtToken;
            this.size = request.size;
            this.sort = request.sort;
            this.sortField = request.sortField;
        } 

        /**
         * Current.
         */
        public Builder current(Integer current) {
            this.putBodyParameter("Current", current);
            this.current = current;
            return this;
        }

        /**
         * JwtToken.
         */
        public Builder jwtToken(String jwtToken) {
            this.putBodyParameter("JwtToken", jwtToken);
            this.jwtToken = jwtToken;
            return this;
        }

        /**
         * Size.
         */
        public Builder size(Integer size) {
            this.putBodyParameter("Size", size);
            this.size = size;
            return this;
        }

        /**
         * Sort.
         */
        public Builder sort(String sort) {
            this.putBodyParameter("Sort", sort);
            this.sort = sort;
            return this;
        }

        /**
         * SortField.
         */
        public Builder sortField(String sortField) {
            this.putBodyParameter("SortField", sortField);
            this.sortField = sortField;
            return this;
        }

        @Override
        public ListLocationServiceRequest build() {
            return new ListLocationServiceRequest(this);
        } 

    } 

}
