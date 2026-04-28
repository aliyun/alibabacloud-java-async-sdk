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
 * {@link CloudGetRecordUrlRequest} extends {@link RequestModel}
 *
 * <p>CloudGetRecordUrlRequest</p>
 */
public class CloudGetRecordUrlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallType")
    private Long callType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Download")
    private Long download;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnterpriseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long enterpriseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordFile")
    @com.aliyun.core.annotation.Validation(required = true)
    private String recordFile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordFormat")
    private Long recordFormat;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordSide")
    private Long recordSide;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordType")
    private String recordType;

    private CloudGetRecordUrlRequest(Builder builder) {
        super(builder);
        this.callType = builder.callType;
        this.download = builder.download;
        this.enterpriseId = builder.enterpriseId;
        this.recordFile = builder.recordFile;
        this.recordFormat = builder.recordFormat;
        this.recordSide = builder.recordSide;
        this.recordType = builder.recordType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudGetRecordUrlRequest create() {
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
     * @return download
     */
    public Long getDownload() {
        return this.download;
    }

    /**
     * @return enterpriseId
     */
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    /**
     * @return recordFile
     */
    public String getRecordFile() {
        return this.recordFile;
    }

    /**
     * @return recordFormat
     */
    public Long getRecordFormat() {
        return this.recordFormat;
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

    public static final class Builder extends Request.Builder<CloudGetRecordUrlRequest, Builder> {
        private Long callType; 
        private Long download; 
        private Long enterpriseId; 
        private String recordFile; 
        private Long recordFormat; 
        private Long recordSide; 
        private String recordType; 

        private Builder() {
            super();
        } 

        private Builder(CloudGetRecordUrlRequest request) {
            super(request);
            this.callType = request.callType;
            this.download = request.download;
            this.enterpriseId = request.enterpriseId;
            this.recordFile = request.recordFile;
            this.recordFormat = request.recordFormat;
            this.recordSide = request.recordSide;
            this.recordType = request.recordType;
        } 

        /**
         * <p>呼叫类型；说明：开启分线录音时，获取客户侧或座席侧录音需要，recordFormat=1时有效，recordFormat=0时忽略。取值范围：1,2,4,5（数字含义：呼入,webcall,预览外呼,预测外呼）</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder callType(Long callType) {
            this.putQueryParameter("CallType", callType);
            this.callType = callType;
            return this;
        }

        /**
         * <p>是否下载；１为下载，空或０表示试听</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder download(Long download) {
            this.putQueryParameter("Download", download);
            this.download = download;
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
         * <p>录音文件名；如7000101-20160815140025-01087120766-01087120766--record-sip-1-1471240825.87</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7000101-20160815140025-01087120766-01087120766--record-sip-1-1471240825.87</p>
         */
        public Builder recordFile(String recordFile) {
            this.putQueryParameter("RecordFile", recordFile);
            this.recordFile = recordFile;
            return this;
        }

        /**
         * <p>录音文件类型；取值说明：0为mp3，1为wav，默认为mp3类型</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder recordFormat(Long recordFormat) {
            this.putQueryParameter("RecordFormat", recordFormat);
            this.recordFormat = recordFormat;
            return this;
        }

        /**
         * <p>分线录音录音侧；说明：开启分线录音时，获取客户侧或座席侧录音需要，recordFormat=1时有效，recordFormat=0时忽略。取值范围：1,2 (数字含义：客户侧，座席侧)recordSide不为空时，callType必选</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder recordSide(Long recordSide) {
            this.putQueryParameter("RecordSide", recordSide);
            this.recordSide = recordSide;
            return this;
        }

        /**
         * <p>录音类型，不填可根据 recordFile 解析；record:录音voicemail:留言tsi:彩铃、当开启号码录音状态识别，发起预览外呼，客户号码是手机且客户未接听时返回该地址 rasr:语音机器人客户侧录音 transfer:转接consult:咨询threeway:三方</p>
         * 
         * <strong>example:</strong>
         * <p>record</p>
         */
        public Builder recordType(String recordType) {
            this.putQueryParameter("RecordType", recordType);
            this.recordType = recordType;
            return this;
        }

        @Override
        public CloudGetRecordUrlRequest build() {
            return new CloudGetRecordUrlRequest(this);
        } 

    } 

}
