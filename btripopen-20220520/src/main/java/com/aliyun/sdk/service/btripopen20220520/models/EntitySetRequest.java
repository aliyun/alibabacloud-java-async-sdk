// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EntitySetRequest} extends {@link RequestModel}
 *
 * <p>EntitySetRequest</p>
 */
public class EntitySetRequest extends Request {
    @Body
    @NameInMap("entity_d_o_list")
    private java.util.List < EntityDOList> entityDOList;

    @Body
    @NameInMap("thirdpart_id")
    @Validation(required = true)
    private String thirdpartId;

    private EntitySetRequest(Builder builder) {
        super(builder);
        this.entityDOList = builder.entityDOList;
        this.thirdpartId = builder.thirdpartId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EntitySetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<EntitySetRequest, Builder> {
        private java.util.List < EntityDOList> entityDOList; 
        private String thirdpartId; 

        private Builder() {
            super();
        } 

        private Builder(EntitySetRequest request) {
            super(request);
            this.entityDOList = request.entityDOList;
            this.thirdpartId = request.thirdpartId;
        } 

        /**
         * 人员信息列表
         */
        public Builder entityDOList(java.util.List < EntityDOList> entityDOList) {
            String entityDOListShrink = shrink(entityDOList, "entity_d_o_list", "json");
            this.putBodyParameter("entity_d_o_list", entityDOListShrink);
            this.entityDOList = entityDOList;
            return this;
        }

        /**
         * 第三方成本中心id
         */
        public Builder thirdpartId(String thirdpartId) {
            this.putBodyParameter("thirdpart_id", thirdpartId);
            this.thirdpartId = thirdpartId;
            return this;
        }

        @Override
        public EntitySetRequest build() {
            return new EntitySetRequest(this);
        } 

    } 

    public static class EntityDOList extends TeaModel {
        @NameInMap("entity_id")
        @Validation(required = true)
        private String entityId;

        @NameInMap("entity_type")
        @Validation(required = true)
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
