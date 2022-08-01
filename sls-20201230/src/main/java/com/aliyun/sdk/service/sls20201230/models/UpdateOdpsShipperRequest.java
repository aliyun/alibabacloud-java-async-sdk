// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link UpdateOdpsShipperRequest} extends {@link RequestModel}
 *
 * <p>UpdateOdpsShipperRequest</p>
 */
public class UpdateOdpsShipperRequest extends Request {
    @Path
    @NameInMap("logstore")
    @Validation(required = true)
    private String logstore;

    @Path
    @Body
    @NameInMap("shipperName")
    @Validation(required = true)
    private String shipperName;

    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    @Body
    @NameInMap("targetConfiguration")
    @Validation(required = true)
    private TargetConfiguration targetConfiguration;

    @Body
    @NameInMap("targetType")
    @Validation(required = true)
    private String targetType;

    private UpdateOdpsShipperRequest(Builder builder) {
        super(builder);
        this.logstore = builder.logstore;
        this.shipperName = builder.shipperName;
        this.project = builder.project;
        this.targetConfiguration = builder.targetConfiguration;
        this.targetType = builder.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateOdpsShipperRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return logstore
     */
    public String getLogstore() {
        return this.logstore;
    }

    /**
     * @return shipperName
     */
    public String getShipperName() {
        return this.shipperName;
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return targetConfiguration
     */
    public TargetConfiguration getTargetConfiguration() {
        return this.targetConfiguration;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    public static final class Builder extends Request.Builder<UpdateOdpsShipperRequest, Builder> {
        private String logstore; 
        private String shipperName; 
        private String project; 
        private TargetConfiguration targetConfiguration; 
        private String targetType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateOdpsShipperRequest request) {
            super(request);
            this.logstore = request.logstore;
            this.shipperName = request.shipperName;
            this.project = request.project;
            this.targetConfiguration = request.targetConfiguration;
            this.targetType = request.targetType;
        } 

        /**
         * Logstore 名称。
         */
        public Builder logstore(String logstore) {
            this.putPathParameter("logstore", logstore);
            this.logstore = logstore;
            return this;
        }

        /**
         * 投递任务名称。
         */
        public Builder shipperName(String shipperName) {
            this.putPathParameter("shipperName", shipperName);
            this.putBodyParameter("shipperName", shipperName);
            this.shipperName = shipperName;
            return this;
        }

        /**
         * Project 名称。
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * targetConfiguration.
         */
        public Builder targetConfiguration(TargetConfiguration targetConfiguration) {
            this.putBodyParameter("targetConfiguration", targetConfiguration);
            this.targetConfiguration = targetConfiguration;
            return this;
        }

        /**
         * 投递目标的类型，这里固定为 odps。
         */
        public Builder targetType(String targetType) {
            this.putBodyParameter("targetType", targetType);
            this.targetType = targetType;
            return this;
        }

        @Override
        public UpdateOdpsShipperRequest build() {
            return new UpdateOdpsShipperRequest(this);
        } 

    } 

    public static class TargetConfiguration extends TeaModel {
        @NameInMap("bufferInterval")
        private Integer bufferInterval;

        @NameInMap("enable")
        private Boolean enable;

        @NameInMap("fields")
        @Validation(required = true)
        private java.util.List < String > fields;

        @NameInMap("odpsEndpoint")
        @Validation(required = true)
        private String odpsEndpoint;

        @NameInMap("odpsProject")
        @Validation(required = true)
        private String odpsProject;

        @NameInMap("odpsTable")
        @Validation(required = true)
        private String odpsTable;

        @NameInMap("partitionColumn")
        @Validation(required = true)
        private java.util.List < String > partitionColumn;

        @NameInMap("partitionTimeFormat")
        @Validation(required = true)
        private String partitionTimeFormat;

        private TargetConfiguration(Builder builder) {
            this.bufferInterval = builder.bufferInterval;
            this.enable = builder.enable;
            this.fields = builder.fields;
            this.odpsEndpoint = builder.odpsEndpoint;
            this.odpsProject = builder.odpsProject;
            this.odpsTable = builder.odpsTable;
            this.partitionColumn = builder.partitionColumn;
            this.partitionTimeFormat = builder.partitionTimeFormat;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetConfiguration create() {
            return builder().build();
        }

        /**
         * @return bufferInterval
         */
        public Integer getBufferInterval() {
            return this.bufferInterval;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return fields
         */
        public java.util.List < String > getFields() {
            return this.fields;
        }

        /**
         * @return odpsEndpoint
         */
        public String getOdpsEndpoint() {
            return this.odpsEndpoint;
        }

        /**
         * @return odpsProject
         */
        public String getOdpsProject() {
            return this.odpsProject;
        }

        /**
         * @return odpsTable
         */
        public String getOdpsTable() {
            return this.odpsTable;
        }

        /**
         * @return partitionColumn
         */
        public java.util.List < String > getPartitionColumn() {
            return this.partitionColumn;
        }

        /**
         * @return partitionTimeFormat
         */
        public String getPartitionTimeFormat() {
            return this.partitionTimeFormat;
        }

        public static final class Builder {
            private Integer bufferInterval; 
            private Boolean enable; 
            private java.util.List < String > fields; 
            private String odpsEndpoint; 
            private String odpsProject; 
            private String odpsTable; 
            private java.util.List < String > partitionColumn; 
            private String partitionTimeFormat; 

            /**
             * 导入时间间隔，秒，只支持 1800 、3600两种。
             */
            public Builder bufferInterval(Integer bufferInterval) {
                this.bufferInterval = bufferInterval;
                return this;
            }

            /**
             * 是否启用该配置，默认为 true。
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * 要投递的普通列，至少要有一个元素。
             */
            public Builder fields(java.util.List < String > fields) {
                this.fields = fields;
                return this;
            }

            /**
             * odpsEndpoint
             */
            public Builder odpsEndpoint(String odpsEndpoint) {
                this.odpsEndpoint = odpsEndpoint;
                return this;
            }

            /**
             * 要投递区域的 odps 项目名称
             */
            public Builder odpsProject(String odpsProject) {
                this.odpsProject = odpsProject;
                return this;
            }

            /**
             * odps表名
             */
            public Builder odpsTable(String odpsTable) {
                this.odpsTable = odpsTable;
                return this;
            }

            /**
             * 要投递的分区列，至少要有一个元素。
             */
            public Builder partitionColumn(java.util.List < String > partitionColumn) {
                this.partitionColumn = partitionColumn;
                return this;
            }

            /**
             * 时间分区格式
             */
            public Builder partitionTimeFormat(String partitionTimeFormat) {
                this.partitionTimeFormat = partitionTimeFormat;
                return this;
            }

            public TargetConfiguration build() {
                return new TargetConfiguration(this);
            } 

        } 

    }
}
