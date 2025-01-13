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

        /**
         * DocTypeList.
         */
        public Builder docTypeList(java.util.List<DocTypeList> docTypeList) {
            this.docTypeList = docTypeList;
            return this;
        }

        /**
         * RequestId.
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

            /**
             * Code.
             */
            public Builder code(Long code) {
                this.code = code;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
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
