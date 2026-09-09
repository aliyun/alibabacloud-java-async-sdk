// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starops20260428.models;

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
 * {@link GetDigitalEmployeeUmodelResponseBody} extends {@link TeaModel}
 *
 * <p>GetDigitalEmployeeUmodelResponseBody</p>
 */
public class GetDigitalEmployeeUmodelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("commonSchemaRef")
    private java.util.List<CommonSchemaRef> commonSchemaRef;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetDigitalEmployeeUmodelResponseBody(Builder builder) {
        this.commonSchemaRef = builder.commonSchemaRef;
        this.description = builder.description;
        this.name = builder.name;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDigitalEmployeeUmodelResponseBody create() {
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

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<CommonSchemaRef> commonSchemaRef; 
        private String description; 
        private String name; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetDigitalEmployeeUmodelResponseBody model) {
            this.commonSchemaRef = model.commonSchemaRef;
            this.description = model.description;
            this.name = model.name;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The common schemas referenced by the digital employee UModel.</p>
         */
        public Builder commonSchemaRef(java.util.List<CommonSchemaRef> commonSchemaRef) {
            this.commonSchemaRef = commonSchemaRef;
            return this;
        }

        /**
         * <p>The description of the digital employee UModel.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample description</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the digital employee to which the UModel belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>sample-agent</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The unique identifier of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0A1B2C3D-4E5F-6789-ABCD-1234567890AB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDigitalEmployeeUmodelResponseBody build() {
            return new GetDigitalEmployeeUmodelResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDigitalEmployeeUmodelResponseBody} extends {@link TeaModel}
     *
     * <p>GetDigitalEmployeeUmodelResponseBody</p>
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
             * <p>The schema group.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            /**
             * <p>The schema version.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
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
