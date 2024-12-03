// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AllocateCostUnitResourceRequest} extends {@link RequestModel}
 *
 * <p>AllocateCostUnitResourceRequest</p>
 */
public class AllocateCostUnitResourceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FromUnitId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long fromUnitId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FromUnitUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long fromUnitUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceInstanceList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < ResourceInstanceList> resourceInstanceList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ToUnitId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long toUnitId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ToUnitUserId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the source cost center.</p>
         * <ul>
         * <li>A value of 0 indicates that the resources to be transferred have not been allocated to a cost center.</li>
         * <li>A value greater than 0 indicates the ID of an existing cost center.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder fromUnitId(Long fromUnitId) {
            this.putQueryParameter("FromUnitId", fromUnitId);
            this.fromUnitId = fromUnitId;
            return this;
        }

        /**
         * <p>The user ID of the owner of the source cost center.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>273394581313325532</p>
         */
        public Builder fromUnitUserId(Long fromUnitUserId) {
            this.putQueryParameter("FromUnitUserId", fromUnitUserId);
            this.fromUnitUserId = fromUnitUserId;
            return this;
        }

        /**
         * <p>The resource instances to be transferred.</p>
         * <p>This parameter is required.</p>
         */
        public Builder resourceInstanceList(java.util.List < ResourceInstanceList> resourceInstanceList) {
            this.putQueryParameter("ResourceInstanceList", resourceInstanceList);
            this.resourceInstanceList = resourceInstanceList;
            return this;
        }

        /**
         * <p>The ID of the destination cost center.</p>
         * <ul>
         * <li>A value of -1 indicates that the allocated resources are changed to unallocated.</li>
         * <li>A value greater than 0 indicates the ID of an existing cost center.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>186419</p>
         */
        public Builder toUnitId(Long toUnitId) {
            this.putQueryParameter("ToUnitId", toUnitId);
            this.toUnitId = toUnitId;
            return this;
        }

        /**
         * <p>The user ID of the owner of the destination cost center.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>241021678450941490</p>
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

    /**
     * 
     * {@link AllocateCostUnitResourceRequest} extends {@link TeaModel}
     *
     * <p>AllocateCostUnitResourceRequest</p>
     */
    public static class ResourceInstanceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApportionCode")
        private String apportionCode;

        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        @com.aliyun.core.annotation.Validation(required = true)
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceUserId")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>The split item of the shared instance. This parameter is required only for shared instances.</p>
             * <ul>
             * <li>Eight cloud services support bill splitting. The commodity codes of the eight services are oss, dcdn, snapshot, vod, cdn, live, and cbwp.</li>
             * <li>You can obtain the split item of a shared instance by calling QueryCostUnitResource operation to obtain all resource instances within a cost center.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>qwer1-cn-beijing</p>
             */
            public Builder apportionCode(String apportionCode) {
                this.apportionCode = apportionCode;
                return this;
            }

            /**
             * <p>The commodity code of the resource instance.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>oss</p>
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * <p>The ID of the resource instance.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou;standard</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The user ID of the resource instance owner.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>273394581313325532</p>
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
