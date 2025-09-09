// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

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
 * {@link GetServiceTemplateCriterionIssuesResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceTemplateCriterionIssuesResponseBody</p>
 */
public class GetServiceTemplateCriterionIssuesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RiskyTemplateCount")
    private Integer riskyTemplateCount;

    @com.aliyun.core.annotation.NameInMap("TemplateCriterionIssueList")
    private java.util.List<TemplateCriterionIssueList> templateCriterionIssueList;

    @com.aliyun.core.annotation.NameInMap("TotalCriterionIssueCount")
    private Integer totalCriterionIssueCount;

    @com.aliyun.core.annotation.NameInMap("TotalMandatoryCriterionIssueCount")
    private Integer totalMandatoryCriterionIssueCount;

    private GetServiceTemplateCriterionIssuesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.riskyTemplateCount = builder.riskyTemplateCount;
        this.templateCriterionIssueList = builder.templateCriterionIssueList;
        this.totalCriterionIssueCount = builder.totalCriterionIssueCount;
        this.totalMandatoryCriterionIssueCount = builder.totalMandatoryCriterionIssueCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceTemplateCriterionIssuesResponseBody create() {
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
     * @return riskyTemplateCount
     */
    public Integer getRiskyTemplateCount() {
        return this.riskyTemplateCount;
    }

    /**
     * @return templateCriterionIssueList
     */
    public java.util.List<TemplateCriterionIssueList> getTemplateCriterionIssueList() {
        return this.templateCriterionIssueList;
    }

    /**
     * @return totalCriterionIssueCount
     */
    public Integer getTotalCriterionIssueCount() {
        return this.totalCriterionIssueCount;
    }

    /**
     * @return totalMandatoryCriterionIssueCount
     */
    public Integer getTotalMandatoryCriterionIssueCount() {
        return this.totalMandatoryCriterionIssueCount;
    }

    public static final class Builder {
        private String requestId; 
        private Integer riskyTemplateCount; 
        private java.util.List<TemplateCriterionIssueList> templateCriterionIssueList; 
        private Integer totalCriterionIssueCount; 
        private Integer totalMandatoryCriterionIssueCount; 

        private Builder() {
        } 

        private Builder(GetServiceTemplateCriterionIssuesResponseBody model) {
            this.requestId = model.requestId;
            this.riskyTemplateCount = model.riskyTemplateCount;
            this.templateCriterionIssueList = model.templateCriterionIssueList;
            this.totalCriterionIssueCount = model.totalCriterionIssueCount;
            this.totalMandatoryCriterionIssueCount = model.totalMandatoryCriterionIssueCount;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RiskyTemplateCount.
         */
        public Builder riskyTemplateCount(Integer riskyTemplateCount) {
            this.riskyTemplateCount = riskyTemplateCount;
            return this;
        }

        /**
         * TemplateCriterionIssueList.
         */
        public Builder templateCriterionIssueList(java.util.List<TemplateCriterionIssueList> templateCriterionIssueList) {
            this.templateCriterionIssueList = templateCriterionIssueList;
            return this;
        }

        /**
         * TotalCriterionIssueCount.
         */
        public Builder totalCriterionIssueCount(Integer totalCriterionIssueCount) {
            this.totalCriterionIssueCount = totalCriterionIssueCount;
            return this;
        }

        /**
         * TotalMandatoryCriterionIssueCount.
         */
        public Builder totalMandatoryCriterionIssueCount(Integer totalMandatoryCriterionIssueCount) {
            this.totalMandatoryCriterionIssueCount = totalMandatoryCriterionIssueCount;
            return this;
        }

        public GetServiceTemplateCriterionIssuesResponseBody build() {
            return new GetServiceTemplateCriterionIssuesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetServiceTemplateCriterionIssuesResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceTemplateCriterionIssuesResponseBody</p>
     */
    public static class ExtendInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssociationProperty")
        private String associationProperty;

        @com.aliyun.core.annotation.NameInMap("Property")
        private String property;

        @com.aliyun.core.annotation.NameInMap("PropertyValue")
        private String propertyValue;

        private ExtendInfo(Builder builder) {
            this.associationProperty = builder.associationProperty;
            this.property = builder.property;
            this.propertyValue = builder.propertyValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtendInfo create() {
            return builder().build();
        }

        /**
         * @return associationProperty
         */
        public String getAssociationProperty() {
            return this.associationProperty;
        }

        /**
         * @return property
         */
        public String getProperty() {
            return this.property;
        }

        /**
         * @return propertyValue
         */
        public String getPropertyValue() {
            return this.propertyValue;
        }

        public static final class Builder {
            private String associationProperty; 
            private String property; 
            private String propertyValue; 

            private Builder() {
            } 

            private Builder(ExtendInfo model) {
                this.associationProperty = model.associationProperty;
                this.property = model.property;
                this.propertyValue = model.propertyValue;
            } 

            /**
             * AssociationProperty.
             */
            public Builder associationProperty(String associationProperty) {
                this.associationProperty = associationProperty;
                return this;
            }

            /**
             * Property.
             */
            public Builder property(String property) {
                this.property = property;
                return this;
            }

            /**
             * PropertyValue.
             */
            public Builder propertyValue(String propertyValue) {
                this.propertyValue = propertyValue;
                return this;
            }

            public ExtendInfo build() {
                return new ExtendInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetServiceTemplateCriterionIssuesResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceTemplateCriterionIssuesResponseBody</p>
     */
    public static class CriterionIssues extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExtendInfo")
        private ExtendInfo extendInfo;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("Position")
        private String position;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private CriterionIssues(Builder builder) {
            this.extendInfo = builder.extendInfo;
            this.level = builder.level;
            this.position = builder.position;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CriterionIssues create() {
            return builder().build();
        }

        /**
         * @return extendInfo
         */
        public ExtendInfo getExtendInfo() {
            return this.extendInfo;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return position
         */
        public String getPosition() {
            return this.position;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private ExtendInfo extendInfo; 
            private String level; 
            private String position; 
            private String type; 

            private Builder() {
            } 

            private Builder(CriterionIssues model) {
                this.extendInfo = model.extendInfo;
                this.level = model.level;
                this.position = model.position;
                this.type = model.type;
            } 

            /**
             * ExtendInfo.
             */
            public Builder extendInfo(ExtendInfo extendInfo) {
                this.extendInfo = extendInfo;
                return this;
            }

            /**
             * Level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * Position.
             */
            public Builder position(String position) {
                this.position = position;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public CriterionIssues build() {
                return new CriterionIssues(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetServiceTemplateCriterionIssuesResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceTemplateCriterionIssuesResponseBody</p>
     */
    public static class TemplateCriterionIssueList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CriterionIssues")
        private java.util.List<CriterionIssues> criterionIssues;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        @com.aliyun.core.annotation.NameInMap("TemplateUrl")
        private Integer templateUrl;

        @com.aliyun.core.annotation.NameInMap("TotalCriterionIssueCount")
        private Integer totalCriterionIssueCount;

        @com.aliyun.core.annotation.NameInMap("TotalMandatoryCriterionIssueCount")
        private Integer totalMandatoryCriterionIssueCount;

        private TemplateCriterionIssueList(Builder builder) {
            this.criterionIssues = builder.criterionIssues;
            this.templateName = builder.templateName;
            this.templateUrl = builder.templateUrl;
            this.totalCriterionIssueCount = builder.totalCriterionIssueCount;
            this.totalMandatoryCriterionIssueCount = builder.totalMandatoryCriterionIssueCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TemplateCriterionIssueList create() {
            return builder().build();
        }

        /**
         * @return criterionIssues
         */
        public java.util.List<CriterionIssues> getCriterionIssues() {
            return this.criterionIssues;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        /**
         * @return templateUrl
         */
        public Integer getTemplateUrl() {
            return this.templateUrl;
        }

        /**
         * @return totalCriterionIssueCount
         */
        public Integer getTotalCriterionIssueCount() {
            return this.totalCriterionIssueCount;
        }

        /**
         * @return totalMandatoryCriterionIssueCount
         */
        public Integer getTotalMandatoryCriterionIssueCount() {
            return this.totalMandatoryCriterionIssueCount;
        }

        public static final class Builder {
            private java.util.List<CriterionIssues> criterionIssues; 
            private String templateName; 
            private Integer templateUrl; 
            private Integer totalCriterionIssueCount; 
            private Integer totalMandatoryCriterionIssueCount; 

            private Builder() {
            } 

            private Builder(TemplateCriterionIssueList model) {
                this.criterionIssues = model.criterionIssues;
                this.templateName = model.templateName;
                this.templateUrl = model.templateUrl;
                this.totalCriterionIssueCount = model.totalCriterionIssueCount;
                this.totalMandatoryCriterionIssueCount = model.totalMandatoryCriterionIssueCount;
            } 

            /**
             * CriterionIssues.
             */
            public Builder criterionIssues(java.util.List<CriterionIssues> criterionIssues) {
                this.criterionIssues = criterionIssues;
                return this;
            }

            /**
             * TemplateName.
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * TemplateUrl.
             */
            public Builder templateUrl(Integer templateUrl) {
                this.templateUrl = templateUrl;
                return this;
            }

            /**
             * TotalCriterionIssueCount.
             */
            public Builder totalCriterionIssueCount(Integer totalCriterionIssueCount) {
                this.totalCriterionIssueCount = totalCriterionIssueCount;
                return this;
            }

            /**
             * TotalMandatoryCriterionIssueCount.
             */
            public Builder totalMandatoryCriterionIssueCount(Integer totalMandatoryCriterionIssueCount) {
                this.totalMandatoryCriterionIssueCount = totalMandatoryCriterionIssueCount;
                return this;
            }

            public TemplateCriterionIssueList build() {
                return new TemplateCriterionIssueList(this);
            } 

        } 

    }
}
