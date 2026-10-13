// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link ModifyAnnotationMissionRequest} extends {@link RequestModel}
 *
 * <p>ModifyAnnotationMissionRequest</p>
 */
public class ModifyAnnotationMissionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AnnotationMissionId")
    private String annotationMissionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AnnotationMissionName")
    private String annotationMissionName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AnnotationStatus")
    private Integer annotationStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Delete")
    private Boolean delete;

    private ModifyAnnotationMissionRequest(Builder builder) {
        super(builder);
        this.annotationMissionId = builder.annotationMissionId;
        this.annotationMissionName = builder.annotationMissionName;
        this.annotationStatus = builder.annotationStatus;
        this.delete = builder.delete;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAnnotationMissionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return annotationMissionId
     */
    public String getAnnotationMissionId() {
        return this.annotationMissionId;
    }

    /**
     * @return annotationMissionName
     */
    public String getAnnotationMissionName() {
        return this.annotationMissionName;
    }

    /**
     * @return annotationStatus
     */
    public Integer getAnnotationStatus() {
        return this.annotationStatus;
    }

    /**
     * @return delete
     */
    public Boolean getDelete() {
        return this.delete;
    }

    public static final class Builder extends Request.Builder<ModifyAnnotationMissionRequest, Builder> {
        private String annotationMissionId; 
        private String annotationMissionName; 
        private Integer annotationStatus; 
        private Boolean delete; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAnnotationMissionRequest request) {
            super(request);
            this.annotationMissionId = request.annotationMissionId;
            this.annotationMissionName = request.annotationMissionName;
            this.annotationStatus = request.annotationStatus;
            this.delete = request.delete;
        } 

        /**
         * <p>The annotation task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c88cc004-de69-4eee-aa5f-2efed533a54e</p>
         */
        public Builder annotationMissionId(String annotationMissionId) {
            this.putQueryParameter("AnnotationMissionId", annotationMissionId);
            this.annotationMissionId = annotationMissionId;
            return this;
        }

        /**
         * <p>The annotation task name.</p>
         * 
         * <strong>example:</strong>
         * <p>AskAboutSellingCar-AnnotationTask-20230506-112934</p>
         */
        public Builder annotationMissionName(String annotationMissionName) {
            this.putQueryParameter("AnnotationMissionName", annotationMissionName);
            this.annotationMissionName = annotationMissionName;
            return this;
        }

        /**
         * <p>The annotation task status.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder annotationStatus(Integer annotationStatus) {
            this.putQueryParameter("AnnotationStatus", annotationStatus);
            this.annotationStatus = annotationStatus;
            return this;
        }

        /**
         * <p>Specifies whether to delete the task.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder delete(Boolean delete) {
            this.putQueryParameter("Delete", delete);
            this.delete = delete;
            return this;
        }

        @Override
        public ModifyAnnotationMissionRequest build() {
            return new ModifyAnnotationMissionRequest(this);
        } 

    } 

}
