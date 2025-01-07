// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link AddInvoiceEntityRequest} extends {@link RequestModel}
 *
 * <p>AddInvoiceEntityRequest</p>
 */
public class AddInvoiceEntityRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("entities")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Entities> entities;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("third_part_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String thirdPartId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private AddInvoiceEntityRequest(Builder builder) {
        super(builder);
        this.entities = builder.entities;
        this.thirdPartId = builder.thirdPartId;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddInvoiceEntityRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return entities
     */
    public java.util.List<Entities> getEntities() {
        return this.entities;
    }

    /**
     * @return thirdPartId
     */
    public String getThirdPartId() {
        return this.thirdPartId;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<AddInvoiceEntityRequest, Builder> {
        private java.util.List<Entities> entities; 
        private String thirdPartId; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(AddInvoiceEntityRequest request) {
            super(request);
            this.entities = request.entities;
            this.thirdPartId = request.thirdPartId;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder entities(java.util.List<Entities> entities) {
            String entitiesShrink = shrink(entities, "entities", "json");
            this.putBodyParameter("entities", entitiesShrink);
            this.entities = entities;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4854821</p>
         */
        public Builder thirdPartId(String thirdPartId) {
            this.putBodyParameter("third_part_id", thirdPartId);
            this.thirdPartId = thirdPartId;
            return this;
        }

        /**
         * x-acs-btrip-corp-token.
         */
        public Builder xAcsBtripCorpToken(String xAcsBtripCorpToken) {
            this.putHeaderParameter("x-acs-btrip-corp-token", xAcsBtripCorpToken);
            this.xAcsBtripCorpToken = xAcsBtripCorpToken;
            return this;
        }

        @Override
        public AddInvoiceEntityRequest build() {
            return new AddInvoiceEntityRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddInvoiceEntityRequest} extends {@link TeaModel}
     *
     * <p>AddInvoiceEntityRequest</p>
     */
    public static class Entities extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("entity_id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String entityId;

        @com.aliyun.core.annotation.NameInMap("entity_name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String entityName;

        @com.aliyun.core.annotation.NameInMap("entity_type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String entityType;

        private Entities(Builder builder) {
            this.entityId = builder.entityId;
            this.entityName = builder.entityName;
            this.entityType = builder.entityType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Entities create() {
            return builder().build();
        }

        /**
         * @return entityId
         */
        public String getEntityId() {
            return this.entityId;
        }

        /**
         * @return entityName
         */
        public String getEntityName() {
            return this.entityName;
        }

        /**
         * @return entityType
         */
        public String getEntityType() {
            return this.entityType;
        }

        public static final class Builder {
            private String entityId; 
            private String entityName; 
            private String entityType; 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder entityName(String entityName) {
                this.entityName = entityName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder entityType(String entityType) {
                this.entityType = entityType;
                return this;
            }

            public Entities build() {
                return new Entities(this);
            } 

        } 

    }
}
