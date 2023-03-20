// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteInvoiceEntityRequest} extends {@link RequestModel}
 *
 * <p>DeleteInvoiceEntityRequest</p>
 */
public class DeleteInvoiceEntityRequest extends Request {
    @Query
    @NameInMap("del_all")
    private Boolean delAll;

    @Query
    @NameInMap("entities")
    private java.util.List < Entities> entities;

    @Query
    @NameInMap("third_part_id")
    @Validation(required = true)
    private String thirdPartId;

    @Header
    @NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private DeleteInvoiceEntityRequest(Builder builder) {
        super(builder);
        this.delAll = builder.delAll;
        this.entities = builder.entities;
        this.thirdPartId = builder.thirdPartId;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteInvoiceEntityRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return delAll
     */
    public Boolean getDelAll() {
        return this.delAll;
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

    public static final class Builder extends Request.Builder<DeleteInvoiceEntityRequest, Builder> {
        private Boolean delAll; 
        private java.util.List < Entities> entities; 
        private String thirdPartId; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(DeleteInvoiceEntityRequest request) {
            super(request);
            this.delAll = request.delAll;
            this.entities = request.entities;
            this.thirdPartId = request.thirdPartId;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * 删除所有适用人员
         */
        public Builder delAll(Boolean delAll) {
            this.putQueryParameter("del_all", delAll);
            this.delAll = delAll;
            return this;
        }

        /**
         * entities.
         */
        public Builder entities(java.util.List < Entities> entities) {
            String entitiesShrink = shrink(entities, "entities", "json");
            this.putQueryParameter("entities", entitiesShrink);
            this.entities = entities;
            return this;
        }

        /**
         * 第三方发票id
         */
        public Builder thirdPartId(String thirdPartId) {
            this.putQueryParameter("third_part_id", thirdPartId);
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
        public DeleteInvoiceEntityRequest build() {
            return new DeleteInvoiceEntityRequest(this);
        } 

    } 

    public static class Entities extends TeaModel {
        @NameInMap("entity_id")
        private String entityId;

        @NameInMap("entity_type")
        private String entityType;

        private Entities(Builder builder) {
            this.entityId = builder.entityId;
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
         * @return entityType
         */
        public String getEntityType() {
            return this.entityType;
        }

        public static final class Builder {
            private String entityId; 
            private String entityType; 

            /**
             * 实体id
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * 实体类型：1员工，2部门，3角色，4第三方部门
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
