// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link ModifyQosRuleRequest} extends {@link RequestModel}
 *
 * <p>ModifyQosRuleRequest</p>
 */
public class ModifyQosRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Download")
    private Integer download;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QosRuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String qosRuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QosRuleName")
    private String qosRuleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Upload")
    private Integer upload;

    private ModifyQosRuleRequest(Builder builder) {
        super(builder);
        this.download = builder.download;
        this.qosRuleId = builder.qosRuleId;
        this.qosRuleName = builder.qosRuleName;
        this.upload = builder.upload;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyQosRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return download
     */
    public Integer getDownload() {
        return this.download;
    }

    /**
     * @return qosRuleId
     */
    public String getQosRuleId() {
        return this.qosRuleId;
    }

    /**
     * @return qosRuleName
     */
    public String getQosRuleName() {
        return this.qosRuleName;
    }

    /**
     * @return upload
     */
    public Integer getUpload() {
        return this.upload;
    }

    public static final class Builder extends Request.Builder<ModifyQosRuleRequest, Builder> {
        private Integer download; 
        private String qosRuleId; 
        private String qosRuleName; 
        private Integer upload; 

        private Builder() {
            super();
        } 

        private Builder(ModifyQosRuleRequest request) {
            super(request);
            this.download = request.download;
            this.qosRuleId = request.qosRuleId;
            this.qosRuleName = request.qosRuleName;
            this.upload = request.upload;
        } 

        /**
         * Download.
         */
        public Builder download(Integer download) {
            this.putQueryParameter("Download", download);
            this.download = download;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>qos-5605u0gelk200****</p>
         */
        public Builder qosRuleId(String qosRuleId) {
            this.putQueryParameter("QosRuleId", qosRuleId);
            this.qosRuleId = qosRuleId;
            return this;
        }

        /**
         * QosRuleName.
         */
        public Builder qosRuleName(String qosRuleName) {
            this.putQueryParameter("QosRuleName", qosRuleName);
            this.qosRuleName = qosRuleName;
            return this;
        }

        /**
         * Upload.
         */
        public Builder upload(Integer upload) {
            this.putQueryParameter("Upload", upload);
            this.upload = upload;
            return this;
        }

        @Override
        public ModifyQosRuleRequest build() {
            return new ModifyQosRuleRequest(this);
        } 

    } 

}
