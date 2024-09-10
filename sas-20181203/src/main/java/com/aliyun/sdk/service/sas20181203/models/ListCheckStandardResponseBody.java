// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCheckStandardResponseBody} extends {@link TeaModel}
 *
 * <p>ListCheckStandardResponseBody</p>
 */
public class ListCheckStandardResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Standards")
    private java.util.List < Standards> standards;

    private ListCheckStandardResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.standards = builder.standards;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCheckStandardResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return standards
     */
    public java.util.List < Standards> getStandards() {
        return this.standards;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Standards> standards; 

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * An array that consists of the check items.
         */
        public Builder standards(java.util.List < Standards> standards) {
            this.standards = standards;
            return this;
        }

        public ListCheckStandardResponseBody build() {
            return new ListCheckStandardResponseBody(this);
        } 

    } 

    public static class Requirements extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("RiskCheckCount")
        private Long riskCheckCount;

        @com.aliyun.core.annotation.NameInMap("ShowName")
        private String showName;

        @com.aliyun.core.annotation.NameInMap("ShowPriorityLevel")
        private Integer showPriorityLevel;

        private Requirements(Builder builder) {
            this.id = builder.id;
            this.riskCheckCount = builder.riskCheckCount;
            this.showName = builder.showName;
            this.showPriorityLevel = builder.showPriorityLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Requirements create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return riskCheckCount
         */
        public Long getRiskCheckCount() {
            return this.riskCheckCount;
        }

        /**
         * @return showName
         */
        public String getShowName() {
            return this.showName;
        }

        /**
         * @return showPriorityLevel
         */
        public Integer getShowPriorityLevel() {
            return this.showPriorityLevel;
        }

        public static final class Builder {
            private Long id; 
            private Long riskCheckCount; 
            private String showName; 
            private Integer showPriorityLevel; 

            /**
             * The ID of the search condition.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The number of check items queried by using the search condition.
             */
            public Builder riskCheckCount(Long riskCheckCount) {
                this.riskCheckCount = riskCheckCount;
                return this;
            }

            /**
             * The display name of the search condition.
             */
            public Builder showName(String showName) {
                this.showName = showName;
                return this;
            }

            /**
             * The priority field indicates the level of prominence.
             */
            public Builder showPriorityLevel(Integer showPriorityLevel) {
                this.showPriorityLevel = showPriorityLevel;
                return this;
            }

            public Requirements build() {
                return new Requirements(this);
            } 

        } 

    }
    public static class Standards extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Requirements")
        private java.util.List < Requirements> requirements;

        @com.aliyun.core.annotation.NameInMap("ShowName")
        private String showName;

        @com.aliyun.core.annotation.NameInMap("ShowPriorityLevel")
        private Integer showPriorityLevel;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Standards(Builder builder) {
            this.id = builder.id;
            this.requirements = builder.requirements;
            this.showName = builder.showName;
            this.showPriorityLevel = builder.showPriorityLevel;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Standards create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return requirements
         */
        public java.util.List < Requirements> getRequirements() {
            return this.requirements;
        }

        /**
         * @return showName
         */
        public String getShowName() {
            return this.showName;
        }

        /**
         * @return showPriorityLevel
         */
        public Integer getShowPriorityLevel() {
            return this.showPriorityLevel;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long id; 
            private java.util.List < Requirements> requirements; 
            private String showName; 
            private Integer showPriorityLevel; 
            private String type; 

            /**
             * The ID of the check item.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * An array that consists of search conditions.
             */
            public Builder requirements(java.util.List < Requirements> requirements) {
                this.requirements = requirements;
                return this;
            }

            /**
             * The display name of the check item.
             */
            public Builder showName(String showName) {
                this.showName = showName;
                return this;
            }

            /**
             * The priority field indicates the level of prominence.
             */
            public Builder showPriorityLevel(Integer showPriorityLevel) {
                this.showPriorityLevel = showPriorityLevel;
                return this;
            }

            /**
             * The type of the check item.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Standards build() {
                return new Standards(this);
            } 

        } 

    }
}
