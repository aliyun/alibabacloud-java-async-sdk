// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apds20220331.models;

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
 * {@link CreateMigrationJobRequest} extends {@link RequestModel}
 *
 * <p>CreateMigrationJobRequest</p>
 */
public class CreateMigrationJobRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("migrationJobList")
    private java.util.List<MigrationJobList> migrationJobList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private CreateMigrationJobRequest(Builder builder) {
        super(builder);
        this.migrationJobList = builder.migrationJobList;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMigrationJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return migrationJobList
     */
    public java.util.List<MigrationJobList> getMigrationJobList() {
        return this.migrationJobList;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateMigrationJobRequest, Builder> {
        private java.util.List<MigrationJobList> migrationJobList; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateMigrationJobRequest request) {
            super(request);
            this.migrationJobList = request.migrationJobList;
            this.type = request.type;
        } 

        /**
         * migrationJobList.
         */
        public Builder migrationJobList(java.util.List<MigrationJobList> migrationJobList) {
            this.putBodyParameter("migrationJobList", migrationJobList);
            this.migrationJobList = migrationJobList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateMigrationJobRequest build() {
            return new CreateMigrationJobRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateMigrationJobRequest} extends {@link TeaModel}
     *
     * <p>CreateMigrationJobRequest</p>
     */
    public static class MigrationJobList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("destination")
        @com.aliyun.core.annotation.Validation(required = true)
        private String destination;

        @com.aliyun.core.annotation.NameInMap("destinationIp")
        private String destinationIp;

        @com.aliyun.core.annotation.NameInMap("destinationRegion")
        private String destinationRegion;

        @com.aliyun.core.annotation.NameInMap("jobGmtCreate")
        private String jobGmtCreate;

        @com.aliyun.core.annotation.NameInMap("jobGmtModified")
        private String jobGmtModified;

        @com.aliyun.core.annotation.NameInMap("name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("originalPercent")
        private String originalPercent;

        @com.aliyun.core.annotation.NameInMap("originalProgress")
        private String originalProgress;

        @com.aliyun.core.annotation.NameInMap("originalStatus")
        @com.aliyun.core.annotation.Validation(required = true)
        private String originalStatus;

        @com.aliyun.core.annotation.NameInMap("outSideId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String outSideId;

        @com.aliyun.core.annotation.NameInMap("properties")
        private String properties;

        @com.aliyun.core.annotation.NameInMap("source")
        @com.aliyun.core.annotation.Validation(required = true)
        private String source;

        @com.aliyun.core.annotation.NameInMap("sourceIp")
        private String sourceIp;

        private MigrationJobList(Builder builder) {
            this.destination = builder.destination;
            this.destinationIp = builder.destinationIp;
            this.destinationRegion = builder.destinationRegion;
            this.jobGmtCreate = builder.jobGmtCreate;
            this.jobGmtModified = builder.jobGmtModified;
            this.name = builder.name;
            this.originalPercent = builder.originalPercent;
            this.originalProgress = builder.originalProgress;
            this.originalStatus = builder.originalStatus;
            this.outSideId = builder.outSideId;
            this.properties = builder.properties;
            this.source = builder.source;
            this.sourceIp = builder.sourceIp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MigrationJobList create() {
            return builder().build();
        }

        /**
         * @return destination
         */
        public String getDestination() {
            return this.destination;
        }

        /**
         * @return destinationIp
         */
        public String getDestinationIp() {
            return this.destinationIp;
        }

        /**
         * @return destinationRegion
         */
        public String getDestinationRegion() {
            return this.destinationRegion;
        }

        /**
         * @return jobGmtCreate
         */
        public String getJobGmtCreate() {
            return this.jobGmtCreate;
        }

        /**
         * @return jobGmtModified
         */
        public String getJobGmtModified() {
            return this.jobGmtModified;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return originalPercent
         */
        public String getOriginalPercent() {
            return this.originalPercent;
        }

        /**
         * @return originalProgress
         */
        public String getOriginalProgress() {
            return this.originalProgress;
        }

        /**
         * @return originalStatus
         */
        public String getOriginalStatus() {
            return this.originalStatus;
        }

        /**
         * @return outSideId
         */
        public String getOutSideId() {
            return this.outSideId;
        }

        /**
         * @return properties
         */
        public String getProperties() {
            return this.properties;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return sourceIp
         */
        public String getSourceIp() {
            return this.sourceIp;
        }

        public static final class Builder {
            private String destination; 
            private String destinationIp; 
            private String destinationRegion; 
            private String jobGmtCreate; 
            private String jobGmtModified; 
            private String name; 
            private String originalPercent; 
            private String originalProgress; 
            private String originalStatus; 
            private String outSideId; 
            private String properties; 
            private String source; 
            private String sourceIp; 

            private Builder() {
            } 

            private Builder(MigrationJobList model) {
                this.destination = model.destination;
                this.destinationIp = model.destinationIp;
                this.destinationRegion = model.destinationRegion;
                this.jobGmtCreate = model.jobGmtCreate;
                this.jobGmtModified = model.jobGmtModified;
                this.name = model.name;
                this.originalPercent = model.originalPercent;
                this.originalProgress = model.originalProgress;
                this.originalStatus = model.originalStatus;
                this.outSideId = model.outSideId;
                this.properties = model.properties;
                this.source = model.source;
                this.sourceIp = model.sourceIp;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder destination(String destination) {
                this.destination = destination;
                return this;
            }

            /**
             * destinationIp.
             */
            public Builder destinationIp(String destinationIp) {
                this.destinationIp = destinationIp;
                return this;
            }

            /**
             * destinationRegion.
             */
            public Builder destinationRegion(String destinationRegion) {
                this.destinationRegion = destinationRegion;
                return this;
            }

            /**
             * jobGmtCreate.
             */
            public Builder jobGmtCreate(String jobGmtCreate) {
                this.jobGmtCreate = jobGmtCreate;
                return this;
            }

            /**
             * jobGmtModified.
             */
            public Builder jobGmtModified(String jobGmtModified) {
                this.jobGmtModified = jobGmtModified;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * originalPercent.
             */
            public Builder originalPercent(String originalPercent) {
                this.originalPercent = originalPercent;
                return this;
            }

            /**
             * originalProgress.
             */
            public Builder originalProgress(String originalProgress) {
                this.originalProgress = originalProgress;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder originalStatus(String originalStatus) {
                this.originalStatus = originalStatus;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder outSideId(String outSideId) {
                this.outSideId = outSideId;
                return this;
            }

            /**
             * properties.
             */
            public Builder properties(String properties) {
                this.properties = properties;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * sourceIp.
             */
            public Builder sourceIp(String sourceIp) {
                this.sourceIp = sourceIp;
                return this;
            }

            public MigrationJobList build() {
                return new MigrationJobList(this);
            } 

        } 

    }
}
