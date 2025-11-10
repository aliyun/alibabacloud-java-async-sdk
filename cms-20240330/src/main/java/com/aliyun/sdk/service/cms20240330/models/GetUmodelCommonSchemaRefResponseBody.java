// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link GetUmodelCommonSchemaRefResponseBody} extends {@link TeaModel}
 *
 * <p>GetUmodelCommonSchemaRefResponseBody</p>
 */
public class GetUmodelCommonSchemaRefResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("commonSchemaRef")
    private java.util.List<CommonSchemaRef> commonSchemaRef;

    private GetUmodelCommonSchemaRefResponseBody(Builder builder) {
        this.commonSchemaRef = builder.commonSchemaRef;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUmodelCommonSchemaRefResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return commonSchemaRef
     */
    public java.util.List<CommonSchemaRef> getCommonSchemaRef() {
        return this.commonSchemaRef;
    }

    public static final class Builder {
        private java.util.List<CommonSchemaRef> commonSchemaRef; 

        private Builder() {
        } 

        private Builder(GetUmodelCommonSchemaRefResponseBody model) {
            this.commonSchemaRef = model.commonSchemaRef;
        } 

        /**
         * commonSchemaRef.
         */
        public Builder commonSchemaRef(java.util.List<CommonSchemaRef> commonSchemaRef) {
            this.commonSchemaRef = commonSchemaRef;
            return this;
        }

        public GetUmodelCommonSchemaRefResponseBody build() {
            return new GetUmodelCommonSchemaRefResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetUmodelCommonSchemaRefResponseBody} extends {@link TeaModel}
     *
     * <p>GetUmodelCommonSchemaRefResponseBody</p>
     */
    public static class CommonSchemaRef extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("group")
        private String group;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private CommonSchemaRef(Builder builder) {
            this.group = builder.group;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CommonSchemaRef create() {
            return builder().build();
        }

        /**
         * @return group
         */
        public String getGroup() {
            return this.group;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String group; 
            private String version; 

            private Builder() {
            } 

            private Builder(CommonSchemaRef model) {
                this.group = model.group;
                this.version = model.version;
            } 

            /**
             * group.
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            /**
             * version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public CommonSchemaRef build() {
                return new CommonSchemaRef(this);
            } 

        } 

    }
}
