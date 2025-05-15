// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.governance20210120.models;

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
 * {@link ListEvaluationResultsRequest} extends {@link RequestModel}
 *
 * <p>ListEvaluationResultsRequest</p>
 */
public class ListEvaluationResultsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountId")
    private Long accountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filters")
    private java.util.List<Filters> filters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LensCode")
    private String lensCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scope")
    private String scope;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnapshotId")
    private String snapshotId;

    private ListEvaluationResultsRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.filters = builder.filters;
        this.lensCode = builder.lensCode;
        this.regionId = builder.regionId;
        this.scope = builder.scope;
        this.snapshotId = builder.snapshotId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEvaluationResultsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public Long getAccountId() {
        return this.accountId;
    }

    /**
     * @return filters
     */
    public java.util.List<Filters> getFilters() {
        return this.filters;
    }

    /**
     * @return lensCode
     */
    public String getLensCode() {
        return this.lensCode;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    /**
     * @return snapshotId
     */
    public String getSnapshotId() {
        return this.snapshotId;
    }

    public static final class Builder extends Request.Builder<ListEvaluationResultsRequest, Builder> {
        private Long accountId; 
        private java.util.List<Filters> filters; 
        private String lensCode; 
        private String regionId; 
        private String scope; 
        private String snapshotId; 

        private Builder() {
            super();
        } 

        private Builder(ListEvaluationResultsRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.filters = request.filters;
            this.lensCode = request.lensCode;
            this.regionId = request.regionId;
            this.scope = request.scope;
            this.snapshotId = request.snapshotId;
        } 

        /**
         * <p>The Alibaba Cloud account ID of the member. This parameter takes effect only when a multi-account governance maturity check is performed.</p>
         * 
         * <strong>example:</strong>
         * <p>176618589410****</p>
         */
        public Builder accountId(Long accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * <p>The filter conditions.</p>
         */
        public Builder filters(java.util.List<Filters> filters) {
            this.putQueryParameter("Filters", filters);
            this.filters = filters;
            return this;
        }

        /**
         * LensCode.
         */
        public Builder lensCode(String lensCode) {
            this.putQueryParameter("LensCode", lensCode);
            this.lensCode = lensCode;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Scope.
         */
        public Builder scope(String scope) {
            this.putQueryParameter("Scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * SnapshotId.
         */
        public Builder snapshotId(String snapshotId) {
            this.putQueryParameter("SnapshotId", snapshotId);
            this.snapshotId = snapshotId;
            return this;
        }

        @Override
        public ListEvaluationResultsRequest build() {
            return new ListEvaluationResultsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListEvaluationResultsRequest} extends {@link TeaModel}
     *
     * <p>ListEvaluationResultsRequest</p>
     */
    public static class Filters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Values")
        private java.util.List<String> values;

        private Filters(Builder builder) {
            this.key = builder.key;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filters create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return values
         */
        public java.util.List<String> getValues() {
            return this.values;
        }

        public static final class Builder {
            private String key; 
            private java.util.List<String> values; 

            private Builder() {
            } 

            private Builder(Filters model) {
                this.key = model.key;
                this.values = model.values;
            } 

            /**
             * <p>The key of the filter condition. Valid values:</p>
             * <ul>
             * <li>ResourceId: the resource ID.</li>
             * <li>ResourceName: the name of the resource.</li>
             * <li>ResourceType: the resource type.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ResourceId</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The list of filter condition values.</p>
             */
            public Builder values(java.util.List<String> values) {
                this.values = values;
                return this;
            }

            public Filters build() {
                return new Filters(this);
            } 

        } 

    }
}
