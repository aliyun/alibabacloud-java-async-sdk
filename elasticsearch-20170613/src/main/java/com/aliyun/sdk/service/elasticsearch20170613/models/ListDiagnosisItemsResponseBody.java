// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link ListDiagnosisItemsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDiagnosisItemsResponseBody</p>
 */
public class ListDiagnosisItemsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    private ListDiagnosisItemsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDiagnosisItemsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List<Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Result> result; 

        private Builder() {
        } 

        private Builder(ListDiagnosisItemsResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned results.</p>
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        public ListDiagnosisItemsResponseBody build() {
            return new ListDiagnosisItemsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDiagnosisItemsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDiagnosisItemsResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("billable")
        private Boolean billable;

        @com.aliyun.core.annotation.NameInMap("category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("esApiRequired")
        private Boolean esApiRequired;

        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("sortOrder")
        private Integer sortOrder;

        @com.aliyun.core.annotation.NameInMap("supportedModes")
        private java.util.List<String> supportedModes;

        private Result(Builder builder) {
            this.billable = builder.billable;
            this.category = builder.category;
            this.description = builder.description;
            this.esApiRequired = builder.esApiRequired;
            this.key = builder.key;
            this.level = builder.level;
            this.name = builder.name;
            this.sortOrder = builder.sortOrder;
            this.supportedModes = builder.supportedModes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return billable
         */
        public Boolean getBillable() {
            return this.billable;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return esApiRequired
         */
        public Boolean getEsApiRequired() {
            return this.esApiRequired;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return sortOrder
         */
        public Integer getSortOrder() {
            return this.sortOrder;
        }

        /**
         * @return supportedModes
         */
        public java.util.List<String> getSupportedModes() {
            return this.supportedModes;
        }

        public static final class Builder {
            private Boolean billable; 
            private String category; 
            private String description; 
            private Boolean esApiRequired; 
            private String key; 
            private String level; 
            private String name; 
            private Integer sortOrder; 
            private java.util.List<String> supportedModes; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.billable = model.billable;
                this.category = model.category;
                this.description = model.description;
                this.esApiRequired = model.esApiRequired;
                this.key = model.key;
                this.level = model.level;
                this.name = model.name;
                this.sortOrder = model.sortOrder;
                this.supportedModes = model.supportedModes;
            } 

            /**
             * <p>Indicates whether billable tokens are consumed. The value is true when level is ADVANCED.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder billable(Boolean billable) {
                this.billable = billable;
                return this;
            }

            /**
             * <p>The category code. You can use this value to group diagnostic items by category.</p>
             * 
             * <strong>example:</strong>
             * <p>CLUSTER_HEALTH</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The diagnostic item description.</p>
             * 
             * <strong>example:</strong>
             * <p>Diagnoses whether data write operations are backlogged in the cluster. When data write operations are backlogged, BulkReject exceptions occur, which may cause data loss and severe system resource consumption</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates whether the cluster API is accessed.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder esApiRequired(Boolean esApiRequired) {
                this.esApiRequired = esApiRequired;
                return this;
            }

            /**
             * <p>The diagnostic item identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>ClusterBulkRejectDiagnostic</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The diagnostic item level. Valid values:</p>
             * <ul>
             * <li>BASIC: basic inspection item (free).</li>
             * <li>ADVANCED: advanced inspection item (consumes billable tokens).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BASIC</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The diagnostic item name.</p>
             * 
             * <strong>example:</strong>
             * <p>Index Write BulkReject Diagnostics</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The sort order number for display.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sortOrder(Integer sortOrder) {
                this.sortOrder = sortOrder;
                return this;
            }

            /**
             * <p>The supported execution modes. Basic items support RULE and AGENT. Advanced items support only AGENT.</p>
             */
            public Builder supportedModes(java.util.List<String> supportedModes) {
                this.supportedModes = supportedModes;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
