// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddInvoiceEntityRequest} extends {@link RequestModel}
 *
 * <p>AddInvoiceEntityRequest</p>
 */
public class AddInvoiceEntityRequest extends Request {
    @Body
    @NameInMap("entities")
    @Validation(required = true)
    private java.util.List < Entities> entities;

    @Body
    @NameInMap("third_part_id")
    @Validation(required = true)
    private String thirdPartId;

    @Header
    @NameInMap("x-acs-btrip-corp-token")
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
    public java.util.List < Entities> getEntities() {
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
        private java.util.List < Entities> entities; 
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
         * entities.
         */
        public Builder entities(java.util.List < Entities> entities) {
            String entitiesShrink = shrink(entities, "entities", "json");
            this.putBodyParameter("entities", entitiesShrink);
            this.entities = entities;
            return this;
        }

        /**
         * third_part_id.
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

    public static class Entities extends TeaModel {
        @NameInMap("entity_id")
        @Validation(required = true)
        private String entityId;

        @NameInMap("entity_name")
        @Validation(required = true)
        private String entityName;

        @NameInMap("entity_type")
        @Validation(required = true)
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
             * entity_id.
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * entity_name.
             */
            public Builder entityName(String entityName) {
                this.entityName = entityName;
                return this;
            }

            /**
             * entity_type.
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
