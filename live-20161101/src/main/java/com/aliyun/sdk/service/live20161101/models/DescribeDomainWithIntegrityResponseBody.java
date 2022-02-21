// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainWithIntegrityResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainWithIntegrityResponseBody</p>
 */
public class DescribeDomainWithIntegrityResponseBody extends TeaModel {
    @NameInMap("Content")
    private java.util.List < Content> content;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDomainWithIntegrityResponseBody(Builder builder) {
        this.content = builder.content;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainWithIntegrityResponseBody create() {
        return builder().build();
    }

    /**
     * @return content
     */
    public java.util.List < Content> getContent() {
        return this.content;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Content> content; 
        private String requestId; 

        /**
         * Content.
         */
        public Builder content(java.util.List < Content> content) {
            this.content = content;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDomainWithIntegrityResponseBody build() {
            return new DescribeDomainWithIntegrityResponseBody(this);
        } 

    } 

    public static class Content extends TeaModel {
        @NameInMap("Columns")
        private java.util.List < String > columns;

        @NameInMap("Name")
        private String name;

        @NameInMap("Points")
        private java.util.List < String > points;

        private Content(Builder builder) {
            this.columns = builder.columns;
            this.name = builder.name;
            this.points = builder.points;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
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

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
