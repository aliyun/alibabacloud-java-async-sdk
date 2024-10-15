// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link EntityDeleteRequest} extends {@link RequestModel}
 *
 * <p>EntityDeleteRequest</p>
 */
public class EntityDeleteRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("del_all")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean delAll;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("entity_d_o_list")
    private java.util.List < EntityDOList> entityDOList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("thirdpart_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String thirdpartId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-so-corp-token")
    private String xAcsBtripSoCorpToken;

    private EntityDeleteRequest(Builder builder) {
        super(builder);
        this.delAll = builder.delAll;
        this.entityDOList = builder.entityDOList;
        this.thirdpartId = builder.thirdpartId;
        this.xAcsBtripSoCorpToken = builder.xAcsBtripSoCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EntityDeleteRequest create() {
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
     * @return entityDOList
     */
    public java.util.List < EntityDOList> getEntityDOList() {
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

    public static final class Builder extends Request.Builder<EntityDeleteRequest, Builder> {
        private Boolean delAll; 
        private java.util.List < EntityDOList> entityDOList; 
        private String thirdpartId; 
        private String xAcsBtripSoCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(EntityDeleteRequest request) {
            super(request);
            this.delAll = request.delAll;
            this.entityDOList = request.entityDOList;
            this.thirdpartId = request.thirdpartId;
            this.xAcsBtripSoCorpToken = request.xAcsBtripSoCorpToken;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder delAll(Boolean delAll) {
            this.putQueryParameter("del_all", delAll);
            this.delAll = delAll;
            return this;
        }

        /**
         * entity_d_o_list.
         */
        public Builder entityDOList(java.util.List < EntityDOList> entityDOList) {
            String entityDOListShrink = shrink(entityDOList, "entity_d_o_list", "json");
            this.putBodyParameter("entity_d_o_list", entityDOListShrink);
            this.entityDOList = entityDOList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder thirdpartId(String thirdpartId) {
            this.putQueryParameter("thirdpart_id", thirdpartId);
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
        public EntityDeleteRequest build() {
            return new EntityDeleteRequest(this);
        } 

    } 

    /**
     * 
     * {@link EntityDeleteRequest} extends {@link TeaModel}
     *
     * <p>EntityDeleteRequest</p>
     */
    public static class EntityDOList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("entity_id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String entityId;

        @com.aliyun.core.annotation.NameInMap("entity_type")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
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

            public EntityDOList build() {
                return new EntityDOList(this);
            } 

        } 

    }
}
