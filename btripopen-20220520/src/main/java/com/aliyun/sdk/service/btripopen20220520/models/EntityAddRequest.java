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
 * {@link EntityAddRequest} extends {@link RequestModel}
 *
 * <p>EntityAddRequest</p>
 */
public class EntityAddRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("entity_d_o_list")
    private java.util.List<EntityDOList> entityDOList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("thirdpart_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String thirdpartId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-so-corp-token")
    private String xAcsBtripSoCorpToken;

    private EntityAddRequest(Builder builder) {
        super(builder);
        this.entityDOList = builder.entityDOList;
        this.thirdpartId = builder.thirdpartId;
        this.xAcsBtripSoCorpToken = builder.xAcsBtripSoCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EntityAddRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return entityDOList
     */
    public java.util.List<EntityDOList> getEntityDOList() {
        return this.entityDOList;
    }

    /**
     * @return thirdpartId
     */
    public String getThirdpartId() {
        return this.thirdpartId;
    }

    /**
     * @return xAcsBtripSoCorpToken
     */
    public String getXAcsBtripSoCorpToken() {
        return this.xAcsBtripSoCorpToken;
    }

    public static final class Builder extends Request.Builder<EntityAddRequest, Builder> {
        private java.util.List<EntityDOList> entityDOList; 
        private String thirdpartId; 
        private String xAcsBtripSoCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(EntityAddRequest request) {
            super(request);
            this.entityDOList = request.entityDOList;
            this.thirdpartId = request.thirdpartId;
            this.xAcsBtripSoCorpToken = request.xAcsBtripSoCorpToken;
        } 

        /**
         * entity_d_o_list.
         */
        public Builder entityDOList(java.util.List<EntityDOList> entityDOList) {
            String entityDOListShrink = shrink(entityDOList, "entity_d_o_list", "json");
            this.putBodyParameter("entity_d_o_list", entityDOListShrink);
            this.entityDOList = entityDOList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>340049</p>
         */
        public Builder thirdpartId(String thirdpartId) {
            this.putBodyParameter("thirdpart_id", thirdpartId);
            this.thirdpartId = thirdpartId;
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
        public EntityAddRequest build() {
            return new EntityAddRequest(this);
        } 

    } 

    /**
     * 
     * {@link EntityAddRequest} extends {@link TeaModel}
     *
     * <p>EntityAddRequest</p>
     */
    public static class EntityDOList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("entity_id")
        private String entityId;

        @com.aliyun.core.annotation.NameInMap("entity_type")
        private String entityType;

        private EntityDOList(Builder builder) {
            this.entityId = builder.entityId;
            this.entityType = builder.entityType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EntityDOList create() {
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

            public EntityDOList build() {
                return new EntityDOList(this);
            } 

        } 

    }
}
