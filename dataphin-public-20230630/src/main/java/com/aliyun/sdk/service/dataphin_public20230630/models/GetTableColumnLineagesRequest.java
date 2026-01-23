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
 * {@link GetTableColumnLineagesRequest} extends {@link RequestModel}
 *
 * <p>GetTableColumnLineagesRequest</p>
 */
public class GetTableColumnLineagesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FilterQuery")
    private FilterQuery filterQuery;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableGuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tableGuid;

    private GetTableColumnLineagesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.filterQuery = builder.filterQuery;
        this.opTenantId = builder.opTenantId;
        this.tableGuid = builder.tableGuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTableColumnLineagesRequest create() {
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
     * @return filterQuery
     */
    public FilterQuery getFilterQuery() {
        return this.filterQuery;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return tableGuid
     */
    public String getTableGuid() {
        return this.tableGuid;
    }

    public static final class Builder extends Request.Builder<GetTableColumnLineagesRequest, Builder> {
        private String regionId; 
        private FilterQuery filterQuery; 
        private Long opTenantId; 
        private String tableGuid; 

        private Builder() {
            super();
        } 

        private Builder(GetTableColumnLineagesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.filterQuery = request.filterQuery;
            this.opTenantId = request.opTenantId;
            this.tableGuid = request.tableGuid;
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
         * FilterQuery.
         */
        public Builder filterQuery(FilterQuery filterQuery) {
            String filterQueryShrink = shrink(filterQuery, "FilterQuery", "json");
            this.putBodyParameter("FilterQuery", filterQueryShrink);
            this.filterQuery = filterQuery;
            return this;
        }

        /**
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1121</p>
         */
        public Builder tableGuid(String tableGuid) {
            this.putQueryParameter("TableGuid", tableGuid);
            this.tableGuid = tableGuid;
            return this;
        }

        @Override
        public GetTableColumnLineagesRequest build() {
            return new GetTableColumnLineagesRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetTableColumnLineagesRequest} extends {@link TeaModel}
     *
     * <p>GetTableColumnLineagesRequest</p>
     */
    public static class FilterQuery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NeedDownstream")
        private Boolean needDownstream;

        @com.aliyun.core.annotation.NameInMap("NeedNotExistObject")
        private Boolean needNotExistObject;

        @com.aliyun.core.annotation.NameInMap("NeedUpstream")
        private Boolean needUpstream;

        @com.aliyun.core.annotation.NameInMap("NodeEnv")
        private String nodeEnv;

        @com.aliyun.core.annotation.NameInMap("NodeIdList")
        private java.util.List<String> nodeIdList;

        private FilterQuery(Builder builder) {
            this.needDownstream = builder.needDownstream;
            this.needNotExistObject = builder.needNotExistObject;
            this.needUpstream = builder.needUpstream;
            this.nodeEnv = builder.nodeEnv;
            this.nodeIdList = builder.nodeIdList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FilterQuery create() {
            return builder().build();
        }

        /**
         * @return needDownstream
         */
        public Boolean getNeedDownstream() {
            return this.needDownstream;
        }

        /**
         * @return needNotExistObject
         */
        public Boolean getNeedNotExistObject() {
            return this.needNotExistObject;
        }

        /**
         * @return needUpstream
         */
        public Boolean getNeedUpstream() {
            return this.needUpstream;
        }

        /**
         * @return nodeEnv
         */
        public String getNodeEnv() {
            return this.nodeEnv;
        }

        /**
         * @return nodeIdList
         */
        public java.util.List<String> getNodeIdList() {
            return this.nodeIdList;
        }

        public static final class Builder {
            private Boolean needDownstream; 
            private Boolean needNotExistObject; 
            private Boolean needUpstream; 
            private String nodeEnv; 
            private java.util.List<String> nodeIdList; 

            private Builder() {
            } 

            private Builder(FilterQuery model) {
                this.needDownstream = model.needDownstream;
                this.needNotExistObject = model.needNotExistObject;
                this.needUpstream = model.needUpstream;
                this.nodeEnv = model.nodeEnv;
                this.nodeIdList = model.nodeIdList;
            } 

            /**
             * NeedDownstream.
             */
            public Builder needDownstream(Boolean needDownstream) {
                this.needDownstream = needDownstream;
                return this;
            }

            /**
             * NeedNotExistObject.
             */
            public Builder needNotExistObject(Boolean needNotExistObject) {
                this.needNotExistObject = needNotExistObject;
                return this;
            }

            /**
             * NeedUpstream.
             */
            public Builder needUpstream(Boolean needUpstream) {
                this.needUpstream = needUpstream;
                return this;
            }

            /**
             * NodeEnv.
             */
            public Builder nodeEnv(String nodeEnv) {
                this.nodeEnv = nodeEnv;
                return this;
            }

            /**
             * NodeIdList.
             */
            public Builder nodeIdList(java.util.List<String> nodeIdList) {
                this.nodeIdList = nodeIdList;
                return this;
            }

            public FilterQuery build() {
                return new FilterQuery(this);
            } 

        } 

    }
}
