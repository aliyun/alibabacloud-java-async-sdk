// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link ModifyHiveAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyHiveAttributeRequest</p>
 */
public class ModifyHiveAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HiveId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hiveId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    private ModifyHiveAttributeRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.hiveId = builder.hiveId;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyHiveAttributeRequest create() {
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
     * @return hiveId
     */
    public String getHiveId() {
        return this.hiveId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<ModifyHiveAttributeRequest, Builder> {
        private String description; 
        private String hiveId; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(ModifyHiveAttributeRequest request) {
            super(request);
            this.description = request.description;
            this.hiveId = request.hiveId;
            this.name = request.name;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hive-3b506f0868a7451ba15e0e890706033a</p>
         */
        public Builder hiveId(String hiveId) {
            this.putQueryParameter("HiveId", hiveId);
            this.hiveId = hiveId;
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

        @Override
        public ModifyHiveAttributeRequest build() {
            return new ModifyHiveAttributeRequest(this);
        } 

    } 

}
