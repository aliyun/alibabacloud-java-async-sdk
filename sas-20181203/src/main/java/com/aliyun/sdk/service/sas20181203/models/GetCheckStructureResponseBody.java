// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCheckStructureResponseBody} extends {@link TeaModel}
 *
 * <p>GetCheckStructureResponseBody</p>
 */
public class GetCheckStructureResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CheckStructureResponse")
    private java.util.List < CheckStructureResponse> checkStructureResponse;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetCheckStructureResponseBody(Builder builder) {
        this.checkStructureResponse = builder.checkStructureResponse;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCheckStructureResponseBody create() {
        return builder().build();
    }

    /**
     * @return checkStructureResponse
     */
    public java.util.List < CheckStructureResponse> getCheckStructureResponse() {
        return this.checkStructureResponse;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < CheckStructureResponse> checkStructureResponse; 
        private String requestId; 

        /**
         * The structure information about check items provided by the configuration assessment feature.
         */
        public Builder checkStructureResponse(java.util.List < CheckStructureResponse> checkStructureResponse) {
            this.checkStructureResponse = checkStructureResponse;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCheckStructureResponseBody build() {
            return new GetCheckStructureResponseBody(this);
        } 

    } 

    public static class Sections extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("ShowName")
        private String showName;

        private Sections(Builder builder) {
            this.id = builder.id;
            this.showName = builder.showName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sections create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return showName
         */
        public String getShowName() {
            return this.showName;
        }

        public static final class Builder {
            private Long id; 
            private String showName; 

            /**
             * The ID of the section for the check item.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The display name of the section for the check item.
             */
            public Builder showName(String showName) {
                this.showName = showName;
                return this;
            }

            public Sections build() {
                return new Sections(this);
            } 

        } 

    }
    public static class Requirements extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Sections")
        private java.util.List < Sections> sections;

        @com.aliyun.core.annotation.NameInMap("ShowName")
        private String showName;

        @com.aliyun.core.annotation.NameInMap("TotalCheckCount")
        private Integer totalCheckCount;

        private Requirements(Builder builder) {
            this.id = builder.id;
            this.sections = builder.sections;
            this.showName = builder.showName;
            this.totalCheckCount = builder.totalCheckCount;
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
         * @return sections
         */
        public java.util.List < Sections> getSections() {
            return this.sections;
        }

        /**
         * @return showName
         */
        public String getShowName() {
            return this.showName;
        }

        /**
         * @return totalCheckCount
         */
        public Integer getTotalCheckCount() {
            return this.totalCheckCount;
        }

        public static final class Builder {
            private Long id; 
            private java.util.List < Sections> sections; 
            private String showName; 
            private Integer totalCheckCount; 

            /**
             * The ID of the requirement item for the check item.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The information about the sections of check items.
             */
            public Builder sections(java.util.List < Sections> sections) {
                this.sections = sections;
                return this;
            }

            /**
             * The display name of the requirement item for the check item.
             */
            public Builder showName(String showName) {
                this.showName = showName;
                return this;
            }

            /**
             * The total number of check items for the requirement.
             */
            public Builder totalCheckCount(Integer totalCheckCount) {
                this.totalCheckCount = totalCheckCount;
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

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Standards(Builder builder) {
            this.id = builder.id;
            this.requirements = builder.requirements;
            this.showName = builder.showName;
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
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long id; 
            private java.util.List < Requirements> requirements; 
            private String showName; 
            private String type; 

            /**
             * The standard ID of the check item.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The standards of the check items.
             */
            public Builder requirements(java.util.List < Requirements> requirements) {
                this.requirements = requirements;
                return this;
            }

            /**
             * The display name of the standard for the check item.
             */
            public Builder showName(String showName) {
                this.showName = showName;
                return this;
            }

            /**
             * The standard type of the check item. Valid values:
             * <p>
             * 
             * *   RISK: security risk.
             * *   IDENTITY_PERMISSION: CIEM.
             * *   COMPLIANCE: security compliance.
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
    public static class CheckStructureResponse extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StandardType")
        private String standardType;

        @com.aliyun.core.annotation.NameInMap("Standards")
        private java.util.List < Standards> standards;

        private CheckStructureResponse(Builder builder) {
            this.standardType = builder.standardType;
            this.standards = builder.standards;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckStructureResponse create() {
            return builder().build();
        }

        /**
         * @return standardType
         */
        public String getStandardType() {
            return this.standardType;
        }

        /**
         * @return standards
         */
        public java.util.List < Standards> getStandards() {
            return this.standards;
        }

        public static final class Builder {
            private String standardType; 
            private java.util.List < Standards> standards; 

            /**
             * The type of the check item.
             * <p>
             * 
             * *   RISK: security risk.
             * *   IDENTITY_PERMISSION: Cloud Infrastructure Entitlement Management (CIEM).
             * *   COMPLIANCE: security compliance.
             */
            public Builder standardType(String standardType) {
                this.standardType = standardType;
                return this;
            }

            /**
             * The structure information about the check items of the business type.
             */
            public Builder standards(java.util.List < Standards> standards) {
                this.standards = standards;
                return this;
            }

            public CheckStructureResponse build() {
                return new CheckStructureResponse(this);
            } 

        } 

    }
}
