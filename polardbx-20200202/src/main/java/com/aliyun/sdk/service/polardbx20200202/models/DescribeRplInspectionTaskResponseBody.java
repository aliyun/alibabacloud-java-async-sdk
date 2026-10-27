// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link DescribeRplInspectionTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRplInspectionTaskResponseBody</p>
 */
public class DescribeRplInspectionTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeRplInspectionTaskResponseBody(Builder builder) {
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRplInspectionTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeRplInspectionTaskResponseBody model) {
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The task details.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message of the task.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeRplInspectionTaskResponseBody build() {
            return new DescribeRplInspectionTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRplInspectionTaskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRplInspectionTaskResponseBody</p>
     */
    public static class InspectionTaskList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("SlinkTaskId")
        private String slinkTaskId;

        @com.aliyun.core.annotation.NameInMap("Stage")
        private String stage;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private InspectionTaskList(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.id = builder.id;
            this.slinkTaskId = builder.slinkTaskId;
            this.stage = builder.stage;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InspectionTaskList create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return slinkTaskId
         */
        public String getSlinkTaskId() {
            return this.slinkTaskId;
        }

        /**
         * @return stage
         */
        public String getStage() {
            return this.stage;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private Long createTime; 
            private String description; 
            private Long id; 
            private String slinkTaskId; 
            private String stage; 
            private String status; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(InspectionTaskList model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.id = model.id;
                this.slinkTaskId = model.slinkTaskId;
                this.stage = model.stage;
                this.status = model.status;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The timestamp when the task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-09-25T02:36:20.000+0000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the inspection task.</p>
             * 
             * <strong>example:</strong>
             * <p>For database: wms ,Found SIMPLE sequences in 1.0. PolarDB-X 2.0 does not support SIMPLE sequence any more， please use show sequence to check them.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>10142</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>slinktaskid。</p>
             * 
             * <strong>example:</strong>
             * <p>etx-hzrez23btmb6aq</p>
             */
            public Builder slinkTaskId(String slinkTaskId) {
                this.slinkTaskId = slinkTaskId;
                return this;
            }

            /**
             * <p>The stage name.</p>
             * 
             * <strong>example:</strong>
             * <p>CONNECTIVITY</p>
             */
            public Builder stage(String stage) {
                this.stage = stage;
                return this;
            }

            /**
             * <p>The task status.</p>
             * 
             * <strong>example:</strong>
             * <p>SUCCEEDED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The timestamp when the task was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-09-23T03:25:21.000+0000</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public InspectionTaskList build() {
                return new InspectionTaskList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRplInspectionTaskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRplInspectionTaskResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InspectionTaskList")
        private java.util.List<InspectionTaskList> inspectionTaskList;

        @com.aliyun.core.annotation.NameInMap("SlinkStage")
        private String slinkStage;

        private Data(Builder builder) {
            this.inspectionTaskList = builder.inspectionTaskList;
            this.slinkStage = builder.slinkStage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return inspectionTaskList
         */
        public java.util.List<InspectionTaskList> getInspectionTaskList() {
            return this.inspectionTaskList;
        }

        /**
         * @return slinkStage
         */
        public String getSlinkStage() {
            return this.slinkStage;
        }

        public static final class Builder {
            private java.util.List<InspectionTaskList> inspectionTaskList; 
            private String slinkStage; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.inspectionTaskList = model.inspectionTaskList;
                this.slinkStage = model.slinkStage;
            } 

            /**
             * <p>The machine task information.</p>
             */
            public Builder inspectionTaskList(java.util.List<InspectionTaskList> inspectionTaskList) {
                this.inspectionTaskList = inspectionTaskList;
                return this;
            }

            /**
             * <p>The slink status.</p>
             * 
             * <strong>example:</strong>
             * <p>PRE_CHECK</p>
             */
            public Builder slinkStage(String slinkStage) {
                this.slinkStage = slinkStage;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
