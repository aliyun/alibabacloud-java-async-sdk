// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeCrossCloudRegionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCrossCloudRegionResponseBody</p>
 */
public class DescribeCrossCloudRegionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CrossCloudRegionList")
    private java.util.List<CrossCloudRegionList> crossCloudRegionList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCrossCloudRegionResponseBody(Builder builder) {
        this.crossCloudRegionList = builder.crossCloudRegionList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCrossCloudRegionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return crossCloudRegionList
     */
    public java.util.List<CrossCloudRegionList> getCrossCloudRegionList() {
        return this.crossCloudRegionList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<CrossCloudRegionList> crossCloudRegionList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeCrossCloudRegionResponseBody model) {
            this.crossCloudRegionList = model.crossCloudRegionList;
            this.requestId = model.requestId;
        } 

        /**
         * CrossCloudRegionList.
         */
        public Builder crossCloudRegionList(java.util.List<CrossCloudRegionList> crossCloudRegionList) {
            this.crossCloudRegionList = crossCloudRegionList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCrossCloudRegionResponseBody build() {
            return new DescribeCrossCloudRegionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCrossCloudRegionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCrossCloudRegionResponseBody</p>
     */
    public static class CrossCloudZoneList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CrossCloudZoneId")
        private String crossCloudZoneId;

        @com.aliyun.core.annotation.NameInMap("CrossCloudZoneName")
        private String crossCloudZoneName;

        private CrossCloudZoneList(Builder builder) {
            this.crossCloudZoneId = builder.crossCloudZoneId;
            this.crossCloudZoneName = builder.crossCloudZoneName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CrossCloudZoneList create() {
            return builder().build();
        }

        /**
         * @return crossCloudZoneId
         */
        public String getCrossCloudZoneId() {
            return this.crossCloudZoneId;
        }

        /**
         * @return crossCloudZoneName
         */
        public String getCrossCloudZoneName() {
            return this.crossCloudZoneName;
        }

        public static final class Builder {
            private String crossCloudZoneId; 
            private String crossCloudZoneName; 

            private Builder() {
            } 

            private Builder(CrossCloudZoneList model) {
                this.crossCloudZoneId = model.crossCloudZoneId;
                this.crossCloudZoneName = model.crossCloudZoneName;
            } 

            /**
             * CrossCloudZoneId.
             */
            public Builder crossCloudZoneId(String crossCloudZoneId) {
                this.crossCloudZoneId = crossCloudZoneId;
                return this;
            }

            /**
             * CrossCloudZoneName.
             */
            public Builder crossCloudZoneName(String crossCloudZoneName) {
                this.crossCloudZoneName = crossCloudZoneName;
                return this;
            }

            public CrossCloudZoneList build() {
                return new CrossCloudZoneList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCrossCloudRegionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCrossCloudRegionResponseBody</p>
     */
    public static class CrossCloudRegionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CrossCloudRegionId")
        private String crossCloudRegionId;

        @com.aliyun.core.annotation.NameInMap("CrossCloudRegionName")
        private String crossCloudRegionName;

        @com.aliyun.core.annotation.NameInMap("CrossCloudZoneList")
        private java.util.List<CrossCloudZoneList> crossCloudZoneList;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        private CrossCloudRegionList(Builder builder) {
            this.crossCloudRegionId = builder.crossCloudRegionId;
            this.crossCloudRegionName = builder.crossCloudRegionName;
            this.crossCloudZoneList = builder.crossCloudZoneList;
            this.projectId = builder.projectId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CrossCloudRegionList create() {
            return builder().build();
        }

        /**
         * @return crossCloudRegionId
         */
        public String getCrossCloudRegionId() {
            return this.crossCloudRegionId;
        }

        /**
         * @return crossCloudRegionName
         */
        public String getCrossCloudRegionName() {
            return this.crossCloudRegionName;
        }

        /**
         * @return crossCloudZoneList
         */
        public java.util.List<CrossCloudZoneList> getCrossCloudZoneList() {
            return this.crossCloudZoneList;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        public static final class Builder {
            private String crossCloudRegionId; 
            private String crossCloudRegionName; 
            private java.util.List<CrossCloudZoneList> crossCloudZoneList; 
            private String projectId; 

            private Builder() {
            } 

            private Builder(CrossCloudRegionList model) {
                this.crossCloudRegionId = model.crossCloudRegionId;
                this.crossCloudRegionName = model.crossCloudRegionName;
                this.crossCloudZoneList = model.crossCloudZoneList;
                this.projectId = model.projectId;
            } 

            /**
             * CrossCloudRegionId.
             */
            public Builder crossCloudRegionId(String crossCloudRegionId) {
                this.crossCloudRegionId = crossCloudRegionId;
                return this;
            }

            /**
             * CrossCloudRegionName.
             */
            public Builder crossCloudRegionName(String crossCloudRegionName) {
                this.crossCloudRegionName = crossCloudRegionName;
                return this;
            }

            /**
             * CrossCloudZoneList.
             */
            public Builder crossCloudZoneList(java.util.List<CrossCloudZoneList> crossCloudZoneList) {
                this.crossCloudZoneList = crossCloudZoneList;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            public CrossCloudRegionList build() {
                return new CrossCloudRegionList(this);
            } 

        } 

    }
}
