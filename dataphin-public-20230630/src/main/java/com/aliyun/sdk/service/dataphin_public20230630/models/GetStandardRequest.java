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
 * {@link GetStandardRequest} extends {@link RequestModel}
 *
 * <p>GetStandardRequest</p>
 */
public class GetStandardRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StandardGetQuery")
    @com.aliyun.core.annotation.Validation(required = true)
    private StandardGetQuery standardGetQuery;

    private GetStandardRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.standardGetQuery = builder.standardGetQuery;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStandardRequest create() {
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
     * @return standardGetQuery
     */
    public StandardGetQuery getStandardGetQuery() {
        return this.standardGetQuery;
    }

    public static final class Builder extends Request.Builder<GetStandardRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private StandardGetQuery standardGetQuery; 

        private Builder() {
            super();
        } 

        private Builder(GetStandardRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
            this.standardGetQuery = request.standardGetQuery;
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
        public Builder standardGetQuery(StandardGetQuery standardGetQuery) {
            String standardGetQueryShrink = shrink(standardGetQuery, "StandardGetQuery", "json");
            this.putBodyParameter("StandardGetQuery", standardGetQueryShrink);
            this.standardGetQuery = standardGetQuery;
            return this;
        }

        @Override
        public GetStandardRequest build() {
            return new GetStandardRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetStandardRequest} extends {@link TeaModel}
     *
     * <p>GetStandardRequest</p>
     */
    public static class StandardGetQuery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NeedRelation")
        private Boolean needRelation;

        @com.aliyun.core.annotation.NameInMap("Nullable")
        private Boolean nullable;

        @com.aliyun.core.annotation.NameInMap("StandardId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long standardId;

        @com.aliyun.core.annotation.NameInMap("StandardStage")
        private String standardStage;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Integer version;

        private StandardGetQuery(Builder builder) {
            this.needRelation = builder.needRelation;
            this.nullable = builder.nullable;
            this.standardId = builder.standardId;
            this.standardStage = builder.standardStage;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StandardGetQuery create() {
            return builder().build();
        }

        /**
         * @return needRelation
         */
        public Boolean getNeedRelation() {
            return this.needRelation;
        }

        /**
         * @return nullable
         */
        public Boolean getNullable() {
            return this.nullable;
        }

        /**
         * @return standardId
         */
        public Long getStandardId() {
            return this.standardId;
        }

        /**
         * @return standardStage
         */
        public String getStandardStage() {
            return this.standardStage;
        }

        /**
         * @return version
         */
        public Integer getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Boolean needRelation; 
            private Boolean nullable; 
            private Long standardId; 
            private String standardStage; 
            private Integer version; 

            private Builder() {
            } 

            private Builder(StandardGetQuery model) {
                this.needRelation = model.needRelation;
                this.nullable = model.nullable;
                this.standardId = model.standardId;
                this.standardStage = model.standardStage;
                this.version = model.version;
            } 

            /**
             * NeedRelation.
             */
            public Builder needRelation(Boolean needRelation) {
                this.needRelation = needRelation;
                return this;
            }

            /**
             * Nullable.
             */
            public Builder nullable(Boolean nullable) {
                this.nullable = nullable;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder standardId(Long standardId) {
                this.standardId = standardId;
                return this;
            }

            /**
             * StandardStage.
             */
            public Builder standardStage(String standardStage) {
                this.standardStage = standardStage;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            public StandardGetQuery build() {
                return new StandardGetQuery(this);
            } 

        } 

    }
}
