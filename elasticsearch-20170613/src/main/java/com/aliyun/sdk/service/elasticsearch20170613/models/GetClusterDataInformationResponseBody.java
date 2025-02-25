// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetClusterDataInformationResponseBody} extends {@link TeaModel}
 *
 * <p>GetClusterDataInformationResponseBody</p>
 */
public class GetClusterDataInformationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private GetClusterDataInformationResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClusterDataInformationResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The return results.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetClusterDataInformationResponseBody build() {
            return new GetClusterDataInformationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetClusterDataInformationResponseBody} extends {@link TeaModel}
     *
     * <p>GetClusterDataInformationResponseBody</p>
     */
    public static class MetaInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("fields")
        private java.util.List < String > fields;

        @com.aliyun.core.annotation.NameInMap("indices")
        private java.util.List < String > indices;

        @com.aliyun.core.annotation.NameInMap("mapping")
        private String mapping;

        @com.aliyun.core.annotation.NameInMap("settings")
        private String settings;

        @com.aliyun.core.annotation.NameInMap("typeName")
        private java.util.List < String > typeName;

        private MetaInfo(Builder builder) {
            this.fields = builder.fields;
            this.indices = builder.indices;
            this.mapping = builder.mapping;
            this.settings = builder.settings;
            this.typeName = builder.typeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MetaInfo create() {
            return builder().build();
        }

        /**
         * @return fields
         */
        public java.util.List < String > getFields() {
            return this.fields;
        }

        /**
         * @return indices
         */
        public java.util.List < String > getIndices() {
            return this.indices;
        }

        /**
         * @return mapping
         */
        public String getMapping() {
            return this.mapping;
        }

        /**
         * @return settings
         */
        public String getSettings() {
            return this.settings;
        }

        /**
         * @return typeName
         */
        public java.util.List < String > getTypeName() {
            return this.typeName;
        }

        public static final class Builder {
            private java.util.List < String > fields; 
            private java.util.List < String > indices; 
            private String mapping; 
            private String settings; 
            private java.util.List < String > typeName; 

            /**
             * <p>The fields in the Mapping for the index.</p>
             */
            public Builder fields(java.util.List < String > fields) {
                this.fields = fields;
                return this;
            }

            /**
             * <p>The index list of the cluster.</p>
             */
            public Builder indices(java.util.List < String > indices) {
                this.indices = indices;
                return this;
            }

            /**
             * <p>The Mapping configuration of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;_doc&quot;:{&quot;properties&quot;:{&quot;user&quot;:{&quot;properties&quot;:{&quot;last&quot;:{&quot;type&quot;:&quot;text&quot;,...}}}}}}</p>
             */
            public Builder mapping(String mapping) {
                this.mapping = mapping;
                return this;
            }

            /**
             * <p>The Settings of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>{\n  &quot;index&quot;: {\n    &quot;replication&quot;: {\n}.....}}</p>
             */
            public Builder settings(String settings) {
                this.settings = settings;
                return this;
            }

            /**
             * <p>Specifies the type of the index.</p>
             */
            public Builder typeName(java.util.List < String > typeName) {
                this.typeName = typeName;
                return this;
            }

            public MetaInfo build() {
                return new MetaInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetClusterDataInformationResponseBody} extends {@link TeaModel}
     *
     * <p>GetClusterDataInformationResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("connectable")
        private Boolean connectable;

        @com.aliyun.core.annotation.NameInMap("metaInfo")
        private MetaInfo metaInfo;

        private Result(Builder builder) {
            this.connectable = builder.connectable;
            this.metaInfo = builder.metaInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return connectable
         */
        public Boolean getConnectable() {
            return this.connectable;
        }

        /**
         * @return metaInfo
         */
        public MetaInfo getMetaInfo() {
            return this.metaInfo;
        }

        public static final class Builder {
            private Boolean connectable; 
            private MetaInfo metaInfo; 

            /**
             * <p>Whether it is connectable.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder connectable(Boolean connectable) {
                this.connectable = connectable;
                return this;
            }

            /**
             * <p>The metadata of the cluster.</p>
             */
            public Builder metaInfo(MetaInfo metaInfo) {
                this.metaInfo = metaInfo;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
