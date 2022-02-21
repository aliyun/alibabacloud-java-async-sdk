// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEsExecuteDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEsExecuteDataResponseBody</p>
 */
public class DescribeEsExecuteDataResponseBody extends TeaModel {
    @NameInMap("Contents")
    private java.util.List < Contents> contents;

    @NameInMap("RequestId")
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
         * Contents.
         */
        public Builder contents(java.util.List < Contents> contents) {
            this.contents = contents;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeEsExecuteDataResponseBody build() {
            return new DescribeEsExecuteDataResponseBody(this);
        } 

    } 

    public static class Contents extends TeaModel {
        @NameInMap("Columns")
        private java.util.List < String > columns;

        @NameInMap("Name")
        private String name;

        @NameInMap("Points")
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
             * Columns.
             */
            public Builder columns(java.util.List < String > columns) {
                this.columns = columns;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Points.
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
