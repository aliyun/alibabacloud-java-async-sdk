// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yuqing20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link YuqingFinanceEvent} extends {@link TeaModel}
 *
 * <p>YuqingFinanceEvent</p>
 */
public class YuqingFinanceEvent extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("comprehensiveRisk")
    private Double comprehensiveRisk;

    @com.aliyun.core.annotation.NameInMap("entityArea")
    private String entityArea;

    @com.aliyun.core.annotation.NameInMap("entityCrn")
    private String entityCrn;

    @com.aliyun.core.annotation.NameInMap("entityEmotionScore")
    private Double entityEmotionScore;

    @com.aliyun.core.annotation.NameInMap("entityId")
    private Long entityId;

    @com.aliyun.core.annotation.NameInMap("entityName")
    private String entityName;

    @com.aliyun.core.annotation.NameInMap("entityRelevanceScore")
    private Double entityRelevanceScore;

    @com.aliyun.core.annotation.NameInMap("entityShowName")
    private String entityShowName;

    @com.aliyun.core.annotation.NameInMap("entitySummary")
    private String entitySummary;

    @com.aliyun.core.annotation.NameInMap("entityType")
    private String entityType;

    @com.aliyun.core.annotation.NameInMap("eventId")
    private String eventId;

    @com.aliyun.core.annotation.NameInMap("eventLevel3Code")
    private Long eventLevel3Code;

    @com.aliyun.core.annotation.NameInMap("eventLevel3Name")
    private String eventLevel3Name;

    @com.aliyun.core.annotation.NameInMap("eventTags")
    private String eventTags;

    @com.aliyun.core.annotation.NameInMap("eventTime")
    private Long eventTime;

    @com.aliyun.core.annotation.NameInMap("securityAbbreviation")
    private String securityAbbreviation;

    @com.aliyun.core.annotation.NameInMap("securityCategoryCodes")
    private java.util.List < String > securityCategoryCodes;

    @com.aliyun.core.annotation.NameInMap("securityCodes")
    private java.util.List < String > securityCodes;

    @com.aliyun.core.annotation.NameInMap("securityMarketsCodes")
    private java.util.List < String > securityMarketsCodes;

    @com.aliyun.core.annotation.NameInMap("spamScore")
    private Double spamScore;

    @com.aliyun.core.annotation.NameInMap("userSubscribeEntityTags")
    private java.util.List < String > userSubscribeEntityTags;

    @com.aliyun.core.annotation.NameInMap("userSubscribeEventTags")
    private java.util.List < Long > userSubscribeEventTags;

    private YuqingFinanceEvent(Builder builder) {
        this.comprehensiveRisk = builder.comprehensiveRisk;
        this.entityArea = builder.entityArea;
        this.entityCrn = builder.entityCrn;
        this.entityEmotionScore = builder.entityEmotionScore;
        this.entityId = builder.entityId;
        this.entityName = builder.entityName;
        this.entityRelevanceScore = builder.entityRelevanceScore;
        this.entityShowName = builder.entityShowName;
        this.entitySummary = builder.entitySummary;
        this.entityType = builder.entityType;
        this.eventId = builder.eventId;
        this.eventLevel3Code = builder.eventLevel3Code;
        this.eventLevel3Name = builder.eventLevel3Name;
        this.eventTags = builder.eventTags;
        this.eventTime = builder.eventTime;
        this.securityAbbreviation = builder.securityAbbreviation;
        this.securityCategoryCodes = builder.securityCategoryCodes;
        this.securityCodes = builder.securityCodes;
        this.securityMarketsCodes = builder.securityMarketsCodes;
        this.spamScore = builder.spamScore;
        this.userSubscribeEntityTags = builder.userSubscribeEntityTags;
        this.userSubscribeEventTags = builder.userSubscribeEventTags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static YuqingFinanceEvent create() {
        return builder().build();
    }

    /**
     * @return comprehensiveRisk
     */
    public Double getComprehensiveRisk() {
        return this.comprehensiveRisk;
    }

    /**
     * @return entityArea
     */
    public String getEntityArea() {
        return this.entityArea;
    }

    /**
     * @return entityCrn
     */
    public String getEntityCrn() {
        return this.entityCrn;
    }

    /**
     * @return entityEmotionScore
     */
    public Double getEntityEmotionScore() {
        return this.entityEmotionScore;
    }

    /**
     * @return entityId
     */
    public Long getEntityId() {
        return this.entityId;
    }

    /**
     * @return entityName
     */
    public String getEntityName() {
        return this.entityName;
    }

    /**
     * @return entityRelevanceScore
     */
    public Double getEntityRelevanceScore() {
        return this.entityRelevanceScore;
    }

    /**
     * @return entityShowName
     */
    public String getEntityShowName() {
        return this.entityShowName;
    }

    /**
     * @return entitySummary
     */
    public String getEntitySummary() {
        return this.entitySummary;
    }

    /**
     * @return entityType
     */
    public String getEntityType() {
        return this.entityType;
    }

    /**
     * @return eventId
     */
    public String getEventId() {
        return this.eventId;
    }

    /**
     * @return eventLevel3Code
     */
    public Long getEventLevel3Code() {
        return this.eventLevel3Code;
    }

    /**
     * @return eventLevel3Name
     */
    public String getEventLevel3Name() {
        return this.eventLevel3Name;
    }

    /**
     * @return eventTags
     */
    public String getEventTags() {
        return this.eventTags;
    }

    /**
     * @return eventTime
     */
    public Long getEventTime() {
        return this.eventTime;
    }

    /**
     * @return securityAbbreviation
     */
    public String getSecurityAbbreviation() {
        return this.securityAbbreviation;
    }

    /**
     * @return securityCategoryCodes
     */
    public java.util.List < String > getSecurityCategoryCodes() {
        return this.securityCategoryCodes;
    }

    /**
     * @return securityCodes
     */
    public java.util.List < String > getSecurityCodes() {
        return this.securityCodes;
    }

    /**
     * @return securityMarketsCodes
     */
    public java.util.List < String > getSecurityMarketsCodes() {
        return this.securityMarketsCodes;
    }

    /**
     * @return spamScore
     */
    public Double getSpamScore() {
        return this.spamScore;
    }

    /**
     * @return userSubscribeEntityTags
     */
    public java.util.List < String > getUserSubscribeEntityTags() {
        return this.userSubscribeEntityTags;
    }

    /**
     * @return userSubscribeEventTags
     */
    public java.util.List < Long > getUserSubscribeEventTags() {
        return this.userSubscribeEventTags;
    }

    public static final class Builder {
        private Double comprehensiveRisk; 
        private String entityArea; 
        private String entityCrn; 
        private Double entityEmotionScore; 
        private Long entityId; 
        private String entityName; 
        private Double entityRelevanceScore; 
        private String entityShowName; 
        private String entitySummary; 
        private String entityType; 
        private String eventId; 
        private Long eventLevel3Code; 
        private String eventLevel3Name; 
        private String eventTags; 
        private Long eventTime; 
        private String securityAbbreviation; 
        private java.util.List < String > securityCategoryCodes; 
        private java.util.List < String > securityCodes; 
        private java.util.List < String > securityMarketsCodes; 
        private Double spamScore; 
        private java.util.List < String > userSubscribeEntityTags; 
        private java.util.List < Long > userSubscribeEventTags; 

        /**
         * comprehensiveRisk.
         */
        public Builder comprehensiveRisk(Double comprehensiveRisk) {
            this.comprehensiveRisk = comprehensiveRisk;
            return this;
        }

        /**
         * entityArea.
         */
        public Builder entityArea(String entityArea) {
            this.entityArea = entityArea;
            return this;
        }

        /**
         * entityCrn.
         */
        public Builder entityCrn(String entityCrn) {
            this.entityCrn = entityCrn;
            return this;
        }

        /**
         * entityEmotionScore.
         */
        public Builder entityEmotionScore(Double entityEmotionScore) {
            this.entityEmotionScore = entityEmotionScore;
            return this;
        }

        /**
         * entityId.
         */
        public Builder entityId(Long entityId) {
            this.entityId = entityId;
            return this;
        }

        /**
         * entityName.
         */
        public Builder entityName(String entityName) {
            this.entityName = entityName;
            return this;
        }

        /**
         * entityRelevanceScore.
         */
        public Builder entityRelevanceScore(Double entityRelevanceScore) {
            this.entityRelevanceScore = entityRelevanceScore;
            return this;
        }

        /**
         * entityShowName.
         */
        public Builder entityShowName(String entityShowName) {
            this.entityShowName = entityShowName;
            return this;
        }

        /**
         * entitySummary.
         */
        public Builder entitySummary(String entitySummary) {
            this.entitySummary = entitySummary;
            return this;
        }

        /**
         * entityType.
         */
        public Builder entityType(String entityType) {
            this.entityType = entityType;
            return this;
        }

        /**
         * eventId.
         */
        public Builder eventId(String eventId) {
            this.eventId = eventId;
            return this;
        }

        /**
         * eventLevel3Code.
         */
        public Builder eventLevel3Code(Long eventLevel3Code) {
            this.eventLevel3Code = eventLevel3Code;
            return this;
        }

        /**
         * eventLevel3Name.
         */
        public Builder eventLevel3Name(String eventLevel3Name) {
            this.eventLevel3Name = eventLevel3Name;
            return this;
        }

        /**
         * eventTags.
         */
        public Builder eventTags(String eventTags) {
            this.eventTags = eventTags;
            return this;
        }

        /**
         * eventTime.
         */
        public Builder eventTime(Long eventTime) {
            this.eventTime = eventTime;
            return this;
        }

        /**
         * securityAbbreviation.
         */
        public Builder securityAbbreviation(String securityAbbreviation) {
            this.securityAbbreviation = securityAbbreviation;
            return this;
        }

        /**
         * securityCategoryCodes.
         */
        public Builder securityCategoryCodes(java.util.List < String > securityCategoryCodes) {
            this.securityCategoryCodes = securityCategoryCodes;
            return this;
        }

        /**
         * securityCodes.
         */
        public Builder securityCodes(java.util.List < String > securityCodes) {
            this.securityCodes = securityCodes;
            return this;
        }

        /**
         * securityMarketsCodes.
         */
        public Builder securityMarketsCodes(java.util.List < String > securityMarketsCodes) {
            this.securityMarketsCodes = securityMarketsCodes;
            return this;
        }

        /**
         * spamScore.
         */
        public Builder spamScore(Double spamScore) {
            this.spamScore = spamScore;
            return this;
        }

        /**
         * userSubscribeEntityTags.
         */
        public Builder userSubscribeEntityTags(java.util.List < String > userSubscribeEntityTags) {
            this.userSubscribeEntityTags = userSubscribeEntityTags;
            return this;
        }

        /**
         * userSubscribeEventTags.
         */
        public Builder userSubscribeEventTags(java.util.List < Long > userSubscribeEventTags) {
            this.userSubscribeEventTags = userSubscribeEventTags;
            return this;
        }

        public YuqingFinanceEvent build() {
            return new YuqingFinanceEvent(this);
        } 

    } 

}
