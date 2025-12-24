// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

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
 * {@link DescribeOpenApiListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOpenApiListResponseBody</p>
 */
public class DescribeOpenApiListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeOpenApiListResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOpenApiListResponseBody create() {
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

        private Builder(DescribeOpenApiListResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EF2ECA2D-D8E6-5021-BF5C-19DD6D52C5B2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeOpenApiListResponseBody build() {
            return new DescribeOpenApiListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeOpenApiListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOpenApiListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Directories")
        private Object directories;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private Data(Builder builder) {
            this.code = builder.code;
            this.directories = builder.directories;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return directories
         */
        public Object getDirectories() {
            return this.directories;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String code; 
            private Object directories; 
            private String version; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.code = model.code;
                this.directories = model.directories;
                this.version = model.version;
            } 

            /**
             * <p>The response code. Valid values:</p>
             * <ul>
             * <li>200: successful.</li>
             * <li>500: failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The information about the returned APIs.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;apis&quot;:[{&quot;summary&quot;:&quot;get account information&quot;,&quot;deprecated&quot;:false,&quot;name&quot;:&quot;DescAccountSummary&quot;,&quot;title&quot;:&quot;get account information&quot;}],&quot;childrens&quot;:[],&quot;title&quot;:&quot;account&quot;}]</p>
             */
            public Builder directories(Object directories) {
                this.directories = directories;
                return this;
            }

            /**
             * <p>The version number of the API.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-12-03</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
