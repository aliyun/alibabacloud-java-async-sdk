// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link GetStoreViewIndexResponseBody} extends {@link TeaModel}
 *
 * <p>GetStoreViewIndexResponseBody</p>
 */
public class GetStoreViewIndexResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("indexes")
    private java.util.List<Indexes> indexes;

    private GetStoreViewIndexResponseBody(Builder builder) {
        this.indexes = builder.indexes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStoreViewIndexResponseBody create() {
        return builder().build();
    }

    /**
     * @return indexes
     */
    public java.util.List<Indexes> getIndexes() {
        return this.indexes;
    }

    public static final class Builder {
        private java.util.List<Indexes> indexes; 

        /**
         * <p>The index configurations.</p>
         */
        public Builder indexes(java.util.List<Indexes> indexes) {
            this.indexes = indexes;
            return this;
        }

        public GetStoreViewIndexResponseBody build() {
            return new GetStoreViewIndexResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetStoreViewIndexResponseBody} extends {@link TeaModel}
     *
     * <p>GetStoreViewIndexResponseBody</p>
     */
    public static class Indexes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("index")
        private Index index;

        @com.aliyun.core.annotation.NameInMap("logstore")
        private String logstore;

        @com.aliyun.core.annotation.NameInMap("project")
        private String project;

        private Indexes(Builder builder) {
            this.index = builder.index;
            this.logstore = builder.logstore;
            this.project = builder.project;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Indexes create() {
            return builder().build();
        }

        /**
         * @return index
         */
        public Index getIndex() {
            return this.index;
        }

        /**
         * @return logstore
         */
        public String getLogstore() {
            return this.logstore;
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        public static final class Builder {
            private Index index; 
            private String logstore; 
            private String project; 

            /**
             * <p>The index configurations of the Logstore.</p>
             */
            public Builder index(Index index) {
                this.index = index;
                return this;
            }

            /**
             * <p>The name of the Logstore.</p>
             * 
             * <strong>example:</strong>
             * <p>my-logstore</p>
             */
            public Builder logstore(String logstore) {
                this.logstore = logstore;
                return this;
            }

            /**
             * <p>The name of the project to which the Logstore belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>example-project</p>
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            public Indexes build() {
                return new Indexes(this);
            } 

        } 

    }
}
