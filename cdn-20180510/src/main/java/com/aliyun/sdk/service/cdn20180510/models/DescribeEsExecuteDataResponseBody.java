// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeEsExecuteDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEsExecuteDataResponseBody</p>
 */
public class DescribeEsExecuteDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Contents")
    private java.util.List < Contents> contents;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeEsExecuteDataResponseBody(Builder builder) {
        this.contents = builder.contents;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEsExecuteDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return contents
     */
    public java.util.List < Contents> getContents() {
        return this.contents;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Contents> contents; 
        private String requestId; 

        /**
         * <p>The content of the script.</p>
         */
        public Builder contents(java.util.List < Contents> contents) {
            this.contents = contents;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>99D61AB3-6164-4CF2-A0DE-129C9B07618B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeEsExecuteDataResponseBody build() {
            return new DescribeEsExecuteDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEsExecuteDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEsExecuteDataResponseBody</p>
     */
    public static class Contents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Columns")
        private java.util.List < String > columns;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Points")
        private java.util.List < String > points;

        private Contents(Builder builder) {
            this.columns = builder.columns;
            this.name = builder.name;
            this.points = builder.points;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Contents create() {
            return builder().build();
        }

        /**
         * @return columns
         */
        public java.util.List < String > getColumns() {
            return this.columns;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return points
         */
        public java.util.List < String > getPoints() {
            return this.points;
        }

        public static final class Builder {
            private java.util.List < String > columns; 
            private String name; 
            private java.util.List < String > points; 

            /**
             * <p>The time and column names in the table that shows the status of the script.</p>
             */
            public Builder columns(java.util.List < String > columns) {
                this.columns = columns;
                return this;
            }

            /**
             * <p>The name of the table that shows the status of the script.</p>
             * 
             * <strong>example:</strong>
             * <p>Exception</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The list of timestamps and values in the corresponding columns of the table that shows the status of the script.</p>
             */
            public Builder points(java.util.List < String > points) {
                this.points = points;
                return this;
            }

            public Contents build() {
                return new Contents(this);
            } 

        } 

    }
}
