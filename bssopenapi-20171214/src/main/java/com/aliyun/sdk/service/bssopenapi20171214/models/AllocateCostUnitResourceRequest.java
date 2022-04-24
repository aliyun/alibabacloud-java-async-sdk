// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AllocateCostUnitResourceRequest} extends {@link RequestModel}
 *
 * <p>AllocateCostUnitResourceRequest</p>
 */
public class AllocateCostUnitResourceRequest extends Request {
    @Query
    @NameInMap("FromUnitId")
    @Validation(required = true)
    private Long fromUnitId;

    @Query
    @NameInMap("FromUnitUserId")
    @Validation(required = true)
    private Long fromUnitUserId;

    @Query
    @NameInMap("ResourceInstanceList")
    @Validation(required = true)
    private java.util.List < ResourceInstanceList> resourceInstanceList;

    @Query
    @NameInMap("ToUnitId")
    @Validation(required = true)
    private Long toUnitId;

    @Query
    @NameInMap("ToUnitUserId")
    @Validation(required = true)
    private Long toUnitUserId;

    private AllocateCostUnitResourceRequest(Builder builder) {
        super(builder);
        this.fromUnitId = builder.fromUnitId;
        this.fromUnitUserId = builder.fromUnitUserId;
        this.resourceInstanceList = builder.resourceInstanceList;
        this.toUnitId = builder.toUnitId;
        this.toUnitUserId = builder.toUnitUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AllocateCostUnitResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fromUnitId
     */
    public Long getFromUnitId() {
        return this.fromUnitId;
    }

    /**
     * @return fromUnitUserId
     */
    public Long getFromUnitUserId() {
        return this.fromUnitUserId;
    }

    /**
     * @return resourceInstanceList
     */
    public java.util.List < ResourceInstanceList> getResourceInstanceList() {
        return this.resourceInstanceList;
    }

    /**
     * @return toUnitId
     */
    public Long getToUnitId() {
        return this.toUnitId;
    }

    /**
     * @return toUnitUserId
     */
    public Long getToUnitUserId() {
        return this.toUnitUserId;
    }

    public static final class Builder extends Request.Builder<AllocateCostUnitResourceRequest, Builder> {
        private Long fromUnitId; 
        private Long fromUnitUserId; 
        private java.util.List < ResourceInstanceList> resourceInstanceList; 
        private Long toUnitId; 
        private Long toUnitUserId; 

        private Builder() {
            super();
        } 

        private Builder(AllocateCostUnitResourceRequest request) {
            super(request);
            this.fromUnitId = request.fromUnitId;
            this.fromUnitUserId = request.fromUnitUserId;
            this.resourceInstanceList = request.resourceInstanceList;
            this.toUnitId = request.toUnitId;
            this.toUnitUserId = request.toUnitUserId;
        } 

        /**
         * FromUnitId.
         */
        public Builder fromUnitId(Long fromUnitId) {
            this.putQueryParameter("FromUnitId", fromUnitId);
            this.fromUnitId = fromUnitId;
            return this;
        }

        /**
         * FromUnitUserId.
         */
        public Builder fromUnitUserId(Long fromUnitUserId) {
            this.putQueryParameter("FromUnitUserId", fromUnitUserId);
            this.fromUnitUserId = fromUnitUserId;
            return this;
        }

        /**
         * ResourceInstanceList.
         */
        public Builder resourceInstanceList(java.util.List < ResourceInstanceList> resourceInstanceList) {
            this.putQueryParameter("ResourceInstanceList", resourceInstanceList);
            this.resourceInstanceList = resourceInstanceList;
            return this;
        }

        /**
         * ToUnitId.
         */
        public Builder toUnitId(Long toUnitId) {
            this.putQueryParameter("ToUnitId", toUnitId);
            this.toUnitId = toUnitId;
            return this;
        }

        /**
         * ToUnitUserId.
         */
        public Builder toUnitUserId(Long toUnitUserId) {
            this.putQueryParameter("ToUnitUserId", toUnitUserId);
            this.toUnitUserId = toUnitUserId;
            return this;
        }

        @Override
        public AllocateCostUnitResourceRequest build() {
            return new AllocateCostUnitResourceRequest(this);
        } 

    } 

    public static class ResourceInstanceList extends TeaModel {
        @NameInMap("ApportionCode")
        private String apportionCode;

        @NameInMap("CommodityCode")
        @Validation(required = true)
        private String commodityCode;

        @NameInMap("ResourceId")
        @Validation(required = true)
        private String resourceId;

        @NameInMap("ResourceUserId")
        @Validation(required = true)
        private Long resourceUserId;

        private ResourceInstanceList(Builder builder) {
            this.apportionCode = builder.apportionCode;
            this.commodityCode = builder.commodityCode;
            this.resourceId = builder.resourceId;
            this.resourceUserId = builder.resourceUserId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceInstanceList create() {
            return builder().build();
        }

        /**
         * @return apportionCode
         */
        public String getApportionCode() {
            return this.apportionCode;
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceUserId
         */
        public Long getResourceUserId() {
            return this.resourceUserId;
        }

        public static final class Builder {
            private String apportionCode; 
            private String commodityCode; 
            private String resourceId; 
            private Long resourceUserId; 

            /**
             * ApportionCode.
             */
            public Builder apportionCode(String apportionCode) {
                this.apportionCode = apportionCode;
                return this;
            }

            /**
             * CommodityCode.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * ResourceUserId.
             */
            public Builder resourceUserId(Long resourceUserId) {
                this.resourceUserId = resourceUserId;
                return this;
            }

            public ResourceInstanceList build() {
                return new ResourceInstanceList(this);
            } 

        } 

    }
}
