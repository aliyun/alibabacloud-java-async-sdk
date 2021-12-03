// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CreateLayerVersionRequest} extends {@link RequestModel}
 *
 * <p>CreateLayerVersionRequest</p>
 */
public class CreateLayerVersionRequest extends Request {
    @Path
    @NameInMap("layerName")
    private String layerName;

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

    /**
     * @return layerName
     */
    public String getLayerName() {
        return this.layerName;
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

    public static final class Builder extends Request.Builder {
        private String layerName; 
        private Code code; 
        private java.util.List < String > compatibleRuntime; 
        private String description; 

        /**
         * <p>A short description of struct</p>
         */
        public Builder layerName(String layerName) {
            this.putPathParameter("layerName", layerName);
            this.layerName = layerName;
            return this;
        }

        /**
         * <p>Code.</p>
         */
        public Builder code(Code code) {
            this.putBodyParameter("Code", code);
            this.code = code;
            return this;
        }

        /**
         * <p>compatibleRuntime.</p>
         */
        public Builder compatibleRuntime(java.util.List < String > compatibleRuntime) {
            this.putBodyParameter("compatibleRuntime", compatibleRuntime);
            this.compatibleRuntime = compatibleRuntime;
            return this;
        }

        /**
         * <p>description.</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        public CreateLayerVersionRequest build() {
            return new CreateLayerVersionRequest(this);
        } 

    } 

}
