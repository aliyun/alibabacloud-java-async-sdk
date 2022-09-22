// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySpaceSpecDetailResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySpaceSpecDetailResponseBody</p>
 */
public class QuerySpaceSpecDetailResponseBody extends TeaModel {
    @NameInMap("CsCdnTraffic")
    private Long csCdnTraffic;

    @NameInMap("CsDownloadCount")
    private Long csDownloadCount;

    @NameInMap("CsStorageSize")
    private Long csStorageSize;

    @NameInMap("CsUploadCount")
    private Long csUploadCount;

    @NameInMap("DbReadCount")
    private Long dbReadCount;

    @NameInMap("DbStorageSize")
    private Long dbStorageSize;

    @NameInMap("DbWriteCount")
    private Long dbWriteCount;

    @NameInMap("FcCost")
    private Long fcCost;

    @NameInMap("FcRequestCount")
    private Long fcRequestCount;

    @NameInMap("FcTxTraffic")
    private Long fcTxTraffic;

    @NameInMap("GmtCreate")
    private String gmtCreate;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SpecCode")
    private String specCode;

    @NameInMap("SpecDetailText")
    private String specDetailText;

    @NameInMap("WhCdnTraffic")
    private Long whCdnTraffic;

    @NameInMap("WhStorageSize")
    private Long whStorageSize;

    private QuerySpaceSpecDetailResponseBody(Builder builder) {
        this.csCdnTraffic = builder.csCdnTraffic;
        this.csDownloadCount = builder.csDownloadCount;
        this.csStorageSize = builder.csStorageSize;
        this.csUploadCount = builder.csUploadCount;
        this.dbReadCount = builder.dbReadCount;
        this.dbStorageSize = builder.dbStorageSize;
        this.dbWriteCount = builder.dbWriteCount;
        this.fcCost = builder.fcCost;
        this.fcRequestCount = builder.fcRequestCount;
        this.fcTxTraffic = builder.fcTxTraffic;
        this.gmtCreate = builder.gmtCreate;
        this.requestId = builder.requestId;
        this.specCode = builder.specCode;
        this.specDetailText = builder.specDetailText;
        this.whCdnTraffic = builder.whCdnTraffic;
        this.whStorageSize = builder.whStorageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySpaceSpecDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return csCdnTraffic
     */
    public Long getCsCdnTraffic() {
        return this.csCdnTraffic;
    }

    /**
     * @return csDownloadCount
     */
    public Long getCsDownloadCount() {
        return this.csDownloadCount;
    }

    /**
     * @return csStorageSize
     */
    public Long getCsStorageSize() {
        return this.csStorageSize;
    }

    /**
     * @return csUploadCount
     */
    public Long getCsUploadCount() {
        return this.csUploadCount;
    }

    /**
     * @return dbReadCount
     */
    public Long getDbReadCount() {
        return this.dbReadCount;
    }

    /**
     * @return dbStorageSize
     */
    public Long getDbStorageSize() {
        return this.dbStorageSize;
    }

    /**
     * @return dbWriteCount
     */
    public Long getDbWriteCount() {
        return this.dbWriteCount;
    }

    /**
     * @return fcCost
     */
    public Long getFcCost() {
        return this.fcCost;
    }

    /**
     * @return fcRequestCount
     */
    public Long getFcRequestCount() {
        return this.fcRequestCount;
    }

    /**
     * @return fcTxTraffic
     */
    public Long getFcTxTraffic() {
        return this.fcTxTraffic;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return specCode
     */
    public String getSpecCode() {
        return this.specCode;
    }

    /**
     * @return specDetailText
     */
    public String getSpecDetailText() {
        return this.specDetailText;
    }

    /**
     * @return whCdnTraffic
     */
    public Long getWhCdnTraffic() {
        return this.whCdnTraffic;
    }

    /**
     * @return whStorageSize
     */
    public Long getWhStorageSize() {
        return this.whStorageSize;
    }

    public static final class Builder {
        private Long csCdnTraffic; 
        private Long csDownloadCount; 
        private Long csStorageSize; 
        private Long csUploadCount; 
        private Long dbReadCount; 
        private Long dbStorageSize; 
        private Long dbWriteCount; 
        private Long fcCost; 
        private Long fcRequestCount; 
        private Long fcTxTraffic; 
        private String gmtCreate; 
        private String requestId; 
        private String specCode; 
        private String specDetailText; 
        private Long whCdnTraffic; 
        private Long whStorageSize; 

        /**
         * CsCdnTraffic.
         */
        public Builder csCdnTraffic(Long csCdnTraffic) {
            this.csCdnTraffic = csCdnTraffic;
            return this;
        }

        /**
         * CsDownloadCount.
         */
        public Builder csDownloadCount(Long csDownloadCount) {
            this.csDownloadCount = csDownloadCount;
            return this;
        }

        /**
         * CsStorageSize.
         */
        public Builder csStorageSize(Long csStorageSize) {
            this.csStorageSize = csStorageSize;
            return this;
        }

        /**
         * CsUploadCount.
         */
        public Builder csUploadCount(Long csUploadCount) {
            this.csUploadCount = csUploadCount;
            return this;
        }

        /**
         * DbReadCount.
         */
        public Builder dbReadCount(Long dbReadCount) {
            this.dbReadCount = dbReadCount;
            return this;
        }

        /**
         * DbStorageSize.
         */
        public Builder dbStorageSize(Long dbStorageSize) {
            this.dbStorageSize = dbStorageSize;
            return this;
        }

        /**
         * DbWriteCount.
         */
        public Builder dbWriteCount(Long dbWriteCount) {
            this.dbWriteCount = dbWriteCount;
            return this;
        }

        /**
         * FcCost.
         */
        public Builder fcCost(Long fcCost) {
            this.fcCost = fcCost;
            return this;
        }

        /**
         * FcRequestCount.
         */
        public Builder fcRequestCount(Long fcRequestCount) {
            this.fcRequestCount = fcRequestCount;
            return this;
        }

        /**
         * FcTxTraffic.
         */
        public Builder fcTxTraffic(Long fcTxTraffic) {
            this.fcTxTraffic = fcTxTraffic;
            return this;
        }

        /**
         * GmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
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
         * SpecCode.
         */
        public Builder specCode(String specCode) {
            this.specCode = specCode;
            return this;
        }

        /**
         * SpecDetailText.
         */
        public Builder specDetailText(String specDetailText) {
            this.specDetailText = specDetailText;
            return this;
        }

        /**
         * WhCdnTraffic.
         */
        public Builder whCdnTraffic(Long whCdnTraffic) {
            this.whCdnTraffic = whCdnTraffic;
            return this;
        }

        /**
         * WhStorageSize.
         */
        public Builder whStorageSize(Long whStorageSize) {
            this.whStorageSize = whStorageSize;
            return this;
        }

        public QuerySpaceSpecDetailResponseBody build() {
            return new QuerySpaceSpecDetailResponseBody(this);
        } 

    } 

}
