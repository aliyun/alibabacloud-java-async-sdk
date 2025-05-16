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
 * {@link OralEvaluationStatisticsConcurrentCountResponse} extends {@link TeaModel}
 *
 * <p>OralEvaluationStatisticsConcurrentCountResponse</p>
 */
public class OralEvaluationStatisticsConcurrentCountResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("projectData")
    @com.aliyun.core.annotation.Validation(required = true)
    private ProjectData projectData;

    @com.aliyun.core.annotation.NameInMap("projectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    private OralEvaluationStatisticsConcurrentCountResponse(BuilderImpl builder) {
        super(builder);
        this.projectData = builder.projectData;
        this.projectId = builder.projectId;
    }

    public static OralEvaluationStatisticsConcurrentCountResponse create() {
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

    public interface Builder extends Response.Builder<OralEvaluationStatisticsConcurrentCountResponse, Builder> {

        Builder projectData(ProjectData projectData);

        Builder projectId(String projectId);

        @Override
        OralEvaluationStatisticsConcurrentCountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OralEvaluationStatisticsConcurrentCountResponse, Builder>
            implements Builder {
        private ProjectData projectData; 
        private String projectId; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OralEvaluationStatisticsConcurrentCountResponse response) {
            super(response);
            this.projectData = response.projectData;
            this.projectId = response.projectId;
        } 

        /**
         * <p>This parameter is required.</p>
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
        public OralEvaluationStatisticsConcurrentCountResponse build() {
            return new OralEvaluationStatisticsConcurrentCountResponse(this);
        } 

    } 

    /**
     * 
     * {@link OralEvaluationStatisticsConcurrentCountResponse} extends {@link TeaModel}
     *
     * <p>OralEvaluationStatisticsConcurrentCountResponse</p>
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
     * {@link OralEvaluationStatisticsConcurrentCountResponse} extends {@link TeaModel}
     *
     * <p>OralEvaluationStatisticsConcurrentCountResponse</p>
     */
    public static class ApplicationData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<Data> data;

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
        public java.util.List<Data> getData() {
            return this.data;
        }

        /**
         * @return applicationAccessId
         */
        public String getApplicationAccessId() {
            return this.applicationAccessId;
        }

        public static final class Builder {
            private java.util.List<Data> data; 
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
            public Builder data(java.util.List<Data> data) {
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
     * {@link OralEvaluationStatisticsConcurrentCountResponse} extends {@link TeaModel}
     *
     * <p>OralEvaluationStatisticsConcurrentCountResponse</p>
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
