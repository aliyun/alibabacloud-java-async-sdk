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
 * {@link GetRowPermissionByTableGuidsResponseBody} extends {@link TeaModel}
 *
 * <p>GetRowPermissionByTableGuidsResponseBody</p>
 */
public class GetRowPermissionByTableGuidsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetRowPermissionByTableGuidsResponseBody(Builder builder) {
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

    public static GetRowPermissionByTableGuidsResponseBody create() {
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
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetRowPermissionByTableGuidsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code. A value of OK indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code returned by the backend.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The error message returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
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

        public GetRowPermissionByTableGuidsResponseBody build() {
            return new GetRowPermissionByTableGuidsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRowPermissionByTableGuidsResponseBody} extends {@link TeaModel}
     *
     * <p>GetRowPermissionByTableGuidsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RowPermissionDesc")
        private String rowPermissionDesc;

        @com.aliyun.core.annotation.NameInMap("RowPermissionId")
        private String rowPermissionId;

        @com.aliyun.core.annotation.NameInMap("RowPermissionName")
        private String rowPermissionName;

        private Data(Builder builder) {
            this.rowPermissionDesc = builder.rowPermissionDesc;
            this.rowPermissionId = builder.rowPermissionId;
            this.rowPermissionName = builder.rowPermissionName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return rowPermissionDesc
         */
        public String getRowPermissionDesc() {
            return this.rowPermissionDesc;
        }

        /**
         * @return rowPermissionId
         */
        public String getRowPermissionId() {
            return this.rowPermissionId;
        }

        /**
         * @return rowPermissionName
         */
        public String getRowPermissionName() {
            return this.rowPermissionName;
        }

        public static final class Builder {
            private String rowPermissionDesc; 
            private String rowPermissionId; 
            private String rowPermissionName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.rowPermissionDesc = model.rowPermissionDesc;
                this.rowPermissionId = model.rowPermissionId;
                this.rowPermissionName = model.rowPermissionName;
            } 

            /**
             * <p>The row permission description.</p>
             * 
             * <strong>example:</strong>
             * <p>Restrict query region</p>
             */
            public Builder rowPermissionDesc(String rowPermissionDesc) {
                this.rowPermissionDesc = rowPermissionDesc;
                return this;
            }

            /**
             * <p>The row permission ID.</p>
             * 
             * <strong>example:</strong>
             * <p>300000001</p>
             */
            public Builder rowPermissionId(String rowPermissionId) {
                this.rowPermissionId = rowPermissionId;
                return this;
            }

            /**
             * <p>The row permission name.</p>
             * 
             * <strong>example:</strong>
             * <p>Region</p>
             */
            public Builder rowPermissionName(String rowPermissionName) {
                this.rowPermissionName = rowPermissionName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
