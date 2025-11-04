// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link GetProjectExportJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetProjectExportJobResponseBody</p>
 */
public class GetProjectExportJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ProjectExportJob")
    private ProjectExportJob projectExportJob;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetProjectExportJobResponseBody(Builder builder) {
        this.projectExportJob = builder.projectExportJob;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProjectExportJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return projectExportJob
     */
    public ProjectExportJob getProjectExportJob() {
        return this.projectExportJob;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ProjectExportJob projectExportJob; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetProjectExportJobResponseBody model) {
            this.projectExportJob = model.projectExportJob;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The project export task.</p>
         */
        public Builder projectExportJob(ProjectExportJob projectExportJob) {
            this.projectExportJob = projectExportJob;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>2876-6263-4B75-8F2C-CD0F7FCF</strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetProjectExportJobResponseBody build() {
            return new GetProjectExportJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetProjectExportJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetProjectExportJobResponseBody</p>
     */
    public static class ExportResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProjectUrl")
        private String projectUrl;

        @com.aliyun.core.annotation.NameInMap("Timeline")
        private String timeline;

        private ExportResult(Builder builder) {
            this.projectUrl = builder.projectUrl;
            this.timeline = builder.timeline;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExportResult create() {
            return builder().build();
        }

        /**
         * @return projectUrl
         */
        public String getProjectUrl() {
            return this.projectUrl;
        }

        /**
         * @return timeline
         */
        public String getTimeline() {
            return this.timeline;
        }

        public static final class Builder {
            private String projectUrl; 
            private String timeline; 

            private Builder() {
            } 

            private Builder(ExportResult model) {
                this.projectUrl = model.projectUrl;
                this.timeline = model.timeline;
            } 

            /**
             * <p>The URL of the exported project, which is typically a signed OSS URL. This field is returned when ExportType is AdobePremierePro.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://example-bucket.oss-cn-shanghai.aliyuncs.com/example_prefix/exported_project_1e8c39a502c3436c84f88290cd713bf3.zip?Expires=1750331685&">http://example-bucket.oss-cn-shanghai.aliyuncs.com/example_prefix/exported_project_1e8c39a502c3436c84f88290cd713bf3.zip?Expires=1750331685&amp;</a>....</p>
             */
            public Builder projectUrl(String projectUrl) {
                this.projectUrl = projectUrl;
                return this;
            }

            /**
             * <p>The timeline of the online editing job. This field is returned when ExportType is BaseTimeline. For data structure, see <a href="https://help.aliyun.com/document_detail/198823.html">Timeline</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;VideoTracks&quot;:[{&quot;VideoTrackClips&quot;:[{&quot;Type&quot;:&quot;Video&quot;,&quot;MediaId&quot;:&quot;<strong><strong>4d7cf14dc7b83b0e801c</strong></strong>&quot;,&quot;MediaURL&quot;:&quot;<a href="https://test-bucket.oss-cn-shanghai.aliyuncs.com/test.mp4%22,%22TimelineIn%22:0.0,%22TimelineOut%22:5.0,%22In%22:0.0,%22Out%22:5.0,%22Speed%22:1.0,%22Duration%22:5.0,%22VirginDuration%22:13.334,%22Height%22:1.0,%22Width%22:1.0,%22X%22:0.0,%22Y%22:0.0%7D%5D%7D%5D%7D">https://test-bucket.oss-cn-shanghai.aliyuncs.com/test.mp4&quot;,&quot;TimelineIn&quot;:0.0,&quot;TimelineOut&quot;:5.0,&quot;In&quot;:0.0,&quot;Out&quot;:5.0,&quot;Speed&quot;:1.0,&quot;Duration&quot;:5.0,&quot;VirginDuration&quot;:13.334,&quot;Height&quot;:1.0,&quot;Width&quot;:1.0,&quot;X&quot;:0.0,&quot;Y&quot;:0.0}]}]}</a></p>
             */
            public Builder timeline(String timeline) {
                this.timeline = timeline;
                return this;
            }

            public ExportResult build() {
                return new ExportResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetProjectExportJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetProjectExportJobResponseBody</p>
     */
    public static class ProjectExportJob extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("ExportResult")
        private ExportResult exportResult;

        @com.aliyun.core.annotation.NameInMap("ExportType")
        private String exportType;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        private ProjectExportJob(Builder builder) {
            this.code = builder.code;
            this.exportResult = builder.exportResult;
            this.exportType = builder.exportType;
            this.jobId = builder.jobId;
            this.message = builder.message;
            this.projectId = builder.projectId;
            this.status = builder.status;
            this.userData = builder.userData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProjectExportJob create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return exportResult
         */
        public ExportResult getExportResult() {
            return this.exportResult;
        }

        /**
         * @return exportType
         */
        public String getExportType() {
            return this.exportType;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return userData
         */
        public String getUserData() {
            return this.userData;
        }

        public static final class Builder {
            private String code; 
            private ExportResult exportResult; 
            private String exportType; 
            private String jobId; 
            private String message; 
            private String projectId; 
            private String status; 
            private String userData; 

            private Builder() {
            } 

            private Builder(ProjectExportJob model) {
                this.code = model.code;
                this.exportResult = model.exportResult;
                this.exportType = model.exportType;
                this.jobId = model.jobId;
                this.message = model.message;
                this.projectId = model.projectId;
                this.status = model.status;
                this.userData = model.userData;
            } 

            /**
             * <p>The error code for the failed export task.</p>
             * <blockquote>
             * <p>Notice: Use the error code for troubleshooting.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>InvalidParameter</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The exported data.</p>
             */
            public Builder exportResult(ExportResult exportResult) {
                this.exportResult = exportResult;
                return this;
            }

            /**
             * <p>The export type. Valid values:</p>
             * <ul>
             * <li><strong>BaseTimeline</strong>: exports the timeline.</li>
             * <li><strong>AdobePremierePro</strong>: exports an Adobe Premiere Pro project.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BaseTimeline</p>
             */
            public Builder exportType(String exportType) {
                this.exportType = exportType;
                return this;
            }

            /**
             * <p>The ID of the project export task.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>cdb3e74639973036bc84</strong></strong></p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The error message for the failed export task.</p>
             * <blockquote>
             * <p>Notice: Use the error message for troubleshooting.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>The specified parameter is not valid.</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The ID of the online editing project.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>fddd7748b58bf1d47e95</strong></strong></p>
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The status of the project export task. Valid values:</p>
             * <ul>
             * <li>Init: Initializing</li>
             * <li>Processing</li>
             * <li>Success</li>
             * <li>Failed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The user-defined data in the JSON format.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;NotifyAddress&quot;:&quot;<a href="http://xx.xx.xxx%22,%22Key%22:%22Valuexxx%22%7D">http://xx.xx.xxx&quot;,&quot;Key&quot;:&quot;Valuexxx&quot;}</a></p>
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            public ProjectExportJob build() {
                return new ProjectExportJob(this);
            } 

        } 

    }
}
