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
 * {@link GetRectifyFlowRequest} extends {@link RequestModel}
 *
 * <p>GetRectifyFlowRequest</p>
 */
public class GetRectifyFlowRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GetQuery")
    @com.aliyun.core.annotation.Validation(required = true)
    private GetQuery getQuery;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpUserId")
    private String opUserId;

    private GetRectifyFlowRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.getQuery = builder.getQuery;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRectifyFlowRequest create() {
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
     * @return getQuery
     */
    public GetQuery getGetQuery() {
        return this.getQuery;
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

    public static final class Builder extends Request.Builder<GetRectifyFlowRequest, Builder> {
        private String regionId; 
        private GetQuery getQuery; 
        private Long opTenantId; 
        private String opUserId; 

        private Builder() {
            super();
        } 

        private Builder(GetRectifyFlowRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.getQuery = request.getQuery;
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
        public Builder getQuery(GetQuery getQuery) {
            String getQueryShrink = shrink(getQuery, "GetQuery", "json");
            this.putBodyParameter("GetQuery", getQueryShrink);
            this.getQuery = getQuery;
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
         * <p>The operator ID.</p>
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
        public GetRectifyFlowRequest build() {
            return new GetRectifyFlowRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetRectifyFlowRequest} extends {@link TeaModel}
     *
     * <p>GetRectifyFlowRequest</p>
     */
    public static class GetQuery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("RectifyId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long rectifyId;

        private GetQuery(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.rectifyId = builder.rectifyId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GetQuery create() {
            return builder().build();
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
         * @return rectifyId
         */
        public Long getRectifyId() {
            return this.rectifyId;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private Long rectifyId; 

            private Builder() {
            } 

            private Builder(GetQuery model) {
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.rectifyId = model.rectifyId;
            } 

            /**
             * <p>The page number. Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>6500387</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of items per page. Default value: 20.</p>
             * 
             * <strong>example:</strong>
             * <p>9919509</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The ID of the rectification process.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>442777862946</p>
             */
            public Builder rectifyId(Long rectifyId) {
                this.rectifyId = rectifyId;
                return this;
            }

            public GetQuery build() {
                return new GetQuery(this);
            } 

        } 

    }
}
