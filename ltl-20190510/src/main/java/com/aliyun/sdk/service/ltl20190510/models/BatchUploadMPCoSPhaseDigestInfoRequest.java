// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchUploadMPCoSPhaseDigestInfoRequest} extends {@link RequestModel}
 *
 * <p>BatchUploadMPCoSPhaseDigestInfoRequest</p>
 */
public class BatchUploadMPCoSPhaseDigestInfoRequest extends Request {
    @Query
    @NameInMap("ApiVersion")
    @Validation(required = true)
    private String apiVersion;

    @Query
    @NameInMap("BizChainId")
    @Validation(required = true)
    private String bizChainId;

    @Query
    @NameInMap("PhaseDataList")
    @Validation(required = true)
    private java.util.Map < String, ? > phaseDataList;

    @Query
    @NameInMap("PhaseGroupId")
    @Validation(required = true)
    private String phaseGroupId;

    @Query
    @NameInMap("PhaseId")
    @Validation(required = true)
    private String phaseId;

    private BatchUploadMPCoSPhaseDigestInfoRequest(Builder builder) {
        super(builder);
        this.apiVersion = builder.apiVersion;
        this.bizChainId = builder.bizChainId;
        this.phaseDataList = builder.phaseDataList;
        this.phaseGroupId = builder.phaseGroupId;
        this.phaseId = builder.phaseId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchUploadMPCoSPhaseDigestInfoRequest create() {
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
     * @return phaseDataList
     */
    public java.util.Map < String, ? > getPhaseDataList() {
        return this.phaseDataList;
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

    public static final class Builder extends Request.Builder<BatchUploadMPCoSPhaseDigestInfoRequest, Builder> {
        private String apiVersion; 
        private String bizChainId; 
        private java.util.Map < String, ? > phaseDataList; 
        private String phaseGroupId; 
        private String phaseId; 

        private Builder() {
            super();
        } 

        private Builder(BatchUploadMPCoSPhaseDigestInfoRequest request) {
            super(request);
            this.apiVersion = request.apiVersion;
            this.bizChainId = request.bizChainId;
            this.phaseDataList = request.phaseDataList;
            this.phaseGroupId = request.phaseGroupId;
            this.phaseId = request.phaseId;
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
         * PhaseDataList.
         */
        public Builder phaseDataList(java.util.Map < String, ? > phaseDataList) {
            String phaseDataListShrink = shrink(phaseDataList, "PhaseDataList", "json");
            this.putQueryParameter("PhaseDataList", phaseDataListShrink);
            this.phaseDataList = phaseDataList;
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

        @Override
        public BatchUploadMPCoSPhaseDigestInfoRequest build() {
            return new BatchUploadMPCoSPhaseDigestInfoRequest(this);
        } 

    } 

}
