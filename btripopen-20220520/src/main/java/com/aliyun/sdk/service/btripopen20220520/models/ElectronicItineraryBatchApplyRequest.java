// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link ElectronicItineraryBatchApplyRequest} extends {@link RequestModel}
 *
 * <p>ElectronicItineraryBatchApplyRequest</p>
 */
public class ElectronicItineraryBatchApplyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("apply_itinerary_list")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<ApplyItineraryList> applyItineraryList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("can_reprint")
    private Boolean canReprint;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-so-corp-token")
    private String xAcsBtripSoCorpToken;

    private ElectronicItineraryBatchApplyRequest(Builder builder) {
        super(builder);
        this.applyItineraryList = builder.applyItineraryList;
        this.canReprint = builder.canReprint;
        this.xAcsBtripSoCorpToken = builder.xAcsBtripSoCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ElectronicItineraryBatchApplyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applyItineraryList
     */
    public java.util.List<ApplyItineraryList> getApplyItineraryList() {
        return this.applyItineraryList;
    }

    /**
     * @return canReprint
     */
    public Boolean getCanReprint() {
        return this.canReprint;
    }

    /**
     * @return xAcsBtripSoCorpToken
     */
    public String getXAcsBtripSoCorpToken() {
        return this.xAcsBtripSoCorpToken;
    }

    public static final class Builder extends Request.Builder<ElectronicItineraryBatchApplyRequest, Builder> {
        private java.util.List<ApplyItineraryList> applyItineraryList; 
        private Boolean canReprint; 
        private String xAcsBtripSoCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(ElectronicItineraryBatchApplyRequest request) {
            super(request);
            this.applyItineraryList = request.applyItineraryList;
            this.canReprint = request.canReprint;
            this.xAcsBtripSoCorpToken = request.xAcsBtripSoCorpToken;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder applyItineraryList(java.util.List<ApplyItineraryList> applyItineraryList) {
            String applyItineraryListShrink = shrink(applyItineraryList, "apply_itinerary_list", "json");
            this.putBodyParameter("apply_itinerary_list", applyItineraryListShrink);
            this.applyItineraryList = applyItineraryList;
            return this;
        }

        /**
         * can_reprint.
         */
        public Builder canReprint(Boolean canReprint) {
            this.putBodyParameter("can_reprint", canReprint);
            this.canReprint = canReprint;
            return this;
        }

        /**
         * x-acs-btrip-so-corp-token.
         */
        public Builder xAcsBtripSoCorpToken(String xAcsBtripSoCorpToken) {
            this.putHeaderParameter("x-acs-btrip-so-corp-token", xAcsBtripSoCorpToken);
            this.xAcsBtripSoCorpToken = xAcsBtripSoCorpToken;
            return this;
        }

        @Override
        public ElectronicItineraryBatchApplyRequest build() {
            return new ElectronicItineraryBatchApplyRequest(this);
        } 

    } 

    /**
     * 
     * {@link ElectronicItineraryBatchApplyRequest} extends {@link TeaModel}
     *
     * <p>ElectronicItineraryBatchApplyRequest</p>
     */
    public static class ApplyItineraryList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("purchaser_name")
        private String purchaserName;

        @com.aliyun.core.annotation.NameInMap("purchaser_tax_no")
        private String purchaserTaxNo;

        @com.aliyun.core.annotation.NameInMap("purchaser_type")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer purchaserType;

        @com.aliyun.core.annotation.NameInMap("ticket_no")
        @com.aliyun.core.annotation.Validation(required = true)
        private String ticketNo;

        private ApplyItineraryList(Builder builder) {
            this.purchaserName = builder.purchaserName;
            this.purchaserTaxNo = builder.purchaserTaxNo;
            this.purchaserType = builder.purchaserType;
            this.ticketNo = builder.ticketNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplyItineraryList create() {
            return builder().build();
        }

        /**
         * @return purchaserName
         */
        public String getPurchaserName() {
            return this.purchaserName;
        }

        /**
         * @return purchaserTaxNo
         */
        public String getPurchaserTaxNo() {
            return this.purchaserTaxNo;
        }

        /**
         * @return purchaserType
         */
        public Integer getPurchaserType() {
            return this.purchaserType;
        }

        /**
         * @return ticketNo
         */
        public String getTicketNo() {
            return this.ticketNo;
        }

        public static final class Builder {
            private String purchaserName; 
            private String purchaserTaxNo; 
            private Integer purchaserType; 
            private String ticketNo; 

            /**
             * purchaser_name.
             */
            public Builder purchaserName(String purchaserName) {
                this.purchaserName = purchaserName;
                return this;
            }

            /**
             * purchaser_tax_no.
             */
            public Builder purchaserTaxNo(String purchaserTaxNo) {
                this.purchaserTaxNo = purchaserTaxNo;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder purchaserType(Integer purchaserType) {
                this.purchaserType = purchaserType;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>781-2205431917</p>
             */
            public Builder ticketNo(String ticketNo) {
                this.ticketNo = ticketNo;
                return this;
            }

            public ApplyItineraryList build() {
                return new ApplyItineraryList(this);
            } 

        } 

    }
}
