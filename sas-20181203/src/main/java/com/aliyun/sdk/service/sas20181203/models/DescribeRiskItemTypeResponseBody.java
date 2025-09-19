// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeRiskItemTypeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRiskItemTypeResponseBody</p>
 */
public class DescribeRiskItemTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("List")
    private java.util.List<List> list;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeRiskItemTypeResponseBody(Builder builder) {
        this.list = builder.list;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRiskItemTypeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return list
     */
    public java.util.List<List> getList() {
        return this.list;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<List> list; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeRiskItemTypeResponseBody model) {
            this.list = model.list;
            this.requestId = model.requestId;
        } 

        /**
         * <p>An array that consists of information about the type of the check item.</p>
         */
        public Builder list(java.util.List<List> list) {
            this.list = list;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>3B3F3A90-46A5-4023-A2D8-D68B14262F96</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRiskItemTypeResponseBody build() {
            return new DescribeRiskItemTypeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRiskItemTypeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRiskItemTypeResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private List(Builder builder) {
            this.id = builder.id;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private Long id; 
            private String title; 

            private Builder() {
            } 

            private Builder(List model) {
                this.id = model.id;
                this.title = model.title;
            } 

            /**
             * <p>The ID of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>37625</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the check type.</p>
             * 
             * <strong>example:</strong>
             * <p>Identity authentication and permissions</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
}
