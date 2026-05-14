// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

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
 * {@link CloudCreateAsrRequest} extends {@link RequestModel}
 *
 * <p>CloudCreateAsrRequest</p>
 */
public class CloudCreateAsrRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long callType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnterpriseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long enterpriseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MainUniqueId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mainUniqueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordFile")
    @com.aliyun.core.annotation.Validation(required = true)
    private String recordFile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordSide")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long recordSide;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String recordType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SupportMp3")
    private String supportMp3;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UniqueId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uniqueId;

    private CloudCreateAsrRequest(Builder builder) {
        super(builder);
        this.callType = builder.callType;
        this.enterpriseId = builder.enterpriseId;
        this.mainUniqueId = builder.mainUniqueId;
        this.recordFile = builder.recordFile;
        this.recordSide = builder.recordSide;
        this.recordType = builder.recordType;
        this.supportMp3 = builder.supportMp3;
        this.uniqueId = builder.uniqueId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudCreateAsrRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callType
     */
    public Long getCallType() {
        return this.callType;
    }

    /**
     * @return enterpriseId
     */
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    /**
     * @return mainUniqueId
     */
    public String getMainUniqueId() {
        return this.mainUniqueId;
    }

    /**
     * @return recordFile
     */
    public String getRecordFile() {
        return this.recordFile;
    }

    /**
     * @return recordSide
     */
    public Long getRecordSide() {
        return this.recordSide;
    }

    /**
     * @return recordType
     */
    public String getRecordType() {
        return this.recordType;
    }

    /**
     * @return supportMp3
     */
    public String getSupportMp3() {
        return this.supportMp3;
    }

    /**
     * @return uniqueId
     */
    public String getUniqueId() {
        return this.uniqueId;
    }

    public static final class Builder extends Request.Builder<CloudCreateAsrRequest, Builder> {
        private Long callType; 
        private Long enterpriseId; 
        private String mainUniqueId; 
        private String recordFile; 
        private Long recordSide; 
        private String recordType; 
        private String supportMp3; 
        private String uniqueId; 

        private Builder() {
            super();
        } 

        private Builder(CloudCreateAsrRequest request) {
            super(request);
            this.callType = request.callType;
            this.enterpriseId = request.enterpriseId;
            this.mainUniqueId = request.mainUniqueId;
            this.recordFile = request.recordFile;
            this.recordSide = request.recordSide;
            this.recordType = request.recordType;
            this.supportMp3 = request.supportMp3;
            this.uniqueId = request.uniqueId;
        } 

        /**
         * <p>通话类型；1:呼入,2:webcall,4:预览外呼,5:预测外呼,6:主叫外呼,9:内部呼叫</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder callType(Long callType) {
            this.putQueryParameter("CallType", callType);
            this.callType = callType;
            return this;
        }

        /**
         * <p>呼叫中心 id</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7000002</p>
         */
        public Builder enterpriseId(Long enterpriseId) {
            this.putQueryParameter("EnterpriseId", enterpriseId);
            this.enterpriseId = enterpriseId;
            return this;
        }

        /**
         * <p>主通道的唯一标识</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sip-2-1489989807.36601</p>
         */
        public Builder mainUniqueId(String mainUniqueId) {
            this.putQueryParameter("MainUniqueId", mainUniqueId);
            this.mainUniqueId = mainUniqueId;
            return this;
        }

        /**
         * <p>录音文件名；例: 7000002-20170320140327-1581-1500-record-sip-2-148998.366</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7000002-20170320140327-1581-1500-record-sip-2-148998.366</p>
         */
        public Builder recordFile(String recordFile) {
            this.putQueryParameter("RecordFile", recordFile);
            this.recordFile = recordFile;
            return this;
        }

        /**
         * <p>录音通道类型；取值范围：0：混音 1：分线录音时客户侧,2：分线录音时座席侧,3:分线录音时客户侧和座席侧</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder recordSide(Long recordSide) {
            this.putQueryParameter("RecordSide", recordSide);
            this.recordSide = recordSide;
            return this;
        }

        /**
         * <p>语音文件类型,取值：record,voicemail 说明：record是录音， voicemail是留言</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>record</p>
         */
        public Builder recordType(String recordType) {
            this.putQueryParameter("RecordType", recordType);
            this.recordType = recordType;
            return this;
        }

        /**
         * <p>当wav过期时，是否支持使用mp3进行转写；0-不支持（默认）；1-代表支持，如果通话wav过期，则自动使用mp3转写，转写结果中通道类型会被设置为混音类型；混音mp3无法区分两侧，双声道mp3可以区分两侧内容</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder supportMp3(String supportMp3) {
            this.putQueryParameter("SupportMp3", supportMp3);
            this.supportMp3 = supportMp3;
            return this;
        }

        /**
         * <p>从通道的唯一标识</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sip-2-1489989807.36601</p>
         */
        public Builder uniqueId(String uniqueId) {
            this.putQueryParameter("UniqueId", uniqueId);
            this.uniqueId = uniqueId;
            return this;
        }

        @Override
        public CloudCreateAsrRequest build() {
            return new CloudCreateAsrRequest(this);
        } 

    } 

}
