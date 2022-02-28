// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAntiBruteForceRuleRequest} extends {@link RequestModel}
 *
 * <p>ModifyAntiBruteForceRuleRequest</p>
 */
public class ModifyAntiBruteForceRuleRequest extends Request {
    @Query
    @NameInMap("DefaultRule")
    private Boolean defaultRule;

    @Query
    @NameInMap("FailCount")
    private Integer failCount;

    @Query
    @NameInMap("ForbiddenTime")
    private Integer forbiddenTime;

    @Query
    @NameInMap("Id")
    private Long id;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("Span")
    private Integer span;

    @Query
    @NameInMap("UuidList")
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

        private Builder(ModifyAntiBruteForceRuleRequest response) {
            super(response);
            this.defaultRule = response.defaultRule;
            this.failCount = response.failCount;
            this.forbiddenTime = response.forbiddenTime;
            this.id = response.id;
            this.name = response.name;
            this.resourceOwnerId = response.resourceOwnerId;
            this.sourceIp = response.sourceIp;
            this.span = response.span;
            this.uuidList = response.uuidList;
        } 

        /**
         * DefaultRule.
         */
        public Builder defaultRule(Boolean defaultRule) {
            this.putQueryParameter("DefaultRule", defaultRule);
            this.defaultRule = defaultRule;
            return this;
        }

        /**
         * FailCount.
         */
        public Builder failCount(Integer failCount) {
            this.putQueryParameter("FailCount", failCount);
            this.failCount = failCount;
            return this;
        }

        /**
         * ForbiddenTime.
         */
        public Builder forbiddenTime(Integer forbiddenTime) {
            this.putQueryParameter("ForbiddenTime", forbiddenTime);
            this.forbiddenTime = forbiddenTime;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * Name.
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
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * Span.
         */
        public Builder span(Integer span) {
            this.putQueryParameter("Span", span);
            this.span = span;
            return this;
        }

        /**
         * UuidList.
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
