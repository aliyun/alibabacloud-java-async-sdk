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
 * {@link InvoiceRuleDeleteRequest} extends {@link RequestModel}
 *
 * <p>InvoiceRuleDeleteRequest</p>
 */
public class InvoiceRuleDeleteRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("del_all")
    private Boolean delAll;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("entities")
    private java.util.List<Entities> entities;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("third_part_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String thirdPartId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private InvoiceRuleDeleteRequest(Builder builder) {
        super(builder);
        this.delAll = builder.delAll;
        this.entities = builder.entities;
        this.thirdPartId = builder.thirdPartId;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InvoiceRuleDeleteRequest create() {
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

    public static final class Builder extends Request.Builder<InvoiceRuleDeleteRequest, Builder> {
        private Boolean delAll; 
        private java.util.List<Entities> entities; 
        private String thirdPartId; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(InvoiceRuleDeleteRequest request) {
            super(request);
            this.delAll = request.delAll;
            this.entities = request.entities;
            this.thirdPartId = request.thirdPartId;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * del_all.
         */
        public Builder delAll(Boolean delAll) {
            this.putQueryParameter("del_all", delAll);
            this.delAll = delAll;
            return this;
        }

        /**
         * entities.
         */
        public Builder entities(java.util.List<Entities> entities) {
            String entitiesShrink = shrink(entities, "entities", "json");
            this.putQueryParameter("entities", entitiesShrink);
            this.entities = entities;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>340049</p>
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
        public InvoiceRuleDeleteRequest build() {
            return new InvoiceRuleDeleteRequest(this);
        } 

    } 

    /**
     * 
     * {@link InvoiceRuleDeleteRequest} extends {@link TeaModel}
     *
     * <p>InvoiceRuleDeleteRequest</p>
     */
    public static class Entities extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("entity_id")
        private String entityId;

        @com.aliyun.core.annotation.NameInMap("entity_type")
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
             * entity_id.
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
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
