// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SchemaDetailRequest} extends {@link RequestModel}
 *
 * <p>SchemaDetailRequest</p>
 */
public class SchemaDetailRequest extends Request {
    @Body
    @NameInMap("Bizid")
    private String bizid;

    @Body
    @NameInMap("SchemaId")
    private Long schemaId;

    private SchemaDetailRequest(Builder builder) {
        super(builder);
        this.bizid = builder.bizid;
        this.schemaId = builder.schemaId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SchemaDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizid
     */
    public String getBizid() {
        return this.bizid;
    }

    /**
     * @return schemaId
     */
    public Long getSchemaId() {
        return this.schemaId;
    }

    public static final class Builder extends Request.Builder<SchemaDetailRequest, Builder> {
        private String bizid; 
        private Long schemaId; 

        private Builder() {
            super();
        } 

        private Builder(SchemaDetailRequest request) {
            super(request);
            this.bizid = request.bizid;
            this.schemaId = request.schemaId;
        } 

        /**
         * Bizid.
         */
        public Builder bizid(String bizid) {
            this.putBodyParameter("Bizid", bizid);
            this.bizid = bizid;
            return this;
        }

        /**
         * SchemaId.
         */
        public Builder schemaId(Long schemaId) {
            this.putBodyParameter("SchemaId", schemaId);
            this.schemaId = schemaId;
            return this;
        }

        @Override
        public SchemaDetailRequest build() {
            return new SchemaDetailRequest(this);
        } 

    } 

}
