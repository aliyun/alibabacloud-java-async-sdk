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
 * {@link SaveAnnotationMissionTagInfoListRequest} extends {@link RequestModel}
 *
 * <p>SaveAnnotationMissionTagInfoListRequest</p>
 */
public class SaveAnnotationMissionTagInfoListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AnnotationMissionTagInfoList")
    private java.util.List<AnnotationMissionTagInfoList> annotationMissionTagInfoList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AnnotationMissionTagInfoListJsonString")
    private String annotationMissionTagInfoListJsonString;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Reset")
    private Boolean reset;

    private SaveAnnotationMissionTagInfoListRequest(Builder builder) {
        super(builder);
        this.annotationMissionTagInfoList = builder.annotationMissionTagInfoList;
        this.annotationMissionTagInfoListJsonString = builder.annotationMissionTagInfoListJsonString;
        this.instanceId = builder.instanceId;
        this.reset = builder.reset;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveAnnotationMissionTagInfoListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return annotationMissionTagInfoList
     */
    public java.util.List<AnnotationMissionTagInfoList> getAnnotationMissionTagInfoList() {
        return this.annotationMissionTagInfoList;
    }

    /**
     * @return annotationMissionTagInfoListJsonString
     */
    public String getAnnotationMissionTagInfoListJsonString() {
        return this.annotationMissionTagInfoListJsonString;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return reset
     */
    public Boolean getReset() {
        return this.reset;
    }

    public static final class Builder extends Request.Builder<SaveAnnotationMissionTagInfoListRequest, Builder> {
        private java.util.List<AnnotationMissionTagInfoList> annotationMissionTagInfoList; 
        private String annotationMissionTagInfoListJsonString; 
        private String instanceId; 
        private Boolean reset; 

        private Builder() {
            super();
        } 

        private Builder(SaveAnnotationMissionTagInfoListRequest request) {
            super(request);
            this.annotationMissionTagInfoList = request.annotationMissionTagInfoList;
            this.annotationMissionTagInfoListJsonString = request.annotationMissionTagInfoListJsonString;
            this.instanceId = request.instanceId;
            this.reset = request.reset;
        } 

        /**
         * AnnotationMissionTagInfoList.
         */
        public Builder annotationMissionTagInfoList(java.util.List<AnnotationMissionTagInfoList> annotationMissionTagInfoList) {
            this.putQueryParameter("AnnotationMissionTagInfoList", annotationMissionTagInfoList);
            this.annotationMissionTagInfoList = annotationMissionTagInfoList;
            return this;
        }

        /**
         * AnnotationMissionTagInfoListJsonString.
         */
        public Builder annotationMissionTagInfoListJsonString(String annotationMissionTagInfoListJsonString) {
            this.putQueryParameter("AnnotationMissionTagInfoListJsonString", annotationMissionTagInfoListJsonString);
            this.annotationMissionTagInfoListJsonString = annotationMissionTagInfoListJsonString;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Reset.
         */
        public Builder reset(Boolean reset) {
            this.putQueryParameter("Reset", reset);
            this.reset = reset;
            return this;
        }

        @Override
        public SaveAnnotationMissionTagInfoListRequest build() {
            return new SaveAnnotationMissionTagInfoListRequest(this);
        } 

    } 

    /**
     * 
     * {@link SaveAnnotationMissionTagInfoListRequest} extends {@link TeaModel}
     *
     * <p>SaveAnnotationMissionTagInfoListRequest</p>
     */
    public static class AnnotationMissionTagInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AnnotationMissionTagInfoDescription")
        private String annotationMissionTagInfoDescription;

        @com.aliyun.core.annotation.NameInMap("AnnotationMissionTagInfoId")
        private String annotationMissionTagInfoId;

        @com.aliyun.core.annotation.NameInMap("AnnotationMissionTagInfoName")
        private String annotationMissionTagInfoName;

        @com.aliyun.core.annotation.NameInMap("Delete")
        private Boolean delete;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        private AnnotationMissionTagInfoList(Builder builder) {
            this.annotationMissionTagInfoDescription = builder.annotationMissionTagInfoDescription;
            this.annotationMissionTagInfoId = builder.annotationMissionTagInfoId;
            this.annotationMissionTagInfoName = builder.annotationMissionTagInfoName;
            this.delete = builder.delete;
            this.instanceId = builder.instanceId;
            this.tenantId = builder.tenantId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AnnotationMissionTagInfoList create() {
            return builder().build();
        }

        /**
         * @return annotationMissionTagInfoDescription
         */
        public String getAnnotationMissionTagInfoDescription() {
            return this.annotationMissionTagInfoDescription;
        }

        /**
         * @return annotationMissionTagInfoId
         */
        public String getAnnotationMissionTagInfoId() {
            return this.annotationMissionTagInfoId;
        }

        /**
         * @return annotationMissionTagInfoName
         */
        public String getAnnotationMissionTagInfoName() {
            return this.annotationMissionTagInfoName;
        }

        /**
         * @return delete
         */
        public Boolean getDelete() {
            return this.delete;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        public static final class Builder {
            private String annotationMissionTagInfoDescription; 
            private String annotationMissionTagInfoId; 
            private String annotationMissionTagInfoName; 
            private Boolean delete; 
            private String instanceId; 
            private String tenantId; 

            private Builder() {
            } 

            private Builder(AnnotationMissionTagInfoList model) {
                this.annotationMissionTagInfoDescription = model.annotationMissionTagInfoDescription;
                this.annotationMissionTagInfoId = model.annotationMissionTagInfoId;
                this.annotationMissionTagInfoName = model.annotationMissionTagInfoName;
                this.delete = model.delete;
                this.instanceId = model.instanceId;
                this.tenantId = model.tenantId;
            } 

            /**
             * AnnotationMissionTagInfoDescription.
             */
            public Builder annotationMissionTagInfoDescription(String annotationMissionTagInfoDescription) {
                this.annotationMissionTagInfoDescription = annotationMissionTagInfoDescription;
                return this;
            }

            /**
             * <p>tag id</p>
             */
            public Builder annotationMissionTagInfoId(String annotationMissionTagInfoId) {
                this.annotationMissionTagInfoId = annotationMissionTagInfoId;
                return this;
            }

            /**
             * AnnotationMissionTagInfoName.
             */
            public Builder annotationMissionTagInfoName(String annotationMissionTagInfoName) {
                this.annotationMissionTagInfoName = annotationMissionTagInfoName;
                return this;
            }

            /**
             * Delete.
             */
            public Builder delete(Boolean delete) {
                this.delete = delete;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * TenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            public AnnotationMissionTagInfoList build() {
                return new AnnotationMissionTagInfoList(this);
            } 

        } 

    }
}
