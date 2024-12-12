// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link WafRuleConfig} extends {@link TeaModel}
 *
 * <p>WafRuleConfig</p>
 */
public class WafRuleConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Action")
    private String action;

    @com.aliyun.core.annotation.NameInMap("Actions")
    private Actions actions;

    @com.aliyun.core.annotation.NameInMap("AppPackage")
    private AppPackage appPackage;

    @com.aliyun.core.annotation.NameInMap("AppSdk")
    private AppSdk appSdk;

    @com.aliyun.core.annotation.NameInMap("Expression")
    private String expression;

    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("ManagedGroupId")
    private Long managedGroupId;

    @com.aliyun.core.annotation.NameInMap("ManagedList")
    private String managedList;

    @com.aliyun.core.annotation.NameInMap("ManagedRulesets")
    private java.util.List < ManagedRulesets> managedRulesets;

    @com.aliyun.core.annotation.NameInMap("Match")
    private WafRuleMatch match;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Notes")
    private String notes;

    @com.aliyun.core.annotation.NameInMap("RateLimit")
    private RateLimit rateLimit;

    @com.aliyun.core.annotation.NameInMap("Sigchl")
    private java.util.List < String > sigchl;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Timer")
    private WafTimer timer;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("Value")
    private String value;

    private WafRuleConfig(Builder builder) {
        this.action = builder.action;
        this.actions = builder.actions;
        this.appPackage = builder.appPackage;
        this.appSdk = builder.appSdk;
        this.expression = builder.expression;
        this.id = builder.id;
        this.managedGroupId = builder.managedGroupId;
        this.managedList = builder.managedList;
        this.managedRulesets = builder.managedRulesets;
        this.match = builder.match;
        this.name = builder.name;
        this.notes = builder.notes;
        this.rateLimit = builder.rateLimit;
        this.sigchl = builder.sigchl;
        this.status = builder.status;
        this.timer = builder.timer;
        this.type = builder.type;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WafRuleConfig create() {
        return builder().build();
    }

    /**
     * @return action
     */
    public String getAction() {
        return this.action;
    }

    /**
     * @return actions
     */
    public Actions getActions() {
        return this.actions;
    }

    /**
     * @return appPackage
     */
    public AppPackage getAppPackage() {
        return this.appPackage;
    }

    /**
     * @return appSdk
     */
    public AppSdk getAppSdk() {
        return this.appSdk;
    }

    /**
     * @return expression
     */
    public String getExpression() {
        return this.expression;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return managedGroupId
     */
    public Long getManagedGroupId() {
        return this.managedGroupId;
    }

    /**
     * @return managedList
     */
    public String getManagedList() {
        return this.managedList;
    }

    /**
     * @return managedRulesets
     */
    public java.util.List < ManagedRulesets> getManagedRulesets() {
        return this.managedRulesets;
    }

    /**
     * @return match
     */
    public WafRuleMatch getMatch() {
        return this.match;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return notes
     */
    public String getNotes() {
        return this.notes;
    }

    /**
     * @return rateLimit
     */
    public RateLimit getRateLimit() {
        return this.rateLimit;
    }

    /**
     * @return sigchl
     */
    public java.util.List < String > getSigchl() {
        return this.sigchl;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return timer
     */
    public WafTimer getTimer() {
        return this.timer;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder {
        private String action; 
        private Actions actions; 
        private AppPackage appPackage; 
        private AppSdk appSdk; 
        private String expression; 
        private Long id; 
        private Long managedGroupId; 
        private String managedList; 
        private java.util.List < ManagedRulesets> managedRulesets; 
        private WafRuleMatch match; 
        private String name; 
        private String notes; 
        private RateLimit rateLimit; 
        private java.util.List < String > sigchl; 
        private String status; 
        private WafTimer timer; 
        private String type; 
        private String value; 

        /**
         * Action.
         */
        public Builder action(String action) {
            this.action = action;
            return this;
        }

        /**
         * Actions.
         */
        public Builder actions(Actions actions) {
            this.actions = actions;
            return this;
        }

        /**
         * AppPackage.
         */
        public Builder appPackage(AppPackage appPackage) {
            this.appPackage = appPackage;
            return this;
        }

        /**
         * AppSdk.
         */
        public Builder appSdk(AppSdk appSdk) {
            this.appSdk = appSdk;
            return this;
        }

        /**
         * Expression.
         */
        public Builder expression(String expression) {
            this.expression = expression;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * ManagedGroupId.
         */
        public Builder managedGroupId(Long managedGroupId) {
            this.managedGroupId = managedGroupId;
            return this;
        }

        /**
         * ManagedList.
         */
        public Builder managedList(String managedList) {
            this.managedList = managedList;
            return this;
        }

        /**
         * ManagedRulesets.
         */
        public Builder managedRulesets(java.util.List < ManagedRulesets> managedRulesets) {
            this.managedRulesets = managedRulesets;
            return this;
        }

        /**
         * Match.
         */
        public Builder match(WafRuleMatch match) {
            this.match = match;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Notes.
         */
        public Builder notes(String notes) {
            this.notes = notes;
            return this;
        }

        /**
         * RateLimit.
         */
        public Builder rateLimit(RateLimit rateLimit) {
            this.rateLimit = rateLimit;
            return this;
        }

        /**
         * Sigchl.
         */
        public Builder sigchl(java.util.List < String > sigchl) {
            this.sigchl = sigchl;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Timer.
         */
        public Builder timer(WafTimer timer) {
            this.timer = timer;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Value.
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public WafRuleConfig build() {
            return new WafRuleConfig(this);
        } 

    } 

    /**
     * 
     * {@link WafRuleConfig} extends {@link TeaModel}
     *
     * <p>WafRuleConfig</p>
     */
    public static class Bypass extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomRules")
        private java.util.List < Long > customRules;

        @com.aliyun.core.annotation.NameInMap("RegularRules")
        private java.util.List < Long > regularRules;

        @com.aliyun.core.annotation.NameInMap("RegularTypes")
        private java.util.List < String > regularTypes;

        @com.aliyun.core.annotation.NameInMap("Skip")
        private String skip;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < String > tags;

        private Bypass(Builder builder) {
            this.customRules = builder.customRules;
            this.regularRules = builder.regularRules;
            this.regularTypes = builder.regularTypes;
            this.skip = builder.skip;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Bypass create() {
            return builder().build();
        }

        /**
         * @return customRules
         */
        public java.util.List < Long > getCustomRules() {
            return this.customRules;
        }

        /**
         * @return regularRules
         */
        public java.util.List < Long > getRegularRules() {
            return this.regularRules;
        }

        /**
         * @return regularTypes
         */
        public java.util.List < String > getRegularTypes() {
            return this.regularTypes;
        }

        /**
         * @return skip
         */
        public String getSkip() {
            return this.skip;
        }

        /**
         * @return tags
         */
        public java.util.List < String > getTags() {
            return this.tags;
        }

        public static final class Builder {
            private java.util.List < Long > customRules; 
            private java.util.List < Long > regularRules; 
            private java.util.List < String > regularTypes; 
            private String skip; 
            private java.util.List < String > tags; 

            /**
             * CustomRules.
             */
            public Builder customRules(java.util.List < Long > customRules) {
                this.customRules = customRules;
                return this;
            }

            /**
             * RegularRules.
             */
            public Builder regularRules(java.util.List < Long > regularRules) {
                this.regularRules = regularRules;
                return this;
            }

            /**
             * RegularTypes.
             */
            public Builder regularTypes(java.util.List < String > regularTypes) {
                this.regularTypes = regularTypes;
                return this;
            }

            /**
             * Skip.
             */
            public Builder skip(String skip) {
                this.skip = skip;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List < String > tags) {
                this.tags = tags;
                return this;
            }

            public Bypass build() {
                return new Bypass(this);
            } 

        } 

    }
    /**
     * 
     * {@link WafRuleConfig} extends {@link TeaModel}
     *
     * <p>WafRuleConfig</p>
     */
    public static class Response extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private Integer code;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        private Response(Builder builder) {
            this.code = builder.code;
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Response create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public Integer getCode() {
            return this.code;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        public static final class Builder {
            private Integer code; 
            private Long id; 

            /**
             * Code.
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            public Response build() {
                return new Response(this);
            } 

        } 

    }
    /**
     * 
     * {@link WafRuleConfig} extends {@link TeaModel}
     *
     * <p>WafRuleConfig</p>
     */
    public static class Actions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bypass")
        private Bypass bypass;

        @com.aliyun.core.annotation.NameInMap("Response")
        private Response response;

        private Actions(Builder builder) {
            this.bypass = builder.bypass;
            this.response = builder.response;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Actions create() {
            return builder().build();
        }

        /**
         * @return bypass
         */
        public Bypass getBypass() {
            return this.bypass;
        }

        /**
         * @return response
         */
        public Response getResponse() {
            return this.response;
        }

        public static final class Builder {
            private Bypass bypass; 
            private Response response; 

            /**
             * Bypass.
             */
            public Builder bypass(Bypass bypass) {
                this.bypass = bypass;
                return this;
            }

            /**
             * Response.
             */
            public Builder response(Response response) {
                this.response = response;
                return this;
            }

            public Actions build() {
                return new Actions(this);
            } 

        } 

    }
    /**
     * 
     * {@link WafRuleConfig} extends {@link TeaModel}
     *
     * <p>WafRuleConfig</p>
     */
    public static class PackageSigns extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Sign")
        private String sign;

        private PackageSigns(Builder builder) {
            this.name = builder.name;
            this.sign = builder.sign;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PackageSigns create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return sign
         */
        public String getSign() {
            return this.sign;
        }

        public static final class Builder {
            private String name; 
            private String sign; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Sign.
             */
            public Builder sign(String sign) {
                this.sign = sign;
                return this;
            }

            public PackageSigns build() {
                return new PackageSigns(this);
            } 

        } 

    }
    /**
     * 
     * {@link WafRuleConfig} extends {@link TeaModel}
     *
     * <p>WafRuleConfig</p>
     */
    public static class AppPackage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PackageSigns")
        private java.util.List < PackageSigns> packageSigns;

        private AppPackage(Builder builder) {
            this.packageSigns = builder.packageSigns;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppPackage create() {
            return builder().build();
        }

        /**
         * @return packageSigns
         */
        public java.util.List < PackageSigns> getPackageSigns() {
            return this.packageSigns;
        }

        public static final class Builder {
            private java.util.List < PackageSigns> packageSigns; 

            /**
             * PackageSigns.
             */
            public Builder packageSigns(java.util.List < PackageSigns> packageSigns) {
                this.packageSigns = packageSigns;
                return this;
            }

            public AppPackage build() {
                return new AppPackage(this);
            } 

        } 

    }
    /**
     * 
     * {@link WafRuleConfig} extends {@link TeaModel}
     *
     * <p>WafRuleConfig</p>
     */
    public static class CustomSign extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private CustomSign(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomSign create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public CustomSign build() {
                return new CustomSign(this);
            } 

        } 

    }
    /**
     * 
     * {@link WafRuleConfig} extends {@link TeaModel}
     *
     * <p>WafRuleConfig</p>
     */
    public static class AppSdk extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomSign")
        private CustomSign customSign;

        @com.aliyun.core.annotation.NameInMap("CustomSignStatus")
        private String customSignStatus;

        @com.aliyun.core.annotation.NameInMap("FeatureAbnormal")
        private java.util.List < String > featureAbnormal;

        private AppSdk(Builder builder) {
            this.customSign = builder.customSign;
            this.customSignStatus = builder.customSignStatus;
            this.featureAbnormal = builder.featureAbnormal;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppSdk create() {
            return builder().build();
        }

        /**
         * @return customSign
         */
        public CustomSign getCustomSign() {
            return this.customSign;
        }

        /**
         * @return customSignStatus
         */
        public String getCustomSignStatus() {
            return this.customSignStatus;
        }

        /**
         * @return featureAbnormal
         */
        public java.util.List < String > getFeatureAbnormal() {
            return this.featureAbnormal;
        }

        public static final class Builder {
            private CustomSign customSign; 
            private String customSignStatus; 
            private java.util.List < String > featureAbnormal; 

            /**
             * CustomSign.
             */
            public Builder customSign(CustomSign customSign) {
                this.customSign = customSign;
                return this;
            }

            /**
             * CustomSignStatus.
             */
            public Builder customSignStatus(String customSignStatus) {
                this.customSignStatus = customSignStatus;
                return this;
            }

            /**
             * FeatureAbnormal.
             */
            public Builder featureAbnormal(java.util.List < String > featureAbnormal) {
                this.featureAbnormal = featureAbnormal;
                return this;
            }

            public AppSdk build() {
                return new AppSdk(this);
            } 

        } 

    }
    /**
     * 
     * {@link WafRuleConfig} extends {@link TeaModel}
     *
     * <p>WafRuleConfig</p>
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

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * Id.
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
     * {@link WafRuleConfig} extends {@link TeaModel}
     *
     * <p>WafRuleConfig</p>
     */
    public static class ManagedRulesets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("AttackType")
        private Integer attackType;

        @com.aliyun.core.annotation.NameInMap("ManagedRules")
        private java.util.List < ManagedRules> managedRules;

        @com.aliyun.core.annotation.NameInMap("NumberEnabled")
        private Integer numberEnabled;

        @com.aliyun.core.annotation.NameInMap("NumberTotal")
        private Integer numberTotal;

        @com.aliyun.core.annotation.NameInMap("ProtectionLevel")
        private Integer protectionLevel;

        private ManagedRulesets(Builder builder) {
            this.action = builder.action;
            this.attackType = builder.attackType;
            this.managedRules = builder.managedRules;
            this.numberEnabled = builder.numberEnabled;
            this.numberTotal = builder.numberTotal;
            this.protectionLevel = builder.protectionLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ManagedRulesets create() {
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
        public java.util.List < ManagedRules> getManagedRules() {
            return this.managedRules;
        }

        /**
         * @return numberEnabled
         */
        public Integer getNumberEnabled() {
            return this.numberEnabled;
        }

        /**
         * @return numberTotal
         */
        public Integer getNumberTotal() {
            return this.numberTotal;
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
            private java.util.List < ManagedRules> managedRules; 
            private Integer numberEnabled; 
            private Integer numberTotal; 
            private Integer protectionLevel; 

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * AttackType.
             */
            public Builder attackType(Integer attackType) {
                this.attackType = attackType;
                return this;
            }

            /**
             * ManagedRules.
             */
            public Builder managedRules(java.util.List < ManagedRules> managedRules) {
                this.managedRules = managedRules;
                return this;
            }

            /**
             * NumberEnabled.
             */
            public Builder numberEnabled(Integer numberEnabled) {
                this.numberEnabled = numberEnabled;
                return this;
            }

            /**
             * NumberTotal.
             */
            public Builder numberTotal(Integer numberTotal) {
                this.numberTotal = numberTotal;
                return this;
            }

            /**
             * ProtectionLevel.
             */
            public Builder protectionLevel(Integer protectionLevel) {
                this.protectionLevel = protectionLevel;
                return this;
            }

            public ManagedRulesets build() {
                return new ManagedRulesets(this);
            } 

        } 

    }
    /**
     * 
     * {@link WafRuleConfig} extends {@link TeaModel}
     *
     * <p>WafRuleConfig</p>
     */
    public static class ResponseStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private Integer code;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("Ratio")
        private Integer ratio;

        private ResponseStatus(Builder builder) {
            this.code = builder.code;
            this.count = builder.count;
            this.ratio = builder.ratio;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResponseStatus create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public Integer getCode() {
            return this.code;
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return ratio
         */
        public Integer getRatio() {
            return this.ratio;
        }

        public static final class Builder {
            private Integer code; 
            private Integer count; 
            private Integer ratio; 

            /**
             * Code.
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * Ratio.
             */
            public Builder ratio(Integer ratio) {
                this.ratio = ratio;
                return this;
            }

            public ResponseStatus build() {
                return new ResponseStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link WafRuleConfig} extends {@link TeaModel}
     *
     * <p>WafRuleConfig</p>
     */
    public static class Threshold extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DistinctManagedRules")
        private Integer distinctManagedRules;

        @com.aliyun.core.annotation.NameInMap("ManagedRulesBlocked")
        private Integer managedRulesBlocked;

        @com.aliyun.core.annotation.NameInMap("Request")
        private Integer request;

        @com.aliyun.core.annotation.NameInMap("ResponseStatus")
        private ResponseStatus responseStatus;

        @com.aliyun.core.annotation.NameInMap("Traffic")
        private String traffic;

        private Threshold(Builder builder) {
            this.distinctManagedRules = builder.distinctManagedRules;
            this.managedRulesBlocked = builder.managedRulesBlocked;
            this.request = builder.request;
            this.responseStatus = builder.responseStatus;
            this.traffic = builder.traffic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Threshold create() {
            return builder().build();
        }

        /**
         * @return distinctManagedRules
         */
        public Integer getDistinctManagedRules() {
            return this.distinctManagedRules;
        }

        /**
         * @return managedRulesBlocked
         */
        public Integer getManagedRulesBlocked() {
            return this.managedRulesBlocked;
        }

        /**
         * @return request
         */
        public Integer getRequest() {
            return this.request;
        }

        /**
         * @return responseStatus
         */
        public ResponseStatus getResponseStatus() {
            return this.responseStatus;
        }

        /**
         * @return traffic
         */
        public String getTraffic() {
            return this.traffic;
        }

        public static final class Builder {
            private Integer distinctManagedRules; 
            private Integer managedRulesBlocked; 
            private Integer request; 
            private ResponseStatus responseStatus; 
            private String traffic; 

            /**
             * DistinctManagedRules.
             */
            public Builder distinctManagedRules(Integer distinctManagedRules) {
                this.distinctManagedRules = distinctManagedRules;
                return this;
            }

            /**
             * ManagedRulesBlocked.
             */
            public Builder managedRulesBlocked(Integer managedRulesBlocked) {
                this.managedRulesBlocked = managedRulesBlocked;
                return this;
            }

            /**
             * Request.
             */
            public Builder request(Integer request) {
                this.request = request;
                return this;
            }

            /**
             * ResponseStatus.
             */
            public Builder responseStatus(ResponseStatus responseStatus) {
                this.responseStatus = responseStatus;
                return this;
            }

            /**
             * Traffic.
             */
            public Builder traffic(String traffic) {
                this.traffic = traffic;
                return this;
            }

            public Threshold build() {
                return new Threshold(this);
            } 

        } 

    }
    /**
     * 
     * {@link WafRuleConfig} extends {@link TeaModel}
     *
     * <p>WafRuleConfig</p>
     */
    public static class RateLimit extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Characteristics")
        private WafRuleMatch2 characteristics;

        @com.aliyun.core.annotation.NameInMap("Interval")
        private Integer interval;

        @com.aliyun.core.annotation.NameInMap("OnHit")
        private Boolean onHit;

        @com.aliyun.core.annotation.NameInMap("TTL")
        private Integer TTL;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private Threshold threshold;

        private RateLimit(Builder builder) {
            this.characteristics = builder.characteristics;
            this.interval = builder.interval;
            this.onHit = builder.onHit;
            this.TTL = builder.TTL;
            this.threshold = builder.threshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RateLimit create() {
            return builder().build();
        }

        /**
         * @return characteristics
         */
        public WafRuleMatch2 getCharacteristics() {
            return this.characteristics;
        }

        /**
         * @return interval
         */
        public Integer getInterval() {
            return this.interval;
        }

        /**
         * @return onHit
         */
        public Boolean getOnHit() {
            return this.onHit;
        }

        /**
         * @return TTL
         */
        public Integer getTTL() {
            return this.TTL;
        }

        /**
         * @return threshold
         */
        public Threshold getThreshold() {
            return this.threshold;
        }

        public static final class Builder {
            private WafRuleMatch2 characteristics; 
            private Integer interval; 
            private Boolean onHit; 
            private Integer TTL; 
            private Threshold threshold; 

            /**
             * Characteristics.
             */
            public Builder characteristics(WafRuleMatch2 characteristics) {
                this.characteristics = characteristics;
                return this;
            }

            /**
             * Interval.
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * OnHit.
             */
            public Builder onHit(Boolean onHit) {
                this.onHit = onHit;
                return this;
            }

            /**
             * TTL.
             */
            public Builder TTL(Integer TTL) {
                this.TTL = TTL;
                return this;
            }

            /**
             * Threshold.
             */
            public Builder threshold(Threshold threshold) {
                this.threshold = threshold;
                return this;
            }

            public RateLimit build() {
                return new RateLimit(this);
            } 

        } 

    }
}
