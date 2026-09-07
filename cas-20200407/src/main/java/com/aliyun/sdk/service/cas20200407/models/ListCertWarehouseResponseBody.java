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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListCertWarehouseResponseBody model) {
            this.certWarehouseList = model.certWarehouseList;
            this.currentPage = model.currentPage;
            this.requestId = model.requestId;
            this.showSize = model.showSize;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of certificate repositories.</p>
         */
        public Builder certWarehouseList(java.util.List<CertWarehouseList> certWarehouseList) {
            this.certWarehouseList = certWarehouseList;
            return this;
        }

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 50.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder showSize(Long showSize) {
            this.showSize = showSize;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
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

            private Builder() {
            } 

            private Builder(CertWarehouseList model) {
                this.endTime = model.endTime;
                this.instanceId = model.instanceId;
                this.isExpired = model.isExpired;
                this.name = model.name;
                this.pcaInstanceId = model.pcaInstanceId;
                this.qps = model.qps;
                this.type = model.type;
                this.whId = model.whId;
            } 

            /**
             * <p>The expiration time, in timestamp format. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1665819958000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The sales instance.</p>
             * 
             * <strong>example:</strong>
             * <p>14dcc8afc7578e1f</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Indicates whether the repository has expired. Valid values:</p>
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
             * <p>The repository name.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The PCA instance.</p>
             * 
             * <strong>example:</strong>
             * <p>14dcc8afc7578e1f</p>
             */
            public Builder pcaInstanceId(String pcaInstanceId) {
                this.pcaInstanceId = pcaInstanceId;
                return this;
            }

            /**
             * <p>Qps。</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder qps(Long qps) {
                this.qps = qps;
                return this;
            }

            /**
             * <p>The repository type. Valid values:</p>
             * <ul>
             * <li><strong>uploadCA</strong>: an uploaded CA certificate that contains a complete certificate chain.</li>
             * <li><strong>uploadPCA</strong>: an uploaded certificate, including a self-signed certificate, a certificate issued by a third party, or a certificate issued by Alibaba Cloud.</li>
             * <li><strong>aliyunPCA</strong>: an Alibaba Cloud PCA certificate.</li>
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
             * <p>The repository ID.</p>
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
