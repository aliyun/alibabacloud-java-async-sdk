// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link CheckRecallManagementServiceRequest} extends {@link RequestModel}
 *
 * <p>CheckRecallManagementServiceRequest</p>
 */
public class CheckRecallManagementServiceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("RecallManagementServiceId")
    private String recallManagementServiceId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ContextParams")
    private java.util.Map<String, ?> contextParams;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExposureList")
    private java.util.List<String> exposureList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RecallManagementServiceVersionId")
    private String recallManagementServiceVersionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Recalls")
    private java.util.Map<String, ?> recalls;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RetainFields")
    private java.util.List<String> retainFields;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Uid")
    private String uid;

    private CheckRecallManagementServiceRequest(Builder builder) {
        super(builder);
        this.recallManagementServiceId = builder.recallManagementServiceId;
        this.regionId = builder.regionId;
        this.contextParams = builder.contextParams;
        this.exposureList = builder.exposureList;
        this.instanceId = builder.instanceId;
        this.recallManagementServiceVersionId = builder.recallManagementServiceVersionId;
        this.recalls = builder.recalls;
        this.retainFields = builder.retainFields;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckRecallManagementServiceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return recallManagementServiceId
     */
    public String getRecallManagementServiceId() {
        return this.recallManagementServiceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return contextParams
     */
    public java.util.Map<String, ?> getContextParams() {
        return this.contextParams;
    }

    /**
     * @return exposureList
     */
    public java.util.List<String> getExposureList() {
        return this.exposureList;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return recallManagementServiceVersionId
     */
    public String getRecallManagementServiceVersionId() {
        return this.recallManagementServiceVersionId;
    }

    /**
     * @return recalls
     */
    public java.util.Map<String, ?> getRecalls() {
        return this.recalls;
    }

    /**
     * @return retainFields
     */
    public java.util.List<String> getRetainFields() {
        return this.retainFields;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<CheckRecallManagementServiceRequest, Builder> {
        private String recallManagementServiceId; 
        private String regionId; 
        private java.util.Map<String, ?> contextParams; 
        private java.util.List<String> exposureList; 
        private String instanceId; 
        private String recallManagementServiceVersionId; 
        private java.util.Map<String, ?> recalls; 
        private java.util.List<String> retainFields; 
        private String uid; 

        private Builder() {
            super();
        } 

        private Builder(CheckRecallManagementServiceRequest request) {
            super(request);
            this.recallManagementServiceId = request.recallManagementServiceId;
            this.regionId = request.regionId;
            this.contextParams = request.contextParams;
            this.exposureList = request.exposureList;
            this.instanceId = request.instanceId;
            this.recallManagementServiceVersionId = request.recallManagementServiceVersionId;
            this.recalls = request.recalls;
            this.retainFields = request.retainFields;
            this.uid = request.uid;
        } 

        /**
         * <p>The recall management service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder recallManagementServiceId(String recallManagementServiceId) {
            this.putPathParameter("RecallManagementServiceId", recallManagementServiceId);
            this.recallManagementServiceId = recallManagementServiceId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The context parameters.</p>
         */
        public Builder contextParams(java.util.Map<String, ?> contextParams) {
            this.putBodyParameter("ContextParams", contextParams);
            this.contextParams = contextParams;
            return this;
        }

        /**
         * <p>The exposure list.</p>
         */
        public Builder exposureList(java.util.List<String> exposureList) {
            this.putBodyParameter("ExposureList", exposureList);
            this.exposureList = exposureList;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>learn-pairec-xxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The recall management service version ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder recallManagementServiceVersionId(String recallManagementServiceVersionId) {
            this.putBodyParameter("RecallManagementServiceVersionId", recallManagementServiceVersionId);
            this.recallManagementServiceVersionId = recallManagementServiceVersionId;
            return this;
        }

        /**
         * <p>The recall data details.</p>
         */
        public Builder recalls(java.util.Map<String, ?> recalls) {
            this.putBodyParameter("Recalls", recalls);
            this.recalls = recalls;
            return this;
        }

        /**
         * <p>The retained fields.</p>
         */
        public Builder retainFields(java.util.List<String> retainFields) {
            this.putBodyParameter("RetainFields", retainFields);
            this.retainFields = retainFields;
            return this;
        }

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        public Builder uid(String uid) {
            this.putBodyParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public CheckRecallManagementServiceRequest build() {
            return new CheckRecallManagementServiceRequest(this);
        } 

    } 

}
