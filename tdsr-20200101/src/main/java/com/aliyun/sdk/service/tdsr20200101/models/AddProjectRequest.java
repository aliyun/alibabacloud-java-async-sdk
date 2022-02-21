// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddProjectRequest} extends {@link RequestModel}
 *
 * <p>AddProjectRequest</p>
 */
public class AddProjectRequest extends Request {
    @Query
    @NameInMap("BusinessId")
    private Long businessId;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    private AddProjectRequest(Builder builder) {
        super(builder);
        this.businessId = builder.businessId;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddProjectRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessId
     */
    public Long getBusinessId() {
        return this.businessId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<AddProjectRequest, Builder> {
        private Long businessId; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(AddProjectRequest response) {
            super(response);
            this.businessId = response.businessId;
            this.name = response.name;
        } 

        /**
         * 业务id
         */
        public Builder businessId(Long businessId) {
            this.putQueryParameter("BusinessId", businessId);
            this.businessId = businessId;
            return this;
        }

        /**
         * 项目名称
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public AddProjectRequest build() {
            return new AddProjectRequest(this);
        } 

    } 

}
