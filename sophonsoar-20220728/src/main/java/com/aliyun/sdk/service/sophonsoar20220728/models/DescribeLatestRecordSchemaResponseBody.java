// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLatestRecordSchemaResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLatestRecordSchemaResponseBody</p>
 */
public class DescribeLatestRecordSchemaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PlaybookNodeSchema")
    private PlaybookNodeSchema playbookNodeSchema;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeLatestRecordSchemaResponseBody(Builder builder) {
        this.playbookNodeSchema = builder.playbookNodeSchema;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLatestRecordSchemaResponseBody create() {
        return builder().build();
    }

    /**
     * @return playbookNodeSchema
     */
    public PlaybookNodeSchema getPlaybookNodeSchema() {
        return this.playbookNodeSchema;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PlaybookNodeSchema playbookNodeSchema; 
        private String requestId; 

        /**
         * The output structure information of the playbook.
         */
        public Builder playbookNodeSchema(PlaybookNodeSchema playbookNodeSchema) {
            this.playbookNodeSchema = playbookNodeSchema;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLatestRecordSchemaResponseBody build() {
            return new DescribeLatestRecordSchemaResponseBody(this);
        } 

    } 

    public static class NodeSchema extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActionName")
        private String actionName;

        @com.aliyun.core.annotation.NameInMap("ComponentName")
        private String componentName;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("OutputFields")
        private java.util.List < String > outputFields;

        private NodeSchema(Builder builder) {
            this.actionName = builder.actionName;
            this.componentName = builder.componentName;
            this.nodeName = builder.nodeName;
            this.outputFields = builder.outputFields;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeSchema create() {
            return builder().build();
        }

        /**
         * @return actionName
         */
        public String getActionName() {
            return this.actionName;
        }

        /**
         * @return componentName
         */
        public String getComponentName() {
            return this.componentName;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return outputFields
         */
        public java.util.List < String > getOutputFields() {
            return this.outputFields;
        }

        public static final class Builder {
            private String actionName; 
            private String componentName; 
            private String nodeName; 
            private java.util.List < String > outputFields; 

            /**
             * The action name of the component.
             */
            public Builder actionName(String actionName) {
                this.actionName = actionName;
                return this;
            }

            /**
             * The name of the component.
             */
            public Builder componentName(String componentName) {
                this.componentName = componentName;
                return this;
            }

            /**
             * The name of the node.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * The output fields.
             */
            public Builder outputFields(java.util.List < String > outputFields) {
                this.outputFields = outputFields;
                return this;
            }

            public NodeSchema build() {
                return new NodeSchema(this);
            } 

        } 

    }
    public static class PlaybookNodeSchema extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeSchema")
        private java.util.List < NodeSchema> nodeSchema;

        private PlaybookNodeSchema(Builder builder) {
            this.nodeSchema = builder.nodeSchema;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PlaybookNodeSchema create() {
            return builder().build();
        }

        /**
         * @return nodeSchema
         */
        public java.util.List < NodeSchema> getNodeSchema() {
            return this.nodeSchema;
        }

        public static final class Builder {
            private java.util.List < NodeSchema> nodeSchema; 

            /**
             * The structure information.
             */
            public Builder nodeSchema(java.util.List < NodeSchema> nodeSchema) {
                this.nodeSchema = nodeSchema;
                return this;
            }

            public PlaybookNodeSchema build() {
                return new PlaybookNodeSchema(this);
            } 

        } 

    }
}
