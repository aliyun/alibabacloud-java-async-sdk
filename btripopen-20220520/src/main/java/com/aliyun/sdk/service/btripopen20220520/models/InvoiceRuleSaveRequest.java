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
 * {@link InvoiceRuleSaveRequest} extends {@link RequestModel}
 *
 * <p>InvoiceRuleSaveRequest</p>
 */
public class InvoiceRuleSaveRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("all_employe")
    private Boolean allEmploye;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("entities")
    private java.util.List<Entities> entities;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scope")
    private Integer scope;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("third_part_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String thirdPartId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-so-corp-token")
    private String xAcsBtripSoCorpToken;

    private InvoiceRuleSaveRequest(Builder builder) {
        super(builder);
        this.allEmploye = builder.allEmploye;
        this.entities = builder.entities;
        this.scope = builder.scope;
        this.thirdPartId = builder.thirdPartId;
        this.xAcsBtripSoCorpToken = builder.xAcsBtripSoCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InvoiceRuleSaveRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allEmploye
     */
    public Boolean getAllEmploye() {
        return this.allEmploye;
    }

    /**
     * @return entities
     */
    public java.util.List<Entities> getEntities() {
        return this.entities;
    }

    /**
     * @return scope
     */
    public Integer getScope() {
        return this.scope;
    }

    /**
     * @return thirdPartId
     */
    public String getThirdPartId() {
        return this.thirdPartId;
    }

    /**
     * @return xAcsBtripSoCorpToken
     */
    public String getXAcsBtripSoCorpToken() {
        return this.xAcsBtripSoCorpToken;
    }

    public static final class Builder extends Request.Builder<InvoiceRuleSaveRequest, Builder> {
        private Boolean allEmploye; 
        private java.util.List<Entities> entities; 
        private Integer scope; 
        private String thirdPartId; 
        private String xAcsBtripSoCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(InvoiceRuleSaveRequest request) {
            super(request);
            this.allEmploye = request.allEmploye;
            this.entities = request.entities;
            this.scope = request.scope;
            this.thirdPartId = request.thirdPartId;
            this.xAcsBtripSoCorpToken = request.xAcsBtripSoCorpToken;
        } 

        /**
         * all_employe.
         */
        public Builder allEmploye(Boolean allEmploye) {
            this.putBodyParameter("all_employe", allEmploye);
            this.allEmploye = allEmploye;
            return this;
        }

        /**
         * entities.
         */
        public Builder entities(java.util.List<Entities> entities) {
            String entitiesShrink = shrink(entities, "entities", "json");
            this.putBodyParameter("entities", entitiesShrink);
            this.entities = entities;
            return this;
        }

        /**
         * scope.
         */
        public Builder scope(Integer scope) {
            this.putBodyParameter("scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i123</p>
         */
        public Builder thirdPartId(String thirdPartId) {
            this.putBodyParameter("third_part_id", thirdPartId);
            this.thirdPartId = thirdPartId;
            return this;
        }

        /**
         * x-acs-btrip-so-corp-token.
         */
        public Builder xAcsBtripSoCorpToken(String xAcsBtripSoCorpToken) {
            this.putHeaderParameter("x-acs-btrip-so-corp-token", xAcsBtripSoCorpToken);
            this.xAcsBtripSoCorpToken = xAcsBtripSoCorpToken;
            return this;
        }

        @Override
        public InvoiceRuleSaveRequest build() {
            return new InvoiceRuleSaveRequest(this);
        } 

    } 

    /**
     * 
     * {@link InvoiceRuleSaveRequest} extends {@link TeaModel}
     *
     * <p>InvoiceRuleSaveRequest</p>
     */
    public static class Entities extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("type")
        private Integer type;

        private Entities(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Entities create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private String id; 
            private String name; 
            private Integer type; 

            private Builder() {
            } 

            private Builder(Entities model) {
                this.id = model.id;
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public Entities build() {
                return new Entities(this);
            } 

        } 

    }
}
