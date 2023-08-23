// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEsExceptionDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEsExceptionDataResponseBody</p>
 */
public class DescribeEsExceptionDataResponseBody extends TeaModel {
    @NameInMap("Contents")
    private java.util.List < Contents> contents;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeEsExceptionDataResponseBody(Builder builder) {
        this.contents = builder.contents;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEsExceptionDataResponseBody create() {
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
         * The content of the script for which an error was reported.
         */
        public Builder contents(java.util.List < Contents> contents) {
            this.contents = contents;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeEsExceptionDataResponseBody build() {
            return new DescribeEsExceptionDataResponseBody(this);
        } 

    } 

    public static class Points extends TeaModel {
        @NameInMap("Points")
        private java.util.List < String > points;

        private Points(Builder builder) {
            this.points = builder.points;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Points create() {
            return builder().build();
        }

        /**
         * @return points
         */
        public java.util.List < String > getPoints() {
            return this.points;
        }

        public static final class Builder {
            private java.util.List < String > points; 

            /**
             * The data points.
             */
            public Builder points(java.util.List < String > points) {
                this.points = points;
                return this;
            }

            public Points build() {
                return new Points(this);
            } 

        } 

    }
    public static class Contents extends TeaModel {
        @NameInMap("Columns")
        private java.util.List < String > columns;

        @NameInMap("Name")
        private String name;

        @NameInMap("Points")
        private java.util.List < Points> points;

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
        public java.util.List < Points> getPoints() {
            return this.points;
        }

        public static final class Builder {
            private java.util.List < String > columns; 
            private String name; 
            private java.util.List < Points> points; 

            /**
             * Information about the time column and the error column name.
             */
            public Builder columns(java.util.List < String > columns) {
                this.columns = columns;
                return this;
            }

            /**
             * The name of the table that shows the errors of the script.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The time columns and error column names.
             */
            public Builder points(java.util.List < Points> points) {
                this.points = points;
                return this;
            }

            public Contents build() {
                return new Contents(this);
            } 

        } 

    }
}
