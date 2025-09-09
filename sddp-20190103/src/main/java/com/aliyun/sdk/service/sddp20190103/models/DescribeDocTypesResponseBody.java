// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

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
 * {@link DescribeDocTypesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDocTypesResponseBody</p>
 */
public class DescribeDocTypesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DocTypeList")
    private java.util.List<DocTypeList> docTypeList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDocTypesResponseBody(Builder builder) {
        this.docTypeList = builder.docTypeList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDocTypesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return docTypeList
     */
    public java.util.List<DocTypeList> getDocTypeList() {
        return this.docTypeList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<DocTypeList> docTypeList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDocTypesResponseBody model) {
            this.docTypeList = model.docTypeList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>A list of OSS object types.</p>
         */
        public Builder docTypeList(java.util.List<DocTypeList> docTypeList) {
            this.docTypeList = docTypeList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>769FB3C1-F4C9-4******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDocTypesResponseBody build() {
            return new DescribeDocTypesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDocTypesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDocTypesResponseBody</p>
     */
    public static class DocTypeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private Long code;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private DocTypeList(Builder builder) {
            this.code = builder.code;
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DocTypeList create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public Long getCode() {
            return this.code;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Long code; 
            private Long id; 
            private String name; 

            private Builder() {
            } 

            private Builder(DocTypeList model) {
                this.code = model.code;
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * <p>The code of the object type.</p>
             * 
             * <strong>example:</strong>
             * <p>100001</p>
             */
            public Builder code(Long code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The ID of the object type.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the object type.</p>
             * 
             * <strong>example:</strong>
             * <p>C/C++ Source Code</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public DocTypeList build() {
                return new DocTypeList(this);
            } 

        } 

    }
}
