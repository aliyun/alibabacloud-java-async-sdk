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

    @Body
    @NameInMap("user_id")
    private String userId;

    private EntitySetRequest(Builder builder) {
        super(builder);
        this.entityDOList = builder.entityDOList;
        this.thirdpartId = builder.thirdpartId;
        this.userId = builder.userId;
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

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<EntitySetRequest, Builder> {
        private java.util.List < EntityDOList> entityDOList; 
        private String thirdpartId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(EntitySetRequest request) {
            super(request);
            this.entityDOList = request.entityDOList;
            this.thirdpartId = request.thirdpartId;
            this.userId = request.userId;
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

        /**
         * 无userId时传缺省值superAdmin
         */
        public Builder userId(String userId) {
            this.putBodyParameter("user_id", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public EntitySetRequest build() {
            return new EntitySetRequest(this);
        } 

    } 

    public static class EntityDOList extends TeaModel {
        @NameInMap("corp_id")
        private String corpId;

        @NameInMap("entity_id")
        @Validation(required = true)
        private String entityId;

        @NameInMap("entity_type")
        @Validation(required = true)
        private String entityType;

        @NameInMap("name")
        private String name;

        @NameInMap("user_num")
        private Integer userNum;

        private EntityDOList(Builder builder) {
            this.corpId = builder.corpId;
            this.entityId = builder.entityId;
            this.entityType = builder.entityType;
            this.name = builder.name;
            this.userNum = builder.userNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EntityDOList create() {
            return builder().build();
        }

        /**
         * @return corpId
         */
        public String getCorpId() {
            return this.corpId;
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

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return userNum
         */
        public Integer getUserNum() {
            return this.userNum;
        }

        public static final class Builder {
            private String corpId; 
            private String entityId; 
            private String entityType; 
            private String name; 
            private Integer userNum; 

            /**
             * corp_id.
             */
            public Builder corpId(String corpId) {
                this.corpId = corpId;
                return this;
            }

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

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * user_num.
             */
            public Builder userNum(Integer userNum) {
                this.userNum = userNum;
                return this;
            }

            public EntityDOList build() {
                return new EntityDOList(this);
            } 

        } 

    }
}
