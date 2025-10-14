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
 * {@link ListWafManagedRulesRequest} extends {@link RequestModel}
 *
 * <p>ListWafManagedRulesRequest</p>
 */
public class ListWafManagedRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AttackType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer attackType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ManagedRuleset")
    private ManagedRuleset managedRuleset;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProtectionLevel")
    private Integer protectionLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryArgs")
    private QueryArgs queryArgs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    private Long siteId;

    private ListWafManagedRulesRequest(Builder builder) {
        super(builder);
        this.attackType = builder.attackType;
        this.id = builder.id;
        this.instanceId = builder.instanceId;
        this.language = builder.language;
        this.managedRuleset = builder.managedRuleset;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.protectionLevel = builder.protectionLevel;
        this.queryArgs = builder.queryArgs;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWafManagedRulesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attackType
     */
    public Integer getAttackType() {
        return this.attackType;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return managedRuleset
     */
    public ManagedRuleset getManagedRuleset() {
        return this.managedRuleset;
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
     * @return protectionLevel
     */
    public Integer getProtectionLevel() {
        return this.protectionLevel;
    }

    /**
     * @return queryArgs
     */
    public QueryArgs getQueryArgs() {
        return this.queryArgs;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    public static final class Builder extends Request.Builder<ListWafManagedRulesRequest, Builder> {
        private Integer attackType; 
        private Long id; 
        private String instanceId; 
        private String language; 
        private ManagedRuleset managedRuleset; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Integer protectionLevel; 
        private QueryArgs queryArgs; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(ListWafManagedRulesRequest request) {
            super(request);
            this.attackType = request.attackType;
            this.id = request.id;
            this.instanceId = request.instanceId;
            this.language = request.language;
            this.managedRuleset = request.managedRuleset;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.protectionLevel = request.protectionLevel;
            this.queryArgs = request.queryArgs;
            this.siteId = request.siteId;
        } 

        /**
         * <p>Attack type of the vulnerability protection event. Values:</p>
         * <ul>
         * <li>SQL injection</li>
         * <li>Cross-site scripting</li>
         * <li>Code execution</li>
         * <li>CRLF</li>
         * <li>Local file inclusion</li>
         * <li>Remote file inclusion</li>
         * <li>Webshell</li>
         * <li>Cross-site request forgery</li>
         * <li>Other</li>
         * <li>SEMA</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        public Builder attackType(Integer attackType) {
            this.putQueryParameter("AttackType", attackType);
            this.attackType = attackType;
            return this;
        }

        /**
         * <p>ID of the WAF rule.</p>
         * 
         * <strong>example:</strong>
         * <p>10000001</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Language type, which will be used to return the response. Value range:</p>
         * <ul>
         * <li><strong>en</strong>: English.</li>
         * <li><strong>zh</strong>: Chinese.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * ManagedRuleset.
         */
        public Builder managedRuleset(ManagedRuleset managedRuleset) {
            String managedRulesetShrink = shrink(managedRuleset, "ManagedRuleset", "json");
            this.putQueryParameter("ManagedRuleset", managedRulesetShrink);
            this.managedRuleset = managedRuleset;
            return this;
        }

        /**
         * <p>Query page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>Query page size.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ProtectionLevel.
         */
        public Builder protectionLevel(Integer protectionLevel) {
            this.putQueryParameter("ProtectionLevel", protectionLevel);
            this.protectionLevel = protectionLevel;
            return this;
        }

        /**
         * <p>Query conditions.</p>
         */
        public Builder queryArgs(QueryArgs queryArgs) {
            String queryArgsShrink = shrink(queryArgs, "QueryArgs", "json");
            this.putQueryParameter("QueryArgs", queryArgsShrink);
            this.queryArgs = queryArgs;
            return this;
        }

        /**
         * <p>Site ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> interface.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        @Override
        public ListWafManagedRulesRequest build() {
            return new ListWafManagedRulesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListWafManagedRulesRequest} extends {@link TeaModel}
     *
     * <p>ListWafManagedRulesRequest</p>
     */
    public static class ManagedRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ManagedRules(Builder builder) {
            this.action = builder.action;
            this.id = builder.id;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ManagedRules create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String action; 
            private Long id; 
            private String status; 

            private Builder() {
            } 

            private Builder(ManagedRules model) {
                this.action = model.action;
                this.id = model.id;
                this.status = model.status;
            } 

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>ID of the WAF rule.</p>
             * 
             * <strong>example:</strong>
             * <p>10000001</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ManagedRules build() {
                return new ManagedRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListWafManagedRulesRequest} extends {@link TeaModel}
     *
     * <p>ListWafManagedRulesRequest</p>
     */
    public static class ManagedRuleset extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("AttackType")
        private Integer attackType;

        @com.aliyun.core.annotation.NameInMap("ManagedRules")
        private java.util.List<ManagedRules> managedRules;

        @com.aliyun.core.annotation.NameInMap("ProtectionLevel")
        private Integer protectionLevel;

        private ManagedRuleset(Builder builder) {
            this.action = builder.action;
            this.attackType = builder.attackType;
            this.managedRules = builder.managedRules;
            this.protectionLevel = builder.protectionLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ManagedRuleset create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return attackType
         */
        public Integer getAttackType() {
            return this.attackType;
        }

        /**
         * @return managedRules
         */
        public java.util.List<ManagedRules> getManagedRules() {
            return this.managedRules;
        }

        /**
         * @return protectionLevel
         */
        public Integer getProtectionLevel() {
            return this.protectionLevel;
        }

        public static final class Builder {
            private String action; 
            private Integer attackType; 
            private java.util.List<ManagedRules> managedRules; 
            private Integer protectionLevel; 

            private Builder() {
            } 

            private Builder(ManagedRuleset model) {
                this.action = model.action;
                this.attackType = model.attackType;
                this.managedRules = model.managedRules;
                this.protectionLevel = model.protectionLevel;
            } 

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>Attack type of the vulnerability protection event. Values:</p>
             * <ul>
             * <li>SQL injection</li>
             * <li>Cross-site scripting</li>
             * <li>Code execution</li>
             * <li>CRLF</li>
             * <li>Local file inclusion</li>
             * <li>Remote file inclusion</li>
             * <li>Webshell</li>
             * <li>Cross-site request forgery</li>
             * <li>Other</li>
             * <li>SEMA</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder attackType(Integer attackType) {
                this.attackType = attackType;
                return this;
            }

            /**
             * ManagedRules.
             */
            public Builder managedRules(java.util.List<ManagedRules> managedRules) {
                this.managedRules = managedRules;
                return this;
            }

            /**
             * ProtectionLevel.
             */
            public Builder protectionLevel(Integer protectionLevel) {
                this.protectionLevel = protectionLevel;
                return this;
            }

            public ManagedRuleset build() {
                return new ManagedRuleset(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListWafManagedRulesRequest} extends {@link TeaModel}
     *
     * <p>ListWafManagedRulesRequest</p>
     */
    public static class QueryArgs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("IdNameLike")
        private String idNameLike;

        @com.aliyun.core.annotation.NameInMap("ProtectionLevels")
        private java.util.List<Integer> protectionLevels;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private QueryArgs(Builder builder) {
            this.action = builder.action;
            this.idNameLike = builder.idNameLike;
            this.protectionLevels = builder.protectionLevels;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryArgs create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return idNameLike
         */
        public String getIdNameLike() {
            return this.idNameLike;
        }

        /**
         * @return protectionLevels
         */
        public java.util.List<Integer> getProtectionLevels() {
            return this.protectionLevels;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String action; 
            private String idNameLike; 
            private java.util.List<Integer> protectionLevels; 
            private String status; 

            private Builder() {
            } 

            private Builder(QueryArgs model) {
                this.action = model.action;
                this.idNameLike = model.idNameLike;
                this.protectionLevels = model.protectionLevels;
                this.status = model.status;
            } 

            /**
             * <p>Action.</p>
             * 
             * <strong>example:</strong>
             * <p>deny</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>Fuzzy search for rule ID or rule name.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder idNameLike(String idNameLike) {
                this.idNameLike = idNameLike;
                return this;
            }

            /**
             * <p>List of rule protection levels.</p>
             */
            public Builder protectionLevels(java.util.List<Integer> protectionLevels) {
                this.protectionLevels = protectionLevels;
                return this;
            }

            /**
             * <p>Status.</p>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public QueryArgs build() {
                return new QueryArgs(this);
            } 

        } 

    }
}
