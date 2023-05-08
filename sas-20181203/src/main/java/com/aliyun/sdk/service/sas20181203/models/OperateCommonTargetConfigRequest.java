// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OperateCommonTargetConfigRequest} extends {@link RequestModel}
 *
 * <p>OperateCommonTargetConfigRequest</p>
 */
public class OperateCommonTargetConfigRequest extends Request {
    @Query
    @NameInMap("FieldName")
    private String fieldName;

    @Query
    @NameInMap("FieldValue")
    private String fieldValue;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("TargetOperations")
    @Validation(required = true)
    private String targetOperations;

    @Query
    @NameInMap("TargetType")
    private String targetType;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private OperateCommonTargetConfigRequest(Builder builder) {
        super(builder);
        this.fieldName = builder.fieldName;
        this.fieldValue = builder.fieldValue;
        this.sourceIp = builder.sourceIp;
        this.targetOperations = builder.targetOperations;
        this.targetType = builder.targetType;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperateCommonTargetConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fieldName
     */
    public String getFieldName() {
        return this.fieldName;
    }

    /**
     * @return fieldValue
     */
    public String getFieldValue() {
        return this.fieldValue;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return targetOperations
     */
    public String getTargetOperations() {
        return this.targetOperations;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<OperateCommonTargetConfigRequest, Builder> {
        private String fieldName; 
        private String fieldValue; 
        private String sourceIp; 
        private String targetOperations; 
        private String targetType; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(OperateCommonTargetConfigRequest request) {
            super(request);
            this.fieldName = request.fieldName;
            this.fieldValue = request.fieldValue;
            this.sourceIp = request.sourceIp;
            this.targetOperations = request.targetOperations;
            this.targetType = request.targetType;
            this.type = request.type;
        } 

        /**
         * The name of the image repository or the namespace of the image repository.
         */
        public Builder fieldName(String fieldName) {
            this.putQueryParameter("FieldName", fieldName);
            this.fieldName = fieldName;
            return this;
        }

        /**
         * The data returned.
         */
        public Builder fieldValue(String fieldValue) {
            this.putQueryParameter("FieldValue", fieldValue);
            this.fieldValue = fieldValue;
            return this;
        }

        /**
         * The type of the feature. Valid values:
         * <p>
         * 
         * *   **alidetect-scan-enable**: local file detection
         * *   **ACTION-TRIAL-PERMISSION**: data delivery of ActionTrail
         * *   **alidetect**: local file detection engine
         * *   **container\_prevent\_escape**: container escape prevention
         * *   **image\_repo**: repository image scan
         * *   **proc\_filter\_switch**: log filtering
         * *   **agentless**: agentless detection
         * *   **rasp**: application protection
         * *   **sensitiveFile**: sensitive file detection
         * *   **aliscriptengine**: in-depth detection engine
         * *   **containerNetwork**: container network visualization
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * The type of the image. Valid values:
         * <p>
         * 
         * *   **repoName**: the name of the image repository
         * *   **repoNamespace**: the namespace of the image repository
         */
        public Builder targetOperations(String targetOperations) {
            this.putQueryParameter("TargetOperations", targetOperations);
            this.targetOperations = targetOperations;
            return this;
        }

        /**
         * The configuration of proactive defense for your server. The value includes the following fields:
         * <p>
         * 
         * *   **targetType**: specifies the dimension from which you manage proactive defense. UUIDs are supported. Set the value to **uuid**.
         * *   **target**: specifies the UUID of the server for which you want to configure proactive defense.
         * *   **flag**: specifies whether to enable or disable proactive defense for your server. Valid values are **add** and **del**. The value add indicates that proactive defense will be enabled for your server. The value del indicates that proactive defense will be disabled for your server.
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        /**
         * The dimension based on which you want to configure the feature. Valid values:
         * <p>
         * 
         * *   **uuid**: the UUID of the server
         * *   **Cluster**: the ID of the cluster
         * *   **image_repo**: the name of the image repository
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public OperateCommonTargetConfigRequest build() {
            return new OperateCommonTargetConfigRequest(this);
        } 

    } 

}
