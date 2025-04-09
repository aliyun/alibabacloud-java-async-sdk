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
 * {@link GetAnnotationMissionTagInfoListResponseBody} extends {@link TeaModel}
 *
 * <p>GetAnnotationMissionTagInfoListResponseBody</p>
 */
public class GetAnnotationMissionTagInfoListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetAnnotationMissionTagInfoListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAnnotationMissionTagInfoListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetAnnotationMissionTagInfoListResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetAnnotationMissionTagInfoListResponseBody build() {
            return new GetAnnotationMissionTagInfoListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAnnotationMissionTagInfoListResponseBody} extends {@link TeaModel}
     *
     * <p>GetAnnotationMissionTagInfoListResponseBody</p>
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
             * AnnotationMissionTagInfoId.
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
    /**
     * 
     * {@link GetAnnotationMissionTagInfoListResponseBody} extends {@link TeaModel}
     *
     * <p>GetAnnotationMissionTagInfoListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AnnotationMissionTagInfoList")
        private java.util.List<AnnotationMissionTagInfoList> annotationMissionTagInfoList;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private Data(Builder builder) {
            this.annotationMissionTagInfoList = builder.annotationMissionTagInfoList;
            this.message = builder.message;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return annotationMissionTagInfoList
         */
        public java.util.List<AnnotationMissionTagInfoList> getAnnotationMissionTagInfoList() {
            return this.annotationMissionTagInfoList;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private java.util.List<AnnotationMissionTagInfoList> annotationMissionTagInfoList; 
            private String message; 
            private Boolean success; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.annotationMissionTagInfoList = model.annotationMissionTagInfoList;
                this.message = model.message;
                this.success = model.success;
            } 

            /**
             * AnnotationMissionTagInfoList.
             */
            public Builder annotationMissionTagInfoList(java.util.List<AnnotationMissionTagInfoList> annotationMissionTagInfoList) {
                this.annotationMissionTagInfoList = annotationMissionTagInfoList;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
