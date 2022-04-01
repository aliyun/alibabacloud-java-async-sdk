// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLayerVersionRequest} extends {@link RequestModel}
 *
 * <p>CreateLayerVersionRequest</p>
 */
public class CreateLayerVersionRequest extends Request {
    @Path
    @NameInMap("layerName")
    private String layerName;

    @Header
    @NameInMap("X-Fc-Account-Id")
    private String xFcAccountId;

    @Header
    @NameInMap("X-Fc-Date")
    private String xFcDate;

    @Header
    @NameInMap("X-Fc-Trace-Id")
    private String xFcTraceId;

    @Body
    @NameInMap("Code")
    private Code code;

    @Body
    @NameInMap("compatibleRuntime")
    private java.util.List < String > compatibleRuntime;

    @Body
    @NameInMap("description")
    private String description;

    private CreateLayerVersionRequest(Builder builder) {
        super(builder);
        this.layerName = builder.layerName;
        this.xFcAccountId = builder.xFcAccountId;
        this.xFcDate = builder.xFcDate;
        this.xFcTraceId = builder.xFcTraceId;
        this.code = builder.code;
        this.compatibleRuntime = builder.compatibleRuntime;
        this.description = builder.description;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLayerVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return layerName
     */
    public String getLayerName() {
        return this.layerName;
    }

    /**
     * @return xFcAccountId
     */
    public String getXFcAccountId() {
        return this.xFcAccountId;
    }

    /**
     * @return xFcDate
     */
    public String getXFcDate() {
        return this.xFcDate;
    }

    /**
     * @return xFcTraceId
     */
    public String getXFcTraceId() {
        return this.xFcTraceId;
    }

    /**
     * @return code
     */
    public Code getCode() {
        return this.code;
    }

    /**
     * @return compatibleRuntime
     */
    public java.util.List < String > getCompatibleRuntime() {
        return this.compatibleRuntime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    public static final class Builder extends Request.Builder<CreateLayerVersionRequest, Builder> {
        private String layerName; 
        private String xFcAccountId; 
        private String xFcDate; 
        private String xFcTraceId; 
        private Code code; 
        private java.util.List < String > compatibleRuntime; 
        private String description; 

        private Builder() {
            super();
        } 

        private Builder(CreateLayerVersionRequest request) {
            super(request);
            this.layerName = request.layerName;
            this.xFcAccountId = request.xFcAccountId;
            this.xFcDate = request.xFcDate;
            this.xFcTraceId = request.xFcTraceId;
            this.code = request.code;
            this.compatibleRuntime = request.compatibleRuntime;
            this.description = request.description;
        } 

        /**
         * A short description of struct
         */
        public Builder layerName(String layerName) {
            this.putPathParameter("layerName", layerName);
            this.layerName = layerName;
            return this;
        }

        /**
         * X-Fc-Account-Id.
         */
        public Builder xFcAccountId(String xFcAccountId) {
            this.putHeaderParameter("X-Fc-Account-Id", xFcAccountId);
            this.xFcAccountId = xFcAccountId;
            return this;
        }

        /**
         * X-Fc-Date.
         */
        public Builder xFcDate(String xFcDate) {
            this.putHeaderParameter("X-Fc-Date", xFcDate);
            this.xFcDate = xFcDate;
            return this;
        }

        /**
         * X-Fc-Trace-Id.
         */
        public Builder xFcTraceId(String xFcTraceId) {
            this.putHeaderParameter("X-Fc-Trace-Id", xFcTraceId);
            this.xFcTraceId = xFcTraceId;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(Code code) {
            this.putBodyParameter("Code", code);
            this.code = code;
            return this;
        }

        /**
         * compatibleRuntime.
         */
        public Builder compatibleRuntime(java.util.List < String > compatibleRuntime) {
            this.putBodyParameter("compatibleRuntime", compatibleRuntime);
            this.compatibleRuntime = compatibleRuntime;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        @Override
        public CreateLayerVersionRequest build() {
            return new CreateLayerVersionRequest(this);
        } 

    } 

}
