// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

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
 * {@link ListSummariesResponseBody} extends {@link TeaModel}
 *
 * <p>ListSummariesResponseBody</p>
 */
public class ListSummariesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CenterSummary")
    private CenterSummary centerSummary;

    @com.aliyun.core.annotation.NameInMap("RegionSummaries")
    private java.util.List<RegionSummaries> regionSummaries;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListSummariesResponseBody(Builder builder) {
        this.centerSummary = builder.centerSummary;
        this.regionSummaries = builder.regionSummaries;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSummariesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return centerSummary
     */
    public CenterSummary getCenterSummary() {
        return this.centerSummary;
    }

    /**
     * @return regionSummaries
     */
    public java.util.List<RegionSummaries> getRegionSummaries() {
        return this.regionSummaries;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private CenterSummary centerSummary; 
        private java.util.List<RegionSummaries> regionSummaries; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListSummariesResponseBody model) {
            this.centerSummary = model.centerSummary;
            this.regionSummaries = model.regionSummaries;
            this.requestId = model.requestId;
        } 

        /**
         * CenterSummary.
         */
        public Builder centerSummary(CenterSummary centerSummary) {
            this.centerSummary = centerSummary;
            return this;
        }

        /**
         * RegionSummaries.
         */
        public Builder regionSummaries(java.util.List<RegionSummaries> regionSummaries) {
            this.regionSummaries = regionSummaries;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListSummariesResponseBody build() {
            return new ListSummariesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSummariesResponseBody} extends {@link TeaModel}
     *
     * <p>ListSummariesResponseBody</p>
     */
    public static class CenterSummary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegisteredResourceTypeCount")
        private Integer registeredResourceTypeCount;

        @com.aliyun.core.annotation.NameInMap("TemplateCount")
        private String templateCount;

        private CenterSummary(Builder builder) {
            this.registeredResourceTypeCount = builder.registeredResourceTypeCount;
            this.templateCount = builder.templateCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CenterSummary create() {
            return builder().build();
        }

        /**
         * @return registeredResourceTypeCount
         */
        public Integer getRegisteredResourceTypeCount() {
            return this.registeredResourceTypeCount;
        }

        /**
         * @return templateCount
         */
        public String getTemplateCount() {
            return this.templateCount;
        }

        public static final class Builder {
            private Integer registeredResourceTypeCount; 
            private String templateCount; 

            private Builder() {
            } 

            private Builder(CenterSummary model) {
                this.registeredResourceTypeCount = model.registeredResourceTypeCount;
                this.templateCount = model.templateCount;
            } 

            /**
             * RegisteredResourceTypeCount.
             */
            public Builder registeredResourceTypeCount(Integer registeredResourceTypeCount) {
                this.registeredResourceTypeCount = registeredResourceTypeCount;
                return this;
            }

            /**
             * TemplateCount.
             */
            public Builder templateCount(String templateCount) {
                this.templateCount = templateCount;
                return this;
            }

            public CenterSummary build() {
                return new CenterSummary(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSummariesResponseBody} extends {@link TeaModel}
     *
     * <p>ListSummariesResponseBody</p>
     */
    public static class StackDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BriefStatus")
        private String briefStatus;

        @com.aliyun.core.annotation.NameInMap("Count")
        private String count;

        private StackDetails(Builder builder) {
            this.briefStatus = builder.briefStatus;
            this.count = builder.count;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StackDetails create() {
            return builder().build();
        }

        /**
         * @return briefStatus
         */
        public String getBriefStatus() {
            return this.briefStatus;
        }

        /**
         * @return count
         */
        public String getCount() {
            return this.count;
        }

        public static final class Builder {
            private String briefStatus; 
            private String count; 

            private Builder() {
            } 

            private Builder(StackDetails model) {
                this.briefStatus = model.briefStatus;
                this.count = model.count;
            } 

            /**
             * BriefStatus.
             */
            public Builder briefStatus(String briefStatus) {
                this.briefStatus = briefStatus;
                return this;
            }

            /**
             * Count.
             */
            public Builder count(String count) {
                this.count = count;
                return this;
            }

            public StackDetails build() {
                return new StackDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSummariesResponseBody} extends {@link TeaModel}
     *
     * <p>ListSummariesResponseBody</p>
     */
    public static class RegionSummaries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("StackCount")
        private String stackCount;

        @com.aliyun.core.annotation.NameInMap("StackDetails")
        private java.util.List<StackDetails> stackDetails;

        @com.aliyun.core.annotation.NameInMap("StackGroupCount")
        private String stackGroupCount;

        @com.aliyun.core.annotation.NameInMap("TemplateScratchCount")
        private Integer templateScratchCount;

        private RegionSummaries(Builder builder) {
            this.regionId = builder.regionId;
            this.stackCount = builder.stackCount;
            this.stackDetails = builder.stackDetails;
            this.stackGroupCount = builder.stackGroupCount;
            this.templateScratchCount = builder.templateScratchCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegionSummaries create() {
            return builder().build();
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return stackCount
         */
        public String getStackCount() {
            return this.stackCount;
        }

        /**
         * @return stackDetails
         */
        public java.util.List<StackDetails> getStackDetails() {
            return this.stackDetails;
        }

        /**
         * @return stackGroupCount
         */
        public String getStackGroupCount() {
            return this.stackGroupCount;
        }

        /**
         * @return templateScratchCount
         */
        public Integer getTemplateScratchCount() {
            return this.templateScratchCount;
        }

        public static final class Builder {
            private String regionId; 
            private String stackCount; 
            private java.util.List<StackDetails> stackDetails; 
            private String stackGroupCount; 
            private Integer templateScratchCount; 

            private Builder() {
            } 

            private Builder(RegionSummaries model) {
                this.regionId = model.regionId;
                this.stackCount = model.stackCount;
                this.stackDetails = model.stackDetails;
                this.stackGroupCount = model.stackGroupCount;
                this.templateScratchCount = model.templateScratchCount;
            } 

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * StackCount.
             */
            public Builder stackCount(String stackCount) {
                this.stackCount = stackCount;
                return this;
            }

            /**
             * StackDetails.
             */
            public Builder stackDetails(java.util.List<StackDetails> stackDetails) {
                this.stackDetails = stackDetails;
                return this;
            }

            /**
             * StackGroupCount.
             */
            public Builder stackGroupCount(String stackGroupCount) {
                this.stackGroupCount = stackGroupCount;
                return this;
            }

            /**
             * TemplateScratchCount.
             */
            public Builder templateScratchCount(Integer templateScratchCount) {
                this.templateScratchCount = templateScratchCount;
                return this;
            }

            public RegionSummaries build() {
                return new RegionSummaries(this);
            } 

        } 

    }
}
