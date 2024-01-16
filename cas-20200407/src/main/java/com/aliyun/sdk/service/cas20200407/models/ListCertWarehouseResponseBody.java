// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCertWarehouseResponseBody} extends {@link TeaModel}
 *
 * <p>ListCertWarehouseResponseBody</p>
 */
public class ListCertWarehouseResponseBody extends TeaModel {
    @NameInMap("CertWarehouseList")
    private java.util.List < CertWarehouseList> certWarehouseList;

    @NameInMap("CurrentPage")
    private Long currentPage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ShowSize")
    private Long showSize;

    @NameInMap("TotalCount")
    private Long totalCount;

    private ListCertWarehouseResponseBody(Builder builder) {
        this.certWarehouseList = builder.certWarehouseList;
        this.currentPage = builder.currentPage;
        this.requestId = builder.requestId;
        this.showSize = builder.showSize;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCertWarehouseResponseBody create() {
        return builder().build();
    }

    /**
     * @return certWarehouseList
     */
    public java.util.List < CertWarehouseList> getCertWarehouseList() {
        return this.certWarehouseList;
    }

    /**
     * @return currentPage
     */
    public Long getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return showSize
     */
    public Long getShowSize() {
        return this.showSize;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < CertWarehouseList> certWarehouseList; 
        private Long currentPage; 
        private String requestId; 
        private Long showSize; 
        private Long totalCount; 

        /**
         * CertWarehouseList.
         */
        public Builder certWarehouseList(java.util.List < CertWarehouseList> certWarehouseList) {
            this.certWarehouseList = certWarehouseList;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ShowSize.
         */
        public Builder showSize(Long showSize) {
            this.showSize = showSize;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListCertWarehouseResponseBody build() {
            return new ListCertWarehouseResponseBody(this);
        } 

    } 

    public static class CertWarehouseList extends TeaModel {
        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("IsExpired")
        private Boolean isExpired;

        @NameInMap("Name")
        private String name;

        @NameInMap("PcaInstanceId")
        private String pcaInstanceId;

        @NameInMap("Qps")
        private Long qps;

        @NameInMap("Type")
        private String type;

        @NameInMap("WhId")
        private Long whId;

        private CertWarehouseList(Builder builder) {
            this.endTime = builder.endTime;
            this.instanceId = builder.instanceId;
            this.isExpired = builder.isExpired;
            this.name = builder.name;
            this.pcaInstanceId = builder.pcaInstanceId;
            this.qps = builder.qps;
            this.type = builder.type;
            this.whId = builder.whId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CertWarehouseList create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return isExpired
         */
        public Boolean getIsExpired() {
            return this.isExpired;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return pcaInstanceId
         */
        public String getPcaInstanceId() {
            return this.pcaInstanceId;
        }

        /**
         * @return qps
         */
        public Long getQps() {
            return this.qps;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return whId
         */
        public Long getWhId() {
            return this.whId;
        }

        public static final class Builder {
            private Long endTime; 
            private String instanceId; 
            private Boolean isExpired; 
            private String name; 
            private String pcaInstanceId; 
            private Long qps; 
            private String type; 
            private Long whId; 

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * IsExpired.
             */
            public Builder isExpired(Boolean isExpired) {
                this.isExpired = isExpired;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * PcaInstanceId.
             */
            public Builder pcaInstanceId(String pcaInstanceId) {
                this.pcaInstanceId = pcaInstanceId;
                return this;
            }

            /**
             * Qps.
             */
            public Builder qps(Long qps) {
                this.qps = qps;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * WhId.
             */
            public Builder whId(Long whId) {
                this.whId = whId;
                return this;
            }

            public CertWarehouseList build() {
                return new CertWarehouseList(this);
            } 

        } 

    }
}
