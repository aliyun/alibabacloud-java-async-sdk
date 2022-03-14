// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FixCheckWarningsRequest} extends {@link RequestModel}
 *
 * <p>FixCheckWarningsRequest</p>
 */
public class FixCheckWarningsRequest extends Request {
    @Query
    @NameInMap("CheckParams")
    @Validation(required = true)
    private String checkParams;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("RiskId")
    @Validation(required = true)
    private Long riskId;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("Uuids")
    @Validation(required = true)
    private String uuids;

    private FixCheckWarningsRequest(Builder builder) {
        super(builder);
        this.checkParams = builder.checkParams;
        this.lang = builder.lang;
        this.riskId = builder.riskId;
        this.sourceIp = builder.sourceIp;
        this.uuids = builder.uuids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FixCheckWarningsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkParams
     */
    public String getCheckParams() {
        return this.checkParams;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return riskId
     */
    public Long getRiskId() {
        return this.riskId;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return uuids
     */
    public String getUuids() {
        return this.uuids;
    }

    public static final class Builder extends Request.Builder<FixCheckWarningsRequest, Builder> {
        private String checkParams; 
        private String lang; 
        private Long riskId; 
        private String sourceIp; 
        private String uuids; 

        private Builder() {
            super();
        } 

        private Builder(FixCheckWarningsRequest request) {
            super(request);
            this.checkParams = request.checkParams;
            this.lang = request.lang;
            this.riskId = request.riskId;
            this.sourceIp = request.sourceIp;
            this.uuids = request.uuids;
        } 

        /**
         * CheckParams.
         */
        public Builder checkParams(String checkParams) {
            this.putQueryParameter("CheckParams", checkParams);
            this.checkParams = checkParams;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * RiskId.
         */
        public Builder riskId(Long riskId) {
            this.putQueryParameter("RiskId", riskId);
            this.riskId = riskId;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * Uuids.
         */
        public Builder uuids(String uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        @Override
        public FixCheckWarningsRequest build() {
            return new FixCheckWarningsRequest(this);
        } 

    } 

}
