// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateInspectionSettingStatusResponse} extends {@link TeaModel}
 *
 * <p>UpdateInspectionSettingStatusResponse</p>
 */
public class UpdateInspectionSettingStatusResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private UpdateInspectionSettingStatusResponseBody body;

    private UpdateInspectionSettingStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UpdateInspectionSettingStatusResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
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
    public UpdateInspectionSettingStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateInspectionSettingStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(UpdateInspectionSettingStatusResponseBody body);

        @Override
        UpdateInspectionSettingStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateInspectionSettingStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private UpdateInspectionSettingStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateInspectionSettingStatusResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
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
        public Builder body(UpdateInspectionSettingStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateInspectionSettingStatusResponse build() {
            return new UpdateInspectionSettingStatusResponse(this);
        } 

    } 

}
