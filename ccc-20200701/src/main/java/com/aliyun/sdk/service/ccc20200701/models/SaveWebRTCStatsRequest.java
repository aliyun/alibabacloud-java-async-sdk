// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SaveWebRTCStatsRequest} extends {@link RequestModel}
 *
 * <p>SaveWebRTCStatsRequest</p>
 */
public class SaveWebRTCStatsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String callId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GeneralInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String generalInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GoogAddress")
    @com.aliyun.core.annotation.Validation(required = true)
    private String googAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReceiverReport")
    @com.aliyun.core.annotation.Validation(required = true)
    private String receiverReport;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SenderReport")
    @com.aliyun.core.annotation.Validation(required = true)
    private String senderReport;

    private SaveWebRTCStatsRequest(Builder builder) {
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

    public static SaveWebRTCStatsRequest create() {
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

    public static final class Builder extends Request.Builder<SaveWebRTCStatsRequest, Builder> {
        private String callId; 
        private String generalInfo; 
        private String googAddress; 
        private String instanceId; 
        private String receiverReport; 
        private String senderReport; 

        private Builder() {
            super();
        } 

        private Builder(SaveWebRTCStatsRequest request) {
            super(request);
            this.callId = request.callId;
            this.generalInfo = request.generalInfo;
            this.googAddress = request.googAddress;
            this.instanceId = request.instanceId;
            this.receiverReport = request.receiverReport;
            this.senderReport = request.senderReport;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>257e73de-1ee8-123b-0b9a-00163e0a****</p>
         */
        public Builder callId(String callId) {
            this.putQueryParameter("CallId", callId);
            this.callId = callId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder generalInfo(String generalInfo) {
            this.putQueryParameter("GeneralInfo", generalInfo);
            this.generalInfo = generalInfo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;47.101.XX.XX&quot;,&quot;44368&quot;,&quot;47.104.XX.XX&quot;,&quot;37947&quot;]</p>
         */
        public Builder googAddress(String googAddress) {
            this.putQueryParameter("GoogAddress", googAddress);
            this.googAddress = googAddress;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;1&quot;,&quot;1649328987&quot;,&quot;40&quot;,&quot;PCMU&quot;,&quot;383560&quot;,&quot;89&quot;,&quot;49&quot;,&quot;ssrc_1649328987_recv&quot;,&quot;2022-03-15T09:52:08.820Z&quot;,&quot;&quot;,&quot;0&quot;,&quot;20000&quot;]</p>
         */
        public Builder receiverReport(String receiverReport) {
            this.putQueryParameter("ReceiverReport", receiverReport);
            this.receiverReport = receiverReport;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;11090&quot;,&quot;2055127460&quot;,&quot;0&quot;,&quot;2236&quot;,&quot;384592&quot;,&quot;ssrc_2055127460_send&quot;,&quot;2022-03-15T09:52:08.820Z&quot;,&quot;1&quot;]</p>
         */
        public Builder senderReport(String senderReport) {
            this.putQueryParameter("SenderReport", senderReport);
            this.senderReport = senderReport;
            return this;
        }

        @Override
        public SaveWebRTCStatsRequest build() {
            return new SaveWebRTCStatsRequest(this);
        } 

    } 

}
