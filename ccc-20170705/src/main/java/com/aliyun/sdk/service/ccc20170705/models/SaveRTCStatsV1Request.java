// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveRTCStatsV1Request} extends {@link RequestModel}
 *
 * <p>SaveRTCStatsV1Request</p>
 */
public class SaveRTCStatsV1Request extends Request {
    @Query
    @NameInMap("CallId")
    @Validation(required = true)
    private String callId;

    @Query
    @NameInMap("GeneralInfo")
    @Validation(required = true)
    private String generalInfo;

    @Query
    @NameInMap("GoogAddress")
    @Validation(required = true)
    private String googAddress;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("ReceiverReport")
    @Validation(required = true)
    private String receiverReport;

    @Query
    @NameInMap("SenderReport")
    @Validation(required = true)
    private String senderReport;

    private SaveRTCStatsV1Request(Builder builder) {
        super(builder);
        this.callId = builder.callId;
        this.generalInfo = builder.generalInfo;
        this.googAddress = builder.googAddress;
        this.instanceId = builder.instanceId;
        this.receiverReport = builder.receiverReport;
        this.senderReport = builder.senderReport;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveRTCStatsV1Request create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callId
     */
    public String getCallId() {
        return this.callId;
    }

    /**
     * @return generalInfo
     */
    public String getGeneralInfo() {
        return this.generalInfo;
    }

    /**
     * @return googAddress
     */
    public String getGoogAddress() {
        return this.googAddress;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return receiverReport
     */
    public String getReceiverReport() {
        return this.receiverReport;
    }

    /**
     * @return senderReport
     */
    public String getSenderReport() {
        return this.senderReport;
    }

    public static final class Builder extends Request.Builder<SaveRTCStatsV1Request, Builder> {
        private String callId; 
        private String generalInfo; 
        private String googAddress; 
        private String instanceId; 
        private String receiverReport; 
        private String senderReport; 

        private Builder() {
            super();
        } 

        private Builder(SaveRTCStatsV1Request response) {
            super(response);
            this.callId = response.callId;
            this.generalInfo = response.generalInfo;
            this.googAddress = response.googAddress;
            this.instanceId = response.instanceId;
            this.receiverReport = response.receiverReport;
            this.senderReport = response.senderReport;
        } 

        /**
         * CallId.
         */
        public Builder callId(String callId) {
            this.putQueryParameter("CallId", callId);
            this.callId = callId;
            return this;
        }

        /**
         * GeneralInfo.
         */
        public Builder generalInfo(String generalInfo) {
            this.putQueryParameter("GeneralInfo", generalInfo);
            this.generalInfo = generalInfo;
            return this;
        }

        /**
         * GoogAddress.
         */
        public Builder googAddress(String googAddress) {
            this.putQueryParameter("GoogAddress", googAddress);
            this.googAddress = googAddress;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ReceiverReport.
         */
        public Builder receiverReport(String receiverReport) {
            this.putQueryParameter("ReceiverReport", receiverReport);
            this.receiverReport = receiverReport;
            return this;
        }

        /**
         * SenderReport.
         */
        public Builder senderReport(String senderReport) {
            this.putQueryParameter("SenderReport", senderReport);
            this.senderReport = senderReport;
            return this;
        }

        @Override
        public SaveRTCStatsV1Request build() {
            return new SaveRTCStatsV1Request(this);
        } 

    } 

}
