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
         * <p>The attack type of the vulnerability prevention event. Valid values:</p>
         * <ul>
         * <li>SQL injection</li>
         * <li>cross-site scripting (XSS)</li>
         * <li>code execute</li>
         * <li>CRLF</li>
         * <li>local file inclusion (LFI)</li>
         * <li>remote file inclusion (RFI)</li>
         * <li>webshell</li>
         * <li>cross-site request forgery</li>
         * <li>Others</li>
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
         * <p>The ID of the WAF rule.</p>
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
         * <p>The WAF instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>esa-site-awmmx25y2igw</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The language type. The response is returned in the specified language. Valid values:</p>
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
         * <p>The managed ruleset configuration in JSON string format.</p>
         * <p>Contains the AttackType, ProtectionLevel, Action, and ManagedRules subfields. When ProtectionLevel is set to -1 (custom mode), specify the status and action for each rule through the ManagedRules array.</p>
         */
        public Builder managedRuleset(ManagedRuleset managedRuleset) {
            String managedRulesetShrink = shrink(managedRuleset, "ManagedRuleset", "json");
            this.putQueryParameter("ManagedRuleset", managedRulesetShrink);
            this.managedRuleset = managedRuleset;
            return this;
        }

        /**
         * <p>The page number.</p>
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
         * <p>The page size.</p>
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
         * <p>The currently saved protection level, which represents the existing configuration state in the database.</p>
         * <p>Valid values: -1 (custom mode), 1 (loose), 2 (medium), 3 (strict), 4 (super strict).</p>
         * <p>Difference from ManagedRuleset.ProtectionLevel: this parameter indicates the currently effective configuration, while ManagedRuleset.ProtectionLevel indicates the target value being passed in.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder protectionLevel(Integer protectionLevel) {
            this.putQueryParameter("ProtectionLevel", protectionLevel);
            this.protectionLevel = protectionLevel;
            return this;
        }

        /**
         * <p>The query conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;Status\&quot;:\&quot;\&quot;,\&quot;ProtectionLevels\&quot;:[2,1],\&quot;Action\&quot;:\&quot;\&quot;,\&quot;IdNameLike\&quot;:\&quot;\&quot;}</p>
         */
        public Builder queryArgs(QueryArgs queryArgs) {
            String queryArgsShrink = shrink(queryArgs, "QueryArgs", "json");
            this.putQueryParameter("QueryArgs", queryArgsShrink);
            this.queryArgs = queryArgs;
            return this;
        }

        /**
         * <p>The site ID. You can obtain the site ID by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
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
             * <p>The action for a single rule. This parameter takes effect only in custom mode (ProtectionLevel = -1).</p>
             * <p>Common valid values: monitor, deny, js, captcha. The actual available values depend on the instance quota.</p>
             * 
             * <strong>example:</strong>
             * <p>js</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The unique ID of a single managed rule.</p>
             * 
             * <strong>example:</strong>
             * <p>20611349</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The rule enabled status.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>on: enabled.</li>
             * <li>off: disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
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
             * <p>The unified action when ProtectionLevel is greater than 0. This parameter cannot be empty in this case.</p>
             * <p>Common valid values: monitor, deny, js, captcha. The actual available values depend on the instance quota.</p>
             * 
             * <strong>example:</strong>
             * <p>monitor</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The attack type encoding. The value cannot be 0.</p>
             * <p>Example values: 11 (SQL injection), 12 (XSS), 13 (code execute), 14 (CRLF), 15 (local file inclusion (LFI)), 16 (remote file inclusion (RFI)), 17 (WebShell), 22 (command injection), 26 (SSRF), 27 (path traversal), 28 (protocol violation), 31 (scanner behavior).</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder attackType(Integer attackType) {
                this.attackType = attackType;
                return this;
            }

            /**
             * <p>The rule configuration list in custom mode. This parameter is used only when ProtectionLevel is set to -1.</p>
             * <p>Each element contains Id, Status, and Action, which are used to specify the enabled status and action for each managed rule.</p>
             */
            public Builder managedRules(java.util.List<ManagedRules> managedRules) {
                this.managedRules = managedRules;
                return this;
            }

            /**
             * <p>The protection level within the ruleset.</p>
             * <p>Valid values: -1 (custom mode, specify each rule through ManagedRules), 1 (loose), 2 (medium), 3 (strict), 4 (super strict).</p>
             * <p>When the value is -1, ManagedRules cannot be empty. When the value is greater than 0, Action cannot be empty.</p>
             * 
             * <strong>example:</strong>
             * <p>-1</p>
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
             * <p>The action.</p>
             * 
             * <strong>example:</strong>
             * <p>deny</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>Fuzzy match by rule ID or rule name.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder idNameLike(String idNameLike) {
                this.idNameLike = idNameLike;
                return this;
            }

            /**
             * <p>The list of rule protection levels.</p>
             */
            public Builder protectionLevels(java.util.List<Integer> protectionLevels) {
                this.protectionLevels = protectionLevels;
                return this;
            }

            /**
             * <p>The status.</p>
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
