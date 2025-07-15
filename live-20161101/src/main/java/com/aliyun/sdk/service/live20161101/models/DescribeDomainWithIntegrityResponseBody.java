// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DescribeDomainWithIntegrityResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainWithIntegrityResponseBody</p>
 */
public class DescribeDomainWithIntegrityResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private java.util.List<Content> content;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public java.util.List<Content> getContent() {
        return this.content;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Content> content; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDomainWithIntegrityResponseBody model) {
            this.content = model.content;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The verification information.</p>
         */
        public Builder content(java.util.List<Content> content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>16A96B9A-F203-4EC5-8E43-CB92E68F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDomainWithIntegrityResponseBody build() {
            return new DescribeDomainWithIntegrityResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDomainWithIntegrityResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainWithIntegrityResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Columns")
        private java.util.List<String> columns;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Points")
        private java.util.List<String> points;

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
        public java.util.List<String> getColumns() {
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
        public java.util.List<String> getPoints() {
            return this.points;
        }

        public static final class Builder {
            private java.util.List<String> columns; 
            private String name; 
            private java.util.List<String> points; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.columns = model.columns;
                this.name = model.name;
                this.points = model.points;
            } 

            /**
             * <p>The column names.</p>
             */
            public Builder columns(java.util.List<String> columns) {
                this.columns = columns;
                return this;
            }

            /**
             * <p>The table name.</p>
             * 
             * <strong>example:</strong>
             * <p>1637825700000</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The subpoints.</p>
             */
            public Builder points(java.util.List<String> points) {
                this.points = points;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
