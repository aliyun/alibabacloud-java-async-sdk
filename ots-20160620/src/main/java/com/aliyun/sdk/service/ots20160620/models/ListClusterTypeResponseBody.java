// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ots20160620.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterTypeResponseBody} extends {@link TeaModel}
 *
 * <p>ListClusterTypeResponseBody</p>
 */
public class ListClusterTypeResponseBody extends TeaModel {
    @NameInMap("ClusterTypeDetailList")
    private ClusterTypeDetailList clusterTypeDetailList;

    @NameInMap("ClusterTypeInfos")
    private ClusterTypeInfos clusterTypeInfos;

    @NameInMap("RequestId")
    private String requestId;

    private ListClusterTypeResponseBody(Builder builder) {
        this.clusterTypeDetailList = builder.clusterTypeDetailList;
        this.clusterTypeInfos = builder.clusterTypeInfos;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterTypeResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusterTypeDetailList
     */
    public ClusterTypeDetailList getClusterTypeDetailList() {
        return this.clusterTypeDetailList;
    }

    /**
     * @return clusterTypeInfos
     */
    public ClusterTypeInfos getClusterTypeInfos() {
        return this.clusterTypeInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ClusterTypeDetailList clusterTypeDetailList; 
        private ClusterTypeInfos clusterTypeInfos; 
        private String requestId; 

        /**
         * ClusterTypeDetailList.
         */
        public Builder clusterTypeDetailList(ClusterTypeDetailList clusterTypeDetailList) {
            this.clusterTypeDetailList = clusterTypeDetailList;
            return this;
        }

        /**
         * ClusterTypeInfos.
         */
        public Builder clusterTypeInfos(ClusterTypeInfos clusterTypeInfos) {
            this.clusterTypeInfos = clusterTypeInfos;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListClusterTypeResponseBody build() {
            return new ListClusterTypeResponseBody(this);
        } 

    } 

    public static class ClusterTypeDetail extends TeaModel {
        @NameInMap("ClusterType")
        private String clusterType;

        @NameInMap("IsMultiAZ")
        private Boolean isMultiAZ;

        private ClusterTypeDetail(Builder builder) {
            this.clusterType = builder.clusterType;
            this.isMultiAZ = builder.isMultiAZ;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterTypeDetail create() {
            return builder().build();
        }

        /**
         * @return clusterType
         */
        public String getClusterType() {
            return this.clusterType;
        }

        /**
         * @return isMultiAZ
         */
        public Boolean getIsMultiAZ() {
            return this.isMultiAZ;
        }

        public static final class Builder {
            private String clusterType; 
            private Boolean isMultiAZ; 

            /**
             * ClusterType.
             */
            public Builder clusterType(String clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * IsMultiAZ.
             */
            public Builder isMultiAZ(Boolean isMultiAZ) {
                this.isMultiAZ = isMultiAZ;
                return this;
            }

            public ClusterTypeDetail build() {
                return new ClusterTypeDetail(this);
            } 

        } 

    }
    public static class ClusterTypeDetailList extends TeaModel {
        @NameInMap("ClusterTypeDetail")
        private java.util.List < ClusterTypeDetail> clusterTypeDetail;

        private ClusterTypeDetailList(Builder builder) {
            this.clusterTypeDetail = builder.clusterTypeDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterTypeDetailList create() {
            return builder().build();
        }

        /**
         * @return clusterTypeDetail
         */
        public java.util.List < ClusterTypeDetail> getClusterTypeDetail() {
            return this.clusterTypeDetail;
        }

        public static final class Builder {
            private java.util.List < ClusterTypeDetail> clusterTypeDetail; 

            /**
             * ClusterTypeDetail.
             */
            public Builder clusterTypeDetail(java.util.List < ClusterTypeDetail> clusterTypeDetail) {
                this.clusterTypeDetail = clusterTypeDetail;
                return this;
            }

            public ClusterTypeDetailList build() {
                return new ClusterTypeDetailList(this);
            } 

        } 

    }
    public static class ClusterTypeInfos extends TeaModel {
        @NameInMap("ClusterType")
        private java.util.List < String > clusterType;

        private ClusterTypeInfos(Builder builder) {
            this.clusterType = builder.clusterType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterTypeInfos create() {
            return builder().build();
        }

        /**
         * @return clusterType
         */
        public java.util.List < String > getClusterType() {
            return this.clusterType;
        }

        public static final class Builder {
            private java.util.List < String > clusterType; 

            /**
             * ClusterType.
             */
            public Builder clusterType(java.util.List < String > clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            public ClusterTypeInfos build() {
                return new ClusterTypeInfos(this);
            } 

        } 

    }
}
