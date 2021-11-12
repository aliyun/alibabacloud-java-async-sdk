// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link FixCheckWarningsRequest} extends {@link RequestModel}
 *
 * <p>FixCheckWarningsRequest</p>
 */
public class FixCheckWarningsRequest extends Request {
    @Query
    @NameInMap("CheckParams")
    private String checkParams;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("RiskId")
    private Long riskId;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("Uuids")
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

    public static final class Builder extends Request.Builder {
        private String checkParams; 
        private String lang; 
        private Long riskId; 
        private String sourceIp; 
        private String uuids; 

        /**
         * <p>CheckParams.</p>
         */
        public Builder checkParams(String checkParams) {
            this.putQueryParameter("CheckParams", checkParams);
            this.checkParams = checkParams;
            return this;
        }

        /**
         * <p>Lang.</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>RiskId.</p>
         */
        public Builder riskId(Long riskId) {
            this.putQueryParameter("RiskId", riskId);
            this.riskId = riskId;
            return this;
        }

        /**
         * <p>SourceIp.</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>Uuids.</p>
         */
        public Builder uuids(String uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        public FixCheckWarningsRequest build() {
            return new FixCheckWarningsRequest(this);
        } 

    } 

}
