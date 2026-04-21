// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link UpdateAutoDisposeRecordRequest} extends {@link RequestModel}
 *
 * <p>UpdateAutoDisposeRecordRequest</p>
 */
public class UpdateAutoDisposeRecordRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoDecisionConclusion")
    private String autoDecisionConclusion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoDecisionEntityList")
    private String autoDecisionEntityList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoDecisionResult")
    private String autoDecisionResult;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoDisposeRecordId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String autoDisposeRecordId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    @com.aliyun.core.annotation.Validation(required = true)
    private String lang;

    private UpdateAutoDisposeRecordRequest(Builder builder) {
        super(builder);
        this.autoDecisionConclusion = builder.autoDecisionConclusion;
        this.autoDecisionEntityList = builder.autoDecisionEntityList;
        this.autoDecisionResult = builder.autoDecisionResult;
        this.autoDisposeRecordId = builder.autoDisposeRecordId;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAutoDisposeRecordRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoDecisionConclusion
     */
    public String getAutoDecisionConclusion() {
        return this.autoDecisionConclusion;
    }

    /**
     * @return autoDecisionEntityList
     */
    public String getAutoDecisionEntityList() {
        return this.autoDecisionEntityList;
    }

    /**
     * @return autoDecisionResult
     */
    public String getAutoDecisionResult() {
        return this.autoDecisionResult;
    }

    /**
     * @return autoDisposeRecordId
     */
    public String getAutoDisposeRecordId() {
        return this.autoDisposeRecordId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<UpdateAutoDisposeRecordRequest, Builder> {
        private String autoDecisionConclusion; 
        private String autoDecisionEntityList; 
        private String autoDecisionResult; 
        private String autoDisposeRecordId; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAutoDisposeRecordRequest request) {
            super(request);
            this.autoDecisionConclusion = request.autoDecisionConclusion;
            this.autoDecisionEntityList = request.autoDecisionEntityList;
            this.autoDecisionResult = request.autoDecisionResult;
            this.autoDisposeRecordId = request.autoDisposeRecordId;
            this.lang = request.lang;
        } 

        /**
         * AutoDecisionConclusion.
         */
        public Builder autoDecisionConclusion(String autoDecisionConclusion) {
            this.putBodyParameter("AutoDecisionConclusion", autoDecisionConclusion);
            this.autoDecisionConclusion = autoDecisionConclusion;
            return this;
        }

        /**
         * AutoDecisionEntityList.
         */
        public Builder autoDecisionEntityList(String autoDecisionEntityList) {
            this.putBodyParameter("AutoDecisionEntityList", autoDecisionEntityList);
            this.autoDecisionEntityList = autoDecisionEntityList;
            return this;
        }

        /**
         * AutoDecisionResult.
         */
        public Builder autoDecisionResult(String autoDecisionResult) {
            this.putBodyParameter("AutoDecisionResult", autoDecisionResult);
            this.autoDecisionResult = autoDecisionResult;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4227e0cdc4b7efb45ce7ff09758****</p>
         */
        public Builder autoDisposeRecordId(String autoDisposeRecordId) {
            this.putBodyParameter("AutoDisposeRecordId", autoDisposeRecordId);
            this.autoDisposeRecordId = autoDisposeRecordId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        @Override
        public UpdateAutoDisposeRecordRequest build() {
            return new UpdateAutoDisposeRecordRequest(this);
        } 

    } 

}
