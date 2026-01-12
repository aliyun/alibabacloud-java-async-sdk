// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20221111.models;

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
 * {@link FindSvcMapBindRequest} extends {@link RequestModel}
 *
 * <p>FindSvcMapBindRequest</p>
 */
public class FindSvcMapBindRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Current")
    private Integer current;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JwtToken")
    private String jwtToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Size")
    private Integer size;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Sort")
    private String sort;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SortField")
    private String sortField;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SvcId")
    private Long svcId;

    private FindSvcMapBindRequest(Builder builder) {
        super(builder);
        this.current = builder.current;
        this.jwtToken = builder.jwtToken;
        this.size = builder.size;
        this.sort = builder.sort;
        this.sortField = builder.sortField;
        this.svcId = builder.svcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FindSvcMapBindRequest create() {
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

    /**
     * @return svcId
     */
    public Long getSvcId() {
        return this.svcId;
    }

    public static final class Builder extends Request.Builder<FindSvcMapBindRequest, Builder> {
        private Integer current; 
        private String jwtToken; 
        private Integer size; 
        private String sort; 
        private String sortField; 
        private Long svcId; 

        private Builder() {
            super();
        } 

        private Builder(FindSvcMapBindRequest request) {
            super(request);
            this.current = request.current;
            this.jwtToken = request.jwtToken;
            this.size = request.size;
            this.sort = request.sort;
            this.sortField = request.sortField;
            this.svcId = request.svcId;
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

        /**
         * SvcId.
         */
        public Builder svcId(Long svcId) {
            this.putBodyParameter("SvcId", svcId);
            this.svcId = svcId;
            return this;
        }

        @Override
        public FindSvcMapBindRequest build() {
            return new FindSvcMapBindRequest(this);
        } 

    } 

}
