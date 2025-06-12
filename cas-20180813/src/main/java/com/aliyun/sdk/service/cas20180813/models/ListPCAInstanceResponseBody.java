// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20180813.models;

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
 * {@link ListPCAInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>ListPCAInstanceResponseBody</p>
 */
public class ListPCAInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Long currentPage;

    @com.aliyun.core.annotation.NameInMap("PCAInstanceList")
    private java.util.List<PCAInstanceList> PCAInstanceList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ShowSize")
    private Long showSize;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListPCAInstanceResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.PCAInstanceList = builder.PCAInstanceList;
        this.requestId = builder.requestId;
        this.showSize = builder.showSize;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPCAInstanceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Long getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return PCAInstanceList
     */
    public java.util.List<PCAInstanceList> getPCAInstanceList() {
        return this.PCAInstanceList;
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
        private Long currentPage; 
        private java.util.List<PCAInstanceList> PCAInstanceList; 
        private String requestId; 
        private Long showSize; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListPCAInstanceResponseBody model) {
            this.currentPage = model.currentPage;
            this.PCAInstanceList = model.PCAInstanceList;
            this.requestId = model.requestId;
            this.showSize = model.showSize;
            this.totalCount = model.totalCount;
        } 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * PCAInstanceList.
         */
        public Builder PCAInstanceList(java.util.List<PCAInstanceList> PCAInstanceList) {
            this.PCAInstanceList = PCAInstanceList;
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

        public ListPCAInstanceResponseBody build() {
            return new ListPCAInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPCAInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>ListPCAInstanceResponseBody</p>
     */
    public static class PCAInstanceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Algorithm")
        private String algorithm;

        @com.aliyun.core.annotation.NameInMap("AliasName")
        private String aliasName;

        @com.aliyun.core.annotation.NameInMap("CaIdentifier")
        private String caIdentifier;

        @com.aliyun.core.annotation.NameInMap("CertCount")
        private Long certCount;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("InstanceUuid")
        private String instanceUuid;

        @com.aliyun.core.annotation.NameInMap("IssuedCertCount")
        private Long issuedCertCount;

        @com.aliyun.core.annotation.NameInMap("RelateStatus")
        private Boolean relateStatus;

        @com.aliyun.core.annotation.NameInMap("ShareFlag")
        private Integer shareFlag;

        @com.aliyun.core.annotation.NameInMap("Trial")
        private String trial;

        private PCAInstanceList(Builder builder) {
            this.algorithm = builder.algorithm;
            this.aliasName = builder.aliasName;
            this.caIdentifier = builder.caIdentifier;
            this.certCount = builder.certCount;
            this.endTime = builder.endTime;
            this.instanceUuid = builder.instanceUuid;
            this.issuedCertCount = builder.issuedCertCount;
            this.relateStatus = builder.relateStatus;
            this.shareFlag = builder.shareFlag;
            this.trial = builder.trial;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PCAInstanceList create() {
            return builder().build();
        }

        /**
         * @return algorithm
         */
        public String getAlgorithm() {
            return this.algorithm;
        }

        /**
         * @return aliasName
         */
        public String getAliasName() {
            return this.aliasName;
        }

        /**
         * @return caIdentifier
         */
        public String getCaIdentifier() {
            return this.caIdentifier;
        }

        /**
         * @return certCount
         */
        public Long getCertCount() {
            return this.certCount;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return instanceUuid
         */
        public String getInstanceUuid() {
            return this.instanceUuid;
        }

        /**
         * @return issuedCertCount
         */
        public Long getIssuedCertCount() {
            return this.issuedCertCount;
        }

        /**
         * @return relateStatus
         */
        public Boolean getRelateStatus() {
            return this.relateStatus;
        }

        /**
         * @return shareFlag
         */
        public Integer getShareFlag() {
            return this.shareFlag;
        }

        /**
         * @return trial
         */
        public String getTrial() {
            return this.trial;
        }

        public static final class Builder {
            private String algorithm; 
            private String aliasName; 
            private String caIdentifier; 
            private Long certCount; 
            private Long endTime; 
            private String instanceUuid; 
            private Long issuedCertCount; 
            private Boolean relateStatus; 
            private Integer shareFlag; 
            private String trial; 

            private Builder() {
            } 

            private Builder(PCAInstanceList model) {
                this.algorithm = model.algorithm;
                this.aliasName = model.aliasName;
                this.caIdentifier = model.caIdentifier;
                this.certCount = model.certCount;
                this.endTime = model.endTime;
                this.instanceUuid = model.instanceUuid;
                this.issuedCertCount = model.issuedCertCount;
                this.relateStatus = model.relateStatus;
                this.shareFlag = model.shareFlag;
                this.trial = model.trial;
            } 

            /**
             * Algorithm.
             */
            public Builder algorithm(String algorithm) {
                this.algorithm = algorithm;
                return this;
            }

            /**
             * AliasName.
             */
            public Builder aliasName(String aliasName) {
                this.aliasName = aliasName;
                return this;
            }

            /**
             * CaIdentifier.
             */
            public Builder caIdentifier(String caIdentifier) {
                this.caIdentifier = caIdentifier;
                return this;
            }

            /**
             * CertCount.
             */
            public Builder certCount(Long certCount) {
                this.certCount = certCount;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * InstanceUuid.
             */
            public Builder instanceUuid(String instanceUuid) {
                this.instanceUuid = instanceUuid;
                return this;
            }

            /**
             * IssuedCertCount.
             */
            public Builder issuedCertCount(Long issuedCertCount) {
                this.issuedCertCount = issuedCertCount;
                return this;
            }

            /**
             * RelateStatus.
             */
            public Builder relateStatus(Boolean relateStatus) {
                this.relateStatus = relateStatus;
                return this;
            }

            /**
             * ShareFlag.
             */
            public Builder shareFlag(Integer shareFlag) {
                this.shareFlag = shareFlag;
                return this;
            }

            /**
             * Trial.
             */
            public Builder trial(String trial) {
                this.trial = trial;
                return this;
            }

            public PCAInstanceList build() {
                return new PCAInstanceList(this);
            } 

        } 

    }
}
