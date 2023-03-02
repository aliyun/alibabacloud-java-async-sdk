// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMPCoSPhaseInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeMPCoSPhaseInfoRequest</p>
 */
public class DescribeMPCoSPhaseInfoRequest extends Request {
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
    @NameInMap("PhaseGroupId")
    @Validation(required = true)
    private String phaseGroupId;

    @Query
    @NameInMap("PhaseId")
    @Validation(required = true)
    private String phaseId;

    private DescribeMPCoSPhaseInfoRequest(Builder builder) {
        super(builder);
        this.apiVersion = builder.apiVersion;
        this.bizChainId = builder.bizChainId;
        this.dataKey = builder.dataKey;
        this.dataSeq = builder.dataSeq;
        this.phaseGroupId = builder.phaseGroupId;
        this.phaseId = builder.phaseId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMPCoSPhaseInfoRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeMPCoSPhaseInfoRequest, Builder> {
        private String apiVersion; 
        private String bizChainId; 
        private String dataKey; 
        private String dataSeq; 
        private String phaseGroupId; 
        private String phaseId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMPCoSPhaseInfoRequest request) {
            super(request);
            this.apiVersion = request.apiVersion;
            this.bizChainId = request.bizChainId;
            this.dataKey = request.dataKey;
            this.dataSeq = request.dataSeq;
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
        public DescribeMPCoSPhaseInfoRequest build() {
            return new DescribeMPCoSPhaseInfoRequest(this);
        } 

    } 

}
