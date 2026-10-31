// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link ListRectifyFlowRequest} extends {@link RequestModel}
 *
 * <p>ListRectifyFlowRequest</p>
 */
public class ListRectifyFlowRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ListQuery")
    @com.aliyun.core.annotation.Validation(required = true)
    private ListQuery listQuery;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpUserId")
    private String opUserId;

    private ListRectifyFlowRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.listQuery = builder.listQuery;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRectifyFlowRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return listQuery
     */
    public ListQuery getListQuery() {
        return this.listQuery;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return opUserId
     */
    public String getOpUserId() {
        return this.opUserId;
    }

    public static final class Builder extends Request.Builder<ListRectifyFlowRequest, Builder> {
        private String regionId; 
        private ListQuery listQuery; 
        private Long opTenantId; 
        private String opUserId; 

        private Builder() {
            super();
        } 

        private Builder(ListRectifyFlowRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.listQuery = request.listQuery;
            this.opTenantId = request.opTenantId;
            this.opUserId = request.opUserId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The business request parameters.</p>
         * <p>This parameter is required.</p>
         */
        public Builder listQuery(ListQuery listQuery) {
            String listQueryShrink = shrink(listQuery, "ListQuery", "json");
            this.putBodyParameter("ListQuery", listQueryShrink);
            this.listQuery = listQuery;
            return this;
        }

        /**
         * <p>The tenant ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * <p>The ID of the operator.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opUserId(String opUserId) {
            this.putQueryParameter("OpUserId", opUserId);
            this.opUserId = opUserId;
            return this;
        }

        @Override
        public ListRectifyFlowRequest build() {
            return new ListRectifyFlowRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListRectifyFlowRequest} extends {@link TeaModel}
     *
     * <p>ListRectifyFlowRequest</p>
     */
    public static class ListQuery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GovernItemType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String governItemType;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("PriorityFilters")
        private java.util.List<String> priorityFilters;

        @com.aliyun.core.annotation.NameInMap("RectifyUserFilters")
        private java.util.List<String> rectifyUserFilters;

        @com.aliyun.core.annotation.NameInMap("StatusFilters")
        private java.util.List<String> statusFilters;

        @com.aliyun.core.annotation.NameInMap("VerifyUserFilters")
        private java.util.List<String> verifyUserFilters;

        private ListQuery(Builder builder) {
            this.governItemType = builder.governItemType;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.priorityFilters = builder.priorityFilters;
            this.rectifyUserFilters = builder.rectifyUserFilters;
            this.statusFilters = builder.statusFilters;
            this.verifyUserFilters = builder.verifyUserFilters;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListQuery create() {
            return builder().build();
        }

        /**
         * @return governItemType
         */
        public String getGovernItemType() {
            return this.governItemType;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return priorityFilters
         */
        public java.util.List<String> getPriorityFilters() {
            return this.priorityFilters;
        }

        /**
         * @return rectifyUserFilters
         */
        public java.util.List<String> getRectifyUserFilters() {
            return this.rectifyUserFilters;
        }

        /**
         * @return statusFilters
         */
        public java.util.List<String> getStatusFilters() {
            return this.statusFilters;
        }

        /**
         * @return verifyUserFilters
         */
        public java.util.List<String> getVerifyUserFilters() {
            return this.verifyUserFilters;
        }

        public static final class Builder {
            private String governItemType; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private java.util.List<String> priorityFilters; 
            private java.util.List<String> rectifyUserFilters; 
            private java.util.List<String> statusFilters; 
            private java.util.List<String> verifyUserFilters; 

            private Builder() {
            } 

            private Builder(ListQuery model) {
                this.governItemType = model.governItemType;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.priorityFilters = model.priorityFilters;
                this.rectifyUserFilters = model.rectifyUserFilters;
                this.statusFilters = model.statusFilters;
                this.verifyUserFilters = model.verifyUserFilters;
            } 

            /**
             * <p>The governance object type. Valid values: TABLE, DATASOURCE_TABLE, DATASOURCE, INDEX, REALTIME_LOGICAL_TABLE, and QD_FEATURE.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>TABLE</p>
             */
            public Builder governItemType(String governItemType) {
                this.governItemType = governItemType;
                return this;
            }

            /**
             * <p>The page number. Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>7381905</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page. Default value: 20.</p>
             * 
             * <strong>example:</strong>
             * <p>8322096</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The priority filters. Valid values: HIGH, MIDDLE, and LOW.</p>
             */
            public Builder priorityFilters(java.util.List<String> priorityFilters) {
                this.priorityFilters = priorityFilters;
                return this;
            }

            /**
             * <p>The list of rectifier IDs.</p>
             */
            public Builder rectifyUserFilters(java.util.List<String> rectifyUserFilters) {
                this.rectifyUserFilters = rectifyUserFilters;
                return this;
            }

            /**
             * <p>SUBMIT_RECTIFY, SUBMIT_VERIFY, FINISH_VERIFY, and REJECT_VERIFY.</p>
             */
            public Builder statusFilters(java.util.List<String> statusFilters) {
                this.statusFilters = statusFilters;
                return this;
            }

            /**
             * <p>The list of verifier IDs.</p>
             */
            public Builder verifyUserFilters(java.util.List<String> verifyUserFilters) {
                this.verifyUserFilters = verifyUserFilters;
                return this;
            }

            public ListQuery build() {
                return new ListQuery(this);
            } 

        } 

    }
}
