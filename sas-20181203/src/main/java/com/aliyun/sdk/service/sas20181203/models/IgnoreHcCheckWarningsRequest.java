// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

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
    @Validation(required = true)
    private String riskId;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
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

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<IgnoreHcCheckWarningsRequest, Builder> {
        private String checkIds; 
        private String checkWarningIds; 
        private String reason; 
        private String riskId; 
        private String sourceIp; 
        private Long type; 

        private Builder() {
            super();
        } 

        private Builder(IgnoreHcCheckWarningsRequest request) {
            super(request);
            this.checkIds = request.checkIds;
            this.checkWarningIds = request.checkWarningIds;
            this.reason = request.reason;
            this.riskId = request.riskId;
            this.sourceIp = request.sourceIp;
            this.type = request.type;
        } 

        /**
         * CheckIds.
         */
        public Builder checkIds(String checkIds) {
            this.putQueryParameter("CheckIds", checkIds);
            this.checkIds = checkIds;
            return this;
        }

        /**
         * CheckWarningIds.
         */
        public Builder checkWarningIds(String checkWarningIds) {
            this.putQueryParameter("CheckWarningIds", checkWarningIds);
            this.checkWarningIds = checkWarningIds;
            return this;
        }

        /**
         * Reason.
         */
        public Builder reason(String reason) {
            this.putQueryParameter("Reason", reason);
            this.reason = reason;
            return this;
        }

        /**
         * RiskId.
         */
        public Builder riskId(String riskId) {
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
         * Type.
         */
        public Builder type(Long type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public IgnoreHcCheckWarningsRequest build() {
            return new IgnoreHcCheckWarningsRequest(this);
        } 

    } 

}
