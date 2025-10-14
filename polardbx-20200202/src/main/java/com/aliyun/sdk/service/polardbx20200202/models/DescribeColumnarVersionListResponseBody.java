// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link DescribeColumnarVersionListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeColumnarVersionListResponseBody</p>
 */
public class DescribeColumnarVersionListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeColumnarVersionListResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeColumnarVersionListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeColumnarVersionListResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>9B2F3840-****-475C-B269-2D5C3A31797C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeColumnarVersionListResponseBody build() {
            return new DescribeColumnarVersionListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeColumnarVersionListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeColumnarVersionListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VersionList")
        private java.util.List<String> versionList;

        private Data(Builder builder) {
            this.versionList = builder.versionList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return versionList
         */
        public java.util.List<String> getVersionList() {
            return this.versionList;
        }

        public static final class Builder {
            private java.util.List<String> versionList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.versionList = model.versionList;
            } 

            /**
             * VersionList.
             */
            public Builder versionList(java.util.List<String> versionList) {
                this.versionList = versionList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
