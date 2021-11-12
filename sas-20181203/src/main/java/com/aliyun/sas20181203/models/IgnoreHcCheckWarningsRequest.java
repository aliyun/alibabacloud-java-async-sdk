// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link IgnoreHcCheckWarningsRequest} extends {@link RequestModel}
 *
 * <p>IgnoreHcCheckWarningsRequest</p>
 */
public class IgnoreHcCheckWarningsRequest extends Request {
    @Query
    @NameInMap("CheckIds")
    private String checkIds;

    @Query
    @NameInMap("CheckWarningIds")
    private String checkWarningIds;

    @Query
    @NameInMap("Reason")
    private String reason;

    @Query
    @NameInMap("RiskId")
    private String riskId;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("Type")
    private Long type;


    private IgnoreHcCheckWarningsRequest(Builder builder) {
        super(builder);
        this.checkIds = builder.checkIds;
        this.checkWarningIds = builder.checkWarningIds;
        this.reason = builder.reason;
        this.riskId = builder.riskId;
        this.sourceIp = builder.sourceIp;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IgnoreHcCheckWarningsRequest create() {
        return builder().build();
    }

    /**
     * @return checkIds
     */
    public String getCheckIds() {
        return this.checkIds;
    }

    /**
     * @return checkWarningIds
     */
    public String getCheckWarningIds() {
        return this.checkWarningIds;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return riskId
     */
    public String getRiskId() {
        return this.riskId;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return type
     */
    public Long getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder {
        private String checkIds; 
        private String checkWarningIds; 
        private String reason; 
        private String riskId; 
        private String sourceIp; 
        private Long type; 

        /**
         * <p>CheckIds.</p>
         */
        public Builder checkIds(String checkIds) {
            this.putQueryParameter("CheckIds", checkIds);
            this.checkIds = checkIds;
            return this;
        }

        /**
         * <p>CheckWarningIds.</p>
         */
        public Builder checkWarningIds(String checkWarningIds) {
            this.putQueryParameter("CheckWarningIds", checkWarningIds);
            this.checkWarningIds = checkWarningIds;
            return this;
        }

        /**
         * <p>Reason.</p>
         */
        public Builder reason(String reason) {
            this.putQueryParameter("Reason", reason);
            this.reason = reason;
            return this;
        }

        /**
         * <p>RiskId.</p>
         */
        public Builder riskId(String riskId) {
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
         * <p>Type.</p>
         */
        public Builder type(Long type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        public IgnoreHcCheckWarningsRequest build() {
            return new IgnoreHcCheckWarningsRequest(this);
        } 

    } 

}
