// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetClusterDataInformationResponseBody} extends {@link TeaModel}
 *
 * <p>GetClusterDataInformationResponseBody</p>
 */
public class GetClusterDataInformationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetClusterDataInformationResponseBody build() {
            return new GetClusterDataInformationResponseBody(this);
        } 

    } 

    public static class MetaInfo extends TeaModel {
        @NameInMap("fields")
        private java.util.List < String > fields;

        @NameInMap("indices")
        private java.util.List < String > indices;

        @NameInMap("mapping")
        private String mapping;

        @NameInMap("settings")
        private String settings;

        @NameInMap("typeName")
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
             * fields.
             */
            public Builder fields(java.util.List < String > fields) {
                this.fields = fields;
                return this;
            }

            /**
             * indices.
             */
            public Builder indices(java.util.List < String > indices) {
                this.indices = indices;
                return this;
            }

            /**
             * mapping.
             */
            public Builder mapping(String mapping) {
                this.mapping = mapping;
                return this;
            }

            /**
             * settings.
             */
            public Builder settings(String settings) {
                this.settings = settings;
                return this;
            }

            /**
             * typeName.
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
    public static class Result extends TeaModel {
        @NameInMap("connectable")
        private Boolean connectable;

        @NameInMap("metaInfo")
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
             * connectable.
             */
            public Builder connectable(Boolean connectable) {
                this.connectable = connectable;
                return this;
            }

            /**
             * metaInfo.
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
