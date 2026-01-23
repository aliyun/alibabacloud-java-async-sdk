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
 * {@link DeleteSecurityClassifyCatalogResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteSecurityClassifyCatalogResponseBody</p>
 */
public class DeleteSecurityClassifyCatalogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DeleteSecurityClassifyCatalogResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSecurityClassifyCatalogResponseBody create() {
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
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DeleteSecurityClassifyCatalogResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DeleteSecurityClassifyCatalogResponseBody build() {
            return new DeleteSecurityClassifyCatalogResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DeleteSecurityClassifyCatalogResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteSecurityClassifyCatalogResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChildCatalogFullPathList")
        private java.util.List<String> childCatalogFullPathList;

        @com.aliyun.core.annotation.NameInMap("ClassifyIdList")
        private java.util.List<Long> classifyIdList;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private Data(Builder builder) {
            this.childCatalogFullPathList = builder.childCatalogFullPathList;
            this.classifyIdList = builder.classifyIdList;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return childCatalogFullPathList
         */
        public java.util.List<String> getChildCatalogFullPathList() {
            return this.childCatalogFullPathList;
        }

        /**
         * @return classifyIdList
         */
        public java.util.List<Long> getClassifyIdList() {
            return this.classifyIdList;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private java.util.List<String> childCatalogFullPathList; 
            private java.util.List<Long> classifyIdList; 
            private Boolean success; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.childCatalogFullPathList = model.childCatalogFullPathList;
                this.classifyIdList = model.classifyIdList;
                this.success = model.success;
            } 

            /**
             * ChildCatalogFullPathList.
             */
            public Builder childCatalogFullPathList(java.util.List<String> childCatalogFullPathList) {
                this.childCatalogFullPathList = childCatalogFullPathList;
                return this;
            }

            /**
             * ClassifyIdList.
             */
            public Builder classifyIdList(java.util.List<Long> classifyIdList) {
                this.classifyIdList = classifyIdList;
                return this;
            }

            /**
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
