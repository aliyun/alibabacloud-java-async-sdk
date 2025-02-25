// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

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
 * {@link ListCertWarehouseResponseBody} extends {@link TeaModel}
 *
 * <p>ListCertWarehouseResponseBody</p>
 */
public class ListCertWarehouseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CertWarehouseList")
    private java.util.List<CertWarehouseList> certWarehouseList;

    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Long currentPage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ShowSize")
    private Long showSize;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
    public java.util.List<CertWarehouseList> getCertWarehouseList() {
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
        private java.util.List<CertWarehouseList> certWarehouseList; 
        private Long currentPage; 
        private String requestId; 
        private Long showSize; 
        private Long totalCount; 

        /**
         * <p>The certificate application repositories.</p>
         */
        public Builder certWarehouseList(java.util.List<CertWarehouseList> certWarehouseList) {
            this.certWarehouseList = certWarehouseList;
            return this;
        }

        /**
         * <p>The page number of the returned page. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of entries returned per page. Default value: 50.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder showSize(Long showSize) {
            this.showSize = showSize;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListCertWarehouseResponseBody build() {
            return new ListCertWarehouseResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCertWarehouseResponseBody} extends {@link TeaModel}
     *
     * <p>ListCertWarehouseResponseBody</p>
     */
    public static class CertWarehouseList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("IsExpired")
        private Boolean isExpired;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PcaInstanceId")
        private String pcaInstanceId;

        @com.aliyun.core.annotation.NameInMap("Qps")
        private Long qps;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("WhId")
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
             * <p>The timestamp when the certificate application repository expires. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1665819958000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The instance ID of the certificate application repository.</p>
             * 
             * <strong>example:</strong>
             * <p>14dcc8afc7578e1f</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Indicates whether the certificate application repository has expired. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isExpired(Boolean isExpired) {
                this.isExpired = isExpired;
                return this;
            }

            /**
             * <p>The name of the certificate application repository.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The instance ID of the private CA.</p>
             * 
             * <strong>example:</strong>
             * <p>14dcc8afc7578e1f</p>
             */
            public Builder pcaInstanceId(String pcaInstanceId) {
                this.pcaInstanceId = pcaInstanceId;
                return this;
            }

            /**
             * <p>The queries per second (QPS).</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder qps(Long qps) {
                this.qps = qps;
                return this;
            }

            /**
             * <p>The type of the certificate application repository. Valid values:</p>
             * <ul>
             * <li><strong>ssl</strong>: certificate application repository of SSL certificates</li>
             * <li><strong>uploadPCA</strong>: certificate application repository of uploaded private certificates</li>
             * <li><strong>free</strong>: certificate application repository of free certificates, available only on the China site (aliyun.com)</li>
             * <li><strong>aliyunPCA</strong>: certificate application repository of private certificates purchased from Alibaba Cloud Private Certificate Authority (PCA), available only on the China site (aliyun.com)</li>
             * <li><strong>disable</strong>: disabled certificate application repository</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>aliyunPCA</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The ID of the certificate application repository.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
