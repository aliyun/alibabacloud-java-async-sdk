// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link GetDataSourceDependenciesResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataSourceDependenciesResponseBody</p>
 */
public class GetDataSourceDependenciesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DependencyList")
    private java.util.List<DependencyList> dependencyList;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetDataSourceDependenciesResponseBody(Builder builder) {
        this.code = builder.code;
        this.dependencyList = builder.dependencyList;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataSourceDependenciesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return dependencyList
     */
    public java.util.List<DependencyList> getDependencyList() {
        return this.dependencyList;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<DependencyList> dependencyList; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetDataSourceDependenciesResponseBody model) {
            this.code = model.code;
            this.dependencyList = model.dependencyList;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The backend response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The dependency records.</p>
         */
        public Builder dependencyList(java.util.List<DependencyList> dependencyList) {
            this.dependencyList = dependencyList;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The details of the backend exception.</p>
         * 
         * <strong>example:</strong>
         * <p>internal error</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetDataSourceDependenciesResponseBody build() {
            return new GetDataSourceDependenciesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDataSourceDependenciesResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataSourceDependenciesResponseBody</p>
     */
    public static class DependencyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("TypeCode")
        private String typeCode;

        private DependencyList(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
            this.type = builder.type;
            this.typeCode = builder.typeCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DependencyList create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return typeCode
         */
        public String getTypeCode() {
            return this.typeCode;
        }

        public static final class Builder {
            private String id; 
            private String name; 
            private String type; 
            private String typeCode; 

            private Builder() {
            } 

            private Builder(DependencyList model) {
                this.id = model.id;
                this.name = model.name;
                this.type = model.type;
                this.typeCode = model.typeCode;
            } 

            /**
             * <p>The ID of the dependency record.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the dependency record.</p>
             * 
             * <strong>example:</strong>
             * <p>jytest</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The type of the dependency record.</p>
             * 
             * <strong>example:</strong>
             * <p>pipeline</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The type code of the dependency record.</p>
             * 
             * <strong>example:</strong>
             * <p>pipeline</p>
             */
            public Builder typeCode(String typeCode) {
                this.typeCode = typeCode;
                return this;
            }

            public DependencyList build() {
                return new DependencyList(this);
            } 

        } 

    }
}
