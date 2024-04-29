// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAntiBruteForceRuleRequest} extends {@link RequestModel}
 *
 * <p>ModifyAntiBruteForceRuleRequest</p>
 */
public class ModifyAntiBruteForceRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultRule")
    private Boolean defaultRule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FailCount")
    private Integer failCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForbiddenTime")
    private Integer forbiddenTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Span")
    private Integer span;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UuidList")
    private java.util.List < String > uuidList;

    private ModifyAntiBruteForceRuleRequest(Builder builder) {
        super(builder);
        this.defaultRule = builder.defaultRule;
        this.failCount = builder.failCount;
        this.forbiddenTime = builder.forbiddenTime;
        this.id = builder.id;
        this.name = builder.name;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sourceIp = builder.sourceIp;
        this.span = builder.span;
        this.uuidList = builder.uuidList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAntiBruteForceRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return defaultRule
     */
    public Boolean getDefaultRule() {
        return this.defaultRule;
    }

    /**
     * @return failCount
     */
    public Integer getFailCount() {
        return this.failCount;
    }

    /**
     * @return forbiddenTime
     */
    public Integer getForbiddenTime() {
        return this.forbiddenTime;
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
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return span
     */
    public Integer getSpan() {
        return this.span;
    }

    /**
     * @return uuidList
     */
    public java.util.List < String > getUuidList() {
        return this.uuidList;
    }

    public static final class Builder extends Request.Builder<ModifyAntiBruteForceRuleRequest, Builder> {
        private Boolean defaultRule; 
        private Integer failCount; 
        private Integer forbiddenTime; 
        private Long id; 
        private String name; 
        private Long resourceOwnerId; 
        private String sourceIp; 
        private Integer span; 
        private java.util.List < String > uuidList; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAntiBruteForceRuleRequest request) {
            super(request);
            this.defaultRule = request.defaultRule;
            this.failCount = request.failCount;
            this.forbiddenTime = request.forbiddenTime;
            this.id = request.id;
            this.name = request.name;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sourceIp = request.sourceIp;
            this.span = request.span;
            this.uuidList = request.uuidList;
        } 

        /**
         * Specifies whether to set the defense rule as the default rule. Valid values:
         * <p>
         * 
         * *   **true**: yes
         * *   **false**: no
         */
        public Builder defaultRule(Boolean defaultRule) {
            this.putQueryParameter("DefaultRule", defaultRule);
            this.defaultRule = defaultRule;
            return this;
        }

        /**
         * The threshold of logon failures that you specify. Valid values:
         * <p>
         * 
         * *   **2**
         * *   **3**
         * *   **4**
         * *   **5**
         * *   **10**
         * *   **50**
         * *   **80**
         * *   **100**
         */
        public Builder failCount(Integer failCount) {
            this.putQueryParameter("FailCount", failCount);
            this.failCount = failCount;
            return this;
        }

        /**
         * The period of time during which logons from an account are not allowed. Unit: minutes. Valid values:
         * <p>
         * 
         * *   **5**
         * *   **15**
         * *   **30**
         * *   **60**
         * *   **120**
         * *   **360**
         * *   **720**
         * *   **1440**
         * *   **10080**
         * *   **52560000**: permanent
         */
        public Builder forbiddenTime(Integer forbiddenTime) {
            this.putQueryParameter("ForbiddenTime", forbiddenTime);
            this.forbiddenTime = forbiddenTime;
            return this;
        }

        /**
         * The ID of the defense rule.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * The name of the defense rule.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The source IP address of the request.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * The period of time during which logon failures from an account are measured. Unit: minutes. Valid values:
         * <p>
         * 
         * *   **1**
         * *   **2**
         * *   **5**
         * *   **10**
         * *   **15**
         */
        public Builder span(Integer span) {
            this.putQueryParameter("Span", span);
            this.span = span;
            return this;
        }

        /**
         * An array consisting of the UUIDs of the servers to which the defense rule is applied.
         */
        public Builder uuidList(java.util.List < String > uuidList) {
            this.putQueryParameter("UuidList", uuidList);
            this.uuidList = uuidList;
            return this;
        }

        @Override
        public ModifyAntiBruteForceRuleRequest build() {
            return new ModifyAntiBruteForceRuleRequest(this);
        } 

    } 

}
