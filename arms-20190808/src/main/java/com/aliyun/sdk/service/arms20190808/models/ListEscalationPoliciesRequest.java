// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEscalationPoliciesRequest} extends {@link RequestModel}
 *
 * <p>ListEscalationPoliciesRequest</p>
 */
public class ListEscalationPoliciesRequest extends Request {
    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("Page")
    @Validation(required = true)
    private Long page;

    @Query
    @NameInMap("Size")
    @Validation(required = true)
    private Long size;

    private ListEscalationPoliciesRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.page = builder.page;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEscalationPoliciesRequest create() {
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
     * @return page
     */
    public Long getPage() {
        return this.page;
    }

    /**
     * @return size
     */
    public Long getSize() {
        return this.size;
    }

    public static final class Builder extends Request.Builder<ListEscalationPoliciesRequest, Builder> {
        private String name; 
        private Long page; 
        private Long size; 

        private Builder() {
            super();
        } 

        private Builder(ListEscalationPoliciesRequest request) {
            super(request);
            this.name = request.name;
            this.page = request.page;
            this.size = request.size;
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
         * 页数
         */
        public Builder page(Long page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * 每页展示数目
         */
        public Builder size(Long size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        @Override
        public ListEscalationPoliciesRequest build() {
            return new ListEscalationPoliciesRequest(this);
        } 

    } 

}
