// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aisc20260101.models;

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
 * {@link CreateTargetScanTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateTargetScanTaskRequest</p>
 */
public class CreateTargetScanTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SampleLevel")
    private Long sampleLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetId;

    private CreateTargetScanTaskRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.sampleLevel = builder.sampleLevel;
        this.targetId = builder.targetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTargetScanTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return sampleLevel
     */
    public Long getSampleLevel() {
        return this.sampleLevel;
    }

    /**
     * @return targetId
     */
    public String getTargetId() {
        return this.targetId;
    }

    public static final class Builder extends Request.Builder<CreateTargetScanTaskRequest, Builder> {
        private String lang; 
        private Long sampleLevel; 
        private String targetId; 

        private Builder() {
            super();
        } 

        private Builder(CreateTargetScanTaskRequest request) {
            super(request);
            this.lang = request.lang;
            this.sampleLevel = request.sampleLevel;
            this.targetId = request.targetId;
        } 

        /**
         * <p>The language filter for samples, in locale format (such as zh_CN or en_US, which is internally normalized to zh or en). If this parameter is not specified, samples are selected based on the default language policy combined with general-purpose samples.</p>
         * 
         * <strong>example:</strong>
         * <p>zh_CN</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The detection intensity. The backend derives the corresponding technique level based on this value. If this parameter is not specified, the system falls back to the scan task configuration saved for the target, and then to the system default value.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder sampleLevel(Long sampleLevel) {
            this.putQueryParameter("SampleLevel", sampleLevel);
            this.sampleLevel = sampleLevel;
            return this;
        }

        /**
         * <p>The unique identifier of the scan target. The target must have passed connectivity verification (verifyStatus=verified). Otherwise, a 400 error is returned. You can call TestConnectivity to complete the verification first.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>target-abc123def4567</p>
         */
        public Builder targetId(String targetId) {
            this.putQueryParameter("TargetId", targetId);
            this.targetId = targetId;
            return this;
        }

        @Override
        public CreateTargetScanTaskRequest build() {
            return new CreateTargetScanTaskRequest(this);
        } 

    } 

}
