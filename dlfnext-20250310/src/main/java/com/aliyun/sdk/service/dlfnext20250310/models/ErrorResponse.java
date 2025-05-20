// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

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
 * {@link ErrorResponse} extends {@link TeaModel}
 *
 * <p>ErrorResponse</p>
 */
public class ErrorResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("resourceName")
    private String resourceName;

    @com.aliyun.core.annotation.NameInMap("resourceType")
    private String resourceType;

    private ErrorResponse(BuilderImpl builder) {
        super(builder);
        this.code = builder.code;
        this.message = builder.message;
        this.resourceName = builder.resourceName;
        this.resourceType = builder.resourceType;
    }

    public static ErrorResponse create() {
        return new BuilderImpl().build();
    }

@Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return resourceName
     */
    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public interface Builder extends Response.Builder<ErrorResponse, Builder> {

        Builder code(Integer code);

        Builder message(String message);

        Builder resourceName(String resourceName);

        Builder resourceType(String resourceType);

        @Override
        ErrorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ErrorResponse, Builder>
            implements Builder {
        private Integer code; 
        private String message; 
        private String resourceName; 
        private String resourceType; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ErrorResponse response) {
            super(response);
            this.code = response.code;
            this.message = response.message;
            this.resourceName = response.resourceName;
            this.resourceType = response.resourceType;
        } 

        /**
         * code.
         */
        @Override
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * message.
         */
        @Override
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * resourceName.
         */
        @Override
        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }

        /**
         * resourceType.
         */
        @Override
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public ErrorResponse build() {
            return new ErrorResponse(this);
        } 

    } 

}
