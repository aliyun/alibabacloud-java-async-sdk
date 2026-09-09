// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starops20260428.models;

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
 * {@link UpsertDigitalEmployeeUmodelCommonSchemaRefRequest} extends {@link RequestModel}
 *
 * <p>UpsertDigitalEmployeeUmodelCommonSchemaRefRequest</p>
 */
public class UpsertDigitalEmployeeUmodelCommonSchemaRefRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String name;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("group")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128)
    private String group;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("version")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128)
    private String version;

    private UpsertDigitalEmployeeUmodelCommonSchemaRefRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.group = builder.group;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpsertDigitalEmployeeUmodelCommonSchemaRefRequest create() {
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
     * @return group
     */
    public String getGroup() {
        return this.group;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<UpsertDigitalEmployeeUmodelCommonSchemaRefRequest, Builder> {
        private String name; 
        private String group; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(UpsertDigitalEmployeeUmodelCommonSchemaRefRequest request) {
            super(request);
            this.name = request.name;
            this.group = request.group;
            this.version = request.version;
        } 

        /**
         * <p>The name of the digital employee to which the UModel belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sample-agent</p>
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The public schema group to create or update.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>starops</p>
         */
        public Builder group(String group) {
            this.putPathParameter("group", group);
            this.group = group;
            return this;
        }

        /**
         * <p>The version of the public schema.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        public Builder version(String version) {
            this.putBodyParameter("version", version);
            this.version = version;
            return this;
        }

        @Override
        public UpsertDigitalEmployeeUmodelCommonSchemaRefRequest build() {
            return new UpsertDigitalEmployeeUmodelCommonSchemaRefRequest(this);
        } 

    } 

}
