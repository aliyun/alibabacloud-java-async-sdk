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
 * {@link GetLatestSubmitDetailRequest} extends {@link RequestModel}
 *
 * <p>GetLatestSubmitDetailRequest</p>
 */
public class GetLatestSubmitDetailRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SubmitDetailQuery")
    @com.aliyun.core.annotation.Validation(required = true)
    private SubmitDetailQuery submitDetailQuery;

    private GetLatestSubmitDetailRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.submitDetailQuery = builder.submitDetailQuery;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLatestSubmitDetailRequest create() {
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
     * @return submitDetailQuery
     */
    public SubmitDetailQuery getSubmitDetailQuery() {
        return this.submitDetailQuery;
    }

    public static final class Builder extends Request.Builder<GetLatestSubmitDetailRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private SubmitDetailQuery submitDetailQuery; 

        private Builder() {
            super();
        } 

        private Builder(GetLatestSubmitDetailRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
            this.submitDetailQuery = request.submitDetailQuery;
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
         * <p>This parameter is required.</p>
         */
        public Builder submitDetailQuery(SubmitDetailQuery submitDetailQuery) {
            String submitDetailQueryShrink = shrink(submitDetailQuery, "SubmitDetailQuery", "json");
            this.putBodyParameter("SubmitDetailQuery", submitDetailQueryShrink);
            this.submitDetailQuery = submitDetailQuery;
            return this;
        }

        @Override
        public GetLatestSubmitDetailRequest build() {
            return new GetLatestSubmitDetailRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetLatestSubmitDetailRequest} extends {@link TeaModel}
     *
     * <p>GetLatestSubmitDetailRequest</p>
     */
    public static class SubmitDetailQuery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ObjectId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String objectId;

        @com.aliyun.core.annotation.NameInMap("ObjectType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String objectType;

        private SubmitDetailQuery(Builder builder) {
            this.objectId = builder.objectId;
            this.objectType = builder.objectType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubmitDetailQuery create() {
            return builder().build();
        }

        /**
         * @return objectId
         */
        public String getObjectId() {
            return this.objectId;
        }

        /**
         * @return objectType
         */
        public String getObjectType() {
            return this.objectType;
        }

        public static final class Builder {
            private String objectId; 
            private String objectType; 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder objectId(String objectId) {
                this.objectId = objectId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>MAX_COMPUTE_SQL</p>
             */
            public Builder objectType(String objectType) {
                this.objectType = objectType;
                return this;
            }

            public SubmitDetailQuery build() {
                return new SubmitDetailQuery(this);
            } 

        } 

    }
}
