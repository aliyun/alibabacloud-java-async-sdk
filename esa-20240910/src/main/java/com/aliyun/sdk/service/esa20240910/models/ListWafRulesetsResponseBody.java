// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link ListWafRulesetsResponseBody} extends {@link TeaModel}
 *
 * <p>ListWafRulesetsResponseBody</p>
 */
public class ListWafRulesetsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceUsage")
    private Long instanceUsage;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Rulesets")
    private java.util.List<Rulesets> rulesets;

    @com.aliyun.core.annotation.NameInMap("SiteUsage")
    private Long siteUsage;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListWafRulesetsResponseBody(Builder builder) {
        this.instanceUsage = builder.instanceUsage;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.rulesets = builder.rulesets;
        this.siteUsage = builder.siteUsage;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWafRulesetsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceUsage
     */
    public Long getInstanceUsage() {
        return this.instanceUsage;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rulesets
     */
    public java.util.List<Rulesets> getRulesets() {
        return this.rulesets;
    }

    /**
     * @return siteUsage
     */
    public Long getSiteUsage() {
        return this.siteUsage;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Long instanceUsage; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List<Rulesets> rulesets; 
        private Long siteUsage; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListWafRulesetsResponseBody model) {
            this.instanceUsage = model.instanceUsage;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.rulesets = model.rulesets;
            this.siteUsage = model.siteUsage;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>Number of WAF rule sets used by the instance in this WAF operation phase.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder instanceUsage(Long instanceUsage) {
            this.instanceUsage = instanceUsage;
            return this;
        }

        /**
         * <p>Current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>Page size.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>List of rule set information, containing detailed information about the rule sets.</p>
         */
        public Builder rulesets(java.util.List<Rulesets> rulesets) {
            this.rulesets = rulesets;
            return this;
        }

        /**
         * <p>Number of WAF rule sets used by the site in this WAF operation phase.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder siteUsage(Long siteUsage) {
            this.siteUsage = siteUsage;
            return this;
        }

        /**
         * <p>Total number of filtered records.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListWafRulesetsResponseBody build() {
            return new ListWafRulesetsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListWafRulesetsResponseBody} extends {@link TeaModel}
     *
     * <p>ListWafRulesetsResponseBody</p>
     */
    public static class Rulesets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Fields")
        private java.util.List<String> fields;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Phase")
        private String phase;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Target")
        private String target;

        @com.aliyun.core.annotation.NameInMap("Types")
        private java.util.List<String> types;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private Rulesets(Builder builder) {
            this.fields = builder.fields;
            this.id = builder.id;
            this.name = builder.name;
            this.phase = builder.phase;
            this.status = builder.status;
            this.target = builder.target;
            this.types = builder.types;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rulesets create() {
            return builder().build();
        }

        /**
         * @return fields
         */
        public java.util.List<String> getFields() {
            return this.fields;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return phase
         */
        public String getPhase() {
            return this.phase;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return target
         */
        public String getTarget() {
            return this.target;
        }

        /**
         * @return types
         */
        public java.util.List<String> getTypes() {
            return this.types;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private java.util.List<String> fields; 
            private Long id; 
            private String name; 
            private String phase; 
            private String status; 
            private String target; 
            private java.util.List<String> types; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(Rulesets model) {
                this.fields = model.fields;
                this.id = model.id;
                this.name = model.name;
                this.phase = model.phase;
                this.status = model.status;
                this.target = model.target;
                this.types = model.types;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>List of match objects.</p>
             */
            public Builder fields(java.util.List<String> fields) {
                this.fields = fields;
                return this;
            }

            /**
             * <p>ID of the WAF rule set.</p>
             * 
             * <strong>example:</strong>
             * <p>10000001</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Name of the rule set.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>WAF operation phase.</p>
             * 
             * <strong>example:</strong>
             * <p>http_bot</p>
             */
            public Builder phase(String phase) {
                this.phase = phase;
                return this;
            }

            /**
             * <p>Status of the rule set.</p>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Protection target type in http_bot.</p>
             * 
             * <strong>example:</strong>
             * <p>web</p>
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * <p>List of rule types.</p>
             */
            public Builder types(java.util.List<String> types) {
                this.types = types;
                return this;
            }

            /**
             * <p>Last modification time of the rule set.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-01-01T00:00:00Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Rulesets build() {
                return new Rulesets(this);
            } 

        } 

    }
}
