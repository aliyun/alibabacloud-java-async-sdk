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
 * {@link DescribeEdgeCloudRegionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEdgeCloudRegionResponseBody</p>
 */
public class DescribeEdgeCloudRegionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EdgeCloudRegions")
    private java.util.List<EdgeCloudRegions> edgeCloudRegions;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeEdgeCloudRegionResponseBody(Builder builder) {
        this.edgeCloudRegions = builder.edgeCloudRegions;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEdgeCloudRegionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return edgeCloudRegions
     */
    public java.util.List<EdgeCloudRegions> getEdgeCloudRegions() {
        return this.edgeCloudRegions;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<EdgeCloudRegions> edgeCloudRegions; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeEdgeCloudRegionResponseBody model) {
            this.edgeCloudRegions = model.edgeCloudRegions;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of available edge cloud regions. When a whitelist is configured, only the regions available to the current account are returned.</p>
         */
        public Builder edgeCloudRegions(java.util.List<EdgeCloudRegions> edgeCloudRegions) {
            this.edgeCloudRegions = edgeCloudRegions;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2921D843-433A-5FB3-A03B-4EC093B219F8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeEdgeCloudRegionResponseBody build() {
            return new DescribeEdgeCloudRegionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEdgeCloudRegionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEdgeCloudRegionResponseBody</p>
     */
    public static class StandbyEdgeCloudRegionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StandbyEdgeCloudRegionId")
        private String standbyEdgeCloudRegionId;

        @com.aliyun.core.annotation.NameInMap("StandbyEdgeCloudRegionName")
        private String standbyEdgeCloudRegionName;

        private StandbyEdgeCloudRegionList(Builder builder) {
            this.standbyEdgeCloudRegionId = builder.standbyEdgeCloudRegionId;
            this.standbyEdgeCloudRegionName = builder.standbyEdgeCloudRegionName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StandbyEdgeCloudRegionList create() {
            return builder().build();
        }

        /**
         * @return standbyEdgeCloudRegionId
         */
        public String getStandbyEdgeCloudRegionId() {
            return this.standbyEdgeCloudRegionId;
        }

        /**
         * @return standbyEdgeCloudRegionName
         */
        public String getStandbyEdgeCloudRegionName() {
            return this.standbyEdgeCloudRegionName;
        }

        public static final class Builder {
            private String standbyEdgeCloudRegionId; 
            private String standbyEdgeCloudRegionName; 

            private Builder() {
            } 

            private Builder(StandbyEdgeCloudRegionList model) {
                this.standbyEdgeCloudRegionId = model.standbyEdgeCloudRegionId;
                this.standbyEdgeCloudRegionName = model.standbyEdgeCloudRegionName;
            } 

            /**
             * <p>The ID of the standby edge cloud region.</p>
             * 
             * <strong>example:</strong>
             * <p>standbyEdgeCloudRegionId</p>
             */
            public Builder standbyEdgeCloudRegionId(String standbyEdgeCloudRegionId) {
                this.standbyEdgeCloudRegionId = standbyEdgeCloudRegionId;
                return this;
            }

            /**
             * <p>The name of the standby edge cloud region.</p>
             * 
             * <strong>example:</strong>
             * <p>standbyEdgeCloudRegionName</p>
             */
            public Builder standbyEdgeCloudRegionName(String standbyEdgeCloudRegionName) {
                this.standbyEdgeCloudRegionName = standbyEdgeCloudRegionName;
                return this;
            }

            public StandbyEdgeCloudRegionList build() {
                return new StandbyEdgeCloudRegionList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEdgeCloudRegionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEdgeCloudRegionResponseBody</p>
     */
    public static class EdgeCloudRegions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CentralControlRegionId")
        private String centralControlRegionId;

        @com.aliyun.core.annotation.NameInMap("EdgeCloudRegionId")
        private String edgeCloudRegionId;

        @com.aliyun.core.annotation.NameInMap("EdgeCloudRegionName")
        private String edgeCloudRegionName;

        @com.aliyun.core.annotation.NameInMap("StandbyEdgeCloudRegionList")
        private java.util.List<StandbyEdgeCloudRegionList> standbyEdgeCloudRegionList;

        private EdgeCloudRegions(Builder builder) {
            this.centralControlRegionId = builder.centralControlRegionId;
            this.edgeCloudRegionId = builder.edgeCloudRegionId;
            this.edgeCloudRegionName = builder.edgeCloudRegionName;
            this.standbyEdgeCloudRegionList = builder.standbyEdgeCloudRegionList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EdgeCloudRegions create() {
            return builder().build();
        }

        /**
         * @return centralControlRegionId
         */
        public String getCentralControlRegionId() {
            return this.centralControlRegionId;
        }

        /**
         * @return edgeCloudRegionId
         */
        public String getEdgeCloudRegionId() {
            return this.edgeCloudRegionId;
        }

        /**
         * @return edgeCloudRegionName
         */
        public String getEdgeCloudRegionName() {
            return this.edgeCloudRegionName;
        }

        /**
         * @return standbyEdgeCloudRegionList
         */
        public java.util.List<StandbyEdgeCloudRegionList> getStandbyEdgeCloudRegionList() {
            return this.standbyEdgeCloudRegionList;
        }

        public static final class Builder {
            private String centralControlRegionId; 
            private String edgeCloudRegionId; 
            private String edgeCloudRegionName; 
            private java.util.List<StandbyEdgeCloudRegionList> standbyEdgeCloudRegionList; 

            private Builder() {
            } 

            private Builder(EdgeCloudRegions model) {
                this.centralControlRegionId = model.centralControlRegionId;
                this.edgeCloudRegionId = model.edgeCloudRegionId;
                this.edgeCloudRegionName = model.edgeCloudRegionName;
                this.standbyEdgeCloudRegionList = model.standbyEdgeCloudRegionList;
            } 

            /**
             * <p>The ID of the central control region corresponding to the edge cloud region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder centralControlRegionId(String centralControlRegionId) {
                this.centralControlRegionId = centralControlRegionId;
                return this;
            }

            /**
             * <p>The ID of the edge cloud region.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-singapore</p>
             */
            public Builder edgeCloudRegionId(String edgeCloudRegionId) {
                this.edgeCloudRegionId = edgeCloudRegionId;
                return this;
            }

            /**
             * <p>The name of the edge cloud region.</p>
             * 
             * <strong>example:</strong>
             * <p>edgeCloudRegionName</p>
             */
            public Builder edgeCloudRegionName(String edgeCloudRegionName) {
                this.edgeCloudRegionName = edgeCloudRegionName;
                return this;
            }

            /**
             * <p>The list of standby edge cloud regions.</p>
             */
            public Builder standbyEdgeCloudRegionList(java.util.List<StandbyEdgeCloudRegionList> standbyEdgeCloudRegionList) {
                this.standbyEdgeCloudRegionList = standbyEdgeCloudRegionList;
                return this;
            }

            public EdgeCloudRegions build() {
                return new EdgeCloudRegions(this);
            } 

        } 

    }
}
