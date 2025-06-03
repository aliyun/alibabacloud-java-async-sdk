// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apds20220331.models;

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
 * {@link CreateMigrationGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateMigrationGroupRequest</p>
 */
public class CreateMigrationGroupRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("extra")
    private String extra;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("id")
    private Integer id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    private CreateMigrationGroupRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.extra = builder.extra;
        this.id = builder.id;
        this.name = builder.name;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMigrationGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return extra
     */
    public String getExtra() {
        return this.extra;
    }

    /**
     * @return id
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateMigrationGroupRequest, Builder> {
        private String description; 
        private String extra; 
        private Integer id; 
        private String name; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateMigrationGroupRequest request) {
            super(request);
            this.description = request.description;
            this.extra = request.extra;
            this.id = request.id;
            this.name = request.name;
            this.regionId = request.regionId;
        } 

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * extra.
         */
        public Builder extra(String extra) {
            this.putBodyParameter("extra", extra);
            this.extra = extra;
            return this;
        }

        /**
         * id.
         */
        public Builder id(Integer id) {
            this.putBodyParameter("id", id);
            this.id = id;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateMigrationGroupRequest build() {
            return new CreateMigrationGroupRequest(this);
        } 

    } 

}
