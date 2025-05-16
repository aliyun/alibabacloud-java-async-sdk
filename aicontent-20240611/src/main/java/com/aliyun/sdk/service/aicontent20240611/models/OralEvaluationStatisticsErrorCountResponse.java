// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link OralEvaluationStatisticsErrorCountResponse} extends {@link TeaModel}
 *
 * <p>OralEvaluationStatisticsErrorCountResponse</p>
 */
public class OralEvaluationStatisticsErrorCountResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("ProjectData")
    private ProjectData projectData;

    @com.aliyun.core.annotation.NameInMap("projectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    private OralEvaluationStatisticsErrorCountResponse(BuilderImpl builder) {
        super(builder);
        this.projectData = builder.projectData;
        this.projectId = builder.projectId;
    }

    public static OralEvaluationStatisticsErrorCountResponse create() {
        return new BuilderImpl().build();
    }

@Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return projectData
     */
    public ProjectData getProjectData() {
        return this.projectData;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    public interface Builder extends Response.Builder<OralEvaluationStatisticsErrorCountResponse, Builder> {

        Builder projectData(ProjectData projectData);

        Builder projectId(String projectId);

        @Override
        OralEvaluationStatisticsErrorCountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OralEvaluationStatisticsErrorCountResponse, Builder>
            implements Builder {
        private ProjectData projectData; 
        private String projectId; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OralEvaluationStatisticsErrorCountResponse response) {
            super(response);
            this.projectData = response.projectData;
            this.projectId = response.projectId;
        } 

        /**
         * ProjectData.
         */
        @Override
        public Builder projectData(ProjectData projectData) {
            this.projectData = projectData;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        @Override
        public Builder projectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        @Override
        public OralEvaluationStatisticsErrorCountResponse build() {
            return new OralEvaluationStatisticsErrorCountResponse(this);
        } 

    } 

    /**
     * 
     * {@link OralEvaluationStatisticsErrorCountResponse} extends {@link TeaModel}
     *
     * <p>OralEvaluationStatisticsErrorCountResponse</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("count")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        private Data(Builder builder) {
            this.count = builder.count;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Integer count; 
            private String name; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.count = model.count;
                this.name = model.name;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link OralEvaluationStatisticsErrorCountResponse} extends {@link TeaModel}
     *
     * <p>OralEvaluationStatisticsErrorCountResponse</p>
     */
    public static class ApplicationDataData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<Data> data;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        private ApplicationDataData(Builder builder) {
            this.data = builder.data;
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicationDataData create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List<Data> getData() {
            return this.data;
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

        public static final class Builder {
            private java.util.List<Data> data; 
            private String errorCode; 
            private String errorMessage; 

            private Builder() {
            } 

            private Builder(ApplicationDataData model) {
                this.data = model.data;
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
            } 

            /**
             * Data.
             */
            public Builder data(java.util.List<Data> data) {
                this.data = data;
                return this;
            }

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

            public ApplicationDataData build() {
                return new ApplicationDataData(this);
            } 

        } 

    }
    /**
     * 
     * {@link OralEvaluationStatisticsErrorCountResponse} extends {@link TeaModel}
     *
     * <p>OralEvaluationStatisticsErrorCountResponse</p>
     */
    public static class ApplicationData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<ApplicationDataData> data;

        @com.aliyun.core.annotation.NameInMap("applicationAccessId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String applicationAccessId;

        private ApplicationData(Builder builder) {
            this.data = builder.data;
            this.applicationAccessId = builder.applicationAccessId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicationData create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List<ApplicationDataData> getData() {
            return this.data;
        }

        /**
         * @return applicationAccessId
         */
        public String getApplicationAccessId() {
            return this.applicationAccessId;
        }

        public static final class Builder {
            private java.util.List<ApplicationDataData> data; 
            private String applicationAccessId; 

            private Builder() {
            } 

            private Builder(ApplicationData model) {
                this.data = model.data;
                this.applicationAccessId = model.applicationAccessId;
            } 

            /**
             * Data.
             */
            public Builder data(java.util.List<ApplicationDataData> data) {
                this.data = data;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder applicationAccessId(String applicationAccessId) {
                this.applicationAccessId = applicationAccessId;
                return this;
            }

            public ApplicationData build() {
                return new ApplicationData(this);
            } 

        } 

    }
    /**
     * 
     * {@link OralEvaluationStatisticsErrorCountResponse} extends {@link TeaModel}
     *
     * <p>OralEvaluationStatisticsErrorCountResponse</p>
     */
    public static class ProjectData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationData")
        private java.util.List<ApplicationData> applicationData;

        @com.aliyun.core.annotation.NameInMap("applicationInternalId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String applicationInternalId;

        private ProjectData(Builder builder) {
            this.applicationData = builder.applicationData;
            this.applicationInternalId = builder.applicationInternalId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProjectData create() {
            return builder().build();
        }

        /**
         * @return applicationData
         */
        public java.util.List<ApplicationData> getApplicationData() {
            return this.applicationData;
        }

        /**
         * @return applicationInternalId
         */
        public String getApplicationInternalId() {
            return this.applicationInternalId;
        }

        public static final class Builder {
            private java.util.List<ApplicationData> applicationData; 
            private String applicationInternalId; 

            private Builder() {
            } 

            private Builder(ProjectData model) {
                this.applicationData = model.applicationData;
                this.applicationInternalId = model.applicationInternalId;
            } 

            /**
             * ApplicationData.
             */
            public Builder applicationData(java.util.List<ApplicationData> applicationData) {
                this.applicationData = applicationData;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder applicationInternalId(String applicationInternalId) {
                this.applicationInternalId = applicationInternalId;
                return this;
            }

            public ProjectData build() {
                return new ProjectData(this);
            } 

        } 

    }
}
