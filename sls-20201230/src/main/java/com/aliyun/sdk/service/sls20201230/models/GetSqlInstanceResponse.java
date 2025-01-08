// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link GetSqlInstanceResponse} extends {@link TeaModel}
 *
 * <p>GetSqlInstanceResponse</p>
 */
public class GetSqlInstanceResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private java.util.List<GetSqlInstanceResponseBody> body;

    private GetSqlInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetSqlInstanceResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    /**
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public java.util.List<GetSqlInstanceResponseBody> getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSqlInstanceResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(java.util.List<GetSqlInstanceResponseBody> body);

        @Override
        GetSqlInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSqlInstanceResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private java.util.List<GetSqlInstanceResponseBody> body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSqlInstanceResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map<String, String> headers) {
            this.headers = headers;
            return this;
        }

        /**
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(java.util.List<GetSqlInstanceResponseBody> body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSqlInstanceResponse build() {
            return new GetSqlInstanceResponse(this);
        } 

    } 

    /**
     * 
     * {@link GetSqlInstanceResponse} extends {@link TeaModel}
     *
     * <p>GetSqlInstanceResponse</p>
     */
    public static class GetSqlInstanceResponseBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("cu")
        private Integer cu;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private Integer createTime;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private Integer updateTime;

        @com.aliyun.core.annotation.NameInMap("useAsDefault")
        private Boolean useAsDefault;

        private GetSqlInstanceResponseBody(Builder builder) {
            this.name = builder.name;
            this.cu = builder.cu;
            this.createTime = builder.createTime;
            this.updateTime = builder.updateTime;
            this.useAsDefault = builder.useAsDefault;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GetSqlInstanceResponseBody create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return cu
         */
        public Integer getCu() {
            return this.cu;
        }

        /**
         * @return createTime
         */
        public Integer getCreateTime() {
            return this.createTime;
        }

        /**
         * @return updateTime
         */
        public Integer getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return useAsDefault
         */
        public Boolean getUseAsDefault() {
            return this.useAsDefault;
        }

        public static final class Builder {
            private String name; 
            private Integer cu; 
            private Integer createTime; 
            private Integer updateTime; 
            private Boolean useAsDefault; 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * cu.
             */
            public Builder cu(Integer cu) {
                this.cu = cu;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(Integer createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * updateTime.
             */
            public Builder updateTime(Integer updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * useAsDefault.
             */
            public Builder useAsDefault(Boolean useAsDefault) {
                this.useAsDefault = useAsDefault;
                return this;
            }

            public GetSqlInstanceResponseBody build() {
                return new GetSqlInstanceResponseBody(this);
            } 

        } 

    }
}
