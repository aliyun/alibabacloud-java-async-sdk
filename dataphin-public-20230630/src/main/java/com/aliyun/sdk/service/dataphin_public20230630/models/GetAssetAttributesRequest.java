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
 * {@link GetAssetAttributesRequest} extends {@link RequestModel}
 *
 * <p>GetAssetAttributesRequest</p>
 */
public class GetAssetAttributesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpUserId")
    private String opUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QueryCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private QueryCommand queryCommand;

    private GetAssetAttributesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
        this.queryCommand = builder.queryCommand;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAssetAttributesRequest create() {
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

    /**
     * @return queryCommand
     */
    public QueryCommand getQueryCommand() {
        return this.queryCommand;
    }

    public static final class Builder extends Request.Builder<GetAssetAttributesRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private String opUserId; 
        private QueryCommand queryCommand; 

        private Builder() {
            super();
        } 

        private Builder(GetAssetAttributesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
            this.opUserId = request.opUserId;
            this.queryCommand = request.queryCommand;
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
         * OpUserId.
         */
        public Builder opUserId(String opUserId) {
            this.putQueryParameter("OpUserId", opUserId);
            this.opUserId = opUserId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder queryCommand(QueryCommand queryCommand) {
            String queryCommandShrink = shrink(queryCommand, "QueryCommand", "json");
            this.putBodyParameter("QueryCommand", queryCommandShrink);
            this.queryCommand = queryCommand;
            return this;
        }

        @Override
        public GetAssetAttributesRequest build() {
            return new GetAssetAttributesRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetAssetAttributesRequest} extends {@link TeaModel}
     *
     * <p>GetAssetAttributesRequest</p>
     */
    public static class QueryCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttributeCodeList")
        private java.util.List<String> attributeCodeList;

        @com.aliyun.core.annotation.NameInMap("GuidList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> guidList;

        private QueryCommand(Builder builder) {
            this.attributeCodeList = builder.attributeCodeList;
            this.guidList = builder.guidList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryCommand create() {
            return builder().build();
        }

        /**
         * @return attributeCodeList
         */
        public java.util.List<String> getAttributeCodeList() {
            return this.attributeCodeList;
        }

        /**
         * @return guidList
         */
        public java.util.List<String> getGuidList() {
            return this.guidList;
        }

        public static final class Builder {
            private java.util.List<String> attributeCodeList; 
            private java.util.List<String> guidList; 

            private Builder() {
            } 

            private Builder(QueryCommand model) {
                this.attributeCodeList = model.attributeCodeList;
                this.guidList = model.guidList;
            } 

            /**
             * AttributeCodeList.
             */
            public Builder attributeCodeList(java.util.List<String> attributeCodeList) {
                this.attributeCodeList = attributeCodeList;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder guidList(java.util.List<String> guidList) {
                this.guidList = guidList;
                return this;
            }

            public QueryCommand build() {
                return new QueryCommand(this);
            } 

        } 

    }
}
