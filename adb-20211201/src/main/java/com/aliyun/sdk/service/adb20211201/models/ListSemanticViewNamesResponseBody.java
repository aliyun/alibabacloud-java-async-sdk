// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link ListSemanticViewNamesResponseBody} extends {@link TeaModel}
 *
 * <p>ListSemanticViewNamesResponseBody</p>
 */
public class ListSemanticViewNamesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListSemanticViewNamesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSemanticViewNamesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListSemanticViewNamesResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListSemanticViewNamesResponseBody build() {
            return new ListSemanticViewNamesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSemanticViewNamesResponseBody} extends {@link TeaModel}
     *
     * <p>ListSemanticViewNamesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("ViewName")
        private String viewName;

        @com.aliyun.core.annotation.NameInMap("ViewSchema")
        private String viewSchema;

        private Data(Builder builder) {
            this.comment = builder.comment;
            this.viewName = builder.viewName;
            this.viewSchema = builder.viewSchema;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return viewName
         */
        public String getViewName() {
            return this.viewName;
        }

        /**
         * @return viewSchema
         */
        public String getViewSchema() {
            return this.viewSchema;
        }

        public static final class Builder {
            private String comment; 
            private String viewName; 
            private String viewSchema; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.comment = model.comment;
                this.viewName = model.viewName;
                this.viewSchema = model.viewSchema;
            } 

            /**
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * ViewName.
             */
            public Builder viewName(String viewName) {
                this.viewName = viewName;
                return this;
            }

            /**
             * ViewSchema.
             */
            public Builder viewSchema(String viewSchema) {
                this.viewSchema = viewSchema;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
