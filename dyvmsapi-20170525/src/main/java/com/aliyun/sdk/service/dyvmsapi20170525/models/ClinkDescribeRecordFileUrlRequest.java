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
 * {@link ClinkDescribeRecordFileUrlRequest} extends {@link RequestModel}
 *
 * <p>ClinkDescribeRecordFileUrlRequest</p>
 */
public class ClinkDescribeRecordFileUrlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Download")
    private Long download;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnterpriseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long enterpriseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MainUniqueId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mainUniqueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordSide")
    private Long recordSide;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordType")
    private String recordType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Timeout")
    private Long timeout;

    private ClinkDescribeRecordFileUrlRequest(Builder builder) {
        super(builder);
        this.download = builder.download;
        this.enterpriseId = builder.enterpriseId;
        this.mainUniqueId = builder.mainUniqueId;
        this.ownerId = builder.ownerId;
        this.recordSide = builder.recordSide;
        this.recordType = builder.recordType;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.timeout = builder.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClinkDescribeRecordFileUrlRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return mainUniqueId
     */
    public String getMainUniqueId() {
        return this.mainUniqueId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return timeout
     */
    public Long getTimeout() {
        return this.timeout;
    }

    public static final class Builder extends Request.Builder<ClinkDescribeRecordFileUrlRequest, Builder> {
        private Long download; 
        private Long enterpriseId; 
        private String mainUniqueId; 
        private Long ownerId; 
        private Long recordSide; 
        private String recordType; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Long timeout; 

        private Builder() {
            super();
        } 

        private Builder(ClinkDescribeRecordFileUrlRequest request) {
            super(request);
            this.download = request.download;
            this.enterpriseId = request.enterpriseId;
            this.mainUniqueId = request.mainUniqueId;
            this.ownerId = request.ownerId;
            this.recordSide = request.recordSide;
            this.recordType = request.recordType;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.timeout = request.timeout;
        } 

        /**
         * <p>０表示试听，１为下载，默认为1</p>
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
         * <p>8004970</p>
         */
        public Builder enterpriseId(Long enterpriseId) {
            this.putQueryParameter("EnterpriseId", enterpriseId);
            this.enterpriseId = enterpriseId;
            return this;
        }

        /**
         * <p>通话记录唯一标识</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>uniq_1-162046xxxx.12</p>
         */
        public Builder mainUniqueId(String mainUniqueId) {
            this.putQueryParameter("MainUniqueId", mainUniqueId);
            this.mainUniqueId = mainUniqueId;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>不传递获取mp3格式录音，传递时获取wav格式录音。1：双轨录音客户侧，2：双轨录音座席侧，3：两侧合成录音</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder recordSide(Long recordSide) {
            this.putQueryParameter("RecordSide", recordSide);
            this.recordSide = recordSide;
            return this;
        }

        /**
         * <p>录音类型。 &quot;record&quot;: 通话录音，&quot;voicemail&quot;: 留言。默认值为 &quot;record&quot;</p>
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
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>获取录音地址超时时长，单位为秒，默认为一小时，范围在一到二十四小时。</p>
         * 
         * <strong>example:</strong>
         * <p>67</p>
         */
        public Builder timeout(Long timeout) {
            this.putQueryParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        @Override
        public ClinkDescribeRecordFileUrlRequest build() {
            return new ClinkDescribeRecordFileUrlRequest(this);
        } 

    } 

}
