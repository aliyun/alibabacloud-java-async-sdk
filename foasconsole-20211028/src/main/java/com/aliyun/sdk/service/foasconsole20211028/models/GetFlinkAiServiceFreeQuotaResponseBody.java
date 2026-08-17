// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.foasconsole20211028.models;

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
 * {@link GetFlinkAiServiceFreeQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>GetFlinkAiServiceFreeQuotaResponseBody</p>
 */
public class GetFlinkAiServiceFreeQuotaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FlinkAiFreeQuotaDTO")
    private FlinkAiFreeQuotaDTO flinkAiFreeQuotaDTO;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetFlinkAiServiceFreeQuotaResponseBody(Builder builder) {
        this.flinkAiFreeQuotaDTO = builder.flinkAiFreeQuotaDTO;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFlinkAiServiceFreeQuotaResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return flinkAiFreeQuotaDTO
     */
    public FlinkAiFreeQuotaDTO getFlinkAiFreeQuotaDTO() {
        return this.flinkAiFreeQuotaDTO;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private FlinkAiFreeQuotaDTO flinkAiFreeQuotaDTO; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetFlinkAiServiceFreeQuotaResponseBody model) {
            this.flinkAiFreeQuotaDTO = model.flinkAiFreeQuotaDTO;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * FlinkAiFreeQuotaDTO.
         */
        public Builder flinkAiFreeQuotaDTO(FlinkAiFreeQuotaDTO flinkAiFreeQuotaDTO) {
            this.flinkAiFreeQuotaDTO = flinkAiFreeQuotaDTO;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetFlinkAiServiceFreeQuotaResponseBody build() {
            return new GetFlinkAiServiceFreeQuotaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetFlinkAiServiceFreeQuotaResponseBody} extends {@link TeaModel}
     *
     * <p>GetFlinkAiServiceFreeQuotaResponseBody</p>
     */
    public static class UsedQuotaDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Amount")
        private Double amount;

        @com.aliyun.core.annotation.NameInMap("UsageType")
        private String usageType;

        private UsedQuotaDetails(Builder builder) {
            this.amount = builder.amount;
            this.usageType = builder.usageType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UsedQuotaDetails create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Double getAmount() {
            return this.amount;
        }

        /**
         * @return usageType
         */
        public String getUsageType() {
            return this.usageType;
        }

        public static final class Builder {
            private Double amount; 
            private String usageType; 

            private Builder() {
            } 

            private Builder(UsedQuotaDetails model) {
                this.amount = model.amount;
                this.usageType = model.usageType;
            } 

            /**
             * Amount.
             */
            public Builder amount(Double amount) {
                this.amount = amount;
                return this;
            }

            /**
             * UsageType.
             */
            public Builder usageType(String usageType) {
                this.usageType = usageType;
                return this;
            }

            public UsedQuotaDetails build() {
                return new UsedQuotaDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetFlinkAiServiceFreeQuotaResponseBody} extends {@link TeaModel}
     *
     * <p>GetFlinkAiServiceFreeQuotaResponseBody</p>
     */
    public static class FlinkAiFreeQuotaDTO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FreeQuota")
        private Double freeQuota;

        @com.aliyun.core.annotation.NameInMap("UsedQuotaDetails")
        private java.util.List<UsedQuotaDetails> usedQuotaDetails;

        private FlinkAiFreeQuotaDTO(Builder builder) {
            this.freeQuota = builder.freeQuota;
            this.usedQuotaDetails = builder.usedQuotaDetails;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlinkAiFreeQuotaDTO create() {
            return builder().build();
        }

        /**
         * @return freeQuota
         */
        public Double getFreeQuota() {
            return this.freeQuota;
        }

        /**
         * @return usedQuotaDetails
         */
        public java.util.List<UsedQuotaDetails> getUsedQuotaDetails() {
            return this.usedQuotaDetails;
        }

        public static final class Builder {
            private Double freeQuota; 
            private java.util.List<UsedQuotaDetails> usedQuotaDetails; 

            private Builder() {
            } 

            private Builder(FlinkAiFreeQuotaDTO model) {
                this.freeQuota = model.freeQuota;
                this.usedQuotaDetails = model.usedQuotaDetails;
            } 

            /**
             * FreeQuota.
             */
            public Builder freeQuota(Double freeQuota) {
                this.freeQuota = freeQuota;
                return this;
            }

            /**
             * UsedQuotaDetails.
             */
            public Builder usedQuotaDetails(java.util.List<UsedQuotaDetails> usedQuotaDetails) {
                this.usedQuotaDetails = usedQuotaDetails;
                return this;
            }

            public FlinkAiFreeQuotaDTO build() {
                return new FlinkAiFreeQuotaDTO(this);
            } 

        } 

    }
}
