// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateRecordRemarkRequest} extends {@link RequestModel}
 *
 * <p>UpdateRecordRemarkRequest</p>
 */
public class UpdateRecordRemarkRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long recordId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    private UpdateRecordRemarkRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.lang = builder.lang;
        this.recordId = builder.recordId;
        this.remark = builder.remark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRecordRemarkRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return recordId
     */
    public Long getRecordId() {
        return this.recordId;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    public static final class Builder extends Request.Builder<UpdateRecordRemarkRequest, Builder> {
        private String clientToken; 
        private String lang; 
        private Long recordId; 
        private String remark; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRecordRemarkRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.lang = request.lang;
            this.recordId = request.recordId;
            this.remark = request.remark;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>6447728c8578e66aacf062d2df4446dc</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
         * </ul>
         * <p>Default value: en.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The ID of the DNS record.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>202991****</p>
         */
        public Builder recordId(Long recordId) {
            this.putQueryParameter("RecordId", recordId);
            this.recordId = recordId;
            return this;
        }

        /**
         * <p>The description of the DNS record.</p>
         * 
         * <strong>example:</strong>
         * <p>test record</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        @Override
        public UpdateRecordRemarkRequest build() {
            return new UpdateRecordRemarkRequest(this);
        } 

    } 

}
