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
    @com.aliyun.core.annotation.NameInMap("EvaluationDomain")
    private String evaluationDomain;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopicCode")
    private String topicCode;

    private ListEvaluationResultsRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.evaluationDomain = builder.evaluationDomain;
        this.filters = builder.filters;
        this.lensCode = builder.lensCode;
        this.regionId = builder.regionId;
        this.scope = builder.scope;
        this.snapshotId = builder.snapshotId;
        this.topicCode = builder.topicCode;
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
     * @return evaluationDomain
     */
    public String getEvaluationDomain() {
        return this.evaluationDomain;
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

    /**
     * @return topicCode
     */
    public String getTopicCode() {
        return this.topicCode;
    }

    public static final class Builder extends Request.Builder<ListEvaluationResultsRequest, Builder> {
        private Long accountId; 
        private String evaluationDomain; 
        private java.util.List<Filters> filters; 
        private String lensCode; 
        private String regionId; 
        private String scope; 
        private String snapshotId; 
        private String topicCode; 

        private Builder() {
            super();
        } 

        private Builder(ListEvaluationResultsRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.evaluationDomain = request.evaluationDomain;
            this.filters = request.filters;
            this.lensCode = request.lensCode;
            this.regionId = request.regionId;
            this.scope = request.scope;
            this.snapshotId = request.snapshotId;
            this.topicCode = request.topicCode;
        } 

        /**
         * <p>Member account ID. This parameter is only applicable to multi-account evaluation mode.</p>
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
         * EvaluationDomain.
         */
        public Builder evaluationDomain(String evaluationDomain) {
            this.putQueryParameter("EvaluationDomain", evaluationDomain);
            this.evaluationDomain = evaluationDomain;
            return this;
        }

        /**
         * <p>Filter conditions.</p>
         */
        public Builder filters(java.util.List<Filters> filters) {
            this.putQueryParameter("Filters", filters);
            this.filters = filters;
            return this;
        }

        /**
         * <p>Special evaluation code. Valid values:</p>
         * <ul>
         * <li>basic (default): Basic model (governance maturity) evaluation.</li>
         * <li>ack: Container construction special evaluation.</li>
         * <li>ai: Machine learning special evaluation.</li>
         * <li>nis: Network service special evaluation.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>basic</p>
         */
        public Builder lensCode(String lensCode) {
            this.putQueryParameter("LensCode", lensCode);
            this.lensCode = lensCode;
            return this;
        }

        /**
         * <p>Region ID.</p>
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
         * <p>Governance maturity evaluation scope. Valid values:</p>
         * <ul>
         * <li>Account (default): Performs single-account governance maturity evaluation, evaluating only the current account.</li>
         * <li>ResourceDirectory: Performs multi-account governance maturity evaluation, evaluating all member accounts in the resource directory. Before performing this operation, you must first upgrade to multi-account governance maturity evaluation.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ResourceDirectory</p>
         */
        public Builder scope(String scope) {
            this.putQueryParameter("Scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * <p>Evaluation snapshot ID.</p>
         * 
         * <strong>example:</strong>
         * <p>es-bp1r**************</p>
         */
        public Builder snapshotId(String snapshotId) {
            this.putQueryParameter("SnapshotId", snapshotId);
            this.snapshotId = snapshotId;
            return this;
        }

        /**
         * <p>Governance topic code.</p>
         * 
         * <strong>example:</strong>
         * <p>IdentityAndAccessManagement</p>
         */
        public Builder topicCode(String topicCode) {
            this.putQueryParameter("TopicCode", topicCode);
            this.topicCode = topicCode;
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
             * <p>Filter condition key. Valid values:</p>
             * <ul>
             * <li>ResourceId: Resource ID.</li>
             * <li>ResourceName: Resource name.</li>
             * <li>ResourceType: Resource type.</li>
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
             * <p>List of filter condition values.</p>
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
