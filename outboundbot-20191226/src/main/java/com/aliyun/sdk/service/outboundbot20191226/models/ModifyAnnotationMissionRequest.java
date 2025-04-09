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
         * AnnotationMissionId.
         */
        public Builder annotationMissionId(String annotationMissionId) {
            this.putQueryParameter("AnnotationMissionId", annotationMissionId);
            this.annotationMissionId = annotationMissionId;
            return this;
        }

        /**
         * AnnotationMissionName.
         */
        public Builder annotationMissionName(String annotationMissionName) {
            this.putQueryParameter("AnnotationMissionName", annotationMissionName);
            this.annotationMissionName = annotationMissionName;
            return this;
        }

        /**
         * AnnotationStatus.
         */
        public Builder annotationStatus(Integer annotationStatus) {
            this.putQueryParameter("AnnotationStatus", annotationStatus);
            this.annotationStatus = annotationStatus;
            return this;
        }

        /**
         * Delete.
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
