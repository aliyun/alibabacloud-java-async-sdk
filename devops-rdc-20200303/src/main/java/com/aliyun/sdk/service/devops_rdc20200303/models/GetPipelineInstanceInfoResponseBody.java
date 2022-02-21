// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPipelineInstanceInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetPipelineInstanceInfoResponseBody</p>
 */
public class GetPipelineInstanceInfoResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("Object")
    private Object object;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetPipelineInstanceInfoResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.object = builder.object;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPipelineInstanceInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return object
     */
    public Object getObject() {
        return this.object;
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
        private String errorCode; 
        private String errorMessage; 
        private Object object; 
        private String requestId; 
        private Boolean success; 

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * Object.
         */
        public Builder object(Object object) {
            this.object = object;
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

        public GetPipelineInstanceInfoResponseBody build() {
            return new GetPipelineInstanceInfoResponseBody(this);
        } 

    } 

    public static class Object extends TeaModel {
        @NameInMap("DockerImages")
        private java.util.List < String > dockerImages;

        @NameInMap("EmployeeId")
        private String employeeId;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("PackageDownloadUrls")
        private java.util.List < String > packageDownloadUrls;

        @NameInMap("Sources")
        private String sources;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("Status")
        private String status;

        private Object(Builder builder) {
            this.dockerImages = builder.dockerImages;
            this.employeeId = builder.employeeId;
            this.endTime = builder.endTime;
            this.packageDownloadUrls = builder.packageDownloadUrls;
            this.sources = builder.sources;
            this.startTime = builder.startTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Object create() {
            return builder().build();
        }

        /**
         * @return dockerImages
         */
        public java.util.List < String > getDockerImages() {
            return this.dockerImages;
        }

        /**
         * @return employeeId
         */
        public String getEmployeeId() {
            return this.employeeId;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return packageDownloadUrls
         */
        public java.util.List < String > getPackageDownloadUrls() {
            return this.packageDownloadUrls;
        }

        /**
         * @return sources
         */
        public String getSources() {
            return this.sources;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List < String > dockerImages; 
            private String employeeId; 
            private Long endTime; 
            private java.util.List < String > packageDownloadUrls; 
            private String sources; 
            private Long startTime; 
            private String status; 

            /**
             * DockerImages.
             */
            public Builder dockerImages(java.util.List < String > dockerImages) {
                this.dockerImages = dockerImages;
                return this;
            }

            /**
             * EmployeeId.
             */
            public Builder employeeId(String employeeId) {
                this.employeeId = employeeId;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * PackageDownloadUrls.
             */
            public Builder packageDownloadUrls(java.util.List < String > packageDownloadUrls) {
                this.packageDownloadUrls = packageDownloadUrls;
                return this;
            }

            /**
             * Sources.
             */
            public Builder sources(String sources) {
                this.sources = sources;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Object build() {
                return new Object(this);
            } 

        } 

    }
}
