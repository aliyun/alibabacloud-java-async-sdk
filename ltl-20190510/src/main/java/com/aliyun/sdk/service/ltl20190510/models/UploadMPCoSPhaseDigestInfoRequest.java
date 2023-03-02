// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadMPCoSPhaseDigestInfoRequest} extends {@link RequestModel}
 *
 * <p>UploadMPCoSPhaseDigestInfoRequest</p>
 */
public class UploadMPCoSPhaseDigestInfoRequest extends Request {
    @Query
    @NameInMap("ApiVersion")
    @Validation(required = true)
    private String apiVersion;

    @Query
    @NameInMap("BizChainId")
    @Validation(required = true)
    private String bizChainId;

    @Query
    @NameInMap("DataKey")
    @Validation(required = true)
    private String dataKey;

    @Query
    @NameInMap("DataSeq")
    private String dataSeq;

    @Query
    @NameInMap("PhaseData")
    @Validation(required = true)
    private String phaseData;

    @Query
    @NameInMap("PhaseGroupId")
    @Validation(required = true)
    private String phaseGroupId;

    @Query
    @NameInMap("PhaseId")
    @Validation(required = true)
    private String phaseId;

    @Query
    @NameInMap("RelatedDataList")
    private java.util.Map < String, ? > relatedDataList;

    private UploadMPCoSPhaseDigestInfoRequest(Builder builder) {
        super(builder);
        this.apiVersion = builder.apiVersion;
        this.bizChainId = builder.bizChainId;
        this.dataKey = builder.dataKey;
        this.dataSeq = builder.dataSeq;
        this.phaseData = builder.phaseData;
        this.phaseGroupId = builder.phaseGroupId;
        this.phaseId = builder.phaseId;
        this.relatedDataList = builder.relatedDataList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadMPCoSPhaseDigestInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiVersion
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /**
     * @return bizChainId
     */
    public String getBizChainId() {
        return this.bizChainId;
    }

    /**
     * @return dataKey
     */
    public String getDataKey() {
        return this.dataKey;
    }

    /**
     * @return dataSeq
     */
    public String getDataSeq() {
        return this.dataSeq;
    }

    /**
     * @return phaseData
     */
    public String getPhaseData() {
        return this.phaseData;
    }

    /**
     * @return phaseGroupId
     */
    public String getPhaseGroupId() {
        return this.phaseGroupId;
    }

    /**
     * @return phaseId
     */
    public String getPhaseId() {
        return this.phaseId;
    }

    /**
     * @return relatedDataList
     */
    public java.util.Map < String, ? > getRelatedDataList() {
        return this.relatedDataList;
    }

    public static final class Builder extends Request.Builder<UploadMPCoSPhaseDigestInfoRequest, Builder> {
        private String apiVersion; 
        private String bizChainId; 
        private String dataKey; 
        private String dataSeq; 
        private String phaseData; 
        private String phaseGroupId; 
        private String phaseId; 
        private java.util.Map < String, ? > relatedDataList; 

        private Builder() {
            super();
        } 

        private Builder(UploadMPCoSPhaseDigestInfoRequest request) {
            super(request);
            this.apiVersion = request.apiVersion;
            this.bizChainId = request.bizChainId;
            this.dataKey = request.dataKey;
            this.dataSeq = request.dataSeq;
            this.phaseData = request.phaseData;
            this.phaseGroupId = request.phaseGroupId;
            this.phaseId = request.phaseId;
            this.relatedDataList = request.relatedDataList;
        } 

        /**
         * ApiVersion.
         */
        public Builder apiVersion(String apiVersion) {
            this.putQueryParameter("ApiVersion", apiVersion);
            this.apiVersion = apiVersion;
            return this;
        }

        /**
         * BizChainId.
         */
        public Builder bizChainId(String bizChainId) {
            this.putQueryParameter("BizChainId", bizChainId);
            this.bizChainId = bizChainId;
            return this;
        }

        /**
         * DataKey.
         */
        public Builder dataKey(String dataKey) {
            this.putQueryParameter("DataKey", dataKey);
            this.dataKey = dataKey;
            return this;
        }

        /**
         * DataSeq.
         */
        public Builder dataSeq(String dataSeq) {
            this.putQueryParameter("DataSeq", dataSeq);
            this.dataSeq = dataSeq;
            return this;
        }

        /**
         * PhaseData.
         */
        public Builder phaseData(String phaseData) {
            this.putQueryParameter("PhaseData", phaseData);
            this.phaseData = phaseData;
            return this;
        }

        /**
         * PhaseGroupId.
         */
        public Builder phaseGroupId(String phaseGroupId) {
            this.putQueryParameter("PhaseGroupId", phaseGroupId);
            this.phaseGroupId = phaseGroupId;
            return this;
        }

        /**
         * PhaseId.
         */
        public Builder phaseId(String phaseId) {
            this.putQueryParameter("PhaseId", phaseId);
            this.phaseId = phaseId;
            return this;
        }

        /**
         * RelatedDataList.
         */
        public Builder relatedDataList(java.util.Map < String, ? > relatedDataList) {
            String relatedDataListShrink = shrink(relatedDataList, "RelatedDataList", "json");
            this.putQueryParameter("RelatedDataList", relatedDataListShrink);
            this.relatedDataList = relatedDataList;
            return this;
        }

        @Override
        public UploadMPCoSPhaseDigestInfoRequest build() {
            return new UploadMPCoSPhaseDigestInfoRequest(this);
        } 

    } 

}
