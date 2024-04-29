// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTraceInfoNodeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTraceInfoNodeResponseBody</p>
 */
public class DescribeTraceInfoNodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Node")
    private Node node;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeTraceInfoNodeResponseBody(Builder builder) {
        this.node = builder.node;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTraceInfoNodeResponseBody create() {
        return builder().build();
    }

    /**
     * @return node
     */
    public Node getNode() {
        return this.node;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Node node; 
        private String requestId; 

        /**
         * The details about the node.
         */
        public Builder node(Node node) {
            this.node = node;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeTraceInfoNodeResponseBody build() {
            return new DescribeTraceInfoNodeResponseBody(this);
        } 

    } 

    public static class PropertyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private PropertyList(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PropertyList create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            /**
             * The name of the property.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The value of the property.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public PropertyList build() {
                return new PropertyList(this);
            } 

        } 

    }
    public static class Node extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PropertyList")
        private java.util.List < PropertyList> propertyList;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Node(Builder builder) {
            this.name = builder.name;
            this.propertyList = builder.propertyList;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Node create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return propertyList
         */
        public java.util.List < PropertyList> getPropertyList() {
            return this.propertyList;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String name; 
            private java.util.List < PropertyList> propertyList; 
            private String type; 

            /**
             * The name of the node.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * An array that consists of the properties of the node.
             */
            public Builder propertyList(java.util.List < PropertyList> propertyList) {
                this.propertyList = propertyList;
                return this;
            }

            /**
             * The type of the node.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Node build() {
                return new Node(this);
            } 

        } 

    }
}
