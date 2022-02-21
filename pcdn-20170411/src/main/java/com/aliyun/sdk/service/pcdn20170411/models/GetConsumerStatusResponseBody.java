// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pcdn20170411.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetConsumerStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetConsumerStatusResponseBody</p>
 */
public class GetConsumerStatusResponseBody extends TeaModel {
    @NameInMap("Audit")
    private Integer audit;

    @NameInMap("BusinessType")
    private String businessType;

    @NameInMap("CdnUrlRedirectFlag")
    private Boolean cdnUrlRedirectFlag;

    @NameInMap("Code")
    private Integer code;

    @NameInMap("Comment")
    private String comment;

    @NameInMap("CreatedAt")
    private String createdAt;

    @NameInMap("Inservice")
    private Boolean inservice;

    @NameInMap("IntegreatedMode")
    private Integer integreatedMode;

    @NameInMap("LiveMonitor")
    private Boolean liveMonitor;

    @NameInMap("RealtimeMonitor")
    private Boolean realtimeMonitor;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UpdatedAt")
    private String updatedAt;

    private GetConsumerStatusResponseBody(Builder builder) {
        this.audit = builder.audit;
        this.businessType = builder.businessType;
        this.cdnUrlRedirectFlag = builder.cdnUrlRedirectFlag;
        this.code = builder.code;
        this.comment = builder.comment;
        this.createdAt = builder.createdAt;
        this.inservice = builder.inservice;
        this.integreatedMode = builder.integreatedMode;
        this.liveMonitor = builder.liveMonitor;
        this.realtimeMonitor = builder.realtimeMonitor;
        this.requestId = builder.requestId;
        this.updatedAt = builder.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConsumerStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return audit
     */
    public Integer getAudit() {
        return this.audit;
    }

    /**
     * @return businessType
     */
    public String getBusinessType() {
        return this.businessType;
    }

    /**
     * @return cdnUrlRedirectFlag
     */
    public Boolean getCdnUrlRedirectFlag() {
        return this.cdnUrlRedirectFlag;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return inservice
     */
    public Boolean getInservice() {
        return this.inservice;
    }

    /**
     * @return integreatedMode
     */
    public Integer getIntegreatedMode() {
        return this.integreatedMode;
    }

    /**
     * @return liveMonitor
     */
    public Boolean getLiveMonitor() {
        return this.liveMonitor;
    }

    /**
     * @return realtimeMonitor
     */
    public Boolean getRealtimeMonitor() {
        return this.realtimeMonitor;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public static final class Builder {
        private Integer audit; 
        private String businessType; 
        private Boolean cdnUrlRedirectFlag; 
        private Integer code; 
        private String comment; 
        private String createdAt; 
        private Boolean inservice; 
        private Integer integreatedMode; 
        private Boolean liveMonitor; 
        private Boolean realtimeMonitor; 
        private String requestId; 
        private String updatedAt; 

        /**
         * Audit.
         */
        public Builder audit(Integer audit) {
            this.audit = audit;
            return this;
        }

        /**
         * BusinessType.
         */
        public Builder businessType(String businessType) {
            this.businessType = businessType;
            return this;
        }

        /**
         * CdnUrlRedirectFlag.
         */
        public Builder cdnUrlRedirectFlag(Boolean cdnUrlRedirectFlag) {
            this.cdnUrlRedirectFlag = cdnUrlRedirectFlag;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Comment.
         */
        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * CreatedAt.
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Inservice.
         */
        public Builder inservice(Boolean inservice) {
            this.inservice = inservice;
            return this;
        }

        /**
         * IntegreatedMode.
         */
        public Builder integreatedMode(Integer integreatedMode) {
            this.integreatedMode = integreatedMode;
            return this;
        }

        /**
         * LiveMonitor.
         */
        public Builder liveMonitor(Boolean liveMonitor) {
            this.liveMonitor = liveMonitor;
            return this;
        }

        /**
         * RealtimeMonitor.
         */
        public Builder realtimeMonitor(Boolean realtimeMonitor) {
            this.realtimeMonitor = realtimeMonitor;
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
         * UpdatedAt.
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public GetConsumerStatusResponseBody build() {
            return new GetConsumerStatusResponseBody(this);
        } 

    } 

}
