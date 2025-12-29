// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

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
 * {@link ListServiceInstanceForPageRequest} extends {@link RequestModel}
 *
 * <p>ListServiceInstanceForPageRequest</p>
 */
public class ListServiceInstanceForPageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pager")
    private Pager pager;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RelationNumber")
    private String relationNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneId")
    private Long sceneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UsageId")
    private Long usageId;

    private ListServiceInstanceForPageRequest(Builder builder) {
        super(builder);
        this.code = builder.code;
        this.ownerId = builder.ownerId;
        this.pager = builder.pager;
        this.relationNumber = builder.relationNumber;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sceneId = builder.sceneId;
        this.usageId = builder.usageId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceInstanceForPageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pager
     */
    public Pager getPager() {
        return this.pager;
    }

    /**
     * @return relationNumber
     */
    public String getRelationNumber() {
        return this.relationNumber;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return sceneId
     */
    public Long getSceneId() {
        return this.sceneId;
    }

    /**
     * @return usageId
     */
    public Long getUsageId() {
        return this.usageId;
    }

    public static final class Builder extends Request.Builder<ListServiceInstanceForPageRequest, Builder> {
        private String code; 
        private Long ownerId; 
        private Pager pager; 
        private String relationNumber; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Long sceneId; 
        private Long usageId; 

        private Builder() {
            super();
        } 

        private Builder(ListServiceInstanceForPageRequest request) {
            super(request);
            this.code = request.code;
            this.ownerId = request.ownerId;
            this.pager = request.pager;
            this.relationNumber = request.relationNumber;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sceneId = request.sceneId;
            this.usageId = request.usageId;
        } 

        /**
         * <p>服务实例号</p>
         * 
         * <strong>example:</strong>
         * <p>0571****1234</p>
         */
        public Builder code(String code) {
            this.putQueryParameter("Code", code);
            this.code = code;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * Pager.
         */
        public Builder pager(Pager pager) {
            String pagerShrink = shrink(pager, "Pager", "json");
            this.putQueryParameter("Pager", pagerShrink);
            this.pager = pager;
            return this;
        }

        /**
         * <p>关联实体号码</p>
         * 
         * <strong>example:</strong>
         * <p>131****1111</p>
         */
        public Builder relationNumber(String relationNumber) {
            this.putQueryParameter("RelationNumber", relationNumber);
            this.relationNumber = relationNumber;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>场景ID</p>
         * 
         * <strong>example:</strong>
         * <p>56</p>
         */
        public Builder sceneId(Long sceneId) {
            this.putQueryParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        /**
         * <p>用途ID</p>
         * 
         * <strong>example:</strong>
         * <p>89</p>
         */
        public Builder usageId(Long usageId) {
            this.putQueryParameter("UsageId", usageId);
            this.usageId = usageId;
            return this;
        }

        @Override
        public ListServiceInstanceForPageRequest build() {
            return new ListServiceInstanceForPageRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListServiceInstanceForPageRequest} extends {@link TeaModel}
     *
     * <p>ListServiceInstanceForPageRequest</p>
     */
    public static class Pager extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageIndex")
        private Long pageIndex;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        private Pager(Builder builder) {
            this.pageIndex = builder.pageIndex;
            this.pageSize = builder.pageSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Pager create() {
            return builder().build();
        }

        /**
         * @return pageIndex
         */
        public Long getPageIndex() {
            return this.pageIndex;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        public static final class Builder {
            private Long pageIndex; 
            private Long pageSize; 

            private Builder() {
            } 

            private Builder(Pager model) {
                this.pageIndex = model.pageIndex;
                this.pageSize = model.pageSize;
            } 

            /**
             * <p>当前页码</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageIndex(Long pageIndex) {
                this.pageIndex = pageIndex;
                return this;
            }

            /**
             * <p>每页数量，默认10，最大100</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            public Pager build() {
                return new Pager(this);
            } 

        } 

    }
}
