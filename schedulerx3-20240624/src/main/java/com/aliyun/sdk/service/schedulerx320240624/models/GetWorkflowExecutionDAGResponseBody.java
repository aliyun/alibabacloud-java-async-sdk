// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx320240624.models;

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
 * {@link GetWorkflowExecutionDAGResponseBody} extends {@link TeaModel}
 *
 * <p>GetWorkflowExecutionDAGResponseBody</p>
 */
public class GetWorkflowExecutionDAGResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetWorkflowExecutionDAGResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkflowExecutionDAGResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
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
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetWorkflowExecutionDAGResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned for the request.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Parameter format error</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>3835AA29-2298-5434-BC53-9CC377CDFD2C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the API call succeeded.</p>
         * <ul>
         * <li><p><code>true</code>: The call succeeded.</p>
         * </li>
         * <li><p><code>false</code>: The call failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetWorkflowExecutionDAGResponseBody build() {
            return new GetWorkflowExecutionDAGResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetWorkflowExecutionDAGResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkflowExecutionDAGResponseBody</p>
     */
    public static class Edges extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Target")
        private String target;

        private Edges(Builder builder) {
            this.source = builder.source;
            this.target = builder.target;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Edges create() {
            return builder().build();
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return target
         */
        public String getTarget() {
            return this.target;
        }

        public static final class Builder {
            private String source; 
            private String target; 

            private Builder() {
            } 

            private Builder(Edges model) {
                this.source = model.source;
                this.target = model.target;
            } 

            /**
             * <p>The ID of the source node.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The ID of the target node.</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            public Edges build() {
                return new Edges(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetWorkflowExecutionDAGResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkflowExecutionDAGResponseBody</p>
     */
    public static class Coordinate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Height")
        private Float height;

        @com.aliyun.core.annotation.NameInMap("Width")
        private Float width;

        @com.aliyun.core.annotation.NameInMap("X")
        private Float x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private Float y;

        private Coordinate(Builder builder) {
            this.height = builder.height;
            this.width = builder.width;
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Coordinate create() {
            return builder().build();
        }

        /**
         * @return height
         */
        public Float getHeight() {
            return this.height;
        }

        /**
         * @return width
         */
        public Float getWidth() {
            return this.width;
        }

        /**
         * @return x
         */
        public Float getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Float getY() {
            return this.y;
        }

        public static final class Builder {
            private Float height; 
            private Float width; 
            private Float x; 
            private Float y; 

            private Builder() {
            } 

            private Builder(Coordinate model) {
                this.height = model.height;
                this.width = model.width;
                this.x = model.x;
                this.y = model.y;
            } 

            /**
             * <p>The height of the node. This parameter is optional.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder height(Float height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The width of the node. This parameter is optional.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder width(Float width) {
                this.width = width;
                return this;
            }

            /**
             * <p>The x-coordinate of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder x(Float x) {
                this.x = x;
                return this;
            }

            /**
             * <p>The y-coordinate of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder y(Float y) {
                this.y = y;
                return this;
            }

            public Coordinate build() {
                return new Coordinate(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetWorkflowExecutionDAGResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkflowExecutionDAGResponseBody</p>
     */
    public static class Nodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("Coordinate")
        private Coordinate coordinate;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private Long jobId;

        @com.aliyun.core.annotation.NameInMap("JobType")
        private String jobType;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        private Nodes(Builder builder) {
            this.appName = builder.appName;
            this.coordinate = builder.coordinate;
            this.id = builder.id;
            this.jobId = builder.jobId;
            this.jobType = builder.jobType;
            this.name = builder.name;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Nodes create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return coordinate
         */
        public Coordinate getCoordinate() {
            return this.coordinate;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return jobId
         */
        public Long getJobId() {
            return this.jobId;
        }

        /**
         * @return jobType
         */
        public String getJobType() {
            return this.jobType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String appName; 
            private Coordinate coordinate; 
            private String id; 
            private Long jobId; 
            private String jobType; 
            private String name; 
            private Integer status; 

            private Builder() {
            } 

            private Builder(Nodes model) {
                this.appName = model.appName;
                this.coordinate = model.coordinate;
                this.id = model.id;
                this.jobId = model.jobId;
                this.jobType = model.jobType;
                this.name = model.name;
                this.status = model.status;
            } 

            /**
             * <p>The application name.</p>
             * 
             * <strong>example:</strong>
             * <p>cua-xxl-job-executor</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The coordinates of the node.</p>
             */
            public Builder coordinate(Coordinate coordinate) {
                this.coordinate = coordinate;
                return this;
            }

            /**
             * <p>The unique ID for the job execution (node).</p>
             * 
             * <strong>example:</strong>
             * <p>7491777526619542799</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder jobId(Long jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The job type.</p>
             * 
             * <strong>example:</strong>
             * <p>script_shell</p>
             */
            public Builder jobType(String jobType) {
                this.jobType = jobType;
                return this;
            }

            /**
             * <p>The job name.</p>
             * 
             * <strong>example:</strong>
             * <p>job1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The execution status of the job. Valid values:</p>
             * <ul>
             * <li><p>0: Unknown</p>
             * </li>
             * <li><p>1: Waiting</p>
             * </li>
             * <li><p>2: Queued</p>
             * </li>
             * <li><p>3: Running</p>
             * </li>
             * <li><p>4: Succeeded</p>
             * </li>
             * <li><p>5: Failed</p>
             * </li>
             * <li><p>6: Killed</p>
             * </li>
             * <li><p>7: Held</p>
             * </li>
             * <li><p>8: Marked as successful</p>
             * </li>
             * <li><p>9: Skipped</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public Nodes build() {
                return new Nodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetWorkflowExecutionDAGResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkflowExecutionDAGResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Edges")
        private java.util.List<Edges> edges;

        @com.aliyun.core.annotation.NameInMap("Nodes")
        private java.util.List<Nodes> nodes;

        private Data(Builder builder) {
            this.edges = builder.edges;
            this.nodes = builder.nodes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return edges
         */
        public java.util.List<Edges> getEdges() {
            return this.edges;
        }

        /**
         * @return nodes
         */
        public java.util.List<Nodes> getNodes() {
            return this.nodes;
        }

        public static final class Builder {
            private java.util.List<Edges> edges; 
            private java.util.List<Nodes> nodes; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.edges = model.edges;
                this.nodes = model.nodes;
            } 

            /**
             * <p>A list of edges in the workflow DAG.</p>
             */
            public Builder edges(java.util.List<Edges> edges) {
                this.edges = edges;
                return this;
            }

            /**
             * <p>A list of nodes in the workflow DAG.</p>
             */
            public Builder nodes(java.util.List<Nodes> nodes) {
                this.nodes = nodes;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
